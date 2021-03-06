# Mars Rover
## DSL ideeen
### ROVER SPEC LEVEL
```
detect obstacles at (-65mm, 80mm) with light sensor on master port S1
detect obstacles at (65mm, 80mm) with light sensor on master port S2
detect obstacles at (-83mm, 155mm) with touch sensor on master port S3
detect obstacles at (83mm, 155mm) with touch sensor on master port S4
detect obstacles at (0mm, 80mm) with color sensor on slave port S1
detect obstacles from (57mm, 108mm) with ultrasonic sensor on slave port S2
detect lakes at (0mm, 80mm) with color sensor on slave port S1 
probe temperature at (0mm, 100mm) with temperature sensor on slave port S3 and motor on slave port A
drive left with motor on master port A
drive right with motor on master port B
control left light with motor on master port C
control right light with motor on slave port C
```

Mogelijke grammar:
```
ACTION ((at|from) POSITION)? with DEVICE
	
ACTION: STRING
DEVICE: DEVICETYPE on INTERFACE
DEVICETYPE: light sensor | touch sensor | color sensor | 
	ultrasonic sensor | temperature sensor | motor
POSITION: (REAL, REAL)
INTERFACE: DEVICE port PORT
DEVICE: master | slave
DEVICEPORT: A | B | C | S1 | S2 | S3 | S4
```
* Genereer operations level editor
* Genereer diagram van de robot:
	* sensorlocaties?
	* aansluitdiagram voor poorten?
	* gezichtsveld van sensoren (touch en kleur lokaal, cone voor ultrasonic)?
* Genereer *safe turning model*?

### OPERATIONS LEVEL
```
all lakes are found := { return context.discoveredLakes.length == context.targetLakes.length }
away from obstacle := {
	Obstacle a, b, prev;
	double maxAngle = 0;
	for (Obstacle cur : context.obstacles) {
		if (prev != null) {
			double angle = context.position.angleTo(prev) - context.position.angleTo(cur);
			angle = angle % Math.PI*2 + Math.PI*2) % Math.PI*2)
			if (angle > maxAngle) {
				maxAngle = angle;
				a = prev; b = current;
			}
		}
		prev = currrent;
	}
	return context.position.angleTo(a) + maxAngle / 2f;
}
show lakes := 
at lake := 
lake has not been probed :=
collision in less than <distance> := 
blink lights := turn lights on, wait 500 ms, turn lights off, wait 500 ms
```

### MISSION LEVEL
```
if all lakes are found, show lakes
if not all lakes are found, drive forward
if collision in less than 50 cm, steer away from obstacle
if collision in less than 5 cm, drive backwards 15 cm, steer away from obstacle
if at lake and lake has not been probed, blink lights, probe lake, steer away from obstacle
```

Mogelijke grammar:
```
if CONDITION, ACTION

CONDITION:
	CONDITION and CONDITION |
	CONDITION or CONDITION |
	not CONDITION |		
	all lakes are found |
	collision in less than DISTANCE |
	at lake
	lake has not been probed

ACTION:
	ACTION, ACTION |
	show lakes |
	drive DIRECTION |
	drive DIRECTION DISTANCE |
	steer ANGLE |
	probe lake |
	blink lights

DISTANCE: <INT> cm
DIRECTION: forward | backward
ANGLE: <INT> degrees | away from obstacles
```		

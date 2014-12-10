# Mars Rover
## ROVER SPEC LEVEL
```
detect obstacles with light sensor on master port S1
detect obstacles with light sensor on master port S2
detect obstacles with touch sensor on master port S3
detect obstacles with touch sensor on master port S4
detect obstacles with color sensor on slave port S1
detect obstacles with ultrasonic sensor on slave port S2
detect lakes with color sensor on slave port S1 
detect temperature with temperature sensor on slave port S3 and motor on slave port A
drive left with motor on master port A
drive right with motor on master port B
control left light with motor on master port C
control right light with motor on slave port C
```

Mogelijke grammar:
```
ACTION with EXTENSION
	
ACTION: STRING
EXTENSION: DEVICE on PORT
DEVICE: light sensor | touch sensor | color sensor | 
	ultrasonic sensor | temperature sensor | motor
PORT: DEVICE DEVICEPORT
DEVICEPORT: A | B | C | S1 | S2 | S3 | S4
```

## OPERATIONS LEVEL
```
all lakes are found :=
show lakes := 
at lake :=
lake has not been probed :=
collision in less than <distance> := 
away from obstacle := 
blink lights := turn lights on, wait 500 ms, turn lights off, wait 500 ms
```

## MISSION LEVEL
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

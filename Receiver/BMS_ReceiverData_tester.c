#include <assert.h>
#include <stdio.h>
#include "BMS_SensorData_Receiver.h"

int Sensor1[5] = {245,250,255,260,265};
int Sensor2[5] = {92,94,96,98,100};


int main(int argc, char* argv[])
{
  int i;
  for (i = 0; i < argc; i++){
    printf("arg%i = %s\n", i, argv[i]);
  }
  ReadBatteryParameter(0,5,Sensor1,Sensor2);
  Calculate_Avg(Sensor1,Sensor2);
}

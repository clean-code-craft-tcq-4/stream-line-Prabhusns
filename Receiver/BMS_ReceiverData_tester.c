#include <assert.h>
#include <stdio.h>
#include "BMS_SensorData_Receiver.h"

int sampleValue[5] = {1,2,3,4,5};
int sampleValue1[5] = {1,2,3,4,5};


int main(int argc, char* argv[])
{
  int i;
  for (i = 0; i < argc; i++){
    printf("arg%i = %s\n", i, argv[i]);
  }
  ReadBatteryParameter(0,5,sampleValue,sampleValue1);
  Calculate_Avg(sampleValue,sampleValue1);
}

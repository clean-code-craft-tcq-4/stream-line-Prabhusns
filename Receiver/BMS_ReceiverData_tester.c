#include <assert.h>
#include <stdio.h>
#include "BMS_SensorData_Receiver.h"

int sampleValue[5] = {1,2,3,4,5};
int sampleValue1[5] = {1,2,3,4,5};


int main(void) {

  ReadBatteryParameter(0,5,temperature,ChargeRate);
  Calculate_Avg(temperature,ChargeRate);
}

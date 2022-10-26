#include <assert.h>
#include "BMS_SensorData_Receiver.h"

//int sampleValue[5] = {1,2,3,4,5};
//int sampleValue1[5] = {1,2,3,4,5};

void ReadParameters(float* temperature, float* SOC, float* ChargeRate)
{
  char dummy;
  scanf("%f%c%f%c%f", temperature, &dummy, SOC, &dummy, ChargeRate);
}

int main(void) {
ReadParameters(temperature, SOC, ChargeRate);
printf("temperature = %f, SOC = %f, ChargeRate = %f\n", temperature, SOC, ChargeRate);	
//	ReadBatteryParameter(0,5,sampleValue,sampleValue1);
//    Calculate_Avg(sampleValue,sampleValue1);
}

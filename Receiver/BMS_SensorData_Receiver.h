void ReadBatteryParameter(int min,int max,int *ReadBatteryTemp,int *ReadBatterySoc);
void ReadFromConsoleInput(float* temperature, float* SOC, float* ChargeRate);
int Simple_Moving_Avg(int *arrNumbers, long *sum, int pos, int len, int nextNum);
void Calculate_Avg(int *ReadBatteryTemp,int *ReadBatterySoc);

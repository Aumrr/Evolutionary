///****************************************************************************/
///****************************************************************************/
///****     Copyright (C) 2012                                             ****/
///****     Ant�nio Manuel Rodrigues Manso                                 ****/
///****     e-mail: manso@ipt.pt                                           ****/
///****     url   : http://orion.ipt.pt/~manso    manso@ipt.pt             ****/
///****     Instituto Polit�cnico de Tomar                                 ****/
///****     Escola Superior de Tecnologia de Tomar                         ****/
///****                                                                    ****/
///****************************************************************************/
///****     This software was build with the purpose of learning.          ****/
///****     Its use is free and is not provided any guarantee              ****/
///****     or support.                                                    ****/
///****     If you met bugs, please, report them to the author             ****/
///****                                                                    ****/
///****************************************************************************/
///****************************************************************************/
package Lin_Kerningan;

/**
 *
 * @author ZULU
 */
public class DistancePoint {

    double[][] distance = {{0.0, 1852, 2595, 7322, 4304, 3059, 1867, 5022, 838, 5353, 7517, 6228, 4176},
        {1852, 0.0, 754, 5489, 3991, 4096, 1816, 5068, 2458, 4459, 6013, 7545, 5579},
        {2595, 754, 0.0, 4738, 4159, 4577, 2189, 5116, 3121, 4152, 5429, 8162, 6152},
        {7322, 5489, 4738, 0.0, 7005, 8736, 6454, 7982, 7808, 5653, 3921, 12269, 10492},
        {4304, 3991, 4159, 7005, 0.0, 7363, 5588, 8925, 5076, 8318, 9217, 5588, 8309},
        {3059, 4096, 4577, 8736, 7363, 0.0, 2404, 2783, 2287, 4588, 7449, 8287, 1783},
        {1867, 1816, 2189, 6454, 5588, 2404, 0.0, 3371, 1768, 3468, 5868, 8109, 4076},
        {5022, 5068, 5116, 7982, 8925, 2783, 3371, 0.0, 4524, 2588, 5555, 10906, 4114},
        {838, 2458, 3121, 7808, 5076, 2287, 1768, 4524, 0.0, 5211, 7609, 6465, 3363},
        {5353, 4459, 4152, 5653, 8318, 4558, 3468, 2588, 5211, 0.0, 3019, 11561, 6203},
        {7517, 6013, 5429, 3921, 9217, 7449, 5868, 5555, 7609, 3019, 0.0, 13523, 9156},
        {6228, 7545, 8162, 12269, 5588, 8287, 8109, 10906, 6465, 11561, 13523, 0.0, 8072},
        {4176, 5579, 6152, 10492, 8309, 1783, 4076, 4114, 3363, 6203, 9156, 8072, 0.0}};
    double num;
    double ber;

    double Pdistance(int n, int m)//??�???�n�?�?�?�???�n�?�Ԃ?���?   
    {
        double[][] distancepoint = new double[13][13];

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                distancepoint[i][j] = distance[i][j];
            }
        }
        num = distancepoint[n][m];
        return num;
    }
}

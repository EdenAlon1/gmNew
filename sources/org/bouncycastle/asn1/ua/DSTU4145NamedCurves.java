package org.bouncycastle.asn1.ua;

import defpackage.fhqt;
import defpackage.fhst;
import defpackage.fhta;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class DSTU4145NamedCurves {
    static final fhqt[] a;
    static final ASN1ObjectIdentifier[] b;
    static final String c;
    private static final BigInteger d;
    private static final BigInteger e;

    static {
        BigInteger valueOf = BigInteger.valueOf(0L);
        d = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(1L);
        e = valueOf2;
        a = new fhqt[10];
        b = new ASN1ObjectIdentifier[10];
        c = String.valueOf(UAObjectIdentifiers.b.e()).concat(".2.");
        BigInteger[] bigIntegerArr = {new BigInteger("400000000000000000002BEC12BE2262D39BCF14D", 16), new BigInteger("3FFFFFFFFFFFFFFFFFFFFFB12EBCC7D7F29FF7701F", 16), new BigInteger("800000000000000000000189B4E67606E3825BB2831", 16), new BigInteger("3FFFFFFFFFFFFFFFFFFFFFFB981960435FE5AB64236EF", 16), new BigInteger("40000000000000000000000069A779CAC1DABC6788F7474F", 16), new BigInteger("1000000000000000000000000000013E974E72F8A6922031D2603CFE0D7", 16), new BigInteger("800000000000000000000000000000006759213AF182E987D3E17714907D470D", 16), new BigInteger("3FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC079C2F3825DA70D390FBBA588D4604022B7B7", 16), new BigInteger("40000000000000000000000000000000000000000000009C300B75A3FA824F22428FD28CE8812245EF44049B2D49", 16), new BigInteger("3FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFBA3175458009A8C0A724F02F81AA8A1FCBAF80D90C7A95110504CF", 16)};
        BigInteger[] bigIntegerArr2 = {BigInteger.valueOf(2L), BigInteger.valueOf(2L), BigInteger.valueOf(4L), BigInteger.valueOf(2L), BigInteger.valueOf(2L), BigInteger.valueOf(2L), BigInteger.valueOf(4L), BigInteger.valueOf(2L), BigInteger.valueOf(2L), BigInteger.valueOf(2L)};
        fhst[] fhstVarArr = {new fhst(163, 3, 6, 7, valueOf2, new BigInteger("5FF6108462A2DC8210AB403925E638A19C1455D21", 16), bigIntegerArr[0], bigIntegerArr2[0]), new fhst(167, 6, valueOf2, new BigInteger("6EE3CEEB230811759F20518A0930F1A4315A827DAC", 16), bigIntegerArr[1], bigIntegerArr2[1]), new fhst(173, 1, 2, 10, valueOf, new BigInteger("108576C80499DB2FC16EDDF6853BBB278F6B6FB437D9", 16), bigIntegerArr[2], bigIntegerArr2[2]), new fhst(179, 1, 2, 4, valueOf2, new BigInteger("4A6E0856526436F2F88DD07A341E32D04184572BEB710", 16), bigIntegerArr[3], bigIntegerArr2[3]), new fhst(191, 9, valueOf2, new BigInteger("7BC86E2102902EC4D5890E8B6B4981ff27E0482750FEFC03", 16), bigIntegerArr[4], bigIntegerArr2[4]), new fhst(233, 1, 4, 9, valueOf2, new BigInteger("06973B15095675534C7CF7E64A21BD54EF5DD3B8A0326AA936ECE454D2C", 16), bigIntegerArr[5], bigIntegerArr2[5]), new fhst(257, 12, valueOf, new BigInteger("1CEF494720115657E18F938D7A7942394FF9425C1458C57861F9EEA6ADBE3BE10", 16), bigIntegerArr[6], bigIntegerArr2[6]), new fhst(307, 2, 4, 8, valueOf2, new BigInteger("393C7F7D53666B5054B5E6C6D3DE94F4296C0C599E2E2E241050DF18B6090BDC90186904968BB", 16), bigIntegerArr[7], bigIntegerArr2[7]), new fhst(367, 21, valueOf2, new BigInteger("43FC8AD242B0B7A6F3D1627AD5654447556B47BF6AA4A64B0C2AFE42CADAB8F93D92394C79A79755437B56995136", 16), bigIntegerArr[8], bigIntegerArr2[8]), new fhst(431, 1, 3, 5, valueOf2, new BigInteger("03CE10490F6A708FC26DFE8C3D27C4F94E690134D5BFF988D8D28AAEAEDE975936C66BAC536B18AE2DC312CA493117DAA469C640CAF3", 16), bigIntegerArr[9], bigIntegerArr2[9])};
        fhta[] fhtaVarArr = {fhstVarArr[0].b(new BigInteger("2E2F85F5DD74CE983A5C4237229DAF8A3F35823BE", 16), new BigInteger("3826F008A8C51D7B95284D9D03FF0E00CE2CD723A", 16)), fhstVarArr[1].b(new BigInteger("7A1F6653786A68192803910A3D30B2A2018B21CD54", 16), new BigInteger("5F49EB26781C0EC6B8909156D98ED435E45FD59918", 16)), fhstVarArr[2].b(new BigInteger("4D41A619BCC6EADF0448FA22FAD567A9181D37389CA", 16), new BigInteger("10B51CC12849B234C75E6DD2028BF7FF5C1CE0D991A1", 16)), fhstVarArr[3].b(new BigInteger("6BA06FE51464B2BD26DC57F48819BA9954667022C7D03", 16), new BigInteger("25FBC363582DCEC065080CA8287AAFF09788A66DC3A9E", 16)), fhstVarArr[4].b(new BigInteger("714114B762F2FF4A7912A6D2AC58B9B5C2FCFE76DAEB7129", 16), new BigInteger("29C41E568B77C617EFE5902F11DB96FA9613CD8D03DB08DA", 16)), fhstVarArr[5].b(new BigInteger("3FCDA526B6CDF83BA1118DF35B3C31761D3545F32728D003EEB25EFE96", 16), new BigInteger("9CA8B57A934C54DEEDA9E54A7BBAD95E3B2E91C54D32BE0B9DF96D8D35", 16)), fhstVarArr[6].b(new BigInteger("02A29EF207D0E9B6C55CD260B306C7E007AC491CA1B10C62334A9E8DCD8D20FB7", 16), new BigInteger("10686D41FF744D4449FCCF6D8EEA03102E6812C93A9D60B978B702CF156D814EF", 16)), fhstVarArr[7].b(new BigInteger("216EE8B189D291A0224984C1E92F1D16BF75CCD825A087A239B276D3167743C52C02D6E7232AA", 16), new BigInteger("5D9306BACD22B7FAEB09D2E049C6E2866C5D1677762A8F2F2DC9A11C7F7BE8340AB2237C7F2A0", 16)), fhstVarArr[8].b(new BigInteger("324A6EDDD512F08C49A99AE0D3F961197A76413E7BE81A400CA681E09639B5FE12E59A109F78BF4A373541B3B9A1", 16), new BigInteger("1AB597A5B4477F59E39539007C7F977D1A567B92B043A49C6B61984C3FE3481AAF454CD41BA1F051626442B3C10", 16)), fhstVarArr[9].b(new BigInteger("1A62BA79D98133A16BBAE7ED9A8E03C32E0824D57AEF72F88986874E5AAE49C27BED49A2A95058068426C2171E99FD3B43C5947C857D", 16), new BigInteger("70B5E1E14031C1F70BBEFE96BDDE66F451754B4CA5F48DA241F331AA396B8D1839A855C1769B1EA14BA53308B5E2723724E090E02DB9", 16))};
        int i = 0;
        while (true) {
            fhqt[] fhqtVarArr = a;
            int length = fhqtVarArr.length;
            if (i >= 10) {
                break;
            }
            fhqtVarArr[i] = new fhqt(fhstVarArr[i], fhtaVarArr[i], bigIntegerArr[i], bigIntegerArr2[i]);
            i++;
        }
        int i2 = 0;
        while (true) {
            ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = b;
            int length2 = aSN1ObjectIdentifierArr.length;
            if (i2 >= 10) {
                return;
            }
            aSN1ObjectIdentifierArr[i2] = new ASN1ObjectIdentifier(c + i2);
            i2++;
        }
    }
}

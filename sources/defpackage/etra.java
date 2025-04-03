package defpackage;

import java.lang.reflect.Array;
import java.math.BigInteger;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etra {
    public static final long[] a;
    static final long[] b;
    public static final long[] c;
    static final etqt[][] d;
    public static final etqt[] e;
    private static final BigInteger f;
    private static final BigInteger g;
    private static final BigInteger h;
    private static final BigInteger i;

    static {
        BigInteger subtract = BigInteger.valueOf(2L).pow(PrivateKeyType.INVALID).subtract(BigInteger.valueOf(19L));
        f = subtract;
        BigInteger mod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        g = mod;
        BigInteger mod2 = BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        h = mod2;
        BigInteger modPow = BigInteger.valueOf(2L).modPow(subtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), subtract);
        i = modPow;
        etqz etqzVar = new etqz();
        etqzVar.b = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract);
        BigInteger bigInteger = etqzVar.b;
        BigInteger multiply = bigInteger.pow(2).subtract(BigInteger.ONE).multiply(mod.multiply(bigInteger.pow(2)).add(BigInteger.ONE).modInverse(subtract));
        BigInteger modPow2 = multiply.modPow(subtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), subtract);
        if (!modPow2.pow(2).subtract(multiply).mod(subtract).equals(BigInteger.ZERO)) {
            modPow2 = modPow2.multiply(modPow).mod(subtract);
        }
        if (modPow2.testBit(0)) {
            modPow2 = subtract.subtract(modPow2);
        }
        etqzVar.a = modPow2;
        a = etrf.l(c(mod));
        b = etrf.l(c(mod2));
        c = etrf.l(c(modPow));
        d = (etqt[][]) Array.newInstance((Class<?>) etqt.class, 32, 8);
        etqz etqzVar2 = etqzVar;
        for (int i2 = 0; i2 < 32; i2++) {
            etqz etqzVar3 = etqzVar2;
            for (int i3 = 0; i3 < 8; i3++) {
                d[i2][i3] = a(etqzVar3);
                etqzVar3 = b(etqzVar3, etqzVar2);
            }
            for (int i4 = 0; i4 < 8; i4++) {
                etqzVar2 = b(etqzVar2, etqzVar2);
            }
        }
        etqz b2 = b(etqzVar, etqzVar);
        e = new etqt[8];
        for (int i5 = 0; i5 < 8; i5++) {
            e[i5] = a(etqzVar);
            etqzVar = b(etqzVar, b2);
        }
    }

    private static etqt a(etqz etqzVar) {
        BigInteger add = etqzVar.b.add(etqzVar.a);
        BigInteger bigInteger = f;
        return new etqt(etrf.l(c(add.mod(bigInteger))), etrf.l(c(etqzVar.b.subtract(etqzVar.a).mod(bigInteger))), etrf.l(c(h.multiply(etqzVar.a).multiply(etqzVar.b).mod(bigInteger))));
    }

    private static etqz b(etqz etqzVar, etqz etqzVar2) {
        etqz etqzVar3 = new etqz();
        BigInteger multiply = g.multiply(etqzVar.a.multiply(etqzVar2.a).multiply(etqzVar.b).multiply(etqzVar2.b));
        BigInteger bigInteger = f;
        BigInteger mod = multiply.mod(bigInteger);
        etqzVar3.a = etqzVar.a.multiply(etqzVar2.b).add(etqzVar2.a.multiply(etqzVar.b)).multiply(BigInteger.ONE.add(mod).modInverse(bigInteger)).mod(bigInteger);
        etqzVar3.b = etqzVar.b.multiply(etqzVar2.b).add(etqzVar.a.multiply(etqzVar2.a)).multiply(BigInteger.ONE.subtract(mod).modInverse(bigInteger)).mod(bigInteger);
        return etqzVar3;
    }

    private static byte[] c(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = bArr[i2];
            int i3 = 31 - i2;
            bArr[i2] = bArr[i3];
            bArr[i3] = b2;
        }
        return bArr;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fiaa {
    static fhzz a(fhzm fhzmVar, fhzp fhzpVar, fhzj fhzjVar) {
        double d;
        int i = fhzmVar.a.b;
        byte[][] k = fiai.k(fhzpVar.a);
        fhzz[] fhzzVarArr = new fhzz[k.length];
        for (int i2 = 0; i2 < k.length; i2++) {
            fhzzVarArr[i2] = new fhzz(0, k[i2]);
        }
        fhzi fhziVar = new fhzi();
        fhziVar.e = fhzjVar.d;
        fhziVar.f = fhzjVar.e;
        fhziVar.a = fhzjVar.a;
        fhziVar.b = 0;
        fhziVar.c = fhzjVar.c;
        fhziVar.g = fhzjVar.f;
        fhzj fhzjVar2 = new fhzj(fhziVar);
        while (i > 1) {
            int i3 = 0;
            while (true) {
                d = i >> 1;
                if (i3 >= ((int) Math.floor(d))) {
                    break;
                }
                fhzi fhziVar2 = new fhzi();
                fhziVar2.e = fhzjVar2.d;
                fhziVar2.f = fhzjVar2.e;
                fhziVar2.a = fhzjVar2.a;
                fhziVar2.b = fhzjVar2.b;
                fhziVar2.c = i3;
                fhziVar2.g = fhzjVar2.f;
                fhzjVar2 = new fhzj(fhziVar2);
                int i4 = i3 + i3;
                fhzzVarArr[i3] = b(fhzmVar, fhzzVarArr[i4], fhzzVarArr[i4 + 1], fhzjVar2);
                i3++;
            }
            if ((i & 1) == 1) {
                fhzzVarArr[(int) Math.floor(d)] = fhzzVarArr[i - 1];
            }
            i = (int) Math.ceil(i / 2.0d);
            fhzi fhziVar3 = new fhzi();
            fhziVar3.e = fhzjVar2.d;
            fhziVar3.f = fhzjVar2.e;
            fhziVar3.a = fhzjVar2.a;
            fhziVar3.b = fhzjVar2.b + 1;
            fhziVar3.c = fhzjVar2.c;
            fhziVar3.g = fhzjVar2.f;
            fhzjVar2 = new fhzj(fhziVar3);
        }
        return fhzzVarArr[0];
    }

    static fhzz b(fhzm fhzmVar, fhzz fhzzVar, fhzz fhzzVar2, fhzr fhzrVar) {
        if (fhzzVar == null) {
            throw new NullPointerException("left == null");
        }
        if (fhzzVar2 == null) {
            throw new NullPointerException("right == null");
        }
        if (fhzzVar.a != fhzzVar2.a) {
            throw new IllegalStateException("height of both nodes must be equal");
        }
        byte[] c = fics.c(fhzmVar.c);
        if (fhzrVar instanceof fhzj) {
            fhzj fhzjVar = (fhzj) fhzrVar;
            fhzi fhziVar = new fhzi();
            fhziVar.e = fhzjVar.d;
            fhziVar.f = fhzjVar.e;
            fhziVar.a = fhzjVar.a;
            fhziVar.b = fhzjVar.b;
            fhziVar.c = fhzjVar.c;
            fhziVar.g = 0;
            fhzrVar = new fhzj(fhziVar);
        } else if (fhzrVar instanceof fhzg) {
            fhzg fhzgVar = (fhzg) fhzrVar;
            fhzf fhzfVar = new fhzf();
            fhzfVar.e = fhzgVar.d;
            fhzfVar.f = fhzgVar.e;
            fhzfVar.a = fhzgVar.a;
            fhzfVar.b = fhzgVar.b;
            fhzfVar.g = 0;
            fhzrVar = new fhzg(fhzfVar);
        }
        byte[] a = fhzmVar.b.a(c, fhzrVar.a());
        if (fhzrVar instanceof fhzj) {
            fhzj fhzjVar2 = (fhzj) fhzrVar;
            fhzi fhziVar2 = new fhzi();
            fhziVar2.e = fhzjVar2.d;
            fhziVar2.f = fhzjVar2.e;
            fhziVar2.a = fhzjVar2.a;
            fhziVar2.b = fhzjVar2.b;
            fhziVar2.c = fhzjVar2.c;
            fhziVar2.g = 1;
            fhzrVar = new fhzj(fhziVar2);
        } else if (fhzrVar instanceof fhzg) {
            fhzg fhzgVar2 = (fhzg) fhzrVar;
            fhzf fhzfVar2 = new fhzf();
            fhzfVar2.e = fhzgVar2.d;
            fhzfVar2.f = fhzgVar2.e;
            fhzfVar2.a = fhzgVar2.a;
            fhzfVar2.b = fhzgVar2.b;
            fhzfVar2.g = 1;
            fhzrVar = new fhzg(fhzfVar2);
        }
        byte[] a2 = fhzmVar.b.a(c, fhzrVar.a());
        if (fhzrVar instanceof fhzj) {
            fhzj fhzjVar3 = (fhzj) fhzrVar;
            fhzi fhziVar3 = new fhzi();
            fhziVar3.e = fhzjVar3.d;
            fhziVar3.f = fhzjVar3.e;
            fhziVar3.a = fhzjVar3.a;
            fhziVar3.b = fhzjVar3.b;
            fhziVar3.c = fhzjVar3.c;
            fhziVar3.g = 2;
            fhzrVar = new fhzj(fhziVar3);
        } else if (fhzrVar instanceof fhzg) {
            fhzg fhzgVar3 = (fhzg) fhzrVar;
            fhzf fhzfVar3 = new fhzf();
            fhzfVar3.e = fhzgVar3.d;
            fhzfVar3.f = fhzgVar3.e;
            fhzfVar3.a = fhzgVar3.a;
            fhzfVar3.b = fhzgVar3.b;
            fhzfVar3.g = 2;
            fhzrVar = new fhzg(fhzfVar3);
        }
        byte[] a3 = fhzmVar.b.a(c, fhzrVar.a());
        int i = fhzmVar.a.a;
        int i2 = i + i;
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) (fhzzVar.a()[i3] ^ a2[i3]);
        }
        for (int i4 = 0; i4 < i; i4++) {
            bArr[i4 + i] = (byte) (fhzzVar2.a()[i4] ^ a3[i4]);
        }
        fhzh fhzhVar = fhzmVar.b;
        int length = a.length;
        int i5 = fhzhVar.a;
        if (length != i5) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (i2 != i5 + i5) {
            throw new IllegalArgumentException("wrong in length");
        }
        return new fhzz(fhzzVar.a, fhzhVar.b(1, a, bArr));
    }
}

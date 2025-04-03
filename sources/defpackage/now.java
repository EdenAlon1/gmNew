package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class now {
    public static nov a(int i, ncp ncpVar, luv luvVar) {
        nov a = nov.a(ncpVar, luvVar);
        while (true) {
            int i2 = a.a;
            if (i2 == i) {
                return a;
            }
            luj.f("WavHeaderReader", a.h(i2, "Ignoring unknown WAV chunk: "));
            long j = a.b;
            long j2 = 8 + j;
            if ((1 & j) != 0) {
                j2 = j + 9;
            }
            if (j2 > 2147483647L) {
                throw new lrg("Chunk is too large (~2GB+) to skip; id: " + a.a, null, false, 1);
            }
            ncpVar.l((int) j2);
            a = nov.a(ncpVar, luvVar);
        }
    }

    public static boolean b(ncp ncpVar) {
        luv luvVar = new luv(8);
        int i = nov.a(ncpVar, luvVar).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ncpVar.i(luvVar.a, 0, 4);
        luvVar.K(0);
        int e = luvVar.e();
        if (e == 1463899717) {
            return true;
        }
        luj.c("WavHeaderReader", a.h(e, "Unsupported form type: "));
        return false;
    }
}

package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpi {
    private final jse a;
    private final jzn b;
    private final kah c;
    private final jpe d = new jpe(null);

    public jpi(jse jseVar, jzn jznVar, kah kahVar) {
        this.a = jseVar;
        this.b = jznVar;
        this.c = kahVar;
    }

    public static /* synthetic */ jpg a(jpi jpiVar, String str, jpo jpoVar, int i, int i2, long j, int i3) {
        if ((i3 & 2) != 0) {
            jpoVar = jpo.a;
        }
        return b(jpiVar, new jlm(str), jpoVar, (i3 & 4) != 0 ? 1 : i, (i3 & 8) != 0, (i3 & 16) != 0 ? Integer.MAX_VALUE : i2, (i3 & 32) != 0 ? jzl.k(0, 0, 0, 15) : j, jpiVar.c, jpiVar.b, jpiVar.a, 32);
    }

    public static /* synthetic */ jpg b(jpi jpiVar, jlm jlmVar, jpo jpoVar, int i, boolean z, int i2, long j, kah kahVar, jzn jznVar, jse jseVar, int i3) {
        jpo jpoVar2 = (i3 & 2) != 0 ? jpo.a : jpoVar;
        int i4 = (i3 & 4) != 0 ? 1 : i;
        boolean z2 = (!((i3 & 8) == 0)) | z;
        int i5 = i3 & 16;
        int i6 = Alert.DURATION_SHOW_INDEFINITELY;
        int i7 = i5 != 0 ? Integer.MAX_VALUE : i2;
        ffel ffelVar = (i3 & 32) != 0 ? ffel.a : null;
        long k = (i3 & 64) != 0 ? jzl.k(0, 0, 0, 15) : j;
        jpf jpfVar = new jpf(jlmVar, jpoVar2, ffelVar, i7, z2, i4, (i3 & 256) != 0 ? jpiVar.b : jznVar, (i3 & 128) != 0 ? jpiVar.c : kahVar, (i3 & 512) != 0 ? jpiVar.a : jseVar, k);
        jpg jpgVar = (jpg) jpiVar.d.a.c(new jls(jpfVar));
        if (jpgVar == null || jpgVar.b.a.c()) {
            jpgVar = null;
        }
        if (jpgVar != null) {
            return jpgVar.p(jpfVar, jzl.e(k, (jmj.a(jpgVar.b.d) << 32) | (4294967295L & jmj.a(jpgVar.b.e))));
        }
        jmc jmcVar = new jmc(jpfVar.a, jpp.b(jpfVar.b, jpfVar.h), jpfVar.c, jpfVar.g, jpfVar.i);
        long j2 = jpfVar.j;
        boolean z3 = jpfVar.e;
        if ((z3 || jpk.a(jpfVar.f)) && jzk.i(j2)) {
            i6 = jzk.b(j2);
        }
        int i8 = i6;
        int i9 = (z3 || !jpk.a(jpfVar.f)) ? jpfVar.d : 1;
        int d = jzk.d(j2);
        if (d != i8) {
            i8 = ffmk.i(jmj.a(jmcVar.a()), d, i8);
        }
        jpg jpgVar2 = new jpg(jpfVar, new jlz(jmcVar, jzj.b(0, i8, 0, jzk.a(jpfVar.j)), i9, jpfVar.f), jzl.e(jpfVar.j, (4294967295L & ((int) Math.ceil(r8.e))) | (((int) Math.ceil(r8.d)) << 32)));
        jpiVar.d.a.d(new jls(jpfVar), jpgVar2);
        return jpgVar2;
    }
}

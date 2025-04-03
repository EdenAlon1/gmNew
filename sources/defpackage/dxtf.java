package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxtf {
    private final dwqy a;
    private final Random b;

    public dxtf(dwqy dwqyVar, Random random) {
        this.a = dwqyVar;
        this.b = random;
    }

    public static final boolean b(long j, long j2) {
        return j % j2 == 0;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [dxti, java.lang.Object] */
    public final ListenableFuture a(final long j, emxc emxcVar) {
        if (j == 0) {
            return erqt.i(emux.a);
        }
        if (j < 0) {
            dxth.g("Bad sample interval (negative number): %d", Long.valueOf(j));
            return erqt.i(emux.a);
        }
        if (this.a.K() && emxcVar.g()) {
            return dycd.e(emxcVar.c().e()).f(new emwl() { // from class: dxte
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    long j2 = j;
                    dwtv dwtvVar = (dwtv) obj;
                    boolean z = 100 % j2 != 0;
                    if (z) {
                        dxth.g("Bad sample interval (1 percent cohort will not log): %d", Long.valueOf(j2));
                    }
                    if (!dxtf.b(dwtvVar.c, j2)) {
                        return emux.a;
                    }
                    erjv erjvVar = (erjv) erjw.a.createBuilder();
                    erjvVar.copyOnWrite();
                    erjw erjwVar = (erjw) erjvVar.instance;
                    erjwVar.b |= 1;
                    erjwVar.c = true;
                    eyja eyjaVar = dwtvVar.d;
                    if (eyjaVar == null) {
                        eyjaVar = eyja.a;
                    }
                    long b = eykm.b(eyjaVar);
                    erjvVar.copyOnWrite();
                    erjw erjwVar2 = (erjw) erjvVar.instance;
                    erjwVar2.b |= 2;
                    erjwVar2.d = b;
                    boolean b2 = dxtf.b(dwtvVar.c, 100L);
                    erjvVar.copyOnWrite();
                    erjw erjwVar3 = (erjw) erjvVar.instance;
                    erjwVar3.b |= 4;
                    erjwVar3.e = b2;
                    erjvVar.copyOnWrite();
                    erjw erjwVar4 = (erjw) erjvVar.instance;
                    erjwVar4.b |= 8;
                    erjwVar4.f = z;
                    return emxc.j((erjw) erjvVar.build());
                }
            }, erpp.a);
        }
        if (j == 0 || !b(this.b.nextLong(), j)) {
            return erqt.i(emux.a);
        }
        erjv erjvVar = (erjv) erjw.a.createBuilder();
        erjvVar.copyOnWrite();
        erjw erjwVar = (erjw) erjvVar.instance;
        erjwVar.b |= 1;
        erjwVar.c = false;
        return erqt.i(emxc.j((erjw) erjvVar.build()));
    }
}

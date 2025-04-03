package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class mfk {
    public final /* synthetic */ mgl a;

    public final void a(final mgv mgvVar) {
        final mgl mglVar = this.a;
        mglVar.f.b(new Runnable() { // from class: mfr
            @Override // java.lang.Runnable
            public final void run() {
                long j;
                mgv mgvVar2 = mgvVar;
                mgl mglVar2 = mgl.this;
                int i = mglVar2.o - mgvVar2.c;
                mglVar2.o = i;
                boolean z = true;
                if (mgvVar2.d) {
                    mglVar2.p = mgvVar2.e;
                    mglVar2.q = true;
                }
                if (i == 0) {
                    lru lruVar = mgvVar2.b.b;
                    if (!mglVar2.A.b.q() && lruVar.q()) {
                        mglVar2.B = -1;
                        mglVar2.C = 0L;
                    }
                    if (!lruVar.q()) {
                        List asList = Arrays.asList(((mif) lruVar).c);
                        lti.c(asList.size() == mglVar2.i.size());
                        for (int i2 = 0; i2 < asList.size(); i2++) {
                            ((mgk) mglVar2.i.get(i2)).a = (lru) asList.get(i2);
                        }
                    }
                    long j2 = -9223372036854775807L;
                    if (mglVar2.q) {
                        if (mgvVar2.b.c.equals(mglVar2.A.c) && mgvVar2.b.e == mglVar2.A.t) {
                            z = false;
                        }
                        if (z) {
                            if (lruVar.q() || mgvVar2.b.c.b()) {
                                j = mgvVar2.b.e;
                            } else {
                                mhz mhzVar = mgvVar2.b;
                                j = mglVar2.ah(lruVar, mhzVar.c, mhzVar.e);
                            }
                            j2 = j;
                        }
                    } else {
                        z = false;
                    }
                    mglVar2.q = false;
                    mglVar2.as(mgvVar2.b, 1, z, mglVar2.p, j2, -1, false);
                }
            }
        });
    }
}

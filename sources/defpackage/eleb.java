package defpackage;

import android.os.Trace;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eleb {
    elat a;
    public final boolean b;
    int c = 4;

    public eleb(elaw elawVar, boolean z) {
        this.a = z ? elawVar.a() : null;
        this.b = z;
    }

    public static void a(elat elatVar, boolean z) {
        elan elanVar = ekyf.b().g;
        int i = elanVar.b + 1;
        elanVar.b = i;
        if (z) {
            elanVar.a.set(i);
        } else {
            elanVar.a.clear(i);
        }
        Trace.beginSection(ekyf.n(elatVar.c()));
    }

    public static void b() {
        elan elanVar = ekyf.b().g;
        BitSet bitSet = elanVar.a;
        int i = elanVar.b;
        elanVar.b = i - 1;
        bitSet.get(i);
        Trace.endSection();
    }

    public static boolean e() {
        elan elanVar = ekyf.b().g;
        return elanVar.a.get(elanVar.b);
    }

    final void c(elat elatVar) {
        if (elatVar.b() != this) {
            Trace.beginSection("<CR:propagated>");
            a(elatVar, true);
        } else {
            if (elatVar.a() != null) {
                c(elatVar.a());
            }
            a(elatVar, false);
        }
    }

    final void d(elat elatVar) {
        boolean e = e();
        b();
        if (e) {
            Trace.endSection();
        } else if (elatVar.a() != null) {
            d(elatVar.a());
        }
    }

    public final boolean f() {
        return this.c != 4;
    }
}

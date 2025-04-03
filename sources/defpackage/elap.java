package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elap {
    public static void a(elat elatVar) {
        Trace.beginSection(ekyf.n(elatVar.c()));
    }

    static void b(elat elatVar) {
        if (d(elatVar)) {
            Trace.beginSection("<propagated>");
            a(elatVar);
        } else {
            if (elatVar.a() != null) {
                b(elatVar.a());
            }
            a(elatVar);
        }
    }

    static void c(elat elatVar) {
        if (d(elatVar)) {
            Trace.endSection();
            Trace.endSection();
        } else {
            Trace.endSection();
            if (elatVar.a() != null) {
                c(elatVar.a());
            }
        }
    }

    public static boolean d(elat elatVar) {
        return elatVar.d() != Thread.currentThread();
    }
}

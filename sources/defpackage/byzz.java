package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byzz {
    public final ejvb a;
    private final ejvp b;

    public byzz(ejvb ejvbVar, ejvp ejvpVar) {
        this.a = ejvbVar;
        this.b = ejvpVar;
    }

    public static void b(aqge aqgeVar, Object obj, lkk lkkVar, ejvp ejvpVar) {
        lkkVar.getClass();
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("cannot add observe lifecycle from other than main thread");
        }
        lkkVar.c(new byzy(aqgeVar, ejvpVar, obj));
    }

    public final ejuh a(final aqge aqgeVar, Object obj, lkk lkkVar) {
        b(aqgeVar, obj, lkkVar, this.b);
        return new ejuy(this.a, new eros() { // from class: byzv
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                return new erph(aqge.this.b());
            }
        }, obj);
    }
}

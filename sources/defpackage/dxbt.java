package defpackage;

import android.app.Service;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dxbt extends Service implements fbat {
    private volatile fbaj a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.fbat
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fbaj aW() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new fbaj(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            ((dxbs) this).a = (dwub) ((akhb) aX()).b.a.iQ.b();
        }
        super.onCreate();
    }
}

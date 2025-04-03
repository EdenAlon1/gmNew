package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class egkf extends iy implements fbat, fbam {
    private fbai n;
    private volatile fazw o;
    private final Object p = new Object();
    public boolean E = false;

    public egkf() {
        y(new egke(this));
    }

    public static final boolean H(Object obj) {
        if (obj instanceof fbas) {
            return !(obj instanceof fbam) || ((fbam) obj).e();
        }
        return false;
    }

    @Override // defpackage.fbat
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final fazw aW() {
        if (this.o == null) {
            synchronized (this.p) {
                if (this.o == null) {
                    this.o = new fazw(this);
                }
            }
        }
        return this.o;
    }

    public final Object G() {
        return fazn.a(getApplicationContext());
    }

    @Override // defpackage.abe, defpackage.lkd
    public final lms R() {
        return !H(G()) ? super.R() : fazp.a(this, super.R());
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbam
    public final boolean e() {
        return this.E;
    }

    @Override // defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof fbas) {
            fbai c = aW().c();
            this.n = c;
            if (c.b()) {
                this.n.a = T();
            }
        }
    }

    @Override // defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        fbai fbaiVar = this.n;
        if (fbaiVar != null) {
            fbaiVar.a();
        }
    }
}

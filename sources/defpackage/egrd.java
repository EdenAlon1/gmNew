package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class egrd extends iy implements fbat, fbam {
    private fbai o;
    private volatile fazw p;
    private final Object q = new Object();
    public boolean n = false;

    public egrd() {
        y(new egrc(this));
    }

    public static final boolean D(Object obj) {
        if (obj instanceof fbas) {
            return !(obj instanceof fbam) || ((fbam) obj).e();
        }
        return false;
    }

    @Override // defpackage.fbat
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final fazw aW() {
        if (this.p == null) {
            synchronized (this.q) {
                if (this.p == null) {
                    this.p = new fazw(this);
                }
            }
        }
        return this.p;
    }

    public final Object C() {
        return fazn.a(getApplicationContext());
    }

    @Override // defpackage.abe, defpackage.lkd
    public final lms R() {
        return !D(C()) ? super.R() : fazp.a(this, super.R());
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbam
    public final boolean e() {
        return this.n;
    }

    @Override // defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof fbas) {
            fbai c = aW().c();
            this.o = c;
            if (c.b()) {
                this.o.a = T();
            }
        }
    }

    @Override // defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        fbai fbaiVar = this.o;
        if (fbaiVar != null) {
            fbaiVar.a();
        }
    }
}

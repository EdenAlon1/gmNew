package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class czng extends eg implements fbat {
    private fbai o;
    private volatile fazw p;
    private final Object q = new Object();
    public boolean n = false;

    public czng() {
        y(new cznf(this));
    }

    @Override // defpackage.abe, defpackage.lkd
    public final lms R() {
        return fazp.a(this, super.R());
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbat
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final fazw aW() {
        if (this.p == null) {
            synchronized (this.q) {
                if (this.p == null) {
                    this.p = k();
                }
            }
        }
        return this.p;
    }

    protected fazw k() {
        throw null;
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

    @Override // defpackage.eg, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        fbai fbaiVar = this.o;
        if (fbaiVar != null) {
            fbaiVar.a();
        }
    }
}

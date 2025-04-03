package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class acpq extends efag implements fbat {
    private fbai p;
    private volatile fazw q;
    private final Object r = new Object();
    public boolean n = false;

    public acpq() {
        y(new acpp(this));
    }

    @Override // defpackage.abe, defpackage.lkd
    public final lms R() {
        return fazp.a(this, super.R());
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    protected fazw j() {
        throw null;
    }

    @Override // defpackage.fbat
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final fazw aW() {
        if (this.q == null) {
            synchronized (this.r) {
                if (this.q == null) {
                    this.q = j();
                }
            }
        }
        return this.q;
    }

    @Override // defpackage.efag, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof fbas) {
            fbai c = aW().c();
            this.p = c;
            if (c.b()) {
                this.p.a = T();
            }
        }
    }

    @Override // defpackage.efag, defpackage.eg, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        fbai fbaiVar = this.p;
        if (fbaiVar != null) {
            fbaiVar.a();
        }
    }
}

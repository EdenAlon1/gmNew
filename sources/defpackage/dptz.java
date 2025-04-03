package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dptz extends eg implements fbat {
    private fbai n;
    private volatile fazw o;
    private final Object p = new Object();
    public boolean u = false;

    public dptz() {
        y(new dpty(this));
    }

    @Override // defpackage.abe, defpackage.lkd
    public final lms R() {
        return fazp.a(this, super.R());
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
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

    @Override // defpackage.eg, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        fbai fbaiVar = this.n;
        if (fbaiVar != null) {
            fbaiVar.a();
        }
    }

    @Override // defpackage.fbat
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
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
}

package defpackage;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class cwqf extends efac implements fbat {
    private fbai sr;
    private volatile fazw ss;
    private final Object st = new Object();

    public cwqf() {
        y(new cwqe(this));
    }

    protected void B() {
        throw null;
    }

    protected fazw E() {
        return new fazw(this);
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
    /* renamed from: ae, reason: merged with bridge method [inline-methods] */
    public final fazw aW() {
        if (this.ss == null) {
            synchronized (this.st) {
                if (this.ss == null) {
                    this.ss = E();
                }
            }
        }
        return this.ss;
    }

    @Override // defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof fbas) {
            fbai c = aW().c();
            this.sr = c;
            if (c.b()) {
                this.sr.a = T();
            }
        }
    }

    @Override // defpackage.efac, defpackage.iy, defpackage.eg, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        fbai fbaiVar = this.sr;
        if (fbaiVar != null) {
            fbaiVar.a();
        }
    }
}

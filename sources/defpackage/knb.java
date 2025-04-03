package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class knb {
    protected kml g;
    CharSequence h;
    public CharSequence i;
    public boolean j = false;

    protected String a() {
        throw null;
    }

    public void b(kls klsVar) {
        throw null;
    }

    protected void c(Bundle bundle) {
        bundle.remove("android.summaryText");
        bundle.remove("android.title.big");
        bundle.remove("android.support.v4.app.extra.COMPAT_TEMPLATE");
    }

    protected void d(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.i = bundle.getCharSequence("android.summaryText");
            this.j = true;
        }
        this.h = bundle.getCharSequence("android.title.big");
    }

    public final void i(kml kmlVar) {
        if (this.g != kmlVar) {
            this.g = kmlVar;
            if (kmlVar != null) {
                kmlVar.u(this);
            }
        }
    }

    public void j(Bundle bundle) {
        if (this.j) {
            bundle.putCharSequence("android.summaryText", this.i);
        }
        CharSequence charSequence = this.h;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        bundle.putString("android.support.v4.app.extra.COMPAT_TEMPLATE", a());
    }

    public void k() {
    }
}

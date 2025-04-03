package defpackage;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
class egmj extends LinearLayout implements fbat, fbam {
    public boolean a;
    private fbal b;

    public egmj(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        fbas a = aW().a();
        if (a instanceof fbas) {
            if ((!(a instanceof fbam) || ((fbam) a).e()) && !this.a) {
                this.a = true;
                ((egmn) aX()).aS((egmm) this);
            }
        }
    }

    @Override // defpackage.fbat
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fbal aW() {
        if (this.b == null) {
            this.b = new fbal(this, true);
        }
        return this.b;
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbam
    public final boolean e() {
        return this.a;
    }
}

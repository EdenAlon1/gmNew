package defpackage;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
class egmi extends LinearLayout implements fbat, fbam {
    private fbal a;
    public boolean i;

    public egmi(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        fbas a = aW().a();
        if (a instanceof fbas) {
            if ((!(a instanceof fbam) || ((fbam) a).e()) && !this.i) {
                this.i = true;
                ((egmh) aX()).aR((egmg) this);
            }
        }
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbat
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final fbal aW() {
        if (this.a == null) {
            this.a = new fbal(this, true);
        }
        return this.a;
    }

    @Override // defpackage.fbam
    public final boolean e() {
        return this.i;
    }
}

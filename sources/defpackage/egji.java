package defpackage;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class egji extends ConstraintLayout implements fbat, fbam {
    private fbal d;
    public boolean h;

    egji(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        i();
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbam
    public final boolean e() {
        return this.h;
    }

    @Override // defpackage.fbat
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final fbal aW() {
        if (this.d == null) {
            this.d = new fbal(this, false);
        }
        return this.d;
    }

    protected final void i() {
        fbas a = aW().a();
        if (a instanceof fbas) {
            if ((!(a instanceof fbam) || ((fbam) a).e()) && !this.h) {
                this.h = true;
                ((egjh) aX()).K((FullscreenErrorView) this);
            }
        }
    }

    public egji(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        i();
    }

    egji(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        i();
    }
}

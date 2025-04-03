package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.libraries.user.profile.photopicker.art.view.ArtImageGridView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class efzr extends LinearLayout implements fbat, fbam {
    private fbal a;
    public boolean h;

    efzr(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        f();
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
        return this.h;
    }

    protected final void f() {
        fbas a = aW().a();
        if (a instanceof fbas) {
            if ((!(a instanceof fbam) || ((fbam) a).e()) && !this.h) {
                this.h = true;
                ((efzk) aX()).aP((ArtImageGridView) this);
            }
        }
    }

    public efzr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        f();
    }

    efzr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        f();
    }

    efzr(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        f();
    }
}

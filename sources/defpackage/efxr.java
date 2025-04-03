package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.libraries.user.profile.photopicker.art.home.view.SuggestedCollectionsSectionView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class efxr extends LinearLayout implements fbat, fbam {
    public boolean a;
    private fbal b;

    efxr(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        b();
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

    protected final void b() {
        fbas a = aW().a();
        if (a instanceof fbas) {
            if ((!(a instanceof fbam) || ((fbam) a).e()) && !this.a) {
                this.a = true;
                ((efxv) aX()).aU((SuggestedCollectionsSectionView) this);
            }
        }
    }

    @Override // defpackage.fbam
    public final boolean e() {
        return this.a;
    }

    public efxr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    efxr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    efxr(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}

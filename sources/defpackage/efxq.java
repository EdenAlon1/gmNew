package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.libraries.user.profile.photopicker.art.home.view.RandomArtImagesSectionView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class efxq extends LinearLayout implements fbat, fbam {
    public boolean a;
    private fbal b;

    efxq(Context context) {
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
                ((efxt) aX()).aT((RandomArtImagesSectionView) this);
            }
        }
    }

    @Override // defpackage.fbam
    public final boolean e() {
        return this.a;
    }

    public efxq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    efxq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    efxq(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}

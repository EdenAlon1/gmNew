package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.ui.ImeDetectCoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cwpa extends CoordinatorLayout implements fbat {
    private fbal j;
    private boolean k;

    cwpa(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        o();
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbat
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final fbal aW() {
        if (this.j == null) {
            this.j = new fbal(this, false);
        }
        return this.j;
    }

    protected final void o() {
        if (this.k) {
            return;
        }
        this.k = true;
        ((cwpd) aX()).O((ImeDetectCoordinatorLayout) this);
    }

    public cwpa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        o();
    }

    cwpa(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        o();
    }
}

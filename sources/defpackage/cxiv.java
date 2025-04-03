package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cxiv extends ConstraintLayout implements fbat {
    private ekkz i;
    private boolean j;

    public cxiv(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbat
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final ekkz aW() {
        if (this.i == null) {
            this.i = new ekkz(this);
        }
        return this.i;
    }

    protected final void g() {
        if (this.j) {
            return;
        }
        this.j = true;
        ((cxcv) aX()).aB();
    }

    public cxiv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    public cxiv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    public cxiv(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        g();
    }
}

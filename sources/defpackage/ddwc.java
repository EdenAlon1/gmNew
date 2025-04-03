package defpackage;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ddwc extends ConstraintLayout implements fbat {
    private ekkz d;
    private boolean e;

    public ddwc(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbat
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ekkz aW() {
        if (this.d == null) {
            this.d = new ekkz(this);
        }
        return this.d;
    }

    protected final void d() {
        if (this.e) {
            return;
        }
        this.e = true;
        ((ddvt) aX()).aE();
    }

    public ddwc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    public ddwc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        d();
    }
}

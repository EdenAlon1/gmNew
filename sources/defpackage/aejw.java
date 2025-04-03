package defpackage;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aejw extends ConstraintLayout implements fbat {
    private ekkz d;
    private boolean e;

    public aejw(Context context) {
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
        ((aeip) aX()).E();
    }

    public aejw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    public aejw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        d();
    }
}

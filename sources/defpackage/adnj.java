package defpackage;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class adnj extends ConstraintLayout implements fbat {
    private ekkz d;
    private boolean e;

    public adnj(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbat
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ekkz aW() {
        if (this.d == null) {
            this.d = new ekkz(this);
        }
        return this.d;
    }

    protected final void c() {
        if (this.e) {
            return;
        }
        this.e = true;
        ((adne) aX()).w();
    }

    public adnj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    public adnj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        c();
    }
}

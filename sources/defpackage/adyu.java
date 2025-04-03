package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class adyu extends MaterialCardView implements fbat {
    private ekkz g;
    private boolean h;

    public adyu(Context context) {
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

    @Override // defpackage.fbat
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final ekkz aW() {
        if (this.g == null) {
            this.g = new ekkz(this);
        }
        return this.g;
    }

    protected final void i() {
        if (this.h) {
            return;
        }
        this.h = true;
        ((adyl) aX()).y();
    }

    public adyu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        i();
    }

    public adyu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        i();
    }
}

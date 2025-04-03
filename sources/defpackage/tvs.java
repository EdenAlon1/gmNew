package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tvs extends RecyclerView implements fbat {
    private ekkz ac;
    private boolean ad;

    public tvs(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        aQ();
    }

    @Override // defpackage.fbat
    /* renamed from: aP, reason: merged with bridge method [inline-methods] */
    public final ekkz aW() {
        if (this.ac == null) {
            this.ac = new ekkz(this);
        }
        return this.ac;
    }

    protected final void aQ() {
        if (this.ad) {
            return;
        }
        this.ad = true;
        ((tvp) aX()).g();
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    public tvs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        aQ();
    }

    public tvs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        aQ();
    }
}

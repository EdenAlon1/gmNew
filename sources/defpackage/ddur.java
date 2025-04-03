package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ddur extends RecyclerView implements fbat {
    private ekkz ac;
    private boolean ad;

    public ddur(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        aP();
    }

    @Override // defpackage.fbat
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ekkz aW() {
        if (this.ac == null) {
            this.ac = new ekkz(this);
        }
        return this.ac;
    }

    protected final void aP() {
        if (this.ad) {
            return;
        }
        this.ad = true;
        ((ddvp) aX()).aM();
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    public ddur(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        aP();
    }

    public ddur(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        aP();
    }
}

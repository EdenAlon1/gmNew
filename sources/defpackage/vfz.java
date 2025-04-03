package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.android.apps.messaging.conversation.reactions.ui.selection.ReactionSelectionRecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vfz extends RecyclerView implements fbat {
    private fbal ac;
    private boolean ad;

    vfz(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        aP();
    }

    @Override // defpackage.fbat
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fbal aW() {
        if (this.ac == null) {
            this.ac = new fbal(this, false);
        }
        return this.ac;
    }

    protected final void aP() {
        if (this.ad) {
            return;
        }
        this.ad = true;
        ((vgr) aX()).d((ReactionSelectionRecyclerView) this);
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    public vfz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        aP();
    }

    vfz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        aP();
    }
}

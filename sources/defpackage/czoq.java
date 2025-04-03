package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.android.apps.messaging.ui.conversation.richcard.ConversationRichCardCarouselView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class czoq extends RecyclerView implements fbat {
    private fbal ac;
    private boolean ad;

    public czoq(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        aQ();
    }

    @Override // defpackage.fbat
    /* renamed from: aP, reason: merged with bridge method [inline-methods] */
    public final fbal aW() {
        if (this.ac == null) {
            this.ac = new fbal(this, false);
        }
        return this.ac;
    }

    protected final void aQ() {
        if (this.ad) {
            return;
        }
        this.ad = true;
        ((czoo) aX()).y((ConversationRichCardCarouselView) this);
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    public czoq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        aQ();
    }

    czoq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        aQ();
    }
}

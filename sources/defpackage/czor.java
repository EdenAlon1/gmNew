package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.ui.conversation.richcard.ConversationRichCardView;
import com.google.android.material.card.MaterialCardView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class czor extends MaterialCardView implements fbat {
    private fbal g;
    private boolean h;

    czor(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        n();
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbat
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final fbal aW() {
        if (this.g == null) {
            this.g = new fbal(this, false);
        }
        return this.g;
    }

    protected final void n() {
        if (this.h) {
            return;
        }
        this.h = true;
        ((czop) aX()).z((ConversationRichCardView) this);
    }

    public czor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        n();
    }

    public czor(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        n();
    }
}

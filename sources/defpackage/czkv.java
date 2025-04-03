package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class czkv extends FrameLayout implements fbat {
    private fbal a;
    private boolean b;

    czkv(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        J();
    }

    @Override // defpackage.fbat
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final fbal aW() {
        if (this.a == null) {
            this.a = new fbal(this, false);
        }
        return this.a;
    }

    protected final void J() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((czkp) aX()).x((ConversationMessageView) this);
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    public czkv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        J();
    }

    czkv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        J();
    }

    czkv(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        J();
    }
}

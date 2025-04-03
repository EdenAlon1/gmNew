package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.ui.conversation.suggestions.ConversationSuggestionsView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class czrj extends LinearLayout implements fbat {
    private fbal a;
    private boolean b;

    czrj(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbat
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final fbal aW() {
        if (this.a == null) {
            this.a = new fbal(this, false);
        }
        return this.a;
    }

    protected final void g() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((czri) aX()).B((ConversationSuggestionsView) this);
    }

    public czrj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    czrj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    czrj(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        g();
    }
}

package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.libraries.compose.emoji.ui.views.SingleEmojiViewWithVariantIndicator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dqym<T> extends dqyk<T> implements fbat {
    private fbal j;
    private boolean k;

    public dqym(Context context) {
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
    public final fbal aW() {
        if (this.j == null) {
            this.j = new fbal(this, false);
        }
        return this.j;
    }

    protected final void i() {
        if (this.k) {
            return;
        }
        this.k = true;
        ((dqyn) aX()).ab((SingleEmojiViewWithVariantIndicator) this);
    }

    public dqym(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        i();
    }
}

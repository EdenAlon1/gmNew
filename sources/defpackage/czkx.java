package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.apps.messaging.ui.conversation.message.MessageMetadataDetailsView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class czkx extends ViewGroup implements fbat {
    private fbal a;
    private boolean b;

    czkx(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    @Override // defpackage.fbat
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fbal aW() {
        if (this.a == null) {
            this.a = new fbal(this, false);
        }
        return this.a;
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    protected final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((czln) aX()).R((MessageMetadataDetailsView) this);
    }

    czkx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    public czkx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    czkx(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}

package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.audio.attachment.AudioAttachmentView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sgy extends LinearLayout implements fbat {
    private ekkz a;
    private boolean b;

    sgy(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        j();
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbat
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final ekkz aW() {
        if (this.a == null) {
            this.a = new ekkz(this);
        }
        return this.a;
    }

    protected final void j() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((sgv) aX()).a((AudioAttachmentView) this);
    }

    public sgy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        j();
    }

    sgy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        j();
    }

    sgy(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        j();
    }
}

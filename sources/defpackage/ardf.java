package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.shared.audio.attachment.ui.AudioPlaybackSeekBar;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ardf extends rg implements fbat {
    private fbal a;
    private boolean b;

    ardf(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbat
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fbal aW() {
        if (this.a == null) {
            this.a = new fbal(this, false);
        }
        return this.a;
    }

    protected final void c() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((arde) aX()).p((AudioPlaybackSeekBar) this);
    }

    public ardf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    ardf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        c();
    }
}

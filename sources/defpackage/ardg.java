package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Chronometer;
import com.google.android.apps.messaging.shared.audio.attachment.ui.PausableChronometer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ardg extends Chronometer implements fbat {
    private fbal a;
    private boolean b;

    ardg(Context context) {
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
        ((ardh) aX()).T((PausableChronometer) this);
    }

    public ardg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    ardg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    ardg(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}

package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.ui.mediapicker.c2o.selectable.SelectableContentItemView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dclp extends FrameLayout implements fbat {
    private fbal a;
    private boolean b;

    dclp(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        h();
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    public void h() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((dclu) aX()).Z((SelectableContentItemView) this);
    }

    @Override // defpackage.fbat
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final fbal aW() {
        if (this.a == null) {
            this.a = new fbal(this, false);
        }
        return this.a;
    }

    public dclp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        h();
    }

    dclp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        h();
    }

    dclp(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        h();
    }
}

package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackDataView;
import com.google.android.material.card.MaterialCardView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class adxx extends MaterialCardView implements fbat {
    private fbal g;
    private boolean h;

    adxx(Context context) {
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
    public final fbal aW() {
        if (this.g == null) {
            this.g = new fbal(this, false);
        }
        return this.g;
    }

    protected final void j() {
        if (this.h) {
            return;
        }
        this.h = true;
        ((adwr) aX()).j((AdvancedFeedbackDataView) this);
    }

    public adxx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        j();
    }

    adxx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        j();
    }
}

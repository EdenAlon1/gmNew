package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.shared.ui.AsyncImageView;
import com.google.android.apps.messaging.shared.ui.RoundedImageView;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class crht extends RoundedImageView implements fbat {
    private fbal a;
    private boolean b;

    public crht(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        o();
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbat
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final fbal aW() {
        if (this.a == null) {
            this.a = new fbal(this, false);
        }
        return this.a;
    }

    protected void o() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((crhl) aX()).n((AsyncImageView) this);
    }

    public crht(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        o();
    }
}

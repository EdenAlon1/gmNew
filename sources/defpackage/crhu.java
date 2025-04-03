package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.shared.ui.AsyncImageView;
import com.google.android.apps.messaging.shared.ui.ContactIconView;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class crhu extends AsyncImageView {
    private boolean h;

    public crhu(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        o();
    }

    @Override // defpackage.crht
    protected final void o() {
        if (this.h) {
            return;
        }
        this.h = true;
        ((crhs) aX()).s((ContactIconView) this);
    }

    public crhu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        o();
    }
}

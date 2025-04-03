package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AspectRatioLayout;
import com.google.android.apps.messaging.ui.mediapicker.camera.MiniCameraViewImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dcpv extends AspectRatioLayout implements fbat {
    private fbal b;
    private boolean c;

    public dcpv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode() || this.c) {
            return;
        }
        this.c = true;
        ((dcqv) aX()).S((MiniCameraViewImpl) this);
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbat
    /* renamed from: gF, reason: merged with bridge method [inline-methods] */
    public final fbal aW() {
        if (this.b == null) {
            this.b = new fbal(this, false);
        }
        return this.b;
    }
}

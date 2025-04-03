package defpackage;

import android.content.Context;
import android.view.animation.ScaleAnimation;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class crib extends ScaleAnimation {
    private final Context a;

    public crib(Context context) {
        super(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.a = context;
    }

    @Override // android.view.animation.Animation
    public final void setDuration(long j) {
        super.setDuration(crhz.a(this.a, j));
    }
}

package defpackage;

import android.content.Context;
import android.view.animation.AlphaAnimation;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class crhy extends AlphaAnimation {
    private final Context a;

    public crhy(Context context, float f, float f2) {
        super(f, f2);
        this.a = context;
    }

    @Override // android.view.animation.Animation
    public final void setDuration(long j) {
        super.setDuration(crhz.a(this.a, j));
    }
}

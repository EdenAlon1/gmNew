package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mbq implements mbd {
    private final int a;
    private final int b;

    public mbq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static float d(int i, int i2, int i3, int i4) {
        lti.a(i > 0);
        lti.a(i2 > 0);
        return i2 * i3 <= i4 * i ? i3 / i : i4 / i2;
    }

    @Override // defpackage.mbd
    public final mbj b(Context context, boolean z) {
        return new mcv(context, z, new mbp(this.a, this.b));
    }

    @Override // defpackage.mbd
    public final boolean c(int i, int i2) {
        return Math.abs(d(i, i2, this.a, this.b) + (-1.0f)) < 0.01f;
    }

    @Override // defpackage.lpx
    public final /* synthetic */ void a() {
    }
}

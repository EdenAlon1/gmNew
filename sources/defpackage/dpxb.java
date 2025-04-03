package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpxb extends OrientationEventListener {
    final /* synthetic */ dpxc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpxb(dpxc dpxcVar, Context context) {
        super(context, 3);
        this.a = dpxcVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        if (i == -1) {
            return;
        }
        int i2 = (i - ((dpxa) this.a.a.c()).e) % 360;
        int i3 = i2 + (((((-i2) | i2) & (i2 ^ 360)) >> 31) & 360);
        if (Math.min(i3, 360 - i3) >= 70) {
            this.a.a.f((i < 45 || i >= 136) ? (i < 135 || i >= 226) ? (i < 225 || i >= 316) ? dpxa.a : dpxa.d : dpxa.c : dpxa.b);
        }
    }
}

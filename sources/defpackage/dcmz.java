package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcmz extends OrientationEventListener {
    final /* synthetic */ dcnd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcmz(dcnd dcndVar, Context context) {
        super(context);
        this.a = dcndVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        if (i == -1) {
            return;
        }
        this.a.h(i);
    }
}

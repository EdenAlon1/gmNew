package defpackage;

import android.content.Context;
import android.hardware.Camera;
import android.view.OrientationEventListener;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcoy extends OrientationEventListener {
    final /* synthetic */ dcoz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcoy(dcoz dcozVar, Context context) {
        super(context, 3);
        this.a = dcozVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        if (i == -1) {
            return;
        }
        int round = (int) Math.round(i / 90.0d);
        dcoz dcozVar = this.a;
        final int i2 = (360 - (round * 90)) % 360;
        if (dcozVar.p && i2 == dcozVar.n && dcozVar.o == dcozVar.a()) {
            return;
        }
        this.a.f(new Consumer() { // from class: dcox
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                dcoy.this.a.u((Camera) obj, i2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}

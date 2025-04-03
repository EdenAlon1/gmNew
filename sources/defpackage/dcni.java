package defpackage;

import android.hardware.Camera;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class dcni implements Consumer {
    public final /* synthetic */ dcoz a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a.r((Camera) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}

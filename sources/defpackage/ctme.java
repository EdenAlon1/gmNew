package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ctme implements Consumer {
    public final /* synthetic */ emjl a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a.b((emjk) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}

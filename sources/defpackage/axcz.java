package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class axcz implements Consumer {
    public final /* synthetic */ axdf a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a.q((epgf) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}

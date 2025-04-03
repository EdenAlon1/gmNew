package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class cgrn implements Consumer {
    public final /* synthetic */ SettableFuture a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a.set((ceyt) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}

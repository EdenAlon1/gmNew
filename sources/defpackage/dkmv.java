package defpackage;

import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkmv {
    private final dkrx a;
    private final ConcurrentHashMap b = new ConcurrentHashMap();

    public dkmv(dkrx dkrxVar) {
        this.a = dkrxVar;
    }

    public final long a() {
        if (djak.x() && this.a.x()) {
            dkty.k("Session ID counter has been reset.", new Object[0]);
            Collection.EL.stream(this.b.entrySet()).map(new Function() { // from class: dkms
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (dkmu) ((Map.Entry) obj).getValue();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).forEach(new Consumer() { // from class: dkmt
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((dkmu) obj).a();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        long c = this.a.c();
        dkty.c("session ID %d is generated.", Long.valueOf(c));
        return c;
    }

    public final void b(String str, dkmu dkmuVar) {
        this.b.put(str, dkmuVar);
    }
}

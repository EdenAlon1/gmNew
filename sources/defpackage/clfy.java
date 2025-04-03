package defpackage;

import java.util.EnumSet;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clfy {
    public static final entd a = entd.c("Bugle");
    public final ffbr b;
    private final errm c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;

    public clfy(errm errmVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.c = errmVar;
        this.b = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
    }

    public final elfl a(clfx clfxVar) {
        int ordinal = clfxVar.ordinal();
        long longValue = ordinal != 0 ? ordinal != 1 ? 0L : ((Long) this.f.b()).longValue() : ((Long) this.e.b()).longValue();
        if (longValue == 0) {
            return elfo.e(null);
        }
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/rcs/messaging/LatencyInjector", "delayFuture", 58, "LatencyInjector.java")).C("Reverse sonic type: %s, duration: %d ms", clfxVar, longValue);
        elfl g = elfl.g(this.c.schedule(new Callable() { // from class: clfv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ((ensz) clfy.a.n().h("com/google/android/apps/messaging/shared/rcs/messaging/LatencyInjector", "delayFuture", 63, "LatencyInjector.java")).q("Reverse sonic complete");
                return null;
            }
        }, longValue, TimeUnit.MILLISECONDS));
        ((cetc) this.d.b()).d(EnumSet.allOf(cetb.class), g, new Supplier() { // from class: clfw
            @Override // java.util.function.Supplier
            public final Object get() {
                return ((cins) clfy.this.b.b()).b();
            }
        });
        return g;
    }
}

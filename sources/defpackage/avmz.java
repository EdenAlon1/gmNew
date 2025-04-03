package defpackage;

import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class avmz {
    public static final /* synthetic */ int b = 0;

    static {
        cfvl.f(cfvl.b, "tachygram_rcs_capability_validity_expiry", 86400000L);
        cfvl.f(cfvl.b, "tachygram_non_rcs_capability_validity_expiry", 600000L);
    }

    public static avmz d() {
        return e(Instant.EPOCH);
    }

    public static avmz e(Instant instant) {
        avml avmlVar = new avml();
        avmlVar.c(avoi.a);
        avmlVar.b(instant);
        return avmlVar.a();
    }

    public abstract avoi a();

    public abstract Instant b();

    public boolean c() {
        throw null;
    }

    public final String toString() {
        return String.format("RcsCapabilitiesWithMetadata {timestamp: %s, capabilities: %s}", b(), (String) Collection.EL.stream(a().b).map(new Function() { // from class: avmx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                avok avokVar = (avok) obj;
                int i = avmz.b;
                return avokVar.c + "=" + avokVar.d;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(";")));
    }
}

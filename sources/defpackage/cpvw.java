package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpvw {
    public static final /* synthetic */ int b = 0;
    private final cqoh e;
    private final comc f;
    private static final cskc c = cskc.g("Bugle", "ReverseTelephonySync");
    static final cfup a = cfvl.e(cfvl.b, "reverse_telephony_sync__max_number_of_attempts", 2);
    private static final cfup d = cfvl.f(cfvl.b, "reverse_telephony_sync__max_number_of_attempts_time_window_millis", 86400000);

    public cpvw(ffbr ffbrVar, cqoh cqohVar) {
        this.e = cqohVar;
        comy comyVar = (comy) ffbrVar.b();
        comu c2 = comv.c();
        c2.d(comb.REVERSE_TELEPHONY_SYNC_STATE);
        c2.f(cpvu.a);
        this.f = comyVar.a(c2.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean a() {
        try {
            cpvu cpvuVar = (cpvu) this.f.l();
            crni crniVar = new crni(((Integer) a.e()).intValue(), Duration.ofMillis(((Long) d.e()).longValue()));
            Stream map = Collection.EL.stream(cpvuVar.d).map(new Function() { // from class: cpvv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = cpvw.b;
                    return Instant.ofEpochMilli(eykm.b((eyja) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = engw.d;
            engw engwVar = (engw) map.collect(endq.a);
            Instant f = this.e.f();
            if (crniVar.a != -1) {
                Instant minus = f.minus(crniVar.b);
                int size = engwVar.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    if (((Instant) engwVar.get(i3)).isAfter(minus)) {
                        i2++;
                    }
                }
                if (i2 >= crniVar.a) {
                    return true;
                }
            }
        } catch (eygu e) {
            c.s("Unable to get state from data store", e);
        }
        return false;
    }
}

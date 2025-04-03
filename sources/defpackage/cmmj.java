package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.DesugarCollections;
import j$.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmmj implements cmnu {
    public static final cfup a = cfvl.e(cfvl.b, "exponential_backoff_max_seconds", 86400);
    public static final cfup b = cfvl.e(cfvl.b, "provisioning_exponential_backoff_delay", 60);
    public final ffbr c;
    public final errl d;

    public cmmj(ffbr ffbrVar, errl errlVar) {
        this.c = ffbrVar;
        this.d = errlVar;
    }

    @Override // defpackage.cmnu
    public final int a(String str) {
        try {
            return ((Integer) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((cmbx) ((cmel) this.c.b()).d.l()).j), str, 0)).intValue();
        } catch (eygu e) {
            csjy.n("Bugle", "Exception when getting retry count: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    @Override // defpackage.cmnu
    public final elfl b(String str) {
        return ((cmel) this.c.b()).i(str, 0);
    }

    @Override // defpackage.cmnu
    public final elfl c(final String str) {
        return ((cmel) this.c.b()).e().h(new emwl() { // from class: cmdr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = cmel.a;
                return (Integer) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((cmbx) obj).j), str, 0);
            }
        }, erpp.a).i(new eroh() { // from class: cmmi
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Integer num = (Integer) obj;
                cmmj cmmjVar = cmmj.this;
                return ((cmel) cmmjVar.c.b()).i(str, num.intValue() + 1).h(new emwl() { // from class: cmmh
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cfup cfupVar = cmmj.a;
                        int intValue = num.intValue();
                        long millis = TimeUnit.SECONDS.toMillis(((Integer) cmmj.b.e()).intValue());
                        long millis2 = TimeUnit.SECONDS.toMillis(((Integer) cmmj.a.e()).intValue());
                        if (Long.numberOfLeadingZeros(millis) - Long.numberOfLeadingZeros(millis2) > intValue) {
                            millis2 = millis << intValue;
                        }
                        return Duration.ofMillis(millis2);
                    }
                }, cmmjVar.d);
            }
        }, this.d);
    }
}

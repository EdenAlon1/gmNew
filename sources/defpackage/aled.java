package defpackage;

import j$.time.Duration;
import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aled extends alhh {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/analytics/compose/navigation/ComposeNavigationEventLogger");
    public final cfyt b;
    private final ffsk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aled(ffsk ffskVar, cfyt cfytVar, ffbr ffbrVar, alcs alcsVar, Executor executor) {
        super(ffbrVar, alcsVar, executor);
        ffskVar.getClass();
        cfytVar.getClass();
        ffbrVar.getClass();
        executor.getClass();
        this.c = ffskVar;
        this.b = cfytVar;
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aldx
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eoji eojiVar = (eoji) obj;
                eptp eptpVar = (eptp) obj2;
                eojiVar.getClass();
                eptpVar.getClass();
                eojiVar.copyOnWrite();
                eojj eojjVar = (eojj) eojiVar.instance;
                eojj eojjVar2 = eojj.a;
                eojjVar.c = eptpVar;
                eojjVar.b = 1;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final Integer b(Duration duration) {
        long millis = duration.toMillis();
        if (millis <= 0) {
            return null;
        }
        if (millis <= 2147483647L) {
            return Integer.valueOf((int) millis);
        }
        axol.k(this.c, null, new alec(this, millis, null), 3);
        return null;
    }

    public final void c(epts eptsVar, eptu eptuVar, eptk eptkVar, Integer num, Duration duration, Long l) {
        eptsVar.getClass();
        eptuVar.getClass();
        eptkVar.getClass();
        axol.k(this.c, null, new aldz(this, eptsVar, eptkVar, num, duration, l, eptuVar, null), 3);
    }

    public final void d(epts eptsVar, eptu eptuVar, eptm eptmVar, epto eptoVar, Integer num, Duration duration, Long l) {
        eptsVar.getClass();
        eptuVar.getClass();
        eptmVar.getClass();
        eptoVar.getClass();
        axol.k(this.c, null, new aleb(this, eptsVar, eptmVar, num, duration, l, eptoVar, eptuVar, null), 3);
    }
}

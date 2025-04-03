package defpackage;

import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akpq implements alhi {
    public static eqga d(ScheduledSendTable.BindData bindData) {
        Instant truncatedTo = bindData.k().truncatedTo(ChronoUnit.HOURS);
        Instant truncatedTo2 = bindData.l().truncatedTo(ChronoUnit.HOURS);
        eqfz eqfzVar = (eqfz) eqga.a.createBuilder();
        long e = e(truncatedTo);
        eqfzVar.copyOnWrite();
        eqga eqgaVar = (eqga) eqfzVar.instance;
        eqgaVar.b |= 1;
        eqgaVar.c = e;
        long e2 = e(truncatedTo2);
        eqfzVar.copyOnWrite();
        eqga eqgaVar2 = (eqga) eqfzVar.instance;
        eqgaVar2.b |= 2;
        eqgaVar2.d = e2;
        long millis = Duration.between(truncatedTo, truncatedTo2).toMillis();
        eqfzVar.copyOnWrite();
        eqga eqgaVar3 = (eqga) eqfzVar.instance;
        eqgaVar3.b |= 4;
        eqgaVar3.e = millis;
        return (eqga) eqfzVar.build();
    }

    private static long e(Instant instant) {
        return Duration.ofHours(instant.atZone(ZoneId.systemDefault()).getHour()).toMillis();
    }

    @Override // defpackage.alhi
    public final eolt a() {
        return eolt.SCHEDULED_SEND_EVENT;
    }

    @Override // defpackage.alhi
    public final BiConsumer b() {
        return new BiConsumer() { // from class: akpo
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eolu eoluVar = (eolu) obj;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                eqgg eqggVar = (eqgg) ((eqgf) obj2).build();
                eolv eolvVar2 = eolv.a;
                eqggVar.getClass();
                eolvVar.aK = eqggVar;
                eolvVar.e |= 128;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.alhi
    public final Supplier c() {
        return new Supplier() { // from class: akpp
            @Override // java.util.function.Supplier
            public final Object get() {
                return (eqgf) eqgg.a.createBuilder();
            }
        };
    }
}

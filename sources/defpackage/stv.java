package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class stv implements Function {
    final /* synthetic */ brbm a;
    final /* synthetic */ Instant b;
    final /* synthetic */ Instant c;

    public stv(brbm brbmVar, Instant instant, Instant instant2) {
        this.a = brbmVar;
        this.b = instant;
        this.c = instant2;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        bsol bsolVar = (bsol) obj;
        bsolVar.t(this.a.f());
        final long epochMilli = this.b.toEpochMilli();
        final long epochMilli2 = this.c.toEpochMilli();
        buxo d = MessagesTable.d();
        d.z("conversationsWithIsAtLeastOneOutgoingMessageInTimeframeQuery");
        d.f(new Function() { // from class: stn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((buum) obj2).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.h(new Function() { // from class: sto
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                buxz buxzVar = (buxz) obj2;
                buxzVar.ak(1, 25);
                buxzVar.aq(new dtzc("messages.sent_timestamp", String.valueOf(epochMilli), String.valueOf(epochMilli2)));
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsolVar.s(d.b());
        return bsolVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}

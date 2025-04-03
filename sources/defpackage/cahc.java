package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cahc extends ceut {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    private final ffbr d;

    public cahc(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.d = ffbrVar3;
        this.c = ffbrVar4;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("UndeliveredMessageFallbackHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cahe.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final cahe caheVar = (cahe) eyhsVar;
        int i = engw.d;
        engr engrVar = new engr();
        engrVar.j(bdjs.b);
        engrVar.j(bdjs.a);
        final engw g = engrVar.g();
        return elfo.g(new Callable() { // from class: cahb
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ConversationIdType b = bdgq.b(caheVar.b);
                cahc cahcVar = cahc.this;
                engw d = ((bzqb) cahcVar.a.b()).d(b, g);
                amdh amdhVar = (amdh) cahcVar.c.b();
                Stream map = Collection.EL.stream(d).map(new Function() { // from class: caha
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((MessagesTable.BindData) obj).D();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i2 = engw.d;
                Iterable iterable = (Iterable) map.collect(endq.a);
                amep e = ameq.e();
                e.c(21);
                e.b(epdh.MESSAGE_TO_NON_ENCRYPTED_RECIPIENT);
                int b2 = amdhVar.b(iterable, e.a());
                enou enouVar = (enou) d;
                if (enouVar.c != b2) {
                    csjb e2 = cahc.D.e();
                    e2.y("messagesSize", enouVar.c);
                    e2.y("updateCount", b2);
                    e2.I("messages which failed to reach recipient who lost e2ee may already have been manually deleted");
                    e2.r();
                }
                int i3 = enouVar.c;
                for (int i4 = 0; i4 < i3; i4++) {
                    ((bzzi) cahcVar.b.b()).f(((MessagesTable.BindData) d.get(i4)).G(), bdhg.a, 4, 27, 44);
                }
                return ceyt.i();
            }
        }, (Executor) this.d.b());
    }
}

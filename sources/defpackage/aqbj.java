package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqbj extends dtrs {
    public static final /* synthetic */ int b = 0;
    public final ffji a;
    private final dtuu c;

    public aqbj(dtuu dtuuVar, ffji ffjiVar) {
        this.c = dtuuVar;
        this.a = ffjiVar;
    }

    private static final void f(buxo buxoVar, final dtzj dtzjVar, aqbi aqbiVar) {
        buxoVar.e(new Function() { // from class: aqbc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buum buumVar = (buum) obj;
                int i = aqbj.b;
                return new buun[]{buumVar.a, buumVar.b, buumVar.i};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxoVar.h(new Function() { // from class: aqbd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                int i = aqbj.b;
                buxzVar.B(false);
                buxzVar.t(dtzj.this);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dtsu o = buxoVar.b().o();
        try {
            buuo buuoVar = (buuo) o;
            while (buuoVar.moveToNext()) {
                Set set = aqbiVar.a;
                CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(buuoVar.q(), -1L);
                BugleConversationId bugleConversationId = new BugleConversationId(buuoVar.p());
                Instant ofEpochMilli = Instant.ofEpochMilli(buuoVar.l());
                ofEpochMilli.getClass();
                set.add(new aqab(coreBugleMessageId, bugleConversationId, ofEpochMilli));
            }
            ffig.a(o, null);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtrs
    public final /* synthetic */ Object d(dtyq dtyqVar, dtuk dtukVar) {
        aqbi aqbiVar = new aqbi(null);
        duaj d = dtukVar.d();
        if (d != null) {
            String[] strArr = bufy.a;
            bufs bufsVar = new bufs(bufy.a);
            bufsVar.d(new Function() { // from class: aqbe
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = aqbj.b;
                    return ((bufe) obj).b;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            enqv it = d.e.iterator();
            while (it.hasNext()) {
                duap duapVar = (duap) it.next();
                duapVar.getClass();
                bufsVar.k((bufw) duapVar);
            }
            bufr b2 = bufsVar.b();
            buxo d2 = MessagesTable.d();
            d2.z("RepliesChangeQueryListener#preChangeInTransaction-messages1");
            f(d2, b2, aqbiVar);
        }
        duap e = dtukVar.e();
        if (e != null) {
            String[] strArr2 = bufy.a;
            bufs bufsVar2 = new bufs(bufy.a);
            bufsVar2.d(new Function() { // from class: aqbf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = aqbj.b;
                    return ((bufe) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bufsVar2.k((bufw) e);
            bufr b3 = bufsVar2.b();
            buxo d3 = MessagesTable.d();
            d3.z("RepliesChangeQueryListener#preChangeInTransaction-messages2");
            f(d3, b3, aqbiVar);
        }
        return aqbiVar;
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void e(dtyq dtyqVar, dtuk dtukVar, Object obj) {
        obj.getClass();
        aqbi aqbiVar = (aqbi) obj;
        dtro b2 = dtukVar.b();
        if (b2 != null) {
            buxo d = MessagesTable.d();
            d.z("RepliesChangeQueryListener#onChangeInTransaction-messages1");
            f(d, new dtzq("($V)", new Object[]{((bueo) b2).l().b()}), aqbiVar);
        }
        if (aqbiVar.a.isEmpty()) {
            return;
        }
        Set set = aqbiVar.a;
        dtuu dtuuVar = this.c;
        final engw a = engq.a(set);
        dtuuVar.g(new dtut() { // from class: aqbg
            @Override // defpackage.dtut
            public final ekzz a() {
                int i = aqbj.b;
                return eleg.f("RCQL::onChangeInTransaction::runAfterCommit");
            }
        }, String.valueOf(a.hashCode()), new Runnable() { // from class: aqbh
            @Override // java.lang.Runnable
            public final void run() {
                aqbj.this.a.invoke(a);
            }
        });
    }
}

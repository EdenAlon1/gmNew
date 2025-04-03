package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apyt extends dtrs {
    public static final /* synthetic */ int b = 0;
    public final ffji a;
    private final dtuu c;
    private final Set d = new LinkedHashSet();

    public apyt(dtuu dtuuVar, ffji ffjiVar) {
        this.c = dtuuVar;
        this.a = ffjiVar;
    }

    private final void f(buxo buxoVar, final dtzj dtzjVar) {
        buxoVar.e(new Function() { // from class: apyp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buum buumVar = (buum) obj;
                int i = apyt.b;
                return new buun[]{buumVar.a, buumVar.b, buumVar.i};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxoVar.h(new Function() { // from class: apyq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                int i = apyt.b;
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
                Set set = this.d;
                CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(buuoVar.q(), -1L);
                BugleConversationId bugleConversationId = new BugleConversationId(buuoVar.p());
                Instant ofEpochMilli = Instant.ofEpochMilli(buuoVar.l());
                ofEpochMilli.getClass();
                set.add(new apyi(coreBugleMessageId, bugleConversationId, ofEpochMilli));
            }
            ffig.a(o, null);
        } finally {
        }
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
        dtro b2 = dtukVar.b();
        if (b2 != null) {
            buxo d = MessagesTable.d();
            d.z("ReactionsChangeQueryListener#onChangeInTransaction-messages1");
            f(d, new dtzq("($V)", new Object[]{((buco) b2).k().b()}));
        }
        if (this.d.isEmpty()) {
            return;
        }
        Set set = this.d;
        dtuu dtuuVar = this.c;
        final engw a = engq.a(set);
        dtuuVar.g(new dtut() { // from class: apyn
            @Override // defpackage.dtut
            public final ekzz a() {
                int i = apyt.b;
                return eleg.f("RCQL::onChangeInTransaction::runAfterCommit");
            }
        }, String.valueOf(a.hashCode()), new Runnable() { // from class: apyo
            @Override // java.lang.Runnable
            public final void run() {
                apyt.this.a.invoke(a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtrs
    public final /* synthetic */ void c(dtyq dtyqVar, dtuk dtukVar) {
        this.d.clear();
        duaj d = dtukVar.d();
        if (d != null) {
            bueb a = bueg.a();
            a.e(new Function() { // from class: apyr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = apyt.b;
                    return ((budk) obj).b;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            enqv it = d.e.iterator();
            while (it.hasNext()) {
                duap duapVar = (duap) it.next();
                duapVar.getClass();
                a.k((buee) duapVar);
            }
            buea b2 = a.b();
            buxo d2 = MessagesTable.d();
            d2.z("ReactionsChangeQueryListener#preChangeInTransaction-messages1");
            f(d2, b2);
        }
        duap e = dtukVar.e();
        if (e != null) {
            bueb a2 = bueg.a();
            a2.e(new Function() { // from class: apys
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = apyt.b;
                    return ((budk) obj).b;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            a2.k((buee) e);
            buea b3 = a2.b();
            buxo d3 = MessagesTable.d();
            d3.z("ReactionsChangeQueryListener#preChangeInTransaction-messages2");
            f(d3, b3);
        }
    }
}

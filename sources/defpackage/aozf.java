package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aozf extends dtrs {
    public static final /* synthetic */ int b = 0;
    public final Consumer a;
    private final dtuu c;
    private final List d = new ArrayList();

    public aozf(dtuu dtuuVar, Consumer consumer) {
        this.c = dtuuVar;
        this.a = consumer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void f(duaj duajVar, List list) {
        buxo d = MessagesTable.d();
        d.z("MessageChangeQueryListener#preChangeInTransaction-messages1");
        d.e(new Function() { // from class: aoyz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buum buumVar = (buum) obj;
                int i = aozf.b;
                return new buun[]{buumVar.a, buumVar.b, buumVar.G, buumVar.i};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        enqv it = duajVar.e.iterator();
        while (it.hasNext()) {
            d.k((buxs) ((duap) it.next()));
        }
        buxq buxqVar = (buxq) duajVar;
        int i = 0;
        if (((Boolean) aoyx.e.e()).booleanValue() && buxqVar.n("message_status")) {
            i = buxqVar.a();
        }
        int i2 = i;
        buuo buuoVar = (buuo) d.b().o();
        while (buuoVar.moveToNext()) {
            try {
                buxq buxqVar2 = (buxq) duajVar;
                if (!(buxqVar2.n("is_hidden") ? buxqVar2.a.getAsBoolean("is_hidden").booleanValue() : buuoVar.K())) {
                    list.add(new apsl(alxd.UPDATE, new CoreBugleMessageId(buuoVar.q(), -1L), new BugleConversationId(buuoVar.p()), Instant.ofEpochMilli(buuoVar.l()), i2));
                }
            } finally {
            }
        }
        buuoVar.close();
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
        MessagesTable.BindData bindData = (MessagesTable.BindData) dtukVar.b();
        if (bindData != null && !bindData.ad() && (!((Boolean) aoyx.c.e()).booleanValue() || bindData.s() != 4)) {
            List list = this.d;
            alxd alxdVar = alxd.INSERT;
            CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(bindData.D(), -1L);
            ConversationIdType C = bindData.C();
            C.getClass();
            list.add(new apsl(alxdVar, coreBugleMessageId, new BugleConversationId(C), Instant.ofEpochMilli(bindData.w()), 0));
        }
        MessagesTable.BindData[] bindDataArr = (MessagesTable.BindData[]) dtukVar.a();
        if (bindDataArr != null) {
            for (MessagesTable.BindData bindData2 : bindDataArr) {
                if (!bindData2.ad() && !bindData2.D().c()) {
                    List list2 = this.d;
                    alxd alxdVar2 = alxd.INSERT;
                    CoreBugleMessageId coreBugleMessageId2 = new CoreBugleMessageId(bindData2.D(), -1L);
                    ConversationIdType C2 = bindData2.C();
                    C2.getClass();
                    list2.add(new apsl(alxdVar2, coreBugleMessageId2, new BugleConversationId(C2), Instant.ofEpochMilli(bindData2.w()), 0));
                }
            }
        }
        duaj d = dtukVar.d();
        if (d != null) {
            ArrayList arrayList = new ArrayList();
            f(d, arrayList);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                final alyc alycVar = (alyc) arrayList.get(i);
                if (Collection.EL.stream(this.d).anyMatch(new Predicate() { // from class: aoza
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo439negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        alyc alycVar2 = (alyc) obj;
                        int i2 = aozf.b;
                        MessageId b2 = alycVar2.b();
                        alyc alycVar3 = alyc.this;
                        return b2.equals(alycVar3.b()) && !alycVar2.c().equals(alycVar3.c());
                    }
                })) {
                    this.d.add(alycVar);
                }
            }
        }
        if (this.d.isEmpty()) {
            return;
        }
        List list3 = this.d;
        dtuu dtuuVar = this.c;
        final engw n = engw.n(list3);
        dtuuVar.g(new dtut() { // from class: aozb
            @Override // defpackage.dtut
            public final ekzz a() {
                int i2 = aozf.b;
                return eleg.f("MCQL::onChangeInTransaction::runAfterCommit");
            }
        }, String.valueOf(n.hashCode()), new Runnable() { // from class: aozc
            @Override // java.lang.Runnable
            public final void run() {
                aozf.this.a.o(n);
            }
        });
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void c(dtyq dtyqVar, dtuk dtukVar) {
        this.d.clear();
        duaj d = dtukVar.d();
        if (d != null) {
            f(d, this.d);
        }
        duap e = dtukVar.e();
        if (e != null) {
            buxo d2 = MessagesTable.d();
            d2.z("+MessageChangeQueryListener#preChangeInTransaction-messages2");
            d2.e(new Function() { // from class: aozd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    int i = aozf.b;
                    return new buun[]{buumVar.a, buumVar.b, buumVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d2.k((buxs) e);
            d2.h(new Function() { // from class: aoze
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    int i = aozf.b;
                    buxzVar.B(false);
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d2.r();
            buuo buuoVar = (buuo) d2.b().o();
            while (buuoVar.moveToNext()) {
                try {
                    this.d.add(new apsl(alxd.DELETE, new CoreBugleMessageId(buuoVar.q(), -1L), new BugleConversationId(buuoVar.p()), Instant.ofEpochMilli(buuoVar.l()), 0));
                } finally {
                }
            }
            buuoVar.close();
        }
    }
}

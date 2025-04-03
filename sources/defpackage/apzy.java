package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apzy extends dtrs {
    public static final /* synthetic */ int c = 0;
    public final ffji a;
    public final List b = new ArrayList();
    private final dtuu d;

    public apzy(dtuu dtuuVar, ffji ffjiVar) {
        this.d = dtuuVar;
        this.a = ffjiVar;
    }

    private static final List f(alxd alxdVar, buuo buuoVar) {
        ArrayList arrayList = new ArrayList();
        while (buuoVar.moveToNext()) {
            MessagesTable.BindData bindData = (MessagesTable.BindData) buuoVar.cO();
            CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(bindData.D(), -1L);
            ConversationIdType C = bindData.C();
            if (C == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add(new apsl(alxdVar, coreBugleMessageId, new BugleConversationId(C), Instant.ofEpochMilli(bindData.w()), 0));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtrs
    public final /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
        Collection f;
        Iterable arrayList;
        Iterable f2;
        final bwuo bwuoVar = (bwuo) dtukVar.b();
        if (bwuoVar == null) {
            f = new ArrayList();
        } else if (bwuoVar.q().isEmpty() && bwuoVar.l() == 0) {
            f = new ArrayList();
        } else {
            buxo d = MessagesTable.d();
            d.z("ReadReportChangeQueryListener#onChangeInTransaction#insert");
            d.e(new Function() { // from class: apzw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    int i = apzy.c;
                    return new buun[]{buumVar.a, buumVar.b, buumVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.h(new Function() { // from class: apzx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    int i = apzy.c;
                    buxzVar.q(bwuo.this.n());
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            f = f(alxd.INSERT, (buuo) d.b().o());
        }
        dtro[] a = dtukVar.a();
        if (a != null) {
            final ArrayList arrayList2 = new ArrayList();
            for (dtro dtroVar : a) {
                if (dtroVar instanceof bwuo) {
                    arrayList2.add(dtroVar);
                }
            }
            buxo d2 = MessagesTable.d();
            d2.z("ReadReportChangeQueryListener#onChangeInTransaction#bulkInsert");
            d2.e(new Function() { // from class: apzq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    int i = apzy.c;
                    return new buun[]{buumVar.a, buumVar.b, buumVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d2.h(new Function() { // from class: apzr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    int i = apzy.c;
                    List list = arrayList2;
                    ArrayList arrayList3 = new ArrayList(ffdx.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((bwuo) it.next()).n());
                    }
                    buxzVar.u(ffdx.ar(arrayList3));
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            arrayList = f(alxd.INSERT, (buuo) d2.b().o());
        } else {
            arrayList = new ArrayList();
        }
        List ad = ffdx.ad(f, arrayList);
        bwvu bwvuVar = (bwvu) dtukVar.d();
        if (bwvuVar == null) {
            f2 = new ArrayList();
        } else if (bwvuVar.n("read_time") || bwvuVar.n("ftd_time")) {
            bwvt b = bwvy.b();
            b.z("ReadReportChangeQueryListener#onChangeInTransaction#update");
            b.c(new Function() { // from class: apzu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = apzy.c;
                    return new bwvh[]{((bwvg) obj).b};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            enqv it = bwvuVar.e.iterator();
            while (it.hasNext()) {
                duap duapVar = (duap) it.next();
                duapVar.getClass();
                b.k((bwvw) duapVar);
            }
            buxo d3 = MessagesTable.d();
            d3.z("ReadReportChangeQueryListener#onChangeInTransaction#update2");
            d3.e(new Function() { // from class: apzv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    int i = apzy.c;
                    return new buun[]{buumVar.a, buumVar.b, buumVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d3.F(dtvz.i(b.b(), bwvy.c.b, MessagesTable.c.a));
            f2 = f(alxd.UPDATE, (buuo) d3.b().o());
        } else {
            f2 = new ArrayList();
        }
        ffdx.w(this.b, ffdx.ad(ad, f2));
        if (this.b.isEmpty()) {
            return;
        }
        this.d.g(new dtut() { // from class: apzo
            @Override // defpackage.dtut
            public final ekzz a() {
                int i = apzy.c;
                return eleg.f("ReadReportChangeQueryListener::onChangeInTransaction::runAfterCommit");
            }
        }, String.valueOf(this.b.hashCode()), new Runnable() { // from class: apzp
            @Override // java.lang.Runnable
            public final void run() {
                apzy apzyVar = apzy.this;
                apzyVar.a.invoke(engq.a(apzyVar.b));
            }
        });
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void c(dtyq dtyqVar, dtuk dtukVar) {
        Iterable f;
        this.b.clear();
        duap e = dtukVar.e();
        if (e == null) {
            f = new ArrayList();
        } else {
            bwvt b = bwvy.b();
            b.z("ReadReportChangeQueryListener#onChangeInTransaction#delete");
            b.c(new Function() { // from class: apzs
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = apzy.c;
                    return new bwvh[]{((bwvg) obj).b};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            b.k((bwvw) e);
            buxo d = MessagesTable.d();
            d.z("ReadReportChangeQueryListener#onChangeInTransaction#delete2");
            d.e(new Function() { // from class: apzt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    int i = apzy.c;
                    return new buun[]{buumVar.a, buumVar.b, buumVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.F(dtvz.i(b.b(), bwvy.c.b, MessagesTable.c.a));
            f = f(alxd.DELETE, (buuo) d.b().o());
        }
        ffdx.w(this.b, f);
    }
}

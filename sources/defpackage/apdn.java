package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apdn extends dtrs {
    public static final /* synthetic */ int c = 0;
    public final ffji a;
    public final List b = new ArrayList();
    private final dtuu d;

    public apdn(dtuu dtuuVar, ffji ffjiVar) {
        this.d = dtuuVar;
        this.a = ffjiVar;
    }

    private static final List f(alxd alxdVar, buuo buuoVar) {
        ArrayList arrayList = new ArrayList();
        while (buuoVar.moveToNext()) {
            try {
                MessagesTable.BindData bindData = (MessagesTable.BindData) buuoVar.cO();
                CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(bindData.D(), -1L);
                ConversationIdType C = bindData.C();
                if (C == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                alxd alxdVar2 = alxdVar;
                arrayList.add(new apsl(alxdVar2, coreBugleMessageId, new BugleConversationId(C), Instant.ofEpochMilli(bindData.w()), 0));
                alxdVar = alxdVar2;
            } finally {
            }
        }
        ffig.a(buuoVar, null);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtrs
    public final /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
        Iterable f;
        Iterable arrayList;
        Iterable f2;
        final btrw btrwVar = (btrw) dtukVar.b();
        if (btrwVar == null) {
            f = new ArrayList();
        } else {
            buxo d = MessagesTable.d();
            d.z("MessageAnnotationChangeQueryListener#onChangeInTransaction#insert");
            d.e(new Function() { // from class: apdj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    int i = apdn.c;
                    return new buun[]{buumVar.a, buumVar.b, buumVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.h(new Function() { // from class: apdk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    int i = apdn.c;
                    buxzVar.q(btrw.this.m());
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            f = f(alxd.INSERT, (buuo) d.b().o());
        }
        ffdx.w(this.b, f);
        List list = this.b;
        dtro[] a = dtukVar.a();
        if (a != null) {
            final ArrayList arrayList2 = new ArrayList();
            for (dtro dtroVar : a) {
                if (dtroVar instanceof btrw) {
                    arrayList2.add(dtroVar);
                }
            }
            buxo d2 = MessagesTable.d();
            d2.z("MessageAnnotationChangeQueryListener#onChangeInTransaction#bulkInsert");
            d2.e(new Function() { // from class: apdd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    int i = apdn.c;
                    return new buun[]{buumVar.a, buumVar.b, buumVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d2.h(new Function() { // from class: apde
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    int i = apdn.c;
                    List list2 = arrayList2;
                    ArrayList arrayList3 = new ArrayList(ffdx.n(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((btrw) it.next()).m());
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
        ffdx.w(list, arrayList);
        List list2 = this.b;
        bttb bttbVar = (bttb) dtukVar.d();
        if (bttbVar == null) {
            f2 = new ArrayList();
        } else {
            btta b = bttf.b();
            b.z("MessageAnnotationChangeQueryListener#onChangeInTransaction#update");
            b.c(new Function() { // from class: apdh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    btsl btslVar = (btsl) obj;
                    int i = apdn.c;
                    return new btsm[]{btslVar.c, btslVar.d};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            enqv it = bttbVar.e.iterator();
            while (it.hasNext()) {
                duap duapVar = (duap) it.next();
                duapVar.getClass();
                b.k((bttd) duapVar);
            }
            buxo d3 = MessagesTable.d();
            d3.z("MessageAnnotationChangeQueryListener#onChangeInTransaction#update2");
            d3.e(new Function() { // from class: apdi
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    int i = apdn.c;
                    return new buun[]{buumVar.a, buumVar.b, buumVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            btsz b2 = b.b();
            btsm btsmVar = bttf.c.c;
            buun buunVar = MessagesTable.c.a;
            btte btteVar = new btte();
            btteVar.c();
            d3.F(b2.s(btsmVar, buunVar, new bttd(btteVar)));
            f2 = f(alxd.UPDATE, (buuo) d3.b().o());
        }
        ffdx.w(list2, f2);
        if (this.b.isEmpty()) {
            return;
        }
        this.d.g(new dtut() { // from class: apdl
            @Override // defpackage.dtut
            public final ekzz a() {
                int i = apdn.c;
                return eleg.f("MessageAnnotationChangeQueryListener::onChangeInTransaction::runAfterCommit");
            }
        }, String.valueOf(this.b.hashCode()), new Runnable() { // from class: apdm
            @Override // java.lang.Runnable
            public final void run() {
                apdn apdnVar = apdn.this;
                apdnVar.a.invoke(engq.a(apdnVar.b));
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
            btta b = bttf.b();
            b.z("MessageAnnotationChangeQueryListener#onChangeInTransaction#delete");
            b.c(new Function() { // from class: apdf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = apdn.c;
                    return new btsm[]{((btsl) obj).c};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            b.k((bttd) e);
            buxo d = MessagesTable.d();
            d.z("MessageAnnotationChangeQueryListener#onChangeInTransaction#delete2");
            d.e(new Function() { // from class: apdg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    int i = apdn.c;
                    return new buun[]{buumVar.a, buumVar.b, buumVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.F(dtvz.i(b.b(), bttf.c.c, MessagesTable.c.a));
            f = f(alxd.DELETE, (buuo) d.b().o());
        }
        ffdx.w(this.b, f);
    }
}

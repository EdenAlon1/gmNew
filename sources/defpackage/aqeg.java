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
public final class aqeg extends dtrs {
    public static final /* synthetic */ int c = 0;
    public final ffji a;
    public final List b = new ArrayList();
    private final dtuu d;

    public aqeg(dtuu dtuuVar, ffji ffjiVar) {
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
        final bvfs bvfsVar = (bvfs) dtukVar.b();
        if (bvfsVar == null) {
            f = new ArrayList();
        } else {
            buxo d = MessagesTable.d();
            d.z("SuggestionShortcutChangeQueryListener#onChangeInTransaction#insert");
            d.e(new Function() { // from class: aqec
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    int i = aqeg.c;
                    return new buun[]{buumVar.a, buumVar.b, buumVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.h(new Function() { // from class: aqed
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    int i = aqeg.c;
                    buxzVar.q(bvfs.this.k());
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
                if (dtroVar instanceof bvfs) {
                    arrayList2.add(dtroVar);
                }
            }
            buxo d2 = MessagesTable.d();
            d2.z("SuggestionShortcutChangeQueryListener#onChangeInTransaction#bulkInsert");
            d2.e(new Function() { // from class: aqdw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    int i = aqeg.c;
                    return new buun[]{buumVar.a, buumVar.b, buumVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d2.h(new Function() { // from class: aqdx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    int i = aqeg.c;
                    List list2 = arrayList2;
                    ArrayList arrayList3 = new ArrayList(ffdx.n(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((bvfs) it.next()).k());
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
        bvhe bvheVar = (bvhe) dtukVar.d();
        if (bvheVar == null) {
            f2 = new ArrayList();
        } else {
            bvhd a2 = bvhn.a();
            a2.z("SuggestionShortcutChangeQueryListener#onChangeInTransaction#update");
            a2.c(new Function() { // from class: aqea
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bvgn bvgnVar = (bvgn) obj;
                    int i = aqeg.c;
                    return new bvgo[]{bvgnVar.b, bvgnVar.e, bvgnVar.d, bvgnVar.g};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            enqv it = bvheVar.e.iterator();
            while (it.hasNext()) {
                duap duapVar = (duap) it.next();
                duapVar.getClass();
                a2.k((bvhg) duapVar);
            }
            buxo d3 = MessagesTable.d();
            d3.z("SuggestionShortcutChangeQueryListener#onChangeInTransaction#update2");
            d3.e(new Function() { // from class: aqeb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    int i = aqeg.c;
                    return new buun[]{buumVar.a, buumVar.b, buumVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d3.F(dtvz.i(a2.b(), bvhn.c.b, MessagesTable.c.a));
            f2 = f(alxd.UPDATE, (buuo) d3.b().o());
        }
        ffdx.w(list2, f2);
        if (this.b.isEmpty()) {
            return;
        }
        this.d.g(new dtut() { // from class: aqdy
            @Override // defpackage.dtut
            public final ekzz a() {
                int i = aqeg.c;
                return eleg.f("SuggestionShortcutChangeQueryListener::onChangeInTransaction::runAfterCommit");
            }
        }, String.valueOf(this.b.hashCode()), new Runnable() { // from class: aqdz
            @Override // java.lang.Runnable
            public final void run() {
                aqeg aqegVar = aqeg.this;
                aqegVar.a.invoke(engq.a(aqegVar.b));
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
            bvhd a = bvhn.a();
            a.z("SuggestionShortcutChangeQueryListener#onChangeInTransaction#delete");
            a.c(new Function() { // from class: aqee
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bvgn bvgnVar = (bvgn) obj;
                    int i = aqeg.c;
                    return new bvgo[]{bvgnVar.b, bvgnVar.e, bvgnVar.d, bvgnVar.g};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            a.k((bvhg) e);
            buxo d = MessagesTable.d();
            d.z("SuggestionShortcutChangeQueryListener#onChangeInTransaction#delete2");
            d.e(new Function() { // from class: aqef
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    int i = aqeg.c;
                    return new buun[]{buumVar.a, buumVar.b, buumVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.F(dtvz.i(a.b(), bvhn.c.b, MessagesTable.c.a));
            f = f(alxd.DELETE, (buuo) d.b().o());
        }
        ffdx.w(this.b, f);
    }
}

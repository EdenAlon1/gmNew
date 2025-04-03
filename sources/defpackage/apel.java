package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apel extends dtrs {
    public static final /* synthetic */ int c = 0;
    public final ffji a;
    public final List b = new ArrayList();
    private final dtuu d;

    public apel(dtuu dtuuVar, ffji ffjiVar) {
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
        final VmtTable.BindData bindData = (VmtTable.BindData) dtukVar.b();
        if (bindData == null) {
            f = new ArrayList();
        } else {
            buxo d = MessagesTable.d();
            d.z("VoiceTranscriptionChangeQueryListener#onChangeInTransaction#insert");
            d.e(new Function() { // from class: aped
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    int i = apel.c;
                    return new buun[]{buumVar.a, buumVar.b, buumVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bwdf c2 = PartsTable.c();
            c2.e(new Function() { // from class: apee
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bwat bwatVar = (bwat) obj;
                    int i = apel.c;
                    return new bwau[]{bwatVar.a, bwatVar.b};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            c2.h(new Function() { // from class: apef
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bwdm bwdmVar = (bwdm) obj;
                    int i = apel.c;
                    bwdmVar.j(VmtTable.BindData.this.m());
                    return bwdmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.G(dtvz.i(c2.b(), PartsTable.d.b, MessagesTable.c.a).g());
            f = f(alxd.INSERT, (buuo) d.b().o());
        }
        dtro[] a = dtukVar.a();
        if (a != null) {
            final ArrayList arrayList2 = new ArrayList();
            for (dtro dtroVar : a) {
                if (dtroVar instanceof VmtTable.BindData) {
                    arrayList2.add(dtroVar);
                }
            }
            buxo d2 = MessagesTable.d();
            d2.z("VoiceTranscriptionChangeQueryListener#onChangeInTransaction#bulkInsert");
            d2.e(new Function() { // from class: apeg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    int i = apel.c;
                    return new buun[]{buumVar.a, buumVar.b, buumVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bwdf c3 = PartsTable.c();
            c3.e(new Function() { // from class: apeh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bwat bwatVar = (bwat) obj;
                    int i = apel.c;
                    return new bwau[]{bwatVar.a, bwatVar.b};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            c3.h(new Function() { // from class: apei
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bwdm bwdmVar = (bwdm) obj;
                    int i = apel.c;
                    List list = arrayList2;
                    ArrayList arrayList3 = new ArrayList(ffdx.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((VmtTable.BindData) it.next()).m());
                    }
                    bwdmVar.k(ffdx.ar(arrayList3));
                    return bwdmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d2.G(dtvz.i(c3.b(), PartsTable.d.b, MessagesTable.c.a).g());
            arrayList = f(alxd.INSERT, (buuo) d2.b().o());
        } else {
            arrayList = new ArrayList();
        }
        List ad = ffdx.ad(f, arrayList);
        byyh byyhVar = (byyh) dtukVar.d();
        if (byyhVar == null) {
            f2 = new ArrayList();
        } else {
            String[] strArr = VmtTable.a;
            byyg byygVar = new byyg(VmtTable.a);
            byygVar.z("VoiceTranscriptionChangeQueryListener#onChangeInTransaction#update");
            enqv it = byyhVar.e.iterator();
            while (it.hasNext()) {
                duap duapVar = (duap) it.next();
                duapVar.getClass();
                byygVar.k((byyj) duapVar);
            }
            buxo d3 = MessagesTable.d();
            d3.z("PreviewMessageChangeQueryListener#onChangeInTransaction#update3");
            d3.e(new Function() { // from class: apea
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    int i = apel.c;
                    return new buun[]{buumVar.a, buumVar.b, buumVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bwdf c4 = PartsTable.c();
            c4.e(new Function() { // from class: apeb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bwat bwatVar = (bwat) obj;
                    int i = apel.c;
                    return new bwau[]{bwatVar.a, bwatVar.b};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            c4.G(dtvz.i(byygVar.b(), VmtTable.c.a, PartsTable.d.a).g());
            d3.G(dtvz.i(c4.b(), PartsTable.d.b, MessagesTable.c.a).g());
            f2 = f(alxd.UPDATE, (buuo) d3.b().o());
        }
        ffdx.w(this.b, ffdx.ad(ad, f2));
        if (this.b.isEmpty()) {
            return;
        }
        this.d.g(new dtut() { // from class: apdz
            @Override // defpackage.dtut
            public final ekzz a() {
                int i = apel.c;
                return eleg.f("VTCQL::onChangeInTransaction::runAfterCommit");
            }
        }, String.valueOf(this.b.hashCode()), new Runnable() { // from class: apec
            @Override // java.lang.Runnable
            public final void run() {
                apel apelVar = apel.this;
                apelVar.a.invoke(engq.a(apelVar.b));
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
            String[] strArr = VmtTable.a;
            byyg byygVar = new byyg(VmtTable.a);
            byygVar.z("VoiceTranscriptionChangeQueryListener#onChangeInTransaction#delete");
            byygVar.k((byyj) e);
            buxo d = MessagesTable.d();
            d.z("VoiceTranscriptionChangeQueryListener#onChangeInTransaction#delete2");
            d.e(new Function() { // from class: apej
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    int i = apel.c;
                    return new buun[]{buumVar.a, buumVar.b, buumVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bwdf c2 = PartsTable.c();
            c2.e(new Function() { // from class: apek
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bwat bwatVar = (bwat) obj;
                    int i = apel.c;
                    return new bwau[]{bwatVar.a, bwatVar.b};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            c2.G(dtvz.i(byygVar.b(), VmtTable.c.a, PartsTable.d.a).g());
            d.G(dtvz.i(c2.b(), PartsTable.d.b, MessagesTable.c.a).g());
            f = f(alxd.DELETE, (buuo) d.b().o());
        }
        ffdx.w(this.b, f);
    }
}

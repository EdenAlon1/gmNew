package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.DesugarArrays;
import j$.util.Map;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcna implements bcjz {
    public final ffbr a;
    public final Map b = new LinkedHashMap();
    private final ffsk c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final enru h;
    private final bckl i;
    private final bckl j;

    public bcna(ffsk ffskVar, ffbr ffbrVar, bckb bckbVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, bckh bckhVar) {
        this.c = ffskVar;
        this.a = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.g = ffbrVar5;
        new fgjf();
        this.h = enru.c("com/google/android/apps/messaging/shared/datamodel/backup/restore/messages/CombinedMessagesWriterWorkflowSteps");
        final boolean z = bckhVar.a;
        Map map = bcpa.a;
        this.i = new bckl(bcmi.a, bckbVar, new ffbr() { // from class: bcoz
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                Map map2 = bcpa.a;
                fffs fffsVar = new fffs((byte[]) null);
                bcax a = bcba.a();
                a.z("duplicateMessagePersistenceIdQuery");
                a.u();
                a.n(new dtzq("$V", new Object[]{bcba.c.a}), "backup_id");
                a.n(new dtzq("$V{J:bugle_messages}", new Object[]{MessagesTable.c.a}), "bugle_id");
                buxo d = MessagesTable.d();
                d.u();
                dtvy i = dtvz.i(d.b(), MessagesTable.c.ap, bcba.c.b);
                ((dtrd) i).e = "bugle_messages";
                fffsVar.add((bcax) a.j(i));
                bcax a2 = bcba.a();
                a2.z("duplicateCmsIdQuery");
                a2.u();
                a2.n(new dtzq("$V", new Object[]{bcba.c.a}), "backup_id");
                a2.n(new dtzq("$V{J:bugle_messages}", new Object[]{MessagesTable.c.a}), "bugle_id");
                fffsVar.add(bcol.d(a2, MessagesTable.c.M, bcba.c.A));
                bcax a3 = bcba.a();
                a3.z("duplicateRcsIdQuery");
                a3.u();
                a3.n(new dtzq("$V", new Object[]{bcba.c.a}), "backup_id");
                a3.n(new dtzq("$V{J:bugle_messages}", new Object[]{MessagesTable.c.a}), "bugle_id");
                fffsVar.add(bcol.d(a3, MessagesTable.c.C, bcba.c.y));
                bcax a4 = bcba.a();
                boolean z2 = z;
                a4.z("duplicateTombstone");
                a4.u();
                a4.n(new dtzq("$V", new Object[]{bcba.c.a}), "backup_id");
                a4.n(new dtzq("$V{J:bugle_messages}", new Object[]{MessagesTable.c.a}), "bugle_id");
                bcax c = bcol.c(a4, new ffji[0]);
                bcaz bcazVar = new bcaz();
                bbzh bbzhVar = bcba.c.d;
                bcazVar.as(new dtzq("($V >= 200) AND ($V = $V{J:bugle_messages})", new Object[]{bbzhVar, bbzhVar, MessagesTable.c.k}));
                c.d(bcazVar);
                fffsVar.add(c);
                if (z2) {
                    fffsVar.add(bcol.b(false));
                    fffsVar.add(bcol.a(false));
                    fffsVar.add(bcol.b(true));
                    fffsVar.add(bcol.a(true));
                }
                return ffdx.a(fffsVar);
            }
        }, bcpa.a, null, bcpa.b, 0, 80);
        final boolean z2 = bckhVar.b;
        Map map2 = bcpi.a;
        this.j = new bckl(bcmj.a, bcmr.a, new ffbr() { // from class: bcph
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                Map map3 = bcpi.a;
                fffs fffsVar = new fffs((byte[]) null);
                if (z2) {
                    dtzj dtzjVar = bcpe.a;
                    bcdp a = bcds.a();
                    a.z("duplicatePartsByPartOrderQuery");
                    a.u();
                    a.n(new dtzq("$V", new Object[]{bcds.c.a}), "backup_id");
                    a.n(new dtzq("$V{J:bugle_parts}", new Object[]{PartsTable.d.a}), "bugle_id");
                    String[] strArr = bqea.a;
                    bqdv bqdvVar = new bqdv(bqea.a);
                    bqdvVar.u();
                    bqdvVar.d(new Function() { // from class: bcpb
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bqdz bqdzVar = (bqdz) obj;
                            dtzj dtzjVar2 = bcpe.a;
                            bqdzVar.f(bckf.b.a);
                            bqdzVar.c(-1L);
                            return bqdzVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bwdf c = PartsTable.c();
                    c.u();
                    c.h(new Function() { // from class: bcpc
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bwdm bwdmVar = (bwdm) obj;
                            dtzj dtzjVar2 = bcpe.a;
                            bwdmVar.as(new dtzq("($V) = ($V)", new Object[]{bcpe.b, bcpe.a}));
                            bwdmVar.as(new dtzq("($V) = ($V)", new Object[]{bcpe.d, bcpe.c}));
                            bwdmVar.as(new dtzq("$V{J:bugle_parts} <> $V", new Object[]{PartsTable.d.e, "text/plain"}));
                            bwau bwauVar = PartsTable.d.d;
                            bwdmVar.as(new dtzq("($V{J:bugle_parts} IS NULL OR $V{J:bugle_parts} = \"\")", new Object[]{bwauVar, bwauVar}));
                            return bwdmVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bwdd b = c.b();
                    bwau bwauVar = PartsTable.d.b;
                    bqdi bqdiVar = bqea.c.d;
                    bwdm bwdmVar = new bwdm();
                    bwdmVar.as(new dtzq("$V = $V{J:bugle_parts}", new Object[]{bcds.c.c, PartsTable.d.e}));
                    dtvy s = b.s(bwauVar, bqdiVar, new bwdj(bwdmVar));
                    ((dtrd) s).e = "bugle_parts";
                    dtvy i = dtvz.i(((bqdv) bqdvVar.j(s)).b(), bqea.c.c, bcds.c.b);
                    ((dtrd) i).e = "message_id_map";
                    fffsVar.add((bcdp) a.j(i));
                }
                dtzj dtzjVar2 = bcpe.a;
                bcdp a2 = bcds.a();
                a2.z("parentMessageWasADuplicateQuery");
                a2.u();
                a2.n(new dtzq("$V", new Object[]{bcds.c.a}), "backup_id");
                a2.n(new dtzq("$V", new Object[]{-1}), "bugle_id");
                String[] strArr2 = bqea.a;
                bqdv bqdvVar2 = new bqdv(bqea.a);
                bqdvVar2.u();
                bqdvVar2.d(new Function() { // from class: bcpd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bqdz bqdzVar = (bqdz) obj;
                        dtzj dtzjVar3 = bcpe.a;
                        bqdzVar.f(bckf.b.a);
                        bqdzVar.c(-1L);
                        return bqdzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                fffsVar.add((bcdp) a2.j(dtvz.i(bqdvVar2.b(), bqea.c.c, bcds.c.b)));
                return ffdx.a(fffsVar);
            }
        }, bcpi.a, bcpi.c, bcpi.b, 0, 64);
    }

    @Override // defpackage.bcjz
    public final int a() {
        return this.i.a();
    }

    @Override // defpackage.bcjz
    public final void b(dtyx dtyxVar) {
        bcax a = bcba.a();
        a.u();
        a.C((String) DesugarArrays.stream(new bcau[]{new bcau(bcba.c.m)}).map(new Function() { // from class: bcaw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bcau) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
        a.n(new dtzq("$V", new Object[]{bcba.c.a}), "backup_id");
        this.i.b(a);
        this.j.b(null);
        bcnx.a.b(null);
        bcnn.a.b(null);
        bcnu.c.b(null);
        if (((aucl) this.g.b()).a()) {
            bcni.c.b(null);
        }
    }

    @Override // defpackage.bcjz
    public final void c() {
        this.i.c();
        this.j.c();
        bcnx.a.c();
        bcnn.a.c();
        bcnu.c.c();
        if (((aucl) this.g.b()).a()) {
            bcni.c.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bcjz
    public final void d() {
        this.i.d();
        this.j.d();
        bcnx.a.d();
        bcnn.a.d();
        bcnu.c.d();
        if (((aucl) this.g.b()).a()) {
            bcni.c.d();
        }
        if (((auck) this.e.b()).a()) {
            buxo d = MessagesTable.d();
            d.z("orderedConversationsInThisBatchQuery");
            d.c(MessagesTable.c.b);
            d.t();
            d.d(new buxl(MessagesTable.c.i, false));
            String[] strArr = bqea.a;
            bqdv bqdvVar = new bqdv(bqea.a);
            bqdvVar.u();
            bqdvVar.d(new Function() { // from class: bcms
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bqdz bqdzVar = (bqdz) obj;
                    bqdzVar.f(bckf.b.a);
                    bqdzVar.c(1L);
                    return bqdzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            dtvy i = dtvz.i(bqdvVar.b(), bqea.c.d, MessagesTable.c.a);
            i.d(true);
            engw y = ((buxo) d.j(i)).b().y();
            y.getClass();
            ArrayList arrayList = new ArrayList(ffdx.n(y, 10));
            enqv it = y.iterator();
            while (it.hasNext()) {
                arrayList.add(((MessagesTable.BindData) it.next()).C());
            }
            Iterator it2 = ffdx.X(arrayList).iterator();
            while (it2.hasNext()) {
                Map.EL.putIfAbsent(this.b, (ConversationIdType) it2.next(), false);
            }
            return;
        }
        buxo d2 = MessagesTable.d();
        d2.z("conversationsInThisBatchQuery");
        d2.c(MessagesTable.c.b);
        String[] strArr2 = bqea.a;
        bqdv bqdvVar2 = new bqdv(bqea.a);
        bqdvVar2.u();
        bqdvVar2.d(new Function() { // from class: bcmv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqdz bqdzVar = (bqdz) obj;
                bqdzVar.f(bckf.b.a);
                bqdzVar.c(1L);
                return bqdzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dtvy i2 = dtvz.i(bqdvVar2.b(), bqea.c.d, MessagesTable.c.a);
        i2.d(true);
        engw y2 = ((buxo) d2.j(i2)).b().y();
        y2.getClass();
        ArrayList arrayList2 = new ArrayList(ffdx.n(y2, 10));
        enqv it3 = y2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((MessagesTable.BindData) it3.next()).C());
        }
        List X = ffdx.X(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : X) {
            if (!this.b.keySet().contains((ConversationIdType) obj)) {
                arrayList3.add(obj);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            this.b.put((ConversationIdType) it4.next(), false);
        }
    }

    @Override // defpackage.bcjz
    public final void e() {
        if (!((auck) this.e.b()).a()) {
            axol.k(this.c, null, new bcmz(this, null), 3);
            return;
        }
        ensk g = this.h.g();
        g.Y(ente.a, "BugleBackup");
        enrr enrrVar = (enrr) g.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/messages/CombinedMessagesWriterWorkflowSteps", "postBatchWork", 247, "BatchedMessageRestoreTableWriter.kt");
        java.util.Map map = this.b;
        int i = 0;
        if (!map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                    i++;
                }
            }
        }
        enrrVar.r("conversations in need of refresh: [%s]", i);
        int longValue = (int) ((Number) this.f.b()).longValue();
        java.util.Map map2 = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map2.entrySet()) {
            if (!((Boolean) entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        List ai = ffdx.ai(linkedHashMap.keySet(), longValue);
        ((bcll) this.a.b()).c(engq.a(ai));
        java.util.Map map3 = this.b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(ai, 10)), 16));
        for (Object obj : ai) {
            linkedHashMap2.put(obj, true);
        }
        map3.putAll(linkedHashMap2);
    }

    @Override // defpackage.bcjz
    public final void f() {
        this.i.f();
        this.j.f();
        bcnx.a.f();
        bcnn.a.f();
        bcnu.c.f();
        if (((aucl) this.g.b()).a()) {
            bcni.c.f();
        }
    }

    @Override // defpackage.bcjz
    public final void g(int i, dtzj dtzjVar) {
        this.i.g(i, null);
        bcdp a = bcds.a();
        bccp bccpVar = bcds.c;
        this.j.g(i, bckf.a(a, bccpVar.b, bccpVar.a, bckf.b, bckf.d));
        String[] strArr = bbwh.a;
        bbwe bbweVar = new bbwe(bbwh.a);
        bbvr bbvrVar = bbwh.c;
        bcnx.a.g(i, bckf.a(bbweVar, bbvrVar.b, bbvrVar.a, bckf.b, bckf.g));
        String[] strArr2 = bqea.a;
        bqdv bqdvVar = new bqdv(bqea.a);
        bqdh bqdhVar = bqea.c;
        bqdvVar.c(bqdhVar.c, bqdhVar.a);
        bqdvVar.d(new Function() { // from class: bcmw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqdz bqdzVar = (bqdz) obj;
                bqdzVar.f(bckf.i.a);
                bqdzVar.c(0L);
                return bqdzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        String[] strArr3 = bbtp.a;
        bbtm bbtmVar = new bbtm(bbtp.a);
        bbtmVar.u();
        bqdv bqdvVar2 = new bqdv(bqea.a);
        bqdvVar2.u();
        bqdvVar2.d(new Function() { // from class: bcmx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqdz bqdzVar = (bqdz) obj;
                bqdzVar.b(new Function() { // from class: bcmt
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bqdz bqdzVar2 = (bqdz) obj2;
                        bqdzVar2.d(2, 1);
                        return bqdzVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: bcmu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bqdz bqdzVar2 = (bqdz) obj2;
                        bqdzVar2.g();
                        return bqdzVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return bqdzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bqdu b = bqdvVar2.b();
        bqdi bqdiVar = bqea.c.c;
        bbsw bbswVar = bbtp.c.d;
        bqdz bqdzVar = new bqdz();
        bqdzVar.f(bckf.b.a);
        dtvy s = b.s(bqdiVar, bbswVar, new bqdy(bqdzVar));
        ((dtrd) s).e = "reacted_message_id_map";
        bbtmVar.F(s);
        bqdv bqdvVar3 = new bqdv(bqea.a);
        bqdvVar3.u();
        bqdvVar3.d(new Function() { // from class: bcmy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqdz bqdzVar2 = (bqdz) obj;
                bqdzVar2.f(bckf.b.a);
                bqdzVar2.d(2, 1);
                return bqdzVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dtvy i2 = dtvz.i(bqdvVar3.b(), bqea.c.c, bbtp.c.b);
        ((dtrd) i2).e = "message_id_map";
        dtvy i3 = dtvz.i(((bbtm) bbtmVar.j(i2)).b(), bbtp.c.a, bqea.c.c);
        ((dtrd) i3).e = "reactions_id_map";
        bcnn.a.g(i, ((bqdv) bqdvVar.j(i3)).b());
        bcnu.c.g(i, null);
        if (((aucl) this.g.b()).a()) {
            bcni.c.g(i, null);
        }
    }
}

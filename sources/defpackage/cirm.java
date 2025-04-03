package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cirm extends ceut {
    public static final entd a = entd.c("BugleNotifications");
    public final Context b;
    public final cins c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final cbgf h;
    public final cqoh i;
    public final cipm j;
    public final dtuu k;
    public final ffbr l;
    public final axmw m;
    private final errl n;

    public cirm(errl errlVar, Context context, cins cinsVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, cbgf cbgfVar, axmw axmwVar, cqoh cqohVar, cipm cipmVar, dtuu dtuuVar, ffbr ffbrVar5) {
        this.n = errlVar;
        this.b = context;
        this.c = cinsVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = cbgfVar;
        this.m = axmwVar;
        this.i = cqohVar;
        this.j = cipmVar;
        this.k = dtuuVar;
        this.l = ffbrVar5;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        ((ceti) l).c = eogt.MARK_AS_NOTIFIED_ACTION;
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("MarkAsNotifiedHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return ciro.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final ciro ciroVar = (ciro) eyhsVar;
        return elfo.g(new Callable() { // from class: ciri
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final cirm cirmVar = cirm.this;
                final ciro ciroVar2 = ciroVar;
                try {
                    Instant f = cirmVar.i.f();
                    String[] strArr = (String[]) cirmVar.k.c("MarkAsNotifiedHandler#processPendingWorkItemAsync", new emyl() { // from class: cirj
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.emyl
                        public final Object get() {
                            String[] strArr2;
                            ciro ciroVar3 = ciroVar2;
                            String.valueOf(ciroVar3.b);
                            boolean z = csjy.b;
                            String[] strArr3 = MessagesTable.a;
                            buxz buxzVar = new buxz();
                            buxzVar.F();
                            if (ciroVar3.b.size() > 0) {
                                buxzVar.p(bdgq.d(ciroVar3.b));
                            }
                            final cirm cirmVar2 = cirm.this;
                            if (ciroVar3.b.size() == 0) {
                                axmt axmtVar = (axmt) cirmVar2.d.b();
                                ConversationIdType conversationIdType = bdgq.a;
                                buxz buxzVar2 = new buxz();
                                buxzVar2.F();
                                strArr2 = axmtVar.f(conversationIdType, new buxs(buxzVar2));
                                if (strArr2 == null) {
                                    strArr2 = new String[0];
                                }
                            } else {
                                ArrayList arrayList = new ArrayList();
                                engw d = bdgq.d(ciroVar3.b);
                                int size = d.size();
                                for (int i = 0; i < size; i++) {
                                    ConversationIdType conversationIdType2 = (ConversationIdType) d.get(i);
                                    if (((axmt) cirmVar2.d.b()).d(conversationIdType2, ((cbek) cirmVar2.e.b()).a(conversationIdType2))) {
                                        axmt axmtVar2 = (axmt) cirmVar2.d.b();
                                        buxz buxzVar3 = new buxz();
                                        buxzVar3.F();
                                        String[] f2 = axmtVar2.f(conversationIdType2, new buxs(buxzVar3));
                                        if (f2 != null) {
                                            Collections.addAll(arrayList, f2);
                                        }
                                    }
                                }
                                strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                            }
                            buxr buxrVar = new buxr();
                            buxrVar.ap("markConversationsAsNotifiedAndGetCloudSyncIdsToUpdate");
                            buxrVar.v(true);
                            buxrVar.X(buxzVar);
                            int e = buxrVar.b().e();
                            if (e > 0) {
                                Collection.EL.stream(ciroVar3.b).forEach(new Consumer() { // from class: cirk
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void o(Object obj) {
                                        cirm.this.h.k(bdgq.b((String) obj));
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                            }
                            ((ensz) ((ensz) cirm.a.h()).h("com/google/android/apps/messaging/shared/notification/workhandlers/MarkAsNotifiedHandler", "markConversationsAsNotifiedAndGetCloudSyncIdsToUpdate", 208, "MarkAsNotifiedHandler.java")).B("Marking conversation(s) %s as notified (updateCount %d)", ciroVar3.b, e);
                            return strArr2;
                        }
                    });
                    if (strArr.length > 0) {
                        cirmVar.m.e(cirmVar.b, strArr);
                    }
                    if (ciroVar2.b.size() > 0) {
                        Collection.EL.stream(ciroVar2.b).forEach(new Consumer() { // from class: cirl
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                cirm.this.c.f().a(bdgq.b((String) obj));
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    } else {
                        cirmVar.c.f().a(bdgq.a);
                    }
                    cjcr cjcrVar = (cjcr) cirmVar.l.b();
                    cixf cixfVar = cixf.NT_SECONDARY_USER;
                    ciwj ciwjVar = cjcrVar.a;
                    civs civsVar = (civs) civt.a.createBuilder();
                    civsVar.copyOnWrite();
                    civt civtVar = (civt) civsVar.instance;
                    civtVar.c = cixfVar.j;
                    civtVar.b |= 1;
                    ciwjVar.a.a((civt) civsVar.build(), ciwj.a(cixfVar));
                    if (ciroVar2.c) {
                        cirmVar.j.e(3, Duration.between(f, cirmVar.i.f()));
                    }
                    ceyr b = cish.b();
                    return ceyt.j(engw.s(b, cisl.c()));
                } catch (RuntimeException e) {
                    if (ciroVar2.c) {
                        cirmVar.j.g(equw.MESSAGE_TYPE_UNKNOWN, 4, cipm.c(e), Optional.of(Boolean.valueOf(ciroVar2.c)));
                    }
                    throw e;
                }
            }
        }, this.n);
    }
}

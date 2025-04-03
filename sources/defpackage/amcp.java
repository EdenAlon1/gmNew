package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amcp extends ceut {
    public static final entd a = entd.c("BugleDataModel");
    public final Context b;
    public final cbgf c;
    public final errl d;
    public final errl e;
    public final errl f;
    public final coxk g;
    public final ffbr h;
    public final ffbr i;
    public final cbek j;
    public final axmw k;
    public final bbgg l;
    public final cish m;
    public final cisl n;
    private final ctvb o;

    public amcp(ctvb ctvbVar, Context context, cbgf cbgfVar, errl errlVar, errl errlVar2, errl errlVar3, coxk coxkVar, ffbr ffbrVar, ffbr ffbrVar2, cbek cbekVar, axmw axmwVar, bbgg bbggVar, cish cishVar, cisl cislVar) {
        this.o = ctvbVar;
        this.b = context;
        this.c = cbgfVar;
        this.d = errlVar;
        this.e = errlVar2;
        this.f = errlVar3;
        this.g = coxkVar;
        this.h = ffbrVar;
        this.i = ffbrVar2;
        this.j = cbekVar;
        this.k = axmwVar;
        this.l = bbggVar;
        this.m = cishVar;
        this.n = cislVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("MarkMessagesAsReadHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return amcc.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        amcc amccVar = (amcc) eyhsVar;
        if (!this.o.G()) {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/api/messaging/control/markasread/MarkMessagesAsReadHandler", "processPendingWorkItemAsync", 124, "MarkMessagesAsReadHandler.java")).q("Not default SMS app. Can't mark as read.");
            return elfo.e(ceyt.k());
        }
        Stream map = Collection.EL.stream(amccVar.b).filter(new Predicate() { // from class: amcg
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
                entd entdVar = amcp.a;
                return !TextUtils.isEmpty((String) obj);
            }
        }).map(new Function() { // from class: amch
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                entd entdVar = amcp.a;
                return bdhb.b((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        engw engwVar = (engw) map.collect(endq.a);
        if (engwVar.isEmpty()) {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/api/messaging/control/markasread/MarkMessagesAsReadHandler", "processPendingWorkItemAsync", 135, "MarkMessagesAsReadHandler.java")).q("MessageIds list is empty.");
            return elfo.e(ceyt.k());
        }
        if (engwVar.size() != amccVar.b.size()) {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/api/messaging/control/markasread/MarkMessagesAsReadHandler", "processPendingWorkItemAsync", 138, "MarkMessagesAsReadHandler.java")).q("Some message ids are invalid.");
        }
        final boolean z = amccVar.c;
        final engw engwVar2 = (engw) Collection.EL.stream(engwVar).map(new Function() { // from class: amcd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final MessageIdType messageIdType = (MessageIdType) obj;
                final amcp amcpVar = amcp.this;
                final boolean z2 = z;
                return elfo.g(new Callable() { // from class: amck
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        amcp amcpVar2 = amcp.this;
                        bdmq bdmqVar = (bdmq) amcpVar2.i.b();
                        MessageIdType messageIdType2 = messageIdType;
                        MessageCoreData z3 = bdmqVar.z(messageIdType2);
                        if (z3 == null) {
                            ensz enszVar = (ensz) amcp.a.j();
                            enszVar.Y(csux.a, messageIdType2.b());
                            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/control/markasread/MarkMessagesAsReadHandler", "markMessageAsRead", 186, "MarkMessagesAsReadHandler.java")).q("Failed to find message data");
                            return null;
                        }
                        boolean z4 = z2;
                        String[] strArr = MessagesTable.a;
                        buxr buxrVar = new buxr();
                        buxrVar.ap("markMessageAsRead-messages");
                        buxrVar.F(true);
                        buxz buxzVar = new buxz();
                        buxzVar.q(z3.B());
                        if (z4) {
                            buxrVar.v(true);
                            buxzVar.b(new Function() { // from class: amcn
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    buxz buxzVar2 = (buxz) obj2;
                                    entd entdVar = amcp.a;
                                    buxzVar2.P(false);
                                    return buxzVar2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: amce
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    buxz buxzVar2 = (buxz) obj2;
                                    entd entdVar = amcp.a;
                                    buxzVar2.F();
                                    return buxzVar2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                        } else {
                            buxzVar.P(false);
                        }
                        buxrVar.X(buxzVar);
                        if (buxrVar.b().e() > 0) {
                            amcpVar2.c.l(z3.z(), z3.B(), "read");
                            amcpVar2.c.d(z3.z());
                        }
                        String[] strArr2 = bsam.a;
                        bsaj bsajVar = new bsaj();
                        bsajVar.ap("markMessageAsRead-conversations");
                        bsajVar.c();
                        MessageIdType B = z3.B();
                        bsal bsalVar = new bsal();
                        bsalVar.b(B);
                        bsajVar.ae(new bsak(bsalVar), "conversation_suggestions-buildAndUpdateForTargetMessageId");
                        amcpVar2.m.a(cisg.a);
                        amcpVar2.n.b();
                        return z3;
                    }
                }, amcpVar.d).i(new eroh() { // from class: amcl
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        final MessageCoreData messageCoreData = (MessageCoreData) obj2;
                        if (messageCoreData == null) {
                            return elfo.e(amco.FAILED);
                        }
                        final boolean z3 = z2;
                        final amcp amcpVar2 = amcp.this;
                        return amcpVar2.l.d(messageCoreData.B(), eooi.MARK_MESSAGE_AS_READ).q().i(new eroh() { // from class: amci
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                final amcp amcpVar3 = amcp.this;
                                final MessageCoreData messageCoreData2 = messageCoreData;
                                final boolean z4 = z3;
                                return elfo.f(new Runnable() { // from class: amcm
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        amcp amcpVar4 = amcp.this;
                                        cbek cbekVar = amcpVar4.j;
                                        MessageCoreData messageCoreData3 = messageCoreData2;
                                        cpxu a2 = cbekVar.a(messageCoreData3.z());
                                        if (((axmt) amcpVar4.h.b()).d(messageCoreData3.z(), a2)) {
                                            axmt axmtVar = (axmt) amcpVar4.h.b();
                                            ConversationIdType z5 = messageCoreData3.z();
                                            String[] strArr = MessagesTable.a;
                                            buxz buxzVar = new buxz();
                                            buxzVar.q(messageCoreData3.B());
                                            String[] f = axmtVar.f(z5, new buxs(buxzVar));
                                            if (f != null) {
                                                amcpVar4.k.f(amcpVar4.b, f, z4);
                                            }
                                        }
                                        if (a2.c()) {
                                            Uri u = messageCoreData3.u();
                                            if (u != null) {
                                                amcpVar4.g.ae(u);
                                                return;
                                            }
                                            ensz enszVar = (ensz) amcp.a.j();
                                            enszVar.Y(csux.a, messageCoreData3.B().b());
                                            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/control/markasread/MarkMessagesAsReadHandler", "doBackgroundWork", 279, "MarkMessagesAsReadHandler.java")).q("Message has a null uri");
                                        }
                                    }
                                }, amcpVar3.f);
                            }
                        }, amcpVar2.e).h(new emwl() { // from class: amcj
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                entd entdVar = amcp.a;
                                return amco.SUCCEEDED;
                            }
                        }, amcpVar2.e);
                    }
                }, amcpVar.e);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a);
        return elfo.j(engwVar2).a(new Callable() { // from class: amcf
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                entd entdVar = amcp.a;
                engw engwVar3 = engw.this;
                int size = engwVar3.size();
                int i2 = 0;
                while (i2 < size) {
                    Object q = erqt.q((elfl) engwVar3.get(i2));
                    i2++;
                    if (q == amco.SUCCEEDED) {
                        return ceyt.i();
                    }
                }
                return ceyt.k();
            }
        }, this.e);
    }
}

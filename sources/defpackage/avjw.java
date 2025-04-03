package defpackage;

import android.database.SQLException;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avjw {
    private static final enru c = enru.c("com/google/android/apps/messaging/shared/business/spam/RbmToolstoneDatabaseOperations");
    public final ejvb a;
    public final dtuu b;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final atky j;
    private final ffsk k;
    private final cskc l;

    public avjw(ejvb ejvbVar, ffbr ffbrVar, dtuu dtuuVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, atky atkyVar, ffsk ffskVar) {
        ejvbVar.getClass();
        dtuuVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        atkyVar.getClass();
        ffskVar.getClass();
        this.a = ejvbVar;
        this.d = ffbrVar;
        this.b = dtuuVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
        this.i = ffbrVar6;
        this.j = atkyVar;
        this.k = ffskVar;
        this.l = cskc.g("Bugle", "RbmToolstoneDatabaseOperations");
    }

    private final void j(long j, long j2, int i) {
        eqet eqetVar = (eqet) eqev.a.createBuilder();
        eqetVar.copyOnWrite();
        eqev eqevVar = (eqev) eqetVar.instance;
        eqevVar.b |= 4;
        eqevVar.e = i;
        if (j <= 0 || j == Long.MAX_VALUE) {
            eqetVar.copyOnWrite();
            eqev eqevVar2 = (eqev) eqetVar.instance;
            eqevVar2.c = 2;
            eqevVar2.b |= 1;
        } else {
            eqetVar.copyOnWrite();
            eqev eqevVar3 = (eqev) eqetVar.instance;
            eqevVar3.c = 3;
            eqevVar3.b |= 1;
            long seconds = Duration.ofMillis(j2).toSeconds();
            eqetVar.copyOnWrite();
            eqev eqevVar4 = (eqev) eqetVar.instance;
            eqevVar4.b |= 2;
            eqevVar4.d = seconds;
        }
        ((avjf) this.g.b()).h((eqev) eqetVar.build());
    }

    private static final long k(ConversationIdType conversationIdType) {
        bqfs a = bqfx.a();
        a.z("business_conversations_metadata.queryOnConversationId");
        a.q();
        bqfw bqfwVar = new bqfw();
        bqfwVar.b(conversationIdType);
        a.k(new bqfv(bqfwVar));
        bqeo bqeoVar = (bqeo) dtub.c(a.b());
        if (bqeoVar != null) {
            return bqeoVar.k();
        }
        return 0L;
    }

    private final avji l(int i, ConversationIdType conversationIdType, long j) {
        avji avjiVar;
        cfup cfupVar = avjy.a;
        int e = avjy.e(i);
        if (e <= 1) {
            return avji.SHOW;
        }
        bjji d = ((bcsq) this.e.b()).d(conversationIdType, e, 0);
        d.c(new bjjf(bjjn.c.d, true));
        bjjd bjjdVar = (bjjd) d.b().o();
        try {
            if (bjjdVar.getCount() < e) {
                avjiVar = avji.HIDE;
            } else {
                long k = k(conversationIdType);
                if (bjjdVar.moveToFirst() && bcse.aA(bjjdVar.e())) {
                    long f = bjjdVar.f();
                    long j2 = f;
                    while (true) {
                        if (!bjjdVar.moveToNext()) {
                            long j3 = j2 - f;
                            if (j3 > j) {
                                avjiVar = avji.HIDE;
                            } else {
                                j(j, j3, bjjdVar.getCount());
                                avjiVar = avji.SHOW;
                            }
                        } else {
                            if (!bcse.aA(bjjdVar.e())) {
                                avjiVar = avji.HIDE;
                                break;
                            }
                            if (bjjdVar.f() < k) {
                                avjiVar = avji.HIDE;
                                break;
                            }
                            j2 = bjjdVar.f();
                        }
                    }
                }
                avjiVar = avji.HIDE;
            }
            ffig.a(bjjdVar, null);
            return avjiVar;
        } finally {
        }
    }

    private final avji m(int i, final ConversationIdType conversationIdType, long j) {
        avji avjiVar;
        cfup cfupVar = avjy.a;
        int e = avjy.e(i);
        if (e <= 1) {
            return avji.SHOW;
        }
        buxo d = MessagesTable.d();
        d.z("calculateAppearanceViaUnrespondedMessagesWithinTimeframeOptimized");
        buum buumVar = MessagesTable.c;
        d.c(buumVar.a, buumVar.k, buumVar.i);
        d.h(new Function() { // from class: avjm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                buxzVar.m(ConversationIdType.this);
                buxzVar.ap(3);
                buxzVar.ap(16);
                buxzVar.al();
                String[] strArr = MessagesTable.a;
                buxz buxzVar2 = new buxz();
                buxzVar2.B(false);
                buxz buxzVar3 = new buxz();
                bueb a = bueg.a();
                a.f(new Function() { // from class: avjn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        buef buefVar = (buef) obj2;
                        buefVar.aq(new dtru("message_reactions.message_id", 1, MessagesTable.c.a));
                        return buefVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                buxzVar3.as(new dtym(a.b()));
                buxzVar.ar(buxzVar2, buxzVar3);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.d(new buxl(MessagesTable.c.i, true));
        d.x(e);
        buuo buuoVar = (buuo) d.b().o();
        try {
            if (buuoVar.getCount() < e) {
                avjiVar = avji.HIDE;
            } else {
                long k = k(conversationIdType);
                if (buuoVar.moveToFirst() && bcse.aA(buuoVar.i())) {
                    long l = buuoVar.l();
                    long j2 = l;
                    while (true) {
                        if (!buuoVar.moveToNext()) {
                            long j3 = j2 - l;
                            if (j3 > j) {
                                avjiVar = avji.HIDE;
                            } else {
                                j(j, j3, buuoVar.getCount());
                                avjiVar = avji.SHOW;
                            }
                        } else {
                            if (!bcse.aA(buuoVar.i())) {
                                avjiVar = avji.HIDE;
                                break;
                            }
                            if (buuoVar.l() < k) {
                                avjiVar = avji.HIDE;
                                break;
                            }
                            j2 = buuoVar.l();
                        }
                    }
                }
                avjiVar = avji.HIDE;
            }
            ffig.a(buuoVar, null);
            return avjiVar;
        } finally {
        }
    }

    public final elfl a(ConversationIdType conversationIdType) {
        elfl c2;
        if (((Boolean) avjy.b.e()).booleanValue()) {
            c2 = axol.c(this.k, ffhe.a, ffsm.a, new avjs(this, conversationIdType, null));
            return c2;
        }
        elfl e = elfo.e(avji.HIDE);
        e.getClass();
        return e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.avjt
            if (r0 == 0) goto L13
            r0 = r6
            avjt r0 = (defpackage.avjt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avjt r0 = new avjt
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            avjw r5 = r0.d
            defpackage.ffci.b(r6)
            goto L54
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            ffbr r6 = r4.h
            java.lang.Object r6 = r6.b()
            aqkp r6 = (defpackage.aqkp) r6
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r2 = new com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId
            r2.<init>(r5)
            aqge r5 = r6.d(r2)
            elfl r5 = r5.b()
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r5, r0)
            if (r6 == r1) goto Lb9
            r5 = r4
        L54:
            engw r6 = (defpackage.engw) r6
            int r0 = r6.size()
            r1 = 0
            if (r0 > 0) goto L62
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L62:
            java.lang.Object r0 = r6.get(r1)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r0 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r0
            aoku r0 = r0.g()
            java.lang.Object r6 = r6.get(r1)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r6 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r6
            boolean r6 = r6.z()
            if (r6 == 0) goto L7d
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L7d:
            java.lang.String r6 = r0.n()
            if (r6 != 0) goto L85
            java.lang.String r6 = ""
        L85:
            java.lang.String r6 = defpackage.aoqw.c(r6)
            r6.getClass()
            int r0 = r6.length()
            if (r0 != 0) goto L9e
            cskc r5 = r5.l
            java.lang.String r6 = "RBM toolstone is not shown as bot id is malformed."
            r5.n(r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L9e:
            java.util.List r0 = defpackage.avjy.c()
            boolean r6 = r0.contains(r6)
            if (r6 != 0) goto Lb4
            cskc r5 = r5.l
            java.lang.String r6 = "RBM toolstone is not shown as it is not enabled on the bot domain."
            r5.r(r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        Lb4:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        Lb9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avjw.b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, ffgu):java.lang.Object");
    }

    public final void c(ConversationIdType conversationIdType) {
        if (((Boolean) avjy.f.e()).booleanValue()) {
            e(conversationIdType, avji.SHOW, false);
        } else {
            i(3, conversationIdType);
        }
    }

    public final void d(final ConversationIdType conversationIdType, avji avjiVar) {
        if (((askf) this.i.b()).a()) {
            try {
                String[] strArr = bqfx.a;
                bqer bqerVar = new bqer();
                bqerVar.c(conversationIdType);
                bqerVar.d(avjiVar);
                bqerVar.a().n(new Function() { // from class: avjj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bqfw bqfwVar = (bqfw) obj;
                        bqfwVar.b(ConversationIdType.this);
                        return bqfwVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return;
            } catch (SQLException e) {
                ((enrr) ((enrr) c.j()).g(e).h("com/google/android/apps/messaging/shared/business/spam/RbmToolstoneDatabaseOperations", "persistAutomatedToolstoneStateChange", 142, "RbmToolstoneDatabaseOperations.kt")).t("Failed to update/insert BusinessConversationsMetadataTable on toolstone state change. New state: %s", avjiVar);
                return;
            }
        }
        String[] strArr2 = bqfx.a;
        bqfu bqfuVar = new bqfu();
        bqfuVar.ap("persistAutomatedToolstoneStateChange");
        bqfuVar.e(avjiVar);
        if (bqfuVar.c(conversationIdType)) {
            return;
        }
        bqer bqerVar2 = new bqer();
        bqerVar2.c(conversationIdType);
        bqerVar2.d(avjiVar);
        bqerVar2.a().m();
    }

    public final void e(ConversationIdType conversationIdType, avji avjiVar, boolean z) {
        avjiVar.getClass();
        axol.k(this.k, null, new avjv(this, z, avjiVar, conversationIdType, null), 3);
    }

    public final void f(final ConversationIdType conversationIdType) {
        long epochMilli = ((cqoh) this.d.b()).f().toEpochMilli();
        if (((askf) this.i.b()).a()) {
            try {
                String[] strArr = bqfx.a;
                bqer bqerVar = new bqer();
                bqerVar.c(conversationIdType);
                bqerVar.d(avji.HIDE);
                bqerVar.e(epochMilli);
                bqerVar.a().n(new Function() { // from class: avjl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bqfw bqfwVar = (bqfw) obj;
                        bqfwVar.b(ConversationIdType.this);
                        return bqfwVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            } catch (SQLException e) {
                ((enrr) ((enrr) c.j()).g(e).h("com/google/android/apps/messaging/shared/business/spam/RbmToolstoneDatabaseOperations", "persistUserInitiatedToolstoneDismissal", 97, "RbmToolstoneDatabaseOperations.kt")).q("Failed to update/insert BusinessConversationsMetadataTable on toolstone dismissal.");
            }
        } else {
            String[] strArr2 = bqfx.a;
            bqfu bqfuVar = new bqfu();
            bqfuVar.ap("persistUserInitiatedToolstoneDismissal");
            bqfuVar.e(avji.HIDE);
            bqfuVar.f(epochMilli);
            if (!bqfuVar.c(conversationIdType)) {
                bqer bqerVar2 = new bqer();
                bqerVar2.c(conversationIdType);
                bqerVar2.d(avji.HIDE);
                bqerVar2.e(epochMilli);
                bqerVar2.a().m();
            }
        }
        avjf avjfVar = (avjf) this.g.b();
        eqex eqexVar = (eqex) eqey.a.createBuilder();
        eqexVar.copyOnWrite();
        eqey eqeyVar = (eqey) eqexVar.instance;
        eqeyVar.c = 1;
        eqeyVar.b = 1 | eqeyVar.b;
        avjfVar.i((eqey) eqexVar.build());
    }

    public final avji h(int i, ConversationIdType conversationIdType) {
        Instant ofEpochMilli;
        avji avjiVar;
        cfup cfupVar = avjy.a;
        Integer num = i == 3 ? (Integer) avjy.g.e() : (Integer) avjy.c.e();
        num.getClass();
        int intValue = num.intValue();
        int i2 = intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? 0 : 6 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            i2 = 3;
        }
        int i3 = i2 - 2;
        if (i3 != 2) {
            avjiVar = i3 != 3 ? i3 != 4 ? avji.HIDE : this.j.a() ? m(i, conversationIdType, avjy.d(i)) : l(i, conversationIdType, avjy.d(i)) : this.j.a() ? m(i, conversationIdType, Long.MAX_VALUE) : l(i, conversationIdType, Long.MAX_VALUE);
        } else {
            long k = k(conversationIdType);
            long d = avjy.d(i);
            if (k > 0) {
                ofEpochMilli = Instant.ofEpochMilli(k);
            } else if (this.j.a()) {
                bifz b = ((bcsy) this.f.b()).b(true, blyg.d(conversationIdType));
                b.z("ConversationMessageDataQueryHelperV2::getFirstConversationMessageQuerySql");
                bifu bifuVar = (bifu) b.b().o();
                try {
                    bifuVar.moveToFirst();
                    ofEpochMilli = Instant.ofEpochMilli(bifuVar.e());
                    ffig.a(bifuVar, null);
                } finally {
                }
            } else {
                bjjd bjjdVar = (bjjd) ((bcsq) this.e.b()).c(true, blyg.d(conversationIdType)).b().o();
                try {
                    bjjdVar.moveToFirst();
                    ofEpochMilli = Instant.ofEpochMilli(bjjdVar.f());
                    ffig.a(bjjdVar, null);
                } finally {
                }
            }
            Instant plus = ofEpochMilli.plus(Duration.ofMillis(d));
            Instant f = ((cqoh) this.d.b()).f();
            if (plus.isBefore(f)) {
                avjf avjfVar = (avjf) this.g.b();
                eqet eqetVar = (eqet) eqev.a.createBuilder();
                eqetVar.copyOnWrite();
                eqev eqevVar = (eqev) eqetVar.instance;
                eqevVar.c = 1;
                eqevVar.b = 1 | eqevVar.b;
                long seconds = Duration.ofMillis(f.toEpochMilli() - ofEpochMilli.toEpochMilli()).toSeconds();
                eqetVar.copyOnWrite();
                eqev eqevVar2 = (eqev) eqetVar.instance;
                eqevVar2.b = 2 | eqevVar2.b;
                eqevVar2.d = seconds;
                avjfVar.h((eqev) eqetVar.build());
                avjiVar = avji.SHOW;
            } else {
                avjiVar = avji.HIDE;
            }
        }
        if (avjiVar == avji.SHOW) {
            e(conversationIdType, avjiVar, false);
        }
        return avjiVar;
    }

    public final void i(int i, ConversationIdType conversationIdType) {
        axol.k(this.k, null, new avjp(this, i, conversationIdType, null), 3);
    }
}

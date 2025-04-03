package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnsm extends ceut {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/satelliteapi/outgoing/questionnaireretriever/RetrieveQuestionnaireWorkHandler");
    private static final Map c = ffew.g(new ffcf(cnty.OUTCOME_SUCCESS, ffew.g(new ffcf(cnsy.HELP_NOT_LONGER_NEED, cnqt.b), new ffcf(cnsy.WAITING_FOR_HELP, cnqt.a))), new ffcf(cnty.OUTCOME_FAILURE, ffew.g(new ffcf(cnsy.HELP_NOT_LONGER_NEED, cnqt.d), new ffcf(cnsy.WAITING_FOR_HELP, cnqt.c))));
    public final bdjr b;
    private final ffsk d;
    private final cnnh e;
    private final cnro f;
    private final cnqv g;
    private final bdtd h;
    private final cnvr i;
    private final Optional j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final cnnv n;
    private final aolr o;
    private final cnvc p;
    private final ffbr q;
    private final cnvb r;
    private final ffbr s;
    private final asmj t;
    private final ffbr u;

    public cnsm(ffsk ffskVar, cnnh cnnhVar, bdjr bdjrVar, cnro cnroVar, cnqv cnqvVar, bdtd bdtdVar, cnvr cnvrVar, Optional optional, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, cnnv cnnvVar, aolr aolrVar, cnvc cnvcVar, ffbr ffbrVar4, cnvb cnvbVar, ffbr ffbrVar5, asmj asmjVar, ffbr ffbrVar6) {
        ffskVar.getClass();
        cnnhVar.getClass();
        bdjrVar.getClass();
        bdtdVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        aolrVar.getClass();
        cnvcVar.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        asmjVar.getClass();
        ffbrVar6.getClass();
        this.d = ffskVar;
        this.e = cnnhVar;
        this.b = bdjrVar;
        this.f = cnroVar;
        this.g = cnqvVar;
        this.h = bdtdVar;
        this.i = cnvrVar;
        this.j = optional;
        this.k = ffbrVar;
        this.l = ffbrVar2;
        this.m = ffbrVar3;
        this.n = cnnvVar;
        this.o = aolrVar;
        this.p = cnvcVar;
        this.q = ffbrVar4;
        this.r = cnvbVar;
        this.s = ffbrVar5;
        this.t = asmjVar;
        this.u = ffbrVar6;
    }

    private final void o(ConversationIdType conversationIdType, final MessageCoreData messageCoreData, cnty cntyVar, eopk eopkVar, final MessageCoreData messageCoreData2) {
        Object a2 = this.i.a(messageCoreData);
        if (ffch.d(a2)) {
            final Uri uri = (Uri) a2;
            ensk h = a.h();
            h.Y(ente.a, "BugleSatellite");
            enrr enrrVar = (enrr) h;
            enrrVar.Y(csux.X, uri);
            enrrVar.Y(csux.Y, messageCoreData.A());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/questionnaireretriever/RetrieveQuestionnaireWorkHandler", "insertIntoTelephonyDatabase", 390, "RetrieveQuestionnaireWorkHandler.kt")).q("Successfully inserted the satellite message in Telephony DB");
            messageCoreData.bD(uri);
            if (this.t.a()) {
                ((azei) this.u.b()).d(new Consumer() { // from class: cnsc
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        cpdd cpddVar = (cpdd) obj;
                        enru enruVar = cnsm.a;
                        cpddVar.getClass();
                        cpddVar.c(uri, messageCoreData.aI());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            } else {
                Optional optional = this.j;
                final ffji ffjiVar = new ffji() { // from class: cnsd
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        cpdd cpddVar = (cpdd) obj;
                        enru enruVar = cnsm.a;
                        cpddVar.getClass();
                        cpddVar.c(uri, messageCoreData.aI());
                        return ffcu.a;
                    }
                };
                optional.ifPresent(new Consumer() { // from class: cnse
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        enru enruVar = cnsm.a;
                        ffji.this.invoke(obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
        ((dtuu) this.q.b()).d("RetrieveQuestionnaireWorkHandler#insertToBugleDatabaseAndNotifyUI", new Runnable() { // from class: cnsf
            @Override // java.lang.Runnable
            public final void run() {
                cnsm cnsmVar = cnsm.this;
                bdjr bdjrVar = cnsmVar.b;
                MessageCoreData messageCoreData3 = messageCoreData;
                if (bdjrVar.a(messageCoreData3).c()) {
                    ensk j = cnsm.a.j();
                    j.Y(ente.a, "BugleSatellite");
                    enrr enrrVar2 = (enrr) j;
                    enrrVar2.Y(csux.Y, messageCoreData3.A());
                    ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/questionnaireretriever/RetrieveQuestionnaireWorkHandler", "insertIntoBugleDatabase$lambda$16", 356, "RetrieveQuestionnaireWorkHandler.kt")).q("Failed to insert outgoing satellite message");
                } else {
                    ensk h2 = cnsm.a.h();
                    h2.Y(ente.a, "BugleSatellite");
                    enrr enrrVar3 = (enrr) h2;
                    enrrVar3.Y(csux.Y, messageCoreData3.A());
                    ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/questionnaireretriever/RetrieveQuestionnaireWorkHandler", "insertIntoBugleDatabase$lambda$16", 361, "RetrieveQuestionnaireWorkHandler.kt")).q("Successfully inserted outgoing satellite message");
                }
                MessageCoreData messageCoreData4 = messageCoreData2;
                if (cnsmVar.b.a(messageCoreData4).c()) {
                    ensk j2 = cnsm.a.j();
                    j2.Y(ente.a, "BugleSatellite");
                    enrr enrrVar4 = (enrr) j2;
                    enrrVar4.Y(csux.Y, messageCoreData3.A());
                    ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/questionnaireretriever/RetrieveQuestionnaireWorkHandler", "insertIntoBugleDatabase$lambda$16", 370, "RetrieveQuestionnaireWorkHandler.kt")).r("Failed to insert tombstone [status: %s] for satellite message", messageCoreData4.k());
                    return;
                }
                ensk h3 = cnsm.a.h();
                h3.Y(ente.a, "BugleSatellite");
                enrr enrrVar5 = (enrr) h3;
                enrrVar5.Y(csux.Y, messageCoreData3.A());
                ((enrr) enrrVar5.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/questionnaireretriever/RetrieveQuestionnaireWorkHandler", "insertIntoBugleDatabase$lambda$16", 375, "RetrieveQuestionnaireWorkHandler.kt")).r("Successfully inserted the satellite tombstone [status: %s] for satellite message", messageCoreData4.k());
            }
        });
        ((bdfl) this.s.b()).e(conversationIdType, messageCoreData2.B(), Long.valueOf(messageCoreData2.o()), byyt.UNARCHIVED, false);
        altk altkVar = (altk) this.k.b();
        if (cntyVar != cnty.OUTCOME_SUCCESS) {
            alqn alqnVar = new alqn();
            alqnVar.f(messageCoreData);
            alqnVar.i(this.h.e().e());
            alqnVar.g(-2);
            alqnVar.b(-1);
            alqnVar.d(0);
            alqnVar.c = 1;
            alqnVar.e(0);
            alqnVar.h(eopkVar);
            altkVar.K(alqnVar.a());
            return;
        }
        int e = this.h.e().e();
        eoop eoopVar = (eoop) eopq.a.createBuilder();
        eoopVar.getClass();
        eohm.g(2, eoopVar);
        boolean cN = messageCoreData.cN();
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopqVar.c |= 1073741824;
        eopqVar.aj = cN;
        eopkVar.getClass();
        eoopVar.copyOnWrite();
        eopq eopqVar2 = (eopq) eoopVar.instance;
        eopqVar2.aB = eopkVar.e;
        eopqVar2.d |= 65536;
        altkVar.O(messageCoreData, e, (eoop) eohm.a(eoopVar).toBuilder());
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        ffbr ffbrVar = this.l;
        cetx l = cety.l();
        l.c((int) ((Number) ffbrVar.b()).longValue());
        l.f(poa.EXPONENTIAL);
        Object b = this.m.b();
        b.getClass();
        l.g(((Number) b).longValue());
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("RetrieveQuestionnaireWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = eyex.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c2;
        ((eyex) eyhsVar).getClass();
        c2 = axol.c(this.d, ffhe.a, ffsm.a, new cnsk(this, null));
        return c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.aoku r5, defpackage.cnui r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cnsh
            if (r0 == 0) goto L13
            r0 = r7
            cnsh r0 = (defpackage.cnsh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnsh r0 = new cnsh
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            aoks r5 = r0.e
            cnsm r6 = r0.d
            defpackage.ffci.b(r7)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r7)
            cnnv r7 = r4.n
            r0.d = r4
            r2 = r5
            aoks r2 = (defpackage.aoks) r2
            r0.e = r2
            r0.c = r3
            java.lang.Object r7 = r7.e(r5, r6, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            r6 = r4
        L49:
            bseh r7 = (defpackage.bseh) r7
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r7 = r7.C()
            r7.getClass()
            bdtd r0 = r6.h
            aztg r0 = r0.e()
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r0 = r0.g()
            cnnv r6 = r6.n
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r5 = r6.a(r5)
            cnsg r6 = new cnsg
            r6.<init>(r7, r0, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnsm.k(aoku, cnui, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.cnui r17, java.util.List r18, defpackage.aoku r19, defpackage.ffgu r20) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnsm.l(cnui, java.util.List, aoku, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x021e, code lost:
    
        if (r0.b(r2) == r3) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x020a, code lost:
    
        if (r14.l(r4, r0, r5, r2) != r3) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01e5, code lost:
    
        if (r14.n(r4, r12, r0, r2) == r3) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0168, code lost:
    
        if (r14.n(r0, r15, r5, r2) != r3) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r6v12, types: [cnsm, cnui, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.ffgu r18) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnsm.m(ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.cnui r19, java.util.List r20, defpackage.aoku r21, defpackage.ffgu r22) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnsm.n(cnui, java.util.List, aoku, ffgu):java.lang.Object");
    }
}

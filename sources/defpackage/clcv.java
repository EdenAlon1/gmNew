package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clcv implements clbm {
    private final ffbr A;
    private final bdxd B;
    private final Optional C;
    private final ffbr D;
    private final bdwt E;
    private final cisl F;
    private final byzp G;
    private final clbl H;
    private final ffbr I;
    private final cowq J;
    private final avkf K;
    private final ffbr L;
    private final ffbr M;
    private final ffbr N;
    private final ffbr O;
    private final akzt P;
    private final ffbr Q;
    private final ffbr R;
    private final ffbr S;
    private final ffbr T;
    private final ffbr U;
    private final ffbr V;
    private final djsi W;
    private final djrk X;
    private final ffbr Y;
    private final ffbr Z;
    private final ffbr aa;
    private final ffbr ab;
    private final Optional ac;
    private final ffbr ad;
    private final eijz ae;
    private final ffbr af;
    private final ffbr ag;
    private final ffbr ah;
    private final ffbr ai;
    private final ffbr aj;
    private final ffbr ak;
    private final ffbr al;
    private final ffbr am;
    private final ffbr an;
    private final ffbr ao;
    private final ffbr ap;
    private final ffsk aq;
    private final ffsk ar;
    private final ffbr as;
    private final ffbr at;
    private final atme au;
    private final bahx av;
    private final cfmp aw;
    private final bauj ax;
    public final ffbr b;
    public final ffbr c;
    public final cvlf d;
    public final cbgf e;
    public final bdvi f;
    public final cluu g;
    public final bavs h;
    public final dtuu i;
    public final cbut j;
    public final ffbr k;
    public final fazb l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    public final asnl q;
    public final ffbr r;
    private final ckds u;
    private final ffbr v;
    private final ffbr w;
    private final ffbr x;
    private final cubr y;
    private final ffbr z;
    private static final entd s = entd.c("BugleNotifications");
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/rcs/incoming/IncomingRcsMessageProcessorKt");
    private static final List t = ffdx.g(ChatMessage.Type.TEXT, ChatMessage.Type.RBM_SPECIFIC_MESSAGE, ChatMessage.Type.TEST, ChatMessage.Type.TEST_FAILURE, ChatMessage.Type.ENCRYPTED_MESSAGE, ChatMessage.Type.ENCRYPTION_FTD, ChatMessage.Type.PROTO_MESSAGE);

    public clcv(ckds ckdsVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, cvlf cvlfVar, ffbr ffbrVar5, cubr cubrVar, ffbr ffbrVar6, ffbr ffbrVar7, bdxd bdxdVar, Optional optional, bahx bahxVar, ffbr ffbrVar8, ffbr ffbrVar9, cfmp cfmpVar, bdwt bdwtVar, cisl cislVar, cbgf cbgfVar, bdvi bdviVar, cluu cluuVar, bavs bavsVar, bauj baujVar, byzp byzpVar, dtuu dtuuVar, clbl clblVar, cbut cbutVar, ffbr ffbrVar10, cowq cowqVar, avkm avkmVar, avkf avkfVar, ffbr ffbrVar11, ffbr ffbrVar12, fazb fazbVar, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, akzt akztVar, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21, ffbr ffbrVar22, ffbr ffbrVar23, djsi djsiVar, djrk djrkVar, ffbr ffbrVar24, ffbr ffbrVar25, ffbr ffbrVar26, ffbr ffbrVar27, ffbr ffbrVar28, ffbr ffbrVar29, Optional optional2, ffbr ffbrVar30, eijz eijzVar, ffbr ffbrVar31, ffbr ffbrVar32, ffbr ffbrVar33, ffbr ffbrVar34, ffbr ffbrVar35, ffbr ffbrVar36, ffbr ffbrVar37, ffbr ffbrVar38, ffbr ffbrVar39, ffbr ffbrVar40, ffbr ffbrVar41, asnl asnlVar, ffbr ffbrVar42, ffsk ffskVar, ffsk ffskVar2, ffbr ffbrVar43, ffbr ffbrVar44, atme atmeVar) {
        ckdsVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        cvlfVar.getClass();
        ffbrVar5.getClass();
        cubrVar.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        bdxdVar.getClass();
        optional.getClass();
        bahxVar.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        bdwtVar.getClass();
        cislVar.getClass();
        cbgfVar.getClass();
        bdviVar.getClass();
        cluuVar.getClass();
        bavsVar.getClass();
        baujVar.getClass();
        byzpVar.getClass();
        dtuuVar.getClass();
        cbutVar.getClass();
        ffbrVar10.getClass();
        cowqVar.getClass();
        avkmVar.getClass();
        avkfVar.getClass();
        ffbrVar11.getClass();
        ffbrVar12.getClass();
        fazbVar.getClass();
        ffbrVar13.getClass();
        ffbrVar14.getClass();
        ffbrVar15.getClass();
        akztVar.getClass();
        ffbrVar16.getClass();
        ffbrVar17.getClass();
        ffbrVar18.getClass();
        ffbrVar19.getClass();
        ffbrVar20.getClass();
        ffbrVar21.getClass();
        ffbrVar22.getClass();
        ffbrVar23.getClass();
        djsiVar.getClass();
        djrkVar.getClass();
        ffbrVar24.getClass();
        ffbrVar25.getClass();
        ffbrVar26.getClass();
        ffbrVar27.getClass();
        ffbrVar28.getClass();
        ffbrVar29.getClass();
        ffbrVar30.getClass();
        ffbrVar31.getClass();
        ffbrVar32.getClass();
        ffbrVar33.getClass();
        ffbrVar34.getClass();
        ffbrVar35.getClass();
        ffbrVar36.getClass();
        ffbrVar37.getClass();
        ffbrVar38.getClass();
        ffbrVar39.getClass();
        ffbrVar40.getClass();
        ffbrVar41.getClass();
        ffbrVar42.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        ffbrVar43.getClass();
        ffbrVar44.getClass();
        atmeVar.getClass();
        this.u = ckdsVar;
        this.b = ffbrVar;
        this.v = ffbrVar2;
        this.c = ffbrVar3;
        this.w = ffbrVar4;
        this.d = cvlfVar;
        this.x = ffbrVar5;
        this.y = cubrVar;
        this.z = ffbrVar6;
        this.A = ffbrVar7;
        this.B = bdxdVar;
        this.C = optional;
        this.av = bahxVar;
        this.D = ffbrVar9;
        this.aw = cfmpVar;
        this.E = bdwtVar;
        this.F = cislVar;
        this.e = cbgfVar;
        this.f = bdviVar;
        this.g = cluuVar;
        this.h = bavsVar;
        this.ax = baujVar;
        this.G = byzpVar;
        this.i = dtuuVar;
        this.H = clblVar;
        this.j = cbutVar;
        this.I = ffbrVar10;
        this.J = cowqVar;
        this.K = avkfVar;
        this.k = ffbrVar11;
        this.L = ffbrVar12;
        this.l = fazbVar;
        this.M = ffbrVar13;
        this.N = ffbrVar14;
        this.O = ffbrVar15;
        this.P = akztVar;
        this.m = ffbrVar16;
        this.Q = ffbrVar17;
        this.R = ffbrVar18;
        this.S = ffbrVar19;
        this.T = ffbrVar20;
        this.n = ffbrVar21;
        this.U = ffbrVar22;
        this.V = ffbrVar23;
        this.W = djsiVar;
        this.X = djrkVar;
        this.Y = ffbrVar24;
        this.Z = ffbrVar25;
        this.aa = ffbrVar26;
        this.ab = ffbrVar27;
        this.o = ffbrVar28;
        this.p = ffbrVar29;
        this.ac = optional2;
        this.ad = ffbrVar30;
        this.ae = eijzVar;
        this.af = ffbrVar31;
        this.ag = ffbrVar32;
        this.ah = ffbrVar33;
        this.ai = ffbrVar34;
        this.aj = ffbrVar35;
        this.ak = ffbrVar36;
        this.al = ffbrVar37;
        this.am = ffbrVar38;
        this.an = ffbrVar39;
        this.ao = ffbrVar40;
        this.ap = ffbrVar41;
        this.q = asnlVar;
        this.r = ffbrVar42;
        this.aq = ffskVar;
        this.ar = ffskVar2;
        this.as = ffbrVar43;
        this.at = ffbrVar44;
        this.au = atmeVar;
    }

    private final aztg g(ckep ckepVar) {
        String str = ckepVar.h().d;
        str.getClass();
        if (((atsn) this.al.b()).a()) {
            return ((ckam) this.ak.b()).b(ckepVar.h());
        }
        djrq djrqVar = (djrq) fflm.b(this.W.i(this.X.a(str)));
        if (djrqVar != null) {
            aztg g = ((bdtd) this.Y.b()).g(djrqVar.a);
            g.getClass();
            return g;
        }
        ((avkz) this.af.b()).c(ckepVar.l(), ckepVar.h());
        aztg h = this.u.h();
        h.getClass();
        return h;
    }

    private final MessageCoreData h(ckep ckepVar, ParticipantsTable.BindData bindData, aztg aztgVar, ConversationIdType conversationIdType, clbk clbkVar, String str, boolean z, boolean z2, LocationInformation locationInformation, fayv fayvVar) {
        ((bdrr) this.b.b()).i(bindData);
        boolean a2 = clcm.a(str, locationInformation, clbkVar);
        if (((augx) this.am.b()).a()) {
            a2 = a2 || ckepVar.a() == 116;
        }
        long e = (((Boolean) cful.j.e()).booleanValue() && clbkVar.d() && ckepVar.e() > 0) ? ckepVar.e() : ckepVar.d();
        int a3 = ckepVar.a() != 0 ? ckepVar.a() : 100;
        byzp byzpVar = this.G;
        bdhg l = ckepVar.l();
        String S = bindData.S();
        SelfIdentityId g = aztgVar.g();
        ckepVar.B();
        MessageCoreData y = byzpVar.y(l, S, g, conversationIdType, a3, 1, true == clbkVar.c() ? null : str, z, z2, ckepVar.e(), e);
        y.bx(a2);
        if (locationInformation != null) {
            y.aL(this.E.a(locationInformation));
        }
        y.bs(fayvVar);
        y.bQ(((aolr) this.M.b()).b(ckepVar.g()));
        y.bN(((aolr) this.M.b()).b(ckepVar.h()));
        this.aw.a(y, ckepVar.f());
        if (((augx) this.am.b()).a()) {
            y.bI((ckepVar.t() || ckepVar.x()) ? byzg.NOT_SENT : byzg.NOT_REQUESTED);
        } else {
            y.bI(ckepVar.t() ? byzg.NOT_SENT : byzg.NOT_REQUESTED);
        }
        if (!ckepVar.t()) {
            this.P.c("Bugle.Rcs.Chat.Message.DeliveryReportNotRequested.Counts");
        }
        y.bJ(ckepVar.u() ? byzg.NOT_SENT : byzg.NOT_REQUESTED);
        return y;
    }

    private final void i(MessageCoreData messageCoreData) {
        ((cjbc) this.S.b()).b(messageCoreData.z(), Duration.ofMillis(messageCoreData.o()), messageCoreData.cN());
    }

    private final boolean j(ConversationIdType conversationIdType, awui awuiVar) {
        return ((bdfp) this.ah.b()).g(conversationIdType, awuiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean k(ConversationIdType conversationIdType, aztg aztgVar) {
        Optional g = this.W.g(aztgVar.e());
        if (g.isEmpty()) {
            return false;
        }
        final aoku u = ((aolr) this.M.b()).u(((djrj) g.get()).a, aztgVar.e());
        List L = ((bczy) this.p.b()).L(conversationIdType);
        L.getClass();
        ArrayList<Optional> arrayList = new ArrayList(ffdx.n(L, 10));
        enqv it = ((engw) L).iterator();
        while (it.hasNext()) {
            arrayList.add(((aolr) this.M.b()).A((ParticipantsTable.BindData) it.next()));
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (Optional optional : arrayList) {
            final ffji ffjiVar = new ffji() { // from class: clcf
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    enru enruVar = clcv.a;
                    return Boolean.valueOf(ffkj.e((aoku) obj, aoku.this));
                }
            };
            Object orElse = optional.map(new Function() { // from class: clcg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    enru enruVar = clcv.a;
                    return ffji.this.invoke(obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(false);
            orElse.getClass();
            if (((Boolean) orElse).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.clbm
    public final elfl a(ckep ckepVar) {
        elfl c;
        ckepVar.getClass();
        c = axol.c(this.aq, ffhe.a, ffsm.a, new clcp(this, ckepVar, null));
        return c;
    }

    public final byyt b(ConversationIdType conversationIdType, String str, boolean z) {
        byyt F = ((bdmq) this.v.b()).F(conversationIdType, str, false, z);
        F.getClass();
        return F;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ckep r9, defpackage.ffgu r10) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clcv.c(ckep, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x020b, code lost:
    
        if (defpackage.ffcu.a != r4) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r2v40, types: [cgrz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v60, types: [cgrz, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ckep r37, defpackage.ffgu r38) {
        /*
            Method dump skipped, instructions count: 2360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clcv.d(ckep, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ckep r9, defpackage.awui r10, defpackage.ffgu r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.clct
            if (r0 == 0) goto L13
            r0 = r11
            clct r0 = (defpackage.clct) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            clct r0 = new clct
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            java.lang.String r3 = "sendDeliveredReportForBlockedUser"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/rcs/incoming/IncomingRcsMessageProcessorKt"
            java.lang.String r5 = "IncomingRcsMessageProcessorKt.kt"
            java.lang.String r6 = "BugleDataModel"
            r7 = 1
            if (r2 == 0) goto L3b
            if (r2 != r7) goto L33
            java.lang.Object r9 = r0.a
            clcv r10 = r0.e
            defpackage.ffci.b(r11)
            goto L78
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            defpackage.ffci.b(r11)
            boolean r11 = r9.t()
            if (r11 != 0) goto L6a
            enru r10 = defpackage.clcv.a
            ensk r10 = r10.e()
            ensn r11 = defpackage.ente.a
            r10.Y(r11, r6)
            enrr r10 = (defpackage.enrr) r10
            ensn r11 = defpackage.csux.f
            bdhg r9 = r9.l()
            r10.Y(r11, r9)
            r9 = 1324(0x52c, float:1.855E-42)
            ensk r9 = r10.h(r4, r3, r9, r5)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r10 = "No need to send a delivered report for blocked user."
            r9.q(r10)
            ffcu r9 = defpackage.ffcu.a
            return r9
        L6a:
            r0.e = r8
            r0.a = r9
            r0.d = r7
            java.lang.Object r11 = r8.f(r9, r10, r0)
            if (r11 != r1) goto L77
            return r1
        L77:
            r10 = r8
        L78:
            ckdq r11 = (defpackage.ckdq) r11
            ffbr r10 = r10.z
            java.lang.Object r10 = r10.b()
            altk r10 = (defpackage.altk) r10
            ckep r9 = (defpackage.ckep) r9
            bdhg r9 = r9.l()
            eqxi r0 = r11.b
            eqyl r11 = r11.c
            r10.ap(r9, r0, r11)
            enru r9 = defpackage.clcv.a
            ensk r9 = r9.e()
            ensn r10 = defpackage.ente.a
            r9.Y(r10, r6)
            r10 = 1337(0x539, float:1.874E-42)
            ensk r9 = r9.h(r4, r3, r10, r5)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r10 = "Stop incoming RCS message processing from blocked user."
            r9.q(r10)
            ffcu r9 = defpackage.ffcu.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clcv.e(ckep, awui, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ckep r12, defpackage.awui r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clcv.f(ckep, awui, ffgu):java.lang.Object");
    }
}

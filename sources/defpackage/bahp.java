package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bahp {
    public static final entd a = entd.c("BugleNotifications");
    public static final entd b = entd.c("BugleDataModel");
    public final ffbr A;
    public final ffbr B;
    public final ffbr C;
    public final ffbr D;
    public final ffbr E;
    public final ffsk F;
    public final ffbr G;
    public final ffbr H;
    public final ffbr I;
    public final AtomicReference J;
    public final ffbr K;
    public final ffbr L;
    public final augw M;
    public final Map N;
    public MessageIdType O;
    public boolean P;
    public final baft Q;
    public final bauj R;
    private final Context S;
    private final ffbr T;
    private final ffbr U;
    private final ffbr V;
    private final ffbr W;
    private final ffbr X;
    private final bdtd Y;
    private final bcvw Z;
    private final asyf aA;
    private final ffbr aa;
    private final csum ab;
    private final coxk ac;
    private final Optional ad;
    private final akzt ae;
    private final bdve af;
    private final ffbr ag;
    private final cbut ah;
    private final aolr ai;
    private final ffbr aj;
    private final ffbr ak;
    private final ffbr al;
    private final ffbr am;
    private final ffbr an;
    private final ffbr ao;
    private final ffbr ap;
    private final ffbr aq;
    private final ffbr ar;
    private final ffbr as;
    private final ffbr at;
    private final ffbr au;
    private final asku av;
    private final errl aw;
    private final bzpo ax;
    private final ffbr ay;
    private final ffbr az;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final cpbw i;
    public final bdxd j;
    public final ffbr k;
    public final ffbr l;
    public final ctml m;
    public final ctud n;
    public final cqoh o;
    public final albq p;
    public final ffbr q;
    public final bdwt r;
    public final cbgf s;
    public final byzp t;
    public final dtuu u;
    public final ffbr v;
    public final ffbr w;
    public final ffbr x;
    public final cipm y;
    public final ffbr z;

    public bahp(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, bdtd bdtdVar, bcvw bcvwVar, cpbw cpbwVar, ffbr ffbrVar12, bdxd bdxdVar, ffbr ffbrVar13, ffbr ffbrVar14, ctml ctmlVar, ctud ctudVar, csum csumVar, coxk coxkVar, Optional optional, cqoh cqohVar, albq albqVar, akzt akztVar, ffbr ffbrVar15, baft baftVar, bdwt bdwtVar, bdve bdveVar, cbgf cbgfVar, bauj baujVar, byzp byzpVar, dtuu dtuuVar, ffbr ffbrVar16, cbut cbutVar, ffbr ffbrVar17, aolr aolrVar, ffbr ffbrVar18, ffbr ffbrVar19, cipm cipmVar, ffbr ffbrVar20, ffbr ffbrVar21, ffbr ffbrVar22, ffbr ffbrVar23, ffbr ffbrVar24, ffbr ffbrVar25, ffbr ffbrVar26, ffbr ffbrVar27, ffbr ffbrVar28, ffbr ffbrVar29, ffbr ffbrVar30, ffbr ffbrVar31, ffbr ffbrVar32, ffbr ffbrVar33, ffbr ffbrVar34, ffbr ffbrVar35, ffbr ffbrVar36, ffbr ffbrVar37, asku askuVar, errl errlVar, ffsk ffskVar, bzpo bzpoVar, areq areqVar, ffbr ffbrVar38, ffbr ffbrVar39, ffbr ffbrVar40, AtomicReference atomicReference, ffbr ffbrVar41, ffbr ffbrVar42, ffbr ffbrVar43, ffbr ffbrVar44, asyf asyfVar, asqi asqiVar, augw augwVar) {
        context.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        ffbrVar10.getClass();
        ffbrVar11.getClass();
        bdtdVar.getClass();
        bcvwVar.getClass();
        cpbwVar.getClass();
        ffbrVar12.getClass();
        bdxdVar.getClass();
        ffbrVar13.getClass();
        ffbrVar14.getClass();
        ctmlVar.getClass();
        ctudVar.getClass();
        csumVar.getClass();
        coxkVar.getClass();
        cqohVar.getClass();
        albqVar.getClass();
        akztVar.getClass();
        ffbrVar15.getClass();
        bdwtVar.getClass();
        bdveVar.getClass();
        cbgfVar.getClass();
        baujVar.getClass();
        byzpVar.getClass();
        dtuuVar.getClass();
        ffbrVar16.getClass();
        cbutVar.getClass();
        ffbrVar17.getClass();
        aolrVar.getClass();
        ffbrVar18.getClass();
        ffbrVar19.getClass();
        cipmVar.getClass();
        ffbrVar20.getClass();
        ffbrVar21.getClass();
        ffbrVar22.getClass();
        ffbrVar23.getClass();
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
        errlVar.getClass();
        ffskVar.getClass();
        areqVar.getClass();
        ffbrVar38.getClass();
        ffbrVar39.getClass();
        ffbrVar40.getClass();
        atomicReference.getClass();
        ffbrVar41.getClass();
        ffbrVar42.getClass();
        ffbrVar43.getClass();
        ffbrVar44.getClass();
        asyfVar.getClass();
        asqiVar.getClass();
        augwVar.getClass();
        this.S = context;
        this.T = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.U = ffbrVar4;
        this.e = ffbrVar5;
        this.V = ffbrVar6;
        this.f = ffbrVar7;
        this.g = ffbrVar8;
        this.W = ffbrVar9;
        this.h = ffbrVar10;
        this.X = ffbrVar11;
        this.Y = bdtdVar;
        this.Z = bcvwVar;
        this.i = cpbwVar;
        this.aa = ffbrVar12;
        this.j = bdxdVar;
        this.k = ffbrVar13;
        this.l = ffbrVar14;
        this.m = ctmlVar;
        this.n = ctudVar;
        this.ab = csumVar;
        this.ac = coxkVar;
        this.ad = optional;
        this.o = cqohVar;
        this.p = albqVar;
        this.ae = akztVar;
        this.q = ffbrVar15;
        this.Q = baftVar;
        this.r = bdwtVar;
        this.af = bdveVar;
        this.s = cbgfVar;
        this.R = baujVar;
        this.t = byzpVar;
        this.u = dtuuVar;
        this.ag = ffbrVar16;
        this.ah = cbutVar;
        this.v = ffbrVar17;
        this.ai = aolrVar;
        this.w = ffbrVar18;
        this.x = ffbrVar19;
        this.y = cipmVar;
        this.z = ffbrVar20;
        this.aj = ffbrVar21;
        this.A = ffbrVar22;
        this.ak = ffbrVar23;
        this.al = ffbrVar24;
        this.am = ffbrVar25;
        this.an = ffbrVar26;
        this.B = ffbrVar27;
        this.ao = ffbrVar28;
        this.C = ffbrVar29;
        this.ap = ffbrVar30;
        this.D = ffbrVar31;
        this.E = ffbrVar32;
        this.aq = ffbrVar33;
        this.ar = ffbrVar34;
        this.as = ffbrVar35;
        this.at = ffbrVar36;
        this.au = ffbrVar37;
        this.av = askuVar;
        this.aw = errlVar;
        this.F = ffskVar;
        this.ax = bzpoVar;
        this.G = ffbrVar38;
        this.H = ffbrVar39;
        this.I = ffbrVar40;
        this.J = atomicReference;
        this.ay = ffbrVar41;
        this.az = ffbrVar42;
        this.K = ffbrVar43;
        this.L = ffbrVar44;
        this.aA = asyfVar;
        this.M = augwVar;
        this.N = new LinkedHashMap();
        this.O = bdhb.a;
    }

    public static final Collection k(MessageCoreData messageCoreData) {
        ArrayList arrayList = new ArrayList();
        if (((Boolean) cjja.a.e()).booleanValue()) {
            List ab = messageCoreData.ab();
            if (!ab.isEmpty()) {
                Iterator it = ab.iterator();
                while (it.hasNext()) {
                    if (((MessagePartCoreData) it.next()).bm()) {
                        arrayList.add(messageCoreData);
                        return arrayList;
                    }
                }
            }
        }
        if (messageCoreData.c() == 1) {
            arrayList.add(messageCoreData);
            return arrayList;
        }
        for (MessagePartCoreData messagePartCoreData : messageCoreData.ab()) {
            MessageCoreData x = messageCoreData.x();
            if (messageCoreData.cX() && messagePartCoreData.o() != 0) {
                x.bX(messagePartCoreData.o());
            }
            x.aL(messagePartCoreData);
            ((MessageData) x).j.n("split_rcs");
            arrayList.add(x);
        }
        return arrayList;
    }

    private final void l(MessageCoreData messageCoreData, boolean z, long j) {
        ekzz f = eleg.f("InsertNewMessageProcessor::logMmsOrRcsMessageInserted");
        try {
            String str = messageCoreData.cP() ? z ? "Bugle.UI.ConversationActivity.Send.Duration.Mms.Text" : "Bugle.UI.ConversationActivity.Send.Duration.Mms.Attachment" : z ? "Bugle.UI.ConversationActivity.Send.Duration.Rcs.Text" : "Bugle.UI.ConversationActivity.Send.Duration.Rcs.Attachment";
            if (j != 0) {
                this.p.d(str, messageCoreData.B().b(), j);
            }
            ffig.a(f, null);
        } finally {
        }
    }

    public final Integer a(bcyk bcykVar, MessageCoreData messageCoreData, int i, int i2, eooi eooiVar) {
        aztg aztgVar;
        String str;
        messageCoreData.getClass();
        eooiVar.getClass();
        ekzz f = eleg.f("INMA::getSubscription");
        try {
            if (i != -1) {
                aztgVar = this.Y.g(i);
                aztgVar.getClass();
                if (((Boolean) ((cfup) wfa.a.get()).e()).booleanValue()) {
                    ((ensz) b.h()).J("InsertNewMessageProcessor#getSubscription: draftId=%s using subId=%s from param subId=%s", messageCoreData.aI(), Integer.valueOf(aztgVar.e()), Integer.valueOf(i));
                }
            } else {
                SelfIdentityId v = messageCoreData.v();
                if (v == null) {
                    v = bcykVar.f();
                    if (((Boolean) ((cfup) wfa.a.get()).e()).booleanValue()) {
                        ((ensz) b.h()).D("InsertNewMessageProcessor#getSubscription: draftId=%s had no self, so conversation self subId=%s", messageCoreData.aI(), v);
                    }
                }
                aztg f2 = this.Y.f(v);
                Optional empty = i2 == -1 ? Optional.empty() : Optional.of(Integer.valueOf(i2));
                if (f2 != null && f2.j() && empty.isPresent()) {
                    aztg g = this.Y.g(((Number) empty.get()).intValue());
                    g.getClass();
                    if (((Boolean) ((cfup) wfa.a.get()).e()).booleanValue()) {
                        ((ensz) b.h()).K("InsertNewMessageProcessor#getSubscription: draftId=%s using subId=%s for lockedDefaultSmsSubId=%s, instead of subId=%s", messageCoreData.aI(), Integer.valueOf(g.e()), empty.get(), Integer.valueOf(f2.e()));
                    }
                    aztgVar = g;
                } else {
                    if (((Boolean) ((cfup) wfa.a.get()).e()).booleanValue()) {
                        ensz enszVar = (ensz) b.h();
                        UUID aI = messageCoreData.aI();
                        if (f2 == null || (str = Integer.valueOf(f2.e()).toString()) == null) {
                            str = "(null)";
                        }
                        enszVar.D("InsertNewMessageProcessor#getSubscription: draftId=%s using subId=%s", aI, str);
                    }
                    aztgVar = f2;
                }
            }
            if (aztgVar == null) {
                ffig.a(f, null);
                return null;
            }
            ffig.a(f, null);
            SelfIdentityId g2 = aztgVar.g();
            messageCoreData.aO(g2);
            messageCoreData.aP(g2);
            if (messageCoreData.d() == 3 && messageCoreData.ag().isEmpty()) {
                f = eleg.f("INMA::getSenderMessagingIdentityEmpty");
                try {
                    int a2 = ((ctwb) this.as.b()).h(aztgVar.e()).a();
                    try {
                        messageCoreData.bQ(this.ai.b(((ckac) this.ap.b()).b(a2)));
                        ffig.a(f, null);
                    } catch (cjzk unused) {
                        ((ensz) b.j()).K("InsertNewMessageProcessor#setSelfDetailsAndGetSubId: Cannot determine the RCS Self Identity for draftId=%s using SelfParticipant=%s subId=%s, effectiveSubId=%s", messageCoreData.aI(), g2, Integer.valueOf(aztgVar.e()), Integer.valueOf(a2));
                        ((altk) this.q.b()).Q(messageCoreData, aztgVar.e(), bcykVar.L(), eooiVar);
                        ffig.a(f, null);
                        return null;
                    }
                } finally {
                }
            }
            ((ensz) b.h()).J("InsertNewMessageProcessor#setSelfDetailsAndGetSubId: draftId=%s using SelfParticipant=%s and subId=%s", messageCoreData.aI(), g2, Integer.valueOf(aztgVar.e()));
            return Integer.valueOf(aztgVar.e());
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0576 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x053a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r28, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r29, boolean r30, boolean r31, java.util.List r32, java.util.List r33, java.util.List r34, defpackage.ffgu r35) {
        /*
            Method dump skipped, instructions count: 1400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bahp.b(int, java.lang.String, java.lang.String, java.lang.String, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, boolean, boolean, java.util.List, java.util.List, java.util.List, ffgu):java.lang.Object");
    }

    public final void c(MessageCoreData messageCoreData) {
        final MessageCoreData x = messageCoreData.x();
        Iterator it = messageCoreData.ab().iterator();
        while (it.hasNext()) {
            x.aL((MessagePartCoreData) it.next());
        }
        ekzz f = eleg.f("InsertNewMessageProcessor::onPendingNewMessage");
        try {
            ((azei) this.at.b()).d(new Consumer() { // from class: bago
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cbvx cbvxVar = (cbvx) obj;
                    entd entdVar = bahp.a;
                    cbvxVar.getClass();
                    cbvxVar.b(MessageCoreData.this);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ffig.a(f, null);
        } finally {
        }
    }

    public final void d(final bagm bagmVar) {
        this.u.b(new emyl() { // from class: bagw
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:198:0x0292 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:240:0x066a A[Catch: all -> 0x067a, TryCatch #12 {all -> 0x067a, blocks: (B:106:0x064f, B:108:0x0654, B:109:0x0657, B:119:0x0666, B:120:0x0669, B:240:0x066a, B:241:0x0679, B:116:0x0664), top: B:50:0x01bb, inners: #3 }] */
            /* JADX WARN: Removed duplicated region for block: B:250:0x0180  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00e5 A[Catch: all -> 0x0025, TRY_ENTER, TryCatch #5 {all -> 0x0025, blocks: (B:255:0x0022, B:10:0x0042, B:13:0x0049, B:17:0x005e, B:22:0x0091, B:24:0x009b, B:30:0x00e5, B:32:0x00fd, B:34:0x010a, B:41:0x0129, B:43:0x0155, B:44:0x0177, B:47:0x019e, B:49:0x01a6, B:55:0x01e1, B:61:0x01f8, B:199:0x0292, B:203:0x02a8, B:211:0x02b0, B:212:0x02b3, B:69:0x02d6, B:71:0x02ed, B:75:0x030a, B:77:0x0322, B:79:0x032f, B:99:0x036f, B:216:0x02b5, B:214:0x02c2, B:225:0x0206, B:232:0x0228, B:236:0x0235, B:239:0x023e, B:245:0x0164, B:247:0x0170, B:248:0x017a, B:249:0x017f), top: B:254:0x0022, inners: #15 }] */
            /* JADX WARN: Removed duplicated region for block: B:41:0x0129 A[Catch: all -> 0x0025, TRY_ENTER, TryCatch #5 {all -> 0x0025, blocks: (B:255:0x0022, B:10:0x0042, B:13:0x0049, B:17:0x005e, B:22:0x0091, B:24:0x009b, B:30:0x00e5, B:32:0x00fd, B:34:0x010a, B:41:0x0129, B:43:0x0155, B:44:0x0177, B:47:0x019e, B:49:0x01a6, B:55:0x01e1, B:61:0x01f8, B:199:0x0292, B:203:0x02a8, B:211:0x02b0, B:212:0x02b3, B:69:0x02d6, B:71:0x02ed, B:75:0x030a, B:77:0x0322, B:79:0x032f, B:99:0x036f, B:216:0x02b5, B:214:0x02c2, B:225:0x0206, B:232:0x0228, B:236:0x0235, B:239:0x023e, B:245:0x0164, B:247:0x0170, B:248:0x017a, B:249:0x017f), top: B:254:0x0022, inners: #15 }] */
            /* JADX WARN: Removed duplicated region for block: B:52:0x01bd A[Catch: all -> 0x067c, TRY_LEAVE, TryCatch #13 {all -> 0x067c, blocks: (B:3:0x001c, B:7:0x002b, B:14:0x0050, B:20:0x0072, B:27:0x00b0, B:39:0x0112, B:45:0x018a, B:52:0x01bd, B:56:0x01ec, B:65:0x0282, B:67:0x02cd, B:73:0x02f6, B:81:0x0338, B:104:0x0631, B:229:0x021d, B:233:0x022b, B:237:0x0238, B:244:0x01af, B:253:0x004e), top: B:2:0x001c }] */
            /* JADX WARN: Removed duplicated region for block: B:69:0x02d6 A[Catch: all -> 0x0025, TRY_ENTER, TryCatch #5 {all -> 0x0025, blocks: (B:255:0x0022, B:10:0x0042, B:13:0x0049, B:17:0x005e, B:22:0x0091, B:24:0x009b, B:30:0x00e5, B:32:0x00fd, B:34:0x010a, B:41:0x0129, B:43:0x0155, B:44:0x0177, B:47:0x019e, B:49:0x01a6, B:55:0x01e1, B:61:0x01f8, B:199:0x0292, B:203:0x02a8, B:211:0x02b0, B:212:0x02b3, B:69:0x02d6, B:71:0x02ed, B:75:0x030a, B:77:0x0322, B:79:0x032f, B:99:0x036f, B:216:0x02b5, B:214:0x02c2, B:225:0x0206, B:232:0x0228, B:236:0x0235, B:239:0x023e, B:245:0x0164, B:247:0x0170, B:248:0x017a, B:249:0x017f), top: B:254:0x0022, inners: #15 }] */
            /* JADX WARN: Removed duplicated region for block: B:73:0x02f6 A[Catch: all -> 0x067c, TRY_ENTER, TRY_LEAVE, TryCatch #13 {all -> 0x067c, blocks: (B:3:0x001c, B:7:0x002b, B:14:0x0050, B:20:0x0072, B:27:0x00b0, B:39:0x0112, B:45:0x018a, B:52:0x01bd, B:56:0x01ec, B:65:0x0282, B:67:0x02cd, B:73:0x02f6, B:81:0x0338, B:104:0x0631, B:229:0x021d, B:233:0x022b, B:237:0x0238, B:244:0x01af, B:253:0x004e), top: B:2:0x001c }] */
            /* JADX WARN: Type inference failed for: r12v0, types: [ekzz, java.io.Closeable] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
            /* JADX WARN: Type inference failed for: r1v4 */
            /* JADX WARN: Type inference failed for: r1v97 */
            @Override // defpackage.emyl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object get() {
                /*
                    Method dump skipped, instructions count: 1669
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bagw.get():java.lang.Object");
            }
        });
    }

    public final void e(MessageCoreData messageCoreData, int i, int i2, long j) {
        MessageCoreData messageCoreData2;
        if (this.P) {
            messageCoreData.bk(j);
        }
        this.ah.j(messageCoreData);
        MessageIdType a2 = ((bdjr) this.v.b()).a(messageCoreData);
        a2.getClass();
        if (this.aA.a()) {
            ((altk) this.q.b()).J(messageCoreData, Integer.valueOf(i), i2, (eonp) new bahl().fP(((axkm) this.H.b()).D()));
            messageCoreData2 = messageCoreData;
        } else if (this.J.get() == fglt.UNKNOWN_CLOUD_SYNC_STATUS) {
            messageCoreData2 = messageCoreData;
            axol.c(this.F, ffhe.a, ffsm.a, new baho(this, messageCoreData2, i, i2, null));
        } else {
            messageCoreData2 = messageCoreData;
            ((altk) this.q.b()).J(messageCoreData2, Integer.valueOf(i), i2, (eonp) new bahl().fP(this.J.get()));
        }
        if (messageCoreData2.cX() && messageCoreData2.B().c() && !messageCoreData2.cm()) {
            messageCoreData2.cd(a2);
        }
    }

    public final void f(final bcyk bcykVar, final int i, final MessageCoreData messageCoreData, long j, final long j2, final Action action) {
        ContentType contentType;
        messageCoreData.getClass();
        final ConversationIdType z = messageCoreData.z();
        z.getClass();
        int c = messageCoreData.c();
        ekzz f = eleg.f("InsertNewMessageProcessor::processParts");
        try {
            boolean z2 = true;
            if (c != 1) {
                z2 = false;
            }
            boolean z3 = z2;
            for (MessagePartCoreData messagePartCoreData : messageCoreData.ab()) {
                bdpt bdptVar = (bdpt) this.V.b();
                ekzz f2 = eleg.f("MessagePartDatabaseOperations#readMessagePartProcessingFieldsFromDraft");
                try {
                    if (messagePartCoreData.w() != null) {
                        final Uri w = messagePartCoreData.w();
                        bkfe a2 = bkfh.a();
                        a2.z("readMessagePartProcessingFieldsFromDraft");
                        a2.c(new Function() { // from class: bdpi
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                Object apply;
                                bkfg bkfgVar = (bkfg) obj;
                                final Uri uri = w;
                                Function[] functionArr = {new Function() { // from class: bdpj
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        bkfg bkfgVar2 = (bkfg) obj2;
                                        int intValue = bkfh.c().intValue();
                                        if (intValue < 4020) {
                                            dtub.w("output_uri", intValue);
                                        }
                                        bkfgVar2.aq(new dtrt("draft_parts_view.processing_output_uri_parts", 1, uri));
                                        return bkfgVar2;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }, new Function() { // from class: bdpk
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        bkfg bkfgVar2 = (bkfg) obj2;
                                        bkfgVar2.aq(new dtrt("draft_parts_view.uri_parts", 1, uri));
                                        return bkfgVar2;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }};
                                bkfg[] bkfgVarArr = new bkfg[2];
                                for (int i2 = 0; i2 < 2; i2++) {
                                    Function function = functionArr[i2];
                                    String[] strArr = bkfh.a;
                                    apply = function.apply(new bkfg());
                                    bkfgVarArr[i2] = (bkfg) apply;
                                }
                                bkfgVar.ar(bkfgVarArr);
                                return bkfgVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bjvm bjvmVar = (bjvm) ((bkfc) a2.b().o()).cS();
                        if (bjvmVar != null) {
                            messagePartCoreData.aS(((bcwz) bdptVar.a.b()).d(bjvmVar));
                        }
                    }
                    f2.close();
                    z3 &= messagePartCoreData.bA();
                    if (messagePartCoreData.aT()) {
                        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), this.S.getResources().getString(R.string.app_name));
                        messagePartCoreData.getClass();
                        Context context = this.S;
                        Uri v = messagePartCoreData.v();
                        v.getClass();
                        Uri i2 = csuu.i(context, v, file, messagePartCoreData.V(), null, this.ab);
                        messagePartCoreData.aD(i2);
                        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                        intent.setData(i2);
                        this.S.sendBroadcast(intent);
                    }
                    if (ffkj.e(messagePartCoreData.V(), "video/mpeg") || ffkj.e(messagePartCoreData.V(), "video/mpeg4")) {
                        messagePartCoreData.at("video/mp4");
                    }
                } catch (Throwable th) {
                    try {
                        f2.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            ffig.a(f, null);
            MessagePartCoreData G = messageCoreData.G();
            awap z4 = G != null ? G.z() : null;
            if (((asnv) this.az.b()).a() && messageCoreData.cX() && z4 != null) {
                ensz enszVar = (ensz) b.h();
                enszVar.Y(cqpo.j, z4);
                enszVar.q("InsertNewMessageProcessor: Inserting RCS message with pending file processing.");
                this.af.b(messageCoreData, i, null, j2);
                this.u.c("InsertNewMessageProcessor#insertSendingRcsMessage", new emyl() { // from class: bagy
                    @Override // defpackage.emyl
                    public final Object get() {
                        bahp bahpVar = bahp.this;
                        MessageCoreData messageCoreData2 = messageCoreData;
                        int L = bcykVar.L();
                        int i3 = i;
                        long j3 = j2;
                        bahpVar.e(messageCoreData2, L, i3, j3);
                        if (!messageCoreData2.cF()) {
                            if (((atsj) bahpVar.L.b()).a()) {
                                ((bdfl) bahpVar.g.b()).h(messageCoreData2.z(), messageCoreData2.B(), Long.valueOf(j3), byyt.UNARCHIVED, null, false, -1L, null, messageCoreData2.v());
                            } else {
                                ((bdfl) bahpVar.g.b()).e(messageCoreData2.z(), messageCoreData2.B(), Long.valueOf(j3), byyt.UNARCHIVED, false);
                            }
                        }
                        return ffcu.a;
                    }
                });
                l(messageCoreData, z3, j);
                return;
            }
            final List b2 = this.af.b(messageCoreData, i, null, j2);
            final int L = bcykVar.L();
            Object c2 = this.u.c("InsertNewMessageProcessor#insertSendingMmsOrRcsMessage", new emyl() { // from class: bagv
                @Override // defpackage.emyl
                public final Object get() {
                    bahp bahpVar = bahp.this;
                    MessageCoreData messageCoreData2 = messageCoreData;
                    int i3 = L;
                    int i4 = i;
                    long j3 = j2;
                    bahpVar.e(messageCoreData2, i3, i4, j3);
                    ArrayList arrayList = new ArrayList();
                    bbgl.a(b2, arrayList);
                    if (!messageCoreData2.cF()) {
                        ConversationIdType conversationIdType = z;
                        if (((atsj) bahpVar.L.b()).a()) {
                            ((bdfl) bahpVar.g.b()).h(conversationIdType, messageCoreData2.B(), Long.valueOf(j3), byyt.UNARCHIVED, null, false, -1L, null, messageCoreData2.v());
                            return arrayList;
                        }
                        ((bdfl) bahpVar.g.b()).e(conversationIdType, messageCoreData2.B(), Long.valueOf(j3), byyt.UNARCHIVED, false);
                    }
                    return arrayList;
                }
            });
            c2.getClass();
            this.O = messageCoreData.B();
            l(messageCoreData, z3, j);
            for (final MessagePartCoreData messagePartCoreData2 : (List) c2) {
                final bzpo bzpoVar = this.ax;
                ekzz f3 = eleg.f("MessagePartProcessor#process");
                try {
                    if (messagePartCoreData2.t() != null) {
                        if (messagePartCoreData2.V() != null) {
                            String V = messagePartCoreData2.V();
                            V.getClass();
                            contentType = awuq.e(V);
                        } else {
                            contentType = null;
                        }
                        ensk h = bzpo.a.h();
                        h.Y(ente.a, "BugleEarlyProcessing");
                        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/earlyprocessing/MessagePartProcessor", "processInTrace", 58, "MessagePartProcessor.java")).D("Original content type: %s. Resolved content type: %s", messagePartCoreData2.V(), contentType);
                        cbit cbitVar = (cbit) bzpoVar.b.b();
                        Uri t = messagePartCoreData2.t();
                        t.getClass();
                        axnw.e(cbitVar.a(t, messagePartCoreData2.p(), contentType).i(new eroh() { // from class: bzpn
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj) {
                                byzc byzcVar;
                                cbjc cbjcVar = (cbjc) obj;
                                try {
                                    int b3 = cbjb.b(cbjcVar.c);
                                    if (b3 == 0) {
                                        b3 = 1;
                                    }
                                    int i3 = b3 - 2;
                                    if (i3 == 1) {
                                        byzcVar = byzc.SUCCEEDED;
                                    } else if (i3 == 2) {
                                        byzcVar = byzc.FAILED;
                                    } else if (i3 == 3) {
                                        byzcVar = byzc.TOO_LARGE;
                                    } else {
                                        if (i3 != 4) {
                                            throw new IllegalArgumentException("Unspecified ResizingStatus");
                                        }
                                        byzcVar = byzc.PENDING;
                                    }
                                } catch (IllegalArgumentException e) {
                                    ensk j3 = bzpo.a.j();
                                    j3.Y(ente.a, "BugleEarlyProcessing");
                                    ((enrr) ((enrr) ((enrr) j3).g(e)).h("com/google/android/apps/messaging/shared/datamodel/earlyprocessing/MessagePartProcessor", "processInTrace", 'N', "MessagePartProcessor.java")).q("Cannot convert to MessageProcessingStatus");
                                    byzcVar = byzc.FAILED;
                                }
                                final byzc byzcVar2 = byzcVar;
                                awup awupVar = cbjcVar.e;
                                if (awupVar == null) {
                                    awupVar = awup.a;
                                }
                                final ContentType d = awuq.d(awupVar);
                                ensk h2 = bzpo.a.h();
                                h2.Y(ente.a, "BugleEarlyProcessing");
                                enrr enrrVar = (enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/datamodel/earlyprocessing/MessagePartProcessor", "processInTrace", 85, "MessagePartProcessor.java");
                                awup awupVar2 = cbjcVar.e;
                                if (awupVar2 == null) {
                                    awupVar2 = awup.a;
                                }
                                final Action action2 = action;
                                final MessagePartCoreData messagePartCoreData3 = messagePartCoreData2;
                                bzpo bzpoVar2 = bzpo.this;
                                enrrVar.D("Original content type: %s. Resolved content type: %s", awupVar2, d);
                                final cbjl cbjlVar = (cbjl) bzpoVar2.d.b();
                                final String str = cbjcVar.d;
                                ensk h3 = cbjl.a.h();
                                h3.Y(ente.a, "BugleResizing");
                                ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/UpdateMessagePartAfterResizingHelper", "update", 91, "UpdateMessagePartAfterResizingHelper.java")).q("UpdateMessagePartAfterResizingHelper executeInScope");
                                ((dtuu) cbjlVar.e.b()).b(new emyl() { // from class: cbjk
                                    @Override // defpackage.emyl
                                    public final Object get() {
                                        cbjl.this.a(messagePartCoreData3, str, d, byzcVar2, action2);
                                        return null;
                                    }
                                });
                                return erre.a;
                            }
                        }, bzpoVar.c));
                    }
                    f3.close();
                } finally {
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                ffig.a(f, th3);
                throw th4;
            }
        }
    }

    public final void g(final bcyk bcykVar, final int i, final MessageCoreData messageCoreData, long j, List list, final byyt byytVar) {
        ekzz ekzzVar;
        Throwable th;
        ekzz ekzzVar2;
        final bahp bahpVar;
        final int i2;
        MessageCoreData messageCoreData2;
        final ConversationIdType conversationIdType;
        long j2;
        String str;
        boolean z;
        Throwable th2;
        cpxu a2;
        ConversationIdType conversationIdType2;
        cpxu cpxuVar;
        ConversationIdType conversationIdType3;
        String str2;
        final Uri n;
        long j3;
        final bahp bahpVar2;
        final boolean z2;
        String str3;
        final ConversationIdType conversationIdType4;
        cpxu a3;
        ekzz f = eleg.f("InsertNewMessageProcessor::insertSendingSms");
        try {
            long epochMilli = this.o.f().toEpochMilli();
            ConversationIdType z3 = messageCoreData.z();
            z3.getClass();
            try {
                if (list.size() > 1) {
                    final long j4 = 1 + epochMilli;
                    try {
                        entd entdVar = b;
                        ensk o = entdVar.o();
                        o.Y(csux.a, messageCoreData.B().b());
                        o.s("InsertNewMessageProcessor: Inserting broadcast SMS {x-message-id:%d}.", messageCoreData.t());
                        ((coxg) this.ag.b()).i(j4);
                        if (((Boolean) ayhv.a.e()).booleanValue()) {
                            try {
                                a3 = ((ayfi) this.ak.b()).a(z3);
                                a3.getClass();
                            } catch (Throwable th3) {
                                th = th3;
                                ekzzVar = f;
                                try {
                                    throw th;
                                } catch (Throwable th4) {
                                    ffig.a(ekzzVar, th);
                                    throw th4;
                                }
                            }
                        } else {
                            a3 = ((cbek) this.X.b()).a(z3);
                            a3.getClass();
                        }
                        cpxu cpxuVar2 = a3;
                        String v = bdqu.v(list);
                        v.getClass();
                        ekzzVar2 = f;
                        j2 = epochMilli;
                        str = "Bugle.UI.ConversationActivity.Send.Duration.Sms";
                        try {
                            final Uri n2 = this.ac.n(this.S, Telephony.Sms.CONTENT_URI, i, v, messageCoreData.as(), j4, 0, 2, cpxuVar2, null, messageCoreData.ad());
                            i2 = i;
                            if (n2 == null || TextUtils.isEmpty(n2.toString())) {
                                messageCoreData2 = messageCoreData;
                                conversationIdType = z3;
                                bahpVar = this;
                                ensz enszVar = (ensz) entdVar.i();
                                enszVar.Y(csux.a, messageCoreData2.B().b());
                                enszVar.q("InsertNewMessageProcessor: No uri for broadcast SMS. Message inserted into telephony DB.");
                            } else {
                                conversationIdType = z3;
                                try {
                                    bahpVar = this;
                                    this.u.d("InsertNewMessageProcessor#insertFakeBroadcastSmsMessage", new Runnable() { // from class: bagx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            MessageCoreData messageCoreData3 = MessageCoreData.this;
                                            ConversationIdType conversationIdType5 = conversationIdType;
                                            Uri uri = n2;
                                            long j5 = j4;
                                            messageCoreData3.cf(conversationIdType5, uri, j5);
                                            messageCoreData3.bl(j5);
                                            bahp bahpVar3 = this;
                                            ((bdjr) bahpVar3.v.b()).a(messageCoreData3);
                                            ((bdfl) bahpVar3.g.b()).e(conversationIdType5, messageCoreData3.B(), Long.valueOf(j5), byyt.UNARCHIVED, false);
                                        }
                                    });
                                    ensk n3 = entdVar.n();
                                    n3.Y(csux.a, messageCoreData.B().b());
                                    n3.C("InsertNewMessageProcessor: Inserted broadcast SMS. (uri=%s) {x-message-id:%d}", messageCoreData.u(), messageCoreData.t());
                                    if (j != 0) {
                                        bahpVar.p.d(str, messageCoreData.B().b(), j);
                                    }
                                    messageCoreData2 = messageCoreData;
                                    ((altk) bahpVar.q.b()).ag(messageCoreData2);
                                } catch (Throwable th5) {
                                    th = th5;
                                    bahpVar = this;
                                    th = th;
                                    ekzzVar = ekzzVar2;
                                    throw th;
                                }
                            }
                            z = true;
                        } catch (Throwable th6) {
                            th2 = th6;
                            th = th2;
                            ekzzVar = ekzzVar2;
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th2 = th7;
                        ekzzVar2 = f;
                    }
                } else {
                    i2 = i;
                    messageCoreData2 = messageCoreData;
                    conversationIdType = z3;
                    bahpVar = this;
                    j2 = epochMilli;
                    ekzzVar2 = f;
                    str = "Bugle.UI.ConversationActivity.Send.Duration.Sms";
                    z = false;
                }
            } catch (Throwable th8) {
                th = th8;
            }
            try {
                if (list.size() > 1) {
                    conversationIdType = bdgq.a;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                        final long j5 = j2;
                        ((coxg) bahpVar.ag.b()).i(j5);
                        if (!conversationIdType.b()) {
                            a2 = ((Boolean) ayhv.a.e()).booleanValue() ? ((ayfi) bahpVar.ak.b()).a(conversationIdType) : ((cbek) bahpVar.X.b()).a(conversationIdType);
                            conversationIdType2 = conversationIdType;
                        } else if (((Boolean) ayhv.a.e()).booleanValue()) {
                            final aoku u = bahpVar.ai.u(bindData.U(), i2);
                            final ffix ffixVar = new ffix() { // from class: baha
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    cpye cpyeVar = (cpye) bahp.this.A.b();
                                    aoku aokuVar = u;
                                    emyw.e(aokuVar);
                                    return cpyeVar.c(aokuVar, i2, !((asgl) r0.G.b()).a());
                                }
                            };
                            ConversationIdType C = ((ayif) bahpVar.aj.b()).a(u, new ffbr() { // from class: bahb
                                @Override // defpackage.ffbr, defpackage.ffbq
                                public final Object b() {
                                    entd entdVar2 = bahp.a;
                                    return ffix.this.invoke();
                                }
                            }).C();
                            a2 = ((ayfi) bahpVar.ak.b()).a(C);
                            conversationIdType2 = C;
                        } else {
                            long c = ((covs) bahpVar.aa.b()).c(bindData);
                            cpxu b2 = cpxu.b(c);
                            conversationIdType2 = ((bdgb) bahpVar.W.b()).d(c, byytVar, bindData);
                            cpxuVar = b2;
                            final String as = messageCoreData2.as();
                            UUID aI = messageCoreData2.aI();
                            Optional ad = messageCoreData2.ad();
                            ad.getClass();
                            conversationIdType3 = conversationIdType;
                            str2 = str;
                            n = bahpVar.ac.n(bahpVar.S, Telephony.Sms.CONTENT_URI, i, bindData.W(), as, j5, -1, 2, cpxuVar, aI, ad);
                            if (n != null || TextUtils.isEmpty(n.toString())) {
                                j3 = j;
                                bahpVar2 = bahpVar;
                                z2 = z;
                                str3 = str2;
                                conversationIdType4 = conversationIdType3;
                                ((ensz) b.i()).q("InsertNewMessageProcessor: No uri for SMS inserted into telephony DB.");
                            } else {
                                bahpVar2 = bahpVar;
                                z2 = z;
                                final ConversationIdType conversationIdType5 = conversationIdType2;
                                conversationIdType4 = conversationIdType3;
                                try {
                                    Object c2 = bahpVar.u.c("InsertNewMessageProcessor#insertSendingSmsMessage", new emyl() { // from class: bahc
                                        @Override // defpackage.emyl
                                        public final Object get() {
                                            MessageCoreData messageCoreData3 = messageCoreData;
                                            ConversationIdType conversationIdType6 = conversationIdType5;
                                            SelfIdentityId v2 = messageCoreData3.v();
                                            bahp bahpVar3 = bahp.this;
                                            MessageCoreData i3 = bahpVar3.t.i(conversationIdType6, v2, as);
                                            Uri uri = n;
                                            long j6 = j5;
                                            i3.cf(conversationIdType6, uri, j6);
                                            int L = bcykVar.L();
                                            ((MessageData) i3).k = messageCoreData3.y();
                                            i3.ca(messageCoreData3.aE());
                                            i3.bt(messageCoreData3.aI());
                                            i3.bx(messageCoreData3.cF());
                                            i3.bX(messageCoreData3.t());
                                            fjay aJ = messageCoreData3.aJ();
                                            if (aJ != null) {
                                                i3.bW(aJ);
                                            }
                                            ConversationIdType conversationIdType7 = conversationIdType4;
                                            bahpVar3.e(i3, L, i, j6);
                                            if (!conversationIdType7.b()) {
                                                byyt byytVar2 = byytVar;
                                                boolean z4 = z2;
                                                bdfl bdflVar = (bdfl) bahpVar3.g.b();
                                                MessageIdType B = i3.B();
                                                if (true == z4) {
                                                    j6 = 0;
                                                }
                                                bdflVar.h(conversationIdType6, B, Long.valueOf(j6), byytVar2, null, false, -1L, null, i3.v());
                                            }
                                            return i3;
                                        }
                                    });
                                    c2.getClass();
                                    MessageCoreData messageCoreData3 = (MessageCoreData) c2;
                                    bahpVar2.h(messageCoreData3);
                                    bahpVar2.O = messageCoreData3.B();
                                    entd entdVar2 = b;
                                    ensk n4 = entdVar2.n();
                                    n4.Y(csux.a, bahpVar2.O.b());
                                    n4.q("InsertNewMessageProcessor: inserted.");
                                    ensz enszVar2 = (ensz) entdVar2.h();
                                    enszVar2.Y(csux.a, messageCoreData3.B().b());
                                    enszVar2.Y(csux.o, messageCoreData3.z().toString());
                                    enszVar2.J("InsertNewMessageProcessor: Inserted SMS. (uri=%s, receivedTimestamp=%d {x-message-id:%d})", messageCoreData3.u(), Long.valueOf(messageCoreData3.o()), Long.valueOf(messageCoreData3.t()));
                                    if (j != 0) {
                                        j3 = j;
                                        str3 = str2;
                                        bahpVar2.p.d(str3, messageCoreData3.B().b(), j3);
                                    } else {
                                        i2 = i;
                                        messageCoreData2 = messageCoreData;
                                        bahpVar = bahpVar2;
                                        j2 = j5;
                                        conversationIdType = conversationIdType4;
                                        z = z2;
                                        str = str2;
                                    }
                                } catch (Throwable th9) {
                                    th2 = th9;
                                    th = th2;
                                    ekzzVar = ekzzVar2;
                                    throw th;
                                }
                            }
                            i2 = i;
                            bahpVar = bahpVar2;
                            j2 = j5;
                            conversationIdType = conversationIdType4;
                            z = z2;
                            messageCoreData2 = messageCoreData;
                            str = str3;
                        }
                        cpxuVar = a2;
                        final String as2 = messageCoreData2.as();
                        UUID aI2 = messageCoreData2.aI();
                        Optional ad2 = messageCoreData2.ad();
                        ad2.getClass();
                        conversationIdType3 = conversationIdType;
                        str2 = str;
                        n = bahpVar.ac.n(bahpVar.S, Telephony.Sms.CONTENT_URI, i, bindData.W(), as2, j5, -1, 2, cpxuVar, aI2, ad2);
                        if (n != null) {
                        }
                        j3 = j;
                        bahpVar2 = bahpVar;
                        z2 = z;
                        str3 = str2;
                        conversationIdType4 = conversationIdType3;
                        ((ensz) b.i()).q("InsertNewMessageProcessor: No uri for SMS inserted into telephony DB.");
                        i2 = i;
                        bahpVar = bahpVar2;
                        j2 = j5;
                        conversationIdType = conversationIdType4;
                        z = z2;
                        messageCoreData2 = messageCoreData;
                        str = str3;
                    } catch (Throwable th10) {
                        th2 = th10;
                    }
                }
                ffig.a(ekzzVar2, null);
            } catch (Throwable th11) {
                th = th11;
                ekzzVar = ekzzVar2;
                th = th;
                throw th;
            }
        } catch (Throwable th12) {
            th = th12;
            ekzzVar = f;
        }
    }

    public final void h(MessageCoreData messageCoreData) {
        if (messageCoreData.B().a == -1) {
            ((ensz) b.h()).q("Not notifying UI about new message because message id is -1");
            return;
        }
        if (((Boolean) aoyx.c.e()).booleanValue()) {
            Iterator it = ((Set) this.ar.b()).iterator();
            while (it.hasNext()) {
                ((azzx) it.next()).d(messageCoreData.B().toString(), messageCoreData.z().toString(), messageCoreData.o());
            }
        }
        this.s.j(messageCoreData.z(), messageCoreData.B());
    }

    public final boolean i(Action action, MessageCoreData messageCoreData) {
        Action e = ((bbhf) this.ao.b()).e(messageCoreData, 2);
        if (e == null) {
            return false;
        }
        e.C(action);
        if (((asvn) this.E.b()).a() && messageCoreData.da()) {
            ((ensz) b.h()).q("InsertNewMessageProcessor: Send message directly & bypass pending message queue for Satellite message.");
            return true;
        }
        ((ensz) b.h()).q("InsertNewMessageProcessor: Send message directly & bypass pending message queue because it's empty.");
        return true;
    }

    public final boolean j(final MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        if (!messageCoreData.cX() || !messageCoreData.cS() || messageCoreData.db() || messageCoreData.cm() || messageCoreData.cF() || messageCoreData.T() != null || messageCoreData.U() != null) {
            return false;
        }
        ekzz f = eleg.f("InsertNewMessageProcessor::opportunisticUiUpdateInside");
        try {
            if (messageCoreData.E().i()) {
                messageCoreData.ce(((awtm) this.au.b()).a());
            }
            if (((ersq) ((arnq) this.av).a.b()).a("bugle.show_rcs_text_in_ui_before_persistence_async")) {
                elfo.f(new Runnable() { // from class: bagu
                    @Override // java.lang.Runnable
                    public final void run() {
                        bahp.this.c(messageCoreData);
                    }
                }, this.aw).getClass();
            } else {
                c(messageCoreData);
            }
            ffig.a(f, null);
            return true;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(f, th);
                throw th2;
            }
        }
    }
}

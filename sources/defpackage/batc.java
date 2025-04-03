package defpackage;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bajq;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class batc {
    public final ffbr A;
    public final ffbr B;
    public final ffbr C;
    public final ffbr D;
    public final ffbr E;
    public final ffbr F;
    public final azei G;
    public final ffbr H;
    private final ffbr J;
    private final ffbr K;
    private final ffbr L;
    private final ffbr M;
    private final ffbr N;
    private final ffbr O;
    private final ffbr P;
    private final ffbr Q;
    private final ffbr R;
    private final ffbr S;
    private final ffbr T;
    private final ffbr U;
    private final ffbr V;
    private final ffbr W;
    private final ffbr X;
    private final ffbr Y;
    private final Optional Z;
    private final ffbr aa;
    private final ffbr ab;
    private final ffbr ac;
    private final ffbr ad;
    private final Optional ae;
    private final ffbr af;
    private final ffbr ag;
    private final ffbr ah;
    private final asmg ai;
    private final auif aj;
    private final ffbr ak;
    private final ffbr al;
    private final asmj am;
    private final ffbr an;
    private final ffbr ao;
    private final cjdh ap;
    public final Context c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    public final ffbr q;
    public final ffbr r;
    public final errl s;
    public final ffbr t;
    public final fazb u;
    public final ffbr v;
    public final ffbr w;
    public final ecrj x;
    public final ffbr y;
    public final ffbr z;
    public static final cskc a = cskc.g("BugleDataModel", "ReceiveSmsMessageHelper");
    public static final entd b = entd.c("Bugle");
    private static final entd I = entd.c("BugleNotifications");

    public batc(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21, ffbr ffbrVar22, ffbr ffbrVar23, ffbr ffbrVar24, ffbr ffbrVar25, ffbr ffbrVar26, ffbr ffbrVar27, ffbr ffbrVar28, ffbr ffbrVar29, ffbr ffbrVar30, Optional optional, ffbr ffbrVar31, ffbr ffbrVar32, errl errlVar, ffbr ffbrVar33, fazb fazbVar, ffbr ffbrVar34, ffbr ffbrVar35, ffbr ffbrVar36, ecrj ecrjVar, ffbr ffbrVar37, ffbr ffbrVar38, ffbr ffbrVar39, ffbr ffbrVar40, Optional optional2, ffbr ffbrVar41, ffbr ffbrVar42, ffbr ffbrVar43, ffbr ffbrVar44, ffbr ffbrVar45, ffbr ffbrVar46, ffbr ffbrVar47, ffbr ffbrVar48, ffbr ffbrVar49, cjdh cjdhVar, azei azeiVar, ffbr ffbrVar50, asmg asmgVar, auif auifVar, ffbr ffbrVar51, ffbr ffbrVar52, asmj asmjVar, ffbr ffbrVar53, ffbr ffbrVar54) {
        this.c = context;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.J = ffbrVar3;
        this.f = ffbrVar4;
        this.g = ffbrVar5;
        this.T = ffbrVar11;
        this.U = ffbrVar13;
        this.V = ffbrVar20;
        this.K = ffbrVar6;
        this.h = ffbrVar7;
        this.L = ffbrVar8;
        this.i = ffbrVar9;
        this.j = ffbrVar10;
        this.M = ffbrVar12;
        this.N = ffbrVar14;
        this.O = ffbrVar15;
        this.P = ffbrVar16;
        this.Q = ffbrVar17;
        this.R = ffbrVar18;
        this.S = ffbrVar19;
        this.W = ffbrVar21;
        this.k = ffbrVar22;
        this.l = ffbrVar23;
        this.m = ffbrVar24;
        this.X = ffbrVar25;
        this.n = ffbrVar26;
        this.o = ffbrVar27;
        this.p = ffbrVar28;
        this.q = ffbrVar29;
        this.Y = ffbrVar30;
        this.Z = optional;
        this.r = ffbrVar32;
        this.s = errlVar;
        this.aa = ffbrVar31;
        this.t = ffbrVar33;
        this.u = fazbVar;
        this.v = ffbrVar34;
        this.w = ffbrVar35;
        this.ab = ffbrVar36;
        this.x = ecrjVar;
        this.y = ffbrVar38;
        this.z = ffbrVar39;
        this.ad = ffbrVar40;
        this.ae = optional2;
        this.A = ffbrVar41;
        this.B = ffbrVar42;
        this.af = ffbrVar43;
        this.ac = ffbrVar37;
        this.C = ffbrVar44;
        this.E = ffbrVar45;
        this.F = ffbrVar46;
        this.ag = ffbrVar47;
        this.D = ffbrVar48;
        this.ah = ffbrVar49;
        this.ap = cjdhVar;
        this.G = azeiVar;
        this.H = ffbrVar50;
        this.ai = asmgVar;
        this.aj = auifVar;
        this.ak = ffbrVar51;
        this.al = ffbrVar52;
        this.am = asmjVar;
        this.an = ffbrVar53;
        this.ao = ffbrVar54;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a5 A[Catch: all -> 0x045a, TryCatch #8 {all -> 0x045a, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0039, B:11:0x0082, B:12:0x0089, B:14:0x00b1, B:16:0x00b9, B:19:0x00c8, B:21:0x00d4, B:24:0x00e5, B:46:0x014b, B:48:0x0185, B:49:0x018c, B:51:0x01a2, B:52:0x01a9, B:54:0x01b7, B:75:0x01f2, B:77:0x01fc, B:78:0x0213, B:80:0x0227, B:81:0x0236, B:83:0x023c, B:84:0x0244, B:86:0x0257, B:88:0x026b, B:89:0x028b, B:90:0x027f, B:91:0x02a6, B:93:0x0313, B:95:0x0321, B:97:0x0327, B:98:0x0349, B:99:0x0360, B:101:0x0374, B:102:0x0378, B:104:0x037e, B:106:0x0384, B:108:0x03fb, B:110:0x0392, B:112:0x03b1, B:113:0x03ce, B:115:0x03d4, B:117:0x03da, B:125:0x03f6, B:126:0x03f9, B:128:0x01a5, B:129:0x0188, B:136:0x0456, B:137:0x0459, B:56:0x01c5, B:57:0x01d1, B:59:0x01d7, B:63:0x01e5, B:71:0x01ed, B:72:0x01f0, B:61:0x01e1, B:68:0x01eb, B:26:0x0112, B:27:0x011e, B:29:0x0124, B:33:0x0138, B:42:0x0144, B:43:0x0147, B:31:0x0134, B:39:0x0142, B:133:0x0454, B:122:0x03f4), top: B:2:0x0010, inners: #2, #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0188 A[Catch: all -> 0x045a, TryCatch #8 {all -> 0x045a, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0039, B:11:0x0082, B:12:0x0089, B:14:0x00b1, B:16:0x00b9, B:19:0x00c8, B:21:0x00d4, B:24:0x00e5, B:46:0x014b, B:48:0x0185, B:49:0x018c, B:51:0x01a2, B:52:0x01a9, B:54:0x01b7, B:75:0x01f2, B:77:0x01fc, B:78:0x0213, B:80:0x0227, B:81:0x0236, B:83:0x023c, B:84:0x0244, B:86:0x0257, B:88:0x026b, B:89:0x028b, B:90:0x027f, B:91:0x02a6, B:93:0x0313, B:95:0x0321, B:97:0x0327, B:98:0x0349, B:99:0x0360, B:101:0x0374, B:102:0x0378, B:104:0x037e, B:106:0x0384, B:108:0x03fb, B:110:0x0392, B:112:0x03b1, B:113:0x03ce, B:115:0x03d4, B:117:0x03da, B:125:0x03f6, B:126:0x03f9, B:128:0x01a5, B:129:0x0188, B:136:0x0456, B:137:0x0459, B:56:0x01c5, B:57:0x01d1, B:59:0x01d7, B:63:0x01e5, B:71:0x01ed, B:72:0x01f0, B:61:0x01e1, B:68:0x01eb, B:26:0x0112, B:27:0x011e, B:29:0x0124, B:33:0x0138, B:42:0x0144, B:43:0x0147, B:31:0x0134, B:39:0x0142, B:133:0x0454, B:122:0x03f4), top: B:2:0x0010, inners: #2, #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d4 A[Catch: all -> 0x045a, TryCatch #8 {all -> 0x045a, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0039, B:11:0x0082, B:12:0x0089, B:14:0x00b1, B:16:0x00b9, B:19:0x00c8, B:21:0x00d4, B:24:0x00e5, B:46:0x014b, B:48:0x0185, B:49:0x018c, B:51:0x01a2, B:52:0x01a9, B:54:0x01b7, B:75:0x01f2, B:77:0x01fc, B:78:0x0213, B:80:0x0227, B:81:0x0236, B:83:0x023c, B:84:0x0244, B:86:0x0257, B:88:0x026b, B:89:0x028b, B:90:0x027f, B:91:0x02a6, B:93:0x0313, B:95:0x0321, B:97:0x0327, B:98:0x0349, B:99:0x0360, B:101:0x0374, B:102:0x0378, B:104:0x037e, B:106:0x0384, B:108:0x03fb, B:110:0x0392, B:112:0x03b1, B:113:0x03ce, B:115:0x03d4, B:117:0x03da, B:125:0x03f6, B:126:0x03f9, B:128:0x01a5, B:129:0x0188, B:136:0x0456, B:137:0x0459, B:56:0x01c5, B:57:0x01d1, B:59:0x01d7, B:63:0x01e5, B:71:0x01ed, B:72:0x01f0, B:61:0x01e1, B:68:0x01eb, B:26:0x0112, B:27:0x011e, B:29:0x0124, B:33:0x0138, B:42:0x0144, B:43:0x0147, B:31:0x0134, B:39:0x0142, B:133:0x0454, B:122:0x03f4), top: B:2:0x0010, inners: #2, #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0124 A[Catch: all -> 0x0452, TRY_LEAVE, TryCatch #3 {all -> 0x0452, blocks: (B:26:0x0112, B:27:0x011e, B:29:0x0124, B:33:0x0138, B:42:0x0144, B:43:0x0147, B:31:0x0134, B:39:0x0142), top: B:25:0x0112, outer: #8, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0185 A[Catch: all -> 0x045a, TryCatch #8 {all -> 0x045a, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0039, B:11:0x0082, B:12:0x0089, B:14:0x00b1, B:16:0x00b9, B:19:0x00c8, B:21:0x00d4, B:24:0x00e5, B:46:0x014b, B:48:0x0185, B:49:0x018c, B:51:0x01a2, B:52:0x01a9, B:54:0x01b7, B:75:0x01f2, B:77:0x01fc, B:78:0x0213, B:80:0x0227, B:81:0x0236, B:83:0x023c, B:84:0x0244, B:86:0x0257, B:88:0x026b, B:89:0x028b, B:90:0x027f, B:91:0x02a6, B:93:0x0313, B:95:0x0321, B:97:0x0327, B:98:0x0349, B:99:0x0360, B:101:0x0374, B:102:0x0378, B:104:0x037e, B:106:0x0384, B:108:0x03fb, B:110:0x0392, B:112:0x03b1, B:113:0x03ce, B:115:0x03d4, B:117:0x03da, B:125:0x03f6, B:126:0x03f9, B:128:0x01a5, B:129:0x0188, B:136:0x0456, B:137:0x0459, B:56:0x01c5, B:57:0x01d1, B:59:0x01d7, B:63:0x01e5, B:71:0x01ed, B:72:0x01f0, B:61:0x01e1, B:68:0x01eb, B:26:0x0112, B:27:0x011e, B:29:0x0124, B:33:0x0138, B:42:0x0144, B:43:0x0147, B:31:0x0134, B:39:0x0142, B:133:0x0454, B:122:0x03f4), top: B:2:0x0010, inners: #2, #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a2 A[Catch: all -> 0x045a, TryCatch #8 {all -> 0x045a, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0039, B:11:0x0082, B:12:0x0089, B:14:0x00b1, B:16:0x00b9, B:19:0x00c8, B:21:0x00d4, B:24:0x00e5, B:46:0x014b, B:48:0x0185, B:49:0x018c, B:51:0x01a2, B:52:0x01a9, B:54:0x01b7, B:75:0x01f2, B:77:0x01fc, B:78:0x0213, B:80:0x0227, B:81:0x0236, B:83:0x023c, B:84:0x0244, B:86:0x0257, B:88:0x026b, B:89:0x028b, B:90:0x027f, B:91:0x02a6, B:93:0x0313, B:95:0x0321, B:97:0x0327, B:98:0x0349, B:99:0x0360, B:101:0x0374, B:102:0x0378, B:104:0x037e, B:106:0x0384, B:108:0x03fb, B:110:0x0392, B:112:0x03b1, B:113:0x03ce, B:115:0x03d4, B:117:0x03da, B:125:0x03f6, B:126:0x03f9, B:128:0x01a5, B:129:0x0188, B:136:0x0456, B:137:0x0459, B:56:0x01c5, B:57:0x01d1, B:59:0x01d7, B:63:0x01e5, B:71:0x01ed, B:72:0x01f0, B:61:0x01e1, B:68:0x01eb, B:26:0x0112, B:27:0x011e, B:29:0x0124, B:33:0x0138, B:42:0x0144, B:43:0x0147, B:31:0x0134, B:39:0x0142, B:133:0x0454, B:122:0x03f4), top: B:2:0x0010, inners: #2, #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b7 A[Catch: all -> 0x045a, TRY_LEAVE, TryCatch #8 {all -> 0x045a, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0039, B:11:0x0082, B:12:0x0089, B:14:0x00b1, B:16:0x00b9, B:19:0x00c8, B:21:0x00d4, B:24:0x00e5, B:46:0x014b, B:48:0x0185, B:49:0x018c, B:51:0x01a2, B:52:0x01a9, B:54:0x01b7, B:75:0x01f2, B:77:0x01fc, B:78:0x0213, B:80:0x0227, B:81:0x0236, B:83:0x023c, B:84:0x0244, B:86:0x0257, B:88:0x026b, B:89:0x028b, B:90:0x027f, B:91:0x02a6, B:93:0x0313, B:95:0x0321, B:97:0x0327, B:98:0x0349, B:99:0x0360, B:101:0x0374, B:102:0x0378, B:104:0x037e, B:106:0x0384, B:108:0x03fb, B:110:0x0392, B:112:0x03b1, B:113:0x03ce, B:115:0x03d4, B:117:0x03da, B:125:0x03f6, B:126:0x03f9, B:128:0x01a5, B:129:0x0188, B:136:0x0456, B:137:0x0459, B:56:0x01c5, B:57:0x01d1, B:59:0x01d7, B:63:0x01e5, B:71:0x01ed, B:72:0x01f0, B:61:0x01e1, B:68:0x01eb, B:26:0x0112, B:27:0x011e, B:29:0x0124, B:33:0x0138, B:42:0x0144, B:43:0x0147, B:31:0x0134, B:39:0x0142, B:133:0x0454, B:122:0x03f4), top: B:2:0x0010, inners: #2, #3, #5, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.basy a(final defpackage.basx r40) {
        /*
            Method dump skipped, instructions count: 1125
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.batc.a(basx):basy");
    }

    public final basz b(basy basyVar, cniz cnizVar) {
        ConversationIdType e = basyVar.e();
        ParticipantsTable.BindData g = basyVar.g();
        if (!ctid.h(this.c) && cnizVar != null) {
            emxf.b(true, "ProcessPendingMessagesAction: empty processing receiver");
            bajq.a aVar = (bajq.a) ctba.a(bajq.a.class);
            if (aVar.cR().G()) {
                long epochMilli = aVar.v().f().toEpochMilli();
                if (aVar.aM().d(2, epochMilli)) {
                    ensk h = bajq.a.h();
                    h.Y(ente.a, "BugleDataModel");
                    ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/action/PendingMessagesProcessor", "processPendingMessagesFromReceiver", 341, "PendingMessagesProcessor.java")).q("PendingMessagesProcessor: skipped - too frequent");
                } else {
                    bajs aL = aVar.aL();
                    ffbr ffbrVar = aL.a;
                    bbgc bbgcVar = (bbgc) aL.b.b();
                    bbgcVar.getClass();
                    cqoh cqohVar = (cqoh) aL.c.b();
                    cqohVar.getClass();
                    ffbr ffbrVar2 = aL.d;
                    csjk csjkVar = (csjk) aL.e.b();
                    csjkVar.getClass();
                    ffbr ffbrVar3 = aL.f;
                    altk altkVar = (altk) aL.g.b();
                    altkVar.getClass();
                    banu banuVar = (banu) aL.h.b();
                    banuVar.getClass();
                    bbfw bbfwVar = (bbfw) aL.i.b();
                    bbfwVar.getClass();
                    bbgq bbgqVar = (bbgq) aL.j.b();
                    bbgqVar.getClass();
                    baio baioVar = (baio) aL.k.b();
                    baioVar.getClass();
                    byzp byzpVar = (byzp) aL.l.b();
                    byzpVar.getClass();
                    bbfo bbfoVar = (bbfo) aL.m.b();
                    bbfoVar.getClass();
                    bbhf bbhfVar = (bbhf) aL.n.b();
                    bbhfVar.getClass();
                    Optional optional = (Optional) aL.o.b();
                    optional.getClass();
                    clws clwsVar = (clws) aL.p.b();
                    clwsVar.getClass();
                    cbut cbutVar = (cbut) aL.q.b();
                    cbutVar.getClass();
                    ((cqrl) aL.r.b()).getClass();
                    ffbr ffbrVar4 = aL.s;
                    ffbr ffbrVar5 = aL.t;
                    bajp bajpVar = (bajp) aL.u.b();
                    bajpVar.getClass();
                    ffbr ffbrVar6 = aL.v;
                    cpez cpezVar = (cpez) aL.w.b();
                    cpezVar.getClass();
                    errl errlVar = (errl) aL.x.b();
                    errlVar.getClass();
                    cmlm cmlmVar = (cmlm) aL.y.b();
                    cmlmVar.getClass();
                    Map map = (Map) aL.z.b();
                    map.getClass();
                    axcf axcfVar = (axcf) aL.A.b();
                    axcfVar.getClass();
                    bajm bajmVar = (bajm) aL.B.b();
                    bajmVar.getClass();
                    ffbr ffbrVar7 = aL.C;
                    ffbr ffbrVar8 = aL.D;
                    ffbr ffbrVar9 = aL.E;
                    ffbr ffbrVar10 = aL.F;
                    ffbr ffbrVar11 = aL.G;
                    ffbr ffbrVar12 = aL.H;
                    ffbr ffbrVar13 = aL.I;
                    ffbr ffbrVar14 = aL.J;
                    new bajq(aL.K, ffbrVar, bbgcVar, cqohVar, ffbrVar2, csjkVar, ffbrVar3, altkVar, banuVar, bbfwVar, bbgqVar, baioVar, byzpVar, bbfoVar, bbhfVar, optional, clwsVar, cbutVar, ffbrVar4, ffbrVar5, bajpVar, ffbrVar6, cpezVar, errlVar, 2, Duration.ZERO, null, cnizVar, null, cnizVar.getClass().getSimpleName(), cmlmVar, map, axcfVar, bajmVar, ffbrVar7, ffbrVar8, ffbrVar9, ffbrVar11, ffbrVar12, ffbrVar10, ffbrVar13, ffbrVar14).c();
                    banu.d = epochMilli;
                }
            } else {
                ensk j = bajq.a.j();
                j.Y(ente.a, "BugleDataModel");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/action/PendingMessagesProcessor", "processPendingMessagesFromReceiver", 333, "PendingMessagesProcessor.java")).q("PendingMessagesProcessor: skipped - not default SMS app");
            }
        }
        ((cisl) this.ah.b()).b();
        return new bace(basyVar.f(), e, g, basyVar.h(), basyVar.i(), basyVar.b(), basyVar.a(), basyVar.c());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        defpackage.batc.a.r("Received an SMS with an invalid address, attempting to fetch matching contact.");
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        r7 = ((defpackage.csqw) r6.R.b()).n(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003f, code lost:
    
        if (r1.F() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0090, code lost:
    
        r2 = defpackage.batc.a.b();
        r2.I("IllegalArgumentException when performing query");
        r2.s(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0080, code lost:
    
        r2 = defpackage.batc.a.b();
        r2.I("SecurityException when performing query");
        r2.s(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0066, code lost:
    
        if (defpackage.aoqw.h(r7) == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bata c(java.lang.String r7, int r8) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.batc.c(java.lang.String, int):bata");
    }

    public final byyt d(aoku aokuVar, boolean z) {
        String o = aokuVar.o();
        cpbs cpbsVar = (cpbs) this.W.b();
        cmj cmjVar = new cmj();
        Iterator it = cpbsVar.b().iterator();
        while (it.hasNext()) {
            String k = ((cpbn) it.next()).k();
            if (!TextUtils.isEmpty(k)) {
                cmjVar.add(k);
            }
        }
        return enip.o(cmjVar).contains(o) ? byyt.SPAM_FOLDER : ((bdmq) this.J.b()).F(bdgq.a, o, z, false);
    }

    public final elfl e(int i, ContentValues contentValues, long j, baow baowVar) {
        return f(i, contentValues, byzi.VERIFICATION_NA, j, baowVar);
    }

    public final elfl f(final int i, final ContentValues contentValues, final byzi byziVar, final long j, final baow baowVar) {
        ekzz f = eleg.f("ReceiveSmsMessageHelper#insertMessageInTelephonyFuture");
        try {
            final ecri d = this.x.d();
            final String asString = contentValues.getAsString("address");
            bata c = c(asString, i);
            final aoku g = ((aolr) this.v.b()).g(((bacf) c).a, new basd(((bacf) c).b));
            final elfl a2 = ((cnjp) this.S.b()).a(contentValues.getAsString("body"), i);
            final elfl i2 = a2.i(new eroh() { // from class: basn
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return batc.this.g(asString, i, g, ((Boolean) obj).booleanValue());
                }
            }, this.s);
            elfl h = elfo.k(a2, i2).b(new erog() { // from class: baso
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    Boolean bool = (Boolean) erqt.q(a2);
                    bool.booleanValue();
                    final Optional optional = (Optional) erqt.q(i2);
                    ekzz f2 = eleg.f("ReceiveSmsMessageHelper.insertMessageInTelephony");
                    final int i3 = i;
                    final byzi byziVar2 = byziVar;
                    final long j2 = j;
                    final baow baowVar2 = baowVar;
                    final batc batcVar = batc.this;
                    final ContentValues contentValues2 = contentValues;
                    try {
                        batc.a.m("insertMessageInTelephony");
                        elfl h2 = elfo.e(bool).h(new emwl() { // from class: basu
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                long j3;
                                Boolean bool2 = (Boolean) obj;
                                csjy.b = true;
                                int i4 = i3;
                                batc batcVar2 = batc.this;
                                ContentValues contentValues3 = contentValues2;
                                bacf bacfVar = (bacf) batcVar2.c(contentValues3.getAsString("address"), i4);
                                aoku aokuVar = bacfVar.a;
                                ParticipantsTable.BindData bindData = bacfVar.b;
                                String o = aokuVar.o();
                                contentValues3.put("address", o);
                                Long asLong = contentValues3.getAsLong("date");
                                if (asLong == null) {
                                    batc.a.r("Received an SMS without a received date/time.");
                                }
                                long longValue = asLong != null ? asLong.longValue() : 0L;
                                baow baowVar3 = baowVar2;
                                long j4 = j2;
                                byzi byziVar3 = byziVar2;
                                ((coxg) batcVar2.q.b()).i(longValue);
                                if (bool2.booleanValue()) {
                                    long f3 = ((covs) batcVar2.h.b()).f(coto.a, o);
                                    if (f3 == -1) {
                                        batc.a.n("Resolved thread to an INVALID_THREAD_ID!");
                                        f3 = -1;
                                    }
                                    contentValues3.put("thread_id", Long.valueOf(f3));
                                    return new bacc(i4, contentValues3, bindData, f3, bdgq.a, false, longValue, batcVar2.i(contentValues3, true, true), true, true, byyt.UNARCHIVED, true, byziVar3, j4, baowVar3, true, null);
                                }
                                aoku g2 = ((aolr) batcVar2.v.b()).g(bacfVar.a, new basd(bindData));
                                boolean z = !g2.x() && ((crrm) batcVar2.r.b()).d(g2);
                                Optional optional2 = optional;
                                emyw.a(optional2.isPresent());
                                bczh bczhVar = new bczh();
                                bczhVar.b(((basw) optional2.get()).a().C());
                                bczhVar.c(((basw) optional2.get()).b());
                                bdfy a3 = bczhVar.a();
                                byyt d2 = batcVar2.d(g2, z);
                                ConversationIdType C = ((basw) optional2.get()).a().C();
                                cpxu a4 = ((ayfi) batcVar2.y.b()).a(C);
                                if (a4.c()) {
                                    j3 = a4.a();
                                } else {
                                    batc.a.r(a.F(C, "Unable to find threadId for conversation [", "]"));
                                    j3 = -1;
                                }
                                bczi bcziVar = (bczi) a3;
                                ConversationIdType conversationIdType = bcziVar.a;
                                csix.l(conversationIdType);
                                boolean f4 = ((carb) batcVar2.g.b()).f(conversationIdType);
                                boolean g3 = ((carb) batcVar2.g.b()).g(conversationIdType);
                                if (ctid.h(batcVar2.c)) {
                                    batc.a.m("Not inserting received SMS message for secondary user.");
                                    return new bacc(i4, contentValues3, bindData, j3, conversationIdType, bcziVar.b, longValue, null, false, false, d2, false, byziVar3, j4, baowVar3, true, null);
                                }
                                long j5 = j3;
                                boolean z2 = z;
                                boolean z3 = g3 || z2 || bool2.booleanValue() || ((cubr) batcVar2.i.b()).a(conversationIdType);
                                if (f4) {
                                    batc.a.p("New SMS is in focus");
                                } else if (g3) {
                                    batc.a.p("New SMS is notified because messageInObservable");
                                } else if (z2) {
                                    batc.a.p("New SMS is notified because blocked");
                                }
                                boolean f5 = ((amoe) batcVar2.D.b()).f(conversationIdType, engw.r(g2), bcziVar.b);
                                boolean z4 = z3 || !f5;
                                return new bacc(i4, contentValues3, bindData, j5, bcziVar.a, bcziVar.b, longValue, batcVar2.i(contentValues3, false, z4), z4, false, d2, bool2.booleanValue(), byziVar3, j4, baowVar3, f5, null);
                            }
                        }, batcVar.s);
                        f2.close();
                        return h2;
                    } finally {
                    }
                }
            }, this.s).h(new emwl() { // from class: basp
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    basx basxVar = (basx) obj;
                    batc.this.x.f(d, new ecda("ReceiveSmsMessageHelper#InsertMessageInTelephonyByBlockingExecutor"), null, ecrh.SUCCESS);
                    return basxVar;
                }
            }, this.s);
            f.b(h);
            f.close();
            return h;
        } finally {
        }
    }

    public final elfl g(final String str, final int i, final aoku aokuVar, boolean z) {
        if (z) {
            a.p("Skipping BCM conversation lookup for OTP message");
            return elfo.e(Optional.empty());
        }
        final bata c = c(str, i);
        final ecri d = ((ashb) this.B.b()).a() ? this.x.d() : null;
        return elfo.g(new Callable() { // from class: basv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                aoku aokuVar2 = aokuVar;
                boolean z2 = false;
                if (!aokuVar2.x() && ((crrm) batc.this.r.b()).d(aokuVar2)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        }, this.s).h(new emwl() { // from class: base
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ecri ecriVar;
                final Boolean bool = (Boolean) obj;
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                final bata bataVar = c;
                final int i2 = i;
                final String str2 = str;
                final batc batcVar = batc.this;
                bseh a2 = ((ayif) batcVar.t.b()).a(((bacf) bataVar).a, new ffbr() { // from class: basm
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        atomicBoolean.set(true);
                        batc batcVar2 = batc.this;
                        cpye cpyeVar = (cpye) batcVar2.z.b();
                        boolean a3 = true ^ ((asgl) batcVar2.F.b()).a();
                        aoku aokuVar2 = ((bacf) bataVar).a;
                        int i3 = i2;
                        bdgc d2 = cpyeVar.c(aokuVar2, i3, a3).d();
                        boolean booleanValue = bool.booleanValue();
                        bacf bacfVar = (bacf) batcVar2.c(str2, i3);
                        d2.f(batcVar2.d(((aolr) batcVar2.v.b()).g(bacfVar.a, new basd(bacfVar.b)), booleanValue));
                        return d2.A();
                    }
                });
                if (((ashb) batcVar.B.b()).a() && (ecriVar = d) != null) {
                    batcVar.x.f(ecriVar, new ecda("ReceiveSmsMessageHelper#shadowOrRealLaunchTimerByBlockingExecutor"), null, ecrh.SUCCESS);
                }
                return Optional.of(new bacb(a2, atomicBoolean.get()));
            }
        }, this.s);
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [aoku, java.lang.Object] */
    public final void h(basz baszVar) {
        bace baceVar = (bace) baszVar;
        MessageIdType messageIdType = baceVar.a;
        if (messageIdType.c()) {
            csjb e = a.e();
            e.I("Null messageId. Bailing out of launchNonCriticalActionsForReceivedMessage");
            e.r();
            return;
        }
        if (((cttn) this.T.b()).b()) {
            ((bauj) this.X.b()).a(baceVar.b, messageIdType, ((Integer) ctjd.c.e()).intValue()).x(0L);
        }
        ((bdxd) this.N.b()).a(messageIdType);
        boolean z = ((babz) baceVar.h).c;
        UUID randomUUID = UUID.randomUUID();
        byzj byzjVar = z ? byzj.SMS_EMAIL : byzj.SMS_TELEPHONY;
        Optional b2 = ((bdtd) this.K.b()).g(baceVar.g).b();
        String n = b2.isPresent() ? b2.get().n() : "UNKNOWN_MI";
        int i = engw.d;
        engr engrVar = new engr();
        engrVar.h(new bdjf(byzb.FROM_SMS_ORIGINATING, ((babz) baceVar.h).a));
        engrVar.h(new bdjf(byzb.SELF, emxe.b(n)));
        babz babzVar = (babz) baceVar.h;
        if (!emuz.e(babzVar.b, babzVar.a)) {
            engrVar.h(new bdjf(byzb.FROM_SMS_DISPLAY_ORIGINATING, ((babz) baceVar.h).b));
        }
        ((bdnf) this.af.b()).c(randomUUID, baceVar.a, baceVar.f, engrVar.g(), byzjVar, baceVar.g);
        if (baceVar.d.d()) {
            entd entdVar = b;
            ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmsMessageHelper", "launchNonCriticalActionsForReceivedMessage", 1560, "ReceiveSmsMessageHelper.java")).t("second chance lookup for thread id for conversation [%s]", baceVar.b);
            cpxu a2 = ((ayfi) this.y.b()).a(baceVar.b);
            if (a2.c()) {
                ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmsMessageHelper", "launchNonCriticalActionsForReceivedMessage", 1567, "ReceiveSmsMessageHelper.java")).D("Found thread id [%s] for conversation [%s]", a2, baceVar.b);
            } else {
                ((ensz) ((ensz) entdVar.j()).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmsMessageHelper", "launchNonCriticalActionsForReceivedMessage", 1570, "ReceiveSmsMessageHelper.java")).t("Still unable to find thread id for conversation [%s]", baceVar.b);
            }
        }
        if (((aurc) this.ao.b()).a() || !baceVar.e) {
            ((bdso) this.ad.b()).b(baceVar.c, baceVar.b);
        }
    }

    public final Uri i(final ContentValues contentValues, boolean z, boolean z2) {
        Optional a2;
        ekzz f = eleg.f("ReceiveSmsMessageHelper.saveToTelephony");
        try {
            contentValues.put("read", z ? 1 : 0);
            contentValues.put("seen", (Integer) 1);
            try {
                Integer asInteger = contentValues.getAsInteger("m_cls");
                r3 = asInteger != null ? asInteger : 0;
                contentValues.remove("m_cls");
                a2 = ((coyp) this.ag.b()).a(new ffix() { // from class: bash
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return batc.this.c.getContentResolver().insert(Telephony.Sms.Inbox.CONTENT_URI, contentValues);
                    }
                });
            } catch (NullPointerException e) {
                a.s("Failed to insert SMS into telephony: got NPE from platform", e);
                contentValues.put("m_cls", r3);
            }
            if (!a2.isPresent()) {
                ((ensz) ((ensz) b.j()).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmsMessageHelper", "saveToTelephony", 1789, "ReceiveSmsMessageHelper.java")).q("Failed to save to telephony. Returning null URI");
                f.close();
                return null;
            }
            Uri uri = (Uri) a2.get();
            contentValues.put("m_cls", r3);
            final Uri withAppendedId = ContentUris.withAppendedId(Telephony.Sms.CONTENT_URI, ContentUris.parseId(uri));
            csjb a3 = a.a();
            a3.I("Inserted SMS message into telephony.");
            a3.A("inbox uri", uri);
            a3.A("messageUri", withAppendedId);
            a3.B("read", z);
            a3.B("notified", z2);
            a3.A("threadId", contentValues.getAsString("thread_id"));
            a3.r();
            if (this.am.a()) {
                ((azei) this.an.b()).d(new Consumer() { // from class: basi
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        cskc cskcVar = batc.a;
                        ((cpdd) obj).g(withAppendedId, null);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            } else {
                this.Z.ifPresent(new Consumer() { // from class: basj
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        cskc cskcVar = batc.a;
                        ((cpdd) ((ffbr) obj).b()).g(withAppendedId, null);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            ((Optional) this.aa.b()).ifPresent(new Consumer() { // from class: bask
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cskc cskcVar = batc.a;
                    ((akni) obj).a(withAppendedId, 100);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            f.close();
            return withAppendedId;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

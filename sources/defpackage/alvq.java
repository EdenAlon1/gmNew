package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.telephony.TelephonyManager;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.LruCache;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.BackgroundLoadingMessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ThreadLocalRandom;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alvq implements altk {
    static final cfva f = cfvl.f(cfvl.b, "compose_duration_logging_cap_millis", TimeUnit.SECONDS.toMillis(120));
    static final cfva g = cfvl.i(cfvl.b, "disable_logging_bugle_telephony_event", true);
    public static final long h = TimeUnit.DAYS.toMillis(1);
    public static final cskc i = cskc.g("BugleUsageStatistics", "UsageStatistics");
    public static final enru j = enru.c("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl");
    public final errl A;
    public final Executor B;
    public elfl C;
    public final fazb E;
    public final ffbr F;
    public final avkk G;
    public final ffbr H;
    public final alwb I;
    public final ffbr J;
    public final ffbr K;
    public final ffbr L;
    public final ffbr M;
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
    private final ffbr Z;
    private final ffbr aa;
    private final ffbr ab;
    private final ffbr ac;
    private final fazb ad;
    private final fazb ae;
    private final errl af;
    private final ffbr ag;
    private final Context ah;
    private ffbr ai;
    private final elbx aj;
    private final ffbr ak;
    private final bczc al;
    private final ffbr am;
    private final asvn an;
    private final ffbr ao;
    private final ffbr ap;
    private final ffbr aq;
    private final ffbr ar;
    private final ffbr as;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    public final ffbr q;
    public final fazb r;
    public final fazb s;
    public final fazb t;
    public final cqoh u;
    public final ffbr v;
    public akxl w;
    public akyb x;
    public final fazb z;
    public final LruCache k = new LruCache(10);
    public final AtomicBoolean y = new AtomicBoolean(false);
    public final alru D = new alru();

    public alvq(ffbr ffbrVar, ffbr ffbrVar2, Context context, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, fazb fazbVar, fazb fazbVar2, ffbr ffbrVar20, ffbr ffbrVar21, ffbr ffbrVar22, ffbr ffbrVar23, fazb fazbVar3, ffbr ffbrVar24, cqoh cqohVar, ffbr ffbrVar25, fazb fazbVar4, fazb fazbVar5, fazb fazbVar6, errl errlVar, errl errlVar2, elbx elbxVar, fazb fazbVar7, ffbr ffbrVar26, avkk avkkVar, ffbr ffbrVar27, ffbr ffbrVar28, bczc bczcVar, ffbr ffbrVar29, alwb alwbVar, ffbr ffbrVar30, asvn asvnVar, ffbr ffbrVar31, ffbr ffbrVar32, ffbr ffbrVar33, ffbr ffbrVar34, ffbr ffbrVar35, ffbr ffbrVar36, ffbr ffbrVar37, ffbr ffbrVar38) {
        this.W = ffbrVar;
        this.ar = ffbrVar2;
        this.ah = context;
        this.ac = ffbrVar3;
        this.N = ffbrVar4;
        this.l = ffbrVar5;
        this.m = ffbrVar6;
        this.O = ffbrVar7;
        this.n = ffbrVar8;
        this.P = ffbrVar9;
        this.S = ffbrVar12;
        this.Q = ffbrVar10;
        this.R = ffbrVar11;
        this.T = ffbrVar13;
        this.ai = ffbrVar14;
        this.U = ffbrVar15;
        this.V = ffbrVar16;
        this.o = ffbrVar17;
        this.p = ffbrVar18;
        this.q = ffbrVar19;
        this.r = fazbVar;
        this.s = fazbVar2;
        this.X = ffbrVar20;
        this.Y = ffbrVar21;
        this.Z = ffbrVar22;
        this.aa = ffbrVar23;
        this.t = fazbVar3;
        this.ab = ffbrVar24;
        this.u = cqohVar;
        this.v = ffbrVar25;
        this.ad = fazbVar4;
        this.ae = fazbVar5;
        this.z = fazbVar6;
        this.A = errlVar;
        this.af = errlVar2;
        this.aj = elbxVar;
        this.E = fazbVar7;
        this.F = ffbrVar26;
        this.G = avkkVar;
        this.ak = ffbrVar27;
        this.H = ffbrVar28;
        this.al = bczcVar;
        this.B = new ersb(errlVar);
        this.ag = ffbrVar29;
        this.I = alwbVar;
        this.am = ffbrVar30;
        this.an = asvnVar;
        this.ao = ffbrVar31;
        this.J = ffbrVar32;
        this.K = ffbrVar33;
        this.ap = ffbrVar34;
        this.aq = ffbrVar35;
        this.L = ffbrVar36;
        this.as = ffbrVar37;
        this.M = ffbrVar38;
    }

    static /* synthetic */ enhk aV() {
        return enhk.o(byzi.VERIFICATION_VERIFIED, eovo.VERIFIED, byzi.VERIFICATION_UNVERIFIED, eovo.UNVERIFIED, byzi.VERIFICATION_NA, eovo.NA, byzi.VERIFICATION_IN_PROGRESS, eovo.NOT_YET_VERIFIED);
    }

    public static eolv aW(eokw eokwVar) {
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_CONVERSATION;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eokwVar.getClass();
        eolvVar2.m = eokwVar;
        eolvVar2.b |= 8;
        return (eolv) eoluVar.build();
    }

    public static void bb(eoop eoopVar, MessageCoreData messageCoreData) {
        if (messageCoreData.cB() && messageCoreData.E().k() && messageCoreData.D().k() && !messageCoreData.E().equals(messageCoreData.D())) {
            String f2 = messageCoreData.D().f();
            eoopVar.copyOnWrite();
            eopq eopqVar = (eopq) eoopVar.instance;
            eopq eopqVar2 = eopq.a;
            eopqVar.c |= 32768;
            eopqVar.T = f2;
        }
    }

    public static final eoqh bd(eoqf eoqfVar, int i2, int i3, int i4, int i5) {
        eoqg eoqgVar = (eoqg) eoqh.a.createBuilder();
        eoqgVar.copyOnWrite();
        eoqh eoqhVar = (eoqh) eoqgVar.instance;
        eoqhVar.c = eoqfVar.j;
        eoqhVar.b |= 1;
        eoqgVar.copyOnWrite();
        eoqh eoqhVar2 = (eoqh) eoqgVar.instance;
        eoqhVar2.b |= 2;
        eoqhVar2.d = i2;
        eoqgVar.copyOnWrite();
        eoqh eoqhVar3 = (eoqh) eoqgVar.instance;
        eoqhVar3.b |= 32;
        eoqhVar3.e = i4;
        eojg eojgVar = (eojg) eojh.a.createBuilder();
        eojgVar.copyOnWrite();
        eojh eojhVar = (eojh) eojgVar.instance;
        eojhVar.b |= 1;
        eojhVar.c = i3;
        eoqgVar.copyOnWrite();
        eoqh eoqhVar4 = (eoqh) eoqgVar.instance;
        eojh eojhVar2 = (eojh) eojgVar.build();
        eojhVar2.getClass();
        eoqhVar4.f = eojhVar2;
        eoqhVar4.b |= 64;
        eoqgVar.copyOnWrite();
        eoqh eoqhVar5 = (eoqh) eoqgVar.instance;
        eoqhVar5.b |= 128;
        eoqhVar5.g = i5;
        return (eoqh) eoqgVar.build();
    }

    private final eoub bk(int i2) {
        TelephonyManager telephonyManager = (TelephonyManager) this.ah.getSystemService("phone");
        if (telephonyManager != null) {
            telephonyManager = telephonyManager.createForSubscriptionId(i2);
        }
        return telephonyManager != null ? (eoub) Optional.ofNullable(eoub.b(telephonyManager.getPhoneType())).orElse(eoub.PHONE_TYPE_NONE) : eoub.PHONE_TYPE_NONE;
    }

    private final void bl(MessageCoreData messageCoreData, eooi eooiVar) {
        bcyk a;
        if (!messageCoreData.y().u() && (a = ((bdeo) this.O.b()).a(messageCoreData.z())) != null) {
            messageCoreData.bE(a.h(eooiVar, null, messageCoreData.o()));
        }
        this.D.f(messageCoreData);
    }

    private final void bm(MessageCoreData messageCoreData, eopt eoptVar) {
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoop eoopVar = (eoop) eopq.a.createBuilder();
        long b = ((akvz) this.p.b()).b(messageCoreData.z());
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopqVar.b |= 1073741824;
        eopqVar.G = b;
        long j2 = eoptVar.d;
        eoopVar.copyOnWrite();
        eopq eopqVar2 = (eopq) eoopVar.instance;
        eopqVar2.b |= 128;
        eopqVar2.n = j2;
        eovw eovwVar = csjc.a;
        eoopVar.copyOnWrite();
        eopq eopqVar3 = (eopq) eoopVar.instance;
        eopqVar3.N = eovwVar.x;
        eopqVar3.c |= 512;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eopq eopqVar4 = (eopq) eoopVar.build();
        eopqVar4.getClass();
        eolvVar.l = eopqVar4;
        eolvVar.b |= 4;
        eolt eoltVar = eolt.BUGLE_ANNOTATION;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eolvVar2.j = eoltVar.dk;
        eolvVar2.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar3 = (eolv) eoluVar.instance;
        eoptVar.getClass();
        eolvVar3.z = eoptVar;
        eolvVar3.b |= 262144;
        this.w.j(eoluVar);
    }

    private final void bn(final eokv eokvVar, final ConversationIdType conversationIdType) {
        axnw.h(((alvz) this.H.b()).a(-1).h(new emwl() { // from class: alve
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eotr eotrVar = (eotr) obj;
                final alvq alvqVar = alvq.this;
                long b = ((akvz) alvqVar.p.b()).b(conversationIdType);
                eokv eokvVar2 = eokvVar;
                eokvVar2.copyOnWrite();
                eokw eokwVar = (eokw) eokvVar2.instance;
                eokw eokwVar2 = eokw.a;
                eokwVar.b |= 65536;
                eokwVar.r = b;
                eokvVar2.copyOnWrite();
                eokw eokwVar3 = (eokw) eokvVar2.instance;
                eotrVar.getClass();
                eokwVar3.y = eotrVar;
                eokwVar3.b |= 16777216;
                eokw eokwVar4 = (eokw) eokvVar2.build();
                final eolu eoluVar = (eolu) eolv.a.createBuilder();
                eolt eoltVar = eolt.BUGLE_CONVERSATION_LATCH_STATUS_CHANGE;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                eolvVar.j = eoltVar.dk;
                eolvVar.b |= 1;
                eoluVar.copyOnWrite();
                eolv eolvVar2 = (eolv) eoluVar.instance;
                eokwVar4.getClass();
                eolvVar2.m = eokwVar4;
                eolvVar2.b |= 8;
                eowr eowrVar = (eowr) eowt.a.createBuilder();
                int d = alvqVar.d();
                eowrVar.copyOnWrite();
                eowt eowtVar = (eowt) eowrVar.instance;
                eowtVar.b |= 1;
                eowtVar.c = d;
                String e = ((alvz) alvqVar.H.b()).e();
                eowrVar.copyOnWrite();
                eowt eowtVar2 = (eowt) eowrVar.instance;
                e.getClass();
                eowtVar2.b |= 4;
                eowtVar2.e = e;
                final eowt eowtVar3 = (eowt) eowrVar.build();
                axnw.h(alvqVar.aU().h(new emwl() { // from class: aluy
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        eoup eoupVar = (eoup) obj2;
                        eoupVar.copyOnWrite();
                        eovl eovlVar = (eovl) eoupVar.instance;
                        eovl eovlVar2 = eovl.a;
                        eowt eowtVar4 = eowtVar3;
                        eowtVar4.getClass();
                        eovlVar.z = eowtVar4;
                        eovlVar.b |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
                        eovl eovlVar3 = (eovl) eoupVar.build();
                        eolu eoluVar2 = eoluVar;
                        eoluVar2.copyOnWrite();
                        eolv eolvVar3 = (eolv) eoluVar2.instance;
                        eolv eolvVar4 = eolv.a;
                        eovlVar3.getClass();
                        eolvVar3.q = eovlVar3;
                        eolvVar3.b |= 256;
                        alvq.this.w.j(eoluVar2);
                        return null;
                    }
                }, erpp.a));
                return null;
            }
        }, this.A));
    }

    private final void bo(int i2, int i3, int i4, long j2, int i5, int i6, long j3, boolean z, ConversationIdType conversationIdType) {
        if (!this.y.get()) {
            r();
            return;
        }
        eowr eowrVar = (eowr) eowt.a.createBuilder();
        int d = d();
        eowrVar.copyOnWrite();
        eowt eowtVar = (eowt) eowrVar.instance;
        eowtVar.b |= 1;
        eowtVar.c = d;
        String e = ((alvz) this.H.b()).e();
        eowrVar.copyOnWrite();
        eowt eowtVar2 = (eowt) eowrVar.instance;
        e.getClass();
        eowtVar2.b |= 4;
        eowtVar2.e = e;
        eowt eowtVar3 = (eowt) eowrVar.build();
        eohv b = ((aljq) this.q.b()).b(i2);
        eoqf c = altl.c(i3);
        eoop eoopVar = (eoop) eopq.a.createBuilder();
        long b2 = ((akvz) this.p.b()).b(conversationIdType);
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopqVar.b |= 1073741824;
        eopqVar.G = b2;
        eoopVar.copyOnWrite();
        eopq eopqVar2 = (eopq) eoopVar.instance;
        eopqVar2.b |= 128;
        eopqVar2.n = j2;
        eoopVar.copyOnWrite();
        eopq eopqVar3 = (eopq) eoopVar.instance;
        eopqVar3.g = 2;
        eopqVar3.b |= 1;
        eoopVar.copyOnWrite();
        eopq eopqVar4 = (eopq) eoopVar.instance;
        eopqVar4.h = 6;
        eopqVar4.b = 2 | eopqVar4.b;
        eoqk a = ((akyw) this.r.b()).a(i2);
        eoopVar.copyOnWrite();
        eopq eopqVar5 = (eopq) eoopVar.instance;
        eopqVar5.i = a;
        eopqVar5.b |= 4;
        eoopVar.copyOnWrite();
        eopq eopqVar6 = (eopq) eoopVar.instance;
        eopqVar6.c |= 1;
        eopqVar6.J = "NOT_AVAILABLE";
        eoopVar.copyOnWrite();
        eopq eopqVar7 = (eopq) eoopVar.instance;
        eowtVar3.getClass();
        eopqVar7.y = eowtVar3;
        eopqVar7.b |= 4194304;
        int bf = bf(conversationIdType);
        eoopVar.copyOnWrite();
        eopq eopqVar8 = (eopq) eoopVar.instance;
        eopqVar8.x = bf - 1;
        eopqVar8.b |= 2097152;
        eoqh bd = bd(c, i4, i3, i6, 0);
        eoopVar.copyOnWrite();
        eopq eopqVar9 = (eopq) eoopVar.instance;
        bd.getClass();
        eopqVar9.f = bd;
        eopqVar9.e = 7;
        eoopVar.copyOnWrite();
        eopq eopqVar10 = (eopq) eoopVar.instance;
        b.getClass();
        eopqVar10.U = b;
        eopqVar10.c |= 65536;
        eovw eovwVar = csjc.a;
        eoopVar.copyOnWrite();
        eopq eopqVar11 = (eopq) eoopVar.instance;
        eopqVar11.N = eovwVar.x;
        eopqVar11.c |= 512;
        ((alvz) this.H.b()).l(eoopVar, 3, 7, i2);
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_MESSAGE;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eopq eopqVar12 = (eopq) eoopVar.build();
        eopqVar12.getClass();
        eolvVar2.l = eopqVar12;
        eolvVar2.b |= 4;
        eopq eopqVar13 = ((eolv) eoluVar.instance).l;
        if (eopqVar13 == null) {
            eopqVar13 = eopq.a;
        }
        bq(eopqVar13.e == 7 ? (eoqh) eopqVar13.f : eoqh.a, i4, b);
        this.x.a().j(eoluVar, alal.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
        if (z || i5 != 106) {
            return;
        }
        ba(j3, "Bugle.Download.Failure.Attachment.Size.Bucket.Mms");
        ((akzt) this.T.b()).c("Bugle.DataModel.Action.Download.Failure.Count.Mms");
    }

    private final void bp(MessageCoreData messageCoreData, eoit eoitVar, boolean z) {
        eopr eoprVar = (eopr) eopt.a.createBuilder();
        if (z) {
            long t = messageCoreData.t();
            eoprVar.copyOnWrite();
            eopt eoptVar = (eopt) eoprVar.instance;
            eoptVar.b |= 2;
            eoptVar.d = t;
            eoprVar.copyOnWrite();
            eopt eoptVar2 = (eopt) eoprVar.instance;
            eoptVar2.c = 3;
            eoptVar2.b = 1 | eoptVar2.b;
            eoprVar.copyOnWrite();
            eopt eoptVar3 = (eopt) eoprVar.instance;
            eoitVar.getClass();
            eoptVar3.g = eoitVar;
            eoptVar3.b |= 16;
        } else {
            long t2 = messageCoreData.t();
            eoprVar.copyOnWrite();
            eopt eoptVar4 = (eopt) eoprVar.instance;
            eoptVar4.b |= 2;
            eoptVar4.d = t2;
            eoprVar.copyOnWrite();
            eopt eoptVar5 = (eopt) eoprVar.instance;
            eoptVar5.c = 1;
            eoptVar5.b = 1 | eoptVar5.b;
            eoprVar.copyOnWrite();
            eopt eoptVar6 = (eopt) eoprVar.instance;
            eoitVar.getClass();
            eoptVar6.e = eoitVar;
            eoptVar6.b |= 4;
        }
        bm(messageCoreData, (eopt) eoprVar.build());
    }

    private static void bq(eoqh eoqhVar, int i2, eohv eohvVar) {
        csjb a = i.a();
        a.I("MMS failed.");
        eoqf b = eoqf.b(eoqhVar.c);
        if (b == null) {
            b = eoqf.UNKNOWN_BUGLE_MMS_FAILURE_CODE;
        }
        a.A("failureCode", b);
        a.y("httpStatusCode", i2);
        a.r();
        eojh eojhVar = eoqhVar.f;
        if (eojhVar == null) {
            eojhVar = eojh.a;
        }
        bu(eojhVar);
        br(eohvVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void br(defpackage.eohv r3) {
        /*
            cskc r0 = defpackage.alvq.i
            csjb r0 = r0.a()
            java.lang.String r1 = "Network details."
            r0.I(r1)
            int r1 = r3.d
            int r1 = defpackage.eoht.a(r1)
            if (r1 != 0) goto L14
            goto L2c
        L14:
            r2 = 1
            if (r1 == r2) goto L2c
            r2 = 2
            if (r1 == r2) goto L29
            r2 = 3
            if (r1 == r2) goto L26
            r2 = 4
            if (r1 == r2) goto L23
            java.lang.String r1 = "TYPE_OTHER"
            goto L2e
        L23:
            java.lang.String r1 = "TYPE_WIMAX"
            goto L2e
        L26:
            java.lang.String r1 = "TYPE_WIFI"
            goto L2e
        L29:
            java.lang.String r1 = "TYPE_MOBILE_DATA"
            goto L2e
        L2c:
            java.lang.String r1 = "TYPE_UNKNOWN"
        L2e:
            java.lang.String r2 = "networkType"
            r0.A(r2, r1)
            int r1 = r3.e
            int r1 = defpackage.eohp.a(r1)
            if (r1 != 0) goto L3c
            goto L66
        L3c:
            switch(r1) {
                case 1: goto L66;
                case 2: goto L63;
                case 3: goto L60;
                case 4: goto L5d;
                case 5: goto L5a;
                case 6: goto L57;
                case 7: goto L54;
                case 8: goto L51;
                case 9: goto L4e;
                case 10: goto L4b;
                case 11: goto L48;
                case 12: goto L45;
                case 13: goto L42;
                default: goto L3f;
            }
        L3f:
            java.lang.String r1 = "STATE_VERIFYING_POOR_LINK"
            goto L68
        L42:
            java.lang.String r1 = "STATE_SUSPENDED"
            goto L68
        L45:
            java.lang.String r1 = "STATE_SCANNING"
            goto L68
        L48:
            java.lang.String r1 = "STATE_OBTAINING_IPADDR"
            goto L68
        L4b:
            java.lang.String r1 = "STATE_IDLE"
            goto L68
        L4e:
            java.lang.String r1 = "STATE_FAILED"
            goto L68
        L51:
            java.lang.String r1 = "STATE_DISCONNECTING"
            goto L68
        L54:
            java.lang.String r1 = "STATE_DISCONNECTED"
            goto L68
        L57:
            java.lang.String r1 = "STATE_CONNECTING"
            goto L68
        L5a:
            java.lang.String r1 = "STATE_CONNECTED"
            goto L68
        L5d:
            java.lang.String r1 = "STATE_CAPTIVE_PORTAL_CHECK"
            goto L68
        L60:
            java.lang.String r1 = "STATE_BLOCKED"
            goto L68
        L63:
            java.lang.String r1 = "STATE_AUTHENTICATING"
            goto L68
        L66:
            java.lang.String r1 = "STATE_UNKNOWN"
        L68:
            java.lang.String r2 = "detailedState"
            r0.A(r2, r1)
            boolean r1 = r3.f
            java.lang.String r2 = "isRoaming"
            r0.B(r2, r1)
            int r1 = r3.g
            eplj r1 = defpackage.eplj.b(r1)
            if (r1 != 0) goto L7e
            eplj r1 = defpackage.eplj.UNKNOWN_SIGNAL_STRENGTH
        L7e:
            java.lang.String r2 = "signalStrength"
            java.lang.String r1 = r1.name()
            r0.A(r2, r1)
            boolean r1 = r3.h
            java.lang.String r2 = "airplaneModeOn"
            r0.B(r2, r1)
            boolean r3 = r3.i
            java.lang.String r1 = "mobileDataEnabled"
            r0.B(r1, r3)
            r0.r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alvq.br(eohv):void");
    }

    private final void bs(int i2, MessageCoreData messageCoreData) {
        boolean cS = messageCoreData.cS();
        if (messageCoreData.cX() && (!((atrh) this.ac.b()).a() ? !((ckds) this.ab.b()).F(i2) : !((djrv) this.am.b()).x(i2))) {
            if (i2 == -1) {
                ensk j2 = j.j();
                j2.Y(ente.a, "BugleUsageStatistics");
                enrr enrrVar = (enrr) j2;
                enrrVar.aa(ensy.MEDIUM);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "logRcsSubIdMismatchIfExists", 3445, "UsageStatisticsImpl.java")).t("DEFAULT_SUB_ID used during RCS Message %s", new evhq(evhp.NO_USER_DATA, true != cS ? "receive" : "send"));
            } else {
                ((akzt) this.T.b()).c("Bugle.Multisim.ProvisionedSubIdAndMessageIdMismatch.Count");
            }
        }
        if (messageCoreData.cX()) {
            aztg f2 = ((bdtd) this.Z.b()).f(messageCoreData.v());
            if (f2 == null) {
                ensk j3 = j.j();
                j3.Y(ente.a, "BugleUsageStatistics");
                enrr enrrVar2 = (enrr) j3;
                enrrVar2.aa(ensy.MEDIUM);
                ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "shouldLogMismatch", 3504, "UsageStatisticsImpl.java")).q("Message subscription is null");
                return;
            }
            int e = f2.e();
            if (f2.e() < 0) {
                ensk j4 = j.j();
                j4.Y(ente.a, "BugleUsageStatistics");
                enrr enrrVar3 = (enrr) j4;
                enrrVar3.aa(ensy.MEDIUM);
                ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "isValidSubscription", 3493, "UsageStatisticsImpl.java")).q("Message subId is invalid");
                ((akzt) this.T.b()).c("Bugle.Multisim.ProvisionedSubIdInvalid.Count");
                return;
            }
            if (((djrv) this.am.b()).x(e)) {
                return;
            }
            ((akzt) this.T.b()).c(true != cS ? "Bugle.Multisim.ProvisionedSubIdAndMessageIdMismatchDuringReceive.Count" : "Bugle.Multisim.ProvisionedSubIdAndMessageIdMismatchDuringSend.Count");
            ensk j5 = j.j();
            j5.Y(ente.a, "BugleUsageStatistics");
            enrr enrrVar4 = (enrr) j5;
            enrrVar4.aa(ensy.MEDIUM);
            ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "logRcsSubIdMismatchIfExists", 3462, "UsageStatisticsImpl.java")).t("Message subId and the sender subId is mismatched for RCS Message %s", new evhq(evhp.NO_USER_DATA, true == cS ? "send" : "receive"));
        }
    }

    private static void bt(eouc eoucVar, eohv eohvVar) {
        csjb a = i.a();
        a.I("SMS failed.");
        a.y("errorCode", eoucVar.c);
        eoub b = eoub.b(eoucVar.e);
        if (b == null) {
            b = eoub.PHONE_TYPE_NONE;
        }
        a.A("phoneType", b);
        a.r();
        eojh eojhVar = eoucVar.d;
        if (eojhVar == null) {
            eojhVar = eojh.a;
        }
        bu(eojhVar);
        br(eohvVar);
    }

    private static void bu(eojh eojhVar) {
        csjb a = i.a();
        a.I("XMS common failed details.");
        a.y("resultCode", eojhVar.c);
        a.r();
    }

    @Deprecated
    private final void bv(String str, int i2, String str2, int i3, String str3, byzi byziVar) {
        engw engwVar;
        aoku u = ((aolr) this.P.b()).u(str, i2);
        if (!this.y.get()) {
            r();
            return;
        }
        int i4 = cglt.a;
        if (TextUtils.isEmpty(str3)) {
            int i5 = engw.d;
            engwVar = enou.a;
        } else {
            SpannableString valueOf = SpannableString.valueOf(str3);
            if (Linkify.addLinks(valueOf, 7)) {
                Stream map = DesugarArrays.stream((URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class)).map(new Function() { // from class: cglp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        URLSpan uRLSpan = (URLSpan) obj;
                        int i6 = cglt.a;
                        return uRLSpan.getURL().startsWith("tel:") ? cgln.PHONE_NUMBER : uRLSpan.getURL().startsWith("mailto:") ? cgln.EMAIL_ADDRESS : cgln.WEB_URL;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i6 = engw.d;
                engwVar = (engw) map.collect(endq.a);
            } else {
                int i7 = engw.d;
                engwVar = enou.a;
            }
        }
        engw g2 = ((enip) Collection.EL.stream(engwVar).map(new Function() { // from class: altq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                long j2 = alvq.h;
                return (eowa) enhk.n(cgln.PHONE_NUMBER, eowa.PHONE_NUMBER, cgln.EMAIL_ADDRESS, eowa.EMAIL_ADDRESS, cgln.WEB_URL, eowa.WEB_URL).getOrDefault((cgln) obj, eowa.UNKNOWN);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.b)).g();
        eovy eovyVar = (eovy) eowb.a.createBuilder();
        eovo eovoVar = (eovo) aV().getOrDefault(byziVar, eovo.UNKNOWN);
        if (u.n() != null) {
            String b = emxe.b(u.n());
            if (eovo.VERIFIED != eovoVar) {
                b = "pii(" + b.length() + ")";
            }
            eovyVar.copyOnWrite();
            eowb eowbVar = (eowb) eovyVar.instance;
            eowbVar.b |= 1;
            eowbVar.c = b;
        }
        eovyVar.copyOnWrite();
        eowb eowbVar2 = (eowb) eovyVar.instance;
        eowbVar2.e = eovoVar.g;
        eowbVar2.b |= 4;
        long c = ((akvz) this.p.b()).c(str2);
        eovyVar.copyOnWrite();
        eowb eowbVar3 = (eowb) eovyVar.instance;
        eowbVar3.b |= 8;
        eowbVar3.f = c;
        eoqk a = ((akyw) this.r.b()).a(i2);
        eovyVar.copyOnWrite();
        eowb eowbVar4 = (eowb) eovyVar.instance;
        eowbVar4.d = a;
        eowbVar4.b |= 2;
        eovyVar.copyOnWrite();
        eowb eowbVar5 = (eowb) eovyVar.instance;
        eygi eygiVar = eowbVar5.g;
        if (!eygiVar.c()) {
            eowbVar5.g = eyfy.mutableCopy(eygiVar);
        }
        Iterator<E> it = g2.iterator();
        while (it.hasNext()) {
            eowbVar5.g.h(((eowa) it.next()).f);
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_BUSINESS_MESSAGING_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eovx eovxVar = (eovx) eowd.a.createBuilder();
        eovxVar.copyOnWrite();
        eowd eowdVar = (eowd) eovxVar.instance;
        eowdVar.c = i3 - 1;
        eowdVar.b |= 1;
        eovxVar.copyOnWrite();
        eowd eowdVar2 = (eowd) eovxVar.instance;
        eowb eowbVar6 = (eowb) eovyVar.build();
        eowbVar6.getClass();
        eowdVar2.d = eowbVar6;
        eowdVar2.b |= 2;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eowd eowdVar3 = (eowd) eovxVar.build();
        eowdVar3.getClass();
        eolvVar2.al = eowdVar3;
        eolvVar2.d |= 16;
        this.w.n(eoluVar);
    }

    private final void bw(int i2, int i3, eolt eoltVar) {
        if (!this.y.get()) {
            r();
            return;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eokc eokcVar = (eokc) eokd.a.createBuilder();
        eokcVar.copyOnWrite();
        eokd eokdVar = (eokd) eokcVar.instance;
        int i4 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        eokdVar.d = i4;
        eokdVar.b |= 2;
        eokcVar.copyOnWrite();
        eokd eokdVar2 = (eokd) eokcVar.instance;
        eokdVar2.c = i3 - 1;
        eokdVar2.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eokd eokdVar3 = (eokd) eokcVar.build();
        eokdVar3.getClass();
        eolvVar2.D = eokdVar3;
        eolvVar2.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        this.w.j(eoluVar);
    }

    private final void bx(final bdhg bdhgVar, final MessageCoreData messageCoreData, final int i2, final int i3, final eqxi eqxiVar, final eqyl eqylVar, final eooi eooiVar) {
        if (this.y.get()) {
            axnw.h(elfo.f(new Runnable() { // from class: aluz
                @Override // java.lang.Runnable
                public final void run() {
                    int i4;
                    final alvq alvqVar = alvq.this;
                    final MessageCoreData messageCoreData2 = messageCoreData;
                    Optional ofNullable = Optional.ofNullable(eqylVar);
                    int aS = alvqVar.aS(messageCoreData2);
                    eqwf aX = alvqVar.aX(aS);
                    eoop eoopVar = (eoop) eopq.a.createBuilder();
                    int i5 = i2;
                    if (i5 == 1) {
                        i4 = 6;
                    } else if (i5 != 3) {
                        if (i5 == 10) {
                            i4 = 7;
                        } else {
                            if (i5 != 25) {
                                throw new IllegalArgumentException(a.h(i5, "notificationType does not correspond to IMDN: "));
                            }
                            i4 = 8;
                        }
                    } else {
                        if (!augq.a()) {
                            throw new IllegalArgumentException(a.h(i5, "notificationType does not correspond to IMDN: "));
                        }
                        i4 = 16;
                    }
                    bdhg bdhgVar2 = bdhgVar;
                    eoopVar.copyOnWrite();
                    eopq eopqVar = (eopq) eoopVar.instance;
                    eopqVar.g = i4 - 1;
                    eopqVar.b |= 1;
                    eoopVar.copyOnWrite();
                    eopq eopqVar2 = (eopq) eoopVar.instance;
                    eopqVar2.w = aX.N;
                    eopqVar2.b |= 1048576;
                    String k = alvqVar.k(Optional.of(Integer.valueOf(aS)));
                    eoopVar.copyOnWrite();
                    eopq eopqVar3 = (eopq) eoopVar.instance;
                    k.getClass();
                    eopqVar3.c = 1 | eopqVar3.c;
                    eopqVar3.J = k;
                    eoqk a = ((akyw) alvqVar.r.b()).a(aS);
                    eoopVar.copyOnWrite();
                    eopq eopqVar4 = (eopq) eoopVar.instance;
                    eopqVar4.i = a;
                    eopqVar4.b |= 4;
                    eovw eovwVar = csjc.a;
                    eoopVar.copyOnWrite();
                    eopq eopqVar5 = (eopq) eoopVar.instance;
                    eopqVar5.N = eovwVar.x;
                    eopqVar5.c |= 512;
                    alvqVar.aZ(messageCoreData2, eoopVar);
                    String str = bdhgVar2.b;
                    if (str != null) {
                        eoopVar.copyOnWrite();
                        eopq eopqVar6 = (eopq) eoopVar.instance;
                        eopqVar6.b |= Integer.MIN_VALUE;
                        eopqVar6.H = str;
                    }
                    if (messageCoreData2 != null) {
                        int bf = alvqVar.bf(messageCoreData2.z());
                        eoopVar.copyOnWrite();
                        eopq eopqVar7 = (eopq) eoopVar.instance;
                        eopqVar7.x = bf - 1;
                        eopqVar7.b |= 2097152;
                        ((alvz) alvqVar.H.b()).h(messageCoreData2, eoopVar);
                        if (i5 != 10 || !messageCoreData2.cB()) {
                            String f2 = messageCoreData2.E().f();
                            eoopVar.copyOnWrite();
                            eopq eopqVar8 = (eopq) eoopVar.instance;
                            eopqVar8.c |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
                            eopqVar8.af = f2;
                        }
                    }
                    final int i6 = i3;
                    final eoop eoopVar2 = (eoop) ((eopq) eoopVar.build()).toBuilder();
                    eoopVar2.copyOnWrite();
                    eopq eopqVar9 = (eopq) eoopVar2.instance;
                    eooi eooiVar2 = eooiVar;
                    eopqVar9.h = i6 - 1;
                    eopqVar9.b |= 2;
                    if (eooiVar2 == null || !((auoa) alvqVar.M.b()).a()) {
                        eooiVar2 = i6 == 3 ? eooi.INCOMING : eooi.BUGLE_MESSAGE_SOURCE_NA;
                    }
                    final eqxi eqxiVar2 = eqxiVar;
                    eoopVar2.copyOnWrite();
                    eopq eopqVar10 = (eopq) eoopVar2.instance;
                    eopqVar10.m = eooiVar2.J;
                    eopqVar10.b |= 64;
                    ((alvz) alvqVar.H.b()).j(messageCoreData2, eoopVar2, ofNullable);
                    if (messageCoreData2 == null) {
                        messageCoreData2 = null;
                    } else if (messageCoreData2.y() != null) {
                        axnw.h(messageCoreData2.y().f().h(new emwl() { // from class: alur
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                alvq.this.bh(messageCoreData2, i6, eqxiVar2, eoopVar2);
                                return null;
                            }
                        }, alvqVar.B));
                        return;
                    }
                    alvqVar.bh(messageCoreData2, i6, eqxiVar2, eoopVar2);
                }
            }, this.B));
        } else {
            i.m("End to end logging disabled. Not logging IMDN.");
        }
    }

    private final void by(MessageCoreData messageCoreData, int i2, Optional optional, Optional optional2, akzo akzoVar) {
        if (!this.y.get()) {
            r();
            return;
        }
        long t = messageCoreData.t();
        eowr eowrVar = (eowr) eowt.a.createBuilder();
        int d = d();
        eowrVar.copyOnWrite();
        eowt eowtVar = (eowt) eowrVar.instance;
        eowtVar.b |= 1;
        eowtVar.c = d;
        String e = ((alvz) this.H.b()).e();
        eowrVar.copyOnWrite();
        eowt eowtVar2 = (eowt) eowrVar.instance;
        e.getClass();
        eowtVar2.b |= 4;
        eowtVar2.e = e;
        eowt eowtVar3 = (eowt) eowrVar.build();
        int d2 = altl.d(messageCoreData.d());
        final eoop eoopVar = (eoop) eopq.a.createBuilder();
        long b = ((akvz) this.p.b()).b(messageCoreData.z());
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopqVar.b |= 1073741824;
        eopqVar.G = b;
        eoopVar.copyOnWrite();
        eopq eopqVar2 = (eopq) eoopVar.instance;
        eopqVar2.b |= 128;
        eopqVar2.n = t;
        eoopVar.copyOnWrite();
        eopq eopqVar3 = (eopq) eoopVar.instance;
        eopqVar3.g = d2 - 1;
        eopqVar3.b |= 1;
        eoopVar.copyOnWrite();
        eopq eopqVar4 = (eopq) eoopVar.instance;
        eopqVar4.h = i2 - 1;
        eopqVar4.b |= 2;
        eoqk a = ((akyw) this.r.b()).a(-1);
        eoopVar.copyOnWrite();
        eopq eopqVar5 = (eopq) eoopVar.instance;
        eopqVar5.i = a;
        eopqVar5.b |= 4;
        String k = k(Optional.of(-1));
        eoopVar.copyOnWrite();
        eopq eopqVar6 = (eopq) eoopVar.instance;
        k.getClass();
        eopqVar6.c |= 1;
        eopqVar6.J = k;
        eoopVar.copyOnWrite();
        eopq eopqVar7 = (eopq) eoopVar.instance;
        eowtVar3.getClass();
        eopqVar7.y = eowtVar3;
        eopqVar7.b |= 4194304;
        int bf = bf(messageCoreData.z());
        eoopVar.copyOnWrite();
        eopq eopqVar8 = (eopq) eoopVar.instance;
        eopqVar8.x = bf - 1;
        eopqVar8.b |= 2097152;
        eovw eovwVar = csjc.a;
        eoopVar.copyOnWrite();
        eopq eopqVar9 = (eopq) eoopVar.instance;
        eopqVar9.N = eovwVar.x;
        eopqVar9.c |= 512;
        int i3 = true != messageCoreData.cB() ? 3 : 2;
        eoopVar.copyOnWrite();
        eopq eopqVar10 = (eopq) eoopVar.instance;
        eopqVar10.S = i3 - 1;
        eopqVar10.c |= 16384;
        aZ(messageCoreData, eoopVar);
        if (messageCoreData.aJ() != null) {
            fjay aJ = messageCoreData.aJ();
            aJ.getClass();
            eoopVar.copyOnWrite();
            eopq eopqVar11 = (eopq) eoopVar.instance;
            eopqVar11.o = aJ;
            eopqVar11.b |= 1024;
        }
        ((alvz) this.H.b()).j(messageCoreData, eoopVar, optional2);
        optional.ifPresent(new Consumer() { // from class: alug
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                long j2 = alvq.h;
                eoks b2 = altl.b((Integer) obj);
                eoop eoopVar2 = eoop.this;
                eoopVar2.copyOnWrite();
                eopq eopqVar12 = (eopq) eoopVar2.instance;
                eopq eopqVar13 = eopq.a;
                eopqVar12.r = b2.f;
                eopqVar12.b |= 16384;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        messageCoreData.E().g(new Consumer() { // from class: alun
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                long j2 = alvq.h;
                String f2 = ((bdhg) obj).f();
                eoop eoopVar2 = eoop.this;
                eoopVar2.copyOnWrite();
                eopq eopqVar12 = (eopq) eoopVar2.instance;
                eopq eopqVar13 = eopq.a;
                eopqVar12.b |= Integer.MIN_VALUE;
                eopqVar12.H = f2;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((alvz) this.H.b()).f(eoopVar, -1);
        ((alvz) this.H.b()).h(messageCoreData, eoopVar);
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_MESSAGE;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eopq eopqVar12 = (eopq) eoopVar.build();
        eopqVar12.getClass();
        eolvVar2.l = eopqVar12;
        eolvVar2.b |= 4;
        akxn a2 = this.x.a();
        a2.f(akzoVar);
        a2.j(eoluVar, alal.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
        eopq eopqVar13 = (eopq) eoopVar.instance;
        long j2 = eopqVar13.n;
        int b2 = eook.b(eopqVar13.h);
        alrn.a(j2, b2 != 0 ? b2 : 1, akzoVar);
    }

    @Override // defpackage.altk
    public final void A(bdhg bdhgVar, MessageCoreData messageCoreData, int i2, eqyl eqylVar) {
        bx(bdhgVar, messageCoreData, i2, 3, null, eqylVar, null);
    }

    @Override // defpackage.altk
    public final void B(bdhg bdhgVar, MessageCoreData messageCoreData, int i2, eqyl eqylVar, eooi eooiVar) {
        bx(bdhgVar, messageCoreData, i2, 8, null, eqylVar, eooiVar);
    }

    @Override // defpackage.altk
    public final void C(bdhg bdhgVar, MessageCoreData messageCoreData, int i2, eqyl eqylVar) {
        if (messageCoreData != null) {
            bl(messageCoreData, alrm.a(messageCoreData, 3));
        }
        bx(bdhgVar, messageCoreData, i2, 2, null, eqylVar, null);
    }

    @Override // defpackage.altk
    public final void D(bdhg bdhgVar, MessageCoreData messageCoreData, int i2, eqxi eqxiVar, eqyl eqylVar) {
        bx(bdhgVar, messageCoreData, i2, 6, eqxiVar, eqylVar, null);
    }

    @Override // defpackage.altk
    public final void E(MessageCoreData messageCoreData, eoit eoitVar) {
        if (this.y.get()) {
            bp(messageCoreData, eoitVar, false);
        } else {
            r();
        }
    }

    @Override // defpackage.altk
    public final void F(MessageCoreData messageCoreData, eoit eoitVar) {
        if (this.y.get()) {
            bp(messageCoreData, eoitVar, true);
        } else {
            r();
        }
    }

    @Override // defpackage.altk
    @Deprecated
    public final void G(MessageCoreData messageCoreData, String str) {
        new alqr(messageCoreData, str);
    }

    @Override // defpackage.altk
    @Deprecated
    public final void H(MessageCoreData messageCoreData, String str) {
        new alqs(messageCoreData, str);
    }

    @Override // defpackage.altk
    public final void I(MessageCoreData messageCoreData, int i2, eopq eopqVar) {
        emxf.a(altl.d(messageCoreData.d()) != 3);
        if (!this.y.get()) {
            i.m("Clearcut loggings are disabled.");
            return;
        }
        emxf.a(messageCoreData.cY());
        MessagePartCoreData G = messageCoreData.G();
        G.getClass();
        ba(G.p(), "Bugle.Download.Failure.Attachment.Size.Bucket.Rcs");
        eqyl b = eqyl.b(eopqVar.aa);
        if (b == null) {
            b = eqyl.UNKNOWN_RCS_TYPE;
        }
        int ordinal = b.ordinal();
        if (ordinal == 0) {
            throw new IllegalStateException("Unknown RCS transport type.");
        }
        if (ordinal == 1) {
            ((akzt) this.T.b()).c("Bugle.DataModel.Action.Download.Failure.Count.Rcs");
        } else if (ordinal == 2) {
            ((akzt) this.T.b()).c("Bugle.DataModel.Action.Download.Failure.Count.Rcs.Smapi");
        } else if (ordinal == 3) {
            ((akzt) this.T.b()).c("Bugle.DataModel.Action.Download.Failure.Count.Rcs.Tachygram");
        } else if (ordinal == 4) {
            throw new IllegalStateException("Not RCS.");
        }
        eqyl b2 = eqyl.b(eopqVar.aa);
        if (b2 == null) {
            b2 = eqyl.UNKNOWN_RCS_TYPE;
        }
        Optional of = Optional.of(b2);
        eoov b3 = eoov.b(eopqVar.ak);
        if (b3 == null) {
            b3 = eoov.UNKNOWN_FORMAT_TYPE;
        }
        aC(messageCoreData, i2, -2, 0, -1, 7, null, 1, 0, of, Optional.of(b3), Optional.empty());
    }

    @Override // defpackage.altk
    public final void J(final MessageCoreData messageCoreData, final Integer num, final int i2, final eonp eonpVar) {
        Throwable th;
        ekzz f2 = eleg.f("UsageStatisticsImpl::logMessageIdCreated");
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (this.y.get()) {
                final eoop eoopVar = (eoop) eopq.a.createBuilder();
                try {
                    axnw.h((messageCoreData.y() != null ? messageCoreData.y().f() : elfo.e(null)).i(new eroh() { // from class: aluu
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            return ((alvz) alvq.this.H.b()).b(messageCoreData, eoopVar);
                        }
                    }, erpp.a).h(new emwl() { // from class: aluv
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            eoln eolnVar;
                            final alvq alvqVar = alvq.this;
                            final MessageCoreData messageCoreData2 = messageCoreData;
                            final eoop eoopVar2 = eoopVar;
                            ekzz f3 = eleg.f("UsageStatisticsImpl::logActiveUserSendMessage");
                            eonp eonpVar2 = eonpVar;
                            int i3 = i2;
                            Integer num2 = num;
                            try {
                                int d = altl.d(messageCoreData2.d());
                                long b = ((akvz) alvqVar.p.b()).b(messageCoreData2.z());
                                eoul eoulVar = (eoul) eoum.a.createBuilder();
                                long r = messageCoreData2.r();
                                eoulVar.copyOnWrite();
                                eoum eoumVar = (eoum) eoulVar.instance;
                                eoumVar.b |= 1;
                                eoumVar.c = r;
                                eoum eoumVar2 = (eoum) eoulVar.build();
                                eowr eowrVar = (eowr) eowt.a.createBuilder();
                                int d2 = alvqVar.d();
                                eowrVar.copyOnWrite();
                                eowt eowtVar = (eowt) eowrVar.instance;
                                eowtVar.b |= 1;
                                eowtVar.c = d2;
                                String e = ((alvz) alvqVar.H.b()).e();
                                eowrVar.copyOnWrite();
                                eowt eowtVar2 = (eowt) eowrVar.instance;
                                e.getClass();
                                eowtVar2.b |= 4;
                                eowtVar2.e = e;
                                eowt eowtVar3 = (eowt) eowrVar.build();
                                eohv b2 = ((aljq) alvqVar.q.b()).b(i3);
                                int i4 = i3 >= 0 ? 6 : i3 < -2 ? 2 : i3 == -2 ? 3 : 4;
                                eonn eonnVar = (eonn) eonq.a.createBuilder();
                                eonnVar.copyOnWrite();
                                eonq eonqVar = (eonq) eonnVar.instance;
                                eonqVar.c = eonpVar2.i;
                                eonqVar.b |= 1;
                                eonq eonqVar2 = (eonq) eonnVar.build();
                                eoopVar2.copyOnWrite();
                                eopq eopqVar = (eopq) eoopVar2.instance;
                                eopq eopqVar2 = eopq.a;
                                eopqVar.b |= 1073741824;
                                eopqVar.G = b;
                                long t = messageCoreData2.t();
                                eoopVar2.copyOnWrite();
                                eopq eopqVar3 = (eopq) eoopVar2.instance;
                                eopqVar3.b |= 128;
                                eopqVar3.n = t;
                                eoopVar2.copyOnWrite();
                                eopq eopqVar4 = (eopq) eoopVar2.instance;
                                eopqVar4.g = d - 1;
                                eopqVar4.b |= 1;
                                eoopVar2.copyOnWrite();
                                eopq eopqVar5 = (eopq) eoopVar2.instance;
                                eopqVar5.h = 12;
                                eopqVar5.b |= 2;
                                eoks b3 = altl.b(num2);
                                eoopVar2.copyOnWrite();
                                eopq eopqVar6 = (eopq) eoopVar2.instance;
                                eopqVar6.r = b3.f;
                                eopqVar6.b |= 16384;
                                eoopVar2.copyOnWrite();
                                eopq eopqVar7 = (eopq) eoopVar2.instance;
                                eowtVar3.getClass();
                                eopqVar7.y = eowtVar3;
                                eopqVar7.b |= 4194304;
                                eoopVar2.copyOnWrite();
                                eopq eopqVar8 = (eopq) eoopVar2.instance;
                                eoumVar2.getClass();
                                eopqVar8.k = eoumVar2;
                                eopqVar8.b |= 16;
                                String k = alvqVar.k(Optional.of(Integer.valueOf(i3)));
                                eoopVar2.copyOnWrite();
                                eopq eopqVar9 = (eopq) eoopVar2.instance;
                                k.getClass();
                                eopqVar9.c |= 1;
                                eopqVar9.J = k;
                                eopv k2 = ((alvz) alvqVar.H.b()).k(messageCoreData2.ab(), 13);
                                eoopVar2.copyOnWrite();
                                eopq eopqVar10 = (eopq) eoopVar2.instance;
                                k2.getClass();
                                eopqVar10.j = k2;
                                eopqVar10.b |= 8;
                                eovw eovwVar = csjc.a;
                                eoopVar2.copyOnWrite();
                                eopq eopqVar11 = (eopq) eoopVar2.instance;
                                eopqVar11.N = eovwVar.x;
                                eopqVar11.c |= 512;
                                eoopVar2.copyOnWrite();
                                eopq eopqVar12 = (eopq) eoopVar2.instance;
                                b2.getClass();
                                eopqVar12.U = b2;
                                eopqVar12.c |= 65536;
                                eoopVar2.copyOnWrite();
                                eopq eopqVar13 = (eopq) eoopVar2.instance;
                                eopqVar13.as = i4 - 1;
                                eopqVar13.d |= 128;
                                int i5 = true != messageCoreData2.cB() ? 3 : 2;
                                eoopVar2.copyOnWrite();
                                eopq eopqVar14 = (eopq) eoopVar2.instance;
                                eopqVar14.S = i5 - 1;
                                eopqVar14.c |= 16384;
                                eoopVar2.copyOnWrite();
                                eopq eopqVar15 = (eopq) eoopVar2.instance;
                                eonqVar2.getClass();
                                eopqVar15.aA = eonqVar2;
                                eopqVar15.d |= 32768;
                                alvqVar.aZ(messageCoreData2, eoopVar2);
                                if (messageCoreData2.aJ() != null) {
                                    fjay aJ = messageCoreData2.aJ();
                                    aJ.getClass();
                                    eoopVar2.copyOnWrite();
                                    eopq eopqVar16 = (eopq) eoopVar2.instance;
                                    eopqVar16.o = aJ;
                                    eopqVar16.b |= 1024;
                                }
                                eoqk a = ((akyw) alvqVar.r.b()).a(i3);
                                eoopVar2.copyOnWrite();
                                eopq eopqVar17 = (eopq) eoopVar2.instance;
                                eopqVar17.i = a;
                                eopqVar17.b |= 4;
                                if (bdhg.l(messageCoreData2.E())) {
                                    String f4 = messageCoreData2.E().f();
                                    eoopVar2.copyOnWrite();
                                    eopq eopqVar18 = (eopq) eoopVar2.instance;
                                    eopqVar18.b |= Integer.MIN_VALUE;
                                    eopqVar18.H = f4;
                                }
                                ((alvz) alvqVar.H.b()).i(messageCoreData2, eoopVar2);
                                ((alvz) alvqVar.H.b()).h(messageCoreData2, eoopVar2);
                                ((alvz) alvqVar.H.b()).l(eoopVar2, d, 13, i3);
                                ((alvz) alvqVar.H.b()).f(eoopVar2, i3);
                                eopq eopqVar19 = (eopq) eoopVar2.instance;
                                if ((eopqVar19.b & 2048) != 0) {
                                    eolo eoloVar = eopqVar19.p;
                                    if (eoloVar == null) {
                                        eoloVar = eolo.a;
                                    }
                                    eolnVar = (eoln) eoloVar.toBuilder();
                                } else {
                                    eolnVar = (eoln) eolo.a.createBuilder();
                                }
                                int size = ((crgh) alvqVar.J.b()).e().size();
                                eolnVar.copyOnWrite();
                                eolo eoloVar2 = (eolo) eolnVar.instance;
                                eoloVar2.b |= 16;
                                eoloVar2.d = size;
                                eoopVar2.copyOnWrite();
                                eopq eopqVar20 = (eopq) eoopVar2.instance;
                                eolo eoloVar3 = (eolo) eolnVar.build();
                                eoloVar3.getClass();
                                eopqVar20.p = eoloVar3;
                                eopqVar20.b |= 2048;
                                MessageUsageStatisticsData y = messageCoreData2.y();
                                if (y != null) {
                                    if (y.j() != null) {
                                        eooi j2 = y.j();
                                        eoopVar2.copyOnWrite();
                                        eopq eopqVar21 = (eopq) eoopVar2.instance;
                                        eopqVar21.m = j2.J;
                                        eopqVar21.b |= 64;
                                    }
                                    eooo k3 = y.k();
                                    eooe h2 = y.h();
                                    eqwf aX = alvqVar.aX(i3);
                                    eoxo l = y.l();
                                    eoopVar2.copyOnWrite();
                                    eopq eopqVar22 = (eopq) eoopVar2.instance;
                                    eopqVar22.u = k3.d;
                                    eopqVar22.b |= 262144;
                                    eoopVar2.copyOnWrite();
                                    eopq eopqVar23 = (eopq) eoopVar2.instance;
                                    eopqVar23.v = h2.p;
                                    eopqVar23.b |= 524288;
                                    if (aX != null) {
                                        eoopVar2.copyOnWrite();
                                        eopq eopqVar24 = (eopq) eoopVar2.instance;
                                        eopqVar24.w = aX.N;
                                        eopqVar24.b |= 1048576;
                                    }
                                    if (l != null && cful.a(ThreadLocalRandom.current(), alvq.d)) {
                                        eoopVar2.copyOnWrite();
                                        eopq eopqVar25 = (eopq) eoopVar2.instance;
                                        eopqVar25.P = l;
                                        eopqVar25.c |= 2048;
                                    }
                                    DeviceData d3 = y.d();
                                    if (d3 != null) {
                                        eolm eolmVar = d3.a;
                                        eoln eolnVar2 = (eoln) eolo.a.createBuilder();
                                        eolnVar2.copyOnWrite();
                                        eolo eoloVar4 = (eolo) eolnVar2.instance;
                                        eoloVar4.c = eolmVar.f;
                                        eoloVar4.b |= 1;
                                        eolo eoloVar5 = (eolo) eolnVar2.build();
                                        eoopVar2.copyOnWrite();
                                        eopq eopqVar26 = (eopq) eoopVar2.instance;
                                        eoloVar5.getClass();
                                        eopqVar26.q = eoloVar5;
                                        eopqVar26.b |= 8192;
                                    }
                                    y.m().ifPresent(new Consumer() { // from class: alvg
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void o(Object obj2) {
                                            long j3 = alvq.h;
                                            long min = Math.min(((Long) obj2).longValue(), ((Long) alvq.f.e()).longValue());
                                            eoop eoopVar3 = eoop.this;
                                            eoopVar3.copyOnWrite();
                                            eopq eopqVar27 = (eopq) eoopVar3.instance;
                                            eopq eopqVar28 = eopq.a;
                                            eopqVar27.c |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
                                            eopqVar27.ac = min;
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    Optional n = y.n();
                                    eoopVar2.getClass();
                                    n.ifPresent(new Consumer() { // from class: alvh
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void o(Object obj2) {
                                            boolean booleanValue = ((Boolean) obj2).booleanValue();
                                            eoop eoopVar3 = eoop.this;
                                            eoopVar3.copyOnWrite();
                                            eopq eopqVar27 = (eopq) eoopVar3.instance;
                                            eopq eopqVar28 = eopq.a;
                                            eopqVar27.c |= 16777216;
                                            eopqVar27.ad = booleanValue;
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                }
                                eolu eoluVar = (eolu) eolv.a.createBuilder();
                                eolt eoltVar = eolt.BUGLE_MESSAGE;
                                eoluVar.copyOnWrite();
                                eolv eolvVar = (eolv) eoluVar.instance;
                                eolvVar.j = eoltVar.dk;
                                eolvVar.b = 1 | eolvVar.b;
                                eoluVar.copyOnWrite();
                                eolv eolvVar2 = (eolv) eoluVar.instance;
                                eopq eopqVar27 = (eopq) eoopVar2.build();
                                eopqVar27.getClass();
                                eolvVar2.l = eopqVar27;
                                eolvVar2.b |= 4;
                                akxn a2 = alvqVar.x.a();
                                a2.d(epyw.ACTIVE_USER_SEND_MESSAGE);
                                a2.j(eoluVar, alal.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
                                Instant f5 = alvqVar.u.f();
                                ((alqf) alvqVar.L.b()).g(f5);
                                ((alqf) alvqVar.L.b()).f(f5);
                                alqf alqfVar = (alqf) alvqVar.L.b();
                                f5.getClass();
                                alol alolVar = alqfVar.d;
                                emau.a(ffsl.b(ekxi.a(alqfVar.b.hT())), alqfVar.c, new alqb(null, alqfVar, alol.b(f5)));
                                if (messageCoreData2.cX()) {
                                    ((alqf) alvqVar.L.b()).h(f5);
                                    alqf alqfVar2 = (alqf) alvqVar.L.b();
                                    f5.getClass();
                                    alol alolVar2 = alqfVar2.d;
                                    emau.a(ffsl.b(ekxi.a(alqfVar2.b.hT())), alqfVar2.c, new alpz(null, alqfVar2, alol.b(f5)));
                                }
                                elfo.f(new Runnable() { // from class: alvi
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        eopq eopqVar28 = (eopq) eoopVar2.build();
                                        alvq alvqVar2 = alvq.this;
                                        fjay aJ2 = messageCoreData2.aJ();
                                        Map map = aJ2 != null ? (Map) alvqVar2.k.remove(aJ2.b) : null;
                                        if (map == null) {
                                            ensk j3 = alvq.j.j();
                                            j3.Y(ente.a, "BugleUsageStatistics");
                                            ((enrr) ((enrr) j3).h("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "logMessageSendInitiatedEvents", 969, "UsageStatisticsImpl.java")).q("No send button click recorded, skipping logging CHAT_MESSAGE_SEND_INITIATED.");
                                            return;
                                        }
                                        for (Map.Entry entry : map.entrySet()) {
                                            eoop eoopVar3 = (eoop) eopqVar28.toBuilder();
                                            eoopVar3.copyOnWrite();
                                            eopq eopqVar29 = (eopq) eoopVar3.instance;
                                            eopqVar29.h = 28;
                                            eopqVar29.b |= 2;
                                            eooi eooiVar = (eooi) entry.getKey();
                                            eoopVar3.copyOnWrite();
                                            eopq eopqVar30 = (eopq) eoopVar3.instance;
                                            eopqVar30.m = eooiVar.J;
                                            eopqVar30.b |= 64;
                                            int i6 = 1;
                                            try {
                                                akxn a3 = alvqVar2.x.a();
                                                a3.d(epyw.ACTIVE_USER_SEND_MESSAGE);
                                                a3.f((akzo) entry.getValue());
                                                eolu eoluVar2 = (eolu) eolv.a.createBuilder();
                                                eolt eoltVar2 = eolt.BUGLE_MESSAGE;
                                                eoluVar2.copyOnWrite();
                                                eolv eolvVar3 = (eolv) eoluVar2.instance;
                                                eolvVar3.j = eoltVar2.dk;
                                                eolvVar3.b |= 1;
                                                eopq eopqVar31 = (eopq) eoopVar3.build();
                                                eoluVar2.copyOnWrite();
                                                eolv eolvVar4 = (eolv) eoluVar2.instance;
                                                eopqVar31.getClass();
                                                eolvVar4.l = eopqVar31;
                                                eolvVar4.b |= 4;
                                                a3.j(eoluVar2, alal.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
                                            } catch (Exception e2) {
                                                ensk j4 = alvq.j.j();
                                                j4.Y(ente.a, "BugleUsageStatistics");
                                                ((enrr) ((enrr) ((enrr) j4).g(e2)).h("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "logMessageSendInitiatedEvents", (char) 991, "UsageStatisticsImpl.java")).q("Failed to send logs to Clearcut");
                                            }
                                            eopq eopqVar32 = (eopq) eoopVar3.instance;
                                            long j5 = eopqVar32.n;
                                            int b4 = eook.b(eopqVar32.h);
                                            if (b4 != 0) {
                                                i6 = b4;
                                            }
                                            alrn.a(j5, i6, (akzo) entry.getValue());
                                        }
                                    }
                                }, alvqVar.B);
                                f3.close();
                                alvqVar.D.f(messageCoreData2);
                                return null;
                            } finally {
                            }
                        }
                    }, this.B));
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    try {
                        f2.close();
                        throw th;
                    } catch (Throwable th4) {
                        th.addSuppressed(th4);
                        throw th;
                    }
                }
            } else {
                r();
            }
            f2.close();
        } catch (Throwable th5) {
            th = th5;
            f2.close();
            throw th;
        }
    }

    @Override // defpackage.altk
    public final void K(final alrk alrkVar) {
        if (this.y.get()) {
            axnw.h(elfo.f(new Runnable() { // from class: altp
                @Override // java.lang.Runnable
                public final void run() {
                    alqo alqoVar = (alqo) alrkVar;
                    eqxi eqxiVar = (eqxi) alqoVar.f.orElse(null);
                    alvq.this.bi(alqoVar.a, alqoVar.b, alqoVar.c, alqoVar.d, alqoVar.e, 6, eqxiVar, alqoVar.k, alqoVar.g, Optional.empty(), alqoVar.h, alqoVar.i, alqoVar.j);
                }
            }, this.B));
        } else {
            r();
        }
    }

    @Override // defpackage.altk
    public final void L(MessageCoreData messageCoreData) {
        new alqu(messageCoreData);
    }

    @Override // defpackage.altk
    public final void M(MessageCoreData messageCoreData, int i2) {
        N(messageCoreData, i2, -1);
    }

    @Override // defpackage.altk
    public final void N(final MessageCoreData messageCoreData, final int i2, final int i3) {
        axnw.h(elfo.h(new erog() { // from class: alvj
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final eoop eoopVar = (eoop) eopq.a.createBuilder();
                final alvq alvqVar = alvq.this;
                alvz alvzVar = (alvz) alvqVar.H.b();
                final MessageCoreData messageCoreData2 = messageCoreData;
                elfl b = alvzVar.b(messageCoreData2, eoopVar);
                final int i4 = i2;
                final int i5 = i3;
                return b.h(new emwl() { // from class: aluq
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        alvq alvqVar2 = alvq.this;
                        if (!alvqVar2.y.get()) {
                            alvqVar2.r();
                            return null;
                        }
                        eoop eoopVar2 = eoopVar;
                        MessageCoreData messageCoreData3 = messageCoreData2;
                        alvqVar2.x.getClass();
                        Integer e = alvqVar2.D.e(messageCoreData3.B().b());
                        altj a = alvqVar2.D.a(messageCoreData3.B().b());
                        eowr eowrVar = (eowr) eowt.a.createBuilder();
                        int d = alvqVar2.d();
                        eowrVar.copyOnWrite();
                        eowt eowtVar = (eowt) eowrVar.instance;
                        eowtVar.b |= 1;
                        eowtVar.c = d;
                        String e2 = ((alvz) alvqVar2.H.b()).e();
                        eowrVar.copyOnWrite();
                        eowt eowtVar2 = (eowt) eowrVar.instance;
                        e2.getClass();
                        eowtVar2.b |= 4;
                        eowtVar2.e = e2;
                        eowt eowtVar3 = (eowt) eowrVar.build();
                        int d2 = altl.d(messageCoreData3.d());
                        long b2 = ((akvz) alvqVar2.p.b()).b(messageCoreData3.z());
                        eoopVar2.copyOnWrite();
                        eopq eopqVar = (eopq) eoopVar2.instance;
                        eopq eopqVar2 = eopq.a;
                        eopqVar.b |= 1073741824;
                        eopqVar.G = b2;
                        long t = messageCoreData3.t();
                        eoopVar2.copyOnWrite();
                        eopq eopqVar3 = (eopq) eoopVar2.instance;
                        eopqVar3.b |= 128;
                        eopqVar3.n = t;
                        String f2 = messageCoreData3.E().f();
                        eoopVar2.copyOnWrite();
                        eopq eopqVar4 = (eopq) eoopVar2.instance;
                        eopqVar4.b |= Integer.MIN_VALUE;
                        eopqVar4.H = f2;
                        eoopVar2.copyOnWrite();
                        eopq eopqVar5 = (eopq) eoopVar2.instance;
                        int i6 = i4;
                        eopqVar5.g = d2 - 1;
                        eopqVar5.b |= 1;
                        eoopVar2.copyOnWrite();
                        eopq eopqVar6 = (eopq) eoopVar2.instance;
                        eopqVar6.h = 7;
                        eopqVar6.b |= 2;
                        eoqk a2 = ((akyw) alvqVar2.r.b()).a(i6);
                        eoopVar2.copyOnWrite();
                        eopq eopqVar7 = (eopq) eoopVar2.instance;
                        eopqVar7.i = a2;
                        eopqVar7.b |= 4;
                        String k = alvqVar2.k(Optional.of(Integer.valueOf(i6)));
                        eoopVar2.copyOnWrite();
                        eopq eopqVar8 = (eopq) eoopVar2.instance;
                        k.getClass();
                        eopqVar8.c |= 1;
                        eopqVar8.J = k;
                        eoopVar2.copyOnWrite();
                        eopq eopqVar9 = (eopq) eoopVar2.instance;
                        eowtVar3.getClass();
                        eopqVar9.y = eowtVar3;
                        eopqVar9.b |= 4194304;
                        int bf = alvqVar2.bf(messageCoreData3.z());
                        eoopVar2.copyOnWrite();
                        eopq eopqVar10 = (eopq) eoopVar2.instance;
                        eopqVar10.x = bf - 1;
                        eopqVar10.b |= 2097152;
                        eovw eovwVar = csjc.a;
                        eoopVar2.copyOnWrite();
                        eopq eopqVar11 = (eopq) eoopVar2.instance;
                        eopqVar11.N = eovwVar.x;
                        eopqVar11.c |= 512;
                        int i7 = true != messageCoreData3.cB() ? 3 : 2;
                        eoopVar2.copyOnWrite();
                        eopq eopqVar12 = (eopq) eoopVar2.instance;
                        eopqVar12.S = i7 - 1;
                        eopqVar12.c |= 16384;
                        if (messageCoreData3.aJ() != null) {
                            fjay aJ = messageCoreData3.aJ();
                            aJ.getClass();
                            eoopVar2.copyOnWrite();
                            eopq eopqVar13 = (eopq) eoopVar2.instance;
                            eopqVar13.o = aJ;
                            eopqVar13.b |= 1024;
                        }
                        int i8 = i5;
                        alvq.bb(eoopVar2, messageCoreData3);
                        if (i8 >= 0) {
                            eoopVar2.copyOnWrite();
                            eopq eopqVar14 = (eopq) eoopVar2.instance;
                            eopqVar14.d |= 16;
                            eopqVar14.ap = i8;
                        }
                        eopp eoppVar = (eopp) alvqVar2.I.fP(messageCoreData3.O());
                        eoopVar2.copyOnWrite();
                        eopq eopqVar15 = (eopq) eoopVar2.instance;
                        eopqVar15.aq = eoppVar.h;
                        eopqVar15.d |= 32;
                        ((alvz) alvqVar2.H.b()).i(messageCoreData3, eoopVar2);
                        if (e != null) {
                            eoks b3 = altl.b(e);
                            eoopVar2.copyOnWrite();
                            eopq eopqVar16 = (eopq) eoopVar2.instance;
                            eopqVar16.r = b3.f;
                            eopqVar16.b |= 16384;
                            csjb a3 = alvq.i.a();
                            eoks b4 = eoks.b(((eopq) eoopVar2.instance).r);
                            if (b4 == null) {
                                b4 = eoks.UNKNOWN_BUGLE_CONVERSATION_TYPE;
                            }
                            a3.A("messageConversationType", b4);
                            a3.r();
                        }
                        if (a != null) {
                            eopv k2 = ((alvz) alvqVar2.H.b()).k(messageCoreData3.ab(), 8);
                            eoopVar2.copyOnWrite();
                            eopq eopqVar17 = (eopq) eoopVar2.instance;
                            k2.getClass();
                            eopqVar17.j = k2;
                            eopqVar17.b |= 8;
                        }
                        ((alvz) alvqVar2.H.b()).h(messageCoreData3, eoopVar2);
                        ((algq) alvqVar2.E.b()).a(eoopVar2, messageCoreData3, e != null ? e.intValue() : 0);
                        eolu eoluVar = (eolu) eolv.a.createBuilder();
                        eolt eoltVar = eolt.BUGLE_MESSAGE;
                        eoluVar.copyOnWrite();
                        eolv eolvVar = (eolv) eoluVar.instance;
                        eolvVar.j = eoltVar.dk;
                        eolvVar.b |= 1;
                        eoluVar.copyOnWrite();
                        eolv eolvVar2 = (eolv) eoluVar.instance;
                        eopq eopqVar18 = (eopq) eoopVar2.build();
                        eopqVar18.getClass();
                        eolvVar2.l = eopqVar18;
                        eolvVar2.b |= 4;
                        alvqVar2.x.a().j(eoluVar, alal.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
                        return null;
                    }
                }, alvqVar.B);
            }
        }, this.af));
    }

    @Override // defpackage.altk
    public final void O(MessageCoreData messageCoreData, int i2, eoop eoopVar) {
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopq eopqVar2 = eopq.a;
        eopqVar.Y = 0;
        eopqVar.c |= 524288;
        P(messageCoreData, i2, this.u.f().toEpochMilli(), akzn.a(this.u), eoopVar);
    }

    @Override // defpackage.altk
    public final void P(MessageCoreData messageCoreData, int i2, long j2, akzo akzoVar, eoop eoopVar) {
        ((alvz) this.H.b()).i(messageCoreData, eoopVar);
        int b = eook.b(((eopq) eoopVar.instance).h);
        if (b == 0) {
            b = 1;
        }
        int i3 = b - 1;
        if (i3 == 1) {
            bs(i2, messageCoreData);
            new alqv(messageCoreData);
        } else if (i3 == 2) {
            bs(i2, messageCoreData);
            new alqt(messageCoreData);
        }
        csvs.c(((algm) this.z.b()).f(akzoVar.a), "BugleUsageStatistics", "Failed to update LastPassiveEventTimeMillis");
        if (!this.y.get()) {
            r();
            return;
        }
        emxf.b(!messageCoreData.O().equals(byzl.TRANSPORT_NOT_SELECTED), "XmsTransport must be selected at this stage");
        eopp eoppVar = (eopp) this.I.fP(messageCoreData.O());
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopqVar.aq = eoppVar.h;
        eopqVar.d |= 32;
        if (messageCoreData.aJ() != null) {
            fjay aJ = messageCoreData.aJ();
            aJ.getClass();
            eoopVar.copyOnWrite();
            eopq eopqVar2 = (eopq) eoopVar.instance;
            eopqVar2.o = aJ;
            eopqVar2.b |= 1024;
        }
        csjb c = i.c();
        c.I("Logging message sent or received async");
        c.d(messageCoreData.B());
        c.h(messageCoreData.E());
        c.w(messageCoreData.t());
        c.r();
        cerl cerlVar = (cerl) cerm.a.createBuilder();
        String b2 = messageCoreData.B().c() ? "-1" : messageCoreData.B().b();
        cerlVar.copyOnWrite();
        cerm cermVar = (cerm) cerlVar.instance;
        b2.getClass();
        cermVar.b = 1 | cermVar.b;
        cermVar.c = b2;
        cerlVar.copyOnWrite();
        cerm cermVar2 = (cerm) cerlVar.instance;
        cermVar2.b |= 2;
        cermVar2.d = i2;
        cerlVar.copyOnWrite();
        cerm cermVar3 = (cerm) cerlVar.instance;
        cermVar3.b |= 4;
        cermVar3.e = j2;
        long j3 = akzoVar.a;
        cerlVar.copyOnWrite();
        cerm cermVar4 = (cerm) cerlVar.instance;
        cermVar4.b |= 16;
        cermVar4.g = j3;
        long j4 = akzoVar.b;
        cerlVar.copyOnWrite();
        cerm cermVar5 = (cerm) cerlVar.instance;
        cermVar5.b |= 32;
        cermVar5.h = j4;
        cerlVar.copyOnWrite();
        cerm cermVar6 = (cerm) cerlVar.instance;
        eopq eopqVar3 = (eopq) eoopVar.build();
        eopqVar3.getClass();
        cermVar6.f = eopqVar3;
        cermVar6.b |= 8;
        final cerm cermVar7 = (cerm) cerlVar.build();
        Runnable runnable = new Runnable() { // from class: alue
            @Override // java.lang.Runnable
            public final void run() {
                ((cerd) alvq.this.K.b()).k(cermVar7);
            }
        };
        ekzz f2 = eleg.f("UsageStatisticsImpl::logMessageSentOrReceivedAsync");
        try {
            elfl f3 = elfo.f(runnable, this.B);
            f2.b(f3);
            cetc cetcVar = (cetc) this.ap.b();
            cetcVar.f("Bugle.DataModel.Action.ProcessSentOrReceivedMessage.Logging.AttachingAndroidFutureWrapper.Count", cetcVar.d(EnumSet.of(cetb.WAKELOCK, cetb.BACKGROUND_SERVICE), f3, new Supplier() { // from class: alup
                @Override // java.util.function.Supplier
                public final Object get() {
                    long j5 = alvq.h;
                    return null;
                }
            }));
            axnw.h(f3);
            f2.close();
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.altk
    public final void Q(MessageCoreData messageCoreData, int i2, int i3, eooi eooiVar) {
        if (!this.y.get()) {
            r();
            return;
        }
        long b = ((akvz) this.p.b()).b(messageCoreData.z());
        int d = altl.d(messageCoreData.d());
        eohv b2 = ((aljq) this.q.b()).b(i2);
        eots eotsVar = (eots) eotw.a.createBuilder();
        eotsVar.copyOnWrite();
        eotw eotwVar = (eotw) eotsVar.instance;
        eotwVar.b |= 1;
        eotwVar.c = i2;
        eotw eotwVar2 = (eotw) eotsVar.build();
        eoop eoopVar = (eoop) eopq.a.createBuilder();
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eotwVar2.getClass();
        eopqVar.l = eotwVar2;
        eopqVar.b |= 32;
        eoopVar.copyOnWrite();
        eopq eopqVar2 = (eopq) eoopVar.instance;
        eopqVar2.b |= 1073741824;
        eopqVar2.G = b;
        long t = messageCoreData.t();
        eoopVar.copyOnWrite();
        eopq eopqVar3 = (eopq) eoopVar.instance;
        eopqVar3.b |= 128;
        eopqVar3.n = t;
        eoopVar.copyOnWrite();
        eopq eopqVar4 = (eopq) eoopVar.instance;
        eopqVar4.g = d - 1;
        eopqVar4.b |= 1;
        eooe eooeVar = eooe.MISSING_SELF_IDENTITY;
        eoopVar.copyOnWrite();
        eopq eopqVar5 = (eopq) eoopVar.instance;
        eopqVar5.v = eooeVar.p;
        eopqVar5.b |= 524288;
        eoopVar.copyOnWrite();
        eopq eopqVar6 = (eopq) eoopVar.instance;
        eopqVar6.m = eooiVar.J;
        eopqVar6.b |= 64;
        eoks b3 = altl.b(Integer.valueOf(i3));
        eoopVar.copyOnWrite();
        eopq eopqVar7 = (eopq) eoopVar.instance;
        eopqVar7.r = b3.f;
        eopqVar7.b |= 16384;
        eoopVar.copyOnWrite();
        eopq eopqVar8 = (eopq) eoopVar.instance;
        b2.getClass();
        eopqVar8.U = b2;
        eopqVar8.c |= 65536;
        int i4 = true != messageCoreData.cB() ? 3 : 2;
        eoopVar.copyOnWrite();
        eopq eopqVar9 = (eopq) eoopVar.instance;
        eopqVar9.S = i4 - 1;
        eopqVar9.c |= 16384;
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_MESSAGE;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eopq eopqVar10 = (eopq) eoopVar.build();
        eopqVar10.getClass();
        eolvVar2.l = eopqVar10;
        eolvVar2.b |= 4;
        this.x.a().h(eoluVar, alal.LOG_SPEC_DSDR_EVENTS);
    }

    @Override // defpackage.altk
    public final void R(int i2, int i3, int i4, int i5, long j2, int i6, long j3, ConversationIdType conversationIdType) {
        bo(i2, i3, i4, j2, i6, i5, j3, false, conversationIdType);
    }

    @Override // defpackage.altk
    public final void S(ConversationIdType conversationIdType, int i2, long j2) {
        eqyl eqylVar = eqyl.NOT_RCS;
        Optional empty = Optional.empty();
        efbd.b();
        if (!this.y.get()) {
            r();
            return;
        }
        emxf.b(true, "Download start logging is only possible for MMS and RCS messages.");
        ((akzt) this.T.b()).c("Bugle.DataModel.Action.Download.Start.Count.Mms");
        eowr eowrVar = (eowr) eowt.a.createBuilder();
        int d = d();
        eowrVar.copyOnWrite();
        eowt eowtVar = (eowt) eowrVar.instance;
        eowtVar.b |= 1;
        eowtVar.c = d;
        String e = ((alvz) this.H.b()).e();
        eowrVar.copyOnWrite();
        eowt eowtVar2 = (eowt) eowrVar.instance;
        e.getClass();
        eowtVar2.b |= 4;
        eowtVar2.e = e;
        eowt eowtVar3 = (eowt) eowrVar.build();
        eoop eoopVar = (eoop) eopq.a.createBuilder();
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopqVar.aa = eqylVar.h;
        eopqVar.c |= 2097152;
        long b = ((akvz) this.p.b()).b(conversationIdType);
        eoopVar.copyOnWrite();
        eopq eopqVar2 = (eopq) eoopVar.instance;
        eopqVar2.b |= 1073741824;
        eopqVar2.G = b;
        eoopVar.copyOnWrite();
        eopq eopqVar3 = (eopq) eoopVar.instance;
        eopqVar3.g = 2;
        eopqVar3.b |= 1;
        eoopVar.copyOnWrite();
        eopq eopqVar4 = (eopq) eoopVar.instance;
        eopqVar4.h = 14;
        eopqVar4.b = 2 | eopqVar4.b;
        eoqk a = ((akyw) this.r.b()).a(i2);
        eoopVar.copyOnWrite();
        eopq eopqVar5 = (eopq) eoopVar.instance;
        eopqVar5.i = a;
        eopqVar5.b |= 4;
        eoopVar.copyOnWrite();
        eopq eopqVar6 = (eopq) eoopVar.instance;
        eowtVar3.getClass();
        eopqVar6.y = eowtVar3;
        eopqVar6.b |= 4194304;
        int bf = bf(conversationIdType);
        eoopVar.copyOnWrite();
        eopq eopqVar7 = (eopq) eoopVar.instance;
        eopqVar7.x = bf - 1;
        eopqVar7.b |= 2097152;
        eovw eovwVar = csjc.a;
        eoopVar.copyOnWrite();
        eopq eopqVar8 = (eopq) eoopVar.instance;
        eopqVar8.N = eovwVar.x;
        eopqVar8.c |= 512;
        eoopVar.copyOnWrite();
        eopq eopqVar9 = (eopq) eoopVar.instance;
        eopqVar9.b |= 128;
        eopqVar9.n = j2;
        empty.isPresent();
        ((alvz) this.H.b()).f(eoopVar, i2);
        ((alvz) this.H.b()).l(eoopVar, 3, 15, i2);
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_MESSAGE;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eopq eopqVar10 = (eopq) eoopVar.build();
        eopqVar10.getClass();
        eolvVar2.l = eopqVar10;
        eolvVar2.b |= 4;
        this.x.a().j(eoluVar, alal.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
    }

    @Override // defpackage.altk
    public final void T(int i2) {
        ((akzt) this.T.b()).e("Bugle.Media.PhotoViewer.Launch.Counts", i2);
    }

    @Override // defpackage.altk
    public final void U(epgr epgrVar, epgt epgtVar) {
        if (!this.y.get()) {
            r();
            return;
        }
        if (epgtVar == null) {
            epgtVar = epgt.b(((ctyz) this.V.b()).a.d("provisioning_ui_type", 0));
        } else {
            ((ctyz) this.V.b()).a.j("provisioning_ui_type", epgtVar.t);
        }
        epgp epgpVar = (epgp) epgu.a.createBuilder();
        epgpVar.copyOnWrite();
        epgu epguVar = (epgu) epgpVar.instance;
        epguVar.c = epgrVar.U;
        epguVar.b |= 1;
        epgpVar.copyOnWrite();
        epgu epguVar2 = (epgu) epgpVar.instance;
        epguVar2.d = epgtVar.t;
        epguVar2.b |= 4;
        int a = epgrVar == epgr.RCS_PROVISIONING_PROMPT_SEEN ? ((crln) this.ae.b()).a() + 1 : ((crln) this.ae.b()).a();
        epgpVar.copyOnWrite();
        epgu epguVar3 = (epgu) epgpVar.instance;
        epguVar3.b |= 8;
        epguVar3.e = a;
        epgu epguVar4 = (epgu) epgpVar.build();
        eosi eosiVar = (eosi) eosj.a.createBuilder();
        eosiVar.copyOnWrite();
        eosj eosjVar = (eosj) eosiVar.instance;
        eosjVar.c = 11;
        eosjVar.b |= 1;
        eosiVar.copyOnWrite();
        eosj eosjVar2 = (eosj) eosiVar.instance;
        epguVar4.getClass();
        eosjVar2.j = epguVar4;
        eosjVar2.b |= 256;
        eowq b = dksy.b(this.ah);
        eosiVar.copyOnWrite();
        eosj eosjVar3 = (eosj) eosiVar.instance;
        b.getClass();
        eosjVar3.h = b;
        eosjVar3.b |= 64;
        String b2 = ((ctyz) this.V.b()).b();
        eosiVar.copyOnWrite();
        eosj eosjVar4 = (eosj) eosiVar.instance;
        b2.getClass();
        eosjVar4.b |= 128;
        eosjVar4.i = b2;
        eosj eosjVar5 = (eosj) eosiVar.build();
        alhk alhkVar = (alhk) this.ad.b();
        long longValue = dkvj.a().longValue();
        if (!alhkVar.e().isPresent()) {
            alhkVar.a.k("first_rcs_provisioning_ui_event_time", longValue);
        }
        if (epgrVar.equals(epgr.RCS_PROVISIONING_PROMPT_DECLINED)) {
            alhk alhkVar2 = (alhk) this.ad.b();
            long longValue2 = dkvj.a().longValue();
            if (!alhkVar2.c().isPresent()) {
                alhkVar2.a.k("first_time_rcs_declined_millis", longValue2);
            }
        }
        if (epgrVar.equals(epgr.RCS_PROVISIONING_PROMPT_ACCEPTED)) {
            alhk alhkVar3 = (alhk) this.ad.b();
            long longValue3 = dkvj.a().longValue();
            if (!alhkVar3.b().isPresent()) {
                alhkVar3.a.k("first_time_rcs_accepted_millis", longValue3);
            }
        }
        if (epgtVar != null) {
            alhk alhkVar4 = (alhk) this.ad.b();
            if (!alhkVar4.a().isPresent()) {
                alhkVar4.a.j("first_provisioning_ui_event_ui_type", epgtVar.t);
            }
        }
        akxl akxlVar = this.w;
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eosjVar5.getClass();
        eolvVar.t = eosjVar5;
        eolvVar.b |= 4096;
        akxlVar.k(eoluVar, epyw.UMA_RCS_PROVISIONING_UI_INTERACTION);
    }

    @Override // defpackage.altk
    public final void V(final alrl alrlVar) {
        alqp alqpVar = (alqp) alrlVar;
        emxf.a(altl.d(alqpVar.a.d()) == 4);
        final int aS = aS(alqpVar.a);
        axnw.h(elfo.f(new Runnable() { // from class: alux
            @Override // java.lang.Runnable
            public final void run() {
                alvq alvqVar = alvq.this;
                Optional of = Optional.of(alvqVar.G.a());
                Optional of2 = Optional.of(eoov.UNKNOWN_FORMAT_TYPE);
                alqp alqpVar2 = (alqp) alrlVar;
                alvqVar.bi(alqpVar2.a, aS, -2, 0, -1, 18, null, 1, 0, of, of2, Optional.of(alqpVar2.b), Optional.empty());
            }
        }, this.B));
    }

    @Override // defpackage.altk
    public final void W(MessageCoreData messageCoreData, int i2) {
        emxf.a(messageCoreData.E().b != null);
        ffbr ffbrVar = this.ao;
        Optional empty = Optional.empty();
        if (((asva) ffbrVar.b()).a()) {
            final alqn alqnVar = new alqn();
            alqnVar.f(messageCoreData);
            alqnVar.i(i2);
            alqnVar.g(-2);
            alqnVar.d(0);
            alqnVar.b(-1);
            alqnVar.c = 1;
            alqnVar.e(0);
            empty.ifPresent(new Consumer() { // from class: alub
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    alrj.this.h((eopk) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            K(alqnVar.a());
            return;
        }
        ffbr ffbrVar2 = this.ao;
        Optional empty2 = Optional.empty();
        if (!((asva) ffbrVar2.b()).a()) {
            if (this.y.get()) {
                aC(messageCoreData, i2, -2, 0, -1, 6, null, 1, 0, Optional.empty(), empty2, empty);
                return;
            } else {
                r();
                return;
            }
        }
        final alqn alqnVar2 = new alqn();
        alqnVar2.f(messageCoreData);
        alqnVar2.i(i2);
        alqnVar2.g(-2);
        alqnVar2.d(0);
        alqnVar2.b(-1);
        alqnVar2.c = 1;
        alqnVar2.e(0);
        empty2.ifPresent(new Consumer() { // from class: alua
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                alrj.this.c((eoov) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        empty.ifPresent(new Consumer() { // from class: alub
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                alrj.this.h((eopk) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        K(alqnVar2.a());
    }

    @Override // defpackage.altk
    public final void X(MessageCoreData messageCoreData, eoty eotyVar) {
        if (!this.y.get()) {
            r();
            return;
        }
        eopr eoprVar = (eopr) eopt.a.createBuilder();
        long t = messageCoreData.t();
        eoprVar.copyOnWrite();
        eopt eoptVar = (eopt) eoprVar.instance;
        eoptVar.b |= 2;
        eoptVar.d = t;
        eoprVar.copyOnWrite();
        eopt eoptVar2 = (eopt) eoprVar.instance;
        eoptVar2.c = 2;
        eoptVar2.b |= 1;
        eoprVar.copyOnWrite();
        eopt eoptVar3 = (eopt) eoprVar.instance;
        eotyVar.getClass();
        eoptVar3.f = eotyVar;
        eoptVar3.b |= 8;
        bm(messageCoreData, (eopt) eoprVar.build());
    }

    @Override // defpackage.altk
    public final void Y(int i2, int i3) {
        eohv b = ((aljq) this.q.b()).b(i3);
        eoop eoopVar = (eoop) eopq.a.createBuilder();
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopqVar.g = 1;
        eopqVar.b |= 1;
        eoopVar.copyOnWrite();
        eopq eopqVar2 = (eopq) eoopVar.instance;
        eopqVar2.h = 15;
        eopqVar2.b |= 2;
        eoqk a = ((akyw) this.r.b()).a(i3);
        eoopVar.copyOnWrite();
        eopq eopqVar3 = (eopq) eoopVar.instance;
        eopqVar3.i = a;
        eopqVar3.b |= 4;
        String k = k(Optional.of(Integer.valueOf(i3)));
        eoopVar.copyOnWrite();
        eopq eopqVar4 = (eopq) eoopVar.instance;
        k.getClass();
        eopqVar4.c |= 1;
        eopqVar4.J = k;
        eoopVar.copyOnWrite();
        eopq eopqVar5 = (eopq) eoopVar.instance;
        b.getClass();
        eopqVar5.U = b;
        eopqVar5.c |= 65536;
        eovw eovwVar = csjc.a;
        eoopVar.copyOnWrite();
        eopq eopqVar6 = (eopq) eoopVar.instance;
        eopqVar6.N = eovwVar.x;
        eopqVar6.c |= 512;
        eotz eotzVar = (eotz) eouc.a.createBuilder();
        eotzVar.copyOnWrite();
        eouc eoucVar = (eouc) eotzVar.instance;
        eoucVar.b |= 1;
        eoucVar.c = -1;
        eojg eojgVar = (eojg) eojh.a.createBuilder();
        eojgVar.copyOnWrite();
        eojh eojhVar = (eojh) eojgVar.instance;
        eojhVar.b |= 1;
        eojhVar.c = i2;
        eojh eojhVar2 = (eojh) eojgVar.build();
        eotzVar.copyOnWrite();
        eouc eoucVar2 = (eouc) eotzVar.instance;
        eojhVar2.getClass();
        eoucVar2.d = eojhVar2;
        eoucVar2.b |= 2;
        eoub bk = bk(i3);
        eotzVar.copyOnWrite();
        eouc eoucVar3 = (eouc) eotzVar.instance;
        eoucVar3.e = bk.e;
        eoucVar3.b |= 4;
        eouc eoucVar4 = (eouc) eotzVar.build();
        eoopVar.copyOnWrite();
        eopq eopqVar7 = (eopq) eoopVar.instance;
        eoucVar4.getClass();
        eopqVar7.f = eoucVar4;
        eopqVar7.e = 41;
        eouc eoucVar5 = (eouc) eopqVar7.f;
        eohv eohvVar = eopqVar7.U;
        if (eohvVar == null) {
            eohvVar = eohv.b;
        }
        bt(eoucVar5, eohvVar);
        ((alvz) this.H.b()).l(eoopVar, 2, 16, i3);
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_MESSAGE;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eopq eopqVar8 = (eopq) eoopVar.build();
        eopqVar8.getClass();
        eolvVar2.l = eopqVar8;
        eolvVar2.b |= 4;
        this.x.a().j(eoluVar, alal.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
    }

    @Override // defpackage.altk
    public final void Z(epyw epywVar, MessageCoreData messageCoreData, int i2) {
        int i3;
        if (!this.y.get()) {
            r();
            return;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        if (messageCoreData != null) {
            akwn akwnVar = (akwn) this.S.b();
            Iterator it = messageCoreData.ab().iterator();
            while (true) {
                i3 = 2;
                if (!it.hasNext()) {
                    break;
                }
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
                eole eoleVar = akwnVar.b;
                boolean bA = messagePartCoreData.bA();
                int b = eohz.b(((eoli) akwnVar.b.instance).h);
                if (b == 0) {
                    b = 2;
                }
                int a = akwn.a(bA, b);
                eoleVar.copyOnWrite();
                eoli eoliVar = (eoli) eoleVar.instance;
                eoliVar.h = eohz.a(a);
                eoliVar.b |= 32;
                boolean bo = messagePartCoreData.bo();
                int b2 = eohz.b(((eoli) akwnVar.b.instance).i);
                if (b2 == 0) {
                    b2 = 2;
                }
                int a2 = akwn.a(bo, b2);
                eoleVar.copyOnWrite();
                eoli eoliVar2 = (eoli) eoleVar.instance;
                eoliVar2.i = eohz.a(a2);
                eoliVar2.b |= 64;
                boolean ba = messagePartCoreData.ba();
                int b3 = eohz.b(((eoli) akwnVar.b.instance).j);
                if (b3 == 0) {
                    b3 = 2;
                }
                int a3 = akwn.a(ba, b3);
                eoleVar.copyOnWrite();
                eoli eoliVar3 = (eoli) eoleVar.instance;
                eoliVar3.j = eohz.a(a3);
                eoliVar3.b |= 128;
                boolean bD = messagePartCoreData.bD();
                int b4 = eohz.b(((eoli) akwnVar.b.instance).k);
                if (b4 == 0) {
                    b4 = 2;
                }
                int a4 = akwn.a(bD, b4);
                eoleVar.copyOnWrite();
                eoli eoliVar4 = (eoli) eoleVar.instance;
                eoliVar4.k = eohz.a(a4);
                eoliVar4.b |= 256;
                boolean bp = messagePartCoreData.bp();
                int b5 = eohz.b(((eoli) akwnVar.b.instance).l);
                if (b5 == 0) {
                    b5 = 2;
                }
                int a5 = akwn.a(bp, b5);
                eoleVar.copyOnWrite();
                eoli eoliVar5 = (eoli) eoleVar.instance;
                eoliVar5.l = eohz.a(a5);
                eoliVar5.b |= 512;
                boolean bs = messagePartCoreData.bs();
                int b6 = eohz.b(((eoli) akwnVar.b.instance).m);
                if (b6 != 0) {
                    i3 = b6;
                }
                int a6 = akwn.a(bs, i3);
                eoleVar.copyOnWrite();
                eoli eoliVar6 = (eoli) eoleVar.instance;
                eoliVar6.m = eohz.a(a6);
                eoliVar6.b |= 1024;
            }
            int i4 = ((bczy) akwnVar.a.b()).c(messageCoreData.z()) == 0 ? 2 : 3;
            eole eoleVar2 = akwnVar.b;
            eoleVar2.copyOnWrite();
            eoli eoliVar7 = (eoli) eoleVar2.instance;
            eoli eoliVar8 = eoli.a;
            eoliVar7.n = i4 - 1;
            eoliVar7.b |= 2048;
            if (messageCoreData.cX()) {
                i3 = 4;
            } else if (messageCoreData.cP()) {
                i3 = 3;
            } else if (true != messageCoreData.df()) {
                i3 = 1;
            }
            eole eoleVar3 = akwnVar.b;
            eoleVar3.copyOnWrite();
            eoli eoliVar9 = (eoli) eoleVar3.instance;
            eoliVar9.p = i3 - 1;
            eoliVar9.b |= 8192;
            final eoqa eoqaVar = (eoqa) eoqb.a.createBuilder();
            if (!messageCoreData.B().c()) {
                String b7 = messageCoreData.B().b();
                eoqaVar.copyOnWrite();
                eoqb eoqbVar = (eoqb) eoqaVar.instance;
                b7.getClass();
                eoqbVar.b = 1 | eoqbVar.b;
                eoqbVar.c = b7;
            }
            messageCoreData.E().g(new Consumer() { // from class: akwm
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    String f2 = ((bdhg) obj).f();
                    eoqa eoqaVar2 = eoqa.this;
                    eoqaVar2.copyOnWrite();
                    eoqb eoqbVar2 = (eoqb) eoqaVar2.instance;
                    eoqb eoqbVar3 = eoqb.a;
                    eoqbVar2.b |= 2;
                    eoqbVar2.d = f2;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            eole eoleVar4 = akwnVar.b;
            eoleVar4.copyOnWrite();
            eoli eoliVar10 = (eoli) eoleVar4.instance;
            eoqb eoqbVar2 = (eoqb) eoqaVar.build();
            eoqbVar2.getClass();
            eoliVar10.s = eoqbVar2;
            eoliVar10.b |= 65536;
            akwnVar.c(i2);
            String k = k(Optional.of(Integer.valueOf(i2)));
            eole eoleVar5 = akwnVar.b;
            eoleVar5.copyOnWrite();
            eoli eoliVar11 = (eoli) eoleVar5.instance;
            k.getClass();
            eoliVar11.b |= 32768;
            eoliVar11.r = k;
            eoli b8 = akwnVar.b();
            eoluVar.copyOnWrite();
            eolv eolvVar = (eolv) eoluVar.instance;
            b8.getClass();
            eolvVar.v = b8;
            eolvVar.b |= 16384;
        }
        this.w.k(eoluVar, epywVar);
    }

    @Override // defpackage.altk, defpackage.dkpi
    public final void a(eyxs eyxsVar) {
        if (((Boolean) g.e()).booleanValue()) {
            return;
        }
        ekzm b = this.aj.b("UsageStatistics dispatchSimEventDelay");
        try {
            if (this.y.get()) {
                eolu eoluVar = (eolu) eolv.a.createBuilder();
                eolt eoltVar = eolt.BUGLE_TELEPHONY_EVENT;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                eolvVar.j = eoltVar.dk;
                eolvVar.b |= 1;
                eyye eyyeVar = (eyye) eyyf.a.createBuilder();
                eyyeVar.copyOnWrite();
                eyyf eyyfVar = (eyyf) eyyeVar.instance;
                eyxsVar.getClass();
                eyyfVar.c = eyxsVar;
                eyyfVar.b = 2;
                eoluVar.copyOnWrite();
                eolv eolvVar2 = (eolv) eoluVar.instance;
                eyyf eyyfVar2 = (eyyf) eyyeVar.build();
                eyyfVar2.getClass();
                eolvVar2.A = eyyfVar2;
                eolvVar2.b |= 1048576;
                this.w.j(eoluVar);
            } else {
                r();
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.altk
    public final void aA(int i2, String str, int i3) {
        eoma eomaVar = (eoma) eomb.a.createBuilder();
        eomaVar.copyOnWrite();
        eomb eombVar = (eomb) eomaVar.instance;
        eombVar.c = i2 - 1;
        eombVar.b |= 1;
        eomaVar.copyOnWrite();
        eomb eombVar2 = (eomb) eomaVar.instance;
        eombVar2.e = i3 - 1;
        eombVar2.b |= 4;
        if (str != null) {
            eomaVar.copyOnWrite();
            eomb eombVar3 = (eomb) eomaVar.instance;
            eombVar3.b |= 2;
            eombVar3.d = str;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_FILE_PREVIEW_CLICK;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eomb eombVar4 = (eomb) eomaVar.build();
        eombVar4.getClass();
        eolvVar2.G = eombVar4;
        eolvVar2.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        this.w.j(eoluVar);
    }

    @Override // defpackage.altk
    public final void aB(int i2, int i3, int i4) {
        if (!this.y.get()) {
            r();
            return;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_GIF_CHOOSER;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eomd eomdVar = (eomd) eomh.a.createBuilder();
        eomdVar.copyOnWrite();
        eomh eomhVar = (eomh) eomdVar.instance;
        eomhVar.c = i2 - 1;
        eomhVar.b |= 1;
        eomdVar.copyOnWrite();
        eomh eomhVar2 = (eomh) eomdVar.instance;
        int i5 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        eomhVar2.d = i5;
        eomhVar2.b |= 2;
        eomdVar.copyOnWrite();
        eomh eomhVar3 = (eomh) eomdVar.instance;
        int i6 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        eomhVar3.e = i6;
        eomhVar3.b |= 4;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eomh eomhVar4 = (eomh) eomdVar.build();
        eomhVar4.getClass();
        eolvVar2.B = eomhVar4;
        eolvVar2.b |= 2097152;
        this.w.j(eoluVar);
    }

    @Override // defpackage.altk
    public final void aC(final MessageCoreData messageCoreData, final int i2, final int i3, final int i4, final int i5, final int i6, final eqxi eqxiVar, final int i7, final int i8, final Optional optional, final Optional optional2, final Optional optional3) {
        axnw.h(elfo.f(new Runnable() { // from class: aluh
            @Override // java.lang.Runnable
            public final void run() {
                alvq.this.bi(messageCoreData, i2, i3, i4, i5, i6, eqxiVar, i7, i8, optional, optional2, Optional.empty(), optional3);
            }
        }, this.B));
    }

    @Override // defpackage.altk
    public final void aD(MessageCoreData messageCoreData, int i2, long j2, boolean z, int i3) {
        new alqt(messageCoreData);
        if (!this.y.get()) {
            r();
            return;
        }
        eowr eowrVar = (eowr) eowt.a.createBuilder();
        int d = d();
        eowrVar.copyOnWrite();
        eowt eowtVar = (eowt) eowrVar.instance;
        eowtVar.b |= 1;
        eowtVar.c = d;
        String e = ((alvz) this.H.b()).e();
        eowrVar.copyOnWrite();
        eowt eowtVar2 = (eowt) eowrVar.instance;
        e.getClass();
        eowtVar2.b |= 4;
        eowtVar2.e = e;
        eowt eowtVar3 = (eowt) eowrVar.build();
        final eoop eoopVar = (eoop) eopq.a.createBuilder();
        long b = ((akvz) this.p.b()).b(messageCoreData.z());
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopqVar.b |= 1073741824;
        eopqVar.G = b;
        long t = messageCoreData.t();
        eoopVar.copyOnWrite();
        eopq eopqVar2 = (eopq) eoopVar.instance;
        eopqVar2.b |= 128;
        eopqVar2.n = t;
        eoopVar.copyOnWrite();
        eopq eopqVar3 = (eopq) eoopVar.instance;
        eopqVar3.g = 2;
        eopqVar3.b |= 1;
        eoopVar.copyOnWrite();
        eopq eopqVar4 = (eopq) eoopVar.instance;
        eopqVar4.h = 3;
        eopqVar4.b |= 2;
        eoqk a = ((akyw) this.r.b()).a(i2);
        eoopVar.copyOnWrite();
        eopq eopqVar5 = (eopq) eoopVar.instance;
        eopqVar5.i = a;
        eopqVar5.b |= 4;
        eoopVar.copyOnWrite();
        eopq eopqVar6 = (eopq) eoopVar.instance;
        eowtVar3.getClass();
        eopqVar6.y = eowtVar3;
        eopqVar6.b |= 4194304;
        eopv k = ((alvz) this.H.b()).k(((MessageData) messageCoreData).i, 4);
        eoopVar.copyOnWrite();
        eopq eopqVar7 = (eopq) eoopVar.instance;
        k.getClass();
        eopqVar7.j = k;
        eopqVar7.b |= 8;
        int bf = bf(messageCoreData.z());
        eoopVar.copyOnWrite();
        eopq eopqVar8 = (eopq) eoopVar.instance;
        eopqVar8.x = bf - 1;
        eopqVar8.b |= 2097152;
        eovw eovwVar = csjc.a;
        eoopVar.copyOnWrite();
        eopq eopqVar9 = (eopq) eoopVar.instance;
        eopqVar9.N = eovwVar.x;
        eopqVar9.c |= 512;
        int i4 = true != messageCoreData.cB() ? 3 : 2;
        eoopVar.copyOnWrite();
        eopq eopqVar10 = (eopq) eoopVar.instance;
        eopqVar10.S = i4 - 1;
        eopqVar10.c |= 16384;
        eoopVar.copyOnWrite();
        eopq eopqVar11 = (eopq) eoopVar.instance;
        int i5 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        eopqVar11.Y = i5;
        eopqVar11.c |= 524288;
        boolean cN = messageCoreData.cN();
        eoopVar.copyOnWrite();
        eopq eopqVar12 = (eopq) eoopVar.instance;
        eopqVar12.c |= 1073741824;
        eopqVar12.aj = cN;
        bseh r = ((bczy) this.m.b()).r(messageCoreData.z());
        eoks b2 = altl.b(r != null ? Integer.valueOf(r.k()) : null);
        eoopVar.copyOnWrite();
        eopq eopqVar13 = (eopq) eoopVar.instance;
        eopqVar13.r = b2.f;
        eopqVar13.b |= 16384;
        ((alvz) this.H.b()).f(eoopVar, i2);
        ((alvz) this.H.b()).l(eoopVar, 3, 4, i2);
        axnw.h(((alri) this.as.b()).a(messageCoreData).h(new emwl() { // from class: alut
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eoop eoopVar2 = eoopVar;
                ((Optional) obj).ifPresent(new altw(eoopVar2));
                eolu eoluVar = (eolu) eolv.a.createBuilder();
                eolt eoltVar = eolt.BUGLE_MESSAGE;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                eolvVar.j = eoltVar.dk;
                eolvVar.b |= 1;
                eoluVar.copyOnWrite();
                eolv eolvVar2 = (eolv) eoluVar.instance;
                eopq eopqVar14 = (eopq) eoopVar2.build();
                eopqVar14.getClass();
                eolvVar2.l = eopqVar14;
                eolvVar2.b |= 4;
                alvq alvqVar = alvq.this;
                alvqVar.x.a().j(eoluVar, alal.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
                ((alrv) alvqVar.o.b()).c(new ecda("MMS downloaded"));
                return null;
            }
        }, this.B));
        if (z) {
            return;
        }
        ba(j2, "Bugle.Success.Attachment.Size.Bucket.Mms");
        ((akzt) this.T.b()).c("Bugle.DataModel.Action.Download.Success.Count.Mms");
    }

    @Override // defpackage.altk
    public final void aE(eoqn eoqnVar, int i2, List list) {
        if (!this.y.get()) {
            r();
            return;
        }
        epgh epghVar = (epgh) epgi.a.createBuilder();
        epghVar.copyOnWrite();
        epgi epgiVar = (epgi) epghVar.instance;
        epgiVar.c = i2 - 1;
        epgiVar.b |= 1;
        if (list != null && !list.isEmpty()) {
            Stream stream = Collection.EL.stream(list);
            final akvz akvzVar = (akvz) this.p.b();
            akvzVar.getClass();
            List list2 = (List) stream.map(new Function() { // from class: aluc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(akvz.this.b((ConversationIdType) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: alud
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            }));
            epghVar.copyOnWrite();
            epgi epgiVar2 = (epgi) epghVar.instance;
            eygl eyglVar = epgiVar2.d;
            if (!eyglVar.c()) {
                epgiVar2.d = eyfy.mutableCopy(eyglVar);
            }
            eydl.addAll(list2, epgiVar2.d);
        }
        eoql eoqlVar = (eoql) eoqo.a.createBuilder();
        eoqlVar.copyOnWrite();
        eoqo eoqoVar = (eoqo) eoqlVar.instance;
        eoqoVar.c = eoqnVar.e;
        eoqoVar.b |= 1;
        eoqlVar.copyOnWrite();
        eoqo eoqoVar2 = (eoqo) eoqlVar.instance;
        epgi epgiVar3 = (epgi) epghVar.build();
        epgiVar3.getClass();
        eoqoVar2.d = epgiVar3;
        eoqoVar2.b |= 2;
        eoqo eoqoVar3 = (eoqo) eoqlVar.build();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_NOTIFICATION;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eoqoVar3.getClass();
        eolvVar2.ad = eoqoVar3;
        eolvVar2.c |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        this.w.j(eoluVar);
    }

    @Override // defpackage.altk
    public final void aF(int i2, int i3, String str) {
        if (!this.y.get()) {
            r();
            return;
        }
        eory eoryVar = (eory) eorz.a.createBuilder();
        if (str != null) {
            eoryVar.copyOnWrite();
            eorz eorzVar = (eorz) eoryVar.instance;
            eorzVar.b |= 1;
            eorzVar.c = str;
        }
        eorq eorqVar = (eorq) eorx.a.createBuilder();
        eorqVar.copyOnWrite();
        eorx eorxVar = (eorx) eorqVar.instance;
        eorxVar.f = i2 - 1;
        eorxVar.b |= 8;
        eorqVar.copyOnWrite();
        eorx eorxVar2 = (eorx) eorqVar.instance;
        eorxVar2.g = i3 - 1;
        eorxVar2.b |= 16;
        eorqVar.copyOnWrite();
        eorx eorxVar3 = (eorx) eorqVar.instance;
        eorz eorzVar2 = (eorz) eoryVar.build();
        eorzVar2.getClass();
        eorxVar3.c = eorzVar2;
        eorxVar3.b |= 1;
        eorx eorxVar4 = (eorx) eorqVar.build();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_RBM_BUSINESS_INFO;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eorxVar4.getClass();
        eolvVar2.y = eorxVar4;
        eolvVar2.b |= 131072;
        this.w.j(eoluVar);
    }

    @Override // defpackage.altk
    public final void aG(int i2, String str) {
        if (!this.y.get()) {
            r();
            return;
        }
        eory eoryVar = (eory) eorz.a.createBuilder();
        if (str != null) {
            eoryVar.copyOnWrite();
            eorz eorzVar = (eorz) eoryVar.instance;
            eorzVar.b |= 1;
            eorzVar.c = str;
        }
        eorq eorqVar = (eorq) eorx.a.createBuilder();
        eorqVar.copyOnWrite();
        eorx eorxVar = (eorx) eorqVar.instance;
        eorxVar.h = i2 - 1;
        eorxVar.b |= 32;
        eorqVar.copyOnWrite();
        eorx eorxVar2 = (eorx) eorqVar.instance;
        eorz eorzVar2 = (eorz) eoryVar.build();
        eorzVar2.getClass();
        eorxVar2.c = eorzVar2;
        eorxVar2.b |= 1;
        eorx eorxVar3 = (eorx) eorqVar.build();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_RBM_BUSINESS_INFO;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eorxVar3.getClass();
        eolvVar2.y = eorxVar3;
        eolvVar2.b |= 131072;
        this.w.j(eoluVar);
    }

    @Override // defpackage.altk
    public final void aH(int i2, eorw eorwVar, String str) {
        if (!this.y.get()) {
            r();
            return;
        }
        eory eoryVar = (eory) eorz.a.createBuilder();
        if (str != null) {
            eoryVar.copyOnWrite();
            eorz eorzVar = (eorz) eoryVar.instance;
            eorzVar.b |= 1;
            eorzVar.c = str;
        }
        eorq eorqVar = (eorq) eorx.a.createBuilder();
        eorqVar.copyOnWrite();
        eorx eorxVar = (eorx) eorqVar.instance;
        eorxVar.d = i2 - 1;
        eorxVar.b |= 2;
        eorqVar.copyOnWrite();
        eorx eorxVar2 = (eorx) eorqVar.instance;
        eorxVar2.e = eorwVar.i;
        eorxVar2.b |= 4;
        eorqVar.copyOnWrite();
        eorx eorxVar3 = (eorx) eorqVar.instance;
        eorz eorzVar2 = (eorz) eoryVar.build();
        eorzVar2.getClass();
        eorxVar3.c = eorzVar2;
        eorxVar3.b |= 1;
        eorx eorxVar4 = (eorx) eorqVar.build();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_RBM_BUSINESS_INFO;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eorxVar4.getClass();
        eolvVar2.y = eorxVar4;
        eolvVar2.b |= 131072;
        this.w.j(eoluVar);
    }

    @Override // defpackage.altk
    public final void aI(final MessageCoreData messageCoreData, final int i2, final eqyl eqylVar, final int i3, final int i4) {
        emxf.b(messageCoreData.cX(), "Requires RCS message to log correct info");
        if (messageCoreData.y() != null) {
            axnw.h(messageCoreData.y().f().h(new emwl() { // from class: aluw
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    alvq.this.bj(messageCoreData, i2, eqylVar, i3, i4);
                    return null;
                }
            }, this.B));
        } else {
            bj(messageCoreData, i2, eqylVar, i3, i4);
        }
    }

    @Override // defpackage.altk
    public final void aJ(int i2) {
        aK(i2, 2);
    }

    @Override // defpackage.altk
    public final void aK(int i2, int i3) {
        if (!this.y.get()) {
            r();
            return;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_SHAKE_TO_REPORT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        epiz epizVar = (epiz) epjc.a.createBuilder();
        epizVar.copyOnWrite();
        epjc epjcVar = (epjc) epizVar.instance;
        epjcVar.c = i2 - 1;
        epjcVar.b |= 1;
        epizVar.copyOnWrite();
        epjc epjcVar2 = (epjc) epizVar.instance;
        epjcVar2.d = i3 - 1;
        epjcVar2.b |= 2;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        epjc epjcVar3 = (epjc) epizVar.build();
        epjcVar3.getClass();
        eolvVar2.Q = epjcVar3;
        eolvVar2.c |= 4096;
        this.w.j(eoluVar);
    }

    @Override // defpackage.altk
    public final void aL(int i2) {
        ctyz ctyzVar = (ctyz) this.V.b();
        int i3 = i2 - 1;
        if (ctyzVar.a.d("fast_track_onboarding_progress", 0) < i3) {
            ctyzVar.a.j("fast_track_onboarding_progress", i3);
        }
    }

    @Override // defpackage.altk
    public final void aM() {
        ekzz f2 = eleg.f("UsageStatisticsImpl::logMessageCreated");
        try {
            f2.close();
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.altk
    public final void aN(MessageCoreData messageCoreData, Optional optional) {
        by(messageCoreData, 9, optional, Optional.empty(), akzn.a(this.u));
    }

    @Override // defpackage.altk
    public final void aO() {
        if (!this.y.get()) {
            r();
            return;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eonj eonjVar = (eonj) eonk.a.createBuilder();
        eonjVar.copyOnWrite();
        eonk eonkVar = (eonk) eonjVar.instance;
        eonkVar.c = 1;
        eonkVar.b |= 1;
        eonjVar.copyOnWrite();
        eonk eonkVar2 = (eonk) eonjVar.instance;
        eonkVar2.d = 1;
        eonkVar2.b |= 2;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eonk eonkVar3 = (eonk) eonjVar.build();
        eonkVar3.getClass();
        eolvVar.u = eonkVar3;
        eolvVar.b |= 8192;
        this.w.j(eoluVar);
    }

    @Override // defpackage.altk
    public final void aP(final MessageCoreData messageCoreData, final int i2, final akzo akzoVar, final eoop eoopVar) {
        MessageUsageStatisticsData messageUsageStatisticsData = ((MessageData) messageCoreData).k;
        if (messageUsageStatisticsData != null) {
            axnw.h(messageUsageStatisticsData.f().h(new emwl() { // from class: alvf
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    alvq.this.be(messageCoreData, i2, akzoVar, eoopVar);
                    return null;
                }
            }, this.B));
        } else {
            be(messageCoreData, i2, akzoVar, eoopVar);
        }
    }

    @Override // defpackage.altk
    public final void aQ(eoqn eoqnVar) {
        aE(eoqnVar, 3, null);
    }

    @Override // defpackage.altk
    public final void aR(int i2) {
        if (!this.y.get()) {
            r();
            return;
        }
        eoqp eoqpVar = (eoqp) eoqs.a.createBuilder();
        eoqpVar.copyOnWrite();
        eoqs eoqsVar = (eoqs) eoqpVar.instance;
        eoqsVar.c = 1;
        eoqsVar.b |= 1;
        eoqpVar.copyOnWrite();
        eoqs eoqsVar2 = (eoqs) eoqpVar.instance;
        eoqsVar2.d = i2 - 1;
        eoqsVar2.b |= 4;
        final eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_USER_AND_DEVICE_INFO;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eojc eojcVar = (eojc) eojd.a.createBuilder();
        eoqt eoqtVar = (eoqt) eoqv.a.createBuilder();
        eoqtVar.a(eoqpVar);
        eojcVar.copyOnWrite();
        eojd eojdVar = (eojd) eojcVar.instance;
        eoqv eoqvVar = (eoqv) eoqtVar.build();
        eoqvVar.getClass();
        eojdVar.f = eoqvVar;
        eojdVar.b |= 16;
        final eojd eojdVar2 = (eojd) eojcVar.build();
        axnw.h(aU().h(new emwl() { // from class: aluo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eoup eoupVar = (eoup) obj;
                eoupVar.copyOnWrite();
                eovl eovlVar = (eovl) eoupVar.instance;
                eovl eovlVar2 = eovl.a;
                eojd eojdVar3 = eojdVar2;
                eojdVar3.getClass();
                eovlVar.p = eojdVar3;
                eovlVar.b |= 32768;
                eovl eovlVar3 = (eovl) eoupVar.build();
                eolu eoluVar2 = eoluVar;
                eoluVar2.copyOnWrite();
                eolv eolvVar2 = (eolv) eoluVar2.instance;
                eolv eolvVar3 = eolv.a;
                eovlVar3.getClass();
                eolvVar2.q = eovlVar3;
                eolvVar2.b |= 256;
                alvq.this.w.j(eoluVar2);
                return null;
            }
        }, erpp.a));
    }

    final int aS(MessageCoreData messageCoreData) {
        SelfIdentityId aT;
        aztg d;
        if (messageCoreData == null || (aT = aT(messageCoreData)) == null || (d = ((bdtd) this.Z.b()).d(aT)) == null) {
            return -1;
        }
        return d.e();
    }

    final SelfIdentityId aT(MessageCoreData messageCoreData) {
        bcyk a;
        ekzz f2 = eleg.f("UsageStatisticsImpl#getMessageSelfParticipantId");
        try {
            SelfIdentityId v = messageCoreData.v();
            if (v != null) {
                f2.close();
                return v;
            }
            ConversationIdType z = messageCoreData.z();
            SelfIdentityId selfIdentityId = null;
            if (!z.b() && (a = ((bdeo) this.O.b()).a(z)) != null) {
                selfIdentityId = a.f();
            }
            f2.close();
            return selfIdentityId;
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final elfl aU() {
        final eoup eoupVar = (eoup) eovl.a.createBuilder();
        final elfl a = ((cgfd) this.ak.b()).a();
        final elfl b = ((cgfd) this.ak.b()).b();
        return elfo.m(a, b).a(new Callable() { // from class: alvo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                long j2 = alvq.h;
                epbk epbkVar = (epbk) epbm.a.createBuilder();
                int i2 = true != ((Boolean) erqt.q(a)).booleanValue() ? 2 : 3;
                epbkVar.copyOnWrite();
                epbm epbmVar = (epbm) epbkVar.instance;
                epbmVar.c = i2 - 1;
                epbmVar.b |= 1;
                long longValue = ((Long) erqt.q(b)).longValue();
                epbkVar.copyOnWrite();
                epbm epbmVar2 = (epbm) epbkVar.instance;
                epbmVar2.b = 2 | epbmVar2.b;
                epbmVar2.d = longValue;
                eoup eoupVar2 = eoup.this;
                eoupVar2.copyOnWrite();
                eovl eovlVar = (eovl) eoupVar2.instance;
                epbm epbmVar3 = (epbm) epbkVar.build();
                eovl eovlVar2 = eovl.a;
                epbmVar3.getClass();
                eovlVar.am = epbmVar3;
                eovlVar.d |= 8;
                return eoupVar2;
            }
        }, erpp.a);
    }

    public final eqwf aX(int i2) {
        return ((djrv) this.am.b()).d(i2).a;
    }

    public final List aY(ConversationIdType conversationIdType) {
        return !conversationIdType.b() ? ((aljt) this.t.b()).d(((bczy) this.m.b()).L(conversationIdType)) : engw.r(eooc.UNKNOWN_FORMAT);
    }

    public final void aZ(MessageCoreData messageCoreData, eoop eoopVar) {
        eowy eowyVar;
        if (messageCoreData == null || !((atqy) this.W.b()).a()) {
            return;
        }
        Optional af = messageCoreData.af();
        if (af.isEmpty()) {
            eowu eowuVar = (eowu) eowy.a.createBuilder();
            eowuVar.copyOnWrite();
            eowy eowyVar2 = (eowy) eowuVar.instance;
            eowyVar2.c = 1;
            eowyVar2.b = 1;
            eowyVar = (eowy) eowuVar.build();
        } else {
            Optional k = ((djry) this.aq.b()).k(((djrk) this.ar.b()).a(((awui) af.get()).d));
            if (k.isEmpty()) {
                eowu eowuVar2 = (eowu) eowy.a.createBuilder();
                eowuVar2.copyOnWrite();
                eowy eowyVar3 = (eowy) eowuVar2.instance;
                eowyVar3.c = 2;
                eowyVar3.b = 1;
                eowyVar = (eowy) eowuVar2.build();
            } else {
                Optional u = ((djtp) k.get()).u();
                if (u.isEmpty() || ((String) u.get()).isEmpty()) {
                    eowu eowuVar3 = (eowu) eowy.a.createBuilder();
                    eowuVar3.copyOnWrite();
                    eowy eowyVar4 = (eowy) eowuVar3.instance;
                    eowyVar4.c = 3;
                    eowyVar4.b = 1;
                    eowyVar = (eowy) eowuVar3.build();
                } else {
                    eowu eowuVar4 = (eowu) eowy.a.createBuilder();
                    eoww eowwVar = (eoww) eowx.a.createBuilder();
                    String str = (String) u.get();
                    eowwVar.copyOnWrite();
                    eowx eowxVar = (eowx) eowwVar.instance;
                    eowxVar.b = 1 | eowxVar.b;
                    eowxVar.c = str;
                    eowuVar4.copyOnWrite();
                    eowy eowyVar5 = (eowy) eowuVar4.instance;
                    eowx eowxVar2 = (eowx) eowwVar.build();
                    eowxVar2.getClass();
                    eowyVar5.c = eowxVar2;
                    eowyVar5.b = 2;
                    eowyVar = (eowy) eowuVar4.build();
                }
            }
        }
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopq eopqVar2 = eopq.a;
        eowyVar.getClass();
        eopqVar.aE = eowyVar;
        eopqVar.d |= 524288;
    }

    @Override // defpackage.altk
    @Deprecated
    public final void aa(String str, final int i2, final String str2) {
        final aoku u = ((aolr) this.P.b()).u(str, i2);
        if (!this.y.get()) {
            r();
        } else {
            ((akzt) this.T.b()).c("Bugle.VerifiedSms.MessageUnverifiable.Counts");
            axos.a(new Runnable() { // from class: alvl
                @Override // java.lang.Runnable
                public final void run() {
                    eolu eoluVar = (eolu) eolv.a.createBuilder();
                    eolt eoltVar = eolt.BUGLE_BUSINESS_MESSAGING_EVENT;
                    eoluVar.copyOnWrite();
                    eolv eolvVar = (eolv) eoluVar.instance;
                    eolvVar.j = eoltVar.dk;
                    eolvVar.b |= 1;
                    eovx eovxVar = (eovx) eowd.a.createBuilder();
                    eovxVar.copyOnWrite();
                    eowd eowdVar = (eowd) eovxVar.instance;
                    eowdVar.c = 4;
                    eowdVar.b |= 1;
                    eovy eovyVar = (eovy) eowb.a.createBuilder();
                    String b = emxe.b(u.n());
                    eovyVar.copyOnWrite();
                    eowb eowbVar = (eowb) eovyVar.instance;
                    eowbVar.b |= 1;
                    eowbVar.c = b;
                    alvq alvqVar = alvq.this;
                    long c = ((akvz) alvqVar.p.b()).c(str2);
                    eovyVar.copyOnWrite();
                    eowb eowbVar2 = (eowb) eovyVar.instance;
                    eowbVar2.b |= 8;
                    eowbVar2.f = c;
                    eovo eovoVar = eovo.NOT_VERIFIABLE;
                    eovyVar.copyOnWrite();
                    eowb eowbVar3 = (eowb) eovyVar.instance;
                    eowbVar3.e = eovoVar.g;
                    eowbVar3.b = 4 | eowbVar3.b;
                    eoqk a = ((akyw) alvqVar.r.b()).a(i2);
                    eovyVar.copyOnWrite();
                    eowb eowbVar4 = (eowb) eovyVar.instance;
                    eowbVar4.d = a;
                    eowbVar4.b |= 2;
                    eovxVar.copyOnWrite();
                    eowd eowdVar2 = (eowd) eovxVar.instance;
                    eowb eowbVar5 = (eowb) eovyVar.build();
                    eowbVar5.getClass();
                    eowdVar2.d = eowbVar5;
                    eowdVar2.b |= 2;
                    eoluVar.copyOnWrite();
                    eolv eolvVar2 = (eolv) eoluVar.instance;
                    eowd eowdVar3 = (eowd) eovxVar.build();
                    eowdVar3.getClass();
                    eolvVar2.al = eowdVar3;
                    eolvVar2.d |= 16;
                    alvqVar.w.n(eoluVar);
                }
            }, this.A);
        }
    }

    @Override // defpackage.altk
    public final void ab(eovo eovoVar, cvam cvamVar, long j2) {
        if (!this.y.get()) {
            r();
            return;
        }
        String str = (String) enhk.o(eovo.VERIFIED, "Bugle.VerifiedSms.Grpc.Successful.Verified.Latency", eovo.UNVERIFIED, "Bugle.VerifiedSms.Grpc.Successful.Unverified.Latency", eovo.NA, "Bugle.VerifiedSms.Grpc.Successful.Na.Latency", eovo.UNKNOWN, "Bugle.VerifiedSms.Grpc.Successful.Unknown.Latency").get(eovoVar);
        if (str != null) {
            ((akzt) this.T.b()).g(str, j2);
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_VERIFIED_SMS;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eovm eovmVar = (eovm) eovr.a.createBuilder();
        eovmVar.copyOnWrite();
        eovr eovrVar = (eovr) eovmVar.instance;
        eovrVar.c = eovoVar.g;
        eovrVar.b |= 1;
        eovmVar.copyOnWrite();
        eovr eovrVar2 = (eovr) eovmVar.instance;
        eovrVar2.b |= 2;
        eovrVar2.d = j2;
        eovq eovqVar = (eovq) enhk.p(cvam.UNKNOWN_TYPE, eovq.UNKNOWN_TYPE, cvam.NOT_YET_KNOWN, eovq.NOT_SET_YET, cvam.RCS, eovq.RCS, cvam.C11N, eovq.C11N, cvam.C11N_RCS, eovq.C11N_RCS).getOrDefault(cvamVar, eovq.UNKNOWN_TYPE);
        eovmVar.copyOnWrite();
        eovr eovrVar3 = (eovr) eovmVar.instance;
        eovrVar3.e = eovqVar.f;
        eovrVar3.b |= 4;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eovr eovrVar4 = (eovr) eovmVar.build();
        eovrVar4.getClass();
        eolvVar2.P = eovrVar4;
        eolvVar2.c |= 1024;
        this.w.j(eoluVar);
    }

    @Override // defpackage.altk
    @Deprecated
    public final void ac(String str, int i2, String str2, String str3, byzi byziVar) {
        bv(str, i2, str2, 5, str3, byziVar);
    }

    @Override // defpackage.altk
    public final void ad(int i2) {
        ((akzt) this.T.b()).e("Bugle.Media.VideoViewer.Launch.Counts", i2);
    }

    @Override // defpackage.altk
    public final void ae(eooi eooiVar, fjay fjayVar, akzo akzoVar) {
        synchronized (this.k) {
            Map map = (Map) this.k.get(fjayVar.b);
            if (map == null) {
                map = new ConcurrentHashMap();
                this.k.put(fjayVar.b, map);
            }
            map.put(eooiVar, akzoVar);
        }
    }

    @Override // defpackage.altk
    public final void af() {
        csvs.c(erqt.f(((algm) this.z.b()).e(-1L), ((algm) this.z.b()).h(-1L)), "BugleUsageStatistics", "Failed to clear downloaded and upload report bytes");
    }

    @Override // defpackage.altk
    public final void ag(final MessageCoreData messageCoreData) {
        if (messageCoreData.y() != null) {
            axnw.h(messageCoreData.y().f().h(new emwl() { // from class: altm
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    alvq.this.D.f(messageCoreData);
                    return null;
                }
            }, this.B));
        } else {
            this.D.f(messageCoreData);
        }
    }

    @Override // defpackage.altk
    public final void ah(int i2) {
        ((alrv) this.o.b()).e(i2 != 0 ? i2 != 1 ? i2 != 3 ? alrv.a : alrv.g : alrv.f : alrv.e);
        ((alrv) this.o.b()).e(altl.a(i2));
    }

    @Override // defpackage.altk
    public final void ai(boolean z) {
        Instant f2 = this.u.f();
        final long epochMilli = f2.toEpochMilli();
        csvs.c(erqt.f(((algm) this.z.b()).a.b(eldl.a(new emwl() { // from class: alfo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i2 = algm.d;
                alfh alfhVar = (alfh) ((alfi) obj).toBuilder();
                alfhVar.copyOnWrite();
                alfi alfiVar = (alfi) alfhVar.instance;
                alfiVar.b |= 8;
                alfiVar.f = epochMilli;
                return (alfi) alfhVar.build();
            }
        }), erpp.a), ((algm) this.z.b()).f(epochMilli)), "BugleUsageStatistics", "Failed to update lastActiveEvent|lastPassiveEvent");
        ((alqf) this.L.b()).g(f2);
        ((alqf) this.L.b()).f(f2);
        if (z) {
            csvs.c(((algm) this.z.b()).a.b(eldl.a(new emwl() { // from class: algg
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    int i2 = algm.d;
                    alfh alfhVar = (alfh) ((alfi) obj).toBuilder();
                    alfhVar.copyOnWrite();
                    alfi alfiVar = (alfi) alfhVar.instance;
                    alfiVar.b |= 128;
                    alfiVar.j = epochMilli;
                    return (alfi) alfhVar.build();
                }
            }), erpp.a), "BugleUsageStatistics", "Failed to update LastActiveRcsEventTimeMillis");
            ((alqf) this.L.b()).h(f2);
        }
    }

    @Override // defpackage.altk
    public final void aj() {
        ((ctyx) this.U.b()).k("last_rbm_active_event_time_millis", this.u.f().toEpochMilli());
    }

    @Override // defpackage.altk
    public final void ak() {
        ((ctyx) this.U.b()).k("last_rbm_interactive_event_time_millis", this.u.f().toEpochMilli());
    }

    @Override // defpackage.altk
    public final void al() {
        ((ctyx) this.U.b()).k("last_video_call_button_click_time_millis", this.u.f().toEpochMilli());
    }

    @Override // defpackage.altk
    public final boolean am() {
        return this.y.get();
    }

    @Override // defpackage.altk
    public final void an(aoku aokuVar, final byzi byziVar, final String str) {
        eovo eovoVar = (eovo) aV().getOrDefault(byziVar, eovo.UNKNOWN);
        final String b = emxe.b(aokuVar.n());
        if (aokuVar.n() != null && eovo.VERIFIED != eovoVar) {
            b = cskt.b(b).toString();
        }
        if (this.y.get()) {
            axos.a(new Runnable() { // from class: alvk
                @Override // java.lang.Runnable
                public final void run() {
                    eolu eoluVar = (eolu) eolv.a.createBuilder();
                    eolt eoltVar = eolt.BUGLE_BUSINESS_MESSAGING_EVENT;
                    eoluVar.copyOnWrite();
                    eolv eolvVar = (eolv) eoluVar.instance;
                    eolvVar.j = eoltVar.dk;
                    eolvVar.b |= 1;
                    eovx eovxVar = (eovx) eowd.a.createBuilder();
                    eovxVar.copyOnWrite();
                    eowd eowdVar = (eowd) eovxVar.instance;
                    eowdVar.c = 3;
                    eowdVar.b |= 1;
                    eovy eovyVar = (eovy) eowb.a.createBuilder();
                    eovyVar.copyOnWrite();
                    eowb eowbVar = (eowb) eovyVar.instance;
                    String str2 = b;
                    str2.getClass();
                    eowbVar.b |= 1;
                    eowbVar.c = str2;
                    alvq alvqVar = alvq.this;
                    long c = ((akvz) alvqVar.p.b()).c(str);
                    eovyVar.copyOnWrite();
                    eowb eowbVar2 = (eowb) eovyVar.instance;
                    eowbVar2.b |= 8;
                    eowbVar2.f = c;
                    eovo eovoVar2 = (eovo) alvq.aV().getOrDefault(byziVar, eovo.UNKNOWN);
                    eovyVar.copyOnWrite();
                    eowb eowbVar3 = (eowb) eovyVar.instance;
                    eowbVar3.e = eovoVar2.g;
                    eowbVar3.b |= 4;
                    eoqk a = ((akyw) alvqVar.r.b()).a(-1);
                    eovyVar.copyOnWrite();
                    eowb eowbVar4 = (eowb) eovyVar.instance;
                    eowbVar4.d = a;
                    eowbVar4.b |= 2;
                    eovxVar.copyOnWrite();
                    eowd eowdVar2 = (eowd) eovxVar.instance;
                    eowb eowbVar5 = (eowb) eovyVar.build();
                    eowbVar5.getClass();
                    eowdVar2.d = eowbVar5;
                    eowdVar2.b |= 2;
                    eoluVar.copyOnWrite();
                    eolv eolvVar2 = (eolv) eoluVar.instance;
                    eowd eowdVar3 = (eowd) eovxVar.build();
                    eowdVar3.getClass();
                    eolvVar2.al = eowdVar3;
                    eolvVar2.d |= 16;
                    alvqVar.w.n(eoluVar);
                }
            }, this.A);
        } else {
            r();
        }
    }

    @Override // defpackage.altk
    public final void ao(int i2, int i3, int i4, long j2, int i5, long j3, ConversationIdType conversationIdType) {
        bo(-1, i2, i3, j2, i5, i4, j3, true, conversationIdType);
    }

    @Override // defpackage.altk
    public final void ap(bdhg bdhgVar, eqxi eqxiVar, eqyl eqylVar) {
        bx(bdhgVar, null, 1, 14, eqxiVar, eqylVar, eooi.INCOMING_BLOCKED_USER);
    }

    @Override // defpackage.altk
    public final void aq(MessageCoreData messageCoreData, Optional optional, eqyl eqylVar, akzo akzoVar) {
        if (altl.d(messageCoreData.d()) != 4) {
            new alqr(messageCoreData, "");
        }
        by(messageCoreData, 10, optional, Optional.of(eqylVar), akzoVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x005b, code lost:
    
        if (r0.equals(r1) == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.altk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ar(android.app.NotificationChannel r6, android.app.NotificationChannel r7) {
        /*
            r5 = this;
            if (r6 == 0) goto Ld1
            if (r7 != 0) goto L6
            goto Ld1
        L6:
            java.lang.String r0 = defpackage.akb$$ExternalSyntheticApiModelOutline0.m149m(r6)
            if (r0 == 0) goto Lc9
            java.lang.String r0 = defpackage.akb$$ExternalSyntheticApiModelOutline0.m149m(r6)
            java.lang.String r1 = defpackage.akb$$ExternalSyntheticApiModelOutline0.m149m(r7)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto Lc9
        L1c:
            int r0 = defpackage.akb$$ExternalSyntheticApiModelOutline0.m(r6)
            int r1 = defpackage.akb$$ExternalSyntheticApiModelOutline0.m(r7)
            r2 = 1
            java.lang.String r3 = "Bugle.UI.PeopleAndOptions.Notification.Setting.Changes"
            if (r0 == r1) goto L48
            int r0 = defpackage.akb$$ExternalSyntheticApiModelOutline0.m(r7)
            r1 = 2
            if (r0 == r2) goto L3d
            r4 = 3
            if (r0 == r1) goto L3c
            r1 = 4
            if (r0 == r4) goto L3d
            if (r0 == r1) goto L3a
            r1 = r2
            goto L3d
        L3a:
            r1 = 5
            goto L3d
        L3c:
            r1 = r4
        L3d:
            ffbr r0 = r5.T
            java.lang.Object r0 = r0.b()
            akzt r0 = (defpackage.akzt) r0
            r0.e(r3, r1)
        L48:
            android.net.Uri r0 = defpackage.akb$$ExternalSyntheticApiModelOutline0.m143m(r6)
            android.net.Uri r1 = defpackage.akb$$ExternalSyntheticApiModelOutline0.m143m(r7)
            if (r0 != 0) goto L55
            if (r1 != 0) goto L5d
            r1 = 0
        L55:
            if (r0 == 0) goto L69
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L69
        L5d:
            ffbr r0 = r5.T
            java.lang.Object r0 = r0.b()
            akzt r0 = (defpackage.akzt) r0
            r1 = 6
            r0.e(r3, r1)
        L69:
            boolean r0 = defpackage.akb$$ExternalSyntheticApiModelOutline0.m151m(r6)
            boolean r1 = defpackage.akb$$ExternalSyntheticApiModelOutline0.m151m(r7)
            if (r0 == r1) goto L88
            ffbr r0 = r5.T
            java.lang.Object r0 = r0.b()
            akzt r0 = (defpackage.akzt) r0
            boolean r1 = defpackage.akb$$ExternalSyntheticApiModelOutline0.m151m(r7)
            if (r2 == r1) goto L84
            r1 = 8
            goto L85
        L84:
            r1 = 7
        L85:
            r0.e(r3, r1)
        L88:
            boolean r0 = defpackage.akb$$ExternalSyntheticApiModelOutline0.m157m$1(r6)
            boolean r1 = defpackage.akb$$ExternalSyntheticApiModelOutline0.m157m$1(r7)
            if (r0 == r1) goto La8
            ffbr r0 = r5.T
            java.lang.Object r0 = r0.b()
            akzt r0 = (defpackage.akzt) r0
            boolean r1 = defpackage.akb$$ExternalSyntheticApiModelOutline0.m157m$1(r7)
            if (r2 == r1) goto La3
            r1 = 10
            goto La5
        La3:
            r1 = 9
        La5:
            r0.e(r3, r1)
        La8:
            boolean r6 = defpackage.akb$$ExternalSyntheticApiModelOutline0.m159m$2(r6)
            boolean r0 = defpackage.akb$$ExternalSyntheticApiModelOutline0.m159m$2(r7)
            if (r6 == r0) goto Lc8
            ffbr r6 = r5.T
            java.lang.Object r6 = r6.b()
            akzt r6 = (defpackage.akzt) r6
            boolean r7 = defpackage.akb$$ExternalSyntheticApiModelOutline0.m159m$2(r7)
            if (r2 == r7) goto Lc3
            r7 = 12
            goto Lc5
        Lc3:
            r7 = 11
        Lc5:
            r6.e(r3, r7)
        Lc8:
            return
        Lc9:
            cskc r6 = defpackage.alvq.i
            java.lang.String r7 = "Before channel does not match after channel."
            r6.r(r7)
            return
        Ld1:
            cskc r6 = defpackage.alvq.i
            java.lang.String r7 = "Before channel or after channel is null."
            r6.r(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alvq.ar(android.app.NotificationChannel, android.app.NotificationChannel):void");
    }

    @Override // defpackage.altk
    public final void as() {
    }

    @Override // defpackage.altk
    public final int at() {
        ApplicationInfo b = dkuy.b(this.ah);
        if (b == null) {
            return 1;
        }
        if (!dkuy.j(b.flags)) {
            return 3;
        }
        if (b.enabled) {
            return !dkvw.b(this.ah) ? 5 : 2;
        }
        return 4;
    }

    @Override // defpackage.altk
    @Deprecated
    public final void au(int i2) {
        bw(i2, 3, eolt.BUGLE_ADD_CONTACT);
    }

    @Override // defpackage.altk
    public final void av(String str, int i2) {
        aA(3, str, i2);
    }

    @Override // defpackage.altk
    public final void aw(int i2) {
        if (!this.y.get()) {
            r();
            return;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_CONTACT_BANNER;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoke eokeVar = (eoke) eokf.a.createBuilder();
        eoxe eoxeVar = (eoxe) eoxf.a.createBuilder();
        eoxeVar.copyOnWrite();
        eoxf eoxfVar = (eoxf) eoxeVar.instance;
        eoxfVar.c = i2 - 1;
        eoxfVar.b |= 1;
        eokeVar.copyOnWrite();
        eokf eokfVar = (eokf) eokeVar.instance;
        eoxf eoxfVar2 = (eoxf) eoxeVar.build();
        eoxfVar2.getClass();
        eokfVar.c = eoxfVar2;
        eokfVar.b = 2;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eokf eokfVar2 = (eokf) eokeVar.build();
        eokfVar2.getClass();
        eolvVar2.F = eokfVar2;
        eolvVar2.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        this.w.j(eoluVar);
    }

    @Override // defpackage.altk
    public final void ax(ConversationIdType conversationIdType, eoko eokoVar, int i2, int i3, boolean z, Boolean bool, boolean z2, boolean z3, int i4, List list, boolean z4, int i5, boolean z5, int i6) {
        int f2;
        if (!this.y.get()) {
            r();
            return;
        }
        epyw epywVar = epyw.UNKNOWN_BUGLE_EVENT_CODE;
        if (z) {
            epywVar = epyw.ACTIVE_USER_ENTER_CONVERSATION_WITH_UNREAD_MESSAGE;
            ai(z2);
            if (z4) {
                aj();
            }
        }
        eokv eokvVar = (eokv) eokw.a.createBuilder();
        long b = ((akvz) this.p.b()).b(conversationIdType);
        eokvVar.copyOnWrite();
        eokw eokwVar = (eokw) eokvVar.instance;
        eokwVar.b |= 65536;
        eokwVar.r = b;
        eokvVar.copyOnWrite();
        eokw eokwVar2 = (eokw) eokvVar.instance;
        eokwVar2.e = 1;
        eokwVar2.b |= 1;
        eokvVar.copyOnWrite();
        eokw eokwVar3 = (eokw) eokvVar.instance;
        eokwVar3.f = eokoVar.u;
        eokwVar3.b |= 2;
        eokvVar.copyOnWrite();
        eokw eokwVar4 = (eokw) eokvVar.instance;
        eokwVar4.b |= 4;
        eokwVar4.g = i2;
        eokvVar.copyOnWrite();
        eokw eokwVar5 = (eokw) eokvVar.instance;
        eokwVar5.b |= 8;
        eokwVar5.h = i3;
        eokvVar.copyOnWrite();
        eokw eokwVar6 = (eokw) eokvVar.instance;
        eokwVar6.b |= 32;
        eokwVar6.i = z;
        eokvVar.copyOnWrite();
        eokw eokwVar7 = (eokw) eokvVar.instance;
        int i7 = i5 - 1;
        if (i5 == 0) {
            throw null;
        }
        eokwVar7.A = i7;
        eokwVar7.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        eokvVar.copyOnWrite();
        eokw eokwVar8 = (eokw) eokvVar.instance;
        eokwVar8.C = epuz.a(i6);
        eokwVar8.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                f2 = 2;
            } else {
                f2 = aljt.f((eooc) list.get(0));
            }
            eokvVar.copyOnWrite();
            eokw eokwVar9 = (eokw) eokvVar.instance;
            eokwVar9.p = f2 - 1;
            eokwVar9.b |= 16384;
            eokvVar.a(list);
        }
        if (bool == null) {
            eokvVar.copyOnWrite();
            eokw eokwVar10 = (eokw) eokvVar.instance;
            eokwVar10.l = 0;
            eokwVar10.b |= 1024;
        } else {
            int i8 = true != bool.booleanValue() ? 3 : 2;
            eokvVar.copyOnWrite();
            eokw eokwVar11 = (eokw) eokvVar.instance;
            eokwVar11.l = i8 - 1;
            eokwVar11.b |= 1024;
        }
        int i9 = z2 ? 3 : 2;
        eokvVar.copyOnWrite();
        eokw eokwVar12 = (eokw) eokvVar.instance;
        eokwVar12.k = i9 - 1;
        eokwVar12.b |= 512;
        eoks b2 = altl.b(Integer.valueOf(i4));
        eokvVar.copyOnWrite();
        eokw eokwVar13 = (eokw) eokvVar.instance;
        eokwVar13.j = b2.f;
        eokwVar13.b |= 256;
        if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue()) {
            eokvVar.copyOnWrite();
            eokw eokwVar14 = (eokw) eokvVar.instance;
            eokwVar14.b |= 1073741824;
            eokwVar14.G = z3;
        }
        if (z5) {
            eokvVar.copyOnWrite();
            eokw eokwVar15 = (eokw) eokvVar.instance;
            eokwVar15.B = 1;
            eokwVar15.b |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        }
        eolv aW = aW((eokw) eokvVar.build());
        cskc cskcVar = i;
        csjb c = cskcVar.c();
        c.I("Create or Open Conversation UNREAD");
        c.J(z);
        c.r();
        csjb c2 = cskcVar.c();
        c2.I("Create or Open Conversation IS XMS FALLBACK");
        eokw eokwVar16 = aW.m;
        if (eokwVar16 == null) {
            eokwVar16 = eokw.a;
        }
        c2.G((eoki.a(eokwVar16.l) != 0 ? r11 : 1) - 1);
        c2.r();
        csjb c3 = cskcVar.c();
        c3.I("Create or Open Conversation Is RCS");
        c3.J(z2);
        c3.r();
        csjb c4 = cskcVar.c();
        c4.I("Create or Open conversation CONVERSATION TYPE");
        c4.G(i4);
        c4.r();
        this.w.k((eolu) aW.toBuilder(), epywVar);
    }

    @Override // defpackage.altk
    public final void ay(ConversationIdType conversationIdType, int i2) {
        if (!this.y.get()) {
            r();
            return;
        }
        eokv eokvVar = (eokv) eokw.a.createBuilder();
        eokvVar.copyOnWrite();
        eokw eokwVar = (eokw) eokvVar.instance;
        eokwVar.x = 1;
        eokwVar.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        eokvVar.copyOnWrite();
        eokw eokwVar2 = (eokw) eokvVar.instance;
        eokwVar2.d = Integer.valueOf(i2 - 1);
        eokwVar2.c = 29;
        bn(eokvVar, conversationIdType);
    }

    @Override // defpackage.altk
    @Deprecated
    public final void az(int i2) {
        bw(i2, 4, eolt.BUGLE_EDIT_CONTACT);
    }

    @Override // defpackage.altk, defpackage.dkpi
    public final void b(eyxz eyxzVar) {
        if (((Boolean) g.e()).booleanValue()) {
            return;
        }
        ekzm b = this.aj.b("UsageStatistics dispatchSimStateEvent");
        try {
            if (this.y.get()) {
                eolu eoluVar = (eolu) eolv.a.createBuilder();
                eolt eoltVar = eolt.BUGLE_TELEPHONY_EVENT;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                eolvVar.j = eoltVar.dk;
                eolvVar.b |= 1;
                eyye eyyeVar = (eyye) eyyf.a.createBuilder();
                eyyeVar.copyOnWrite();
                eyyf eyyfVar = (eyyf) eyyeVar.instance;
                eyxzVar.getClass();
                eyyfVar.c = eyxzVar;
                eyyfVar.b = 1;
                eoluVar.copyOnWrite();
                eolv eolvVar2 = (eolv) eoluVar.instance;
                eyyf eyyfVar2 = (eyyf) eyyeVar.build();
                eyyfVar2.getClass();
                eolvVar2.A = eyyfVar2;
                eolvVar2.b |= 1048576;
                this.w.j(eoluVar);
            } else {
                r();
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void ba(long j2, String str) {
        ((akzt) this.T.b()).e(str, eohg.a(csuc.a(j2)));
    }

    public final boolean bc(MessageCoreData messageCoreData) {
        return this.an.a() && messageCoreData.da();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void be(final MessageCoreData messageCoreData, final int i2, final akzo akzoVar, eoop eoopVar) {
        long j2;
        long j3;
        final epjp epjpVar;
        Long l;
        eooo eoooVar;
        eoxo eoxoVar;
        eonv eonvVar;
        Optional empty;
        Optional empty2;
        Optional empty3;
        Optional empty4;
        long t = messageCoreData.t();
        epjp epjpVar2 = epjp.UNKNOWN_REPLY_MODE;
        int b = eook.b(((eopq) eoopVar.instance).h);
        if (b == 0) {
            b = 1;
        }
        String b2 = messageCoreData.B().b();
        altj a = this.D.a(b2);
        eooi a2 = a == null ? alrm.a(messageCoreData, b) : a.a;
        int i3 = b - 1;
        if (i3 != 1) {
            if (i3 == 2 || i3 == 3) {
                alqf alqfVar = (alqf) this.L.b();
                emau.a(ffsl.b(ekxi.a(alqfVar.b.hT())), alqfVar.c, new alpy(null, alqfVar, ((ctyz) this.V.b()).t() == 4));
                bl(messageCoreData, a2);
            } else {
                if (i3 != 16) {
                    throw new IllegalStateException("Invalid messageStatus for logMessageSentOrReceived: ".concat(eook.a(b)));
                }
                this.D.f(messageCoreData);
            }
            epjpVar = epjpVar2;
            j2 = t;
            j3 = -1;
        } else {
            String b3 = messageCoreData.B().b();
            alru alruVar = this.D;
            long longValue = (!alruVar.d.containsKey(b3) || (l = (Long) alruVar.d.remove(b3)) == null) ? 0L : l.longValue();
            long j4 = longValue > 0 ? akzoVar.a - longValue : -1L;
            ((ctyx) this.U.b()).h("has_sent_a_message", true);
            List L = ((bdmq) this.n.b()).L(messageCoreData.z(), 2);
            epjp a3 = ((ctiz) this.X.b()).a(L.size() > 1 ? (MessageCoreData) L.get(1) : null);
            alqf alqfVar2 = (alqf) this.L.b();
            j2 = t;
            emau.a(ffsl.b(ekxi.a(alqfVar2.b.hT())), alqfVar2.c, new alpn(null, alqfVar2, alqfVar2.d.a()));
            if (messageCoreData.cX()) {
                alqf alqfVar3 = (alqf) this.L.b();
                emau.a(ffsl.b(ekxi.a(alqfVar3.b.hT())), alqfVar3.c, new alpp(null, alqfVar3, alqfVar3.d.a()));
            }
            j3 = j4;
            epjpVar = a3;
        }
        final DeviceData deviceData = (DeviceData) this.D.a.remove(b2);
        final Integer e = this.D.e(b2);
        final eoog d = this.D.d(b2);
        eonv b4 = this.D.b(b2);
        alru alruVar2 = this.D;
        if (!alruVar2.b.containsKey(b2) || (eoooVar = (eooo) alruVar2.b.remove(b2)) == null) {
            eoooVar = eooo.UNKNOWN_WAS_RCS_CONVERSATION;
        }
        final eooe c = this.D.c(b2);
        final eqwf aX = aX(i2);
        MessageData messageData = (MessageData) messageCoreData;
        if (messageData.k.l() != null) {
            eoxoVar = messageData.k.l();
        } else {
            alru alruVar3 = this.D;
            eoxoVar = alruVar3.c.containsKey(b2) ? (eoxo) alruVar3.c.remove(b2) : null;
        }
        final List aY = aY(messageCoreData.z());
        final int f2 = ((cttn) this.Y.b()).f();
        final eoxo eoxoVar2 = eoxoVar;
        final eoos b5 = ((cstx) this.aa.b()).b(messageCoreData.ar());
        final int a4 = algx.a(this.ah);
        final ArrayList arrayList = new ArrayList();
        ConversationIdType z = messageCoreData.z();
        if (z.b()) {
            eonvVar = b4;
        } else {
            eonvVar = b4;
            List L2 = ((bczy) this.m.b()).L(z);
            if (L2 != null) {
                enqv it = ((engw) L2).iterator();
                while (it.hasNext()) {
                    if (((ParticipantsTable.BindData) it.next()) != null) {
                        arrayList.add(Boolean.valueOf(!TextUtils.isEmpty(r7.T())));
                    }
                }
                SelfIdentityId aT = aT(messageCoreData);
                aztg f3 = aT != null ? ((bdtd) this.Z.b()).f(aT) : null;
                arrayList.add(0, Boolean.valueOf((f3 == null || TextUtils.isEmpty(f3.a().T())) ? false : true));
            }
        }
        eopq eopqVar = (eopq) eoopVar.instance;
        if ((eopqVar.c & 2097152) != 0) {
            eqyl b6 = eqyl.b(eopqVar.aa);
            if (b6 == null) {
                b6 = eqyl.UNKNOWN_RCS_TYPE;
            }
            empty = Optional.of(b6);
        } else {
            empty = Optional.empty();
        }
        eopq eopqVar2 = (eopq) eoopVar.instance;
        if ((eopqVar2.c & Integer.MIN_VALUE) != 0) {
            eoov b7 = eoov.b(eopqVar2.ak);
            if (b7 == null) {
                b7 = eoov.UNKNOWN_FORMAT_TYPE;
            }
            empty2 = Optional.of(b7);
        } else {
            empty2 = Optional.empty();
        }
        eopq eopqVar3 = (eopq) eoopVar.instance;
        final Optional optional = empty2;
        if ((eopqVar3.d & 1) != 0) {
            eopa b8 = eopa.b(eopqVar3.al);
            if (b8 == null) {
                b8 = eopa.UNKNOWN_IS_IMS;
            }
            empty3 = Optional.of(b8);
        } else {
            empty3 = Optional.empty();
        }
        eopq eopqVar4 = (eopq) eoopVar.instance;
        final Optional optional2 = empty3;
        if ((eopqVar4.d & 2) != 0) {
            eoox b9 = eoox.b(eopqVar4.am);
            if (b9 == null) {
                b9 = eoox.UNKNOWN_HANDLED_BY;
            }
            empty4 = Optional.of(b9);
        } else {
            empty4 = Optional.empty();
        }
        eopq eopqVar5 = (eopq) eoopVar.instance;
        final Optional optional3 = empty4;
        Optional of = (eopqVar5.c & 1073741824) != 0 ? Optional.of(Boolean.valueOf(eopqVar5.aj)) : Optional.empty();
        eopq eopqVar6 = (eopq) eoopVar.instance;
        final Optional optional4 = of;
        int a5 = eopg.a(eopqVar6.Y);
        int i4 = a5 == 0 ? 1 : a5;
        eopp b10 = eopp.b(eopqVar6.aq);
        if (b10 == null) {
            b10 = eopp.UNSPECIFIED;
        }
        fjay fjayVar = eopqVar6.o;
        if (fjayVar == null) {
            fjayVar = fjay.a;
        }
        eopk b11 = eopk.b(((eopq) eoopVar.instance).aB);
        if (b11 == null) {
            b11 = eopk.UNKNOWN_SATELLITE_TYPE;
        }
        final eopp eoppVar = b10;
        if (!this.y.get()) {
            r();
            return;
        }
        final eoop eoopVar2 = (eoop) eopq.a.createBuilder();
        aZ(messageCoreData, eoopVar2);
        final Optional optional5 = empty;
        final fjay fjayVar2 = fjayVar;
        final elfl i5 = ((alvz) this.H.b()).b(messageCoreData, eoopVar2).i(new eroh() { // from class: alvp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((alvz) alvq.this.H.b()).a(i2);
            }
        }, this.af);
        if (bc(messageCoreData)) {
            eoopVar2.copyOnWrite();
            eopq eopqVar7 = (eopq) eoopVar2.instance;
            eopqVar7.aB = b11.e;
            eopqVar7.d |= 65536;
        }
        elfl a6 = b == 3 ? ((alri) this.as.b()).a(messageCoreData) : elfo.e(Optional.empty());
        final long j5 = j2;
        final elfl elflVar = a6;
        final eonv eonvVar2 = eonvVar;
        final eooo eoooVar2 = eoooVar;
        final long j6 = j3;
        final int i6 = i4;
        final int i7 = b;
        final eooi eooiVar = a2;
        axnw.h(elfo.m(i5, a6).a(new Callable() { // from class: altn
            /* JADX WARN: Type inference failed for: r2v81, types: [aoku, java.lang.Object] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eopv eopvVar;
                int f4;
                eotr eotrVar = (eotr) erqt.q(i5);
                Optional optional6 = (Optional) erqt.q(elflVar);
                MessageCoreData messageCoreData2 = messageCoreData;
                int d2 = altl.d(messageCoreData2.d());
                int i8 = i7;
                long r = i8 == 2 ? messageCoreData2.r() : messageCoreData2.o();
                final eoop eoopVar3 = eoopVar2;
                long j7 = j5;
                alvq alvqVar = alvq.this;
                ffbr ffbrVar = alvqVar.p;
                eopv eopvVar2 = eopv.a;
                long j8 = r;
                long b12 = ((akvz) ffbrVar.b()).b(messageCoreData2.z());
                eoopVar3.copyOnWrite();
                eopq eopqVar8 = (eopq) eoopVar3.instance;
                eopq eopqVar9 = eopq.a;
                eopqVar8.b |= 1073741824;
                eopqVar8.G = b12;
                eoopVar3.copyOnWrite();
                eopq eopqVar10 = (eopq) eoopVar3.instance;
                eopqVar10.b |= 128;
                eopqVar10.n = j7;
                eoopVar3.copyOnWrite();
                eopq eopqVar11 = (eopq) eoopVar3.instance;
                int i9 = d2 - 1;
                eopqVar11.g = i9;
                eopqVar11.b |= 1;
                eoopVar3.copyOnWrite();
                eopq eopqVar12 = (eopq) eoopVar3.instance;
                int i10 = a4;
                eoos eoosVar = b5;
                eopqVar12.h = i8 - 1;
                eopqVar12.b |= 2;
                eoopVar3.copyOnWrite();
                eopq eopqVar13 = (eopq) eoopVar3.instance;
                eopqVar13.E = eoosVar.g;
                eopqVar13.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                eoopVar3.copyOnWrite();
                eopq eopqVar14 = (eopq) eoopVar3.instance;
                eooi eooiVar2 = eooiVar;
                int i11 = i2;
                eopqVar14.F = i10 - 1;
                eopqVar14.b |= 536870912;
                eoopVar3.copyOnWrite();
                eopq eopqVar15 = (eopq) eoopVar3.instance;
                eopqVar15.m = eooiVar2.J;
                eopqVar15.b |= 64;
                eoqk a7 = ((akyw) alvqVar.r.b()).a(i11);
                eoopVar3.copyOnWrite();
                eopq eopqVar16 = (eopq) eoopVar3.instance;
                eopqVar16.i = a7;
                eopqVar16.b |= 4;
                String k = alvqVar.k(Optional.of(Integer.valueOf(i11)));
                eoopVar3.copyOnWrite();
                eopq eopqVar17 = (eopq) eoopVar3.instance;
                k.getClass();
                eopqVar17.c |= 1;
                eopqVar17.J = k;
                eoul eoulVar = (eoul) eoum.a.createBuilder();
                eoulVar.copyOnWrite();
                eoum eoumVar = (eoum) eoulVar.instance;
                eoumVar.b |= 1;
                eoumVar.c = j8;
                long epochMilli = alvqVar.u.f().toEpochMilli();
                long r2 = i8 == 2 ? messageCoreData2.r() : messageCoreData2.o();
                eoulVar.copyOnWrite();
                eoum eoumVar2 = (eoum) eoulVar.instance;
                eoumVar2.b |= 2;
                eoumVar2.d = epochMilli - r2;
                eoopVar3.copyOnWrite();
                eopq eopqVar18 = (eopq) eoopVar3.instance;
                eoum eoumVar3 = (eoum) eoulVar.build();
                eoumVar3.getClass();
                eopqVar18.k = eoumVar3;
                eopqVar18.b |= 16;
                eoopVar3.copyOnWrite();
                eopq eopqVar19 = (eopq) eoopVar3.instance;
                eotrVar.getClass();
                eopqVar19.K = eotrVar;
                eopqVar19.c |= 32;
                eovw eovwVar = csjc.a;
                eoopVar3.copyOnWrite();
                eopq eopqVar20 = (eopq) eoopVar3.instance;
                eopqVar20.N = eovwVar.x;
                eopqVar20.c |= 512;
                int i12 = true != TextUtils.isEmpty(messageCoreData2.au()) ? 3 : 2;
                eoopVar3.copyOnWrite();
                eopq eopqVar21 = (eopq) eoopVar3.instance;
                eopqVar21.Q = i12 - 1;
                eopqVar21.c |= 4096;
                enhd enhdVar = new enhd();
                enhdVar.k(130, eopc.HIGH_PRIORITY);
                enhdVar.k(129, eopc.NORMAL_PRIORITY);
                enhdVar.k(128, eopc.LOW_PRIORITY);
                eopc eopcVar = (eopc) enhdVar.c().getOrDefault(Integer.valueOf(messageCoreData2.b()), eopc.UNKNOWN_PRIORITY);
                eoopVar3.copyOnWrite();
                eopq eopqVar22 = (eopq) eoopVar3.instance;
                eopqVar22.R = eopcVar.e;
                eopqVar22.c |= 8192;
                eohv b13 = ((aljq) alvqVar.q.b()).b(i11);
                eoopVar3.copyOnWrite();
                eopq eopqVar23 = (eopq) eoopVar3.instance;
                b13.getClass();
                eopqVar23.U = b13;
                eopqVar23.c |= 65536;
                int i13 = true != messageCoreData2.cB() ? 3 : 2;
                int i14 = i6;
                eoopVar3.copyOnWrite();
                eopq eopqVar24 = (eopq) eoopVar3.instance;
                eopqVar24.S = i13 - 1;
                eopqVar24.c |= 16384;
                eoopVar3.copyOnWrite();
                eopq eopqVar25 = (eopq) eoopVar3.instance;
                fjay fjayVar3 = fjayVar2;
                eopp eoppVar2 = eoppVar;
                Optional optional7 = optional4;
                Optional optional8 = optional3;
                Optional optional9 = optional2;
                Optional optional10 = optional;
                Optional optional11 = optional5;
                eopqVar25.Y = i14 - 1;
                eopqVar25.c |= 524288;
                eoopVar3.copyOnWrite();
                eopq eopqVar26 = (eopq) eoopVar3.instance;
                eopqVar26.aq = eoppVar2.h;
                eopqVar26.d |= 32;
                eoopVar3.copyOnWrite();
                eopq eopqVar27 = (eopq) eoopVar3.instance;
                fjayVar3.getClass();
                eopqVar27.o = fjayVar3;
                eopqVar27.b |= 1024;
                eoopVar3.getClass();
                optional10.ifPresent(new alts(eoopVar3));
                optional9.ifPresent(new Consumer() { // from class: altt
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        eoop eoopVar4 = eoop.this;
                        eoopVar4.copyOnWrite();
                        eopq eopqVar28 = (eopq) eoopVar4.instance;
                        eopq eopqVar29 = eopq.a;
                        eopqVar28.al = ((eopa) obj).d;
                        eopqVar28.d |= 1;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                optional8.ifPresent(new Consumer() { // from class: altu
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        eoop eoopVar4 = eoop.this;
                        eoopVar4.copyOnWrite();
                        eopq eopqVar28 = (eopq) eoopVar4.instance;
                        eopq eopqVar29 = eopq.a;
                        eopqVar28.am = ((eoox) obj).d;
                        eopqVar28.d |= 2;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                optional7.ifPresent(new Consumer() { // from class: altv
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        eoop eoopVar4 = eoop.this;
                        eoopVar4.copyOnWrite();
                        eopq eopqVar28 = (eopq) eoopVar4.instance;
                        eopq eopqVar29 = eopq.a;
                        eopqVar28.c |= 1073741824;
                        eopqVar28.aj = booleanValue;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                ((alvz) alvqVar.H.b()).j(messageCoreData2, eoopVar3, optional11);
                ((alvz) alvqVar.H.b()).l(eoopVar3, d2, i8, i11);
                messageCoreData2.E().g(new Consumer() { // from class: altx
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        long j9 = alvq.h;
                        String f5 = ((bdhg) obj).f();
                        eoop eoopVar4 = eoop.this;
                        eoopVar4.copyOnWrite();
                        eopq eopqVar28 = (eopq) eoopVar4.instance;
                        eopq eopqVar29 = eopq.a;
                        eopqVar28.b |= Integer.MIN_VALUE;
                        eopqVar28.H = f5;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                if (alvqVar.bc(messageCoreData2)) {
                    messageCoreData2.A().g(new Consumer() { // from class: alty
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            long j9 = alvq.h;
                            String f5 = ((bdgr) obj).f();
                            eoop eoopVar4 = eoop.this;
                            eoopVar4.copyOnWrite();
                            eopq eopqVar28 = (eopq) eoopVar4.instance;
                            eopq eopqVar29 = eopq.a;
                            eopqVar28.d |= 512;
                            eopqVar28.au = f5;
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                ((alvz) alvqVar.H.b()).f(eoopVar3, i11);
                if (!TextUtils.isEmpty(messageCoreData2.aE())) {
                    eoln eolnVar = (eoln) eolo.a.createBuilder();
                    eolm eolmVar = eolm.WEB;
                    eolnVar.copyOnWrite();
                    eolo eoloVar = (eolo) eolnVar.instance;
                    eoloVar.c = eolmVar.f;
                    eoloVar.b |= 1;
                    eolo eoloVar2 = (eolo) eolnVar.build();
                    eoopVar3.copyOnWrite();
                    eopq eopqVar28 = (eopq) eoopVar3.instance;
                    eoloVar2.getClass();
                    eopqVar28.q = eoloVar2;
                    eopqVar28.b |= 8192;
                }
                Integer num = e;
                epyw epywVar = epyw.UNKNOWN_BUGLE_EVENT_CODE;
                if (num != null) {
                    eoks b14 = altl.b(num);
                    eoopVar3.copyOnWrite();
                    eopq eopqVar29 = (eopq) eoopVar3.instance;
                    eopqVar29.r = b14.f;
                    eopqVar29.b |= 16384;
                }
                List list = aY;
                eoxo eoxoVar3 = eoxoVar2;
                if (i8 == 2) {
                    ((bbae) alvqVar.v.b()).a(messageCoreData2.z(), j8).x(0L);
                    MessageData messageData2 = (MessageData) messageCoreData2;
                    eopvVar = ((alvz) alvqVar.H.b()).k(messageData2.i, 2);
                    for (MessagePartCoreData messagePartCoreData : messageData2.i) {
                        if (messagePartCoreData.bj()) {
                            int ordinal = messagePartCoreData.N().ordinal();
                            eumg eumgVar = ordinal != 27 ? ordinal != 28 ? eumg.CLIENT_PICKER_RECENTS : eumg.STICKER_SEARCH_RESULTS : eumg.PACK_DETAIL;
                            String X = messagePartCoreData.X();
                            if (X != null) {
                                ((eeui) alvqVar.l.b()).c(X, eumgVar);
                            } else {
                                alvq.i.r("Skipped logging sticker will null name.");
                            }
                        }
                    }
                    if (num != null) {
                        long j9 = j6;
                        eoopVar3.copyOnWrite();
                        eopq eopqVar30 = (eopq) eoopVar3.instance;
                        eopqVar30.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
                        eopqVar30.z = j9;
                        csjb a8 = alvq.i.a();
                        a8.z("messageSendClickToSentLatency", j9);
                        eoks b15 = eoks.b(((eopq) eoopVar3.instance).r);
                        if (b15 == null) {
                            b15 = eoks.UNKNOWN_BUGLE_CONVERSATION_TYPE;
                        }
                        a8.A("messageConversationType", b15);
                        a8.r();
                    }
                    if (eoxoVar3 != null && cful.a(ThreadLocalRandom.current(), alvq.d)) {
                        eoopVar3.copyOnWrite();
                        eopq eopqVar31 = (eopq) eoopVar3.instance;
                        eopqVar31.P = eoxoVar3;
                        eopqVar31.c |= 2048;
                    }
                    boolean z2 = i9 == 3;
                    epywVar = epyw.ACTIVE_USER_SEND_MESSAGE;
                    alvqVar.ai(z2);
                    if (list.size() == 1 && list.get(0) == eooc.RBM_BOT) {
                        alvqVar.aj();
                        alvqVar.ak();
                    }
                    alvqVar.Z(epyw.UMA_MESSAGE_SENT, messageCoreData2, i11);
                } else {
                    eopvVar = eopvVar2;
                }
                if (messageCoreData2.cX() && i8 == 3) {
                    eopvVar = ((alvz) alvqVar.H.b()).k(((MessageData) messageCoreData2).i, 3);
                }
                if (i8 == 17 && eoxoVar3 != null && cful.a(ThreadLocalRandom.current(), alvq.d)) {
                    eoopVar3.copyOnWrite();
                    eopq eopqVar32 = (eopq) eoopVar3.instance;
                    eopqVar32.P = eoxoVar3;
                    eopqVar32.c |= 2048;
                }
                if (i8 == 2 || i8 == 3 || i8 == 4 || i8 == 17) {
                    eooe eooeVar = c;
                    eooo eoooVar3 = eoooVar2;
                    eonv eonvVar3 = eonvVar2;
                    eoog eoogVar = d;
                    eoopVar3.copyOnWrite();
                    eopq eopqVar33 = (eopq) eoopVar3.instance;
                    eopqVar33.s = eoogVar.d;
                    eopqVar33.b |= 65536;
                    eoopVar3.copyOnWrite();
                    eopq eopqVar34 = (eopq) eoopVar3.instance;
                    eopqVar34.t = eonvVar3.d;
                    eopqVar34.b |= 131072;
                    eoopVar3.copyOnWrite();
                    eopq eopqVar35 = (eopq) eoopVar3.instance;
                    eopqVar35.u = eoooVar3.d;
                    eopqVar35.b |= 262144;
                    eoopVar3.copyOnWrite();
                    eopq eopqVar36 = (eopq) eoopVar3.instance;
                    eopqVar36.v = eooeVar.p;
                    eopqVar36.b |= 524288;
                    int bg = alvqVar.bg(messageCoreData2.ac());
                    eoopVar3.copyOnWrite();
                    eopq eopqVar37 = (eopq) eoopVar3.instance;
                    eqwf eqwfVar = aX;
                    eopqVar37.B = bg - 1;
                    eopqVar37.b |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
                    eoopVar3.copyOnWrite();
                    eopq eopqVar38 = (eopq) eoopVar3.instance;
                    eopqVar38.w = eqwfVar.N;
                    eopqVar38.b |= 1048576;
                    long epochMilli2 = alvqVar.u.f().toEpochMilli() - messageCoreData2.ac().toEpochMilli();
                    eoopVar3.copyOnWrite();
                    eopq eopqVar39 = (eopq) eoopVar3.instance;
                    eopqVar39.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
                    eopqVar39.C = epochMilli2;
                }
                eowr eowrVar = (eowr) eowt.a.createBuilder();
                int d3 = alvqVar.d();
                eowrVar.copyOnWrite();
                eowt eowtVar = (eowt) eowrVar.instance;
                eowtVar.b |= 1;
                eowtVar.c = d3;
                String e2 = ((alvz) alvqVar.H.b()).e();
                eowrVar.copyOnWrite();
                eowt eowtVar2 = (eowt) eowrVar.instance;
                e2.getClass();
                eowtVar2.b |= 4;
                eowtVar2.e = e2;
                eowt eowtVar3 = (eowt) eowrVar.build();
                eolm eolmVar2 = ((Optional) alvqVar.s.b()).isPresent() ? eolm.WEARABLE : eolm.PHONE;
                eoln eolnVar2 = (eoln) eolo.a.createBuilder();
                eolnVar2.copyOnWrite();
                eolo eoloVar3 = (eolo) eolnVar2.instance;
                eoloVar3.c = eolmVar2.f;
                eoloVar3.b |= 1;
                eolo eoloVar4 = (eolo) eolnVar2.build();
                eoopVar3.copyOnWrite();
                eopq eopqVar40 = (eopq) eoopVar3.instance;
                eopvVar.getClass();
                eopqVar40.j = eopvVar;
                eopqVar40.b |= 8;
                eoopVar3.copyOnWrite();
                eopq eopqVar41 = (eopq) eoopVar3.instance;
                eowtVar3.getClass();
                eopqVar41.y = eowtVar3;
                eopqVar41.b |= 4194304;
                if (list.size() > 1) {
                    f4 = 2;
                } else {
                    f4 = aljt.f((eooc) list.get(0));
                }
                eoopVar3.copyOnWrite();
                eopq eopqVar42 = (eopq) eoopVar3.instance;
                int i15 = f2;
                eopqVar42.x = f4 - 1;
                eopqVar42.b |= 2097152;
                eoopVar3.copyOnWrite();
                eopq eopqVar43 = (eopq) eoopVar3.instance;
                epjp epjpVar3 = epjpVar;
                eopqVar43.A = i15 - 1;
                eopqVar43.b |= 16777216;
                eoopVar3.copyOnWrite();
                eopq eopqVar44 = (eopq) eoopVar3.instance;
                eopqVar44.D = epjpVar3.d;
                eopqVar44.b |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
                eoopVar3.copyOnWrite();
                eopq eopqVar45 = (eopq) eoopVar3.instance;
                eygc eygcVar = eopqVar45.I;
                if (!eygcVar.c()) {
                    eopqVar45.I = eyfy.mutableCopy(eygcVar);
                }
                List list2 = arrayList;
                DeviceData deviceData2 = deviceData;
                eydl.addAll(list2, eopqVar45.I);
                eoopVar3.copyOnWrite();
                eopq eopqVar46 = (eopq) eoopVar3.instance;
                eoloVar4.getClass();
                eopqVar46.p = eoloVar4;
                eopqVar46.b |= 2048;
                eoopVar3.a(list);
                if (deviceData2 != null) {
                    csjb a9 = alvq.i.a();
                    a9.A("deviceData", deviceData2.a);
                    a9.r();
                    eoln eolnVar3 = (eoln) eolo.a.createBuilder();
                    eolnVar3.copyOnWrite();
                    eolo eoloVar5 = (eolo) eolnVar3.instance;
                    eoloVar5.c = deviceData2.a.f;
                    eoloVar5.b |= 1;
                    eolo eoloVar6 = (eolo) eolnVar3.build();
                    eoopVar3.copyOnWrite();
                    eopq eopqVar47 = (eopq) eoopVar3.instance;
                    eoloVar6.getClass();
                    eopqVar47.q = eoloVar6;
                    eopqVar47.b |= 8192;
                }
                if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && !messageCoreData2.ag().isEmpty()) {
                    boolean A = messageCoreData2.ag().get().A();
                    eoopVar3.copyOnWrite();
                    eopq eopqVar48 = (eopq) eoopVar3.instance;
                    eopqVar48.d |= 4096;
                    eopqVar48.ax = A;
                }
                Optional I = ((bczy) alvqVar.m.b()).I(messageCoreData2.z());
                if (I.isPresent()) {
                    int intValue = ((Integer) I.get()).intValue();
                    eoopVar3.copyOnWrite();
                    eopq eopqVar49 = (eopq) eoopVar3.instance;
                    eopqVar49.d |= 16384;
                    eopqVar49.az = intValue;
                }
                akzo akzoVar2 = akzoVar;
                optional6.ifPresent(new altw(eoopVar3));
                ((alvz) alvqVar.H.b()).g(eoopVar3);
                ((alvz) alvqVar.H.b()).h(messageCoreData2, eoopVar3);
                eolu eoluVar = (eolu) eolv.a.createBuilder();
                eolt eoltVar = eolt.BUGLE_MESSAGE;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                eolvVar.j = eoltVar.dk;
                eolvVar.b |= 1;
                eoluVar.copyOnWrite();
                eolv eolvVar2 = (eolv) eoluVar.instance;
                eopq eopqVar50 = (eopq) eoopVar3.build();
                eopqVar50.getClass();
                eolvVar2.l = eopqVar50;
                eolvVar2.b |= 4;
                akxn a10 = alvqVar.x.a();
                a10.d(epywVar);
                a10.f(akzoVar2);
                a10.j(eoluVar, alal.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
                eopq eopqVar51 = (eopq) eoopVar3.instance;
                long j10 = eopqVar51.n;
                int b16 = eook.b(eopqVar51.h);
                alrn.a(j10, b16 == 0 ? 1 : b16, akzoVar2);
                return null;
            }
        }, this.A));
    }

    public final int bf(ConversationIdType conversationIdType) {
        if (conversationIdType.b()) {
            return 1;
        }
        aljt aljtVar = (aljt) this.t.b();
        List L = ((bczy) this.m.b()).L(conversationIdType);
        if (((enou) L).c != 1) {
            return 2;
        }
        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) L.get(0);
        return aljt.f(aljtVar.c(((aolr) aljtVar.a.b()).q(bindData), bdqv.d(bindData)));
    }

    public final int bg(Instant instant) {
        long epochMilli = this.u.f().toEpochMilli() - instant.toEpochMilli();
        if (epochMilli < TimeUnit.SECONDS.toMillis(1L)) {
            return 2;
        }
        if (epochMilli < TimeUnit.SECONDS.toMillis(2L)) {
            return 3;
        }
        if (epochMilli < TimeUnit.SECONDS.toMillis(5L)) {
            return 4;
        }
        if (epochMilli < TimeUnit.SECONDS.toMillis(10L)) {
            return 5;
        }
        if (epochMilli < TimeUnit.SECONDS.toMillis(30L)) {
            return 6;
        }
        if (epochMilli < TimeUnit.MINUTES.toMillis(1L)) {
            return 7;
        }
        if (epochMilli < TimeUnit.MINUTES.toMillis(5L)) {
            return 8;
        }
        if (epochMilli < TimeUnit.MINUTES.toMillis(30L)) {
            return 9;
        }
        if (epochMilli < TimeUnit.HOURS.toMillis(1L)) {
            return 10;
        }
        if (epochMilli < TimeUnit.HOURS.toMillis(2L)) {
            return 11;
        }
        if (epochMilli < TimeUnit.HOURS.toMillis(5L)) {
            return 12;
        }
        if (epochMilli < TimeUnit.HOURS.toMillis(12L) + TimeUnit.MINUTES.toMillis(1L)) {
            return 13;
        }
        return epochMilli < TimeUnit.HOURS.toMillis(13L) ? 14 : 15;
    }

    public final void bh(MessageCoreData messageCoreData, int i2, eqxi eqxiVar, eoop eoopVar) {
        String b;
        long t = messageCoreData != null ? messageCoreData.t() : -1L;
        ((alvz) this.H.b()).f(eoopVar, aS(messageCoreData));
        eowr eowrVar = (eowr) eowt.a.createBuilder();
        int d = d();
        eowrVar.copyOnWrite();
        eowt eowtVar = (eowt) eowrVar.instance;
        eowtVar.b |= 1;
        eowtVar.c = d;
        String e = ((alvz) this.H.b()).e();
        eowrVar.copyOnWrite();
        eowt eowtVar2 = (eowt) eowrVar.instance;
        e.getClass();
        eowtVar2.b |= 4;
        eowtVar2.e = e;
        eowt eowtVar3 = (eowt) eowrVar.build();
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopq eopqVar2 = eopq.a;
        eowtVar3.getClass();
        eopqVar.y = eowtVar3;
        eopqVar.b |= 4194304;
        eoopVar.copyOnWrite();
        eopq eopqVar3 = (eopq) eoopVar.instance;
        eopqVar3.b |= 128;
        eopqVar3.n = t;
        int f2 = ((cttn) this.Y.b()).f();
        eoopVar.copyOnWrite();
        eopq eopqVar4 = (eopq) eoopVar.instance;
        eopqVar4.A = f2 - 1;
        eopqVar4.b |= 16777216;
        if (messageCoreData != null && i2 == 3) {
            eonv b2 = this.D.b(messageCoreData.B().b());
            eoopVar.copyOnWrite();
            eopq eopqVar5 = (eopq) eoopVar.instance;
            eopqVar5.t = b2.d;
            eopqVar5.b |= 131072;
            eooe c = this.D.c(messageCoreData.B().b());
            eoopVar.copyOnWrite();
            eopq eopqVar6 = (eopq) eoopVar.instance;
            eopqVar6.v = c.p;
            eopqVar6.b |= 524288;
            eopv k = ((alvz) this.H.b()).k(messageCoreData.ab(), 10);
            eoopVar.copyOnWrite();
            eopq eopqVar7 = (eopq) eoopVar.instance;
            k.getClass();
            eopqVar7.j = k;
            eopqVar7.b |= 8;
        }
        if (messageCoreData != null) {
            int i3 = true == messageCoreData.cB() ? 2 : 3;
            eoopVar.copyOnWrite();
            eopq eopqVar8 = (eopq) eoopVar.instance;
            eopqVar8.S = i3 - 1;
            eopqVar8.c |= 16384;
        }
        if (messageCoreData != null && (b = messageCoreData.B().b()) != null) {
            eoks b3 = altl.b(this.D.e(b));
            eoopVar.copyOnWrite();
            eopq eopqVar9 = (eopq) eoopVar.instance;
            eopqVar9.r = b3.f;
            eopqVar9.b |= 16384;
        }
        if (eqxiVar != null) {
            eoopVar.copyOnWrite();
            eopq eopqVar10 = (eopq) eoopVar.instance;
            eopqVar10.O = eqxiVar;
            eopqVar10.c |= 1024;
        }
        eoos eoosVar = eoos.EMOJI_STATUS_NA;
        eoopVar.copyOnWrite();
        eopq eopqVar11 = (eopq) eoopVar.instance;
        eopqVar11.E = eoosVar.g;
        eopqVar11.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        eoopVar.copyOnWrite();
        eopq eopqVar12 = (eopq) eoopVar.instance;
        eopqVar12.F = 12;
        eopqVar12.b |= 536870912;
        eoog eoogVar = eoog.UNKNOWN_RESEND_ATTEMPT;
        eoopVar.copyOnWrite();
        eopq eopqVar13 = (eopq) eoopVar.instance;
        eopqVar13.s = eoogVar.d;
        eopqVar13.b |= 65536;
        eooo eoooVar = eooo.WAS_RCS_CONVERSATION;
        eoopVar.copyOnWrite();
        eopq eopqVar14 = (eopq) eoopVar.instance;
        eopqVar14.u = eoooVar.d;
        eopqVar14.b |= 262144;
        eoopVar.copyOnWrite();
        eopq eopqVar15 = (eopq) eoopVar.instance;
        eopqVar15.B = 15;
        eopqVar15.b |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        epjp epjpVar = epjp.REPLY;
        eoopVar.copyOnWrite();
        eopq eopqVar16 = (eopq) eoopVar.instance;
        eopqVar16.D = epjpVar.d;
        eopqVar16.b |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_MESSAGE;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eopq eopqVar17 = (eopq) eoopVar.build();
        eopqVar17.getClass();
        eolvVar2.l = eopqVar17;
        eolvVar2.b |= 4;
        this.x.a().j(eoluVar, alal.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
    }

    public final void bi(MessageCoreData messageCoreData, int i2, int i3, int i4, int i5, int i6, eqxi eqxiVar, int i7, int i8, Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        String b = messageCoreData.B().b();
        Integer e = this.D.e(b);
        altj a = this.D.a(b);
        eowr eowrVar = (eowr) eowt.a.createBuilder();
        int d = d();
        eowrVar.copyOnWrite();
        eowt eowtVar = (eowt) eowrVar.instance;
        eowtVar.b |= 1;
        eowtVar.c = d;
        String e2 = ((alvz) this.H.b()).e();
        eowrVar.copyOnWrite();
        eowt eowtVar2 = (eowt) eowrVar.instance;
        e2.getClass();
        eowtVar2.b |= 4;
        eowtVar2.e = e2;
        eowt eowtVar3 = (eowt) eowrVar.build();
        eohv b2 = ((aljq) this.q.b()).b(i2);
        int d2 = altl.d(messageCoreData.d());
        final eoop eoopVar = (eoop) eopq.a.createBuilder();
        long b3 = ((akvz) this.p.b()).b(messageCoreData.z());
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopqVar.b |= 1073741824;
        eopqVar.G = b3;
        long t = messageCoreData.t();
        eoopVar.copyOnWrite();
        eopq eopqVar2 = (eopq) eoopVar.instance;
        eopqVar2.b |= 128;
        eopqVar2.n = t;
        eoopVar.copyOnWrite();
        eopq eopqVar3 = (eopq) eoopVar.instance;
        eopqVar3.g = d2 - 1;
        eopqVar3.b |= 1;
        eoopVar.copyOnWrite();
        eopq eopqVar4 = (eopq) eoopVar.instance;
        eopqVar4.h = i6 - 1;
        eopqVar4.b |= 2;
        eoqk a2 = ((akyw) this.r.b()).a(i2);
        eoopVar.copyOnWrite();
        eopq eopqVar5 = (eopq) eoopVar.instance;
        eopqVar5.i = a2;
        eopqVar5.b |= 4;
        String k = k(Optional.of(Integer.valueOf(i2)));
        eoopVar.copyOnWrite();
        eopq eopqVar6 = (eopq) eoopVar.instance;
        k.getClass();
        eopqVar6.c |= 1;
        eopqVar6.J = k;
        eoopVar.copyOnWrite();
        eopq eopqVar7 = (eopq) eoopVar.instance;
        eowtVar3.getClass();
        eopqVar7.y = eowtVar3;
        eopqVar7.b |= 4194304;
        int bf = bf(messageCoreData.z());
        eoopVar.copyOnWrite();
        eopq eopqVar8 = (eopq) eoopVar.instance;
        eopqVar8.x = bf - 1;
        eopqVar8.b |= 2097152;
        eoopVar.copyOnWrite();
        eopq eopqVar9 = (eopq) eoopVar.instance;
        b2.getClass();
        eopqVar9.U = b2;
        eopqVar9.c |= 65536;
        eovw eovwVar = csjc.a;
        eoopVar.copyOnWrite();
        eopq eopqVar10 = (eopq) eoopVar.instance;
        eopqVar10.N = eovwVar.x;
        eopqVar10.c |= 512;
        int i9 = true != messageCoreData.cB() ? 3 : 2;
        eoopVar.copyOnWrite();
        eopq eopqVar11 = (eopq) eoopVar.instance;
        eopqVar11.S = i9 - 1;
        eopqVar11.c |= 16384;
        eoopVar.copyOnWrite();
        eopq eopqVar12 = (eopq) eoopVar.instance;
        eopqVar12.Y = i7 - 1;
        eopqVar12.c |= 524288;
        aZ(messageCoreData, eoopVar);
        eoopVar.a(aY(messageCoreData.z()));
        if (bc(messageCoreData)) {
            optional4.ifPresent(new Consumer() { // from class: alva
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    eoop eoopVar2 = eoop.this;
                    eoopVar2.copyOnWrite();
                    eopq eopqVar13 = (eopq) eoopVar2.instance;
                    eopq eopqVar14 = eopq.a;
                    eopqVar13.aB = ((eopk) obj).e;
                    eopqVar13.d |= 65536;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        if (messageCoreData.aJ() != null) {
            fjay aJ = messageCoreData.aJ();
            aJ.getClass();
            eoopVar.copyOnWrite();
            eopq eopqVar13 = (eopq) eoopVar.instance;
            eopqVar13.o = aJ;
            eopqVar13.b |= 1024;
        }
        ((alvz) this.H.b()).j(messageCoreData, eoopVar, optional);
        optional2.ifPresent(new alts(eoopVar));
        optional3.ifPresent(new Consumer() { // from class: alvb
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                long j2 = alvq.h;
                epde epdeVar = (epde) epdi.a.createBuilder();
                epdeVar.copyOnWrite();
                epdi epdiVar = (epdi) epdeVar.instance;
                epdiVar.c = ((epdh) obj).n;
                epdiVar.b |= 1;
                epdi epdiVar2 = (epdi) epdeVar.build();
                eoop eoopVar2 = eoop.this;
                eoopVar2.copyOnWrite();
                eopq eopqVar14 = (eopq) eoopVar2.instance;
                eopq eopqVar15 = eopq.a;
                epdiVar2.getClass();
                eopqVar14.ao = epdiVar2;
                eopqVar14.d |= 8;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        eopp eoppVar = (eopp) this.I.fP(messageCoreData.O());
        eoopVar.copyOnWrite();
        eopq eopqVar14 = (eopq) eoopVar.instance;
        eopqVar14.aq = eoppVar.h;
        eopqVar14.d |= 32;
        eoog d3 = this.D.d(messageCoreData.B().b());
        eoopVar.copyOnWrite();
        eopq eopqVar15 = (eopq) eoopVar.instance;
        eopqVar15.s = d3.d;
        eopqVar15.b |= 65536;
        ((alvz) this.H.b()).h(messageCoreData, eoopVar);
        if (messageCoreData.E() != null) {
            messageCoreData.E().g(new Consumer() { // from class: alvc
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    long j2 = alvq.h;
                    String f2 = ((bdhg) obj).f();
                    eoop eoopVar2 = eoop.this;
                    eoopVar2.copyOnWrite();
                    eopq eopqVar16 = (eopq) eoopVar2.instance;
                    eopq eopqVar17 = eopq.a;
                    eopqVar16.b |= Integer.MIN_VALUE;
                    eopqVar16.H = f2;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            bb(eoopVar, messageCoreData);
        }
        ((alvz) this.H.b()).f(eoopVar, i2);
        if (bc(messageCoreData)) {
            messageCoreData.A().g(new Consumer() { // from class: alvd
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    long j2 = alvq.h;
                    String f2 = ((bdgr) obj).f();
                    eoop eoopVar2 = eoop.this;
                    eoopVar2.copyOnWrite();
                    eopq eopqVar16 = (eopq) eoopVar2.instance;
                    eopq eopqVar17 = eopq.a;
                    eopqVar16.d |= 512;
                    eopqVar16.au = f2;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        ((alvz) this.H.b()).l(eoopVar, d2, i6, i2);
        if (e != null) {
            eoks b4 = altl.b(e);
            eoopVar.copyOnWrite();
            eopq eopqVar16 = (eopq) eoopVar.instance;
            eopqVar16.r = b4.f;
            eopqVar16.b |= 16384;
            csjb a3 = i.a();
            eoks b5 = eoks.b(((eopq) eoopVar.instance).r);
            if (b5 == null) {
                b5 = eoks.UNKNOWN_BUGLE_CONVERSATION_TYPE;
            }
            a3.A("messageConversationType", b5);
            a3.r();
        }
        if (altl.d(messageCoreData.d()) == 3) {
            eoqh bd = bd(altl.c(i3), i4, i3, messageCoreData.f(), i8);
            eoopVar.copyOnWrite();
            eopq eopqVar17 = (eopq) eoopVar.instance;
            bd.getClass();
            eopqVar17.f = bd;
            eopqVar17.e = 7;
            eoqh eoqhVar = (eoqh) eopqVar17.f;
            eohv eohvVar = eopqVar17.U;
            if (eohvVar == null) {
                eohvVar = eohv.b;
            }
            bq(eoqhVar, i4, eohvVar);
        }
        if (altl.d(messageCoreData.d()) == 4) {
            eosd eosdVar = (eosd) eose.a.createBuilder();
            int f2 = messageCoreData.f();
            eosdVar.copyOnWrite();
            eose eoseVar = (eose) eosdVar.instance;
            eoseVar.b |= 1;
            eoseVar.c = f2;
            eose eoseVar2 = (eose) eosdVar.build();
            eoopVar.copyOnWrite();
            eopq eopqVar18 = (eopq) eoopVar.instance;
            eoseVar2.getClass();
            eopqVar18.f = eoseVar2;
            eopqVar18.e = 60;
        }
        if (a != null) {
            eopv k2 = ((alvz) this.H.b()).k(messageCoreData.ab(), i6);
            eoopVar.copyOnWrite();
            eopq eopqVar19 = (eopq) eoopVar.instance;
            k2.getClass();
            eopqVar19.j = k2;
            eopqVar19.b |= 8;
        }
        if (i6 == 6) {
            if (a != null) {
                eoopVar.copyOnWrite();
                eopq eopqVar20 = (eopq) eoopVar.instance;
                eopqVar20.m = a.a.J;
                eopqVar20.b |= 64;
            }
            int bg = bg(messageCoreData.ac());
            eoopVar.copyOnWrite();
            eopq eopqVar21 = (eopq) eoopVar.instance;
            eopqVar21.B = bg - 1;
            eopqVar21.b |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
            if (altl.d(messageCoreData.d()) == 2) {
                eotz eotzVar = (eotz) eouc.a.createBuilder();
                eotzVar.copyOnWrite();
                eouc eoucVar = (eouc) eotzVar.instance;
                eoucVar.b |= 1;
                eoucVar.c = i5;
                eojg eojgVar = (eojg) eojh.a.createBuilder();
                eojgVar.copyOnWrite();
                eojh eojhVar = (eojh) eojgVar.instance;
                eojhVar.b |= 1;
                eojhVar.c = i3;
                eotzVar.copyOnWrite();
                eouc eoucVar2 = (eouc) eotzVar.instance;
                eojh eojhVar2 = (eojh) eojgVar.build();
                eojhVar2.getClass();
                eoucVar2.d = eojhVar2;
                eoucVar2.b |= 2;
                eoub bk = bk(i2);
                eotzVar.copyOnWrite();
                eouc eoucVar3 = (eouc) eotzVar.instance;
                eoucVar3.e = bk.e;
                eoucVar3.b |= 4;
                eouc eoucVar4 = (eouc) eotzVar.build();
                eoopVar.copyOnWrite();
                eopq eopqVar22 = (eopq) eoopVar.instance;
                eoucVar4.getClass();
                eopqVar22.f = eoucVar4;
                eopqVar22.e = 41;
                eouc eoucVar5 = (eouc) eopqVar22.f;
                eohv eohvVar2 = eopqVar22.U;
                if (eohvVar2 == null) {
                    eohvVar2 = eohv.b;
                }
                bt(eoucVar5, eohvVar2);
            }
        }
        if (eqxiVar != null) {
            eoopVar.copyOnWrite();
            eopq eopqVar23 = (eopq) eoopVar.instance;
            eopqVar23.O = eqxiVar;
            eopqVar23.c |= 1024;
        }
        ((algq) this.E.b()).a(eoopVar, messageCoreData, e != null ? e.intValue() : 0);
        ((alvz) this.H.b()).g(eoopVar);
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_MESSAGE;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eopq eopqVar24 = (eopq) eoopVar.build();
        eopqVar24.getClass();
        eolvVar2.l = eopqVar24;
        eolvVar2.b |= 4;
        this.x.a().j(eoluVar, alal.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
        alqf alqfVar = (alqf) this.L.b();
        emau.a(ffsl.b(ekxi.a(alqfVar.b.hT())), alqfVar.c, new alpl(null, alqfVar, alqfVar.d.a()));
    }

    public final void bj(MessageCoreData messageCoreData, int i2, eqyl eqylVar, int i3, int i4) {
        eooi eooiVar;
        if (!this.y.get()) {
            r();
            return;
        }
        if (messageCoreData == null || messageCoreData.E().i()) {
            return;
        }
        this.D.f(messageCoreData);
        String b = messageCoreData.B().b();
        altj a = this.D.a(b);
        eoul eoulVar = (eoul) eoum.a.createBuilder();
        long epochMilli = this.u.f().toEpochMilli();
        eoulVar.copyOnWrite();
        eoum eoumVar = (eoum) eoulVar.instance;
        eoumVar.b |= 1;
        eoumVar.c = epochMilli;
        long r = eoumVar.d - messageCoreData.r();
        eoulVar.copyOnWrite();
        eoum eoumVar2 = (eoum) eoulVar.instance;
        eoumVar2.b |= 2;
        eoumVar2.d = r;
        eowr eowrVar = (eowr) eowt.a.createBuilder();
        int d = d();
        eowrVar.copyOnWrite();
        eowt eowtVar = (eowt) eowrVar.instance;
        eowtVar.b |= 1;
        eowtVar.c = d;
        String e = ((alvz) this.H.b()).e();
        eowrVar.copyOnWrite();
        eowt eowtVar2 = (eowt) eowrVar.instance;
        e.getClass();
        eowtVar2.b |= 4;
        eowtVar2.e = e;
        eowt eowtVar3 = (eowt) eowrVar.build();
        eqwf aX = aX(i3);
        final eoop eoopVar = (eoop) eopq.a.createBuilder();
        long t = messageCoreData.t();
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopqVar.b |= 128;
        eopqVar.n = t;
        long b2 = ((akvz) this.p.b()).b(messageCoreData.z());
        eoopVar.copyOnWrite();
        eopq eopqVar2 = (eopq) eoopVar.instance;
        eopqVar2.b |= 1073741824;
        eopqVar2.G = b2;
        eooo eoooVar = eooo.WAS_RCS_CONVERSATION;
        eoopVar.copyOnWrite();
        eopq eopqVar3 = (eopq) eoopVar.instance;
        eopqVar3.u = eoooVar.d;
        eopqVar3.b |= 262144;
        eoopVar.copyOnWrite();
        eopq eopqVar4 = (eopq) eoopVar.instance;
        eopqVar4.h = 11;
        eopqVar4.b |= 2;
        eoopVar.copyOnWrite();
        eopq eopqVar5 = (eopq) eoopVar.instance;
        eopqVar5.av = i4 - 1;
        eopqVar5.d |= 1024;
        int d2 = altl.d(i2);
        eoopVar.copyOnWrite();
        eopq eopqVar6 = (eopq) eoopVar.instance;
        eopqVar6.g = d2 - 1;
        eopqVar6.b |= 1;
        eoopVar.copyOnWrite();
        eopq eopqVar7 = (eopq) eoopVar.instance;
        eoum eoumVar3 = (eoum) eoulVar.build();
        eoumVar3.getClass();
        eopqVar7.k = eoumVar3;
        eopqVar7.b |= 16;
        eopv k = ((alvz) this.H.b()).k(messageCoreData.ab(), 12);
        eoopVar.copyOnWrite();
        eopq eopqVar8 = (eopq) eoopVar.instance;
        k.getClass();
        eopqVar8.j = k;
        eopqVar8.b |= 8;
        eoqk a2 = ((akyw) this.r.b()).a(i3);
        eoopVar.copyOnWrite();
        eopq eopqVar9 = (eopq) eoopVar.instance;
        eopqVar9.i = a2;
        eopqVar9.b |= 4;
        String k2 = k(Optional.of(Integer.valueOf(i3)));
        eoopVar.copyOnWrite();
        eopq eopqVar10 = (eopq) eoopVar.instance;
        k2.getClass();
        eopqVar10.c |= 1;
        eopqVar10.J = k2;
        eonv b3 = this.D.b(b);
        eoopVar.copyOnWrite();
        eopq eopqVar11 = (eopq) eoopVar.instance;
        eopqVar11.t = b3.d;
        eopqVar11.b |= 131072;
        eooe c = this.D.c(b);
        eoopVar.copyOnWrite();
        eopq eopqVar12 = (eopq) eoopVar.instance;
        eopqVar12.v = c.p;
        eopqVar12.b |= 524288;
        eoopVar.copyOnWrite();
        eopq eopqVar13 = (eopq) eoopVar.instance;
        eopqVar13.w = aX.N;
        eopqVar13.b |= 1048576;
        eoopVar.copyOnWrite();
        eopq eopqVar14 = (eopq) eoopVar.instance;
        eowtVar3.getClass();
        eopqVar14.y = eowtVar3;
        eopqVar14.b |= 4194304;
        int bf = bf(messageCoreData.z());
        eoopVar.copyOnWrite();
        eopq eopqVar15 = (eopq) eoopVar.instance;
        eopqVar15.x = bf - 1;
        eopqVar15.b |= 2097152;
        int f2 = ((cttn) this.Y.b()).f();
        eoopVar.copyOnWrite();
        eopq eopqVar16 = (eopq) eoopVar.instance;
        eopqVar16.A = f2 - 1;
        eopqVar16.b |= 16777216;
        eovw eovwVar = csjc.a;
        eoopVar.copyOnWrite();
        eopq eopqVar17 = (eopq) eoopVar.instance;
        eopqVar17.N = eovwVar.x;
        eopqVar17.c |= 512;
        int i5 = true != messageCoreData.cB() ? 3 : 2;
        eoopVar.copyOnWrite();
        eopq eopqVar18 = (eopq) eoopVar.instance;
        eopqVar18.S = i5 - 1;
        eopqVar18.c |= 16384;
        eoopVar.copyOnWrite();
        eopq eopqVar19 = (eopq) eoopVar.instance;
        eopqVar19.aa = eqylVar.h;
        eopqVar19.c |= 2097152;
        aZ(messageCoreData, eoopVar);
        if (a != null && (eooiVar = a.a) != null) {
            eoopVar.copyOnWrite();
            eopq eopqVar20 = (eopq) eoopVar.instance;
            eopqVar20.m = eooiVar.J;
            eopqVar20.b |= 64;
        }
        ((alvz) this.H.b()).h(messageCoreData, eoopVar);
        messageCoreData.E().g(new Consumer() { // from class: alum
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                long j2 = alvq.h;
                String f3 = ((bdhg) obj).f();
                eoop eoopVar2 = eoop.this;
                eoopVar2.copyOnWrite();
                eopq eopqVar21 = (eopq) eoopVar2.instance;
                eopq eopqVar22 = eopq.a;
                eopqVar21.b |= Integer.MIN_VALUE;
                eopqVar21.H = f3;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_MESSAGE;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eopq eopqVar21 = (eopq) eoopVar.build();
        eopqVar21.getClass();
        eolvVar2.l = eopqVar21;
        eolvVar2.b |= 4;
        this.x.a().j(eoluVar, alal.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
    }

    @Override // defpackage.dkpi
    public final void c(eyyd eyydVar) {
        if (((Boolean) g.e()).booleanValue()) {
            return;
        }
        ekzm b = this.aj.b("UsageStatistics dispatchSubChangedEvent");
        try {
            if (this.y.get()) {
                eolu eoluVar = (eolu) eolv.a.createBuilder();
                eolt eoltVar = eolt.BUGLE_TELEPHONY_EVENT;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                eolvVar.j = eoltVar.dk;
                eolvVar.b |= 1;
                eyye eyyeVar = (eyye) eyyf.a.createBuilder();
                eyyeVar.copyOnWrite();
                eyyf eyyfVar = (eyyf) eyyeVar.instance;
                eyydVar.getClass();
                eyyfVar.c = eyydVar;
                eyyfVar.b = 4;
                eoluVar.copyOnWrite();
                eolv eolvVar2 = (eolv) eoluVar.instance;
                eyyf eyyfVar2 = (eyyf) eyyeVar.build();
                eyyfVar2.getClass();
                eolvVar2.A = eyyfVar2;
                eolvVar2.b |= 1048576;
                this.w.j(eoluVar);
            } else {
                r();
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.altk
    public final int d() {
        return ((Integer) ((alvz) this.H.b()).d().map(new Function() { // from class: aluf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                long j2 = alvq.h;
                return Integer.valueOf(((PackageInfo) obj).versionCode);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(-1)).intValue();
    }

    @Override // defpackage.altk
    public final alsa e() {
        if (this.y.get()) {
            return (alsa) this.ai.b();
        }
        return null;
    }

    @Override // defpackage.altk
    public final BackgroundLoadingMessageUsageStatisticsData f(Callable callable, eooi eooiVar) {
        elfl g2 = elfo.g(callable, this.B);
        g2.getClass();
        eooiVar.getClass();
        ffsk ffskVar = (ffsk) this.al.a.b();
        ffskVar.getClass();
        return new BackgroundLoadingMessageUsageStatisticsData(g2, eooiVar, ffskVar);
    }

    @Override // defpackage.altk
    public final elfl g() {
        return elfo.g(new Callable() { // from class: alto
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ((alvz) alvq.this.H.b()).d().map(new Function() { // from class: alvn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        long j2 = alvq.h;
                        return ((PackageInfo) obj).versionName;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, this.A);
    }

    @Override // defpackage.altk
    public final eoux h(long j2) {
        return j2 <= a ? eoux.EVENT_AGE_WITHIN_1_DAY : j2 <= b ? eoux.EVENT_AGE_1_TO_7_DAYS : j2 <= c ? eoux.EVENT_AGE_7_TO_28_DAYS : eoux.EVENT_AGE_MORE_THAN_28_DAYS;
    }

    @Override // defpackage.altk
    public final eoux i(String str) {
        return h(this.u.f().toEpochMilli() - ((ctyx) this.U.b()).e(str, -1L));
    }

    @Override // defpackage.altk
    public final ListenableFuture j() {
        return this.C.h(new emwl() { // from class: alus
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                long j2 = alvq.h;
                eoul eoulVar = (eoul) eoum.a.createBuilder();
                long longValue = ((Long) obj).longValue();
                eoulVar.copyOnWrite();
                eoum eoumVar = (eoum) eoulVar.instance;
                eoumVar.b |= 1;
                eoumVar.c = longValue;
                return (eoum) eoulVar.build();
            }
        }, erpp.a);
    }

    @Override // defpackage.altk
    public final String k(Optional optional) {
        ImsConfiguration n;
        if (optional.isEmpty()) {
            ensk j2 = j.j();
            j2.Y(ente.a, "BugleUsageStatistics");
            enrr enrrVar = (enrr) j2;
            enrrVar.aa(ensy.MEDIUM);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "getPcscfAddress", 4075, "UsageStatisticsImpl.java")).q("Unable to retrieve the RCS Config, unexpected empty subId");
            return "NOT_AVAILABLE";
        }
        Optional l = ((djry) this.aq.b()).l(((Integer) optional.get()).intValue());
        if (!l.isEmpty() && (n = ((djtp) l.get()).n()) != null) {
            String str = n.mPcscfAddress;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "NOT_AVAILABLE";
    }

    @Override // defpackage.altk
    public final void l() {
        ffbr ffbrVar = this.ai;
        efbd.b();
        boolean b = ((alwa) this.ag.b()).b();
        if (b) {
            this.w = (akxl) this.Q.b();
            this.x = (akyb) this.R.b();
            this.ai = ffbrVar;
            algm algmVar = (algm) this.z.b();
            final Function function = new Function() { // from class: alui
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function2) {
                    return Function$CC.$default$andThen(this, function2);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Long l = (Long) obj;
                    if (l.longValue() <= 0) {
                        long epochMilli = alvq.this.u.f().toEpochMilli();
                        csjb a = alvq.i.a();
                        a.I(a.s(epochMilli, "Setting the time of the first use of the app to"));
                        a.r();
                        return Optional.of(Long.valueOf(epochMilli));
                    }
                    csjb a2 = alvq.i.a();
                    a2.I("Time of the first use of the app.");
                    a2.I(l);
                    a2.r();
                    return Optional.empty();
                }

                public final /* synthetic */ Function compose(Function function2) {
                    return Function$CC.$default$compose(this, function2);
                }
            };
            this.C = elfl.g(algmVar.a.b(eldl.a(new emwl() { // from class: alfx
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    Object apply;
                    final alfi alfiVar = (alfi) obj;
                    int i2 = algm.d;
                    apply = Function.this.apply(Long.valueOf(alfiVar.d));
                    return (alfi) ((Optional) apply).map(new Function() { // from class: algb
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function2) {
                            return Function$CC.$default$andThen(this, function2);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            int i3 = algm.d;
                            alfh alfhVar = (alfh) alfi.this.toBuilder();
                            long longValue = ((Long) obj2).longValue();
                            alfhVar.copyOnWrite();
                            alfi alfiVar2 = (alfi) alfhVar.instance;
                            alfiVar2.b |= 2;
                            alfiVar2.d = longValue;
                            return (alfi) alfhVar.build();
                        }

                        public final /* synthetic */ Function compose(Function function2) {
                            return Function$CC.$default$compose(this, function2);
                        }
                    }).orElse(alfiVar);
                }
            }), erpp.a)).i(new eroh() { // from class: aluj
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return ((algm) alvq.this.z.b()).c();
                }
            }, erpp.a);
        }
        this.y.set(b);
    }

    @Override // defpackage.altk
    public final void m(eoiv eoivVar) {
        if (!this.y.get()) {
            r();
            return;
        }
        csjb c = i.c();
        c.I("app created");
        c.A("openCause", eoivVar);
        c.r();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoiw eoiwVar = (eoiw) eoix.a.createBuilder();
        eoiwVar.copyOnWrite();
        eoix eoixVar = (eoix) eoiwVar.instance;
        eoixVar.c = eoivVar.l;
        eoixVar.b |= 2;
        eovw eovwVar = csjc.a;
        eoiwVar.copyOnWrite();
        eoix eoixVar2 = (eoix) eoiwVar.instance;
        eoixVar2.d = eovwVar.x;
        eoixVar2.b |= 64;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eoix eoixVar3 = (eoix) eoiwVar.build();
        eoixVar3.getClass();
        eolvVar.k = eoixVar3;
        eolvVar.b |= 2;
        eolt eoltVar = eolt.BUGLE_APP;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eolvVar2.j = eoltVar.dk;
        eolvVar2.b |= 1;
        this.w.j(eoluVar);
    }

    @Override // defpackage.altk
    public final void n(long j2) {
        if (!this.y.get()) {
            r();
        } else {
            ((ctyx) this.U.b()).k("total_millis_spent", ((ctyx) this.U.b()).e("total_millis_spent", 0L) + j2);
        }
    }

    @Override // defpackage.altk
    public final void o(boolean z, boolean z2) {
        if (!this.y.get()) {
            r();
            return;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_APP_CONFIGURATION;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoiy eoiyVar = (eoiy) eojb.a.createBuilder();
        int i2 = true != z ? 3 : 2;
        eoiyVar.copyOnWrite();
        eojb eojbVar = (eojb) eoiyVar.instance;
        eojbVar.c = i2 - 1;
        eojbVar.b |= 1;
        int i3 = true == z2 ? 2 : 3;
        eoiyVar.copyOnWrite();
        eojb eojbVar2 = (eojb) eoiyVar.instance;
        eojbVar2.d = i3 - 1;
        eojbVar2.b |= 2;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eojb eojbVar3 = (eojb) eoiyVar.build();
        eojbVar3.getClass();
        eolvVar2.x = eojbVar3;
        eolvVar2.b |= 65536;
        this.w.j(eoluVar);
    }

    @Override // defpackage.altk
    @Deprecated
    public final void p(String str, int i2, String str2, String str3, byzi byziVar) {
        bv(str, i2, str2, 3, str3, byziVar);
    }

    @Override // defpackage.altk
    @Deprecated
    public final void q(String str, int i2, String str2, String str3, byzi byziVar) {
        bv(str, i2, str2, 2, str3, byziVar);
    }

    @Override // defpackage.altk
    public final void r() {
        ((alwa) this.ag.b()).a();
    }

    @Override // defpackage.altk
    public final void s(final ConversationIdType conversationIdType, final eoko eokoVar, final int i2) {
        axos.a(new Runnable() { // from class: alvm
            @Override // java.lang.Runnable
            public final void run() {
                ekzz f2 = eleg.f("UsageStatisticsImpl#logConversationClicked");
                int i3 = i2;
                final eoko eokoVar2 = eokoVar;
                final ConversationIdType conversationIdType2 = conversationIdType;
                final alvq alvqVar = alvq.this;
                try {
                    if (alvqVar.y.get()) {
                        boolean R = ((bdmq) alvqVar.n.b()).R(conversationIdType2);
                        ekzz f3 = eleg.f("MessageDatabaseOperations#getConversationHasDraftMessage");
                        try {
                            buxo d = MessagesTable.d();
                            d.z("getConversationHasDraftMessage");
                            d.h(new Function() { // from class: bdkx
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    buxz buxzVar = (buxz) obj;
                                    cskc cskcVar = bdmq.a;
                                    buxzVar.af(3);
                                    buxzVar.m(ConversationIdType.this);
                                    return buxzVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            boolean T = d.b().T();
                            f3.close();
                            final eokv eokvVar = (eokv) eokw.a.createBuilder();
                            long b = ((akvz) alvqVar.p.b()).b(conversationIdType2);
                            eokvVar.copyOnWrite();
                            eokw eokwVar = (eokw) eokvVar.instance;
                            eokwVar.b |= 65536;
                            eokwVar.r = b;
                            eokvVar.copyOnWrite();
                            eokw eokwVar2 = (eokw) eokvVar.instance;
                            eokwVar2.e = 4;
                            eokwVar2.b |= 1;
                            eokvVar.copyOnWrite();
                            eokw eokwVar3 = (eokw) eokvVar.instance;
                            eokwVar3.f = eokoVar2.u;
                            eokwVar3.b |= 2;
                            eokvVar.copyOnWrite();
                            eokw eokwVar4 = (eokw) eokvVar.instance;
                            eokwVar4.b |= 4194304;
                            eokwVar4.w = i3;
                            eokvVar.copyOnWrite();
                            eokw eokwVar5 = (eokw) eokvVar.instance;
                            eokwVar5.b |= 32;
                            eokwVar5.i = R;
                            eokvVar.copyOnWrite();
                            eokw eokwVar6 = (eokw) eokvVar.instance;
                            eokwVar6.b |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
                            eokwVar6.z = T;
                            elfl e = elfo.e(null);
                            if (((Optional) alvqVar.F.b()).isPresent()) {
                                e = ((aexv) ((Optional) alvqVar.F.b()).get()).a(eokvVar, conversationIdType2);
                            }
                            axnw.h(e.h(new emwl() { // from class: aluk
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    eolv aW = alvq.aW((eokw) eokvVar.build());
                                    csjb c = alvq.i.c();
                                    c.A("ConversationClicked Conversation Origin", eokoVar2);
                                    c.r();
                                    alvq.this.w.j((eolu) aW.toBuilder());
                                    return null;
                                }
                            }, alvqVar.A));
                        } finally {
                        }
                    } else {
                        alvqVar.r();
                    }
                    f2.close();
                } catch (Throwable th) {
                    try {
                        f2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, this.A);
    }

    @Override // defpackage.altk
    @Deprecated
    public final void t(eokw eokwVar, ConversationIdType conversationIdType, final eoko eokoVar, boolean z, byyt byytVar) {
        if (!this.y.get()) {
            r();
            return;
        }
        final eokv eokvVar = (eokv) eokwVar.toBuilder();
        long b = ((akvz) this.p.b()).b(conversationIdType);
        eokvVar.copyOnWrite();
        eokw eokwVar2 = (eokw) eokvVar.instance;
        eokwVar2.b |= 65536;
        eokwVar2.r = b;
        eokvVar.copyOnWrite();
        eokw eokwVar3 = (eokw) eokvVar.instance;
        eokwVar3.e = 3;
        eokwVar3.b |= 1;
        eokvVar.copyOnWrite();
        eokw eokwVar4 = (eokw) eokvVar.instance;
        eokwVar4.f = eokoVar.u;
        eokwVar4.b |= 2;
        int i2 = byyt.i(byytVar);
        eokvVar.copyOnWrite();
        eokw eokwVar5 = (eokw) eokvVar.instance;
        eokwVar5.C = epuz.a(i2);
        eokwVar5.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        eokvVar.copyOnWrite();
        eokw eokwVar6 = (eokw) eokvVar.instance;
        eokwVar6.b |= 32;
        eokwVar6.i = z;
        ffbr ffbrVar = this.F;
        elfl e = elfo.e(null);
        if (((Optional) ffbrVar.b()).isPresent()) {
            e = ((aexv) ((Optional) this.F.b()).get()).a(eokvVar, conversationIdType);
        }
        axnw.h(e.h(new emwl() { // from class: altr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eolv aW = alvq.aW((eokw) eokvVar.build());
                csjb c = alvq.i.c();
                c.A("ConversationDeleted Conversation Origin", eokoVar);
                c.r();
                alvq.this.w.j((eolu) aW.toBuilder());
                return null;
            }
        }, this.A));
    }

    @Override // defpackage.altk
    public final void u(ConversationIdType conversationIdType, eokl eoklVar) {
        if (!this.y.get()) {
            r();
            return;
        }
        eokv eokvVar = (eokv) eokw.a.createBuilder();
        eokvVar.copyOnWrite();
        eokw eokwVar = (eokw) eokvVar.instance;
        eokwVar.x = 2;
        eokwVar.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        eokvVar.copyOnWrite();
        eokw eokwVar2 = (eokw) eokvVar.instance;
        eokwVar2.d = Integer.valueOf(eoklVar.k);
        eokwVar2.c = 28;
        bn(eokvVar, conversationIdType);
    }

    @Override // defpackage.altk
    public final void v(boolean z, boolean z2) {
        if (!this.y.get()) {
            r();
            return;
        }
        csjb a = i.a();
        a.I("Default SMS app changed.");
        a.B("beforeState", z);
        a.B("currentState", z2);
        a.r();
        final eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_SETTING;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        final eotl eotlVar = (eotl) eotm.a.createBuilder();
        final eolj eoljVar = (eolj) eolk.a.createBuilder();
        eoljVar.copyOnWrite();
        eolk eolkVar = (eolk) eoljVar.instance;
        eolkVar.b |= 1;
        eolkVar.c = z;
        eoljVar.copyOnWrite();
        eolk eolkVar2 = (eolk) eoljVar.instance;
        eolkVar2.b |= 2;
        eolkVar2.d = z2;
        final long epochMilli = this.u.f().toEpochMilli();
        csvs.c(elfl.g(elfo.m(this.C).a(new Callable() { // from class: alul
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(epochMilli - ((Long) erqt.q(alvq.this.C)).longValue() < alvq.h);
            }
        }, this.af)).h(new emwl() { // from class: altz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                eolj eoljVar2 = eoljVar;
                eoljVar2.copyOnWrite();
                eolk eolkVar3 = (eolk) eoljVar2.instance;
                eolk eolkVar4 = eolk.a;
                eolkVar3.b |= 4;
                eolkVar3.e = booleanValue;
                eotl eotlVar2 = eotlVar;
                eotlVar2.copyOnWrite();
                eotm eotmVar = (eotm) eotlVar2.instance;
                eolk eolkVar5 = (eolk) eoljVar2.build();
                eotm eotmVar2 = eotm.a;
                eolkVar5.getClass();
                eotmVar.c = eolkVar5;
                eotmVar.b |= 2;
                eolu eoluVar2 = eoluVar;
                eoluVar2.copyOnWrite();
                eolv eolvVar2 = (eolv) eoluVar2.instance;
                eotm eotmVar3 = (eotm) eotlVar2.build();
                eolv eolvVar3 = eolv.a;
                eotmVar3.getClass();
                eolvVar2.p = eotmVar3;
                eolvVar2.b |= 64;
                alvq.this.w.j(eoluVar2);
                return null;
            }
        }, this.A), "BugleUsageStatistics", "Failed to update logDefaultSmsAppChange");
    }

    @Override // defpackage.altk
    public final void w(String str, eumg eumgVar) {
        if (this.y.get()) {
            ((eeui) this.l.b()).a(str, eumgVar);
        } else {
            r();
        }
    }

    @Override // defpackage.altk
    public final void x(long j2, boolean z) {
        if (!this.y.get()) {
            r();
            return;
        }
        eoib eoibVar = (eoib) eoid.a.createBuilder();
        eoibVar.copyOnWrite();
        eoid eoidVar = (eoid) eoibVar.instance;
        eoidVar.b |= 1;
        eoidVar.c = j2;
        int i2 = true != z ? 2 : 3;
        eoibVar.copyOnWrite();
        eoid eoidVar2 = (eoid) eoibVar.instance;
        eoidVar2.d = i2 - 1;
        eoidVar2.b = 2 | eoidVar2.b;
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_BLOCK_FILE_ATTACH;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eoid eoidVar3 = (eoid) eoibVar.build();
        eoidVar3.getClass();
        eolvVar2.J = eoidVar3;
        eolvVar2.c |= 8;
        this.w.j(eoluVar);
        ((akzt) this.T.b()).c("Bugle.Share.FileAttachmentPicker.ResultAborted");
    }

    @Override // defpackage.altk
    public final void y() {
        ((akzt) this.T.b()).c("Bugle.Share.FileAttachmentPicker.ExitedWithoutSelection");
    }

    @Override // defpackage.altk
    public final void z() {
        if (this.y.get()) {
            ((akzt) this.T.b()).e("Bugle.Rcs.Onboarding.Boew.Outcome.Counts", ((ctyz) this.V.b()).s() - 1);
        } else {
            r();
        }
    }
}

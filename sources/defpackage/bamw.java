package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bamw implements bakw {
    public final aqkp A;
    public final Action B;
    public final bbcg C;
    private final cqoh E;
    private final cpdg F;
    private final ffbr G;
    private final bdxd H;
    private final Optional I;
    private final ffbr J;
    private final albq K;
    private final cubr L;
    private final ffbr M;
    private final covo N;
    private final baam O;
    private final bbfw P;
    private final cbgf Q;
    private final bdvi R;
    private final dtuu S;
    private final csrv T;
    private final coxg U;
    private final cbut V;
    private final cncp W;
    private final alkw X;
    private final Optional Y;
    private final ffbr Z;
    private final ffbr aA;
    private final ffbr aB;
    private final ffbr aC;
    private final ffbr aD;
    private final bauj aE;
    private final ffhd aa;
    private final ffbr ab;
    private final ffbr ac;
    private final fazb ad;
    private final ffbr ae;
    private final ecrj af;
    private final ffbr ag;
    private final ffbr ah;
    private final ffbr ai;
    private final ffbr aj;
    private final ffbr ak;
    private final ffbr al;
    private final aslt am;
    private final ffbr an;
    private final ffbr ao;
    private final ffbr ap;
    private final ffbr aq;
    private final ffbr ar;
    private final ffbr as;
    private final ffbr at;
    private final ffbr au;
    private final ffbr av;
    private final ffbr aw;
    private final ffbr ax;
    private final azei ay;
    private final asmg az;
    public final Context c;
    public final covr d;
    public final cbvt e;
    public final altk f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final coxk m;
    public final bdtd n;
    public final covp o;
    public final baim p;
    public final bcwz q;
    public final ffbr r;
    public final ffbr s;
    public final ffsk t;
    public final ffsk u;
    public final ffhd v;
    public final ffbr w;
    public final ffbr x;
    public final ffbr y;
    public final ffbr z;
    public static final cskc a = cskc.g("BugleDataModel", "ProcessDownloadedMmsAction");
    public static final entd b = entd.c("Bugle");
    private static final entd D = entd.c("BugleNotifications");

    public bamw(Context context, cqoh cqohVar, covr covrVar, cpdg cpdgVar, ffbr ffbrVar, bdxd bdxdVar, Optional optional, cbvt cbvtVar, altk altkVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, albq albqVar, cubr cubrVar, ffbr ffbrVar8, coxk coxkVar, ffbr ffbrVar9, bdtd bdtdVar, covo covoVar, baam baamVar, covp covpVar, bbfw bbfwVar, cbgf cbgfVar, bdvi bdviVar, dtuu dtuuVar, bauj baujVar, baim baimVar, bcwz bcwzVar, csrv csrvVar, coxg coxgVar, cbut cbutVar, cncp cncpVar, alkw alkwVar, ffbr ffbrVar10, Optional optional2, ffbr ffbrVar11, ffbr ffbrVar12, ffsk ffskVar, ffsk ffskVar2, ffhd ffhdVar, ffhd ffhdVar2, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, fazb fazbVar, ffbr ffbrVar17, ecrj ecrjVar, ffbr ffbrVar18, ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21, ffbr ffbrVar22, ffbr ffbrVar23, ffbr ffbrVar24, ffbr ffbrVar25, aslt asltVar, ffbr ffbrVar26, ffbr ffbrVar27, ffbr ffbrVar28, ffbr ffbrVar29, ffbr ffbrVar30, ffbr ffbrVar31, ffbr ffbrVar32, ffbr ffbrVar33, ffbr ffbrVar34, ffbr ffbrVar35, ffbr ffbrVar36, azei azeiVar, aqkp aqkpVar, asmg asmgVar, ffbr ffbrVar37, ffbr ffbrVar38, ffbr ffbrVar39, ffbr ffbrVar40, Action action) {
        this.c = context;
        this.E = cqohVar;
        this.d = covrVar;
        this.F = cpdgVar;
        this.G = ffbrVar;
        this.H = bdxdVar;
        this.I = optional;
        this.e = cbvtVar;
        this.f = altkVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.i = ffbrVar4;
        this.j = ffbrVar5;
        this.k = ffbrVar6;
        this.J = ffbrVar7;
        this.K = albqVar;
        this.L = cubrVar;
        this.l = ffbrVar8;
        this.m = coxkVar;
        this.M = ffbrVar9;
        this.n = bdtdVar;
        this.N = covoVar;
        this.O = baamVar;
        this.o = covpVar;
        this.P = bbfwVar;
        this.Q = cbgfVar;
        this.R = bdviVar;
        this.S = dtuuVar;
        this.aE = baujVar;
        this.p = baimVar;
        this.q = bcwzVar;
        this.T = csrvVar;
        this.U = coxgVar;
        this.V = cbutVar;
        this.W = cncpVar;
        this.X = alkwVar;
        this.r = ffbrVar10;
        this.Y = optional2;
        this.s = ffbrVar11;
        this.Z = ffbrVar12;
        this.t = ffskVar;
        this.u = ffskVar2;
        this.v = ffhdVar;
        this.aa = ffhdVar2;
        this.w = ffbrVar13;
        this.x = ffbrVar14;
        this.ab = ffbrVar15;
        this.ac = ffbrVar16;
        this.ad = fazbVar;
        this.ae = ffbrVar17;
        this.af = ecrjVar;
        this.y = ffbrVar18;
        this.ag = ffbrVar19;
        this.ah = ffbrVar20;
        this.ai = ffbrVar21;
        this.aj = ffbrVar22;
        this.ak = ffbrVar23;
        this.al = ffbrVar24;
        this.z = ffbrVar25;
        this.am = asltVar;
        this.an = ffbrVar26;
        this.ao = ffbrVar27;
        this.ap = ffbrVar28;
        this.aq = ffbrVar29;
        this.ar = ffbrVar30;
        this.as = ffbrVar31;
        this.at = ffbrVar32;
        this.au = ffbrVar33;
        this.av = ffbrVar34;
        this.aw = ffbrVar35;
        this.ax = ffbrVar36;
        this.ay = azeiVar;
        this.A = aqkpVar;
        this.az = asmgVar;
        this.aA = ffbrVar37;
        this.aB = ffbrVar38;
        this.aC = ffbrVar39;
        this.aD = ffbrVar40;
        this.B = action;
        bbcg bbcgVar = action.t;
        bbcgVar.getClass();
        this.C = bbcgVar;
    }

    public static final cfup c() {
        return cfvl.i(cfvl.b, "bug_193237225_use_lightweight_scope", false);
    }

    private final enip p(String str) {
        enip e = this.m.v(Uri.parse(str)).e();
        e.getClass();
        if (!e.isEmpty()) {
            return e;
        }
        ((ensz) b.j()).q("Received MMS without any recipients, using unknown.");
        return new enpx("ʼUNKNOWN_SENDER!ʼ");
    }

    private final enip q(String str) {
        enip e = this.m.v(Uri.parse(str)).e();
        e.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(e, 10));
        Iterator<E> it = e.iterator();
        while (it.hasNext()) {
            arrayList.add(((aolr) this.r.b()).n((String) it.next()));
        }
        enip f = engq.f(arrayList);
        if (!f.isEmpty()) {
            return f;
        }
        ((ensz) b.j()).q("Received MMS without any recipients, using unknown.");
        return new enpx(((aolr) this.r.b()).f());
    }

    private final Object r(int i, int i2, Uri uri, long j, int i3, ffgu ffguVar) {
        return ((Boolean) ayhv.a.e()).booleanValue() ? j(i, i2, uri, j, i3, ffguVar) : k(i, i2, uri, j, i3, ffguVar);
    }

    private final Object s(engw engwVar, ffgu ffguVar) {
        return l(Optional.of(engwVar), ffguVar);
    }

    private final ffcf t() {
        return new ffcf(bdhb.b(this.C.l("message_id")), bdgq.b(this.C.l("conversation_id")));
    }

    private final void u(byzb byzbVar, enip enipVar, engr engrVar) {
        enqu listIterator = enipVar.listIterator();
        listIterator.getClass();
        while (listIterator.hasNext()) {
            engrVar.h(new bdjf(byzbVar, (String) listIterator.next()));
        }
    }

    private final void v(MessageIdType messageIdType, int i) {
        alkf alkfVar = (alkf) alkg.a.createBuilder();
        alkfVar.copyOnWrite();
        alkg alkgVar = (alkg) alkfVar.instance;
        alkgVar.c = 2;
        alkgVar.b |= 1;
        eoqa eoqaVar = (eoqa) eoqb.a.createBuilder();
        String b2 = messageIdType.b();
        eoqaVar.copyOnWrite();
        eoqb eoqbVar = (eoqb) eoqaVar.instance;
        b2.getClass();
        eoqbVar.b |= 1;
        eoqbVar.c = b2;
        alkfVar.copyOnWrite();
        alkg alkgVar2 = (alkg) alkfVar.instance;
        eoqb eoqbVar2 = (eoqb) eoqaVar.build();
        eoqbVar2.getClass();
        alkgVar2.d = eoqbVar2;
        alkgVar2.b |= 2;
        alkfVar.copyOnWrite();
        alkg alkgVar3 = (alkg) alkfVar.instance;
        alkgVar3.b |= 4;
        alkgVar3.e = i;
        int a2 = this.C.a("result_code");
        alkfVar.copyOnWrite();
        alkg alkgVar4 = (alkg) alkfVar.instance;
        alkgVar4.b |= 16;
        alkgVar4.g = a2;
        int a3 = this.C.a("mms_last_connection_failure_cause_code");
        alkfVar.copyOnWrite();
        alkg alkgVar5 = (alkg) alkfVar.instance;
        alkgVar5.b |= 64;
        alkgVar5.i = a3;
        this.X.e((alkg) alkfVar.build());
    }

    private final void w(bakx bakxVar) {
        MessageCoreData e;
        if (bakxVar.d() != null) {
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("read", Boolean.valueOf(bakxVar.k()));
            akzw b2 = this.K.b("Bugle.Telephony.Update.Mms.Read.Latency");
            cgsx.b(bakxVar.c().getContentResolver(), bakxVar.d(), contentValues, null, null);
            b2.c();
        }
        if (!bakxVar.m().b() && (e = bakxVar.e()) != null && !e.cF()) {
            ((ensz) D.h()).q("Creating notification from ProcessDownloadedMmsAsyncAction");
            if (((asqe) this.aA.b()).a() || bakxVar.j()) {
                ((cjbc) this.ag.b()).b(bakxVar.m(), Duration.ofMillis(bakxVar.b()), false);
            } else {
                ((cjdh) this.aq.b()).a(new BugleConversationId(bakxVar.m()));
            }
        }
        ((cisl) this.ap.b()).b();
        final ConversationIdType m = bakxVar.m();
        if (!m.b()) {
            this.Q.l(m, bakxVar.h(), new String[0]);
            if (((cttn) this.M.b()).b() && !m.b()) {
                String[] strArr = btki.a;
                btik btikVar = new btik();
                btikVar.c(1);
                btikVar.b(bakxVar.h().b());
                btikVar.d(2);
                final btih a2 = btikVar.a();
                final dtve b3 = btki.b();
                dtub.b(btki.b(), "generic_worker_queue", a2, new Function() { // from class: btic
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(dtve.this.S("generic_worker_queue", (ContentValues) obj));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Consumer() { // from class: btid
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        final Long l = (Long) obj;
                        if (l.longValue() >= 0) {
                            btih btihVar = btih.this;
                            btihVar.a = (String) new dtuj() { // from class: btib
                                @Override // defpackage.dtuj
                                public final Object a() {
                                    return String.valueOf(l);
                                }
                            }.a();
                            btihVar.fY(0);
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                bauj baujVar = this.aE;
                MessageIdType h = bakxVar.h();
                Object e2 = ctjd.c.e();
                e2.getClass();
                baujVar.a(m, h, ((Number) e2).intValue()).A();
            }
        }
        final MessageCoreData e3 = bakxVar.e();
        if (e3 != null) {
            Iterator it = ((Set) this.ad.b()).iterator();
            while (it.hasNext()) {
                ((bdns) it.next()).gc(e3);
            }
            final ParticipantsTable.BindData i = bakxVar.i();
            if (i != null) {
                if (this.az.a()) {
                    this.ay.d(new Consumer() { // from class: bali
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            bdnr bdnrVar = (bdnr) obj;
                            bdnrVar.getClass();
                            bamw bamwVar = this;
                            bdnrVar.a(ConversationIdType.this, bamwVar.A.f(((aolr) bamwVar.r.b()).t(i)));
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                } else {
                    axnw.h(((avln) this.ae.b()).a(((aolr) this.r.b()).t(i), e3));
                }
            }
            Optional optional = this.I;
            final ffji ffjiVar = new ffji() { // from class: balk
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    akwp akwpVar = (akwp) obj;
                    cskc cskcVar = bamw.a;
                    akwpVar.getClass();
                    MessageCoreData messageCoreData = MessageCoreData.this;
                    String aA = messageCoreData.aA();
                    enru enruVar = bdqu.a;
                    akwpVar.a(messageCoreData, ParticipantsTable.b(aA));
                    return ffcu.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: ball
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cskc cskcVar = bamw.a;
                    ffji.this.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        this.H.a(bakxVar.h());
        this.Q.l(bakxVar.g(), bakxVar.h(), new String[0]);
    }

    private final void x(coux couxVar) {
        String str;
        for (bdns bdnsVar : (Set) this.ad.b()) {
            Iterator it = couxVar.x.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                couy couyVar = (couy) it.next();
                if (couyVar.e()) {
                    str = covo.c(couyVar);
                    break;
                }
            }
            bdnsVar.e(str);
        }
    }

    private final boolean y(bseh bsehVar) {
        return bsehVar.m() == 0;
    }

    public final bakx a(bdfy bdfyVar, coux couxVar, aztg aztgVar, long j, final MessageIdType messageIdType, final ConversationIdType conversationIdType, long j2, Uri uri, Uri uri2, final Uri uri3, final byyt byytVar, ParticipantsTable.BindData bindData, boolean z) {
        long epochMilli;
        final Uri uri4;
        int a2 = eopg.a(this.C.a("mms_api"));
        boolean f = ((carb) this.G.b()).f(bdfyVar.a());
        boolean g = ((carb) this.G.b()).g(bdfyVar.a());
        couxVar.l = f;
        couxVar.m = g || this.L.a(bdfyVar.a()) || !z;
        int i = this.T.p() ? this.T.l : 100;
        boolean a3 = baam.c(bindData.S()).a();
        if (a3) {
            this.O.b(bindData.S());
        }
        MessageCoreData a4 = this.N.a(couxVar, bdfyVar.a(), bindData.S(), aztgVar.g(), i, a3 ? byzi.VERIFICATION_UNVERIFIED : byzi.VERIFICATION_NA, j);
        a4.cg();
        MessageData messageData = (MessageData) a4;
        Collection.EL.stream(messageData.i).forEach(new Consumer() { // from class: bcwk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((MessagePartCoreData) obj).ag();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Collection.EL.stream(messageData.i).forEach(new Consumer() { // from class: bcwm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((MessagePartCoreData) obj).ah();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.U.i(a4.o());
        final MessageCoreData z2 = ((bdmq) this.g.b()).z(messageIdType);
        if (z2 == null) {
            a.r("Message deleted prior to update");
            this.V.j(a4);
            ((bdjr) this.ah.b()).a(a4);
            epochMilli = -1;
        } else {
            a4.cd(messageIdType);
            a4.bX(z2.t());
            epochMilli = this.E.f().toEpochMilli();
            a4.aZ(epochMilli);
            if (this.T.p()) {
                a4.bV(this.T.l);
            }
            Iterator it = ((Set) this.ad.b()).iterator();
            while (it.hasNext()) {
                ((bdns) it.next()).g(a4);
            }
            this.V.m(conversationIdType, a4);
        }
        long j3 = epochMilli;
        if (this.T.p()) {
            uri4 = uri2;
        } else {
            this.f.aD(a4, couxVar.q, j2, false, a2);
            alsa e = this.f.e();
            if (e != null) {
                e.b(0, uri, j2, 0L, a4.al());
            }
            v(messageIdType, i);
            Optional optional = this.Y;
            uri4 = uri2;
            final ffji ffjiVar = new ffji() { // from class: balb
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    akni akniVar = (akni) obj;
                    cskc cskcVar = bamw.a;
                    akniVar.getClass();
                    akne akneVar = (akne) akniVar.a.b();
                    Intent c = akni.c(uri4, null, 7);
                    c.putExtra("EXTRA_WAP_PUSH_URI", uri3.toString());
                    akneVar.a(c);
                    return ffcu.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: balc
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cskc cskcVar = bamw.a;
                    ffji.this.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        if (!conversationIdType.equals(bdfyVar.a()) && !((cgpv) this.J.b()).g(conversationIdType)) {
            final bdfl bdflVar = (bdfl) this.j.b();
            bdflVar.d(new Runnable() { // from class: bdev
                @Override // java.lang.Runnable
                public final void run() {
                    bseh r;
                    csix.h();
                    bdfl bdflVar2 = bdfl.this;
                    ConversationIdType conversationIdType2 = conversationIdType;
                    MessageIdType messageIdType2 = messageIdType;
                    if (messageIdType2.c() || ((r = ((bczy) bdflVar2.g.b()).r(conversationIdType2)) != null && r.E().equals(messageIdType2))) {
                        bdflVar2.b(conversationIdType2, true, byytVar);
                    }
                }
            }, "ConversationMetadataDatabaseOperations#maybeRefreshConversationMetadata", conversationIdType);
        }
        ((bdfl) this.j.b()).b(bdfyVar.a(), true, byytVar);
        this.Q.e(bdfyVar.a(), true);
        if (z2 != null) {
            this.S.g(new dtut() { // from class: balg
                @Override // defpackage.dtut
                public final ekzz a() {
                    cskc cskcVar = bamw.a;
                    return eleg.f("ProcessDownloadedMmsAsyncAction.createMmsResultValues.runAfterCommit.spam");
                }
            }, null, new Runnable() { // from class: balh
                @Override // java.lang.Runnable
                public final void run() {
                    bamw bamwVar = bamw.this;
                    MessageCoreData v = ((bdmq) bamwVar.g.b()).v(z2.B());
                    if (v != null) {
                        ((cukj) bamwVar.l.b()).a(v, null, null);
                    }
                }
            });
        }
        return bakx.l(uri4, this.c, messageIdType, conversationIdType.a(), f, bdfyVar, a4, aztgVar.e(), j3, bindData, z);
    }

    public final bakx b(int i, int i2, Uri uri) {
        long j;
        int i3;
        int i4;
        bbcg bbcgVar = this.C;
        int b2 = bbcgVar.b("sub_id", -1);
        ConversationIdType b3 = bdgq.b(bbcgVar.l("conversation_id"));
        Uri uri2 = (Uri) this.C.h("notification_uri");
        MessageIdType b4 = bdhb.b(this.C.l("message_id"));
        boolean y = this.C.y("auto_download");
        boolean f = ((carb) this.G.b()).f(b3);
        int a2 = i != 2 ? i != 3 ? this.C.a("status_if_failed") : 107 : y ? EnergyProfile.EVCONNECTOR_TYPE_OTHER : 106;
        if (this.T.p()) {
            a2 = this.T.l;
        }
        int i5 = a2;
        this.p.a(uri2, b4, b3, i5, i2, uri2 != null, false);
        MessageCoreData z = ((bdmq) this.g.b()).z(b4);
        altk altkVar = this.f;
        ConversationIdType conversationIdType = bdgq.a;
        if (z != null) {
            j = z.s();
            conversationIdType = z.z();
            i3 = z.f();
        } else {
            j = -1;
            i3 = 0;
        }
        ConversationIdType conversationIdType2 = conversationIdType;
        long j2 = j;
        int b5 = this.C.b("sub_id", -1);
        bbcg bbcgVar2 = this.C;
        int a3 = bbcgVar2.a("result_code");
        int a4 = bbcgVar2.a("http_status_code");
        long d = bbcgVar2.d("received_timestamp") * 1000;
        bbcg bbcgVar3 = this.C;
        csrv csrvVar = this.T;
        String l = bbcgVar3.l("content_location");
        if (csrvVar.p()) {
            i4 = i5;
        } else {
            altkVar.R(b5, a3, a4, i3, akvz.i(null, l, d, null, null), i5, j2, conversationIdType2);
            i4 = i5;
            alsa e = altkVar.e();
            if (e != null) {
                e.a(0, uri, a4);
            }
        }
        v(b4, i4);
        ((bdfl) this.j.b()).b(b3, true, byyt.UNARCHIVED);
        return bakx.l(uri, this.c, b4, b3.a(), f, null, null, b2, -1L, null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0322 A[EDGE_INSN: B:46:0x0322->B:41:0x0322 BREAK  A[LOOP:0: B:17:0x0269->B:44:0x0319], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r38) {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bamw.d(ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v15, types: [bamw] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [bamg, ffgu] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [bamw] */
    /* JADX WARN: Type inference failed for: r0v5, types: [ecrj] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12, types: [ecri] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ecri] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ecri, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [bamw] */
    /* JADX WARN: Type inference failed for: r8v4, types: [bamw] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r9v0, types: [bamw] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r10) {
        /*
            Method dump skipped, instructions count: 189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bamw.e(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r17, int r18, defpackage.ffgu r19) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bamw.f(java.lang.String, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.baml
            if (r0 == 0) goto L13
            r0 = r6
            baml r0 = (defpackage.baml) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            baml r0 = new baml
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "MMS receiving END"
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            defpackage.ffci.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L3f
        L29:
            r6 = move-exception
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            defpackage.ffci.b(r6)
            r0.c = r4     // Catch: java.lang.Throwable -> L29
            java.lang.Object r6 = r5.h(r0)     // Catch: java.lang.Throwable -> L29
            if (r6 != r1) goto L3f
            return r1
        L3f:
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r6 = (com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData) r6     // Catch: java.lang.Throwable -> L29
            cskc r0 = defpackage.bamw.a
            r0.l(r3)
            return r6
        L47:
            cskc r0 = defpackage.bamw.a
            r0.l(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bamw.g(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.ffgu r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.bamo
            if (r0 == 0) goto L13
            r0 = r12
            bamo r0 = (defpackage.bamo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bamo r0 = new bamo
            r0.<init>(r11, r12)
        L18:
            r8 = r0
            java.lang.Object r12 = r8.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.c
            r9 = 0
            r10 = 1
            if (r1 == 0) goto L33
            if (r1 != r10) goto L2b
            bamw r0 = r8.d
            defpackage.ffci.b(r12)
            goto L63
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L33:
            defpackage.ffci.b(r12)
            bbcg r12 = r11.C
            java.lang.String r1 = "send_deferred_resp_status"
            boolean r12 = r12.y(r1)
            if (r12 == 0) goto L48
            cskc r12 = defpackage.bamw.a
            java.lang.String r0 = "Exception while sending deferred NotifyRespInd"
            r12.r(r0)
            return r9
        L48:
            bbcg r12 = r11.C
            java.lang.String r1 = "sub_id"
            r2 = -1
            int r7 = r12.b(r1, r2)
            r8.d = r11
            r8.c = r10
            r2 = 2
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r11
            java.lang.Object r12 = r1.r(r2, r3, r4, r5, r7, r8)
            if (r12 != r0) goto L62
            return r0
        L62:
            r0 = r11
        L63:
            bbcg r12 = r0.C
            java.lang.String r1 = "cloud_sync_id"
            java.lang.String r12 = r12.l(r1)
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            r12 = r12 ^ r10
            r1 = 0
            int r12 = defpackage.balw.a(r12, r1)
            com.google.android.apps.messaging.shared.datamodel.action.common.Action r0 = r0.B
            defpackage.bajq.d(r12, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bamw.h(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r0v32, types: [aoku, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v21, types: [aoku, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(android.os.Bundle r25, defpackage.ffgu r26) {
        /*
            Method dump skipped, instructions count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bamw.i(android.os.Bundle, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0118, code lost:
    
        if (r12 == null) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(int r20, final int r21, android.net.Uri r22, long r23, int r25, defpackage.ffgu r26) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bamw.j(int, int, android.net.Uri, long, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Iterable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(int r32, final int r33, final android.net.Uri r34, long r35, int r37, defpackage.ffgu r38) {
        /*
            Method dump skipped, instructions count: 1238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bamw.k(int, int, android.net.Uri, long, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(j$.util.Optional r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.bamt
            if (r0 == 0) goto L13
            r0 = r7
            bamt r0 = (defpackage.bamt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bamt r0 = new bamt
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            bamw r6 = r0.f
            j$.util.Optional r1 = r0.e
            bamw r0 = r0.d
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L32
            r4 = r7
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r4
            goto L50
        L32:
            r6 = move-exception
            goto L64
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            defpackage.ffci.b(r7)
            r0.d = r5     // Catch: java.lang.Throwable -> L62
            r0.e = r6     // Catch: java.lang.Throwable -> L62
            r0.f = r5     // Catch: java.lang.Throwable -> L62
            r0.c = r3     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = r5.m(r6, r0)     // Catch: java.lang.Throwable -> L62
            if (r7 == r1) goto L61
            r1 = r5
            r0 = r7
            r7 = r1
        L50:
            j$.util.Optional r0 = (j$.util.Optional) r0     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L5e
            balz r2 = new balz     // Catch: java.lang.Throwable -> L5e
            engw r6 = (defpackage.engw) r6     // Catch: java.lang.Throwable -> L5e
            r2.<init>(r7, r0, r6)     // Catch: java.lang.Throwable -> L5e
            return r2
        L5e:
            r6 = move-exception
            r0 = r1
            goto L64
        L61:
            return r1
        L62:
            r6 = move-exception
            r0 = r5
        L64:
            entd r7 = defpackage.bamw.b
            ensk r7 = r7.j()
            java.lang.String r1 = "Unable to perform BCM"
            defpackage.a.K(r7, r1, r6)
            ffbr r7 = r0.ac
            java.lang.Object r7 = r7.b()
            cfyt r7 = (defpackage.cfyt) r7
            elfl r6 = r7.a(r6)
            defpackage.axnw.h(r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bamw.l(j$.util.Optional, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(j$.util.Optional r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.bamv
            if (r0 == 0) goto L13
            r0 = r7
            bamv r0 = (defpackage.bamv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bamv r0 = new bamv
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r7)
            ffhd r7 = r5.v
            ffhd r7 = defpackage.ekxi.a(r7)
            bamu r2 = new bamu
            r4 = 0
            r2.<init>(r4, r6, r5)
            r0.c = r3
            java.lang.Object r7 = defpackage.ffra.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bamw.m(j$.util.Optional, ffgu):java.lang.Object");
    }

    public final void n(ConversationIdType conversationIdType, boolean z) {
        if (((cggu) this.ao.b()).d()) {
            if (z) {
                return;
            }
        } else if (z) {
            cggo.b(conversationIdType);
            return;
        }
        cggo.c(conversationIdType);
    }

    public final boolean o(bseh bsehVar) {
        if (!y(bsehVar)) {
            return false;
        }
        if (bsehVar.L() == ckte.j) {
            return true;
        }
        Instant ofEpochMilli = Instant.ofEpochMilli(bsehVar.x());
        cqoh cqohVar = this.E;
        ffbr ffbrVar = this.ax;
        Instant f = cqohVar.f();
        Object b2 = ffbrVar.b();
        b2.getClass();
        return ofEpochMilli.isAfter(f.o(((Number) b2).longValue(), ChronoUnit.DAYS));
    }
}

package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chvq {
    public final cibf A;
    public final fazb B;
    public final cthm C;
    public final ctvb D;
    public final ctvs E;
    public final ffbr F;
    public final ffbr G;
    public final bcqr H;
    public final bbfd I;
    public final chyn J;
    public final chvu K;
    public final aljt L;
    public final cubo M;
    public final ffbr N;
    public final aolr O;
    public final ffbr P;
    public final ffbr Q;
    public final ffbr R;
    public final ffbr S;
    public final ffbr T;
    public final ffbr U;
    public final azaw V;
    public final azaw W;
    public final ffbr X;
    public final ffbr Y;
    public final asix Z;
    private final ffbr aA;
    private final ffbr aB;
    private final ffbr aC;
    private final ffbr aD;
    private final ffbr aE;
    private final atky aF;
    private final chww aG;
    public final ffbr aa;
    public final ffbr ab;
    public final ffbr ac;
    public final ffbr ad;
    public final aslj ae;
    public final asoy af;
    public final ffbr ag;
    public final ffbr ah;
    public final chsd ai;
    public final bbab aj;
    private final crsg al;
    private final ffbr am;
    private final bbes an;
    private final ayfy ao;
    private final ffbr ap;
    private final bbgi aq;
    private final ffbr ar;
    private final ffbr as;
    private final bcsf at;
    private final Map au;
    private final csjk av;
    private final chqc aw;
    private final bcsq ax;
    private final bcsy ay;
    private final ffbr az;
    public final ffbr d;
    public final ffbr e;
    public final bbeq f;
    public final bbfj g;
    public final croc h;
    public final ffbr i;
    public final bbfg j;
    public final bbff k;
    public final cgrq l;
    public final ffbr m;
    public final csqw n;
    public final ffbr o;
    public final ffbr p;
    public final bzdz q;
    public final ffbr r;
    public final ffbr s;
    public final ffbr t;
    public final bzgd u;
    public final ffbr v;
    public final ScheduledExecutorService w;
    public final errl x;
    public final akzt y;
    public final ffbr z;
    public static final emyl a = cfvl.w("populate_is_etouffee_rcs_group_eligible");
    public static final emyl b = cfvl.w("catch_status_errors_from_ditto_request_handlers");
    public static final enru c = enru.c("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2");
    private static final long ak = TimeUnit.DAYS.toMicros(1);

    public chvq(ffbr ffbrVar, ffbr ffbrVar2, bbeq bbeqVar, bbfj bbfjVar, croc crocVar, ffbr ffbrVar3, crsg crsgVar, ffbr ffbrVar4, bbes bbesVar, chsd chsdVar, bbfg bbfgVar, bbff bbffVar, cgrq cgrqVar, ayfy ayfyVar, ffbr ffbrVar5, csqw csqwVar, ffbr ffbrVar6, bbgi bbgiVar, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, bzdz bzdzVar, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, bzgd bzgdVar, ffbr ffbrVar13, ffbr ffbrVar14, ScheduledExecutorService scheduledExecutorService, errl errlVar, bcsf bcsfVar, Map map, akzt akztVar, ffbr ffbrVar15, cibf cibfVar, fazb fazbVar, cthm cthmVar, ctvb ctvbVar, ctvs ctvsVar, csjk csjkVar, ffbr ffbrVar16, ffbr ffbrVar17, bcqr bcqrVar, bbfd bbfdVar, chyn chynVar, chvu chvuVar, chww chwwVar, chqc chqcVar, aljt aljtVar, cubo cuboVar, bbab bbabVar, ffbr ffbrVar18, aolr aolrVar, ffbr ffbrVar19, bcsq bcsqVar, bcsy bcsyVar, ffbr ffbrVar20, ffbr ffbrVar21, ffbr ffbrVar22, ffbr ffbrVar23, ffbr ffbrVar24, azaw azawVar, azaw azawVar2, ffbr ffbrVar25, ffbr ffbrVar26, ffbr ffbrVar27, ffbr ffbrVar28, asix asixVar, ffbr ffbrVar29, ffbr ffbrVar30, ffbr ffbrVar31, ffbr ffbrVar32, ffbr ffbrVar33, ffbr ffbrVar34, ffbr ffbrVar35, ffbr ffbrVar36, aslj asljVar, asoy asoyVar, ffbr ffbrVar37, ffbr ffbrVar38, atky atkyVar) {
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = bbeqVar;
        this.g = bbfjVar;
        this.h = crocVar;
        this.i = ffbrVar3;
        this.al = crsgVar;
        this.am = ffbrVar4;
        this.an = bbesVar;
        this.ai = chsdVar;
        this.j = bbfgVar;
        this.k = bbffVar;
        this.l = cgrqVar;
        this.ao = ayfyVar;
        this.m = ffbrVar5;
        this.n = csqwVar;
        this.ap = ffbrVar6;
        this.aq = bbgiVar;
        this.ar = ffbrVar7;
        this.o = ffbrVar8;
        this.p = ffbrVar9;
        this.q = bzdzVar;
        this.r = ffbrVar10;
        this.s = ffbrVar11;
        this.t = ffbrVar12;
        this.u = bzgdVar;
        this.v = ffbrVar13;
        this.as = ffbrVar14;
        this.w = scheduledExecutorService;
        this.x = errlVar;
        this.at = bcsfVar;
        this.au = map;
        this.y = akztVar;
        this.z = ffbrVar15;
        this.A = cibfVar;
        this.B = fazbVar;
        this.C = cthmVar;
        this.D = ctvbVar;
        this.E = ctvsVar;
        this.av = csjkVar;
        this.F = ffbrVar16;
        this.G = ffbrVar17;
        this.H = bcqrVar;
        this.I = bbfdVar;
        this.J = chynVar;
        this.K = chvuVar;
        this.aG = chwwVar;
        this.aw = chqcVar;
        this.L = aljtVar;
        this.M = cuboVar;
        this.aj = bbabVar;
        this.N = ffbrVar18;
        this.O = aolrVar;
        this.P = ffbrVar19;
        this.ax = bcsqVar;
        this.ay = bcsyVar;
        this.Q = ffbrVar20;
        this.R = ffbrVar21;
        this.S = ffbrVar22;
        this.T = ffbrVar23;
        this.U = ffbrVar24;
        this.V = azawVar;
        this.W = azawVar2;
        this.X = ffbrVar25;
        this.az = ffbrVar26;
        this.aA = ffbrVar27;
        this.Y = ffbrVar28;
        this.Z = asixVar;
        this.aa = ffbrVar29;
        this.aB = ffbrVar30;
        this.aC = ffbrVar31;
        this.ab = ffbrVar32;
        this.aD = ffbrVar33;
        this.ac = ffbrVar35;
        this.ad = ffbrVar36;
        this.af = asoyVar;
        this.ae = asljVar;
        for (esaa esaaVar : esaa.values()) {
            switch (esaaVar.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 11:
                case 14:
                case 15:
                case 16:
                case 17:
                case 21:
                case 22:
                case 23:
                case 24:
                case 33:
                case 36:
                case 37:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                case 50:
                    emxf.l(map.containsKey(esaaVar));
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 12:
                case 13:
                case 18:
                case 19:
                case 20:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 34:
                case 35:
                case 38:
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case 40:
                    emxf.l(!map.containsKey(esaaVar));
                    break;
            }
        }
        this.aE = ffbrVar34;
        this.ag = ffbrVar37;
        this.ah = ffbrVar38;
        this.aF = atkyVar;
    }

    public static boolean B(eruv eruvVar) {
        return eruvVar == eruv.DELETED;
    }

    public static boolean C(ervi erviVar) {
        esaa b2 = esaa.b(erviVar.c);
        if (b2 == null) {
            b2 = esaa.UNRECOGNIZED;
        }
        if (b2.equals(esaa.CREATE_GAIA_PAIRING_CLIENT_INIT)) {
            return true;
        }
        esaa b3 = esaa.b(erviVar.c);
        if (b3 == null) {
            b3 = esaa.UNRECOGNIZED;
        }
        if (b3.equals(esaa.CREATE_GAIA_PAIRING_CLIENT_FINISHED)) {
            return true;
        }
        esaa b4 = esaa.b(erviVar.c);
        if (b4 == null) {
            b4 = esaa.UNRECOGNIZED;
        }
        if (b4.equals(esaa.CANCEL_GAIA_PAIRING)) {
            return true;
        }
        esaa b5 = esaa.b(erviVar.c);
        if (b5 == null) {
            b5 = esaa.UNRECOGNIZED;
        }
        return b5.equals(esaa.PREWARM);
    }

    private final aoku F(erwb erwbVar) {
        erul erulVar = erwbVar.c;
        if (erulVar == null) {
            erulVar = erul.a;
        }
        aolr aolrVar = this.O;
        String str = erulVar.c;
        escu escuVar = erwbVar.d;
        if (escuVar == null) {
            escuVar = escu.a;
        }
        return aolrVar.u(str, escuVar.c);
    }

    private final elfl G(erwb erwbVar, Executor executor) {
        return k(F(erwbVar)).e(Throwable.class, new emwl() { // from class: chve
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ensk i = chvq.c.i();
                i.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) ((enrr) i).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "isRcsEligibleFuture", 3655, "DittoChannelRequestHandlerV2.java")).q("Failed to get RCS capabilities of all users");
                return false;
            }
        }, executor);
    }

    private final elfl H(final ConversationIdType conversationIdType, final byyt byytVar) {
        return elfo.g(new Callable() { // from class: chui
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(chvq.this.h.a(conversationIdType, byytVar, eoko.CONVERSATION_FROM_WEB_ACTION));
            }
        }, this.x);
    }

    private final void I(Cursor cursor, Collection collection, Collection collection2) {
        bcqq a2 = this.H.a();
        while (cursor.moveToNext()) {
            a2.e(cursor);
            erxo l = ((cgzv) this.m.b()).l(a2.f());
            if (l != null) {
                erum erumVar = (erum) erun.a.createBuilder();
                erumVar.copyOnWrite();
                erun erunVar = (erun) erumVar.instance;
                erunVar.d = l;
                erunVar.b |= 1;
                String str = a2.c;
                if (str != null) {
                    erumVar.copyOnWrite();
                    ((erun) erumVar.instance).c = str;
                }
                collection2.add((erun) erumVar.build());
                collection.remove(a2.c);
            }
        }
    }

    private final elfl J(final ConversationIdType conversationIdType, final int i, escl esclVar, final boolean z) {
        esal esalVar;
        if ((esclVar.b & 1) != 0) {
            esalVar = esclVar.c;
            if (esalVar == null) {
                esalVar = esal.a;
            }
        } else {
            esalVar = null;
        }
        final esal esalVar2 = esalVar;
        return esalVar2 == null ? elfo.e(u(false)) : elfo.h(new erog() { // from class: chsf
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final String str;
                crse o;
                esal esalVar3 = esalVar2;
                if ((esalVar3.b & 1) != 0) {
                    esao esaoVar = esalVar3.c;
                    if (esaoVar == null) {
                        esaoVar = esao.a;
                    }
                    str = esaoVar.d;
                } else {
                    str = null;
                }
                if (str == null) {
                    return elfo.e(false);
                }
                final ConversationIdType conversationIdType2 = conversationIdType;
                boolean z2 = z;
                final chvq chvqVar = chvq.this;
                elfl e = elfo.e(true);
                if (z2) {
                    if (cubs.a().booleanValue()) {
                        o = crsf.o();
                        crrr crrrVar = (crrr) o;
                        crrrVar.e = new BugleConversationId(conversationIdType2);
                        crrrVar.a = true;
                        crrrVar.h = eoko.CONVERSATION_FROM_WEB_ACTION;
                        crrrVar.j = 3;
                        crrrVar.k = 10;
                    } else {
                        o = crsf.o();
                        crrr crrrVar2 = (crrr) o;
                        crrrVar2.d = conversationIdType2;
                        crrrVar2.a = true;
                        crrrVar2.h = eoko.CONVERSATION_FROM_WEB_ACTION;
                        crrrVar2.j = 3;
                        crrrVar2.k = 10;
                    }
                    e = ((crrt) chvqVar.i.b()).a(o.a().n()).h(new emwl() { // from class: chup
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            boolean z3 = ((crsn) obj) != null;
                            emyl emylVar = chvq.a;
                            return Boolean.valueOf(z3);
                        }
                    }, erpp.a);
                }
                final int i2 = i;
                return e.h(new emwl() { // from class: chuq
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        boolean z3 = false;
                        if (((Boolean) obj).booleanValue()) {
                            int i3 = i2;
                            chvq chvqVar2 = chvq.this;
                            erdh createBuilder = erdj.a.createBuilder();
                            createBuilder.copyOnWrite();
                            erdj erdjVar = (erdj) createBuilder.instance;
                            ConversationIdType conversationIdType3 = conversationIdType2;
                            erdjVar.c = i3 - 1;
                            erdjVar.b |= 1;
                            createBuilder.copyOnWrite();
                            erdj erdjVar2 = (erdj) createBuilder.instance;
                            erdjVar2.d = 2;
                            erdjVar2.b |= 2;
                            erdj build = createBuilder.build();
                            eoko eokoVar = eoko.CONVERSATION_FROM_WEB_ACTION;
                            conversationIdType3.getClass();
                            build.getClass();
                            eokoVar.getClass();
                            efbd.b();
                            int i4 = build.c;
                            int a2 = erdg.a(i4);
                            erfe erfeVar = null;
                            if (a2 != 0 && a2 == 4) {
                                erfeVar = erfe.DISMISSED_WARNING_BANNER;
                            }
                            erfe erfeVar2 = erfeVar;
                            int a3 = erdg.a(i4);
                            boolean z4 = a3 != 0 && a3 == 2;
                            cukx cukxVar = cukx.b;
                            int i5 = build.c;
                            int a4 = erdg.a(i5);
                            boolean z5 = a4 == 0 || a4 != 4;
                            int a5 = erdg.a(i5);
                            if (a5 == 0) {
                                a5 = 1;
                            }
                            cubo cuboVar = chvqVar2.M;
                            if (cuboVar.b.b(cuch.b(z4, conversationIdType3, str, cukxVar, z5, a5 == 2, eokoVar, null, erfeVar2, 10, 128)) != null && ((culp) cuboVar.a.b()).l(conversationIdType3, cuuz.a(conversationIdType3))) {
                                z3 = true;
                            }
                        }
                        return Boolean.valueOf(z3);
                    }
                }, chvqVar.x);
            }
        }, this.x).h(new chsq(), erpp.a);
    }

    public static esaa s(ervi erviVar) {
        int i = erviVar.c;
        esaa b2 = esaa.b(i);
        if (b2 == null) {
            b2 = esaa.UNRECOGNIZED;
        }
        esaa esaaVar = esaa.UNRECOGNIZED;
        if (b2 == esaaVar) {
            return esaa.MESSAGE_TYPE_UNSPECIFIED;
        }
        esaa b3 = esaa.b(i);
        return b3 == null ? esaaVar : b3;
    }

    public static esdz t(ParticipantsTable.BindData bindData, byyt byytVar, Boolean bool, crsn crsnVar) {
        escl esclVar;
        if (bindData == null || byytVar == null || crsnVar == null || !cgzv.g.containsKey(byytVar)) {
            esclVar = escl.a;
        } else {
            escj escjVar = (escj) escl.a.createBuilder();
            eruv eruvVar = (eruv) cgzv.g.get(byytVar);
            escjVar.copyOnWrite();
            ((escl) escjVar.instance).e = eruvVar.a();
            esak esakVar = (esak) esal.a.createBuilder();
            esam esamVar = (esam) esao.a.createBuilder();
            String S = bindData.S();
            esamVar.copyOnWrite();
            esao esaoVar = (esao) esamVar.instance;
            S.getClass();
            esaoVar.d = S;
            esakVar.copyOnWrite();
            esal esalVar = (esal) esakVar.instance;
            esao esaoVar2 = (esao) esamVar.build();
            esaoVar2.getClass();
            esalVar.c = esaoVar2;
            esalVar.b |= 1;
            boolean Y = bindData.Y();
            esakVar.copyOnWrite();
            ((esal) esakVar.instance).p = Y;
            boolean ab = bindData.ab();
            esakVar.copyOnWrite();
            ((esal) esakVar.instance).l = ab;
            int n = bindData.n();
            esakVar.copyOnWrite();
            ((esal) esakVar.instance).m = n;
            esal esalVar2 = (esal) esakVar.build();
            escjVar.copyOnWrite();
            escl esclVar2 = (escl) escjVar.instance;
            esalVar2.getClass();
            esclVar2.c = esalVar2;
            esclVar2.b |= 1;
            escjVar.copyOnWrite();
            escl esclVar3 = (escl) escjVar.instance;
            esclVar3.f = crsnVar;
            esclVar3.b |= 2;
            esclVar = (escl) escjVar.build();
        }
        esdy esdyVar = (esdy) esdz.a.createBuilder();
        boolean equals = Boolean.TRUE.equals(bool);
        esdyVar.copyOnWrite();
        ((esdz) esdyVar.instance).d = equals;
        esdyVar.copyOnWrite();
        esdz esdzVar = (esdz) esdyVar.instance;
        esclVar.getClass();
        esdzVar.c = esclVar;
        esdzVar.b = 3;
        return (esdz) esdyVar.build();
    }

    public static esdz u(Boolean bool) {
        esdy esdyVar = (esdy) esdz.a.createBuilder();
        boolean equals = Boolean.TRUE.equals(bool);
        esdyVar.copyOnWrite();
        ((esdz) esdyVar.instance).d = equals;
        return (esdz) esdyVar.build();
    }

    public final void A(ervi erviVar) {
        esaa b2 = esaa.b(erviVar.c);
        if (b2 == null) {
            b2 = esaa.UNRECOGNIZED;
        }
        int ordinal = b2.ordinal();
        if (ordinal != 3 && ordinal != 18 && ordinal != 12 && ordinal != 13 && ordinal != 15 && ordinal != 16) {
            switch (ordinal) {
            }
            return;
        }
        this.C.b(true);
    }

    final void D(fcek fcekVar, bzge bzgeVar, int i) {
        ((bzea) this.p.b()).r((((cgcu) this.U.b()).a() ? bzgeVar.d : fcekVar).c, i);
        if (((cgcu) this.U.b()).a()) {
            axnw.h(this.K.b(bzgeVar));
        } else {
            ((chep) this.v.b()).a(this.J.a(fcekVar));
        }
    }

    public final void E(fcek fcekVar, bzge bzgeVar) {
        fcek fcekVar2 = ((cgcu) this.U.b()).a() ? bzgeVar.d : fcekVar;
        chse chseVar = (chse) this.aA.b();
        synchronized (chseVar.a) {
            if (((fcek) chseVar.a.b(fcekVar2.c)) == null) {
                chseVar.a.d(fcekVar2.c, fcekVar2);
                D(fcekVar, bzgeVar, 12);
            } else {
                ensk e = c.e();
                e.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "unpairFromBrowserWithCache", 3842, "DittoChannelRequestHandlerV2.java")).t("Skipping unpairing from browser [browser id=%s] due to id cached.", fcekVar2.c);
            }
        }
    }

    final chwu a(esaa esaaVar, fcek fcekVar, String str, fbzt fbztVar, boolean z, int i, bzge bzgeVar) {
        if (((cgcu) this.U.b()).a() && fcekVar.d.equals("GDitto")) {
            chwu a2 = this.aG.a(bzgeVar, esaaVar);
            a2.c = str;
            a2.l = z;
            a2.k = i;
            a2.j = ak;
            a2.m = fbztVar.c;
            fcek fcekVar2 = fbztVar.i;
            if (fcekVar2 == null) {
                fcekVar2 = fcek.a;
            }
            a2.n = fcekVar2;
            return a2;
        }
        chwu c2 = this.aG.c(fcekVar, Optional.empty(), esaaVar);
        c2.c = str;
        c2.l = z;
        c2.k = i;
        c2.j = ak;
        c2.m = fbztVar.c;
        fcek fcekVar3 = fbztVar.i;
        if (fcekVar3 == null) {
            fcekVar3 = fcek.a;
        }
        c2.n = fcekVar3;
        return c2;
    }

    final elfl b(ConversationIdType conversationIdType) {
        return H(conversationIdType, byyt.ARCHIVED);
    }

    final elfl c(final ConversationIdType conversationIdType, esdx esdxVar, final boolean z) {
        if (esdxVar.c != 5) {
            return elfo.e(u(false));
        }
        escl esclVar = (escl) esdxVar.d;
        int a2 = esck.a(esclVar.d);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 2;
        return i != 1 ? i != 2 ? elfo.e(u(false)) : J(conversationIdType, 2, esclVar, true) : ((crsl) this.am.b()).a(conversationIdType).i(new eroh() { // from class: chsu
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                crsd n;
                final ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                chvq chvqVar = chvq.this;
                bczy bczyVar = (bczy) chvqVar.r.b();
                ConversationIdType conversationIdType2 = conversationIdType;
                final byyt s = bczyVar.s(conversationIdType2);
                boolean booleanValue = cubs.a().booleanValue();
                boolean z2 = z;
                if (booleanValue) {
                    crse o = crsf.o();
                    BugleConversationId bugleConversationId = new BugleConversationId(conversationIdType2);
                    crrr crrrVar = (crrr) o;
                    crrrVar.e = bugleConversationId;
                    crrrVar.a = true;
                    crrrVar.b = true == z2 ? true : null;
                    crrrVar.h = eoko.CONVERSATION_FROM_WEB_ACTION;
                    crrrVar.j = 3;
                    crrrVar.k = 10;
                    n = o.a().n();
                } else {
                    crse o2 = crsf.o();
                    crrr crrrVar2 = (crrr) o2;
                    crrrVar2.d = conversationIdType2;
                    crrrVar2.a = true;
                    crrrVar2.b = true == z2 ? true : null;
                    crrrVar2.h = eoko.CONVERSATION_FROM_WEB_ACTION;
                    crrrVar2.j = 3;
                    crrrVar2.k = 10;
                    n = o2.a().n();
                }
                return ((crrt) chvqVar.i.b()).a(n).h(new emwl() { // from class: chtv
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        crsn crsnVar = (crsn) obj2;
                        boolean z3 = crsnVar != null;
                        byyt byytVar = s;
                        ParticipantsTable.BindData bindData2 = ParticipantsTable.BindData.this;
                        emyl emylVar = chvq.a;
                        return chvq.t(bindData2, byytVar, Boolean.valueOf(z3), crsnVar);
                    }
                }, chvqVar.w);
            }
        }, this.x);
    }

    public final elfl d(eyhs eyhsVar, fcek fcekVar, String str, fbzt fbztVar, boolean z, int i, esaa esaaVar, bzge bzgeVar) {
        fcek fcekVar2;
        fcek fcekVar3;
        chvq chvqVar;
        String str2;
        fbzt fbztVar2;
        boolean z2;
        int i2;
        esaa esaaVar2;
        if (((cgcu) this.U.b()).a()) {
            fcekVar2 = fcekVar;
            fcekVar3 = bzgeVar.d;
            str2 = str;
            fbztVar2 = fbztVar;
            z2 = z;
            i2 = i;
            esaaVar2 = esaaVar;
            chvqVar = this;
        } else {
            fcekVar2 = fcekVar;
            fcekVar3 = fcekVar2;
            chvqVar = this;
            str2 = str;
            fbztVar2 = fbztVar;
            z2 = z;
            i2 = i;
            esaaVar2 = esaaVar;
        }
        chwu a2 = chvqVar.a(esaaVar2, fcekVar2, str2, fbztVar2, z2, i2, bzgeVar);
        a2.b(eyhsVar);
        chwv a3 = a2.a();
        ensk e = c.e();
        e.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "buildHandlerAndSendResponse", 1523, "DittoChannelRequestHandlerV2.java")).D("Preparing response for request of type %s %s", esaaVar, ((cgzv) this.m.b()).y(str, a3.c, fcekVar3));
        return n(a3, str, fcekVar, bzgeVar);
    }

    final elfl e(ConversationIdType conversationIdType) {
        eoko eokoVar = eoko.CONVERSATION_FROM_WEB_ACTION;
        aygb f = aygc.f();
        f.b(conversationIdType);
        f.c(Long.MAX_VALUE);
        f.f(eokoVar);
        return elfl.g(this.ao.a(f.a())).h(new emwl() { // from class: chub
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                emyl emylVar = chvq.a;
                return true;
            }
        }, erpp.a).e(Throwable.class, new emwl() { // from class: chuc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ensk i = chvq.c.i();
                i.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) ((enrr) i).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "deleteConversationAndNotify", 2917, "DittoChannelRequestHandlerV2.java")).q("Couldn't delete the conversation.");
                return false;
            }
        }, erpp.a);
    }

    public final elfl f(List list, boolean z) {
        if (z) {
            return elfo.a((Iterable) Collection.EL.stream(list).map(new Function() { // from class: chtf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    chvq chvqVar = chvq.this;
                    return chvqVar.k(chvqVar.O.q((ParticipantsTable.BindData) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new chsm()))).h(new emwl() { // from class: chtg
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    emyl emylVar = chvq.a;
                    return Boolean.valueOf(Collection.EL.stream((List) obj).allMatch(new Predicate() { // from class: chvg
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
                        public final boolean test(Object obj2) {
                            emyl emylVar2 = chvq.a;
                            return ((Boolean) obj2).booleanValue();
                        }
                    }));
                }
            }, this.w).e(Exception.class, new emwl() { // from class: chth
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ensk j = chvq.c.j();
                    j.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) ((enrr) j).g((Exception) obj)).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "determineAreAllRcsInternal", 2587, "DittoChannelRequestHandlerV2.java")).q("Failed to get RCS capabilities of all users, not creating group RCS");
                    return false;
                }
            }, erpp.a);
        }
        ensk e = c.e();
        e.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "determineAreAllRcsInternal", 2571, "DittoChannelRequestHandlerV2.java")).q("Group not RCS because RCS services haven't connected");
        return elfo.e(false);
    }

    @Deprecated
    public final elfl g(List list) {
        if (((ckge) this.av.a()).d() != eqwf.AVAILABLE) {
            ensk e = c.e();
            e.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "determineAreAllRcsLegacy", 2602, "DittoChannelRequestHandlerV2.java")).q("Group not RCS because RCS is not available yet");
            return elfo.e(false);
        }
        if (((ckds) this.ap.b()).I()) {
            return elfo.a((Iterable) Collection.EL.stream(list).map(new Function() { // from class: chtw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    chvq chvqVar = chvq.this;
                    return chvqVar.k(chvqVar.O.q((ParticipantsTable.BindData) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new chsm()))).h(new emwl() { // from class: chty
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    emyl emylVar = chvq.a;
                    return Boolean.valueOf(Collection.EL.stream((List) obj).allMatch(new Predicate() { // from class: chuh
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
                        public final boolean test(Object obj2) {
                            emyl emylVar2 = chvq.a;
                            return ((Boolean) obj2).booleanValue();
                        }
                    }));
                }
            }, this.w).e(Throwable.class, new emwl() { // from class: chtz
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ensk i = chvq.c.i();
                    i.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) ((enrr) i).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "determineAreAllRcsLegacy", 2624, "DittoChannelRequestHandlerV2.java")).q("Failed to get RCS capabilities of all users, not creating group RCS");
                    return false;
                }
            }, erpp.a);
        }
        ensk e2 = c.e();
        e2.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "determineAreAllRcsLegacy", 2608, "DittoChannelRequestHandlerV2.java")).q("Group not RCS because RCS services haven't connected");
        return elfo.e(false);
    }

    final elfl h(ConversationIdType conversationIdType, boolean z) {
        Action a2 = this.an.a(conversationIdType, Boolean.valueOf(z), null, null, null);
        SettableFuture create = SettableFuture.create();
        a2.p(new bber(create));
        return elfl.g(create);
    }

    protected final elfl i(final erwb erwbVar) {
        final elfl e;
        final elfl e2;
        if (!((bzqa) this.T.b()).i() || !((Boolean) ((cfup) a.get()).e()).booleanValue()) {
            elfl e3 = elfo.e(false);
            if ((1 & erwbVar.b) != 0) {
                e3 = G(erwbVar, erpp.a);
            }
            return e3.h(new emwl() { // from class: chvl
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    emyl emylVar = chvq.a;
                    erwc erwcVar = (erwc) erwd.a.createBuilder();
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    erwcVar.copyOnWrite();
                    ((erwd) erwcVar.instance).b = booleanValue;
                    return (erwd) erwcVar.build();
                }
            }, erpp.a);
        }
        if ((erwbVar.b & 1) != 0) {
            e = G(erwbVar, this.w);
            aoku F = F(erwbVar);
            if (F.e().isPresent()) {
                final awui awuiVar = (awui) F.e().get();
                if ((erwbVar.b & 2) != 0) {
                    e2 = l(erwbVar, awuiVar);
                } else {
                    ensk j = c.j();
                    j.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "isE2eeRcsGroupEligibleFuture", 3603, "DittoChannelRequestHandlerV2.java")).q("Ditto has not provided subscription id.");
                    ((akzt) this.z.b()).c("Bugle.Ditto.AddParticipantToGroup.SubscriptionNotProvided.Counts");
                    e2 = (elfl) ((csta) this.aE.b()).a(escu.a).map(new Function() { // from class: chto
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            escs escsVar = (escs) escu.a.createBuilder();
                            int intValue = ((Integer) obj).intValue();
                            escsVar.copyOnWrite();
                            ((escu) escsVar.instance).c = intValue;
                            escsVar.copyOnWrite();
                            ((escu) escsVar.instance).b = esct.a(4);
                            escu escuVar = (escu) escsVar.build();
                            erwa erwaVar = (erwa) erwbVar.toBuilder();
                            erwaVar.copyOnWrite();
                            erwb erwbVar2 = (erwb) erwaVar.instance;
                            escuVar.getClass();
                            erwbVar2.d = escuVar;
                            erwbVar2.b |= 2;
                            return chvq.this.l((erwb) erwaVar.build(), awuiVar);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElse(elfo.e(false));
                }
            } else {
                e2 = elfo.e(false);
            }
        } else {
            e = elfo.e(false);
            e2 = elfo.e(false);
        }
        return elfo.m(e, e2).a(new Callable() { // from class: chvm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                emyl emylVar = chvq.a;
                erwc erwcVar = (erwc) erwd.a.createBuilder();
                boolean booleanValue = ((Boolean) erqt.q(elfl.this)).booleanValue();
                erwcVar.copyOnWrite();
                ((erwd) erwcVar.instance).b = booleanValue;
                boolean booleanValue2 = ((Boolean) erqt.q(e2)).booleanValue();
                erwcVar.copyOnWrite();
                ((erwd) erwcVar.instance).c = booleanValue2;
                return (erwd) erwcVar.build();
            }
        }, this.w);
    }

    public final elfl j(final ervi erviVar, final fbzt fbztVar, final fcek fcekVar, final bzge bzgeVar) {
        fcek fcekVar2;
        Object obj;
        elfl e;
        final ervi erviVar2 = erviVar;
        fcek fcekVar3 = ((cgcu) this.U.b()).a() ? bzgeVar.d : fcekVar;
        enru enruVar = c;
        ensk e2 = enruVar.e();
        e2.Y(ente.a, "BugleNetwork");
        enrr enrrVar = (enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "getResponseForRequest", 933, "DittoChannelRequestHandlerV2.java");
        esaa b2 = esaa.b(erviVar2.c);
        if (b2 == null) {
            b2 = esaa.UNRECOGNIZED;
        }
        enrrVar.D("Received DittoRequest: %s %s", b2, ((cgzv) this.m.b()).z(erviVar2.b, fcekVar3));
        if (!((cgcu) this.U.b()).a() || !C(erviVar2)) {
            if (this.u.D(fcekVar3) || this.A.b(fcekVar3)) {
                fcekVar2 = fcekVar;
                A(erviVar);
                ensk h = enruVar.h();
                h.Y(ente.a, "BugleNetwork");
                enrr enrrVar2 = (enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "getResponseForRequest", 954, "DittoChannelRequestHandlerV2.java");
                esaa b3 = esaa.b(erviVar2.c);
                if (b3 == null) {
                    b3 = esaa.UNRECOGNIZED;
                }
                enrrVar2.w("Handling DittoRequest: %s %s", b3.a(), ((cgzv) this.m.b()).z(erviVar2.b, fcekVar3));
                Optional w = ((cgzv) this.m.b()).w(erviVar2.e, erviVar2.b, fcekVar3);
                if (w.isEmpty()) {
                    e = elfo.e(Optional.empty());
                } else {
                    obj = w.get();
                }
            } else {
                E(fcekVar, bzgeVar);
                e = elfo.e(Optional.empty());
            }
            return e.i(new eroh() { // from class: chun
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj2) {
                    Optional optional = (Optional) obj2;
                    if (!optional.isPresent() || eyex.a.equals(optional.get())) {
                        return elfo.e(true);
                    }
                    bzge bzgeVar2 = bzgeVar;
                    fbzt fbztVar2 = fbztVar;
                    fcek fcekVar4 = fcekVar;
                    return chvq.this.m((eyhs) optional.get(), erviVar, fcekVar4, fbztVar2, true, 1, bzgeVar2);
                }
            }, this.x);
        }
        obj = erviVar2.d;
        fcekVar2 = fcekVar;
        Map map = this.au;
        esaa b4 = esaa.b(erviVar2.c);
        if (b4 == null) {
            b4 = esaa.UNRECOGNIZED;
        }
        if (map.containsKey(b4)) {
            Map map2 = this.au;
            esaa b5 = esaa.b(erviVar2.c);
            if (b5 == null) {
                b5 = esaa.UNRECOGNIZED;
            }
            ffbr ffbrVar = (ffbr) map2.get(b5);
            ffbrVar.getClass();
            try {
                try {
                } catch (eygu e3) {
                    e = e3;
                    erviVar2 = erviVar;
                }
                try {
                    erviVar2 = erviVar;
                    e = ((cifg) ffbrVar.b()).a(new cibs(erviVar, fcekVar2, bzgeVar, this.x, (eyee) obj, fbztVar.h, fbztVar));
                } catch (eygu e4) {
                    e = e4;
                    erviVar2 = erviVar;
                    ensk i = c.i();
                    i.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "getResponseForRequest", 985, "DittoChannelRequestHandlerV2.java")).t("Exception parsing ditto channel request %s", ((cgzv) this.m.b()).z(erviVar2.b, fcekVar3));
                    e = elfo.d(e);
                    return e.i(new eroh() { // from class: chun
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            Optional optional = (Optional) obj2;
                            if (!optional.isPresent() || eyex.a.equals(optional.get())) {
                                return elfo.e(true);
                            }
                            bzge bzgeVar2 = bzgeVar;
                            fbzt fbztVar2 = fbztVar;
                            fcek fcekVar4 = fcekVar;
                            return chvq.this.m((eyhs) optional.get(), erviVar, fcekVar4, fbztVar2, true, 1, bzgeVar2);
                        }
                    }, this.x);
                }
            } catch (eygu e5) {
                e = e5;
            }
        } else {
            final fcek fcekVar4 = ((cgcu) this.U.b()).a() ? bzgeVar.d : fcekVar;
            final eyee eyeeVar = (eyee) obj;
            e = elfo.h(new erog() { // from class: chvh
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:314:0x09ca  */
                /* JADX WARN: Removed duplicated region for block: B:317:0x09d3  */
                @Override // defpackage.erog
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.google.common.util.concurrent.ListenableFuture a() {
                    /*
                        Method dump skipped, instructions count: 2966
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.chvh.a():com.google.common.util.concurrent.ListenableFuture");
                }
            }, this.x).h(new emwl() { // from class: chsz
                @Override // defpackage.emwl
                public final Object apply(Object obj2) {
                    return Optional.of((eyhs) obj2);
                }
            }, erpp.a);
        }
        return e.i(new eroh() { // from class: chun
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                Optional optional = (Optional) obj2;
                if (!optional.isPresent() || eyex.a.equals(optional.get())) {
                    return elfo.e(true);
                }
                bzge bzgeVar2 = bzgeVar;
                fbzt fbztVar2 = fbztVar;
                fcek fcekVar42 = fcekVar;
                return chvq.this.m((eyhs) optional.get(), erviVar, fcekVar42, fbztVar2, true, 1, bzgeVar2);
            }
        }, this.x);
    }

    public final elfl k(aoku aokuVar) {
        return (elfl) aokuVar.e().map(new Function() { // from class: chuy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                chvq chvqVar = chvq.this;
                return chvqVar.V.d((awui) obj).h(new emwl() { // from class: chtl
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return Boolean.valueOf(((avlk) obj2).g());
                    }
                }, chvqVar.w);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: chuz
            @Override // java.util.function.Supplier
            public final Object get() {
                emyl emylVar = chvq.a;
                return elfo.e(false);
            }
        });
    }

    public final elfl l(erwb erwbVar, final awui awuiVar) {
        elfl c2;
        final capw capwVar = (capw) capz.a.createBuilder();
        eozn eoznVar = eozn.DITTO_CONTACT_PICKER_SELECT_CONTACT;
        capwVar.copyOnWrite();
        capz capzVar = (capz) capwVar.instance;
        capzVar.e = eoznVar.m;
        capzVar.b |= 1;
        capx capxVar = (capx) capy.a.createBuilder();
        capxVar.a(awuiVar);
        capy capyVar = (capy) capxVar.build();
        capwVar.copyOnWrite();
        capz capzVar2 = (capz) capwVar.instance;
        capyVar.getClass();
        capzVar2.d = capyVar;
        capzVar2.c = 1;
        ckac ckacVar = (ckac) this.aD.b();
        escu escuVar = erwbVar.d;
        if (escuVar == null) {
            escuVar = escu.a;
        }
        c2 = axol.c(ckacVar.e, ffhe.a, ffsm.a, new cjzz(ckacVar, escuVar.c, null));
        return c2.h(new emwl() { // from class: chte
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                awui awuiVar2 = (awui) obj;
                emyl emylVar = chvq.a;
                capw capwVar2 = capw.this;
                capwVar2.copyOnWrite();
                capz capzVar3 = (capz) capwVar2.instance;
                capz capzVar4 = capz.a;
                awuiVar2.getClass();
                capzVar3.f = awuiVar2;
                capzVar3.b |= 2;
                return (capz) capwVar2.build();
            }
        }, erpp.a).i(new eroh() { // from class: chsn
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((capp) chvq.this.Q.b()).b((capz) obj);
            }
        }, this.w).h(new emwl() { // from class: chso
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                java.util.Collection collection;
                caqb caqbVar = (caqb) obj;
                emyl emylVar = chvq.a;
                if (caqbVar == null) {
                    collection = enpd.a;
                } else {
                    final awui awuiVar2 = awui.this;
                    collection = (enip) Collection.EL.stream(caqbVar.b).filter(new Predicate() { // from class: chsp
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
                        public final boolean test(Object obj2) {
                            emyl emylVar2 = chvq.a;
                            awui awuiVar3 = ((capv) obj2).d;
                            if (awuiVar3 == null) {
                                awuiVar3 = awui.a;
                            }
                            return awuiVar3.equals(awui.this);
                        }
                    }).flatMap(new Function() { // from class: chsr
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            emyl emylVar2 = chvq.a;
                            return Collection.EL.stream(new eygk(((capv) obj2).e, capv.a));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(endq.b);
                }
                boolean z = false;
                if (collection.contains(capu.ONE_ON_ONE_ENCRYPTION) && collection.contains(capu.GROUP_ENCRYPTION)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, this.w);
    }

    final elfl m(final eyhs eyhsVar, ervi erviVar, final fcek fcekVar, final fbzt fbztVar, final boolean z, final int i, bzge bzgeVar) {
        bzge bzgeVar2;
        final fcek fcekVar2;
        this.y.c("Bugle.Ditto.Responses");
        eyhsVar.getClass();
        final esaa s = s(erviVar);
        if (s != esaa.SETTINGS_UPDATE) {
            return d(eyhsVar, fcekVar, erviVar.b, fbztVar, z, i, s, bzgeVar);
        }
        final String str = erviVar.b;
        if (((cgcu) this.U.b()).a()) {
            bzgeVar2 = bzgeVar;
            fcekVar2 = bzgeVar2.d;
        } else {
            bzgeVar2 = bzgeVar;
            fcekVar2 = fcekVar;
        }
        final bzge bzgeVar3 = bzgeVar2;
        return this.u.j(new Function() { // from class: chtj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bzej bzejVar = (bzej) obj;
                boolean equals = bzejVar.d().equals(fcekVar2);
                chvq chvqVar = chvq.this;
                if (!equals) {
                    return chvqVar.q.a(((cgcu) chvqVar.U.b()).a() ? bzejVar.c().a : bzejVar.d(), ((cgcu) chvqVar.U.b()).a() ? Optional.of(bzejVar.c()) : Optional.empty(), bzejVar.e()).h(new emwl() { // from class: chsg
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            emyl emylVar = chvq.a;
                            return true;
                        }
                    }, erpp.a);
                }
                bzge bzgeVar4 = bzgeVar3;
                esaa esaaVar = s;
                int i2 = i;
                boolean z2 = z;
                fbzt fbztVar2 = fbztVar;
                return chvqVar.d(eyhsVar, fcekVar, str, fbztVar2, z2, i2, esaaVar, bzgeVar4);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).h(new emwl() { // from class: chtk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                emyl emylVar = chvq.a;
                return true;
            }
        }, erpp.a);
    }

    final elfl n(final chwv chwvVar, final String str, final fcek fcekVar, bzge bzgeVar) {
        if (((cgcu) this.U.b()).a()) {
            fcekVar = bzgeVar.d;
        }
        if (!((Optional) this.as.b()).isEmpty()) {
            return ((cikg) ((Optional) this.as.b()).get()).a(chwvVar).h(new emwl() { // from class: chsh
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    fbzx fbzxVar = (fbzx) obj;
                    if (fbzxVar != null) {
                        fcek fcekVar2 = fcekVar;
                        chwv chwvVar2 = chwvVar;
                        String str2 = str;
                        chvq chvqVar = chvq.this;
                        ensk e = chvq.c.e();
                        e.Y(ente.a, "BugleNetwork");
                        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "sendDittoResponseWithRpcHandler", 1557, "DittoChannelRequestHandlerV2.java")).D("Ditto response returned result: %s %s", fbzxVar, ((cgzv) chvqVar.m.b()).y(str2, chwvVar2.c, fcekVar2));
                        ensk h = chvq.c.h();
                        h.Y(ente.a, "BugleNetwork");
                        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "sendDittoResponseWithRpcHandler", 1564, "DittoChannelRequestHandlerV2.java")).t("Sent ditto response for request: %s", ((cgzv) chvqVar.m.b()).y(str2, chwvVar2.c, fcekVar2));
                    }
                    return true;
                }
            }, this.w).e(fedn.class, new emwl() { // from class: chsi
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ensk j = chvq.c.j();
                    j.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) ((enrr) j).g((fedn) obj)).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "sendDittoResponseWithRpcHandler", 1576, "DittoChannelRequestHandlerV2.java")).t("Ditto response to request threw exception %s", ((cgzv) chvq.this.m.b()).y(str, chwvVar.c, fcekVar));
                    return false;
                }
            }, this.w);
        }
        ensk j = c.j();
        j.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "sendDittoResponseWithRpcHandler", 1546, "DittoChannelRequestHandlerV2.java")).q("DittoRetryExecutor is not available on this device.");
        return elfo.d(new UnsupportedOperationException("DittoRetryExecutor is not available on this device."));
    }

    final elfl o(ConversationIdType conversationIdType) {
        return H(conversationIdType, byyt.UNARCHIVED);
    }

    public final elfl p(ConversationIdType conversationIdType) {
        crse o;
        final ParticipantsTable.BindData a2 = crsg.a(((bczy) this.al.a.b()).L(conversationIdType));
        final byyt s = ((bczy) this.r.b()).s(conversationIdType);
        if (cubs.a().booleanValue()) {
            o = crsf.o();
            BugleConversationId bugleConversationId = new BugleConversationId(conversationIdType);
            crrr crrrVar = (crrr) o;
            crrrVar.e = bugleConversationId;
            crrrVar.a = false;
            crrrVar.b = false;
            crrrVar.h = eoko.CONVERSATION_FROM_WEB_ACTION;
            crrrVar.j = 3;
            crrrVar.k = 10;
        } else {
            o = crsf.o();
            crrr crrrVar2 = (crrr) o;
            crrrVar2.d = conversationIdType;
            crrrVar2.a = false;
            crrrVar2.b = false;
            crrrVar2.h = eoko.CONVERSATION_FROM_WEB_ACTION;
            crrrVar2.j = 3;
            crrrVar2.k = 10;
        }
        if (a2 != null) {
            ((crrr) o).f = a2.S();
        }
        return ((crrt) this.i.b()).a(o.a().n()).h(new emwl() { // from class: chux
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                crsn crsnVar = (crsn) obj;
                boolean z = crsnVar != null;
                byyt byytVar = s;
                ParticipantsTable.BindData bindData = ParticipantsTable.BindData.this;
                emyl emylVar = chvq.a;
                return chvq.t(bindData, byytVar, Boolean.valueOf(z), crsnVar);
            }
        }, erpp.a);
    }

    public final elfl q(final ConversationIdType conversationIdType, esdx esdxVar) {
        crsn crsnVar;
        int a2 = esdw.a(esdxVar.f);
        if (a2 == 0) {
            a2 = 1;
        }
        switch (a2 - 2) {
            case 1:
                return e(conversationIdType).h(new chsq(), erpp.a);
            case 2:
                return p(conversationIdType);
            case 3:
                return o(conversationIdType).h(new chsq(), erpp.a);
            case 4:
                return b(conversationIdType).h(new chsq(), erpp.a);
            case 5:
                return h(conversationIdType, false).h(new chsq(), erpp.a);
            case 6:
                return h(conversationIdType, true).h(new chsq(), erpp.a);
            case 7:
                return c(conversationIdType, esdxVar, false);
            case 8:
                return c(conversationIdType, esdxVar, true);
            case 9:
                if (esdxVar.c != 5) {
                    return elfo.e(u(false));
                }
                escl esclVar = (escl) esdxVar.d;
                int a3 = esck.a(esclVar.d);
                if (a3 == 0) {
                    a3 = 1;
                }
                int i = a3 - 2;
                return i != 1 ? i != 2 ? elfo.e(u(false)) : J(conversationIdType, 2, esclVar, false) : ((crsl) this.am.b()).a(conversationIdType).i(new eroh() { // from class: chvi
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        crse o;
                        final ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                        chvq chvqVar = chvq.this;
                        bczy bczyVar = (bczy) chvqVar.r.b();
                        ConversationIdType conversationIdType2 = conversationIdType;
                        final byyt s = bczyVar.s(conversationIdType2);
                        if (cubs.a().booleanValue()) {
                            o = crsf.o();
                            BugleConversationId bugleConversationId = new BugleConversationId(conversationIdType2);
                            crrr crrrVar = (crrr) o;
                            crrrVar.e = bugleConversationId;
                            crrrVar.b = true;
                            crrrVar.h = eoko.CONVERSATION_FROM_WEB_ACTION;
                            crrrVar.j = 3;
                            crrrVar.k = 10;
                        } else {
                            o = crsf.o();
                            crrr crrrVar2 = (crrr) o;
                            crrrVar2.d = conversationIdType2;
                            crrrVar2.b = true;
                            crrrVar2.h = eoko.CONVERSATION_FROM_WEB_ACTION;
                            crrrVar2.j = 3;
                            crrrVar2.k = 10;
                        }
                        if (bindData != null) {
                            ((crrr) o).f = bindData.S();
                        }
                        return ((crrt) chvqVar.i.b()).a(o.a().n()).h(new emwl() { // from class: chvk
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                crsn crsnVar2 = (crsn) obj2;
                                boolean z = crsnVar2 != null;
                                byyt byytVar = s;
                                ParticipantsTable.BindData bindData2 = ParticipantsTable.BindData.this;
                                emyl emylVar = chvq.a;
                                return chvq.t(bindData2, byytVar, Boolean.valueOf(z), crsnVar2);
                            }
                        }, chvqVar.w);
                    }
                }, this.x);
            case 10:
            default:
                esdy esdyVar = (esdy) esdz.a.createBuilder();
                esdyVar.copyOnWrite();
                ((esdz) esdyVar.instance).d = false;
                return elfo.e((esdz) esdyVar.build());
            case 11:
                if (((esdxVar.c == 5 ? (escl) esdxVar.d : escl.a).b & 1) != 0) {
                    return J(conversationIdType, 4, esdxVar.c == 5 ? (escl) esdxVar.d : escl.a, false);
                }
                return elfo.e(u(false));
            case 12:
                if (esdxVar.c != 5) {
                    return elfo.e(u(false));
                }
                escl esclVar2 = (escl) esdxVar.d;
                int a4 = esck.a(esclVar2.d);
                return (a4 != 0 ? a4 : 1) + (-2) != 2 ? elfo.e(u(false)) : J(conversationIdType, 3, esclVar2, false);
            case 13:
                if (esdxVar.c != 5) {
                    return elfo.e(u(false));
                }
                escl esclVar3 = (escl) esdxVar.d;
                if ((esclVar3.b & 2) != 0) {
                    crsnVar = esclVar3.f;
                    if (crsnVar == null) {
                        crsnVar = crsn.a;
                    }
                } else {
                    crsnVar = null;
                }
                return crsnVar != null ? ((crrt) this.i.b()).a(crsc.c(crsnVar, eoko.CONVERSATION_FROM_WEB_ACTION, 10)).h(new emwl() { // from class: chuf
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        boolean z = ((crsn) obj) != null;
                        emyl emylVar = chvq.a;
                        return chvq.u(Boolean.valueOf(z));
                    }
                }, erpp.a) : elfo.e(u(false));
            case 14:
                return ((alxl) this.az.b()).F(engw.r(new BugleConversationId(conversationIdType)), 4).h(new emwl() { // from class: chug
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        emyl emylVar = chvq.a;
                        return chvq.u(true);
                    }
                }, erpp.a);
        }
    }

    final erwu r(erws erwsVar) {
        if (!this.aF.a()) {
            MessageIdType b2 = bdhb.b(erwsVar.b);
            String str = erwsVar.c;
            erwt erwtVar = (erwt) erwu.a.createBuilder();
            if (b2.c() || TextUtils.isEmpty(str)) {
                return (erwu) erwtVar.build();
            }
            bjjd bjjdVar = (bjjd) this.ax.b(b2).o();
            try {
                if (bjjdVar.moveToNext()) {
                    bcse e = this.at.e(bjjdVar);
                    if (((Boolean) bzpf.a.e()).booleanValue()) {
                        bzpi bzpiVar = (bzpi) this.ar.b();
                        bzpg bzpgVar = (bzpg) bzph.a.createBuilder();
                        bzpgVar.a(b2.b());
                        bzpiVar.a((bzph) bzpgVar.build());
                    } else {
                        this.aq.d(e, str).s();
                    }
                    erzn n = ((cgzv) this.m.b()).n(e);
                    erwtVar.copyOnWrite();
                    erwu erwuVar = (erwu) erwtVar.instance;
                    n.getClass();
                    erwuVar.c = n;
                    erwuVar.b |= 1;
                } else {
                    ensk j = c.j();
                    j.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "getFullSizeImageLegacy", 1679, "DittoChannelRequestHandlerV2.java")).t("Message %s no longer exists.", b2);
                }
                erwu erwuVar2 = (erwu) erwtVar.build();
                bjjdVar.close();
                return erwuVar2;
            } catch (Throwable th) {
                try {
                    bjjdVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        MessageIdType b3 = bdhb.b(erwsVar.b);
        String str2 = erwsVar.c;
        erwt erwtVar2 = (erwt) erwu.a.createBuilder();
        if (b3.c() || TextUtils.isEmpty(str2)) {
            return (erwu) erwtVar2.build();
        }
        bifu bifuVar = (bifu) this.ay.a(b3).o();
        try {
            if (!bifuVar.moveToNext() || bifuVar.n()) {
                ensk j2 = c.j();
                j2.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "getFullSizeImage", 1642, "DittoChannelRequestHandlerV2.java")).t("Message %s no longer exists.", b3);
            } else {
                bcse c2 = this.at.c(bifuVar);
                if (((Boolean) bzpf.a.e()).booleanValue()) {
                    bzpi bzpiVar2 = (bzpi) this.ar.b();
                    bzpg bzpgVar2 = (bzpg) bzph.a.createBuilder();
                    bzpgVar2.a(b3.b());
                    bzpiVar2.a((bzph) bzpgVar2.build());
                } else {
                    this.aq.d(c2, str2).s();
                }
                erzn n2 = ((cgzv) this.m.b()).n(c2);
                erwtVar2.copyOnWrite();
                erwu erwuVar3 = (erwu) erwtVar2.instance;
                n2.getClass();
                erwuVar3.c = n2;
                erwuVar3.b |= 1;
            }
            erwu erwuVar4 = (erwu) erwtVar2.build();
            bifuVar.close();
            return erwuVar4;
        } catch (Throwable th3) {
            try {
                bifuVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void v(erwf erwfVar, final ervi erviVar, final fbzt fbztVar, final fcek fcekVar, final bzge bzgeVar) {
        erwg erwgVar;
        int serializedSize;
        final AtomicInteger atomicInteger = new AtomicInteger(1);
        chvp chvpVar = new chvp() { // from class: chue
            @Override // defpackage.chvp
            public final void a(eyfy eyfyVar, boolean z) {
                chvq.this.m(eyfyVar, erviVar, fcekVar, fbztVar, z, atomicInteger.getAndIncrement(), bzgeVar);
            }
        };
        if (erwfVar.b.isEmpty()) {
            chvpVar.a(erwh.a, true);
            return;
        }
        java.util.Collection hashSet = new HashSet(erwfVar.b);
        ArrayList arrayList = new ArrayList(hashSet.size());
        Cursor a2 = this.n.d(hashSet).a();
        if (a2 != null) {
            try {
                I(a2, hashSet, arrayList);
            } finally {
            }
        }
        if (a2 != null) {
            a2.close();
        }
        if (!hashSet.isEmpty()) {
            a2 = this.n.c(hashSet).a();
            if (a2 != null) {
                try {
                    I(a2, hashSet, arrayList);
                } finally {
                }
            }
            if (a2 != null) {
                a2.close();
            }
        }
        int a3 = cidb.a();
        ListIterator listIterator = arrayList.listIterator();
        loop0: while (true) {
            int i = 0;
            erwgVar = null;
            while (listIterator.hasNext()) {
                if (erwgVar == null) {
                    erwgVar = (erwg) erwh.a.createBuilder();
                }
                erun erunVar = (erun) listIterator.next();
                serializedSize = erunVar.getSerializedSize();
                if (serializedSize >= a3) {
                    ensk h = c.h();
                    h.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "getContactsThumbnail", 1901, "DittoChannelRequestHandlerV2.java")).B("Ignore large contact thumbnail. contact=%s, size=%s", erunVar.c, serializedSize);
                } else {
                    int i2 = i + serializedSize;
                    if (i2 < a3) {
                        erwgVar.copyOnWrite();
                        erwh erwhVar = (erwh) erwgVar.instance;
                        erwh erwhVar2 = erwh.a;
                        erunVar.getClass();
                        eygr eygrVar = erwhVar.b;
                        if (!eygrVar.c()) {
                            erwhVar.b = eyfy.mutableCopy(eygrVar);
                        }
                        erwhVar.b.add(erunVar);
                        i = i2;
                    }
                }
            }
            ensk h2 = c.h();
            h2.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "getContactsThumbnail", 1910, "DittoChannelRequestHandlerV2.java")).J("Incomplete contact thumbnail batch response due to size constraint. thumbnail size=%s, currentSize=%s, maxMessageSize=%s", Integer.valueOf(serializedSize), Integer.valueOf(i), Integer.valueOf(a3));
            listIterator.previous();
            chvpVar.a((erwh) erwgVar.build(), false);
        }
        if (erwgVar != null) {
            chvpVar.a((erwh) erwgVar.build(), true);
        } else {
            chvpVar.a(erwh.a, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01da A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(defpackage.erxb r20, final defpackage.ervi r21, final defpackage.fbzt r22, final defpackage.fcek r23, final defpackage.bzge r24) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chvq.w(erxb, ervi, fbzt, fcek, bzge):void");
    }

    public final void x(escu escuVar, List list, bbeo bbeoVar) {
        y(escuVar, list, bbeoVar, null, false);
    }

    public final void y(final escu escuVar, final List list, final bbeo bbeoVar, final String str, final boolean z) {
        elfl c2;
        elfl h;
        if (((asqz) this.aB.b()).a()) {
            cidg cidgVar = (cidg) this.ab.b();
            escuVar.getClass();
            c2 = axol.c(cidgVar.a, ffhe.a, ffsm.a, new cidd(cidgVar, escuVar, null));
            h = c2.h(new emwl() { // from class: chsy
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    Optional optional = (Optional) obj;
                    emyl emylVar = chvq.a;
                    if (optional.isEmpty()) {
                        escu escuVar2 = escu.this;
                        ensk j = chvq.c.j();
                        j.Y(ente.a, "BugleNetwork");
                        enrr enrrVar = (enrr) j;
                        enrrVar.Y(csux.t, Integer.valueOf(escuVar2.c));
                        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "getSelfIdentityForSubscriptionId", 2477, "DittoChannelRequestHandlerV2.java")).q("SelfIdentity for given subId not found");
                    }
                    return optional;
                }
            }, this.w);
        } else {
            h = ((aqvh) this.aC.b()).e();
        }
        h.h(new emwl() { // from class: chuo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chvq chvqVar = chvq.this;
                Optional optional = (Optional) obj;
                List list2 = list;
                bbeo bbeoVar2 = bbeoVar;
                if (!z) {
                    return chvqVar.f.b(list2, null, bbeoVar2, optional);
                }
                Action a2 = chvqVar.f.a(optional, list2, true, str, ((cknc) chvqVar.ac.b()).b());
                bbcc bbccVar = new bbcc(new bbep(bbeoVar2), a2);
                a2.F(bbccVar);
                return bbccVar;
            }
        }, this.w);
    }

    public final void z(final ConversationIdType conversationIdType, final erwx erwxVar, final ervi erviVar, final fcek fcekVar, final fbzt fbztVar, final bzge bzgeVar, final List list) {
        this.aw.b(conversationIdType).i(new eroh() { // from class: chtb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                elfl e;
                engw engwVar = (engw) obj;
                final chvq chvqVar = chvq.this;
                bdeo bdeoVar = (bdeo) chvqVar.s.b();
                ConversationIdType conversationIdType2 = conversationIdType;
                final bcyk a2 = bdeoVar.a(conversationIdType2);
                final erwx erwxVar2 = erwxVar;
                if (a2 == null) {
                    erwxVar2.copyOnWrite();
                    erwz erwzVar = (erwz) erwxVar2.instance;
                    erwz erwzVar2 = erwz.a;
                    erwzVar.d = erwy.a(4);
                    return erqt.i((erwz) erwxVar2.build());
                }
                if (a2.R().d()) {
                    ensk e2 = chvq.c.e();
                    e2.Y(ente.a, "BugleNetwork");
                    enrr enrrVar = (enrr) e2;
                    enrrVar.Y(csux.p, conversationIdType2);
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "handleOnGetOrCreateConversationSucceeded", 2357, "DittoChannelRequestHandlerV2.java")).q("Unarchive");
                    chvqVar.h.a(conversationIdType2, byyt.UNARCHIVED, eoko.CONVERSATION_FROM_WEB_ACTION);
                    a2 = ((bdeo) chvqVar.s.b()).a(conversationIdType2);
                    if (a2 == null) {
                        ensk j = chvq.c.j();
                        j.Y(ente.a, "BugleNetwork");
                        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "handleOnGetOrCreateConversationSucceeded", 2367, "DittoChannelRequestHandlerV2.java")).q("ConversationData after archive is null");
                        erwxVar2.copyOnWrite();
                        erwz erwzVar3 = (erwz) erwxVar2.instance;
                        erwz erwzVar4 = erwz.a;
                        erwzVar3.d = erwy.a(4);
                        return erqt.i((erwz) erwxVar2.build());
                    }
                }
                final List list2 = list;
                boolean z = list2.size() > 1;
                if (z) {
                    e = ((atse) chvqVar.ag.b()).a() ? ((clws) chvqVar.ah.b()).b(a2.f()).i(new eroh() { // from class: chud
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            return chvq.this.f(list2, ((Boolean) obj2).booleanValue());
                        }
                    }, chvqVar.w) : chvqVar.g(list2);
                } else {
                    bcrs bcrsVar = (bcrs) a2;
                    e = elfo.e(Boolean.valueOf(bcrsVar.b.a(((aolr) bcrsVar.a.b()).q((ParticipantsTable.BindData) list2.get(0))).g()));
                }
                final int a3 = z ? 7 : cvfc.a(((ParticipantsTable.BindData) list2.get(0)).t());
                erqt.r(e, axou.a(new csvw(new Consumer() { // from class: chvd
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        chvq chvqVar2 = chvq.this;
                        altk altkVar = (altk) chvqVar2.o.b();
                        bcyk bcykVar = a2;
                        ConversationIdType Q = bcykVar.Q();
                        eoko eokoVar = eoko.CONVERSATION_FROM_WEB_ACTION;
                        List list3 = list2;
                        altkVar.ax(Q, eokoVar, 0, list3.size(), !bcykVar.I(), null, ((Boolean) obj2).booleanValue(), false, bcykVar.L(), chvqVar2.L.d(list3), bcykVar.W(), a3, bcykVar.K(), byyt.i(bcykVar.R()));
                        if (((Boolean) ((cfup) alwj.c.get()).e()).booleanValue()) {
                            ((alwf) chvqVar2.X.b()).c(!bcykVar.I());
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                })), erpp.a);
                return ((cgzv) chvqVar.m.b()).e(a2, engwVar).h(new emwl() { // from class: chvf
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        erur erurVar = (erur) obj2;
                        emyl emylVar = chvq.a;
                        erwx erwxVar3 = erwx.this;
                        erwxVar3.copyOnWrite();
                        erwz erwzVar5 = (erwz) erwxVar3.instance;
                        erwz erwzVar6 = erwz.a;
                        erurVar.getClass();
                        erwzVar5.c = erurVar;
                        erwzVar5.b |= 1;
                        erwxVar3.copyOnWrite();
                        ((erwz) erwxVar3.instance).d = erwy.a(3);
                        return (erwz) erwxVar3.build();
                    }
                }, chvqVar.w);
            }
        }, this.x).i(new eroh() { // from class: chtm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                boolean booleanValue = ((Boolean) ((cfup) bzaq.o.get()).e()).booleanValue();
                final chvq chvqVar = chvq.this;
                final ervi erviVar2 = erviVar;
                final fcek fcekVar2 = fcekVar;
                final fbzt fbztVar2 = fbztVar;
                erwx erwxVar2 = erwxVar;
                final bzge bzgeVar2 = bzgeVar;
                if (!booleanValue) {
                    return chvqVar.m(erwxVar2.build(), erviVar2, fcekVar2, fbztVar2, true, 1, bzgeVar2);
                }
                chrr chrrVar = (chrr) chvqVar.R.b();
                final erwz erwzVar = (erwz) erwxVar2.build();
                final ArrayList arrayList = new ArrayList();
                erur erurVar = erwzVar.c;
                if (erurVar == null) {
                    erurVar = erur.a;
                }
                arrayList.add(chrrVar.d(erurVar, 2));
                return elfo.l(arrayList).a(new Callable() { // from class: chqv
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        erwx erwxVar3 = (erwx) erwz.this.toBuilder();
                        erwxVar3.copyOnWrite();
                        erwz erwzVar2 = (erwz) erwxVar3.instance;
                        erwzVar2.c = null;
                        erwzVar2.b &= -2;
                        erur erurVar2 = (erur) erqt.q((Future) arrayList.get(0));
                        erwxVar3.copyOnWrite();
                        erwz erwzVar3 = (erwz) erwxVar3.instance;
                        erurVar2.getClass();
                        erwzVar3.c = erurVar2;
                        erwzVar3.b |= 1;
                        return (erwz) erwxVar3.build();
                    }
                }, chrrVar.b).i(new eroh() { // from class: chur
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return chvq.this.m((erwz) obj2, erviVar2, fcekVar2, fbztVar2, true, 1, bzgeVar2);
                    }
                }, chvqVar.x);
            }
        }, this.x).k(axnw.b(), erpp.a);
    }
}

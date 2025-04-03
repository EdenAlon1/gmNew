package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amho implements aqge {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationPropertiesSupplier");
    public final ctbl b;
    public final ffbr c;
    public final errl d;
    public final errl e;
    public final ffbr f;
    public final BugleConversationId g;
    public final beci h;
    public final aqvh i;
    public final aqge j;
    public final amsm k;
    public ctbx l;
    public final aqvh m;
    public final aolr n;
    public final ffbr o;
    public final ffbr p;
    public final ffbr q;
    public final atly r;

    public amho(ctbk ctbkVar, ffbr ffbrVar, errl errlVar, errl errlVar2, becj becjVar, aqvh aqvhVar, amsk amskVar, aolr aolrVar, aqvh aqvhVar2, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, atly atlyVar, BugleConversationId bugleConversationId) {
        this.b = ctbkVar.a(new amhn(this));
        this.c = ffbrVar;
        this.d = errlVar;
        this.e = errlVar2;
        this.f = ffbrVar3;
        this.g = bugleConversationId;
        this.h = new beci((ctbk) becjVar.a.b(), i(bugleConversationId), new Consumer() { // from class: amgt
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                Pair pair = (Pair) obj;
                ((dtrs) pair.second).gb((bsnz) pair.first);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, "getPropertiesById");
        this.i = aqvhVar;
        this.j = aqvhVar.a();
        amsl a2 = amskVar.a();
        aqge d = ((aqkp) ffbrVar4.b()).d(bugleConversationId);
        amtb amtbVar = a2.a;
        ffsk ffskVar = (ffsk) amtbVar.a.b();
        ffskVar.getClass();
        ffsk ffskVar2 = (ffsk) amtbVar.b.b();
        ffskVar2.getClass();
        ctbk ctbkVar2 = (ctbk) amtbVar.c.b();
        ctbkVar2.getClass();
        becj becjVar2 = (becj) amtbVar.d.b();
        becjVar2.getClass();
        ffbr ffbrVar7 = amtbVar.g;
        this.k = new amta(ffskVar, ffskVar2, ctbkVar2, becjVar2, amtbVar.e, amtbVar.f, bugleConversationId, d, ffbrVar7);
        this.n = aolrVar;
        this.m = aqvhVar2;
        this.o = ffbrVar2;
        this.p = ffbrVar5;
        this.q = ffbrVar6;
        this.r = atlyVar;
    }

    public static amny d(bseh bsehVar) {
        return !bsehVar.aF("parental_approval_status") ? amny.a : bsehVar.ay("parental_approval_status").equals("1") ? amny.b : amny.c;
    }

    public static Optional g(engw engwVar, final SelfIdentityId selfIdentityId) {
        return selfIdentityId == null ? Optional.empty() : Collection.EL.stream(engwVar).filter(new Predicate() { // from class: amgw
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
                return ((aqux) obj).g().equals(SelfIdentityId.this);
            }
        }).findFirst();
    }

    public static String h(Optional optional) {
        aqux aquxVar = (aqux) optional.orElse(null);
        return aquxVar != null ? aquxVar.o() : "unavailable";
    }

    private static bsnz i(final BugleConversationId bugleConversationId) {
        Object apply;
        bskq bskqVar = bsom.c.a;
        bskp bskpVar = bsom.c;
        engw C = engw.C(bskqVar, bskpVar.O, bskpVar.R, bskpVar.q, bskpVar.c, bskpVar.d, bskpVar.ak, bskpVar.N, bskpVar.p, bskpVar.P, bskpVar.H, bskpVar.A, bskpVar.t, bskpVar.aq, bskpVar.ap, bskpVar.ab, bskpVar.aa, bskpVar.M, bskpVar.y, bskpVar.an, bskpVar.ar, bskpVar.af, bskpVar.as);
        engr engrVar = new engr();
        engrVar.j(C);
        engrVar.h(bsom.c.ag);
        if (ersy.a("bugle.enable_zinnia_in_conversations", "bugle")) {
            engrVar.h(bsom.c.au);
        }
        engrVar.h(bsom.c.D);
        if (ersy.a("bugle.destination_token_in_mapi", "bugle")) {
            engrVar.h(bsom.c.C);
        }
        bsob e = bsom.e();
        e.z("getConversationRowByIdQuery");
        e.c((bskq[]) Collection.EL.toArray(engrVar.g(), new IntFunction() { // from class: amgx
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return new bskq[i];
            }
        }));
        e.i(new Function() { // from class: amgy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                bsolVar.q(BugleConversationId.this.a);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        String[] strArr = bvin.a;
        bvik bvikVar = new bvik(bvin.a);
        bvikVar.c(bvin.c.a);
        apply = new Function() { // from class: amgz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvim bvimVar = (bvim) obj;
                bvimVar.b(BugleConversationId.this.a);
                return bvimVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bvim());
        bvikVar.k(new bvil((bvim) apply));
        e.n(new dtyn(bvikVar.b()), "parental_approval_status");
        return e.b();
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.b.a(new ctbf() { // from class: amhb
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "BugleConversationPropertiesSupplier::register", "BugleConversationPropertiesSupplier::callback", "BugleConversationPropertiesSupplier::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        ekzz f = eleg.f("getPropertiesForConversation");
        try {
            Instant instant = Instant.EPOCH;
            elfl i = i(this.g).w().i(new eroh() { // from class: amgh
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    Uri parse;
                    elfl b;
                    engw engwVar = (engw) obj;
                    final amfn amfnVar = new amfn();
                    amfnVar.b(byyt.UNARCHIVED);
                    amfnVar.g(0);
                    amfnVar.q(true);
                    amfnVar.l(false);
                    amfnVar.k(ayhd.NONE);
                    amfnVar.o(0);
                    amfnVar.u(eoxn.SEND_MODE_AUTO);
                    amfnVar.e = null;
                    amfnVar.h(false);
                    amfnVar.f = null;
                    amfnVar.n(false);
                    amfnVar.m(false);
                    amfnVar.t(-1L);
                    amfnVar.w(false);
                    amfnVar.v(false);
                    amfnVar.r(new amtc(amtd.HIDDEN, null));
                    amfnVar.j = null;
                    amfnVar.s(amny.b);
                    amfnVar.p(ckte.a);
                    amfnVar.c(false);
                    amfnVar.f(false);
                    amfnVar.e(false);
                    amfnVar.k = true;
                    int i2 = amfnVar.m | 16384;
                    amfnVar.l = true;
                    amfnVar.m = (short) (((short) i2) | Short.MIN_VALUE);
                    amfnVar.j(cfmh.a);
                    amfnVar.d();
                    cjcn cjcnVar = cjcn.b;
                    if (cjcnVar == null) {
                        throw new NullPointerException("Null conversationMuteThreshold");
                    }
                    final amho amhoVar = amho.this;
                    amfnVar.i = cjcnVar;
                    amfnVar.i(azcr.a);
                    BugleConversationId bugleConversationId = amhoVar.g;
                    if (bugleConversationId == null) {
                        throw new NullPointerException("Null id");
                    }
                    amfnVar.a = bugleConversationId;
                    if (engwVar.isEmpty()) {
                        amfnVar.h(true);
                        return elfo.e(amfnVar.a());
                    }
                    final bseh bsehVar = (bseh) enjk.l(engwVar);
                    Instant instant2 = bsehVar.P().isPresent() ? (Instant) bsehVar.P().get() : null;
                    amfnVar.g(bsehVar.k());
                    amfnVar.l(bsehVar.am());
                    amfnVar.k(bsehVar.A());
                    amfnVar.o(bsehVar.m());
                    int r = bsehVar.r();
                    amfnVar.u(r != 0 ? r != 1 ? r != 2 ? eoxn.UNKNOWN_SEND_MODE : eoxn.SEND_MODE_XMS_LATCH : eoxn.SEND_MODE_XMS : eoxn.SEND_MODE_AUTO);
                    amfnVar.b = (amho.d(bsehVar) == amny.b || !byyr.b(bsehVar.k())) ? bsehVar.X() : ((Context) amhoVar.c.b()).getString(R.string.unapproved_group_conversation_name);
                    amfnVar.q(bsehVar.H() != byyy.NAME_IS_MANUAL);
                    amfnVar.b(bsehVar.G());
                    if (amho.d(bsehVar) == amny.c) {
                        parse = Uri.parse("android.resource://com.google.android.apps.messaging.shared.kids/" + cggq.a(bsehVar.q()));
                        parse.getClass();
                    } else {
                        parse = bsehVar.G() == byyt.CROSS_COUNTRY_FOLDER ? cuqo.a : bsehVar.W() != null ? Uri.parse(bsehVar.W()) : null;
                    }
                    amfnVar.f = parse;
                    amfnVar.t(bsehVar.v());
                    amfnVar.g = bsehVar.aa();
                    amfnVar.n(bsehVar.ao());
                    amfnVar.m(bsehVar.l() == 1);
                    amfnVar.w(bsehVar.al());
                    amfnVar.c = bsehVar.ac();
                    amfnVar.d = bsehVar.ad();
                    amfnVar.h = instant2;
                    ckkz J = bsehVar.J();
                    amfnVar.j = J != null ? new amhi(J) : null;
                    amfnVar.v(bsehVar.ar());
                    amfnVar.p(bsehVar.L());
                    amfnVar.s(amho.d(bsehVar));
                    amfnVar.d();
                    if (((augw) amhoVar.f.b()).a()) {
                        amfnVar.j(bsehVar.I());
                    }
                    if (amhoVar.r.a()) {
                        azcr B = bsehVar.B();
                        if (B != null) {
                            amfnVar.i(B);
                        } else {
                            amfnVar.i(azcr.a);
                        }
                    }
                    if (((asvn) amhoVar.o.b()).a() && bsehVar.k() == 0 && amhoVar.n.p(emxe.b(bsehVar.aa())).C()) {
                        ensk h = amho.a.h();
                        h.Y(ente.a, "BugleConversation");
                        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationPropertiesSupplier", "lookupActiveSelfIdentity", 317, "BugleConversationPropertiesSupplier.java")).q("Conversation type is satellite. Setting satellite self identity as active.");
                        return amhoVar.m.a().b().h(new emwl() { // from class: amgk
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                Optional findFirst = Collection.EL.stream((engw) obj2).findFirst();
                                final amij amijVar = amij.this;
                                findFirst.ifPresent(new Consumer() { // from class: amha
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void o(Object obj3) {
                                        ((amfn) amij.this).e = (aqux) obj3;
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                                return amijVar.a();
                            }
                        }, amhoVar.d);
                    }
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                    final SelfIdentityId c = aqvf.c(bsehVar.S());
                    if (((ausa) amhoVar.p.b()).a()) {
                        ensk h2 = amho.a.h();
                        h2.Y(ente.a, "BugleConversation");
                        ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationPropertiesSupplier", "lookupActiveSelfIdentity", 337, "BugleConversationPropertiesSupplier.java")).q("Satellite flag on. Using connection type for self identity detection.");
                        b = amhoVar.m.b().b().i(new eroh() { // from class: amgl
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                amho amhoVar2 = amho.this;
                                if (((aqvj) obj2) != aqvj.e) {
                                    ensk h3 = amho.a.h();
                                    h3.Y(ente.a, "BugleConversation");
                                    ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationPropertiesSupplier", "lookupActiveSelfIdentity", 353, "BugleConversationPropertiesSupplier.java")).q("Connection type is not manual connect. Using regular self identity");
                                    return amhoVar2.j.b();
                                }
                                AtomicBoolean atomicBoolean2 = atomicBoolean;
                                ensk h4 = amho.a.h();
                                h4.Y(ente.a, "BugleConversation");
                                ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationPropertiesSupplier", "lookupActiveSelfIdentity", 345, "BugleConversationPropertiesSupplier.java")).q("Connection type is manual satellite. Replacing active self identity with satellite.");
                                atomicBoolean2.set(false);
                                return amhoVar2.m.a().b();
                            }
                        }, amhoVar.d);
                    } else {
                        ensk h3 = amho.a.h();
                        h3.Y(ente.a, "BugleConversation");
                        ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationPropertiesSupplier", "lookupActiveSelfIdentity", 360, "BugleConversationPropertiesSupplier.java")).q("Satellite flag off. Not using connection type for self identity detection.");
                        b = amhoVar.j.b();
                    }
                    final elfl elflVar = b;
                    final elfl i3 = elflVar.i(new eroh() { // from class: amgm
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            elfl c2;
                            engw engwVar2 = (engw) obj2;
                            int k = bsehVar.k();
                            Integer valueOf = Integer.valueOf(k);
                            if (!((Boolean) ((cfup) ctjd.aF.get()).e()).booleanValue()) {
                                return elfo.e(new amtc(amtd.HIDDEN, null));
                            }
                            Optional g = amho.g(engwVar2, c);
                            if (!g.isPresent()) {
                                return elfo.e(new amtc(amtd.HIDDEN, null));
                            }
                            amho amhoVar2 = amho.this;
                            aqux aquxVar = (aqux) g.get();
                            valueOf.getClass();
                            amta amtaVar = (amta) amhoVar2.k;
                            c2 = axol.c(amtaVar.a, ffhe.a, ffsm.a, new amsq(amtaVar, aquxVar, k, null));
                            return c2;
                        }
                    }, amhoVar.e);
                    return elfo.k(elflVar, i3).b(new erog() { // from class: amgn
                        @Override // defpackage.erog
                        public final ListenableFuture a() {
                            final engw engwVar2 = (engw) erqt.q(elflVar);
                            AtomicBoolean atomicBoolean2 = atomicBoolean;
                            final Optional g = atomicBoolean2.get() ? amho.g(engwVar2, c) : Collection.EL.stream(engwVar2).findFirst();
                            final bseh bsehVar2 = bsehVar;
                            final amij amijVar = amfnVar;
                            elfl elflVar2 = i3;
                            final amho amhoVar2 = amho.this;
                            amijVar.r((amtc) erqt.q(elflVar2));
                            if (g.isEmpty() || !((aqux) g.get()).t()) {
                                return bsehVar2.ad() != null ? amhoVar2.f(bsehVar2.C(), engwVar2, amijVar) : amhoVar2.i.e().i(new eroh() { // from class: amhc
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        Optional optional = (Optional) obj2;
                                        ensk h4 = amho.a.h();
                                        h4.Y(ente.a, "BugleConversation");
                                        ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationPropertiesSupplier", "setLegacyDefaultSelfIdentity", 598, "BugleConversationPropertiesSupplier.java")).t("Current active self identity: %s", amho.h(optional));
                                        aqux aquxVar = (aqux) optional.orElse(null);
                                        amij amijVar2 = amij.this;
                                        ((amfn) amijVar2).e = aquxVar;
                                        return elfo.e(amijVar2.a());
                                    }
                                }, amhoVar2.d);
                            }
                            if (bsehVar2.ad() != null && (!((ausa) amhoVar2.p.b()).a() || atomicBoolean2.get())) {
                                return ((aqux) g.get()).e().b().i(new eroh() { // from class: amhe
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        boolean a2 = ((aqys) obj2).a();
                                        amij amijVar2 = amijVar;
                                        if (a2) {
                                            Optional optional = g;
                                            ensk h4 = amho.a.h();
                                            h4.Y(ente.a, "BugleConversation");
                                            ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationPropertiesSupplier", "lookupActiveSelfIdentity", 409, "BugleConversationPropertiesSupplier.java")).t("Current active self identity: %s", amho.h(optional));
                                            ((amfn) amijVar2).e = (aqux) optional.get();
                                            return elfo.e(amijVar2.a());
                                        }
                                        engw engwVar3 = engwVar2;
                                        bseh bsehVar3 = bsehVar2;
                                        amho amhoVar3 = amho.this;
                                        ensk h5 = amho.a.h();
                                        h5.Y(ente.a, "BugleConversation");
                                        ((enrr) ((enrr) h5).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationPropertiesSupplier", "lookupActiveSelfIdentity", 403, "BugleConversationPropertiesSupplier.java")).q("Current active selfId not available, trying to update to a different self identity in group.");
                                        return amhoVar3.f(bsehVar3.C(), engwVar3, amijVar2);
                                    }
                                }, amhoVar2.e);
                            }
                            ensk h4 = amho.a.h();
                            h4.Y(ente.a, "BugleConversation");
                            ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationPropertiesSupplier", "lookupActiveSelfIdentity", 417, "BugleConversationPropertiesSupplier.java")).t("Current active self identity: %s", amho.h(g));
                            ((amfn) amijVar).e = (aqux) g.get();
                            return elfo.e(amijVar.a());
                        }
                    }, amhoVar.e).i(new eroh() { // from class: amgo
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            final bseh bsehVar2 = bsehVar;
                            final amik amikVar = (amik) obj2;
                            if (!byyr.d(bsehVar2.k()) || amikVar.f() == null) {
                                return elfo.e(amikVar);
                            }
                            aqux f2 = amikVar.f();
                            f2.getClass();
                            if (!f2.t()) {
                                return elfo.e(amikVar);
                            }
                            amho amhoVar2 = amho.this;
                            return f2.e().b().h(new emwl() { // from class: amgi
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    bseh bsehVar3 = bseh.this;
                                    aqys aqysVar = (aqys) obj3;
                                    boolean z = false;
                                    if (bsehVar3.K().d(ckng.REMOVE_USER_BY_ALL) && bsehVar3.m() == 0 && aqysVar.a()) {
                                        z = true;
                                    }
                                    return Boolean.valueOf(z);
                                }
                            }, amhoVar2.e).h(new emwl() { // from class: amhf
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    amij y = amik.this.y();
                                    y.c(((Boolean) obj3).booleanValue());
                                    return y.a();
                                }
                            }, amhoVar2.e);
                        }
                    }, amhoVar.e).i(((atzo) amhoVar.q.b()).a() ? new eroh() { // from class: amgp
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            final bseh bsehVar2 = bsehVar;
                            final amik amikVar = (amik) obj2;
                            int m = bsehVar2.m();
                            final boolean e = byyr.e(bsehVar2.k());
                            final boolean d = byyr.d(bsehVar2.k());
                            aqux f2 = amikVar.f();
                            if (f2 != null && m == 0) {
                                if (!e) {
                                    if (d) {
                                        d = true;
                                    }
                                }
                                return f2.e().b().h(new emwl() { // from class: amgf
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        boolean z = true;
                                        boolean z2 = d && ((aqys) obj3).a();
                                        amik amikVar2 = amikVar;
                                        cknh K = bsehVar2.K();
                                        amij y = amikVar2.y();
                                        if ((!z2 || !K.d(ckng.NAME_CHANGE)) && !e) {
                                            z = false;
                                        }
                                        y.f(z);
                                        y.e(z2);
                                        return y.a();
                                    }
                                }, amho.this.d);
                            }
                            amij y = amikVar.y();
                            y.f(false);
                            y.e(false);
                            return elfo.e(y.a());
                        }
                    } : new eroh() { // from class: amgq
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            elfl e;
                            final bseh bsehVar2 = bsehVar;
                            final amik amikVar = (amik) obj2;
                            boolean b2 = byyr.b(bsehVar2.k());
                            amho amhoVar2 = amho.this;
                            if (!b2) {
                                e = elfo.e(false);
                            } else if (byyr.e(bsehVar2.k())) {
                                e = elfo.e(true);
                            } else if (amikVar.f() == null) {
                                e = elfo.e(false);
                            } else {
                                aqux f2 = amikVar.f();
                                f2.getClass();
                                e = !f2.t() ? elfo.e(false) : f2.e().b().h(new emwl() { // from class: amge
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        bseh bsehVar3 = bseh.this;
                                        aqys aqysVar = (aqys) obj3;
                                        boolean z = false;
                                        if (bsehVar3.K().d(ckng.NAME_CHANGE) && bsehVar3.m() == 0 && aqysVar.a()) {
                                            z = true;
                                        }
                                        return Boolean.valueOf(z);
                                    }
                                }, amhoVar2.e);
                            }
                            return e.h(new emwl() { // from class: amgg
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    amij y = amik.this.y();
                                    y.f(((Boolean) obj3).booleanValue());
                                    return y.a();
                                }
                            }, amhoVar2.e);
                        }
                    }, ((atzo) amhoVar.q.b()).a() ? amhoVar.d : amhoVar.e);
                }
            }, this.d);
            f.b(i);
            f.close();
            return i;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final elfl e() {
        return elfo.f(new Runnable() { // from class: amgu
            @Override // java.lang.Runnable
            public final void run() {
                amho.this.b.c(new Supplier() { // from class: amhd
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return null;
                    }
                }, "BugleConversationPropertiesSupplier::Notify");
            }
        }, this.d);
    }

    public final elfl f(final ConversationIdType conversationIdType, final engw engwVar, final amij amijVar) {
        return elfo.g(new Callable() { // from class: amgs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final engw engwVar2 = engw.this;
                final enip enipVar = (enip) Collection.EL.stream(engwVar2).map(new Function() { // from class: amhg
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((aqux) obj).m().flatMap(new Function() { // from class: amgj
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return Optional.ofNullable(((aoku) obj2).l());
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new Predicate() { // from class: amhh
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
                        return ((Optional) obj).isPresent();
                    }
                }).map(new Function() { // from class: amfz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return (String) ((Optional) obj).get();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(endq.b);
                if (enipVar.isEmpty()) {
                    return Optional.empty();
                }
                final ConversationIdType conversationIdType2 = conversationIdType;
                bvvn e = ParticipantsTable.e();
                e.z("activeSelfAsOtherParticipant");
                e.h(new Function() { // from class: amga
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bvvw bvvwVar = (bvvw) obj;
                        bvvwVar.s(enip.this);
                        String[] strArr = bsdr.a;
                        bsdm bsdmVar = new bsdm(bsdr.a);
                        final ConversationIdType conversationIdType3 = conversationIdType2;
                        bsdmVar.f(new Function() { // from class: amgr
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                bsdq bsdqVar = (bsdq) obj2;
                                bsdqVar.b(ConversationIdType.this);
                                return bsdqVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bsdmVar.c(bsdr.c.b);
                        bvvwVar.l(bsdmVar.b());
                        return bvvwVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                Optional findAny = Collection.EL.stream(e.b().y()).findAny();
                return findAny.isEmpty() ? Optional.empty() : findAny.map(new Function() { // from class: amgb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((ParticipantsTable.BindData) obj).U();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).flatMap(new Function() { // from class: amgc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        final String str = (String) obj;
                        return Collection.EL.stream(engw.this).filter(new Predicate() { // from class: amfy
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
                                return str.equals(((aqux) obj2).m().map(new Function() { // from class: amgd
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        return ((aoku) obj3).l();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).orElse(null));
                            }
                        }).findAny();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, this.e).h(new emwl() { // from class: amgv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                ensk h = amho.a.h();
                h.Y(ente.a, "BugleConversation");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationPropertiesSupplier", "updatedConversationSelfId", 470, "BugleConversationPropertiesSupplier.java")).t("Current active self identity: %s", amho.h(optional));
                aqux aquxVar = (aqux) optional.orElse(null);
                amij amijVar2 = amij.this;
                ((amfn) amijVar2).e = aquxVar;
                return amijVar2.a();
            }
        }, this.e);
    }
}

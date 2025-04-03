package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayiu implements ayif {
    public static final cskc a;
    public static final enru b;
    public static final cfup c;
    public static final int d;
    public final ffbr e;
    public final ffbr f;
    public final errl g;
    private final ffbr h;
    private final errl i;
    private final ecrj j;

    static {
        cskc g = cskc.g("Bugle", "ConversationMatcherCache");
        a = g;
        b = enru.c("com/google/android/apps/messaging/shared/conversation/match/ConversationMatcherCache");
        cfup i = cfvl.i(cfvl.b, "bcm_detailed_crash_log_on_moat", false);
        c = i;
        d = 1;
        if (((Boolean) i.e()).booleanValue()) {
            g.p("Enabling monitoring for conversations and conversations cache table");
            String[] strArr = bsom.a;
            dtua.b("conversations", 1);
            String[] strArr2 = aykg.a;
            dtua.b("conversation_matcher_cache", 1);
        }
    }

    public ayiu(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, errl errlVar, errl errlVar2, ecrj ecrjVar) {
        this.h = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = errlVar;
        this.i = errlVar2;
        this.j = ecrjVar;
    }

    public static engw u(final ayit ayitVar) {
        Object apply;
        String[] strArr = aykg.a;
        aykd aykdVar = new aykd(aykg.a);
        aykdVar.z("findWithTwoQueries");
        apply = new Function() { // from class: ayiq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str = ((ayhe) ayit.this).a;
                aykf aykfVar = (aykf) obj;
                cskc cskcVar = ayiu.a;
                aykfVar.aq(new dtrt("conversation_matcher_cache.destination_key", 1, str));
                aykfVar.c(ayiu.d);
                return aykfVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new aykf());
        aykdVar.k(new ayke((aykf) apply));
        ayjr ayjrVar = (ayjr) aykdVar.b().p(aykg.b.d);
        try {
            engw c2 = ayjrVar.c();
            ayjrVar.close();
            return c2;
        } catch (Throwable th) {
            try {
                ayjrVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void v(String str, Optional optional) {
        if (optional.isEmpty()) {
            return;
        }
        x(new ayhe(str), ((bseh) optional.get()).C());
    }

    public static void w(engw engwVar, Optional optional) {
        if (optional.isEmpty()) {
            return;
        }
        x(ayit.b(engwVar), ((bseh) optional.get()).C());
    }

    private static void x(ayit ayitVar, ConversationIdType conversationIdType) {
        String[] strArr = aykg.a;
        ayjf ayjfVar = new ayjf();
        ayjfVar.c(((ayhe) ayitVar).a);
        ayjfVar.d(d);
        ayjfVar.b(conversationIdType);
        final ayjc a2 = ayjfVar.a();
        final dtve a3 = aykg.a();
        dtub.b(aykg.a(), "conversation_matcher_cache", a2, new Function() { // from class: ayiz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.T("conversation_matcher_cache", (ContentValues) obj, 4));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: ayja
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    ayjc ayjcVar = ayjc.this;
                    ayjcVar.a = new ayiy(l).a.longValue();
                    ayjcVar.fY(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ayif
    public final /* synthetic */ bseh a(aoku aokuVar, ffbr ffbrVar) {
        return ayie.a(this, aokuVar, ffbrVar);
    }

    @Override // defpackage.ayif
    public final bseh b(final String str, final ffbr ffbrVar) {
        emxf.l(!efbd.g());
        bseh t = t(new ayhe(str));
        return t != null ? t : (bseh) ((dtuu) this.h.b()).c("ConversationMatcherCache#findOrCreate1to1ConversationSync", new emyl() { // from class: ayil
            @Override // defpackage.emyl
            public final Object get() {
                ayiu ayiuVar = ayiu.this;
                ayif ayifVar = (ayif) ayiuVar.e.b();
                String str2 = str;
                ffbr ffbrVar2 = ffbrVar;
                bseh b2 = ayifVar.b(str2, ffbrVar2);
                ayiu.v(str2, Optional.of(b2));
                if (((arel) ayiuVar.f.b()).a()) {
                    Stream filter = Collection.EL.stream(((bdgd) ffbrVar2.b()).g()).map(new Function() { // from class: ayio
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
                    }).filter(new Predicate() { // from class: ayip
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
                            cskc cskcVar = ayiu.a;
                            return !emxe.c((String) obj);
                        }
                    });
                    int i = engw.d;
                    engw engwVar = (engw) filter.collect(endq.a);
                    if (!engwVar.isEmpty() && !str2.equals(engwVar.get(0))) {
                        ayiu.w(engwVar, Optional.of(b2));
                    }
                    if (engwVar.size() != 1) {
                        csjb e = ayiu.a.e();
                        e.I("BCM: Normalized destination size is not 1 for 1:1 conversation");
                        e.A("destination", str2);
                        e.A("Normalized destination", engwVar.toString());
                        e.r();
                    }
                }
                return b2;
            }
        });
    }

    @Override // defpackage.ayif
    public final /* synthetic */ bseh c(java.util.Collection collection, ffbr ffbrVar) {
        return ayie.b(this, collection, ffbrVar);
    }

    @Override // defpackage.ayif
    public final bseh d(final engw engwVar, final ffbr ffbrVar) {
        emxf.l(!efbd.g());
        bseh t = t(ayit.b(engwVar));
        return t != null ? t : (bseh) ((dtuu) this.h.b()).c("ConversationMatcherCache#findOrCreateConversationSync", new emyl() { // from class: ayij
            @Override // defpackage.emyl
            public final Object get() {
                ayif ayifVar = (ayif) ayiu.this.e.b();
                engw engwVar2 = engwVar;
                bseh d2 = ayifVar.d(engwVar2, ffbrVar);
                ayiu.w(engwVar2, Optional.of(d2));
                return d2;
            }
        });
    }

    @Override // defpackage.ayif
    public final /* synthetic */ elfl e(aoku aokuVar) {
        return ayie.c(this, aokuVar);
    }

    @Override // defpackage.ayif
    public final elfl f(final String str) {
        return elfo.g(new Callable() { // from class: ayig
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ayiu.this.q(str);
            }
        }, this.g);
    }

    @Override // defpackage.ayif
    public final /* synthetic */ elfl g(String str) {
        return ayie.d(this, str);
    }

    @Override // defpackage.ayif
    public final elfl h(engw engwVar) {
        return ((ayif) this.e.b()).h(engwVar);
    }

    @Override // defpackage.ayif
    public final elfl i(aoku aokuVar, java.util.Collection collection) {
        return ((ayif) this.e.b()).i(aokuVar, collection);
    }

    @Override // defpackage.ayif
    public final elfl j(final engw engwVar) {
        return elfo.g(new Callable() { // from class: ayim
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ayiu.this.t(ayit.b(engwVar));
            }
        }, this.g).i(new eroh() { // from class: ayin
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                bseh bsehVar = (bseh) obj;
                if (bsehVar != null) {
                    return elfo.e(Optional.of(bsehVar));
                }
                final engw engwVar2 = engwVar;
                ayiu ayiuVar = ayiu.this;
                return ((ayif) ayiuVar.e.b()).j(engwVar2).h(new emwl() { // from class: ayir
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        Optional optional = (Optional) obj2;
                        ayiu.w(engw.this, optional);
                        return optional;
                    }
                }, ayiuVar.g);
            }
        }, this.i);
    }

    @Override // defpackage.ayif
    public final /* synthetic */ elfl k(java.util.Collection collection) {
        return ayie.e(this, collection);
    }

    @Override // defpackage.ayif
    public final /* synthetic */ elfl l(aoku aokuVar, ffbr ffbrVar) {
        return ayie.f(this, aokuVar, ffbrVar);
    }

    @Override // defpackage.ayif
    public final elfl m(final String str, final ffbr ffbrVar) {
        return elfo.g(new Callable() { // from class: ayik
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ayiu.this.b(str, ffbrVar);
            }
        }, this.g);
    }

    @Override // defpackage.ayif
    public final /* synthetic */ Optional n(aoku aokuVar) {
        return ayie.g(this, aokuVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType] */
    @Override // defpackage.ayif
    public final Optional o(String str) {
        ayhe ayheVar = new ayhe(str);
        ecri d2 = this.j.d();
        fgmh fgmhVar = null;
        try {
            engw u = u(ayheVar);
            if (((enou) u).c == 1) {
                ?? r1 = (ConversationIdType) u.get(0);
                this.j.f(d2, new ecda("ConversationMatcher#findCachedConversationId"), null, ecrh.SUCCESS);
                fgmhVar = r1;
            }
            if (fgmhVar != null) {
                return Optional.of(fgmhVar);
            }
            Optional o = ((ayif) this.e.b()).o(str);
            if (o.isPresent()) {
                x(new ayhe(str), (ConversationIdType) o.get());
            }
            return o;
        } finally {
            this.j.f(d2, new ecda("ConversationMatcher#findCachedConversationId"), null, ecrh.SUCCESS);
        }
    }

    @Override // defpackage.ayif
    public final /* synthetic */ Optional p(aoku aokuVar) {
        return ayie.h(this, aokuVar);
    }

    @Override // defpackage.ayif
    public final Optional q(String str) {
        emxf.l(!efbd.g());
        bseh t = t(new ayhe(str));
        if (t != null) {
            return Optional.of(t);
        }
        Optional q = ((ayif) this.e.b()).q(str);
        v(str, q);
        return q;
    }

    @Override // defpackage.ayif
    public final /* synthetic */ Optional r(java.util.Collection collection) {
        return ayie.i(this, collection);
    }

    @Override // defpackage.ayif
    public final Optional s(engw engwVar) {
        emxf.l(!efbd.g());
        bseh t = t(ayit.b(engwVar));
        if (t != null) {
            return Optional.of(t);
        }
        Optional s = ((ayif) this.e.b()).s(engwVar);
        w(engwVar, s);
        return s;
    }

    public final bseh t(final ayit ayitVar) {
        ecri d2 = this.j.d();
        try {
            return (bseh) ((dtuu) this.h.b()).c("ConversationMatcherCache#findCachedConversation", new emyl() { // from class: ayii
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.emyl
                public final Object get() {
                    Object obj;
                    final engw u = ayiu.u(ayit.this);
                    enou enouVar = (enou) u;
                    boolean z = true;
                    if (enouVar.c != 1) {
                        csjb a2 = ayiu.a.a();
                        a2.I("BCM: Conversation not found in cache");
                        a2.y("cacheEntry.size()", enouVar.c);
                        a2.r();
                        return null;
                    }
                    csjb a3 = ayiu.a.a();
                    a3.I("BCM: Returning conversation from cache");
                    int i = 0;
                    a3.c((ConversationIdType) u.get(0));
                    a3.r();
                    bseh bsehVar = (bseh) bsom.j((ConversationIdType) u.get(0), new Function() { // from class: ayis
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bseh bsehVar2 = (bseh) obj2;
                            cskc cskcVar = ayiu.a;
                            return bsehVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    if (bsehVar != null) {
                        return bsehVar;
                    }
                    if (((Boolean) ayiu.c.e()).booleanValue()) {
                        enrr enrrVar = (enrr) ayiu.b.j();
                        enrrVar.aa(ensy.MEDIUM);
                        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/conversation/match/ConversationMatcherCache", "printConversationsAndConversationsCacheEntry", 241, "ConversationMatcherCache.java")).t("BCM: Conversation found in cache but not found in ConversationsTable for conversation Id: %s", u.get(0));
                        csjb e = ayiu.a.e();
                        e.I("Printing conversations");
                        e.y("Cache size", enouVar.c);
                        e.r();
                        bsob e2 = bsom.e();
                        e2.z("findWithTwoQueries2");
                        engw y = e2.b().y();
                        enou enouVar2 = (enou) y;
                        int i2 = enouVar2.c;
                        int i3 = 0;
                        while (i3 < i2) {
                            bseh bsehVar2 = (bseh) y.get(i3);
                            cskc cskcVar = ayiu.a;
                            String valueOf = String.valueOf(bsehVar2.a);
                            String valueOf2 = String.valueOf(bsehVar2.b);
                            String valueOf3 = String.valueOf(bsehVar2.c);
                            boolean z2 = z;
                            String valueOf4 = String.valueOf(bsehVar2.d);
                            int i4 = i;
                            String valueOf5 = String.valueOf(bsehVar2.e);
                            String valueOf6 = String.valueOf(bsehVar2.f);
                            String valueOf7 = String.valueOf(bsehVar2.g);
                            String valueOf8 = String.valueOf(bsehVar2.h);
                            String valueOf9 = String.valueOf(bsehVar2.i);
                            String valueOf10 = String.valueOf(bsehVar2.j);
                            String valueOf11 = String.valueOf(bsehVar2.k);
                            String valueOf12 = String.valueOf(bsehVar2.l);
                            String valueOf13 = String.valueOf(bsehVar2.m);
                            String valueOf14 = String.valueOf(bsehVar2.n);
                            String valueOf15 = String.valueOf(bsehVar2.o);
                            String valueOf16 = String.valueOf(bsehVar2.p);
                            String valueOf17 = String.valueOf(bsehVar2.q);
                            String valueOf18 = String.valueOf(bsehVar2.r);
                            String valueOf19 = String.valueOf(bsehVar2.s);
                            String valueOf20 = String.valueOf(bsehVar2.t);
                            String valueOf21 = String.valueOf(bsehVar2.u);
                            String valueOf22 = String.valueOf(bsehVar2.v);
                            String valueOf23 = String.valueOf(bsehVar2.w);
                            String valueOf24 = String.valueOf(bsehVar2.x);
                            String valueOf25 = String.valueOf(bsehVar2.y);
                            String valueOf26 = String.valueOf(bsehVar2.z);
                            String valueOf27 = String.valueOf(bsehVar2.A);
                            String valueOf28 = String.valueOf(bsehVar2.B);
                            String valueOf29 = String.valueOf(bsehVar2.C);
                            String valueOf30 = String.valueOf(bsehVar2.D);
                            String valueOf31 = String.valueOf(bsehVar2.E);
                            String valueOf32 = String.valueOf(bsehVar2.F);
                            String valueOf33 = String.valueOf(bsehVar2.G);
                            String valueOf34 = String.valueOf(bsehVar2.H);
                            String valueOf35 = String.valueOf(bsehVar2.I);
                            String valueOf36 = String.valueOf(bsehVar2.J);
                            String valueOf37 = String.valueOf(bsehVar2.K);
                            String valueOf38 = String.valueOf(bsehVar2.L);
                            String valueOf39 = String.valueOf(bsehVar2.M);
                            String valueOf40 = String.valueOf(bsehVar2.N);
                            String valueOf41 = String.valueOf(bsehVar2.O);
                            String valueOf42 = String.valueOf(bsehVar2.P);
                            String valueOf43 = String.valueOf(bsehVar2.Q);
                            String valueOf44 = String.valueOf(bsehVar2.R);
                            String valueOf45 = String.valueOf(bsehVar2.S);
                            String valueOf46 = String.valueOf(bsehVar2.T);
                            String valueOf47 = String.valueOf(bsehVar2.U);
                            String valueOf48 = String.valueOf(bsehVar2.V);
                            String valueOf49 = String.valueOf(bsehVar2.W);
                            String valueOf50 = String.valueOf(bsehVar2.X);
                            String valueOf51 = String.valueOf(bsehVar2.Y);
                            String valueOf52 = String.valueOf(bsehVar2.Z);
                            String valueOf53 = String.valueOf(bsehVar2.aa);
                            String valueOf54 = String.valueOf(bsehVar2.ab);
                            byte[] bArr = bsehVar2.ac;
                            String concat = "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL"));
                            String valueOf55 = String.valueOf(bsehVar2.ad);
                            String valueOf56 = String.valueOf(bsehVar2.ae);
                            String valueOf57 = String.valueOf(bsehVar2.af);
                            String valueOf58 = String.valueOf(bsehVar2.ag);
                            String valueOf59 = String.valueOf(bsehVar2.ah);
                            String valueOf60 = String.valueOf(bsehVar2.ai);
                            String valueOf61 = String.valueOf(bsehVar2.aj);
                            String valueOf62 = String.valueOf(bsehVar2.ak);
                            String valueOf63 = String.valueOf(bsehVar2.al);
                            String valueOf64 = String.valueOf(bsehVar2.am);
                            String valueOf65 = String.valueOf(bsehVar2.an);
                            String valueOf66 = String.valueOf(bsehVar2.ao);
                            String valueOf67 = String.valueOf(bsehVar2.ap);
                            String valueOf68 = String.valueOf(bsehVar2.aq);
                            String valueOf69 = String.valueOf(bsehVar2.ar);
                            String valueOf70 = String.valueOf(bsehVar2.as);
                            String valueOf71 = String.valueOf(bsehVar2.at);
                            String valueOf72 = String.valueOf(bsehVar2.au);
                            String valueOf73 = String.valueOf(bsehVar2.av);
                            String valueOf74 = String.valueOf(bsehVar2.aw);
                            String valueOf75 = String.valueOf(bsehVar2.ax);
                            String valueOf76 = String.valueOf(bsehVar2.ay);
                            Object[] objArr = new Object[77];
                            objArr[i4] = valueOf;
                            objArr[z2 ? 1 : 0] = valueOf2;
                            objArr[2] = valueOf3;
                            objArr[3] = valueOf4;
                            objArr[4] = valueOf5;
                            objArr[5] = valueOf6;
                            objArr[6] = valueOf7;
                            objArr[7] = valueOf8;
                            objArr[8] = valueOf9;
                            objArr[9] = valueOf10;
                            objArr[10] = valueOf11;
                            objArr[11] = valueOf12;
                            objArr[12] = valueOf13;
                            objArr[13] = valueOf14;
                            objArr[14] = valueOf15;
                            objArr[15] = valueOf16;
                            objArr[16] = valueOf17;
                            objArr[17] = valueOf18;
                            objArr[18] = valueOf19;
                            objArr[19] = valueOf20;
                            objArr[20] = valueOf21;
                            objArr[21] = valueOf22;
                            objArr[22] = valueOf23;
                            objArr[23] = valueOf24;
                            objArr[24] = valueOf25;
                            objArr[25] = valueOf26;
                            objArr[26] = valueOf27;
                            objArr[27] = valueOf28;
                            objArr[28] = valueOf29;
                            objArr[29] = valueOf30;
                            objArr[30] = valueOf31;
                            objArr[31] = valueOf32;
                            objArr[32] = valueOf33;
                            objArr[33] = valueOf34;
                            objArr[34] = valueOf35;
                            objArr[35] = valueOf36;
                            objArr[36] = valueOf37;
                            objArr[37] = valueOf38;
                            objArr[38] = valueOf39;
                            objArr[39] = valueOf40;
                            objArr[40] = valueOf41;
                            objArr[41] = valueOf42;
                            objArr[42] = valueOf43;
                            objArr[43] = valueOf44;
                            objArr[44] = valueOf45;
                            objArr[45] = valueOf46;
                            objArr[46] = valueOf47;
                            objArr[47] = valueOf48;
                            objArr[48] = valueOf49;
                            objArr[49] = valueOf50;
                            objArr[50] = valueOf51;
                            objArr[51] = valueOf52;
                            objArr[52] = valueOf53;
                            objArr[53] = valueOf54;
                            objArr[54] = concat;
                            objArr[55] = valueOf55;
                            objArr[56] = valueOf56;
                            objArr[57] = valueOf57;
                            objArr[58] = valueOf58;
                            objArr[59] = valueOf59;
                            objArr[60] = valueOf60;
                            objArr[61] = valueOf61;
                            objArr[62] = valueOf62;
                            objArr[63] = valueOf63;
                            objArr[64] = valueOf64;
                            objArr[65] = valueOf65;
                            objArr[66] = valueOf66;
                            objArr[67] = valueOf67;
                            objArr[68] = valueOf68;
                            objArr[69] = valueOf69;
                            objArr[70] = valueOf70;
                            objArr[71] = valueOf71;
                            objArr[72] = valueOf72;
                            objArr[73] = valueOf73;
                            objArr[74] = valueOf74;
                            objArr[75] = valueOf75;
                            objArr[76] = valueOf76;
                            cskcVar.m(String.format(Locale.US, "ConversationsTable [_id: %s, sms_thread_id: %s, name: %s, name_is_automatic: %s, subtitle: %s, latest_message_id: %s, snippet_text: %s, subject_text: %s, preview_uri: %s, preview_content_type: %s, show_draft: %s, draft_snippet_text: %s, draft_subject_text: %s, draft_preview_uri: %s, draft_preview_content_type: %s, etouffee_default: %s, archive_status: %s, sort_timestamp: %s, last_read_timestamp: %s, icon: %s, participant_contact_id: %s, normalized_participant_contact_id: %s, participant_lookup_key: %s, normalized_participant_lookup_key: %s, participant_normalized_destination: %s, participant_comparable_destination: %s, current_self_id: %s, current_my_identity_foreign_key: %s, destination_token: %s, participant_count: %s, notification_enabled: %s, notification_sound_uri: %s, notification_vibration: %s, include_email_addr: %s, sms_service_center: %s, participant_id_list: %s, normalized_participant_id_list: %s, source_type: %s, rcs_session_id: %s, join_state: %s, conv_type: %s, send_mode: %s, IS_ENTERPRISE: %s, has_ea2p_bot_recipient: %s, last_interactive_event_timestamp: %s, participant_display_destination: %s, normalized_participant_display_destination: %s, spam_warning_dismiss_status: %s, open_count: %s, last_logged_scooby_metadata_timestamp: %s, delete_timestamp: %s, cms_id: %s, rcs_group_id: %s, rcs_conference_uri: %s, tachygram_group_routing_info_token: %s, cms_most_recent_read_message_timestamp_ms: %s, rcs_subject_change_timestamp_ms: %s, rcs_session_allows_revocation: %s, rcs_group_capabilities: %s, awaiting_reverse_sync: %s, duplicate_of: %s, new_duplicate_of: %s, error_state: %s, cms_life_cycle: %s, rcs_group_self_msisdn: %s, recipient_offline_timestamp_ms: %s, rcs_group_last_sync_timestamp: %s, has_been_e2ee: %s, marked_as_unread: %s, custom_theme: %s, mms_group_upgrade_status: %s, mms_group_upgrade_retries: %s, encryption_protocol: %s, encryption_id: %s, cms_correlation_id: %s, rcs_group_icon_url: %s, unread_count: %s]", objArr));
                            i3++;
                            z = z2 ? 1 : 0;
                            i = i4;
                            y = y;
                        }
                        boolean z3 = z;
                        int i5 = i;
                        obj = null;
                        csjb e3 = ayiu.a.e();
                        e3.I("Printing Cache");
                        e3.y("Conversations row count", enouVar2.c);
                        e3.r();
                        String[] strArr = aykg.a;
                        aykd aykdVar = new aykd(aykg.a);
                        aykdVar.z("findWithTwoQueries3");
                        engw y2 = aykdVar.b().y();
                        int i6 = ((enou) y2).c;
                        for (int i7 = i5; i7 < i6; i7++) {
                            ayjc ayjcVar = (ayjc) y2.get(i7);
                            cskc cskcVar2 = ayiu.a;
                            String valueOf77 = String.valueOf(ayjcVar.a);
                            String valueOf78 = String.valueOf(ayjcVar.b);
                            String valueOf79 = String.valueOf(ayjcVar.c);
                            String valueOf80 = String.valueOf(ayjcVar.d);
                            Object[] objArr2 = new Object[4];
                            objArr2[i5] = valueOf77;
                            objArr2[z3 ? 1 : 0] = valueOf78;
                            objArr2[2] = valueOf79;
                            objArr2[3] = valueOf80;
                            cskcVar2.m(String.format(Locale.US, "ConversationMatcherCacheTable [_id: %s, matcher_version: %s, destination_key: %s, conversation_id: %s]", objArr2));
                        }
                    } else {
                        obj = null;
                    }
                    String[] strArr2 = aykg.a;
                    ayjy ayjyVar = new ayjy();
                    ayjyVar.c(new Function() { // from class: ayih
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            aykf aykfVar = (aykf) obj2;
                            cskc cskcVar3 = ayiu.a;
                            aykfVar.b((ConversationIdType) engw.this.get(0));
                            aykfVar.c(ayiu.d);
                            return aykfVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    ayjyVar.f("removeInvalidConversationFromCache");
                    ayjyVar.b().b();
                    return obj;
                }
            });
        } finally {
            this.j.f(d2, new ecda("ConversationMatcher#findCachedConversation"), null, ecrh.SUCCESS);
        }
    }
}

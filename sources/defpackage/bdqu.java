package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.LruCache;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdqu {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantData");
    private static final LruCache b = new LruCache(1000);

    /* compiled from: PG */
    public interface a {
        ffbr A();

        Context Q();

        bcpz bw();

        ctvb cR();

        cpbs cx();

        ffbr gB();

        ffbr gn();

        ffbr gt();

        ffbr gu();

        ffbr gx();

        ctwb l();

        akzt s();

        cpdg u();
    }

    public static ParticipantsTable.BindData a(String str, String str2, String str3) {
        return e(str, str2, str3).a();
    }

    public static ParticipantsTable.BindData b(String str) {
        return f(str).a();
    }

    public static ParticipantsTable.BindData c(aoku aokuVar, int i) {
        return h(aokuVar, null, i).a();
    }

    public static ParticipantsTable.BindData d(Context context, ParticipantsTable.BindData bindData, String str) {
        ParticipantsTable.BindData a2;
        ekzz f = eleg.f("ParticipantData.lookupCequint");
        try {
            bcpz bw = ((a) ctba.a(a.class)).bw();
            ParticipantsTable.BindData bindData2 = null;
            if (bindData != null && bindData.u() != -1 && bindData.u() != -2 && bindData.u() != -3 && (bindData.u() != -4 || !TextUtils.isEmpty(bindData.R()))) {
                if (bindData.u() == -1) {
                    ensk e = a.e();
                    e.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantData", "lookupCequint", 755, "ParticipantData.java")).q("lookupCequint skipped because participant is PARTICIPANT_CONTACT_ID_NOT_RESOLVED");
                } else if (bindData.u() == -1) {
                    ensk e2 = a.e();
                    e2.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantData", "lookupCequint", 759, "ParticipantData.java")).q("lookupCequint skipped because participant is PARTICIPANT_CONTACT_ID_NOT_RESOLVED");
                } else if (bindData.u() == -2) {
                    ensk e3 = a.e();
                    e3.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) e3).h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantData", "lookupCequint", 762, "ParticipantData.java")).q("lookupCequint skipped because participant is PARTICIPANT_CONTACT_ID_NOT_FOUND");
                } else if (bindData.u() == -4) {
                    ensk e4 = a.e();
                    e4.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) e4).h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantData", "lookupCequint", 765, "ParticipantData.java")).q("lookupCequint skipped because participant is PARTICIPANT_CEQUINT_ID and name not null");
                }
                f.close();
                return bindData2;
            }
            if (bw.b(context)) {
                bcpy a3 = bw.a(context, str);
                if (a3 != null && bindData != null) {
                    if (a3.d) {
                        bvpo C = bindData.C();
                        C.l(-3L);
                        a2 = C.a();
                    } else if (!TextUtils.isEmpty(a3.a)) {
                        bvpo C2 = bindData.C();
                        C2.N(a3.b);
                        C2.l(-4L);
                        C2.u(a3.a);
                        C2.t(a3.a);
                        a2 = C2.a();
                    }
                    bindData2 = a2;
                }
                bindData2 = bindData;
            }
            f.close();
            return bindData2;
        } catch (Throwable th) {
            try {
                f.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static bvpo e(String str, String str2, String str3) {
        cskc cskcVar = cpdg.a;
        csix.k(aoqw.h(str));
        if (TextUtils.isEmpty(str2)) {
            a aVar = (a) ctba.a(a.class);
            String b2 = ((ckby) aVar.gu().b()).b();
            ensk j = a.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantData", "buildFromBotInfo", 464, "ParticipantData.java")).t("Participant data was populated with default business name. Bot id: %s", cskt.b(str));
            avjf avjfVar = (avjf) aVar.gt().b();
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
            eorxVar.h = 2;
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
            ((akxl) avjfVar.b.b()).j(eoluVar);
            str2 = b2;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = bcyu.a();
        }
        bvpo w = w(str);
        w.I(str);
        w.q(str2);
        w.J(1);
        bdqo.d(w, ParticipantColor.b(str3));
        return w;
    }

    public static bvpo f(String str) {
        aolr aolrVar = (aolr) ((a) ctba.a(a.class)).A().b();
        bvpo w = w(str);
        String str2 = w.g;
        cskc cskcVar = cpdg.a;
        boolean h = aoqw.h(str2);
        aoku n = aolrVar.n(w.g);
        cfva cfvaVar = aoqm.a;
        w.I(h ? w.g : aolrVar.k(n).m(asvj.a()));
        w.q(h ? w.f : x(aolrVar.c(w.f, new emyl() { // from class: bdqs
            @Override // defpackage.emyl
            public final Object get() {
                return Optional.empty();
            }
        }), aolrVar));
        y(w, -1);
        return w;
    }

    public static bvpo g(final int i, aoku aokuVar) {
        final cpbk a2;
        cpbm cpbmVar = ((a) ctba.a(a.class)).cx().a(i).c;
        if (cpbmVar != null && (a2 = cpbmVar.a(aokuVar)) != null) {
            bvpo bvpoVar = (bvpo) a2.b.filter(new Predicate() { // from class: bdqp
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
                    enru enruVar = bdqu.a;
                    cfva cfvaVar = aoqm.a;
                    return !TextUtils.isEmpty(((aoku) obj).p(((Boolean) new aoqf().get()).booleanValue()));
                }
            }).map(new Function() { // from class: bdqq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return bdqu.h((aoku) obj, cpbk.this.a, i);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).or(new Supplier() { // from class: bdqr
                @Override // java.util.function.Supplier
                public final Object get() {
                    enru enruVar = bdqu.a;
                    String str = cpbk.this.a;
                    return !TextUtils.isEmpty(str) ? Optional.of(bdqv.a(str)) : Optional.empty();
                }
            }).orElse(null);
            if (bvpoVar != null) {
                return bvpoVar;
            }
            ensk j = a.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantData", "buildFromMessagingIdentityWithHiddenContacts", 705, "ParticipantData.java")).q("Invalid hidden contacts entry");
        }
        cfva cfvaVar = aoqm.a;
        if (!((Boolean) new aoot().get()).booleanValue()) {
            boolean a3 = ((astw) ((a) ctba.a(a.class)).gx().b()).a();
            String j2 = aokuVar.j();
            String m = a3 ? aokuVar.m(((Boolean) aolr.a.e()).booleanValue()) : aokuVar.p(((Boolean) aolr.a.e()).booleanValue());
            j2.getClass();
            m.getClass();
            bvpo w = w(j2);
            w.I(m);
            w.q(emxe.b(aokuVar.G().a));
            y(w, -1);
            return w;
        }
        String n = aokuVar.n();
        n.getClass();
        bvpo w2 = w(n);
        String l = aokuVar.l();
        l.getClass();
        w2.I(l);
        String str = aokuVar.G().a;
        str.getClass();
        w2.q(str);
        y(w2, -1);
        return w2;
    }

    public static bvpo h(aoku aokuVar, String str, int i) {
        String p;
        String str2;
        String str3;
        a aVar = (a) ctba.a(a.class);
        ctwb l = aVar.l();
        ctvb cR = aVar.cR();
        boolean a2 = ((astw) aVar.gx().b()).a();
        if (a2) {
            cfva cfvaVar = aoqm.a;
            ((Boolean) new aoou().get()).booleanValue();
            p = aokuVar.k(false);
        } else {
            cfva cfvaVar2 = aoqm.a;
            ((Boolean) new aoou().get()).booleanValue();
            p = aokuVar.p(false);
        }
        bvpo w = w(p);
        String str4 = w.g;
        cskc cskcVar = cpdg.a;
        boolean h = aoqw.h(str4);
        aoku g = l.h(i).g(w.g);
        if (a2) {
            str2 = aokuVar.l();
            str3 = aokuVar.G().a;
        } else {
            String n = h ? w.g : g.n();
            String p2 = h ? n : ((Boolean) new aoqc().get()).booleanValue() ? g.G().a : cR.p(n);
            str2 = n;
            str3 = p2;
        }
        if (true == TextUtils.isEmpty(str)) {
            str = str3;
        }
        bdrw.d(str2, 2);
        bdrw.d(str, 3);
        if (true != a2) {
            str3 = str;
        }
        w.I(str2);
        w.q(str3);
        w.u(str);
        y(w, i);
        return w;
    }

    public static bvpo i(int i, String str) {
        cpbk a2;
        a aVar = (a) ctba.a(a.class);
        cpbs cx = aVar.cx();
        aolr aolrVar = (aolr) aVar.A().b();
        cpbn a3 = cx.a(i);
        cpbm cpbmVar = a3.c;
        int i2 = a3.a;
        if (cpbmVar != null && (a2 = cpbmVar.a(aVar.l().h(i2).g(str))) != null) {
            String str2 = (String) a2.b.map(new Function() { // from class: bdqt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    enru enruVar = bdqu.a;
                    cfva cfvaVar = aoqm.a;
                    return ((aoku) obj).p(((Boolean) new aoqf().get()).booleanValue());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(null);
            boolean isEmpty = TextUtils.isEmpty(str2);
            String str3 = a2.a;
            if (!isEmpty) {
                bvpo h = h(aolrVar.n(str2), str3, i);
                r(h, str2, 1, aVar);
                return h;
            }
            if (!TextUtils.isEmpty(str3)) {
                bvpo a4 = bdqv.a(str3);
                r(a4, str3, 2, aVar);
                return a4;
            }
            csix.c("Invalid hidden contacts entry");
        }
        bvpo h2 = h(aolrVar.n(str), null, i);
        r(h2, str, 3, aVar);
        return h2;
    }

    public static String j(ParticipantsTable.BindData bindData) {
        if (bdqv.c(bindData) || bindData.U() == null) {
            return null;
        }
        return bindData.U();
    }

    public static String k(ParticipantsTable.BindData bindData) {
        aolr aolrVar = (aolr) ((a) ctba.a(a.class)).A().b();
        String x = x(aolrVar.t(bindData), aolrVar);
        String K = bindData.K();
        return TextUtils.isEmpty(K) ? x : String.format("%s (%s)", x, K);
    }

    public static Collection l(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((ParticipantsTable.BindData) it.next()).W());
        }
        return arrayList;
    }

    static boolean m(bvpo bvpoVar, boolean z) {
        return TextUtils.equals(bvpoVar.g, true != z ? "EMERGENCY+SERVICE+PROVIDER" : "EMERGENCY+SERVICE+PROVIDER+DEMO");
    }

    public static boolean n(ParticipantsTable.BindData bindData) {
        return o(bindData.W());
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00dc, code lost:
    
        if (r3.l(r9) == false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean o(java.lang.String r9) {
        /*
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            android.util.LruCache r1 = defpackage.bdqu.b
            java.lang.Object r1 = r1.get(r9)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 != 0) goto Lf1
            java.lang.Class<bdqu$a> r1 = bdqu.a.class
            java.lang.Object r1 = defpackage.ctba.a(r1)
            bdqu$a r1 = (bdqu.a) r1
            cpbs r2 = r1.cx()
            cpdg r3 = r1.u()
            ffbr r1 = r1.gn()
            java.lang.Object r1 = r1.b()
            asvn r1 = (defpackage.asvn) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L3c
            boolean r1 = defpackage.aojl.a(r9)
            if (r1 != 0) goto Le7
            boolean r1 = defpackage.aojl.b(r9)
            if (r1 == 0) goto L3c
            goto Le7
        L3c:
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto Le7
            java.lang.String r1 = "ʼUNKNOWN_SENDER!ʼ"
            boolean r1 = android.text.TextUtils.equals(r9, r1)
            r4 = 1
            if (r1 != 0) goto Le6
            java.lang.String r1 = "ʼWAP_PUSH_SI!ʼ"
            boolean r1 = android.text.TextUtils.equals(r9, r1)
            if (r1 != 0) goto Le6
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 == 0) goto L5b
            goto Ld8
        L5b:
            cpbu r1 = r2.d
            cpca r2 = r1.i
            boolean r2 = r2.a()
            if (r2 == 0) goto L68
            r1.c()
        L68:
            java.util.concurrent.locks.Lock r2 = r1.b
            r2.lock()
            android.util.SparseArray r2 = r1.d     // Catch: java.lang.Throwable -> Ldf
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Ldf
            r5 = r0
        L74:
            if (r5 >= r2) goto Ld3
            android.util.SparseArray r6 = r1.d     // Catch: java.lang.Throwable -> Ldf
            java.lang.Object r6 = r6.valueAt(r5)     // Catch: java.lang.Throwable -> Ldf
            cpbn r6 = (defpackage.cpbn) r6     // Catch: java.lang.Throwable -> Ldf
            cpbm r6 = r6.c     // Catch: java.lang.Throwable -> Ldf
            if (r6 == 0) goto Ld0
            boolean r7 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> Ldf
            if (r7 == 0) goto L89
            goto Ld0
        L89:
            java.util.List r6 = r6.a     // Catch: java.lang.Throwable -> Ldf
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> Ldf
        L8f:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> Ldf
            if (r7 == 0) goto Ld0
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> Ldf
            cpbk r7 = (defpackage.cpbk) r7     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r8 = r7.a     // Catch: java.lang.Throwable -> Ldf
            boolean r8 = r9.equals(r8)     // Catch: java.lang.Throwable -> Ldf
            if (r8 == 0) goto L8f
            j$.util.Optional r8 = r7.b     // Catch: java.lang.Throwable -> Ldf
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> Ldf
            if (r8 != 0) goto Lca
            j$.util.Optional r7 = r7.b     // Catch: java.lang.Throwable -> Ldf
            java.lang.Object r7 = r7.get()     // Catch: java.lang.Throwable -> Ldf
            aoku r7 = (defpackage.aoku) r7     // Catch: java.lang.Throwable -> Ldf
            cfva r8 = defpackage.aoqm.a     // Catch: java.lang.Throwable -> Ldf
            aoqf r8 = new aoqf     // Catch: java.lang.Throwable -> Ldf
            r8.<init>()     // Catch: java.lang.Throwable -> Ldf
            java.lang.Object r8 = r8.get()     // Catch: java.lang.Throwable -> Ldf
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> Ldf
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> Ldf
            boolean r7 = r7.y(r8)     // Catch: java.lang.Throwable -> Ldf
            if (r7 == 0) goto L8f
        Lca:
            java.util.concurrent.locks.Lock r0 = r1.b
            r0.unlock()
            goto Le6
        Ld0:
            int r5 = r5 + 1
            goto L74
        Ld3:
            java.util.concurrent.locks.Lock r1 = r1.b
            r1.unlock()
        Ld8:
            boolean r1 = r3.l(r9)
            if (r1 != 0) goto Le7
            goto Le6
        Ldf:
            r9 = move-exception
            java.util.concurrent.locks.Lock r0 = r1.b
            r0.unlock()
            throw r9
        Le6:
            r0 = r4
        Le7:
            android.util.LruCache r1 = defpackage.bdqu.b
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1.put(r9, r2)
            return r0
        Lf1:
            boolean r9 = r1.booleanValue()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdqu.o(java.lang.String):boolean");
    }

    public static boolean p(ParticipantsTable.BindData bindData) {
        byzi D;
        return !TextUtils.isEmpty(bindData.T()) || bdqv.d(bindData) || bdtd.m(bindData) || (D = bindData.D()) == byzi.VERIFICATION_IN_PROGRESS || D == byzi.VERIFICATION_VERIFIED;
    }

    public static boolean q(ParticipantsTable.BindData bindData) {
        return TextUtils.equals(bindData.W(), "ʼUNKNOWN_SENDER!ʼ");
    }

    public static void r(bvpo bvpoVar, String str, int i, a aVar) {
        if (bdrw.c(str) || !bdrw.c(bvpoVar.g)) {
            return;
        }
        ensk j = a.j();
        j.Y(ente.a, "Bugle");
        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantData", "checkSendDestination", 645, "ParticipantData.java")).t("buildFromRawPhoneBySimCountryWithHiddenContacts encountered empty/whitespace send destination and non-empty/whitespace input destination. EmptyDestinationSource: %s", i != 1 ? i != 2 ? "VISIBLE_CONTACT" : "HIDDEN_CONTACT_WITH_DISPLAY_NAME" : "HIDDEN_CONTACT_WITH_RETURN_NUMBER");
        aVar.s().e("Bugle.Datamodel.ParticipantData.BuildFromRawPhoneBySimCountryWithHiddenContacts.EmptySendDestination", i);
    }

    public static int s(ParticipantsTable.BindData bindData) {
        cpdg u = ((a) ctba.a(a.class)).u();
        String W = bindData.W();
        if (aoqw.j(W)) {
            return 2;
        }
        return u.k(W) ? 3 : 4;
    }

    @Deprecated
    public static ParticipantsTable.BindData t(qmc qmcVar) {
        a aVar = (a) ctba.a(a.class);
        ffbr A = aVar.A();
        boolean a2 = ((astw) aVar.gx().b()).a();
        String[] strArr = ParticipantsTable.a;
        bvpp bvppVar = new bvpp();
        u(bvppVar);
        bvppVar.T(-2);
        bvppVar.S(-1);
        bvppVar.R(cuxt.d(qmcVar.c));
        aoku s = ((aolr) A.b()).s(qmcVar);
        bvppVar.I(a2 ? s.l() : s.o());
        bvppVar.q(s.G().a);
        bvppVar.u(qmcVar.b);
        bvppVar.t(null);
        bvppVar.N(qmcVar.i);
        bvppVar.l(qmcVar.f);
        if (bvppVar.q < 0) {
            bvppVar.l(-1L);
        }
        bvppVar.D(qmcVar.k);
        bvppVar.e(false);
        bvppVar.U(0);
        bvppVar.V(null);
        bvppVar.p(qmcVar.g.longValue());
        y(bvppVar, -1);
        return bvppVar.a();
    }

    public static void u(bvpo bvpoVar) {
        bvpoVar.v(null);
    }

    public static String v(Collection collection) {
        return TextUtils.join(" ", l(collection));
    }

    private static bvpo w(String str) {
        bdrw.d(str, 1);
        String[] strArr = ParticipantsTable.a;
        bvpp bvppVar = new bvpp();
        u(bvppVar);
        bvppVar.T(-2);
        bvppVar.S(-1);
        bvppVar.R(cuxt.d(str));
        bvppVar.u(null);
        bvppVar.t(null);
        bvppVar.N(null);
        bvppVar.l(-1L);
        bvppVar.D(null);
        bvppVar.e(false);
        bvppVar.U(0);
        bvppVar.V(null);
        return bvppVar;
    }

    private static String x(aoku aokuVar, aolr aolrVar) {
        cfva cfvaVar = aoqm.a;
        boolean a2 = asvj.a();
        return aolrVar.i(aokuVar, !a2).H(a2).toString();
    }

    private static void y(bvpo bvpoVar, int i) {
        a aVar = (a) ctba.a(a.class);
        Resources resources = aVar.Q().getResources();
        ffbr gn = aVar.gn();
        if (TextUtils.equals(bvpoVar.g, "ʼUNKNOWN_SENDER!ʼ")) {
            bvpoVar.q(resources.getString(R.string.unknown_sender));
            bvpoVar.u(bvpoVar.h);
            bvpoVar.l(-2L);
            return;
        }
        if (TextUtils.equals(bvpoVar.g, "ʼWAP_PUSH_SI!ʼ")) {
            bvpoVar.q(resources.getString(R.string.wap_push_from));
            bvpoVar.u(bvpoVar.h);
            bvpoVar.l(-2L);
            return;
        }
        if (TextUtils.equals(bvpoVar.g, ((a) ctba.a(a.class)).cx().a(i).k())) {
            bvpoVar.q(resources.getString(R.string.spam_reporting_from));
            bvpoVar.u(bvpoVar.h);
            bvpoVar.l(-2L);
            return;
        }
        if (((asvn) gn.b()).a() && m(bvpoVar, false)) {
            bvpoVar.q(resources.getString(R.string.recipient_title_satellite));
            bvpoVar.u(bvpoVar.h);
            bvpoVar.l(-2L);
            return;
        }
        if (((asvn) gn.b()).a() && m(bvpoVar, true)) {
            bvpoVar.q(resources.getString(R.string.recipient_title_satellite_demo));
            bvpoVar.u(bvpoVar.h);
            bvpoVar.l(-2L);
        } else if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue()) {
            Optional optional = (Optional) ((a) ctba.a(a.class)).gB().b();
            if (optional.isPresent() && ((cjdk) optional.get()).r().equals(bvpoVar.g)) {
                cjdk cjdkVar = (cjdk) ((Optional) aVar.gB().b()).get();
                bvpoVar.q(cjdkVar.s());
                bvpoVar.u(cjdkVar.s());
                bvpoVar.N(cjdkVar.c());
                bvpoVar.J(3);
                bvpoVar.l(-2L);
            }
        }
    }
}

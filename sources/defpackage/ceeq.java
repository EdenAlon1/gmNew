package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceeq {
    public static final cskc a = cskc.g("BugleCms", "CmsConversationRestoreBcmProxy");
    public final ayif b;
    public final dtuu c;
    public final ccij d;
    public final cefl e;
    public final ccsb f;
    public final ffsk g;
    public final ayfi h;
    public final ckju i;
    public final cqoh j;
    private final aolr k;
    private final ffbr l;
    private final cdsi m;
    private final akzt n;

    public ceeq(ayif ayifVar, aolr aolrVar, ffbr ffbrVar, dtuu dtuuVar, cdsi cdsiVar, ccij ccijVar, cefl ceflVar, ccsb ccsbVar, ffsk ffskVar, ayfi ayfiVar, ckju ckjuVar, akzt akztVar, cqoh cqohVar) {
        ayifVar.getClass();
        aolrVar.getClass();
        ffbrVar.getClass();
        dtuuVar.getClass();
        ffskVar.getClass();
        ayfiVar.getClass();
        ckjuVar.getClass();
        akztVar.getClass();
        cqohVar.getClass();
        this.b = ayifVar;
        this.k = aolrVar;
        this.l = ffbrVar;
        this.c = dtuuVar;
        this.m = cdsiVar;
        this.d = ccijVar;
        this.e = ceflVar;
        this.f = ccsbVar;
        this.g = ffskVar;
        this.h = ayfiVar;
        this.i = ckjuVar;
        this.n = akztVar;
        this.j = cqohVar;
    }

    public static final void k(ckjy ckjyVar, bseh bsehVar) {
        ckjyVar.q(true);
        ckjyVar.p(false);
        if (bsehVar.ad() != null) {
            ckjyVar.u(bsehVar.ad());
        }
        if (bsehVar.ac() != null) {
            ckjyVar.s(bsehVar.ac());
        }
        ckjyVar.v(bsehVar.m());
        ckjyVar.w(epby.UNKNOWN_TRIGGER_SOURCE);
        if (bsehVar.H() == byyy.NAME_IS_MANUAL) {
            ckjyVar.n(bsehVar.X());
        }
        if (bsehVar.ae() != null) {
            ckjyVar.y(bsehVar.ae());
        }
        if (bsehVar.K() != null) {
            ckjyVar.t(bsehVar.K());
        }
    }

    public final ConversationIdType a(Optional optional, final bseh bsehVar, final eshh eshhVar, final long j, final crwz crwzVar, final String str, final boolean z) {
        final ffji ffjiVar = new ffji() { // from class: ceei
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                final bseh bsehVar2 = (bseh) obj;
                final ceeq ceeqVar = ceeq.this;
                final bseh bsehVar3 = bsehVar;
                final eshh eshhVar2 = eshhVar;
                final long j2 = j;
                ceeqVar.c.d("CmsConversationRestoreBcmProxy#restoreMergeNonRcsGroupConversation", new Runnable() { // from class: ceed
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConversationIdType C = bsehVar2.C();
                        C.getClass();
                        ceeq ceeqVar2 = ceeq.this;
                        ceeqVar2.j(bsehVar3, eshhVar2, C);
                        ceeqVar2.h(j2);
                    }
                });
                return bsehVar2.C();
            }
        };
        Object orElseGet = optional.map(new Function() { // from class: ceej
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: ceek
            @Override // java.util.function.Supplier
            public final Object get() {
                final ceeq ceeqVar = ceeq.this;
                ceeqVar.i();
                final bseh bsehVar2 = bsehVar;
                final crwz crwzVar2 = crwzVar;
                final String str2 = str;
                final boolean z2 = z;
                ConversationIdType conversationIdType = (ConversationIdType) ceeqVar.c.c("CmsConversationRestoreBcmProxy#restoreNewNonRcsGroupConversation", new emyl() { // from class: ceeg
                    @Override // defpackage.emyl
                    public final Object get() {
                        ceeq ceeqVar2 = ceeq.this;
                        ceeqVar2.c.i();
                        bseh bsehVar3 = bsehVar2;
                        crwz crwzVar3 = crwzVar2;
                        String str3 = str2;
                        ConversationIdType a2 = ccij.a(bsehVar3, str3);
                        ccij.d(crwzVar3, a2);
                        if (z2 && csgj.a()) {
                            cefl ceflVar = ceeqVar2.e;
                            eshh e = crwzVar3.e();
                            e.getClass();
                            String conversationIdType2 = a2.toString();
                            conversationIdType2.getClass();
                            ceflVar.b(e, conversationIdType2, str3, 3);
                        }
                        ceeqVar2.d.c(a2, bsehVar3);
                        return a2;
                    }
                });
                ccij.b(conversationIdType);
                if (bsehVar2.M().c()) {
                    ceeqVar.c.i();
                    efbd.b();
                    csjb d = ceeq.a.d();
                    d.I("Associating restored conversation with telephony");
                    d.c(conversationIdType);
                    d.r();
                    cpxu b = ceeqVar.h.b(bsehVar2);
                    csjb c = ceeq.a.c();
                    c.I("Associated restored conversation with Telephony Thread ID");
                    c.n(b);
                    c.c(conversationIdType);
                    c.r();
                }
                return conversationIdType;
            }
        });
        ConversationIdType conversationIdType = (ConversationIdType) orElseGet;
        csjb c = a.c();
        c.I("Restored CMS Conversation to Bugle");
        c.A("cmsId", str);
        c.c(conversationIdType);
        c.r();
        orElseGet.getClass();
        return conversationIdType;
    }

    public final ConversationIdType b(final ckjy ckjyVar, crwz crwzVar, final bseh bsehVar, boolean z) {
        final long a2 = this.j.a();
        ckjyVar.j(false);
        final crme c = this.i.c(ckjyVar.D());
        final eshh e = (z && csgj.a()) ? crwzVar.e() : eshh.a;
        Object c2 = this.c.c("CmsConversationRestoreBcmProxy#restoreRcsGroupConversation", new emyl() { // from class: ceee
            @Override // defpackage.emyl
            public final Object get() {
                crme crmeVar;
                crme crmeVar2 = crme.this;
                ceeq ceeqVar = this;
                if (crmeVar2 == null) {
                    ckjy ckjyVar2 = ckjyVar;
                    ceeqVar.i();
                    ceeq.a.p("Creating a new RCS Group Conversation in BugleDB.");
                    ckju ckjuVar = ceeqVar.i;
                    ckjyVar2.j(true);
                    crmeVar = ckjuVar.c(ckjyVar2.D());
                    crmeVar.getClass();
                } else {
                    csjb a3 = ceeq.a.a();
                    a3.I("Matched existing RCS Group Conversation");
                    a3.c(crmeVar2.a());
                    a3.r();
                    crmeVar = crmeVar2;
                }
                bseh bsehVar2 = bsehVar;
                if (bsehVar2.M().c()) {
                    ayfi ayfiVar = ceeqVar.h;
                    bsel F = bsehVar2.F();
                    F.B(crmeVar.a());
                    ayfiVar.b(F.a());
                }
                eshh eshhVar = e;
                eshhVar.getClass();
                ceeqVar.j(bsehVar2, eshhVar, crmeVar.a());
                if (crmeVar2 != null) {
                    ceeqVar.h(a2);
                }
                return crmeVar.a();
            }
        });
        c2.getClass();
        return (ConversationIdType) c2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final engw c(crwz crwzVar) {
        int i = engw.d;
        engr engrVar = new engr();
        enqv it = crwzVar.c().iterator();
        it.getClass();
        while (it.hasNext()) {
            long k = ((bscj) it.next()).k();
            ParticipantsTable.BindData b = ((bdrr) this.l.b()).b(String.valueOf(k));
            if (b == null) {
                throw new ceft(a.y(k, "Restore for participant ", " failed"));
            }
            aoku q = this.k.q(b);
            if (q.y(true)) {
                throw new cefs("Normalized destination for participant " + b.S() + " is not restored properly");
            }
            engrVar.h(q);
        }
        engw g = engrVar.g();
        g.getClass();
        return g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ckjy r7, defpackage.bseh r8, defpackage.crwz r9, defpackage.ffgu r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.ceel
            if (r0 == 0) goto L13
            r0 = r10
            ceel r0 = (defpackage.ceel) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ceel r0 = new ceel
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ckhq r7 = r0.e
            ckhq r8 = r0.d
            defpackage.ffci.b(r10)
            goto L9d
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.ffci.b(r10)
            k(r7, r8)
            engw r8 = r9.c()
            r8.getClass()
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r2 = defpackage.ffdx.n(r8, r10)
            r9.<init>(r2)
            java.util.Iterator r8 = r8.iterator()
        L4f:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r8.next()
            bscj r2 = (defpackage.bscj) r2
            long r4 = r2.k()
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r9.add(r2)
            goto L4f
        L68:
            java.util.ArrayList r8 = new java.util.ArrayList
            int r10 = defpackage.ffdx.n(r9, r10)
            r8.<init>(r10)
            java.util.Iterator r9 = r9.iterator()
        L75:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L8d
            java.lang.Object r10 = r9.next()
            java.lang.Number r10 = (java.lang.Number) r10
            long r4 = r10.longValue()
            java.lang.String r10 = java.lang.String.valueOf(r4)
            r8.add(r10)
            goto L75
        L8d:
            r9 = r7
            ckhq r9 = (defpackage.ckhq) r9
            r0.d = r9
            r0.e = r9
            r0.c = r3
            java.lang.Object r10 = r6.e(r8, r0)
            if (r10 == r1) goto La3
            r8 = r7
        L9d:
            java.util.List r10 = (java.util.List) r10
            r7.r(r10)
            return r8
        La3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceeq.d(ckjy, bseh, crwz, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(final java.util.List r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ceem
            if (r0 == 0) goto L13
            r0 = r6
            ceem r0 = (defpackage.ceem) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ceem r0 = new ceem
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L57
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            bvvn r6 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.e()
            java.lang.String r2 = "CmsConversationRestoreBcmProxy#loadParticipants"
            r6.z(r2)
            ceeh r2 = new ceeh
            r2.<init>()
            r6.h(r2)
            bvvl r5 = r6.b()
            elfl r5 = r5.w()
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r5, r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceeq.e(java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.bseh r10, defpackage.crwz r11, java.lang.String r12, boolean r13, defpackage.ffgu r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof defpackage.ceeo
            if (r0 == 0) goto L13
            r0 = r14
            ceeo r0 = (defpackage.ceeo) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ceeo r0 = new ceeo
            r0.<init>(r9, r14)
        L18:
            java.lang.Object r14 = r0.d
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            long r10 = r0.c
            boolean r13 = r0.b
            java.lang.String r12 = r0.h
            crxn r1 = r0.i
            java.lang.Object r2 = r0.a
            ceeq r0 = r0.g
            defpackage.ffci.b(r14)
            r4 = r10
            r6 = r1
            r10 = r2
        L35:
            r7 = r12
            r8 = r13
            goto L6d
        L38:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L40:
            defpackage.ffci.b(r14)
            cqoh r14 = r9.j
            long r4 = r14.a()
            engw r14 = r9.c(r11)
            ayif r2 = r9.b
            elfl r14 = r2.k(r14)
            r0.g = r9
            r0.a = r10
            r2 = r11
            crxn r2 = (defpackage.crxn) r2
            r0.i = r2
            r0.h = r12
            r0.b = r13
            r0.c = r4
            r0.f = r3
            java.lang.Object r14 = defpackage.fgfz.c(r14, r0)
            if (r14 == r1) goto L8e
            r0 = r9
            r6 = r11
            goto L35
        L6d:
            r1 = r14
            j$.util.Optional r1 = (j$.util.Optional) r1
            if (r8 == 0) goto L7d
            boolean r11 = defpackage.csgj.a()
            if (r11 == 0) goto L7d
            eshh r11 = r6.e()
            goto L7f
        L7d:
            eshh r11 = defpackage.eshh.a
        L7f:
            r3 = r11
            r1.getClass()
            r3.getClass()
            r2 = r10
            bseh r2 = (defpackage.bseh) r2
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r10 = r0.a(r1, r2, r3, r4, r6, r7, r8)
            return r10
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceeq.f(bseh, crwz, java.lang.String, boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.bseh r6, defpackage.crwz r7, boolean r8, defpackage.ffgu r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.ceep
            if (r0 == 0) goto L13
            r0 = r9
            ceep r0 = (defpackage.ceep) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ceep r0 = new ceep
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            boolean r8 = r0.b
            java.lang.Object r6 = r0.a
            crxn r7 = r0.g
            ceeq r0 = r0.f
            defpackage.ffci.b(r9)
            goto L6b
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            defpackage.ffci.b(r9)
            bsel r9 = r6.F()
            ccsb r2 = r5.f
            java.lang.String r4 = r6.R()
            java.lang.String r6 = r2.a(r6, r4)
            r9.ak(r6)
            bseh r6 = r9.a()
            ckjy r9 = defpackage.ckjz.w()
            r6.getClass()
            r0.f = r5
            r2 = r7
            crxn r2 = (defpackage.crxn) r2
            r0.g = r2
            r0.a = r6
            r0.b = r8
            r0.e = r3
            java.lang.Object r9 = r5.d(r9, r6, r7, r0)
            if (r9 != r1) goto L6a
            return r1
        L6a:
            r0 = r5
        L6b:
            ckjy r9 = (defpackage.ckjy) r9
            ckjy r9 = r9.C()
            r6.getClass()
            bseh r6 = (defpackage.bseh) r6
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6 = r0.b(r9, r7, r6, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceeq.g(bseh, crwz, boolean, ffgu):java.lang.Object");
    }

    public final void h(long j) {
        this.n.g("Bugle.Cms.Restore.Conversation.DuplicateSearchDuration", this.j.a() - j);
    }

    public final void i() {
        this.n.e("Bugle.Cms.Restore.Conversation.Outcome", 5);
    }

    public final void j(bseh bsehVar, eshh eshhVar, ConversationIdType conversationIdType) {
        this.m.a(bsehVar, eshhVar, conversationIdType);
        this.d.c(conversationIdType, bsehVar);
    }
}

package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqte implements aqvh {
    public final ffsk a;
    public final aquw b;
    public final ffbr c;
    public final bvvl d;
    private final errl e;
    private final ffsk f;
    private final aqsn g;
    private final ffbr h;
    private final ffbr i;
    private final Optional j;
    private final aqge k;
    private final aqge l;
    private final bvvl m;
    private final aqge n;
    private final aqvt o;

    public aqte(errl errlVar, ffsk ffskVar, ffsk ffskVar2, aquw aquwVar, aqgc aqgcVar, aqsn aqsnVar, ffbr ffbrVar, ffbr ffbrVar2, Optional optional, ffbr ffbrVar3, aqvt aqvtVar) {
        errlVar.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        aqgcVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        optional.getClass();
        ffbrVar3.getClass();
        aqvtVar.getClass();
        this.e = errlVar;
        this.a = ffskVar;
        this.f = ffskVar2;
        this.b = aquwVar;
        this.g = aqsnVar;
        this.h = ffbrVar;
        this.i = ffbrVar2;
        this.j = optional;
        this.c = ffbrVar3;
        this.o = aqvtVar;
        bvvn e = ParticipantsTable.e();
        e.z("selfParticipantsQuery");
        e.r();
        e.h(new Function() { // from class: aqso
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                bvvwVar.x(-2);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bvtg bvtgVar = ParticipantsTable.c;
        e.d(new bvvk(bvtgVar.m, true), new bvvk(bvtgVar.g, true));
        this.d = e.b();
        aqgb a = aqgcVar.a(((aqkg) ffbrVar.b()).a(new ffjm() { // from class: aqsv
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                ((Set) obj).getClass();
                return bool;
            }
        }, new aqsy(this)));
        a.getClass();
        this.k = a;
        aqgb a2 = aqgcVar.a(((aqkg) ffbrVar2.b()).a(new ffjm() { // from class: aqss
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                ((Set) obj).getClass();
                return bool;
            }
        }, new aqsx(this)));
        a2.getClass();
        this.l = a2;
        bvvn e2 = ParticipantsTable.e();
        e2.z("selfParticipantsQueryWithProfiles");
        e2.r();
        e2.h(new Function() { // from class: aqsp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                bvvwVar.x(-2);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bvtg bvtgVar2 = ParticipantsTable.c;
        e2.d(new bvvk(bvtgVar2.m, true), new bvvk(bvtgVar2.g, true));
        dtvy i = dtvz.i(ProfilesTable.a().b(), ProfilesTable.c.b, ParticipantsTable.c.a);
        ((dtrd) i).e = "profiles_table_join_tag";
        e2.G(i.g());
        e2.v(ParticipantsTable.c.a);
        this.m = e2.b();
        aqgb a3 = aqgcVar.a(new aqgg(a, new emwl() { // from class: aqsq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                aquw aquwVar2 = aqte.this.b;
                aquwVar2.b.k((engw) obj);
                engr engrVar = new engr();
                engw f = aquwVar2.b.f();
                int i2 = ((enou) f).c;
                aztg aztgVar = null;
                for (int i3 = 0; i3 < i2; i3++) {
                    aztg aztgVar2 = (aztg) f.get(i3);
                    if (aztgVar2.e() == -1) {
                        aztgVar = aztgVar2;
                    } else {
                        engrVar.h(aquwVar2.a(aztgVar2));
                    }
                }
                engw g = engrVar.g();
                csjb a4 = aquw.a.a();
                a4.L("ActiveSubscriptions", g);
                a4.B("defaultActiveSelfSub exists", aztgVar != null);
                a4.r();
                if (g.isEmpty() && aztgVar != null) {
                    csjb e3 = aquw.a.e();
                    e3.I("Found the active dummy sub with subId = -1, but didn't find the actual default sms sub.");
                    e3.r();
                    return engw.r(aquwVar2.a(aztgVar));
                }
                csjb a5 = aquw.a.a();
                a5.I("SelfIdentitiesTracker getActiveSelfIdentities:");
                a5.A("selfIdentityList", g);
                a5.r();
                return g;
            }
        }, errlVar));
        a3.getClass();
        this.n = a3;
        a3.a(new aqgd() { // from class: aqsr
            @Override // defpackage.aqgd
            public final elfl a() {
                return elfo.e(null);
            }
        });
    }

    @Override // defpackage.aqvh
    public final aqge a() {
        return this.n;
    }

    @Override // defpackage.aqvh
    public final aqge b() {
        return this.o.a();
    }

    @Override // defpackage.aqvh
    public final aqge c() {
        return this.l;
    }

    @Override // defpackage.aqvh
    public final elfl d(SelfIdentityId selfIdentityId) {
        elfl c;
        selfIdentityId.getClass();
        ekzz f = eleg.f("SelfIdentityRepository#getSelfIdentityById");
        try {
            c = axol.c(this.f, ffhe.a, ffsm.a, new aqtb(this, selfIdentityId, null));
            ffig.a(f, null);
            return c;
        } finally {
        }
    }

    @Override // defpackage.aqvh
    public final elfl e() {
        elfl c;
        ekzz f = eleg.f("SelfIdentityRepository#getSelfIdentityForCreatingNewConversationsOrPreservingLegacyBugsNoOtherReason");
        try {
            c = axol.c(this.a, ffhe.a, ffsm.a, new aqtc(this, null));
            ffig.a(f, null);
            return c;
        } finally {
        }
    }

    @Override // defpackage.aqvh
    public final elfl f(SelfIdentityId selfIdentityId, aoku aokuVar) {
        elfl c;
        selfIdentityId.getClass();
        aokuVar.getClass();
        ekzz f = eleg.f("SelfIdentityRepository#setMsisdn");
        try {
            c = axol.c(this.f, ffhe.a, ffsm.a, new aqtd(this, selfIdentityId, aokuVar, null));
            ffig.a(f, null);
            return c;
        } finally {
        }
    }

    @Override // defpackage.aqvh
    public final elfl g(final Optional optional) {
        final ffji ffjiVar = new ffji() { // from class: aqst
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return ((aqwr) obj).b(aqte.this, optional);
            }
        };
        Object orElse = this.j.map(new Function() { // from class: aqsu
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
        }).orElse(elfo.e(false));
        orElse.getClass();
        return (elfl) orElse;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.ffgu r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.aqsz
            if (r0 == 0) goto L13
            r0 = r8
            aqsz r0 = (defpackage.aqsz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aqsz r0 = new aqsz
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r8)
            goto L43
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            defpackage.ffci.b(r8)
            aqge r8 = r7.n
            elfl r8 = r8.b()
            r8.getClass()
            r0.c = r3
            java.lang.Object r8 = defpackage.fgfz.c(r8, r0)
            if (r8 == r1) goto L76
        L43:
            engw r8 = (defpackage.engw) r8
            r8.getClass()
            java.util.Iterator r0 = r8.iterator()
            r1 = 0
            r2 = 0
            r4 = r1
        L4f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L68
            java.lang.Object r5 = r0.next()
            r6 = r5
            aqux r6 = (defpackage.aqux) r6
            boolean r6 = r6.u()
            if (r6 == 0) goto L4f
            if (r2 == 0) goto L65
            goto L6c
        L65:
            r2 = r3
            r4 = r5
            goto L4f
        L68:
            if (r2 != 0) goto L6b
            goto L6c
        L6b:
            r1 = r4
        L6c:
            aqux r1 = (defpackage.aqux) r1
            if (r1 == 0) goto L71
            return r1
        L71:
            java.lang.Object r8 = defpackage.ffdx.M(r8)
            return r8
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqte.h(ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:12:0x0034, B:13:0x00d2, B:14:0x00e0, B:15:0x0084, B:17:0x008b, B:19:0x0097, B:21:0x00a1, B:23:0x00a7, B:25:0x00af, B:30:0x00db, B:32:0x00ed, B:39:0x0048, B:40:0x006d, B:42:0x0055), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:12:0x0034, B:13:0x00d2, B:14:0x00e0, B:15:0x0084, B:17:0x008b, B:19:0x0097, B:21:0x00a1, B:23:0x00a7, B:25:0x00af, B:30:0x00db, B:32:0x00ed, B:39:0x0048, B:40:0x006d, B:42:0x0055), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ce -> B:13:0x00d2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqte.i(ffgu):java.lang.Object");
    }
}

package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.ParcelUuid;
import android.telephony.SubscriptionInfo;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cosd implements cort {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/simstatetracker/SimSubscriptionInfoRetrieverImpl");
    public final ffbr a;
    private final Context c;
    private final ffsk d;
    private final ffbr e;
    private final coqb f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final asqs k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;

    public cosd(Context context, ffsk ffskVar, ffbr ffbrVar, coqb coqbVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, asqs asqsVar, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9) {
        context.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        coqbVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        asqsVar.getClass();
        ffbrVar7.getClass();
        ffbrVar9.getClass();
        this.c = context;
        this.d = ffskVar;
        this.e = ffbrVar;
        this.f = coqbVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.i = ffbrVar4;
        this.a = ffbrVar5;
        this.j = ffbrVar6;
        this.k = asqsVar;
        this.l = ffbrVar7;
        this.m = ffbrVar8;
        this.n = ffbrVar9;
        fgdm.a(cota.a((cosy) cosz.a.createBuilder()).a());
    }

    @Override // defpackage.cort
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final boolean s(int i, int i2) {
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        String o = ((ctwb) this.e.b()).h(i).o();
        if (o == null && (o = ((ctwb) this.e.b()).h(i2).o()) == null) {
            return false;
        }
        if (((asmd) this.n.b()).a() && o.length() == 0) {
            return false;
        }
        List d = dkvq.b(this.c).d(ParcelUuid.fromString(o));
        d.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(d, 10));
        Iterator it = d.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((SubscriptionInfo) it.next()).getSubscriptionId()));
        }
        return arrayList.contains(Integer.valueOf(i)) && arrayList.contains(Integer.valueOf(i2));
    }

    @Override // defpackage.cort
    public final cost a() {
        return ((cora) this.g.b()).a();
    }

    @Override // defpackage.cort
    public final elfl b() {
        return axol.b(new corv(this), this.d);
    }

    @Override // defpackage.cort
    public final elfl c() {
        return axol.b(new corw(this), this.d);
    }

    @Override // defpackage.cort
    public final elfl d() {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new cory(this, null));
        return c;
    }

    @Override // defpackage.cort
    public final elfl e(cors corsVar) {
        elfl c;
        corsVar.getClass();
        c = axol.c(this.d, ffhe.a, ffsm.a, new cosa(this, corsVar, null));
        return c;
    }

    @Override // defpackage.cort
    public final Optional f() {
        Object obj;
        cosw coswVar = (cosw) this.f.a.get();
        if (coswVar == null) {
            throw new coqa();
        }
        cost costVar = coswVar.d;
        if (costVar == null) {
            costVar = cost.a;
        }
        String str = costVar.c;
        str.getClass();
        eygr eygrVar = coswVar.c;
        eygrVar.getClass();
        Iterator<E> it = eygrVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (ffkj.e(((cosz) obj).c, str)) {
                break;
            }
        }
        return Optional.ofNullable(obj);
    }

    @Override // defpackage.cort
    public final /* bridge */ /* synthetic */ Optional g(int i, boolean z) {
        List opportunisticSubscriptions;
        Set ar;
        ParcelUuid groupUuid;
        djrm a = this.f.a(i);
        if (a != null) {
            ((enrr) b.h().h("com/google/android/apps/messaging/shared/simstatetracker/SimSubscriptionInfoRetrieverImpl", "getCachedRcsProvisioningIdForSubscriptionId-bYZ02fE", 349, "SimSubscriptionInfoRetrieverImpl.kt")).D("Found provisioning id for sub id in simStateCache. subId %s: provisioning id: %s", new djrq(i), dktx.SIM_ID.c(djrn.a(a).a));
            return Optional.ofNullable(a);
        }
        cose coseVar = (cose) this.h.b();
        if (Build.VERSION.SDK_INT < 29) {
            ar = ffen.a;
        } else {
            String o = coseVar.b.h(i).o();
            if (o == null) {
                ar = ffen.a;
            } else {
                try {
                    opportunisticSubscriptions = dkvq.b(coseVar.a).a.getOpportunisticSubscriptions();
                    opportunisticSubscriptions.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : opportunisticSubscriptions) {
                        groupUuid = ((SubscriptionInfo) obj).getGroupUuid();
                        if (ffkj.e(groupUuid != null ? groupUuid.toString() : null, o)) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new djrq(((SubscriptionInfo) it.next()).getSubscriptionId()));
                    }
                    ar = ffdx.ar(arrayList2);
                } catch (SecurityException e) {
                    throw new dkvd("READ_PHONE_STATE permission is missing.", e);
                }
            }
        }
        Iterator it2 = ar.iterator();
        while (it2.hasNext()) {
            djrm a2 = this.f.a(((djrq) it2.next()).a);
            if (a2 != null) {
                ((enrr) b.h().h("com/google/android/apps/messaging/shared/simstatetracker/SimSubscriptionInfoRetrieverImpl", "getCachedRcsProvisioningIdForSubscriptionId-bYZ02fE", 364, "SimSubscriptionInfoRetrieverImpl.kt")).D("Found provisioning id for sub id in opportunisticSubs. subId %s: provisioning id: %s", new djrq(i), dktx.SIM_ID.c(djrn.a(a2).a));
                return Optional.of(a2);
            }
        }
        enru enruVar = b;
        ((enrr) enruVar.h().h("com/google/android/apps/messaging/shared/simstatetracker/SimSubscriptionInfoRetrieverImpl", "getCachedRcsProvisioningIdForSubscriptionId-bYZ02fE", 372, "SimSubscriptionInfoRetrieverImpl.kt")).t("No match for subId %s", new djrq(i));
        if (z) {
            ((enrr) enruVar.j().h("com/google/android/apps/messaging/shared/simstatetracker/SimSubscriptionInfoRetrieverImpl", "getCachedRcsProvisioningIdForSubscriptionId-bYZ02fE", 376, "SimSubscriptionInfoRetrieverImpl.kt")).t("No SimSubscriptionInfo found in cache for subId %s. Looking up cached availability based on the ICCID from SubscriptionMetadataUtils.", new djrq(i));
            String w = ((ctwb) this.e.b()).h(i).w();
            if (w != null && w.length() != 0) {
                return Optional.of(new djro(w));
            }
        }
        return Optional.empty();
    }

    @Override // defpackage.cort
    public final Optional h(cors corsVar) {
        corsVar.getClass();
        Optional ofNullable = Optional.ofNullable(((cora) this.g.b()).b(corsVar));
        if (corsVar == cors.a) {
        }
        return ofNullable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    @Override // defpackage.cort
    public final /* bridge */ /* synthetic */ Optional i(int i) {
        cosz d;
        cosz coszVar;
        if (((asmd) this.n.b()).a()) {
            d = ((cora) this.g.b()).d(i);
            if (d != null) {
                ((enrr) b.e().h("com/google/android/apps/messaging/shared/simstatetracker/SimSubscriptionInfoRetrieverImpl", "getSimSubscriptionInfoInternalSync-0jkzt_0", 209, "SimSubscriptionInfoRetrieverImpl.kt")).t("Found simSubscriptionInfo for subId: %s", new djrq(i));
            } else {
                ((enrr) b.e().h("com/google/android/apps/messaging/shared/simstatetracker/SimSubscriptionInfoRetrieverImpl", "getSimSubscriptionInfoInternalSync-0jkzt_0", 214, "SimSubscriptionInfoRetrieverImpl.kt")).t("No simSubscriptionInfo found for subId: %s. Checking if subId is in a subscription group with an another subscription.", new djrq(i));
                Iterator it = q().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        coszVar = 0;
                        break;
                    }
                    coszVar = it.next();
                    if (s(i, ((cosz) coszVar).d)) {
                        break;
                    }
                }
                d = coszVar;
                if (d == null) {
                    ((enrr) b.e().h("com/google/android/apps/messaging/shared/simstatetracker/SimSubscriptionInfoRetrieverImpl", "getSimSubscriptionInfoInternalSync-0jkzt_0", 225, "SimSubscriptionInfoRetrieverImpl.kt")).t("Subscription is not in a group with another subscription: %s. Returning null.", new djrq(i));
                }
            }
        } else {
            d = ((cora) this.g.b()).d(i);
        }
        return Optional.ofNullable(d);
    }

    @Override // defpackage.cort
    public final Optional j(djrm djrmVar) {
        djrmVar.getClass();
        return Optional.ofNullable(((cora) this.g.b()).c(djrmVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007e -> B:11:0x007f). Please report as a decompilation issue!!! */
    @Override // defpackage.cort
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.ffgu r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.corx
            if (r0 == 0) goto L13
            r0 = r8
            corx r0 = (defpackage.corx) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            corx r0 = new corx
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.d
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r2 = r0.c
            java.lang.Object r4 = r0.b
            java.lang.Object r5 = r0.a
            cosd r6 = r0.g
            defpackage.ffci.b(r8)
            goto L7f
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            cosd r2 = r0.g
            defpackage.ffci.b(r8)
            goto L4e
        L40:
            defpackage.ffci.b(r8)
            r0.g = r7
            r0.f = r4
            java.util.Set r8 = r7.o()
            if (r8 == r1) goto La6
            r2 = r7
        L4e:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.ffdx.n(r8, r5)
            r4.<init>(r5)
            java.util.Iterator r8 = r8.iterator()
            r6 = r2
            r2 = r4
            r4 = r8
        L62:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L86
            java.lang.Object r8 = r4.next()
            djrm r8 = (defpackage.djrm) r8
            r0.g = r6
            r0.a = r2
            r0.b = r4
            r0.c = r2
            r0.f = r3
            java.lang.Object r8 = r6.x(r8)
            if (r8 == r1) goto La6
            r5 = r2
        L7f:
            cosz r8 = (defpackage.cosz) r8
            r2.add(r8)
            r2 = r5
            goto L62
        L86:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r0 = r2.iterator()
        L8f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La1
            java.lang.Object r1 = r0.next()
            cosz r1 = (defpackage.cosz) r1
            if (r1 == 0) goto L8f
            r8.add(r1)
            goto L8f
        La1:
            java.util.Set r8 = defpackage.ffdx.ar(r8)
            return r8
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cosd.k(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cort
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.cors r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.corz
            if (r0 == 0) goto L13
            r0 = r6
            corz r0 = (defpackage.corz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            corz r0 = new corz
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            cors r5 = r0.e
            cosd r0 = r0.d
            defpackage.ffci.b(r6)
            goto L4b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r6)
            ffbr r6 = r4.g
            java.lang.Object r6 = r6.b()
            cora r6 = (defpackage.cora) r6
            r0.d = r4
            r0.e = r5
            r0.c = r3
            java.lang.Object r6 = r6.h(r5)
            if (r6 == r1) goto L5a
            r0 = r4
        L4b:
            cosz r6 = (defpackage.cosz) r6
            cors r1 = defpackage.cors.a
            if (r5 != r1) goto L59
            ffbr r5 = r0.j
            java.lang.Object r5 = r5.b()
            asqv r5 = (defpackage.asqv) r5
        L59:
            return r6
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cosd.l(cors, ffgu):java.lang.Object");
    }

    @Override // defpackage.cort
    public final Object m(int i, ffgu ffguVar) {
        return z(i, ffguVar);
    }

    @Override // defpackage.cort
    public final Set n() {
        Set e = ((cora) this.g.b()).e();
        ArrayList arrayList = new ArrayList(ffdx.n(e, 10));
        Iterator it = e.iterator();
        while (it.hasNext()) {
            String str = ((cosz) it.next()).c;
            str.getClass();
            arrayList.add(new djro(str));
        }
        return ffdx.ar(arrayList);
    }

    @Override // defpackage.cort
    public final Set o() {
        if (this.k.a()) {
            return n();
        }
        cosz b2 = ((cora) this.g.b()).b(cors.a);
        if (b2 == null) {
            return ffen.a;
        }
        String str = b2.c;
        str.getClass();
        return fffi.b(new djro(str));
    }

    @Override // defpackage.cort
    public final Set p() {
        Set o = o();
        ArrayList arrayList = new ArrayList();
        Iterator it = o.iterator();
        while (it.hasNext()) {
            cosz coszVar = (cosz) fflm.b(j((djrm) it.next()));
            if (coszVar != null) {
                arrayList.add(coszVar);
            }
        }
        return ffdx.ar(arrayList);
    }

    @Override // defpackage.cort
    public final Set q() {
        return ((cora) this.g.b()).e();
    }

    @Override // defpackage.cort
    public final Set r(djrm djrmVar) {
        djrmVar.getClass();
        return ffdx.ar(engq.e(this.f.c).u().f().c(djrmVar));
    }

    @Override // defpackage.cort
    public final /* bridge */ /* synthetic */ boolean t(int i) {
        if (!((ctud) this.m.b()).k()) {
            return false;
        }
        boolean z = dkvq.b(this.c).a(i) != null;
        if (!((dixe) this.l.b()).a()) {
            return z;
        }
        eqsa eqsaVar = (eqsa) eqsb.a.createBuilder();
        eqsaVar.getClass();
        eqsaVar.copyOnWrite();
        eqsb eqsbVar = (eqsb) eqsaVar.instance;
        eqsbVar.b = 1 | eqsbVar.b;
        eqsbVar.c = i;
        eqsaVar.copyOnWrite();
        eqsb eqsbVar2 = (eqsb) eqsaVar.instance;
        eqsbVar2.b |= 2;
        eqsbVar2.d = z;
        boolean f = ((dkpq) this.i.b()).f();
        eqsaVar.copyOnWrite();
        eqsb eqsbVar3 = (eqsb) eqsaVar.instance;
        eqsbVar3.b |= 8;
        eqsbVar3.f = f;
        eqsaVar.copyOnWrite();
        eqsb eqsbVar4 = (eqsb) eqsaVar.instance;
        eqsbVar4.e = 2;
        eqsbVar4.b |= 4;
        eyfy build = eqsaVar.build();
        build.getClass();
        axol.k(this.d, null, new cosc(this, (eqsb) build, null), 3);
        return z;
    }

    @Override // defpackage.cort
    public final Object u() {
        return o();
    }

    @Override // defpackage.cort
    public final Object v() {
        return ((cora) this.g.b()).g();
    }

    @Override // defpackage.cort
    public final Object w(djrm djrmVar) {
        return ((cora) this.g.b()).i(djrn.a(djrmVar).a);
    }

    @Override // defpackage.cort
    public final Object x(djrm djrmVar) {
        return ((cora) this.g.b()).k(djrmVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059 A[LOOP:0: B:11:0x0053->B:13:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.coru
            if (r0 == 0) goto L13
            r0 = r5
            coru r0 = (defpackage.coru) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            coru r0 = new coru
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            ffbr r5 = r4.g
            java.lang.Object r5 = r5.b()
            cora r5 = (defpackage.cora) r5
            r0.c = r3
            java.lang.Object r5 = r5.g()
            if (r5 == r1) goto L72
        L42:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.ffdx.n(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L53:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r5.next()
            cosz r1 = (defpackage.cosz) r1
            djro r2 = new djro
            java.lang.String r1 = r1.c
            r1.getClass()
            r2.<init>(r1)
            r0.add(r2)
            goto L53
        L6d:
            java.util.Set r5 = defpackage.ffdx.ar(r0)
            return r5
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cosd.y(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(int r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cosd.z(int, ffgu):java.lang.Object");
    }
}

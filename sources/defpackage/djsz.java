package defpackage;

import android.os.Build;
import android.os.ParcelUuid;
import android.telephony.SubscriptionInfo;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Predicate;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djsz implements djsi {
    public static final enru a = enru.c("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl");
    public final cose b;
    public final ffbr c;
    public final ffhd d;
    public final ReentrantReadWriteLock e;
    public final AtomicBoolean f;
    public final List g;
    private final ffsk h;

    public djsz(cose coseVar, ffbr ffbrVar, ffbr ffbrVar2, ffsk ffskVar, ffhd ffhdVar) {
        coseVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        this.b = coseVar;
        this.c = ffbrVar2;
        this.h = ffskVar;
        this.d = ffhdVar;
        this.e = new ReentrantReadWriteLock();
        this.f = new AtomicBoolean(false);
        this.g = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object r(defpackage.djsz r4, defpackage.ffgu r5) {
        /*
            boolean r0 = r5 instanceof defpackage.djss
            if (r0 == 0) goto L13
            r0 = r5
            djss r0 = (defpackage.djss) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            djss r0 = new djss
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            djsz r4 = r0.d
            defpackage.ffci.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.ffci.b(r5)
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = r4.s(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.util.Set r4 = r4.m()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djsz.r(djsz, ffgu):java.lang.Object");
    }

    public static final String w(djrz djrzVar) {
        String c = dktx.SIM_ID.c(djrn.a(djrzVar.a).a);
        djrj djrjVar = djrzVar.b;
        return "{\n      ProvisioningId: " + c + ",\n      Phone Number: " + dktx.PHONE_NUMBER.c(djrjVar != null ? djrjVar.a : null) + ",\n      SubscriptionId: " + djrzVar.c + "\n    }";
    }

    private final djrz x(final djrj djrjVar) {
        return y(new ffji() { // from class: djso
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                djrz djrzVar = (djrz) obj;
                djrzVar.getClass();
                return Boolean.valueOf(ffkj.e(djrzVar.b, djrj.this));
            }
        });
    }

    private final djrz y(ffji ffjiVar) {
        Object obj;
        Iterator it = this.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Boolean) ffjiVar.invoke(obj)).booleanValue()) {
                break;
            }
        }
        return (djrz) obj;
    }

    private final djrz z(final int i) {
        return y(new ffji() { // from class: djsj
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                djrz djrzVar = (djrz) obj;
                djrzVar.getClass();
                return Boolean.valueOf(djrq.b(djrzVar.c, i));
            }
        });
    }

    @Override // defpackage.djsi
    public final /* synthetic */ djrj a(djrm djrmVar) {
        djrmVar.getClass();
        return (djrj) fflm.b(f(djrmVar));
    }

    @Override // defpackage.djsi
    public final /* synthetic */ djrj b(int i) {
        return (djrj) fflm.b(g(i));
    }

    @Override // defpackage.djsi
    public final /* synthetic */ djrm c(djrj djrjVar) {
        return (djrm) fflm.b(h(djrjVar));
    }

    @Override // defpackage.djsi
    public final /* synthetic */ djrq d(djrm djrmVar) {
        djrmVar.getClass();
        ReentrantReadWriteLock.ReadLock readLock = this.e.readLock();
        readLock.lock();
        try {
            if (!this.f.get()) {
                ensk j = a.j();
                j.Y(ente.a, "BugleRcs");
                enrr enrrVar = (enrr) j;
                enrrVar.aa(ensy.FULL);
                ((enrr) enrrVar.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getSubscriptionIdForRcsProvisioningIdOptional", 208, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("getSubscriptionIdForRcsProvisioningIdOptional: accessing uninitialized provisioning identities.");
            }
            djrz p = p(djrmVar);
            djrq djrqVar = p != null ? new djrq(p.c) : null;
            if (djrqVar == null) {
                ensk j2 = a.j();
                j2.Y(ente.a, "BugleRcs");
                enrr enrrVar2 = (enrr) j2;
                enrrVar2.aa(ensy.FULL);
                ((enrr) enrrVar2.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "findSubscriptionIdByProvisioningId-QfiLYjE", 223, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("No subscription id found for RCS provisioning id.");
                u();
            }
            Optional ofNullable = Optional.ofNullable(djrqVar);
            readLock.unlock();
            return (djrq) fflm.b(ofNullable);
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.djsi
    public final elfl e(djrj djrjVar) {
        elfl c;
        c = axol.c(this.h, ffhe.a, ffsm.a, new djsv(this, djrjVar, null));
        return c;
    }

    @Override // defpackage.djsi
    public final Optional f(djrm djrmVar) {
        djrmVar.getClass();
        ReentrantReadWriteLock.ReadLock readLock = this.e.readLock();
        readLock.lock();
        try {
            if (!this.f.get()) {
                ensk j = a.j();
                j.Y(ente.a, "BugleRcs");
                enrr enrrVar = (enrr) j;
                enrrVar.aa(ensy.FULL);
                ((enrr) enrrVar.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getPhoneNumberForRcsProvisioningIdOptional", 122, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("getPhoneNumberForRcsProvisioningIdOptional: accessing uninitialized provisioning identities.");
            }
            djrz p = p(djrmVar);
            djrj djrjVar = p != null ? p.b : null;
            if (djrjVar == null) {
                ensk h = a.h();
                h.Y(ente.a, "BugleRcs");
                enrr enrrVar2 = (enrr) h;
                enrrVar2.aa(ensy.FULL);
                ((enrr) enrrVar2.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getPhoneNumberForRcsProvisioningIdOptional", 131, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("No phone number found for a given provisioning id.");
            }
            return Optional.ofNullable(djrjVar);
        } finally {
            readLock.unlock();
        }
    }

    @Override // defpackage.djsi
    public final Optional g(final int i) {
        djrj djrjVar;
        ReentrantReadWriteLock.ReadLock readLock = this.e.readLock();
        readLock.lock();
        try {
            if (!this.f.get()) {
                ensk j = a.j();
                j.Y(ente.a, "BugleRcs");
                enrr enrrVar = (enrr) j;
                enrrVar.aa(ensy.FULL);
                ((enrr) enrrVar.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getPhoneNumberForSubscriptionIdOptional", PrivateKeyType.INVALID, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("getPhoneNumberForSubscriptionIdOptional: accessing uninitialized provisioning identities.");
            }
            djrz z = z(i);
            if (z != null) {
                djrjVar = z.b;
            } else {
                enru enruVar = a;
                ensk j2 = enruVar.j();
                j2.Y(ente.a, "BugleRcs");
                ((enrr) j2.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getPhoneNumberForSubscriptionIdInternal-0jkzt_0", 283, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("phone number null, checking subscription exists in same subscription group.");
                djrz y = y(new ffji() { // from class: djsk
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        djrz djrzVar = (djrz) obj;
                        djrzVar.getClass();
                        boolean z2 = false;
                        if (Build.VERSION.SDK_INT >= 29) {
                            djsz djszVar = djsz.this;
                            int i2 = i;
                            int i3 = djrzVar.c;
                            cose coseVar = djszVar.b;
                            String o = coseVar.b.h(i3).o();
                            if (o != null || (o = coseVar.b.h(i2).o()) != null) {
                                try {
                                    List d = dkvq.b(coseVar.a).d(ParcelUuid.fromString(o));
                                    d.getClass();
                                    ArrayList arrayList = new ArrayList(ffdx.n(d, 10));
                                    Iterator it = d.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(Integer.valueOf(((SubscriptionInfo) it.next()).getSubscriptionId()));
                                    }
                                    if (arrayList.contains(Integer.valueOf(i3))) {
                                        if (arrayList.contains(Integer.valueOf(i2))) {
                                            z2 = true;
                                        }
                                    }
                                } catch (IllegalArgumentException unused) {
                                }
                            }
                        }
                        return Boolean.valueOf(z2);
                    }
                });
                if (y != null) {
                    djrjVar = y.b;
                } else {
                    ensk j3 = enruVar.j();
                    j3.Y(ente.a, "BugleRcs");
                    enrr enrrVar2 = (enrr) j3;
                    enrrVar2.aa(ensy.FULL);
                    enrrVar2.Y(csux.t, Integer.valueOf(i));
                    ((enrr) enrrVar2.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getPhoneNumberForSubscriptionIdInternal-0jkzt_0", 296, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("No RCS phone number found for subscription id.");
                    u();
                    djrjVar = null;
                }
            }
            return Optional.ofNullable(djrjVar);
        } finally {
            readLock.unlock();
        }
    }

    @Override // defpackage.djsi
    public final Optional h(djrj djrjVar) {
        ReentrantReadWriteLock.ReadLock readLock = this.e.readLock();
        readLock.lock();
        try {
            if (!this.f.get()) {
                ensk j = a.j();
                j.Y(ente.a, "BugleRcs");
                enrr enrrVar = (enrr) j;
                enrrVar.aa(ensy.FULL);
                ((enrr) enrrVar.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getRcsProvisioningIdForPhoneNumberOptional", 160, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("getRcsProvisioningIdForPhoneNumberOptional: accessing uninitialized provisioning identities.");
            }
            djrz x = x(djrjVar);
            djrm djrmVar = x != null ? x.a : null;
            if (djrmVar == null) {
                ensk j2 = a.j();
                j2.Y(ente.a, "BugleRcs");
                enrr enrrVar2 = (enrr) j2;
                enrrVar2.aa(ensy.FULL);
                enrrVar2.Y(csux.E, djrjVar.a);
                ((enrr) enrrVar2.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "findProvisioningIdByPhoneNumber", 176, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("No RCS provisioning id found for given phone number.");
                u();
            }
            return Optional.ofNullable(djrmVar);
        } finally {
            readLock.unlock();
        }
    }

    @Override // defpackage.djsi
    public final Optional i(djrj djrjVar) {
        djrjVar.getClass();
        ReentrantReadWriteLock.ReadLock readLock = this.e.readLock();
        readLock.lock();
        try {
            if (!this.f.get()) {
                ensk j = a.j();
                j.Y(ente.a, "BugleRcs");
                enrr enrrVar = (enrr) j;
                enrrVar.aa(ensy.FULL);
                ((enrr) enrrVar.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getSubscriptionIdForPhoneNumberOptional", 323, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("getSubscriptionIdForPhoneNumberOptional: accessing uninitialized provisioning identities.");
            }
            djrz x = x(djrjVar);
            djrq djrqVar = x != null ? new djrq(x.c) : null;
            if (djrqVar == null) {
                ensk j2 = a.j();
                j2.Y(ente.a, "BugleRcs");
                enrr enrrVar2 = (enrr) j2;
                enrrVar2.aa(ensy.FULL);
                enrrVar2.Y(csux.E, djrjVar.a);
                ((enrr) enrrVar2.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "findSubscriptionIdByPhoneNumber-QfiLYjE", 339, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("No subscription id found for MSISDN.");
                u();
            }
            return Optional.ofNullable(djrqVar);
        } finally {
            readLock.unlock();
        }
    }

    @Override // defpackage.djsi
    public final Object j(ffgu ffguVar) {
        return r(this, ffguVar);
    }

    @Override // defpackage.djsi
    public final Object k(djrm djrmVar, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.d), new djst(null, this, djrmVar), ffguVar);
    }

    @Override // defpackage.djsi
    public final Object l(djrj djrjVar, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.d), new djsw(null, this, djrjVar), ffguVar);
    }

    @Override // defpackage.djsi
    public final Set m() {
        ReentrantReadWriteLock.ReadLock readLock = this.e.readLock();
        readLock.lock();
        try {
            if (!this.f.get()) {
                ensk j = a.j();
                j.Y(ente.a, "BugleRcs");
                enrr enrrVar = (enrr) j;
                enrrVar.aa(ensy.FULL);
                ((enrr) enrrVar.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getAvailablePhoneNumbersSync", 360, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("getAvailablePhoneNumbers: accessing uninitialized provisioning identities.");
            }
            List list = this.g;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                djrj djrjVar = ((djrz) it.next()).b;
                if (djrjVar != null) {
                    arrayList.add(djrjVar);
                }
            }
            Set ar = ffdx.ar(arrayList);
            if (ar.isEmpty()) {
                ensk h = a.h();
                h.Y(ente.a, "BugleRcs");
                enrr enrrVar2 = (enrr) h;
                enrrVar2.aa(ensy.FULL);
                ((enrr) enrrVar2.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getAvailablePhoneNumbersSync", 364, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("No phone numbers available.");
            }
            return ar;
        } finally {
            readLock.unlock();
        }
    }

    @Override // defpackage.djsi
    public final Set n() {
        ReentrantReadWriteLock.ReadLock readLock = this.e.readLock();
        readLock.lock();
        try {
            if (!this.f.get()) {
                ensk j = a.j();
                j.Y(ente.a, "BugleRcs");
                enrr enrrVar = (enrr) j;
                enrrVar.aa(ensy.FULL);
                ((enrr) enrrVar.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getAvailableSubscriptionIdsSync", 405, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("getAvailableSubscriptionIds: accessing uninitialized provisioning identities.");
            }
            List list = this.g;
            ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new djrq(((djrz) it.next()).c));
            }
            Set ar = ffdx.ar(arrayList);
            if (ar.isEmpty()) {
                ensk h = a.h();
                h.Y(ente.a, "BugleRcs");
                enrr enrrVar2 = (enrr) h;
                enrrVar2.aa(ensy.FULL);
                ((enrr) enrrVar2.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getAvailableSubscriptionIdsSync", 409, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("No subscription ids.");
            }
            return ar;
        } finally {
            readLock.unlock();
        }
    }

    @Override // defpackage.djsi
    public final boolean o() {
        ReentrantReadWriteLock.ReadLock readLock = this.e.readLock();
        readLock.lock();
        try {
            return this.g.isEmpty();
        } finally {
            readLock.unlock();
        }
    }

    public final djrz p(final djrm djrmVar) {
        return y(new ffji() { // from class: djsn
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                djrz djrzVar = (djrz) obj;
                djrzVar.getClass();
                return Boolean.valueOf(ffkj.e(djrzVar.a, djrm.this));
            }
        });
    }

    public final Optional q(int i) {
        ReentrantReadWriteLock.ReadLock readLock = this.e.readLock();
        readLock.lock();
        try {
            if (!this.f.get()) {
                ensk j = a.j();
                j.Y(ente.a, "BugleRcs");
                enrr enrrVar = (enrr) j;
                enrrVar.aa(ensy.FULL);
                ((enrr) enrrVar.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "logIfMapNotInitialized", 515, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("Accessing uninitialized provisioning identities.");
            }
            djrz z = z(i);
            if (z == null) {
                ensk j2 = a.j();
                j2.Y(ente.a, "BugleRcs");
                enrr enrrVar2 = (enrr) j2;
                enrrVar2.aa(ensy.FULL);
                ((enrr) enrrVar2.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getRcsProvisioningIdForSubscriptionIdOptional", 93, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("No rcs provisioning id found for a given sub id.");
            }
            return Optional.ofNullable(z != null ? z.a : null);
        } finally {
            readLock.unlock();
        }
    }

    public final Object s(ffgu ffguVar) {
        Object a2 = ffra.a(ekxi.a(this.d), new djsx(null, this), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    public final Set t() {
        ReentrantReadWriteLock.ReadLock readLock = this.e.readLock();
        readLock.lock();
        try {
            if (!this.f.get()) {
                ensk j = a.j();
                j.Y(ente.a, "BugleRcs");
                enrr enrrVar = (enrr) j;
                enrrVar.aa(ensy.FULL);
                enrrVar.W(1, TimeUnit.MINUTES);
                ((enrr) enrrVar.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getAvailableProvisioningIdsSync", 385, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("getAvailableProvisioningIds: accessing uninitialized provisioning identities.");
            }
            List list = this.g;
            ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((djrz) it.next()).a);
            }
            return ffdx.ar(arrayList);
        } finally {
            readLock.unlock();
        }
    }

    public final void u() {
        ReentrantReadWriteLock.ReadLock readLock = this.e.readLock();
        readLock.lock();
        try {
            ensk e = a.e();
            e.Y(ente.a, "BugleRcs");
            ((enrr) e.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "logDebugIdentityMappingInfos", 470, "RcsProvisioningIdentityMappingAccessorImpl.kt")).t("Identity mapping for debugging: %s", ffdx.aA(this.g, "\n", null, null, new ffji() { // from class: djsr
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    djrz djrzVar = (djrz) obj;
                    djrzVar.getClass();
                    return djsz.w(djrzVar);
                }
            }, 30));
        } finally {
            readLock.unlock();
        }
    }

    public final void v(final djrm djrmVar, djrj djrjVar, int i) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.e;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i3 = 0; i3 < readHoldCount; i3++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            djrz djrzVar = new djrz(djrmVar, djrjVar, i);
            ensk e = a.e();
            e.Y(ente.a, "BugleRcs");
            ((enrr) e.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "putIdentifierMappingValues", 424, "RcsProvisioningIdentityMappingAccessorImpl.kt")).t("Adding identity mapping {%s}", w(djrzVar));
            List list = this.g;
            final ffji ffjiVar = new ffji() { // from class: djsl
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    djrz djrzVar2 = (djrz) obj;
                    djrzVar2.getClass();
                    return Boolean.valueOf(ffkj.e(djrzVar2.a, djrm.this));
                }
            };
            Collection.EL.removeIf(list, new Predicate() { // from class: djsm
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
                    return ((Boolean) ffji.this.invoke(obj)).booleanValue();
                }
            });
            this.g.add(djrzVar);
            u();
            this.f.set(true);
        } finally {
            while (i2 < readHoldCount) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }
}

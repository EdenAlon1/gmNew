package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.verifiedsmsworkers.VerifiedSmsKeyRotationWork;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddzz extends cpdo {
    public static final Object a = new Object();
    public static final cskc b = cskc.g("Bugle", "VerifiedSmsStartupTask");
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final errl h;
    public final ffbr i;
    public final Context j;
    private final errl l;

    public ddzz(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, errl errlVar, errl errlVar2, ffbr ffbrVar6) {
        this.j = context;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.g = ffbrVar5;
        this.l = errlVar;
        this.h = errlVar2;
        this.i = ffbrVar6;
    }

    @Override // defpackage.cqor
    public final ekzz a() {
        return eleg.f("VerifiedSmsStartupTask");
    }

    @Override // defpackage.cpdo
    public final elfl b() {
        final boolean d = ((cuye) this.c.b()).d();
        final boolean c = ((cuye) this.c.b()).c();
        return ((cuye) this.c.b()).a().i(new eroh() { // from class: ddzx
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Boolean bool = (Boolean) obj;
                csjb c2 = ddzz.b.c();
                c2.I("Checking if Verified SMS tasks should be enqueued.");
                boolean z = d;
                c2.B("feature supported", z);
                boolean z2 = c;
                c2.B("feature enabled", z2);
                c2.A("eligible / has registered key", bool);
                final ddzz ddzzVar = ddzz.this;
                c2.B("C11N", ((cuye) ddzzVar.c.b()).b());
                c2.r();
                if (!z2 || !z || !Boolean.TRUE.equals(bool)) {
                    ddzz.b.p("Not enqueuing VSMS periodic task, VSMS is disabled or not supported.");
                    if (((ctyz) ddzzVar.d.b()).a.q("app_contains_verified_sms_data", false)) {
                        ddzz.b.r("VSMS is disabled, but preferences shows data exists on the device.");
                        ((cbxr) ddzzVar.f.b()).a();
                    }
                    return elfo.e(null);
                }
                ((ctyz) ddzzVar.d.b()).d(true);
                pqr.a(ddzzVar.j).a("verified_sms_request_verified_senders_work_tag");
                if (((Boolean) cful.af.e()).booleanValue()) {
                    final long longValue = ((Long) cful.ae.e()).longValue();
                    return ((cvbr) ddzzVar.e.b()).c().h(new emwl() { // from class: ddzu
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            Long l = (Long) obj2;
                            csjb c3 = ddzz.b.c();
                            c3.I("Verified SMS is enabled.");
                            c3.r();
                            if (l != null) {
                                long j = longValue;
                                if (l.longValue() != j) {
                                    ddzz ddzzVar2 = ddzz.this;
                                    pqs a2 = pqr.a(ddzzVar2.j);
                                    poz pozVar = poz.REPLACE;
                                    pqh pqhVar = new pqh(VerifiedSmsKeyRotationWork.class, Duration.ofMillis(j));
                                    pon ponVar = new pon();
                                    ponVar.h("vsms_key_rotation_work_frequency", j);
                                    pqhVar.j(ponVar.a());
                                    poh pohVar = new poh();
                                    pohVar.c(2);
                                    pqhVar.g(pohVar.a());
                                    pqhVar.d("verified_sms_key_rotation_unique_work_tag");
                                    a2.f("verified_sms_key_rotation_unique_work_name", pozVar, (pqi) pqhVar.b());
                                    csjb c4 = cbxv.a.c();
                                    c4.I("Enqueued request for Verified SMS key rotation.");
                                    c4.z("interval frequency", j);
                                    c4.r();
                                    return null;
                                }
                            }
                            csjb c5 = ddzz.b.c();
                            c5.I("Not enqueuing Verified SMS key rotation work since interval frequency is unchanged.");
                            c5.A("interval frequency", l);
                            c5.r();
                            return null;
                        }
                    }, ddzzVar.h);
                }
                final cbxr cbxrVar = (cbxr) ddzzVar.f.b();
                return cbxrVar.g.c().i(new eroh() { // from class: cbxq
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        Long l = (Long) obj2;
                        if (l == null || l.longValue() <= 0) {
                            cbxr.a.m("Key rotation work is not present. Nothing to do.");
                            return elfo.e(null);
                        }
                        final cbxr cbxrVar2 = cbxr.this;
                        cbxr.a.r("Key rotation work was present and cancellation was requested. Cancelling..");
                        return elfl.g(((pqc) pqr.a(cbxrVar2.b).b("verified_sms_key_rotation_unique_work_name")).c).i(new eroh() { // from class: cbxp
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                return cbxr.this.g.g(-1L);
                            }
                        }, erpp.a);
                    }
                }, cbxrVar.j);
            }
        }, this.l).i(new eroh() { // from class: ddzy
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                elfl elflVar;
                ddzz ddzzVar = ddzz.this;
                if (!((cuye) ddzzVar.c.b()).b()) {
                    ddzz.b.p("Not calling C11N to get phone numbers.");
                    return elfo.e(ddzz.a);
                }
                ddzz.b.p("Calling C11N to get phone numbers...");
                final cvad cvadVar = (cvad) ddzzVar.g.b();
                if (!cvadVar.o.isDone()) {
                    cvad.a.p("Received a registration request for C11N but something else is already running.");
                    elflVar = cvadVar.o;
                } else if (cvadVar.f.d()) {
                    elfl i = cvadVar.b.d().i(new eroh() { // from class: cuzz
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            cvas cvasVar = (cvas) obj2;
                            final cvad cvadVar2 = cvad.this;
                            long epochMilli = cvadVar2.m.f().toEpochMilli();
                            long j = cvasVar != null ? cvasVar.g : 0L;
                            long longValue = ((Long) cuye.a.e()).longValue() + j;
                            if (j == 0 || longValue <= epochMilli) {
                                if (!DesugarCollections.unmodifiableMap(cvasVar.d).keySet().containsAll((enip) Collection.EL.stream(cvadVar2.g.m()).map(new Function() { // from class: cuzn
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        return ((ctwi) obj3).y(cvad.this.j);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).filter(new Predicate() { // from class: cuzo
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
                                    public final boolean test(Object obj3) {
                                        return !TextUtils.isEmpty((String) obj3);
                                    }
                                }).collect(endq.b))) {
                                    return cvadVar2.e.a().i(new eroh() { // from class: cvac
                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Removed duplicated region for block: B:15:0x01e7  */
                                        /* JADX WARN: Removed duplicated region for block: B:32:0x021b A[SYNTHETIC] */
                                        /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
                                        /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
                                        @Override // defpackage.eroh
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct add '--show-bad-code' argument
                                        */
                                        public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r19) {
                                            /*
                                                Method dump skipped, instructions count: 671
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: defpackage.cvac.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                                        }
                                    }, cvadVar2.k);
                                }
                                cvad.a.p("The device doesn't have a new IMSI not registered with VSMS.");
                                return elfo.e(false);
                            }
                            csjb c2 = cvad.a.c();
                            c2.I("Too early for C11N check");
                            c2.z("last check time", j);
                            c2.z("earliest next check time", longValue);
                            c2.z("current time", epochMilli);
                            c2.r();
                            return elfo.e(false);
                        }
                    }, cvadVar.k);
                    cvadVar.o = i;
                    elflVar = i;
                } else {
                    cvad.a.p("VSMS is not enabled/supported, skipping retrieval.");
                    elflVar = elfo.e(false);
                }
                return elflVar.e(Throwable.class, new emwl() { // from class: ddzv
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        ddzz.b.s("Could not use Verified SMS C11N token", (Throwable) obj2);
                        return false;
                    }
                }, ddzzVar.h).h(new emwl() { // from class: ddzw
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        if (Boolean.TRUE.equals((Boolean) obj2)) {
                            ddzz.b.p("C11N registration succeeded.");
                        } else {
                            ddzz.b.p("C11N registration didn't update with any new data.");
                        }
                        return ddzz.a;
                    }
                }, ddzzVar.h);
            }
        }, this.h);
    }

    @Override // defpackage.cpeh
    public final boolean c() {
        return true;
    }
}

package com.google.android.apps.messaging.shared.datamodel.verifiedsmsworkers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.google.android.gms.constellation.PhoneNumberInfo;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cbxv;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ekhw;
import defpackage.emwl;
import defpackage.eroh;
import defpackage.erpp;
import defpackage.pot;
import defpackage.ppr;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class VerifiedSmsKeyRotationWork extends ppr {
    private static final cskc e = cskc.g("Bugle", "VerifiedSmsKeyRotationWork");
    private final cbxv f;

    /* compiled from: PG */
    public interface a {
        cbxv bO();
    }

    public VerifiedSmsKeyRotationWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f = ((a) ekhw.a(context, a.class)).bO();
        e.m("VerifiedSmsKeyRotationWork created.");
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        e.m("Beginning VerifiedSmsKeyRotationWork work");
        pot f = f();
        cbxv.a.m("Beginning VerifiedSmsKeyRotationWork work");
        long b = f.b("vsms_key_rotation_work_frequency", -1L);
        csjb a2 = cbxv.a.a();
        a2.I("Updating shared prefs with new VSMS Key Rotation interval schedule.");
        a2.z("interval schedule", b);
        a2.r();
        final cbxv cbxvVar = this.f;
        return cbxvVar.c.g(b).i(new eroh() { // from class: cbxs
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cvad.a.p("Starting key rotation...");
                final cvad cvadVar = cbxv.this.d;
                return cvadVar.b.d().i(new eroh() { // from class: cuze
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        final cvas cvasVar = (cvas) obj2;
                        Stream stream = Collection.EL.stream(DesugarCollections.unmodifiableMap(cvasVar.e).keySet());
                        final cvad cvadVar2 = cvad.this;
                        Stream map = stream.map(new Function() { // from class: cuyw
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                final String str = (String) obj3;
                                csjb c = cvad.a.c();
                                c.I("Reading data to rotate keys for");
                                c.x("phone", str, 2);
                                c.r();
                                final cvan cvanVar = cvan.a;
                                str.getClass();
                                eyhm eyhmVar = cvasVar.e;
                                if (eyhmVar.containsKey(str)) {
                                    cvanVar = (cvan) eyhmVar.get(str);
                                }
                                final cvad cvadVar3 = cvad.this;
                                if (Math.abs(cvadVar3.m.f().toEpochMilli() - cvanVar.c) >= ((Long) cful.ae.e()).longValue()) {
                                    return cvadVar3.e.a().h(new emwl() { // from class: cvab
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj4) {
                                            Stream stream2 = Collection.EL.stream((engw) obj4);
                                            final String str2 = str;
                                            Optional findFirst = stream2.filter(new Predicate() { // from class: cuzg
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
                                                public final boolean test(Object obj5) {
                                                    return str2.equals(((PhoneNumberInfo) obj5).b);
                                                }
                                            }).findFirst();
                                            if (findFirst.isEmpty()) {
                                                csjb e2 = cvad.a.e();
                                                e2.I("Unable to find C11N phone number for key rotation");
                                                e2.x("msisdn", str2, 2);
                                                e2.r();
                                                return Optional.empty();
                                            }
                                            String d = cvad.d((PhoneNumberInfo) findFirst.get());
                                            if (!TextUtils.isEmpty(d)) {
                                                return Optional.of(d);
                                            }
                                            csjb e3 = cvad.a.e();
                                            e3.I("Unable to find C11N token in the results for key rotation");
                                            e3.x("msisdn", str2, 2);
                                            e3.r();
                                            return Optional.empty();
                                        }
                                    }, cvadVar3.k).i(new eroh() { // from class: cuzf
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj4) {
                                            final cval cvalVar = (cval) cvanVar.toBuilder();
                                            cvalVar.getClass();
                                            ((Optional) obj4).ifPresent(new Consumer() { // from class: cuyv
                                                @Override // java.util.function.Consumer
                                                /* renamed from: accept */
                                                public final void o(Object obj5) {
                                                    cval cvalVar2 = cval.this;
                                                    String str2 = (String) obj5;
                                                    cvalVar2.copyOnWrite();
                                                    cvan cvanVar2 = (cvan) cvalVar2.instance;
                                                    cvan cvanVar3 = cvan.a;
                                                    str2.getClass();
                                                    cvanVar2.e = str2;
                                                }

                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                }
                                            });
                                            return cvad.this.a(str, (cvan) cvalVar.build(), null);
                                        }
                                    }, cvadVar3.k);
                                }
                                cvad.a.p("Skipping key rotation for requested key. Key rotation interval has not been satisfied.");
                                return elfo.e(false);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int i = engw.d;
                        final engw engwVar = (engw) map.collect(endq.a);
                        return elfo.l(engwVar).a(new Callable() { // from class: cuyx
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return Boolean.valueOf(Collection.EL.stream((List) erqt.q(erqt.o(engw.this))).filter(new Predicate() { // from class: cuzt
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
                                        return Objects.nonNull((Boolean) obj3);
                                    }
                                }).anyMatch(new Predicate() { // from class: cuzu
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
                                        return ((Boolean) obj3).booleanValue();
                                    }
                                }));
                            }
                        }, cvadVar2.k);
                    }
                }, cvadVar.k);
            }
        }, cbxvVar.f).h(new emwl() { // from class: cbxt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cbxv.this.e.c(true != Boolean.TRUE.equals((Boolean) obj) ? "Bugle.VerifiedSms.KeyRotation.Failure" : "Bugle.VerifiedSms.KeyRotation.Success");
                return new ppp();
            }
        }, cbxvVar.f).e(Throwable.class, new emwl() { // from class: cbxu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                boolean contains = cbxv.b.contains(Status.c(th).getCode());
                cbxv cbxvVar2 = cbxv.this;
                if (contains) {
                    cbxvVar2.e.c("Bugle.VerifiedSms.KeyRotation.Failure.Retriable");
                    cbxv.a.s("Error in the vSms Register gRPC. Scheduling a retry.", th);
                    return new ppo();
                }
                cbxv.a.s("Error in the vSms Register gRPC. Scheduling failed with:", th);
                cbxvVar2.e.c("Bugle.VerifiedSms.KeyRotation.Failure");
                cbxvVar2.e.c("Bugle.VerifiedSms.KeyRotation.FailureWRetries");
                return new ppn();
            }
        }, erpp.a);
    }
}

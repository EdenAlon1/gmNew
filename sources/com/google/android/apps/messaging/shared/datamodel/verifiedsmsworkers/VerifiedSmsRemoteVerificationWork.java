package com.google.android.apps.messaging.shared.datamodel.verifiedsmsworkers;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.verifiedsmsworkers.VerifiedSmsRemoteVerificationWork;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cbgq;
import defpackage.cbyf;
import defpackage.chkk;
import defpackage.cqoh;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.cvbr;
import defpackage.ekhw;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfl;
import defpackage.emwl;
import defpackage.emxe;
import defpackage.eroh;
import defpackage.erpp;
import defpackage.erqt;
import defpackage.errl;
import defpackage.pot;
import defpackage.ppn;
import defpackage.ppr;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class VerifiedSmsRemoteVerificationWork extends ppr {
    private static final cskc j = cskc.g("Bugle", "VerifiedSmsRemoteVerificationWork");
    public final chkk e;
    public final errl f;
    public final errl g;
    public final cbyf h;
    public volatile long i;
    private final cqoh k;
    private final cvbr l;
    private final elbx m;

    /* compiled from: PG */
    public interface a {
        elbx b();

        cbyf bP();

        chkk bZ();

        cvbr cX();

        errl p();

        errl q();

        cqoh v();
    }

    public VerifiedSmsRemoteVerificationWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        csjb a2 = j.a();
        a2.I("VerifiedSmsRemoteVerificationWork created.");
        a2.r();
        a aVar = (a) ekhw.a(context, a.class);
        this.e = aVar.bZ();
        this.f = aVar.p();
        this.g = aVar.q();
        this.k = aVar.v();
        this.h = aVar.bP();
        this.l = aVar.cX();
        this.m = aVar.b();
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        this.i = this.k.f().toEpochMilli();
        cskc cskcVar = j;
        cskcVar.m("Beginning vsms remote verification work.");
        final pot f = f();
        csjb a2 = cbyf.c.a();
        a2.I("Validating vsms request data.");
        a2.r();
        if (f.e().keySet().containsAll(cbyf.b)) {
            csjb a3 = cbyf.c.a();
            a3.I("All vsms keys present in input data.");
            a3.r();
            cskcVar.m("Beginning remote verification request.");
            final String b = emxe.b(f.d("vsms_imsi_key"));
            ekzm b2 = this.m.b("VerifiedSmsRemoteVerificationWork");
            try {
                elfl i = this.l.d().h(new emwl() { // from class: cvbc
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        cvan cvanVar;
                        cvas cvasVar = (cvas) obj;
                        engf engfVar = cvbr.a;
                        String str = b;
                        if (cvasVar.a(str)) {
                            eyhm eyhmVar = cvasVar.d;
                            if (!eyhmVar.containsKey(str)) {
                                throw new IllegalArgumentException();
                            }
                            String str2 = (String) eyhmVar.get(str);
                            cvanVar = cvan.a;
                            str2.getClass();
                            eyhm eyhmVar2 = cvasVar.e;
                            if (eyhmVar2.containsKey(str2)) {
                                cvanVar = (cvan) eyhmVar2.get(str2);
                            }
                        } else {
                            cvanVar = null;
                        }
                        return Optional.ofNullable(cvanVar).filter(new Predicate() { // from class: cvbo
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
                                engf engfVar2 = cvbr.a;
                                return ((cvan) obj2).b.size() > 0;
                            }
                        });
                    }
                }, erpp.a).h(new emwl() { // from class: cvaw
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Optional optional = (Optional) obj;
                        engf engfVar = cvbr.a;
                        if (!optional.isPresent()) {
                            return cvam.UNKNOWN_TYPE;
                        }
                        cvan cvanVar = (cvan) optional.get();
                        if (cvanVar.b.size() == 0) {
                            cvbr.b.r("Registration type requested, but no keys exist.");
                            return cvam.UNKNOWN_TYPE;
                        }
                        cvam cvamVar = cvam.UNKNOWN_TYPE;
                        cvam b3 = cvam.b(cvanVar.f);
                        if (b3 == null) {
                            b3 = cvam.UNRECOGNIZED;
                        }
                        if (!cvamVar.equals(b3)) {
                            csjb c = cvbr.b.c();
                            cvam b4 = cvam.b(cvanVar.f);
                            if (b4 == null) {
                                b4 = cvam.UNRECOGNIZED;
                            }
                            c.A("Registration type set.", b4);
                            c.r();
                            cvam b5 = cvam.b(cvanVar.f);
                            return b5 == null ? cvam.UNRECOGNIZED : b5;
                        }
                        if (!cvanVar.d.H() && cvanVar.e.isEmpty()) {
                            cvbr.b.p("Registration type not set, but only RCS token exists. Inferring RCS registration.");
                            return cvam.RCS;
                        }
                        if (cvanVar.e.isEmpty() || !cvanVar.d.H()) {
                            cvbr.b.r("Registration type requested, but 1) No registration type is set and 2) The registration type cannot be inferred.");
                            return cvam.NOT_YET_KNOWN;
                        }
                        cvbr.b.p("Registration type not set, but only C11N token exists. Inferring C11N registration.");
                        return cvam.C11N;
                    }
                }, erpp.a).i(new eroh() { // from class: cbxw
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        final pot potVar = f;
                        final cvam cvamVar = (cvam) obj;
                        final String b3 = emxe.b(potVar.d("vsms_message_body"));
                        final engw a4 = cbwy.a(potVar);
                        final String b4 = emxe.b(potVar.d("vsms_imsi_key"));
                        csjb c = cvdc.a.c();
                        c.I("Creating hash codes for");
                        c.M("imsi", b4);
                        c.M("message", b3);
                        c.r();
                        csjb c2 = cvdc.a.c();
                        c2.I("Reading VSMS key pairs");
                        c2.M("imsi", b4);
                        c2.r();
                        final VerifiedSmsRemoteVerificationWork verifiedSmsRemoteVerificationWork = VerifiedSmsRemoteVerificationWork.this;
                        final cvdc cvdcVar = verifiedSmsRemoteVerificationWork.h.g;
                        return cvdcVar.b.d().i(new eroh() { // from class: cvcx
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                cvas cvasVar = (cvas) obj2;
                                int i2 = engw.d;
                                String str = b4;
                                List list = enou.a;
                                if (cvasVar.a(str)) {
                                    eyhm eyhmVar = cvasVar.d;
                                    if (!eyhmVar.containsKey(str)) {
                                        throw new IllegalArgumentException();
                                    }
                                    String str2 = (String) eyhmVar.get(str);
                                    cvan cvanVar = cvan.a;
                                    str2.getClass();
                                    eyhm eyhmVar2 = cvasVar.e;
                                    if (eyhmVar2.containsKey(str2)) {
                                        cvanVar = (cvan) eyhmVar2.get(str2);
                                    }
                                    list = cvanVar.b;
                                } else {
                                    csjb c3 = cvdc.a.c();
                                    c3.I("No IMSI -> MSISDN mapping exists for IMSI");
                                    c3.M("IMSI", str);
                                    c3.r();
                                }
                                cvan cvanVar2 = cvan.a;
                                eyhm eyhmVar3 = cvasVar.c;
                                if (eyhmVar3.containsKey(str)) {
                                    cvanVar2 = (cvan) eyhmVar3.get(str);
                                }
                                eygr eygrVar = cvanVar2.b;
                                if (list.isEmpty() && eygrVar.isEmpty()) {
                                    csjb e = cvdc.a.e();
                                    e.I("No VSMS key pairs were found for");
                                    e.M("imsi", str);
                                    e.r();
                                    return elfo.e(enou.a);
                                }
                                cvdc cvdcVar2 = cvdc.this;
                                csjb c4 = cvdc.a.c();
                                c4.y("number of new vsms keys", list.size());
                                c4.y("number of old vsms keys", eygrVar.size());
                                c4.r();
                                Stream concat = Stream.CC.concat(Collection.EL.stream(list), Collection.EL.stream(eygrVar));
                                cvcg cvcgVar = cvdcVar2.c;
                                cvcgVar.getClass();
                                return elfo.a((Iterable) concat.map(new cvct(cvcgVar)).collect(endq.a));
                            }
                        }, cvdcVar.d).h(new emwl() { // from class: cvcz
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                Stream stream = Collection.EL.stream((List) obj2);
                                final cvdc cvdcVar2 = cvdc.this;
                                final java.util.Collection collection = a4;
                                final String str = b3;
                                Stream flatMap = stream.map(new Function() { // from class: cvcn
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        KeyPair keyPair = (KeyPair) obj3;
                                        csjb d = cvdc.a.d();
                                        d.I("Creating vsms hash using key pair with public key");
                                        d.A("public key", Base64.encodeToString(keyPair.getPublic().getEncoded(), 0));
                                        d.r();
                                        return cvdc.this.e((ECPrivateKey) keyPair.getPrivate(), collection, str);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).flatMap(new Function() { // from class: cvco
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        return Collection.EL.stream((List) obj3);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                int i2 = engw.d;
                                return (List) flatMap.collect(endq.a);
                            }
                        }, cvdcVar.d).h(new emwl() { // from class: cbye
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                List list = (List) obj2;
                                enip enipVar = cbyf.a;
                                pot potVar2 = pot.this;
                                String b5 = emxe.b(potVar2.d("vsms_sender_id"));
                                int a5 = potVar2.a("vsms_mcc_key", -1);
                                int a6 = potVar2.a("vsms_mnc_key", -1);
                                String b6 = emxe.b(potVar2.d("sms_verification_existing_brand_version_key"));
                                etdu etduVar = (etdu) etdv.a.createBuilder();
                                etduVar.copyOnWrite();
                                ((etdv) etduVar.instance).d = b5;
                                etec etecVar = (etec) eted.a.createBuilder();
                                etecVar.copyOnWrite();
                                ((eted) etecVar.instance).b = a5;
                                etecVar.copyOnWrite();
                                ((eted) etecVar.instance).c = a6;
                                etduVar.copyOnWrite();
                                etdv etdvVar = (etdv) etduVar.instance;
                                eted etedVar = (eted) etecVar.build();
                                etedVar.getClass();
                                etdvVar.e = etedVar;
                                etdvVar.b |= 2;
                                etduVar.copyOnWrite();
                                ((etdv) etduVar.instance).f = b6;
                                etduVar.copyOnWrite();
                                etdv etdvVar2 = (etdv) etduVar.instance;
                                eygr eygrVar = etdvVar2.g;
                                if (!eygrVar.c()) {
                                    etdvVar2.g = eyfy.mutableCopy(eygrVar);
                                }
                                cvam cvamVar2 = cvamVar;
                                eydl.addAll(list, etdvVar2.g);
                                if (cvbr.a.containsValue(cvamVar2)) {
                                    eten etenVar = (eten) ((enot) cvbr.a).d.getOrDefault(cvamVar2, eten.REGISTRATION_TYPE_UNSPECIFIED);
                                    etduVar.copyOnWrite();
                                    ((etdv) etduVar.instance).h = etenVar.a();
                                }
                                etdv etdvVar3 = (etdv) etduVar.build();
                                csjb a7 = cbyf.c.a();
                                a7.I("Verification params");
                                a7.M("senderId", etdvVar3.d);
                                eted etedVar2 = etdvVar3.e;
                                if (etedVar2 == null) {
                                    etedVar2 = eted.a;
                                }
                                a7.A("MccMnc", etedVar2);
                                a7.N("hashes", etdvVar3.g);
                                a7.r();
                                return (etdv) etduVar.build();
                            }
                        }, erpp.a).i(new eroh() { // from class: cbxz
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                final etdv etdvVar = (etdv) obj2;
                                etdvVar.getClass();
                                etdu etduVar = (etdu) etdvVar.toBuilder();
                                etfd a5 = chkk.a();
                                etduVar.copyOnWrite();
                                etdv etdvVar2 = (etdv) etduVar.instance;
                                a5.getClass();
                                etdvVar2.c = a5;
                                etdvVar2.b |= 1;
                                etdv etdvVar3 = (etdv) etduVar.build();
                                final VerifiedSmsRemoteVerificationWork verifiedSmsRemoteVerificationWork2 = VerifiedSmsRemoteVerificationWork.this;
                                eteh etehVar = (eteh) verifiedSmsRemoteVerificationWork2.e.a.a().j(((Long) chhs.h.e()).longValue(), TimeUnit.MILLISECONDS);
                                fdxk fdxkVar = etehVar.a;
                                febs febsVar = etei.b;
                                if (febsVar == null) {
                                    synchronized (etei.class) {
                                        febsVar = etei.b;
                                        if (febsVar == null) {
                                            febp a6 = febs.a();
                                            a6.c = febr.UNARY;
                                            a6.d = febs.c("google.communications.verifiedsms.v1.MessageVerificationService", "GetMessageVerificationData");
                                            a6.b();
                                            etdv etdvVar4 = etdv.a;
                                            eyfc eyfcVar = ffag.a;
                                            a6.a = new ffae(etdvVar4);
                                            a6.b = new ffae(etdx.a);
                                            febsVar = a6.a();
                                            etei.b = febsVar;
                                        }
                                    }
                                }
                                final cvam cvamVar2 = cvamVar;
                                final pot potVar2 = potVar;
                                return elfl.g(ffat.a(fdxkVar.a(febsVar, etehVar.b), etdvVar3)).h(new emwl() { // from class: cbxx
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        Optional empty;
                                        etdx etdxVar = (etdx) obj3;
                                        VerifiedSmsRemoteVerificationWork verifiedSmsRemoteVerificationWork3 = VerifiedSmsRemoteVerificationWork.this;
                                        long j2 = verifiedSmsRemoteVerificationWork3.i;
                                        cbyf cbyfVar = verifiedSmsRemoteVerificationWork3.h;
                                        cbyfVar.a(eovo.VERIFIED, cvamVar2, j2);
                                        cbyf.c.m("Verification response verdict was Verified");
                                        pot potVar3 = potVar2;
                                        String b5 = emxe.b(potVar3.d("vsms_sender_id"));
                                        long b6 = potVar3.b("vsms_verification_chain_start_time_key", -1L);
                                        final pon ponVar = new pon();
                                        ponVar.e("sms_verification_result_key", byzi.VERIFICATION_VERIFIED.name());
                                        ponVar.e("vsms_sender_id", b5);
                                        ponVar.h("vsms_verification_chain_start_time_key", b6);
                                        if ((etdxVar.b & 1) != 0) {
                                            etdt etdtVar = etdxVar.c;
                                            if (etdtVar == null) {
                                                etdtVar = etdt.a;
                                            }
                                            String trim = etdtVar.b.trim();
                                            String trim2 = etdtVar.c.trim();
                                            String trim3 = etdtVar.f.trim();
                                            ponVar.e("sms_verification_brand_id_key", trim);
                                            ponVar.e("sms_verification_brand_name_key", trim2.trim());
                                            ponVar.e("sms_verification_brand_description_key", etdtVar.d.trim());
                                            ponVar.e("sms_verification_brand_version_key", trim3);
                                            ponVar.e("sms_verification_brand_logo_url_key", etdtVar.e);
                                            csjb a7 = cbyf.c.a();
                                            a7.I("Brand data received");
                                            a7.A("brandId", trim);
                                            a7.M("name", trim2);
                                            a7.M("description", etdtVar.d);
                                            a7.M("logoUrl", etdtVar.e);
                                            a7.A(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, trim3);
                                            a7.r();
                                            if (!etdtVar.g.H()) {
                                                cbgs cbgsVar = cbyfVar.e;
                                                String str = etdtVar.b;
                                                eyee eyeeVar = etdtVar.g;
                                                File file = new File(cbgq.d(cbgsVar.c), str);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    try {
                                                        csjb c3 = cbgs.b.c();
                                                        c3.I("Writing vSms brand logo");
                                                        c3.A("file", file);
                                                        c3.A("brandId", str);
                                                        c3.r();
                                                        eoej.a(eyeeVar.m(), fileOutputStream);
                                                        Context context = cbgsVar.c;
                                                        Uri build = new Uri.Builder().authority(cbgr.a(context)).scheme("content").appendPath(str).appendQueryParameter("t", String.valueOf(((cbgq.a) ekhw.a(context, cbgq.a.class)).v().a())).build();
                                                        csjb a8 = cbgq.a.a();
                                                        a8.M("built file uri for Verified SMS brand", build.toString());
                                                        a8.r();
                                                        empty = Optional.of(build);
                                                        fileOutputStream.close();
                                                    } finally {
                                                    }
                                                } catch (IOException e) {
                                                    ensk j3 = cbgs.a.j();
                                                    j3.Y(ente.a, "Bugle");
                                                    ((enrr) ((enrr) ((enrr) j3).g(e)).h("com/google/android/apps/messaging/shared/datamodel/provider/VerifiedSmsLogoManager", "saveLogo", 56, "VerifiedSmsLogoManager.java")).t("Unable to write vSms brand logo: %s", file);
                                                    csjb e2 = cbgs.b.e();
                                                    e2.I("Unable to write VSMS brand logo");
                                                    e2.A("file", file);
                                                    e2.A("brandId", str);
                                                    e2.s(e);
                                                    empty = Optional.empty();
                                                }
                                                empty.ifPresent(new Consumer() { // from class: cbya
                                                    @Override // java.util.function.Consumer
                                                    /* renamed from: accept */
                                                    public final void o(Object obj4) {
                                                        enip enipVar = cbyf.a;
                                                        pon.this.e("sms_verification_brand_logo_key", ((Uri) obj4).toString());
                                                    }

                                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                        return Consumer$CC.$default$andThen(this, consumer);
                                                    }
                                                });
                                            }
                                        }
                                        return new ppp(ponVar.a());
                                    }
                                }, verifiedSmsRemoteVerificationWork2.f).f(Throwable.class, new eroh() { // from class: cbxy
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj3) {
                                        VerifiedSmsRemoteVerificationWork verifiedSmsRemoteVerificationWork3 = VerifiedSmsRemoteVerificationWork.this;
                                        Throwable th = (Throwable) obj3;
                                        final pot f2 = verifiedSmsRemoteVerificationWork3.f();
                                        long j2 = verifiedSmsRemoteVerificationWork3.i;
                                        boolean contains = cbyf.a.contains(Status.c(th).getCode());
                                        final cbyf cbyfVar = verifiedSmsRemoteVerificationWork3.h;
                                        if (contains) {
                                            cbyf.c.s("Error in the vSms gRPC. Scheduling a retry...", th);
                                            cbyfVar.d.g("Bugle.VerifiedSms.Grpc.Unsuccessful.Latency", cbyfVar.f.f().toEpochMilli() - j2);
                                            return elfo.e(new ppo());
                                        }
                                        if (Status.c(th).getCode() == Status.Code.NOT_FOUND) {
                                            cbyf.c.r("Server response: NOT FOUND. Unverified verdict");
                                        } else {
                                            cbyf.c.s("Error when verifying sms. Marking unverified", th);
                                        }
                                        cbyfVar.a(eovo.UNVERIFIED, cvamVar2, j2);
                                        String b5 = emxe.b(f2.d("vsms_sender_id"));
                                        long b6 = f2.b("vsms_verification_chain_start_time_key", -1L);
                                        pon ponVar = new pon();
                                        ponVar.e("sms_verification_result_key", byzi.VERIFICATION_UNVERIFIED.name());
                                        ponVar.e("vsms_sender_id", b5);
                                        ponVar.h("vsms_verification_chain_start_time_key", b6);
                                        final pot a7 = ponVar.a();
                                        String b7 = emxe.b(f2.d("vsms_sender_id"));
                                        enhk enhkVar = cuyu.a;
                                        elfl e = (((Boolean) cuye.c.e()).booleanValue() && Pattern.compile((String) cuye.d.e()).matcher(b7).find()) ? cbyfVar.h.e() : elfo.e(false);
                                        final etdv etdvVar5 = etdvVar;
                                        return e.i(new eroh() { // from class: cbyb
                                            @Override // defpackage.eroh
                                            public final ListenableFuture a(Object obj4) {
                                                boolean booleanValue = ((Boolean) obj4).booleanValue();
                                                final pot potVar3 = a7;
                                                if (!booleanValue) {
                                                    return elfo.e(new ppp(potVar3));
                                                }
                                                final etdv etdvVar6 = etdvVar5;
                                                pot potVar4 = f2;
                                                cbyf cbyfVar2 = cbyf.this;
                                                final engw a8 = cbwy.a(potVar4);
                                                final long b8 = potVar3.b("vsms_verification_chain_start_time_key", 0L);
                                                final cuyu cuyuVar = (cuyu) cbyfVar2.k.b();
                                                final eteo eteoVar = (eteo) etez.a.createBuilder();
                                                eteoVar.copyOnWrite();
                                                ((etez) eteoVar.instance).q = etey.a(3);
                                                final elfl c3 = cuyuVar.c.c();
                                                final elfl b9 = cuyuVar.c.b();
                                                cvdc cvdcVar2 = cuyuVar.c;
                                                cvdcVar2.getClass();
                                                final elfl i2 = c3.i(new cuyl(cvdcVar2), cuyuVar.h);
                                                return elfo.f(new Runnable() { // from class: cuyq
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        eteo eteoVar2 = eteoVar;
                                                        eteoVar2.copyOnWrite();
                                                        etez etezVar = (etez) eteoVar2.instance;
                                                        etez etezVar2 = etez.a;
                                                        eygr eygrVar = etezVar.d;
                                                        if (!eygrVar.c()) {
                                                            etezVar.d = eyfy.mutableCopy(eygrVar);
                                                        }
                                                        etdv etdvVar7 = etdvVar6;
                                                        eydl.addAll(a8, etezVar.d);
                                                        eted etedVar = etdvVar7.e;
                                                        if (etedVar == null) {
                                                            etedVar = eted.a;
                                                        }
                                                        eteoVar2.copyOnWrite();
                                                        etez etezVar3 = (etez) eteoVar2.instance;
                                                        etedVar.getClass();
                                                        etezVar3.h = etedVar;
                                                        etezVar3.b |= 1;
                                                        String str = etdvVar7.d;
                                                        eteoVar2.copyOnWrite();
                                                        etez etezVar4 = (etez) eteoVar2.instance;
                                                        str.getClass();
                                                        etezVar4.g = str;
                                                        eygr eygrVar2 = etdvVar7.g;
                                                        eteoVar2.copyOnWrite();
                                                        etez etezVar5 = (etez) eteoVar2.instance;
                                                        eygr eygrVar3 = etezVar5.i;
                                                        if (!eygrVar3.c()) {
                                                            etezVar5.i = eyfy.mutableCopy(eygrVar3);
                                                        }
                                                        long j3 = b8;
                                                        cuyu cuyuVar2 = cuyu.this;
                                                        eydl.addAll(eygrVar2, etezVar5.i);
                                                        boolean z = !etdvVar7.f.isEmpty();
                                                        eteoVar2.copyOnWrite();
                                                        ((etez) eteoVar2.instance).j = z;
                                                        eyev d = eyki.d(cuyuVar2.e.f().toEpochMilli() - j3);
                                                        eteoVar2.copyOnWrite();
                                                        etez etezVar6 = (etez) eteoVar2.instance;
                                                        d.getClass();
                                                        etezVar6.k = d;
                                                        etezVar6.b |= 2;
                                                        int a9 = cuyuVar2.f.a();
                                                        eteoVar2.copyOnWrite();
                                                        ((etez) eteoVar2.instance).e = a9;
                                                        String str2 = cvdd.a(cuyuVar2.g).a;
                                                        eteoVar2.copyOnWrite();
                                                        etez etezVar7 = (etez) eteoVar2.instance;
                                                        str2.getClass();
                                                        etezVar7.l = str2;
                                                        String num = Integer.toString(Build.VERSION.SDK_INT);
                                                        eteoVar2.copyOnWrite();
                                                        etez etezVar8 = (etez) eteoVar2.instance;
                                                        num.getClass();
                                                        etezVar8.m = num;
                                                    }
                                                }, cuyuVar.h).i(new eroh() { // from class: cuyr
                                                    @Override // defpackage.eroh
                                                    public final ListenableFuture a(Object obj5) {
                                                        final elfl elflVar = c3;
                                                        final elfl elflVar2 = b9;
                                                        final elfl elflVar3 = i2;
                                                        elfn k = elfo.k(elflVar, elflVar2, elflVar3);
                                                        final eteo eteoVar2 = eteoVar;
                                                        return k.a(new Callable() { // from class: cuyj
                                                            @Override // java.util.concurrent.Callable
                                                            public final Object call() {
                                                                eteo eteoVar3 = eteo.this;
                                                                cuyu.b(eteoVar3, elflVar, elflVar2, elflVar3, 3);
                                                                return (etez) eteoVar3.build();
                                                            }
                                                        }, cuyu.this.i);
                                                    }
                                                }, cuyuVar.i).i(new cuyn(cuyuVar.d), cuyuVar.h).h(new emwl() { // from class: cbyc
                                                    @Override // defpackage.emwl
                                                    public final Object apply(Object obj5) {
                                                        enip enipVar = cbyf.a;
                                                        return new ppp(pot.this);
                                                    }
                                                }, cbyfVar2.j).e(Throwable.class, new emwl() { // from class: cbyd
                                                    @Override // defpackage.emwl
                                                    public final Object apply(Object obj5) {
                                                        enip enipVar = cbyf.a;
                                                        return new ppp(pot.this);
                                                    }
                                                }, cbyfVar2.j);
                                            }
                                        }, cbyfVar.i);
                                    }
                                }, verifiedSmsRemoteVerificationWork2.f);
                            }
                        }, verifiedSmsRemoteVerificationWork.g);
                    }
                }, this.g);
                b2.close();
                return i;
            } catch (Throwable th) {
                try {
                    b2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        csjb a4 = cbyf.c.a();
        a4.I("Looking for missing vsms input data key(s)....");
        a4.r();
        if (TextUtils.isEmpty(f.d("vsms_message_body"))) {
            cbyf.c.n("Remote verification work was requested but message body was missing.");
        }
        if (TextUtils.isEmpty(f.d("vsms_sender_id"))) {
            cbyf.c.n("Remote verification work was requested but sender id was missing.");
        }
        if (f.a("vsms_mcc_key", -1) == -1) {
            cbyf.c.n("Remote verification work was requested but mcc was missing.");
        }
        if (f.a("vsms_mnc_key", -1) == -1) {
            cbyf.c.n("Remote verification work was requested but mnc was missing.");
        }
        cbyf cbyfVar = this.h;
        long b3 = f.b("vsms_verification_chain_start_time_key", -1L);
        long j2 = this.i;
        cbyfVar.d.g("Bugle.VerifiedSms.WorkManager.VerificationChain.V2.Failure.Latency", b3 > 0 ? cbyfVar.f.f().toEpochMilli() - b3 : -1L);
        cbyfVar.d.g("Bugle.VerifiedSms.WorkManager.RemoteVerification.Failure.Latency", cbyfVar.f.f().toEpochMilli() - j2);
        return erqt.i(new ppn());
    }
}

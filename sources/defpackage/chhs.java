package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chhs {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager");
    public static final cfup b = cfvl.h(cfvl.b, "tachyon_ditto_host_and_port", "instantmessaging-pa.googleapis.com:443");
    public static final cfup c = cfvl.h(cfvl.b, "tachyon_host_and_port", "instantmessaging-pa.googleapis.com:443");
    public static final cfup d = cfvl.h(cfvl.b, "tachyon_spam_host_and_port", "instantmessaging-pa.googleapis.com:443");
    public static final cfup e = cfvl.f(cfvl.b, "ditto_keep_alive_time_ms", TimeUnit.SECONDS.toMillis(30));
    public static final cfup f = cfvl.f(cfvl.b, "ditto_keep_alive_timeout_ms", TimeUnit.SECONDS.toMillis(10));
    public static final cfup g = cfvl.f(cfvl.b, "verified_sms_keep_alive_time_ms", TimeUnit.SECONDS.toMillis(10));
    public static final cfup h = cfvl.f(cfvl.b, "verified_sms_keep_alive_timeout_ms", TimeUnit.SECONDS.toMillis(15));
    public static final cfup i = cfvl.h(cfvl.b, "sticker_service_host_and_port", "sticker-pa.googleapis.com:443");
    static final emyl j;
    private final errl A;
    private final cimo B;
    private final aipn C;
    public feau k;
    public feau m;
    public feau p;
    public feau r;
    public feau t;
    private final Context v;
    private final ffbr w;
    private final ffbr x;
    private feau y;
    public final Object l = new Object();
    public final Object n = new Object();
    public final Map o = new ConcurrentHashMap();
    private final Object z = new Object();
    public final Object q = new Object();
    public final Object s = new Object();
    public final Object u = new Object();
    private final SparseArray D = new SparseArray();
    private final Object E = new Object();

    static {
        cfvl.h(cfvl.b, "people_api_host_and_port", "people-pa.googleapis.com:443");
        cfvl.f(cfvl.b, "people_api_keep_alive_time_ms", TimeUnit.SECONDS.toMillis(30L));
        cfvl.f(cfvl.b, "people_api_keep_alive_timeout_ms", TimeUnit.SECONDS.toMillis(10L));
        j = cfvl.w("enable_primes_interceptor");
    }

    public chhs(Context context, ffbr ffbrVar, errl errlVar, cimo cimoVar, ffbr ffbrVar2, aipn aipnVar) {
        this.v = context;
        this.x = ffbrVar;
        this.A = errlVar;
        this.B = cimoVar;
        this.w = ffbrVar2;
        this.C = aipnVar;
    }

    private final String h(int i2) {
        return "Bugle/" + cvdd.a(this.v).b + " (" + (i2 != 2 ? i2 != 3 ? "ANDROID_CHANNEL_FALLBACK" : "ANDROID_CHANNEL" : "CRONET") + ")";
    }

    private final void i(int i2) {
        ((akzt) this.w.b()).e("Bugle.Grpc.Channel.Creation.Count", i2 - 1);
    }

    public final feau a(String str, cimn cimnVar) {
        return b(str, ((Long) e.e()).longValue(), ((Long) f.e()).longValue(), cimnVar);
    }

    public final feau b(String str, long j2, long j3, cimn cimnVar) {
        List i2 = emye.b(':').i(str);
        String str2 = (String) i2.get(0);
        int parseInt = i2.size() > 1 ? Integer.parseInt((String) i2.get(1)) : 0;
        if (!this.C.a().isPresent() || (this.C.a().get() instanceof fijg)) {
            enru enruVar = a;
            ensk j4 = enruVar.j();
            j4.Y(ente.a, "BugleNetwork");
            enrr enrrVar = (enrr) j4;
            enrrVar.Y(csux.S, str2);
            enrrVar.Y(csux.T, Integer.valueOf(parseInt));
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "createManagedChannel", 408, "GrpcChannelManager.java")).q("Unable to load CronetEngine - falling back to OkHttp AndroidChannelBuilder");
            ensk e2 = enruVar.e();
            e2.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "createAndroidChannel", 438, "GrpcChannelManager.java")).B("Creating gRPC Managed channel with AndroidChannelBuilder: %s:%d", str2, parseInt);
            i(4);
            fexv fexvVar = new fexv(str2, parseInt);
            fexvVar.m(j2, TimeUnit.MILLISECONDS);
            fexvVar.n(j3, TimeUnit.MILLISECONDS);
            fexvVar.o(cimnVar);
            if (((Boolean) ((cfup) j.get()).e()).booleanValue()) {
                fexvVar.i(duiy.b());
            }
            feea feeaVar = new feea(fexvVar);
            feeaVar.a = this.v;
            feeaVar.k(h(4));
            return feeaVar.a();
        }
        ensk h2 = a.h();
        h2.Y(ente.a, "BugleNetwork");
        enrr enrrVar2 = (enrr) h2;
        enrrVar2.Y(csux.S, str2);
        enrrVar2.Y(csux.T, Integer.valueOf(parseInt));
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "createManagedChannel", 392, "GrpcChannelManager.java")).q("Creating gRPC Managed channel with Cronet");
        i(2);
        fehv l = fehv.l(str2, parseInt, (CronetEngine) this.C.a().get());
        l.k(h(2));
        if (((Boolean) ((cfup) j.get()).e()).booleanValue()) {
            fdxp[] fdxpVarArr = new fdxp[1];
            duir duirVar = duir.a;
            if (duirVar == null) {
                synchronized (duir.class) {
                    duirVar = duir.a;
                    if (duirVar == null) {
                        duirVar = new duir(duiy.b());
                        duir.a = duirVar;
                    }
                }
            }
            fdxpVarArr[0] = duirVar;
            l.i(fdxpVarArr);
        }
        l.m(cimnVar.a());
        return l.a();
    }

    public final feau c(String str) {
        return a(str, g(3));
    }

    public final feau d() {
        synchronized (this.z) {
            feau feauVar = this.y;
            if (feauVar != null) {
                return feauVar;
            }
            ensk e2 = a.e();
            e2.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getDittoGrpcChannel", 221, "GrpcChannelManager.java")).q("Creating Ditto gRPC Channel");
            feau a2 = a((String) b.e(), g(2));
            this.y = a2;
            return a2;
        }
    }

    public final febo e() {
        febo feboVar = new febo();
        String valueOf = String.valueOf(this.v.getPackageName());
        febf febfVar = febo.c;
        int i2 = febj.d;
        feboVar.g(new febe("X-Goog-Api-Key", febfVar), "AIzaSyCB5sc4sgRVObMraVTM-ymBkANcjiQXcV0");
        feboVar.g(new febe("Sec-X-Google-Grpc", febo.c), "1");
        feboVar.g(new febe("Origin", febo.c), "android-app://".concat(valueOf));
        return feboVar;
    }

    @Deprecated
    final String f() {
        Optional u;
        Optional m = ((djry) this.x.b()).m();
        if (m.isEmpty()) {
            ensk j2 = a.j();
            j2.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getPhoneChannelEndpointFromDefaultAcsConfig", 556, "GrpcChannelManager.java")).q("Cannot use tachyon phone channel URL from ACS config because ACS Configuration does not exist for default SIM. Falling back to phenotype value.");
            u = Optional.empty();
        } else {
            u = ((djtp) m.get()).u();
            if (u.isEmpty()) {
                ensk h2 = a.h();
                h2.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getPhoneChannelEndpointFromDefaultAcsConfig", 564, "GrpcChannelManager.java")).q("Not using tachyon phone channel URL from ACS config because ACS parameter does not exist. Falling back to phenotype value.");
                u = Optional.empty();
            } else if (TextUtils.isEmpty((CharSequence) u.get())) {
                ensk j3 = a.j();
                j3.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) j3).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getPhoneChannelEndpointFromDefaultAcsConfig", 570, "GrpcChannelManager.java")).q("Cannot use tachyon phone channel URL from ACS config because ACS parameter has an empty value. Falling back to phenotype value.");
                u = Optional.empty();
            } else {
                ensk h3 = a.h();
                h3.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getPhoneChannelEndpointFromDefaultAcsConfig", 575, "GrpcChannelManager.java")).t("Using tachyon phone channel URL from ACS config: %s", u.get());
            }
        }
        final cfup cfupVar = chgx.a;
        cfupVar.getClass();
        return (String) u.orElseGet(new Supplier() { // from class: chhr
            @Override // java.util.function.Supplier
            public final Object get() {
                return (String) cfup.this.e();
            }
        });
    }

    public final cimn g(int i2) {
        cimn cimnVar;
        synchronized (this.E) {
            int i3 = i2 - 1;
            cimnVar = (cimn) this.D.get(i3);
            if (cimnVar == null) {
                cimnVar = this.B.a(i2, this.A);
                this.D.put(i3, cimnVar);
            }
        }
        return cimnVar;
    }
}

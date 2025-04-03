package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.GoogleCertificatesLookupResponse;
import com.google.android.gms.common.GoogleCertificatesQuery;
import com.google.android.gms.common.internal.IGoogleCertificatesApi;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfpv {
    public static volatile IGoogleCertificatesApi g;
    public static Context h;
    static final dfpt a = new dfpl(dfpr.b("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
    static final dfpt b = new dfpm(dfpr.b("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
    static final dfpt c = new dfpn(dfpr.b("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    static final dfpt d = new dfpo(dfpr.b("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    static final dfpt e = new dfpp(dfpr.b("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    static final dfpt f = new dfpq(dfpr.b("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    private static final Object i = new Object();

    public static dfqa a(GoogleCertificatesLookupResponse googleCertificatesLookupResponse) {
        if (googleCertificatesLookupResponse.a) {
            GoogleCertificatesLookupResponse googleCertificatesLookupResponse2 = googleCertificatesLookupResponse.f;
            if (googleCertificatesLookupResponse2 != null) {
                a(googleCertificatesLookupResponse2);
            }
            googleCertificatesLookupResponse.b();
            long j = googleCertificatesLookupResponse.e;
            return new dfqa(true, null, null);
        }
        String str = googleCertificatesLookupResponse.b;
        PackageManager.NameNotFoundException nameNotFoundException = googleCertificatesLookupResponse.a() == 4 ? new PackageManager.NameNotFoundException() : null;
        if (str == null) {
            str = "error checking package certificate";
        }
        googleCertificatesLookupResponse.b();
        googleCertificatesLookupResponse.a();
        return new dfqa(false, str, nameNotFoundException);
    }

    @Deprecated
    static dfqa b(String str, dfpr dfprVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return c(str, dfprVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    @Deprecated
    public static dfqa c(final String str, final dfpr dfprVar, final boolean z, boolean z2) {
        try {
            e();
            dfwv.n(h);
            try {
                return g.isGoogleOrPlatformSigned(new GoogleCertificatesQuery(str, dfprVar, z, z2), ObjectWrapper.wrap(h.getPackageManager())) ? dfqa.a : new dfpz(new Callable() { // from class: dfpk
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        IGoogleCertificatesApi iGoogleCertificatesApi = dfpv.g;
                        String str2 = str;
                        dfpr dfprVar2 = dfprVar;
                        boolean z3 = z;
                        String str3 = (z3 || !dfpv.c(str2, dfprVar2, true, false).b) ? "not allowed" : "debug cert rejected";
                        MessageDigest a2 = dfyi.a("SHA-256");
                        dfwv.n(a2);
                        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str3, str2, dfys.a(a2.digest(((dfps) dfprVar2).a)), Boolean.valueOf(z3), "250899000.false");
                    }
                });
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return new dfqa(false, "module call", e2);
            }
        } catch (dggy e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return new dfqa(false, "module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }

    static synchronized void d(Context context) {
        synchronized (dfpv.class) {
            if (h != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                h = context.getApplicationContext();
            }
        }
    }

    public static void e() {
        if (g != null) {
            return;
        }
        dfwv.n(h);
        synchronized (i) {
            if (g == null) {
                g = IGoogleCertificatesApi.Stub.asInterface(DynamiteModule.d(h, DynamiteModule.b, "com.google.android.gms.googlecertificates").c("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}

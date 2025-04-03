package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euww {
    public final eumr a;
    private final euxb b;
    private final dfop c;
    private final euug d;
    private final euug e;
    private final euuo f;

    public euww(eumr eumrVar, euxb euxbVar, dfop dfopVar, euug euugVar, euug euugVar2, euuo euuoVar) {
        this.a = eumrVar;
        this.b = euxbVar;
        this.c = dfopVar;
        this.d = euugVar;
        this.e = euugVar2;
        this.f = euuoVar;
    }

    public static final dhre b(dhre dhreVar) {
        return dhreVar.c(new Executor() { // from class: euwu
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new dhqh() { // from class: euwv
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar2) {
                Bundle bundle = (Bundle) dhreVar2.j(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null) {
                    return string;
                }
                String string2 = bundle.getString("unregistered");
                if (string2 != null) {
                    return string2;
                }
                String string3 = bundle.getString("error");
                if ("RST".equals(string3)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string3 != null) {
                    throw new IOException(string3);
                }
                Log.w("FirebaseMessaging", "Unexpected response: ".concat(bundle.toString()), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        });
    }

    private final String c() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(this.a.g().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public final dhre a(String str, String str2, Bundle bundle) {
        int b;
        try {
            bundle.putString("scope", str2);
            bundle.putString("sender", str);
            bundle.putString("subtype", str);
            bundle.putString("gmp_app_id", this.a.e().b);
            bundle.putString("gmsv", Integer.toString(this.b.a()));
            bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
            bundle.putString("app_ver", this.b.c());
            bundle.putString("app_ver_name", this.b.d());
            bundle.putString("firebase-app-name-hash", c());
            try {
                String c = ((euut) dhrt.f(this.f.j())).c();
                if (TextUtils.isEmpty(c)) {
                    Log.w("FirebaseMessaging", "FIS auth token is empty");
                } else {
                    bundle.putString("Goog-Firebase-Installations-Auth", c);
                }
            } catch (InterruptedException | ExecutionException e) {
                Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            }
            bundle.putString("appid", (String) dhrt.f(this.f.a()));
            bundle.putString("cliv", "fcm-23.3.2_1p");
            eutf eutfVar = (eutf) this.e.a();
            euyu euyuVar = (euyu) this.d.a();
            if (eutfVar != null && euyuVar != null && (b = eutfVar.b()) != 1) {
                bundle.putString("Firebase-Client-Log-Type", Integer.toString(eute.a(b)));
                bundle.putString("Firebase-Client", euyuVar.a());
            }
            return this.c.b(bundle);
        } catch (InterruptedException | ExecutionException e2) {
            return dhrt.b(e2);
        }
    }
}

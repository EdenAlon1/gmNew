package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.Log;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class dgpg {
    public static dgpz b;
    public static dgpy c;
    public static String d;
    public final Context e;
    public String f;
    private static final Map g = new cmh();
    public static final long a = TimeUnit.DAYS.toMillis(7);

    protected dgpg(Context context) {
        this.f = "";
        this.e = context.getApplicationContext();
        this.f = "";
    }

    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("InstanceID", "Never happens: can't find own package ".concat(e.toString()));
            return 0;
        }
    }

    public static String b(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("InstanceID", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public static synchronized dgpg d(Context context) {
        synchronized (dgpg.class) {
            Context applicationContext = context.getApplicationContext();
            if (b == null) {
                Log.w("InstanceID", "Instance ID SDK is deprecated, " + applicationContext.getPackageName() + " should update to use Firebase Instance ID");
                b = new dgpz(applicationContext);
                c = new dgpy(applicationContext);
            }
            d = Integer.toString(a(applicationContext));
            Map map = g;
            dgpg dgpgVar = (dgpg) map.get("");
            if (dgpgVar != null) {
                return dgpgVar;
            }
            dgpg dgpgVar2 = new dgpg(applicationContext);
            map.put("", dgpgVar2);
            return dgpgVar2;
        }
    }

    public final KeyPair c() {
        dgpz dgpzVar = b;
        dfwv.n(dgpzVar);
        return dgpzVar.a(this.f).a;
    }
}

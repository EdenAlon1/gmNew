package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dgxf implements emyl {
    protected final Context a;

    public dgxf(Context context) {
        this.a = context;
    }

    protected abstract dgxd a();

    @Override // defpackage.emyl
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dgxe get() {
        emxc emxcVar;
        dgxd a = a();
        String str = Build.FINGERPRINT;
        if (str == null) {
            throw new NullPointerException("Null fingerprint");
        }
        String str2 = Build.BRAND;
        if (str2 == null) {
            throw new NullPointerException("Null brand");
        }
        String str3 = Build.PRODUCT;
        if (str3 == null) {
            throw new NullPointerException("Null product");
        }
        String str4 = Build.DEVICE;
        if (str4 == null) {
            throw new NullPointerException("Null device");
        }
        String str5 = Build.MODEL;
        if (str5 == null) {
            throw new NullPointerException("Null model");
        }
        String str6 = Build.MANUFACTURER;
        if (str6 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        int i = Build.VERSION.SDK_INT;
        String str7 = Build.VERSION.BASE_OS;
        if (str7 == null) {
            throw new NullPointerException("Null baseOs");
        }
        dgww dgwwVar = new dgww(str, str2, str3, str4, str5, str6, str7, i);
        Context context = this.a;
        dgxa dgxaVar = new dgxa(dgxg.a("ro.vendor.build.fingerprint"), dgxg.a("ro.boot.verifiedbootstate"), dgxg.b());
        String packageName = context.getPackageName();
        try {
            emxcVar = emxc.j(Long.valueOf(context.getPackageManager().getPackageInfo(packageName, 0).versionCode));
        } catch (PackageManager.NameNotFoundException unused) {
            emxcVar = emux.a;
        }
        return new dgwz(dgwwVar, dgxaVar, a, new dgwx(packageName, emxcVar), Instant.now().toEpochMilli());
    }
}

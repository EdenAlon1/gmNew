package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfqg {
    private static dfqg b;
    private static volatile Set c;
    private static volatile Set d;
    public final Context a;
    private volatile String e;

    public dfqg(Context context) {
        this.a = context.getApplicationContext();
    }

    public static dfqg c(Context context) {
        dfwv.n(context);
        synchronized (dfqg.class) {
            if (b == null) {
                dfpv.d(context);
                b = new dfqg(context);
            }
        }
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c8, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean e(android.content.pm.PackageInfo r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfqg.e(android.content.pm.PackageInfo, boolean):boolean");
    }

    private static dfpr f(PackageInfo packageInfo, dfpr... dfprVarArr) {
        if (packageInfo.signatures != null) {
            if (packageInfo.signatures.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            dfps dfpsVar = new dfps(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < dfprVarArr.length; i++) {
                if (dfprVarArr[i].equals(dfpsVar)) {
                    return dfprVarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dfqa a(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfqg.a(java.lang.String):dfqa");
    }

    public final dfqa b(int i) {
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        dfqa dfqaVar = null;
        if (packagesForUid == null || (packagesForUid.length) == 0) {
            return new dfqa(false, "no pkgs", null);
        }
        for (String str : packagesForUid) {
            dfqaVar = a(str);
            if (dfqaVar.b) {
                return dfqaVar;
            }
        }
        dfwv.n(dfqaVar);
        return dfqaVar;
    }

    public final boolean d(int i) {
        dfqa b2 = b(i);
        b2.b();
        return b2.b;
    }
}

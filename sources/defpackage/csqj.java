package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csqj implements csqi {
    private static final cskc a = cskc.g("Bugle", "VerifiedSmsConstellationDelegateImpl");
    private final Context b;
    private final dfpi c;
    private volatile Boolean d;

    public csqj(Context context, dfpi dfpiVar) {
        this.b = context;
        this.c = dfpiVar;
    }

    @Override // defpackage.csqi
    public final dhre a() {
        dfzs dfzsVar = new dfzs(this.b);
        Bundle bundle = new Bundle();
        bundle.putString("policy_id", "verifiedsmsconsent");
        bundle.putString("package_name", this.b.getPackageName());
        bundle.putString("certificate_hash", c());
        bundle.putString("client_version", "3");
        dfun dfunVar = new dfun();
        dfunVar.a = new dfzm(bundle);
        dfunVar.c = 11901;
        return dfzsVar.i(dfunVar.a());
    }

    @Override // defpackage.csqi
    public final boolean b() {
        Boolean bool = this.d;
        if (bool != null) {
            return bool.booleanValue();
        }
        this.d = Boolean.valueOf(this.c.i(this.b, 12200000) == 0);
        csjb a2 = a.a();
        a2.I("Google Play Service for C11N");
        a2.A("available", this.d);
        a2.r();
        return this.d.booleanValue();
    }

    final String c() {
        cskc cskcVar = a;
        cskcVar.m("Getting certificate hash...");
        try {
            PackageInfo packageInfo = this.b.getPackageManager().getPackageInfo(this.b.getApplicationInfo().packageName, 64);
            if (packageInfo.signatures != null && packageInfo.signatures.length != 0) {
                return eoeg.e.j(MessageDigest.getInstance("SHA1").digest(packageInfo.signatures[0].toByteArray()));
            }
            cskcVar.r("Package signatures were not found.");
            return "ABSENT_CERTIFICATE";
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException e) {
            a.o("Error getting certificate hash.", e);
            return "ABSENT_CERTIFICATE";
        }
    }
}

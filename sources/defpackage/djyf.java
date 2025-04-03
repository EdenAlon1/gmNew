package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.android.vcard.VCardConfig;
import j$.util.Optional;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djyf {
    public final dfpi a;
    public final cguo b;
    public final cgud c;
    public final djup d;
    public final diwu e;

    public djyf(dfpi dfpiVar, cguo cguoVar, cgud cgudVar, djup djupVar, diwu diwuVar) {
        this.a = dfpiVar;
        this.b = cguoVar;
        this.c = cgudVar;
        this.d = djupVar;
        this.e = diwuVar;
    }

    public static Optional a(Context context) {
        Signature[] signatureArr;
        SigningInfo signingInfo;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                signingInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS).signingInfo;
                signatureArr = signingInfo.getSigningCertificateHistory();
            } else {
                signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            }
            if (signatureArr != null && signatureArr.length != 0) {
                return Optional.of(eoeg.e.j(MessageDigest.getInstance("SHA1").digest(signatureArr[0].toByteArray())));
            }
            dkty.q("Package signatures were not found.", new Object[0]);
            return Optional.empty();
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            dkty.q("Error getting certificate hash.", new Object[0]);
            return Optional.empty();
        }
    }
}

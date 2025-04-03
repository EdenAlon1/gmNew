package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.android.vcard.VCardConfig;
import io.grpc.Status;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evco extends feey {
    final /* synthetic */ PackageManager a;
    final /* synthetic */ Set b;

    public evco(PackageManager packageManager, Set set) {
        this.a = packageManager;
        this.b = set;
    }

    @Override // defpackage.feey
    public final Status a(int i) {
        SigningInfo signingInfo;
        SigningInfo signingInfo2;
        boolean hasMultipleSigners;
        SigningInfo signingInfo3;
        Signature[] signingCertificateHistory;
        SigningInfo signingInfo4;
        String[] packagesForUid = this.a.getPackagesForUid(i);
        if (packagesForUid == null) {
            return Status.j.withDescription("Rejected by (signature) security policy");
        }
        for (String str : packagesForUid) {
            PackageManager packageManager = this.a;
            final Set set = this.b;
            set.getClass();
            emxg emxgVar = new emxg() { // from class: evcn
                @Override // defpackage.emxg
                public final boolean a(Object obj) {
                    return set.contains((Signature) obj);
                }
            };
            int i2 = evcp.a;
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
                signingInfo = packageInfo.signingInfo;
                if (signingInfo != null) {
                    signingInfo2 = packageInfo.signingInfo;
                    hasMultipleSigners = signingInfo2.hasMultipleSigners();
                    if (hasMultipleSigners) {
                        signingInfo4 = packageInfo.signingInfo;
                        signingCertificateHistory = signingInfo4.getApkContentsSigners();
                    } else {
                        signingInfo3 = packageInfo.signingInfo;
                        signingCertificateHistory = signingInfo3.getSigningCertificateHistory();
                    }
                    for (Signature signature : signingCertificateHistory) {
                        if (!emxgVar.a(signature)) {
                        }
                    }
                }
            } else {
                PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 64);
                if (packageInfo2.signatures != null && packageInfo2.signatures.length == 1 && emxgVar.a(packageInfo2.signatures[0])) {
                }
            }
            return Status.b;
        }
        return Status.i.withDescription("Rejected by (signature) security policy");
    }
}

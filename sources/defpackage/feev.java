package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.android.vcard.VCardConfig;
import io.grpc.Status;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feev extends feey {
    final /* synthetic */ PackageManager a;
    final /* synthetic */ String b;
    final /* synthetic */ engw c;

    public feev(PackageManager packageManager, String str, engw engwVar) {
        this.a = packageManager;
        this.b = str;
        this.c = engwVar;
    }

    @Override // defpackage.feey
    public final Status a(int i) {
        SigningInfo signingInfo;
        SigningInfo signingInfo2;
        boolean hasMultipleSigners;
        SigningInfo signingInfo3;
        Signature[] signingCertificateHistory;
        SigningInfo signingInfo4;
        int i2 = feex.a;
        PackageManager packageManager = this.a;
        String[] packagesForUid = packageManager.getPackagesForUid(i);
        if (packagesForUid == null) {
            return Status.j.withDescription("Rejected by (SHA-256 hash signature check) security policy");
        }
        boolean z = false;
        for (String str : packagesForUid) {
            if (this.b.equals(str)) {
                final engw engwVar = this.c;
                emxg emxgVar = new emxg() { // from class: feet
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.emxg
                    public final boolean a(Object obj) {
                        int i3 = feex.a;
                        int i4 = eodh.a;
                        byte[] e = eodf.a.b(((Signature) obj).toByteArray()).e();
                        enqv it = engw.this.iterator();
                        while (it.hasNext()) {
                            if (Arrays.equals((byte[]) it.next(), e)) {
                                return true;
                            }
                        }
                        return false;
                    }
                };
                z = true;
                try {
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
                } catch (PackageManager.NameNotFoundException unused) {
                    continue;
                }
            }
        }
        return Status.i.withDescription("Rejected by (SHA-256 hash signature check) security policy. Package name matched: " + z);
    }
}

package org.chromium.base;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.android.vcard.VCardConfig;
import defpackage.a;
import defpackage.fidv;
import defpackage.fidw;
import defpackage.fidy;
import defpackage.fiej;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class BuildInfo {
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final int p;
    private String q;
    private String r;
    public final long e = 1;
    private final Object s = new Object();

    public BuildInfo() {
        Long l;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        FeatureInfo[] systemAvailableFeatures;
        Context context = fidy.a;
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        String str6 = null;
        if (fidw.a.get() != null) {
            fidw a = fidw.a();
            String b = a.b();
            str = a.b();
            str2 = a.b();
            str3 = a.b();
            l = a.c() ? Long.valueOf(Long.parseLong(a.b())) : null;
            str6 = b;
        } else {
            l = null;
            str = null;
            str2 = null;
            str3 = null;
        }
        int i = 0;
        if (str6 == null || str == null || l == null || str2 == null || str3 == null) {
            if (fidy.b()) {
                String[] packagesForUid = packageManager.getPackagesForUid(Process.myUid() - 10000);
                if (packagesForUid.length > 0) {
                    str4 = packagesForUid[0];
                    str5 = a.w(str4, packageName, ":");
                    PackageInfo a2 = fiej.a(str4, 0);
                    this.a = str5;
                    this.b = c(packageManager.getApplicationLabel(a2.applicationInfo));
                    this.c = a(a2);
                    this.d = packageName;
                    this.f = c(a2.versionName);
                    context.getApplicationInfo();
                    packageName = str4;
                }
            }
            str4 = packageName;
            str5 = str4;
            PackageInfo a22 = fiej.a(str4, 0);
            this.a = str5;
            this.b = c(packageManager.getApplicationLabel(a22.applicationInfo));
            this.c = a(a22);
            this.d = packageName;
            this.f = c(a22.versionName);
            context.getApplicationInfo();
            packageName = str4;
        } else {
            this.a = str6;
            this.b = str;
            this.c = l.longValue();
            this.f = str3;
            this.d = str2;
            context.getApplicationInfo();
        }
        this.g = c(packageManager.getInstallerPackageName(packageName));
        PackageInfo a3 = fiej.a("com.google.android.gms", 0);
        this.r = a3 != null ? String.valueOf(a(a3)) : "gms versionCode not available.";
        this.j = String.valueOf(fiej.a("projekt.substratum", 0) != null);
        this.k = "Not Enabled";
        this.h = TextUtils.join(", ", Build.SUPPORTED_ABIS);
        this.i = Build.FINGERPRINT.substring(0, Math.min(Build.FINGERPRINT.length(), 128));
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        this.l = uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
        try {
            z = packageManager.hasSystemFeature("android.hardware.type.automotive");
        } catch (SecurityException e) {
            Log.e("cn_BuildInfo", "Unable to query for Automotive system feature", e);
            z = false;
        }
        this.m = z;
        this.n = Build.VERSION.SDK_INT >= 30 && packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
        this.o = packageManager.hasSystemFeature("android.hardware.type.pc");
        if (Build.VERSION.SDK_INT >= 33 && (systemAvailableFeatures = packageManager.getSystemAvailableFeatures()) != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= systemAvailableFeatures.length) {
                    break;
                }
                FeatureInfo featureInfo = systemAvailableFeatures[i2];
                if ("android.software.vulkan.deqp.level".equals(featureInfo.name)) {
                    i = featureInfo.version;
                    break;
                }
                i2++;
            }
        }
        this.p = i;
    }

    public static long a(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT < 28) {
            return packageInfo.versionCode;
        }
        longVersionCode = packageInfo.getLongVersionCode();
        return longVersionCode;
    }

    private static String c(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String[] getAll() {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.BuildInfo.getAll():java.lang.String[]");
    }

    private static String lazyGetHostSigningCertSha256() {
        return fidv.a.b();
    }

    public final String b() {
        String str;
        Signature[] signatureArr;
        SigningInfo signingInfo;
        SigningInfo signingInfo2;
        synchronized (this.s) {
            if (this.q == null) {
                String str2 = "";
                PackageInfo a = fiej.a(fidy.a.getPackageName(), Build.VERSION.SDK_INT >= 28 ? VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS : 64);
                if (Build.VERSION.SDK_INT >= 28) {
                    signingInfo = a.signingInfo;
                    if (signingInfo == null) {
                        signatureArr = null;
                    } else {
                        signingInfo2 = a.signingInfo;
                        signatureArr = signingInfo2.getSigningCertificateHistory();
                    }
                } else {
                    signatureArr = a.signatures;
                }
                if (signatureArr != null) {
                    try {
                        byte[] digest = MessageDigest.getInstance("SHA-256").digest(signatureArr[signatureArr.length - 1].toByteArray());
                        StringBuilder sb = new StringBuilder((digest.length * 3) - 1);
                        int i = 0;
                        while (true) {
                            int length = digest.length;
                            if (i >= length) {
                                break;
                            }
                            sb.append(fiej.a[(digest[i] & 240) >>> 4]);
                            sb.append(fiej.a[digest[i] & 15]);
                            if (i < length - 1) {
                                sb.append(':');
                            }
                            i++;
                        }
                        str2 = sb.toString();
                    } catch (NoSuchAlgorithmException e) {
                        Log.w("cn_BuildInfo", "Unable to hash host app signature", e);
                    }
                }
                this.q = str2;
            }
            str = this.q;
        }
        return str;
    }
}

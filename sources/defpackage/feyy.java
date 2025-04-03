package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feyy {
    public static final feyy a;
    private static final feyw[] f;
    final boolean b = true;
    public final String[] c;
    public final String[] d;
    public final boolean e;

    static {
        feyw[] feywVarArr = {feyw.TLS_AES_128_GCM_SHA256, feyw.TLS_AES_256_GCM_SHA384, feyw.TLS_CHACHA20_POLY1305_SHA256, feyw.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, feyw.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, feyw.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, feyw.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, feyw.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, feyw.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, feyw.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, feyw.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, feyw.TLS_RSA_WITH_AES_128_GCM_SHA256, feyw.TLS_RSA_WITH_AES_256_GCM_SHA384, feyw.TLS_RSA_WITH_AES_128_CBC_SHA, feyw.TLS_RSA_WITH_AES_256_CBC_SHA, feyw.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f = feywVarArr;
        feyx feyxVar = new feyx();
        feyxVar.a(feywVarArr);
        feyxVar.c(fezk.TLS_1_3, fezk.TLS_1_2);
        feyxVar.b();
        feyy feyyVar = new feyy(feyxVar);
        a = feyyVar;
        feyx feyxVar2 = new feyx(feyyVar);
        feyxVar2.c(fezk.TLS_1_3, fezk.TLS_1_2, fezk.TLS_1_1, fezk.TLS_1_0);
        feyxVar2.b();
    }

    public feyy(feyx feyxVar) {
        this.c = feyxVar.a;
        this.d = feyxVar.b;
        this.e = feyxVar.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof feyy)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        feyy feyyVar = (feyy) obj;
        boolean z = feyyVar.b;
        return Arrays.equals(this.c, feyyVar.c) && Arrays.equals(this.d, feyyVar.d) && this.e == feyyVar.e;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.c) + 527) * 31) + Arrays.hashCode(this.d)) * 31) + (!this.e ? 1 : 0);
    }

    public final String toString() {
        List a2;
        fezk fezkVar;
        String[] strArr = this.c;
        int i = 0;
        if (strArr == null) {
            a2 = null;
        } else {
            feyw[] feywVarArr = new feyw[strArr.length];
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.c;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                feyw feywVar = feyw.TLS_RSA_WITH_NULL_MD5;
                feywVarArr[i2] = str.startsWith("SSL_") ? feyw.a("TLS_".concat(String.valueOf(str.substring(4)))) : feyw.a(str);
                i2++;
            }
            a2 = fezl.a(feywVarArr);
        }
        String obj = a2 == null ? "[use default]" : a2.toString();
        fezk[] fezkVarArr = new fezk[this.d.length];
        while (true) {
            String[] strArr3 = this.d;
            if (i >= strArr3.length) {
                return "ConnectionSpec(cipherSuites=" + obj + ", tlsVersions=" + String.valueOf(fezl.a(fezkVarArr)) + ", supportsTlsExtensions=" + this.e + ")";
            }
            String str2 = strArr3[i];
            fezk fezkVar2 = fezk.TLS_1_3;
            if ("TLSv1.3".equals(str2)) {
                fezkVar = fezk.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                fezkVar = fezk.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                fezkVar = fezk.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                fezkVar = fezk.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new IllegalArgumentException("Unexpected TLS version: ".concat(String.valueOf(str2)));
                }
                fezkVar = fezk.SSL_3_0;
            }
            fezkVarArr[i] = fezkVar;
            i++;
        }
    }
}

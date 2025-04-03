package defpackage;

import androidx.car.app.model.Alert;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhix implements fhgl {
    private final fhgs a;

    public fhix(fhgs fhgsVar) {
        this.a = fhgsVar;
    }

    private final boolean b(IOException iOException, fhid fhidVar, fhgv fhgvVar, boolean z) {
        fhim fhimVar;
        fhig fhigVar;
        fhgz fhgzVar;
        if (!this.a.g) {
            return false;
        }
        if ((z && (((fhgzVar = fhgvVar.d) != null && fhgzVar.d()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z)) {
            return false;
        }
        fhhz fhhzVar = fhidVar.f;
        fhhzVar.getClass();
        int i = fhhzVar.f;
        if (i == 0) {
            if (fhhzVar.g != 0 || fhhzVar.h != 0) {
                i = 0;
            }
            return false;
        }
        if (fhhzVar.i == null) {
            fhhf fhhfVar = null;
            if (i <= 1 && fhhzVar.g <= 1 && fhhzVar.h <= 0 && (fhigVar = fhhzVar.c.g) != null) {
                synchronized (fhigVar) {
                    if (fhigVar.j == 0) {
                        if (fhhl.t(fhigVar.a.a.i, fhhzVar.b.i)) {
                            fhhfVar = fhigVar.a;
                        }
                    }
                }
            }
            if (fhhfVar != null) {
                fhhzVar.i = fhhfVar;
            } else {
                fhil fhilVar = fhhzVar.d;
                if ((fhilVar == null || !fhilVar.b()) && (fhimVar = fhhzVar.e) != null && !fhimVar.a()) {
                    return false;
                }
            }
        }
        return true;
    }

    private static final int c(fhhb fhhbVar, int i) {
        String b = fhhb.b(fhhbVar, "Retry-After");
        return b == null ? i : new ffpa("\\d+").d(b) ? Integer.valueOf(b).intValue() : Alert.DURATION_SHOW_INDEFINITELY;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x01c8 A[Catch: all -> 0x0260, TryCatch #0 {all -> 0x0260, blocks: (B:19:0x0075, B:22:0x0079, B:26:0x007f, B:28:0x0094, B:30:0x009b, B:31:0x00a2, B:33:0x00a3, B:35:0x00a8, B:36:0x00b4, B:49:0x00d6, B:51:0x00db, B:54:0x00e3, B:56:0x00e7, B:59:0x00ef, B:61:0x00f3, B:64:0x00f9, B:67:0x0101, B:71:0x01f2, B:73:0x01f6, B:78:0x01fc, B:80:0x0200, B:85:0x020f, B:86:0x021a, B:88:0x0104, B:92:0x0112, B:93:0x0119, B:94:0x011a, B:96:0x011e, B:99:0x0123, B:101:0x012c, B:102:0x0130, B:104:0x0134, B:108:0x013d, B:110:0x0155, B:112:0x0161, B:115:0x0168, B:118:0x0171, B:121:0x017c, B:123:0x0194, B:129:0x01a7, B:133:0x01b3, B:135:0x01c8, B:136:0x01d9, B:138:0x01e3, B:139:0x01e8, B:142:0x01bd, B:143:0x01c3, B:169:0x0258, B:170:0x025f, B:160:0x0222, B:162:0x022c, B:166:0x0236, B:167:0x0239, B:149:0x023b, B:151:0x0245, B:156:0x0252, B:157:0x0257), top: B:18:0x0075, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bd A[Catch: all -> 0x0260, TryCatch #0 {all -> 0x0260, blocks: (B:19:0x0075, B:22:0x0079, B:26:0x007f, B:28:0x0094, B:30:0x009b, B:31:0x00a2, B:33:0x00a3, B:35:0x00a8, B:36:0x00b4, B:49:0x00d6, B:51:0x00db, B:54:0x00e3, B:56:0x00e7, B:59:0x00ef, B:61:0x00f3, B:64:0x00f9, B:67:0x0101, B:71:0x01f2, B:73:0x01f6, B:78:0x01fc, B:80:0x0200, B:85:0x020f, B:86:0x021a, B:88:0x0104, B:92:0x0112, B:93:0x0119, B:94:0x011a, B:96:0x011e, B:99:0x0123, B:101:0x012c, B:102:0x0130, B:104:0x0134, B:108:0x013d, B:110:0x0155, B:112:0x0161, B:115:0x0168, B:118:0x0171, B:121:0x017c, B:123:0x0194, B:129:0x01a7, B:133:0x01b3, B:135:0x01c8, B:136:0x01d9, B:138:0x01e3, B:139:0x01e8, B:142:0x01bd, B:143:0x01c3, B:169:0x0258, B:170:0x025f, B:160:0x0222, B:162:0x022c, B:166:0x0236, B:167:0x0239, B:149:0x023b, B:151:0x0245, B:156:0x0252, B:157:0x0257), top: B:18:0x0075, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f2 A[Catch: all -> 0x0260, TryCatch #0 {all -> 0x0260, blocks: (B:19:0x0075, B:22:0x0079, B:26:0x007f, B:28:0x0094, B:30:0x009b, B:31:0x00a2, B:33:0x00a3, B:35:0x00a8, B:36:0x00b4, B:49:0x00d6, B:51:0x00db, B:54:0x00e3, B:56:0x00e7, B:59:0x00ef, B:61:0x00f3, B:64:0x00f9, B:67:0x0101, B:71:0x01f2, B:73:0x01f6, B:78:0x01fc, B:80:0x0200, B:85:0x020f, B:86:0x021a, B:88:0x0104, B:92:0x0112, B:93:0x0119, B:94:0x011a, B:96:0x011e, B:99:0x0123, B:101:0x012c, B:102:0x0130, B:104:0x0134, B:108:0x013d, B:110:0x0155, B:112:0x0161, B:115:0x0168, B:118:0x0171, B:121:0x017c, B:123:0x0194, B:129:0x01a7, B:133:0x01b3, B:135:0x01c8, B:136:0x01d9, B:138:0x01e3, B:139:0x01e8, B:142:0x01bd, B:143:0x01c3, B:169:0x0258, B:170:0x025f, B:160:0x0222, B:162:0x022c, B:166:0x0236, B:167:0x0239, B:149:0x023b, B:151:0x0245, B:156:0x0252, B:157:0x0257), top: B:18:0x0075, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021b A[ADDED_TO_REGION, SYNTHETIC] */
    @Override // defpackage.fhgl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fhhb a(defpackage.fhiu r31) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhix.a(fhiu):fhhb");
    }
}

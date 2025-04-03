package defpackage;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erth {
    public erth() {
        Pattern pattern = ertj.a;
        Set set = ertl.a;
    }

    public static final byte[] a(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        try {
            return euiw.b("HmacSHA256", euif.k(eCPrivateKey, eCPublicKey), null, "xELpwbCabRriJEkOYBagfJpHrrmNqlaZMTxsacBQjsLjUHtQexWNQCiMCkrxBzWEifExJkkOJwOziTQQJyRWVUbauuCHZrYlenSAiqtKtT".getBytes(), 32);
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("Problem calculating shared secret for the given keys.", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8 A[Catch: GeneralSecurityException -> 0x0135, TryCatch #0 {GeneralSecurityException -> 0x0135, blocks: (B:3:0x0002, B:4:0x0010, B:6:0x0017, B:8:0x0021, B:12:0x002d, B:13:0x0033, B:14:0x003d, B:16:0x0043, B:19:0x0057, B:21:0x0064, B:24:0x007b, B:25:0x0085, B:34:0x0090, B:36:0x009a, B:38:0x00a0, B:40:0x00aa, B:46:0x00be, B:47:0x00c2, B:49:0x00c8, B:52:0x00d2, B:67:0x00f0, B:68:0x00f9, B:70:0x0104, B:72:0x00ff, B:76:0x00e0, B:80:0x0109, B:81:0x010f, B:83:0x0121, B:84:0x012d, B:90:0x0095), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7 A[EDGE_INSN: B:59:0x00d7->B:60:0x00d7 BREAK  A[LOOP:3: B:47:0x00c2->B:57:0x00c2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0 A[Catch: GeneralSecurityException -> 0x0135, TryCatch #0 {GeneralSecurityException -> 0x0135, blocks: (B:3:0x0002, B:4:0x0010, B:6:0x0017, B:8:0x0021, B:12:0x002d, B:13:0x0033, B:14:0x003d, B:16:0x0043, B:19:0x0057, B:21:0x0064, B:24:0x007b, B:25:0x0085, B:34:0x0090, B:36:0x009a, B:38:0x00a0, B:40:0x00aa, B:46:0x00be, B:47:0x00c2, B:49:0x00c8, B:52:0x00d2, B:67:0x00f0, B:68:0x00f9, B:70:0x0104, B:72:0x00ff, B:76:0x00e0, B:80:0x0109, B:81:0x010f, B:83:0x0121, B:84:0x012d, B:90:0x0095), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List b(byte[] r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erth.b(byte[], java.lang.String):java.util.List");
    }

    public static final List c(ECPrivateKey eCPrivateKey, Collection collection, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            enqv it = ((engw) collection).iterator();
            while (it.hasNext()) {
                arrayList.addAll(b(euif.k(eCPrivateKey, (ECPublicKey) it.next()), str));
            }
            return arrayList;
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("Problem calculating shared secret for the given keys.", e);
        }
    }

    private static byte[] d(byte[] bArr, String str) {
        return euiw.b("HmacSHA256", bArr, null, str.getBytes(StandardCharsets.UTF_8), 32);
    }
}

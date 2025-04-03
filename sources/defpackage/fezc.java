package defpackage;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fezc implements HostnameVerifier {
    public static final fezc a = new fezc();
    private static final Pattern b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private fezc() {
    }

    private static List a(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    private static final boolean b(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str.concat(".");
            }
            if (!str2.endsWith(".")) {
                str2 = str2.concat(".");
            }
            String c = emuz.c(str2);
            if (!c.contains("*")) {
                return str.equals(c);
            }
            if (!c.startsWith("*.") || c.indexOf(42, 1) != -1 || str.length() < c.length() || "*.".equals(c)) {
                return false;
            }
            String substring = c.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            return length <= 0 || str.lastIndexOf(46, length + (-1)) == -1;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        boolean z;
        boolean z2;
        char[] cArr;
        char c;
        char[] cArr2;
        int i;
        int i2;
        char c2;
        int length = str.length();
        boolean z3 = false;
        int i3 = 0;
        while (i3 < length && str.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            z = true;
            if (i3 >= length) {
                break;
            }
            char charAt = str.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = str.length();
                int i5 = 0;
                while (i3 < length2) {
                    char charAt2 = str.charAt(i3);
                    if (charAt2 < 2048) {
                        i5 += (127 - charAt2) >>> 31;
                    } else {
                        i5 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i3) == charAt2) {
                                throw new IllegalArgumentException(a.h(i3, "Unpaired surrogate at index "));
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i4 += i5;
            }
        }
        if (i4 < length) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i4 + 4294967296L));
        }
        if (i4 != str.length()) {
            return false;
        }
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            if (b.matcher(str).matches()) {
                List a2 = a(x509Certificate, 7);
                int size = a2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    if (str.equalsIgnoreCase((String) a2.get(i6))) {
                        return true;
                    }
                }
                return false;
            }
            String c3 = emuz.c(str);
            List a3 = a(x509Certificate, 2);
            int size2 = a3.size();
            int i7 = 0;
            Object[] objArr = false;
            while (i7 < size2) {
                if (b(c3, (String) a3.get(i7))) {
                    return true;
                }
                i7++;
                objArr = true;
            }
            if (objArr == true) {
                return false;
            }
            feyz feyzVar = new feyz(x509Certificate.getSubjectX500Principal());
            feyzVar.c = 0;
            feyzVar.d = 0;
            feyzVar.e = 0;
            feyzVar.f = 0;
            feyzVar.g = feyzVar.a.toCharArray();
            String c4 = feyzVar.c();
            String str2 = null;
            if (c4 != null) {
                while (true) {
                    String str3 = "";
                    int i8 = feyzVar.c;
                    int i9 = feyzVar.b;
                    if (i8 == i9) {
                        break;
                    }
                    char c5 = feyzVar.g[i8];
                    z2 = z3;
                    boolean z4 = z;
                    if (c5 == '\"') {
                        int i10 = i8 + 1;
                        feyzVar.c = i10;
                        feyzVar.d = i10;
                        feyzVar.e = i10;
                        while (true) {
                            int i11 = feyzVar.c;
                            if (i11 == feyzVar.b) {
                                throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(feyzVar.a)));
                            }
                            char[] cArr3 = feyzVar.g;
                            char c6 = cArr3[i11];
                            if (c6 == '\"') {
                                feyzVar.c = i11 + 1;
                                while (true) {
                                    int i12 = feyzVar.c;
                                    if (i12 >= feyzVar.b || feyzVar.g[i12] != ' ') {
                                        break;
                                    }
                                    feyzVar.c = i12 + 1;
                                }
                                char[] cArr4 = feyzVar.g;
                                int i13 = feyzVar.d;
                                str3 = new String(cArr4, i13, feyzVar.e - i13);
                            } else {
                                if (c6 == '\\') {
                                    cArr3[feyzVar.e] = feyzVar.a();
                                } else {
                                    cArr3[feyzVar.e] = c6;
                                }
                                feyzVar.c++;
                                feyzVar.e++;
                            }
                        }
                    } else if (c5 == '#') {
                        if (i8 + 4 >= i9) {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(feyzVar.a)));
                        }
                        feyzVar.d = i8;
                        feyzVar.c = i8 + 1;
                        while (true) {
                            int i14 = feyzVar.c;
                            if (i14 == feyzVar.b || (c = (cArr = feyzVar.g)[i14]) == '+' || c == ',' || c == ';') {
                                break;
                            }
                            if (c == ' ') {
                                feyzVar.e = i14;
                                feyzVar.c = i14 + 1;
                                while (true) {
                                    int i15 = feyzVar.c;
                                    if (i15 >= feyzVar.b || feyzVar.g[i15] != ' ') {
                                        break;
                                    }
                                    feyzVar.c = i15 + 1;
                                }
                            } else {
                                if (c >= 'A' && c <= 'F') {
                                    cArr[i14] = (char) (c + ' ');
                                }
                                feyzVar.c = i14 + 1;
                            }
                        }
                        int i16 = feyzVar.e;
                        int i17 = feyzVar.d;
                        int i18 = i16 - i17;
                        if (i18 < 5 || (i18 & 1) == 0) {
                            break;
                        }
                        int i19 = i18 >> 1;
                        byte[] bArr = new byte[i19];
                        int i20 = i17 + 1;
                        int i21 = z2 ? 1 : 0;
                        while (i21 < i19) {
                            bArr[i21] = (byte) feyzVar.b(i20);
                            i21++;
                            i20 += 2;
                        }
                        str3 = new String(feyzVar.g, feyzVar.d, i18);
                    } else if (c5 != '+' && c5 != ',' && c5 != ';') {
                        try {
                            feyzVar.d = i8;
                            feyzVar.e = i8;
                            while (true) {
                                int i22 = feyzVar.c;
                                if (i22 >= feyzVar.b) {
                                    char[] cArr5 = feyzVar.g;
                                    int i23 = feyzVar.d;
                                    str3 = new String(cArr5, i23, feyzVar.e - i23);
                                    break;
                                }
                                cArr2 = feyzVar.g;
                                char c7 = cArr2[i22];
                                if (c7 == ' ') {
                                    int i24 = feyzVar.e;
                                    feyzVar.f = i24;
                                    feyzVar.c = i22 + 1;
                                    feyzVar.e = i24 + 1;
                                    cArr2[i24] = ' ';
                                    while (true) {
                                        i = feyzVar.c;
                                        i2 = feyzVar.b;
                                        if (i >= i2) {
                                            break;
                                        }
                                        char[] cArr6 = feyzVar.g;
                                        if (cArr6[i] != ' ') {
                                            break;
                                        }
                                        int i25 = feyzVar.e;
                                        feyzVar.e = i25 + 1;
                                        cArr6[i25] = ' ';
                                        feyzVar.c = i + 1;
                                    }
                                    if (i == i2 || (c2 = feyzVar.g[i]) == ',' || c2 == '+' || c2 == ';') {
                                        break;
                                    }
                                } else {
                                    if (c7 == ';') {
                                        break;
                                    }
                                    if (c7 == '\\') {
                                        int i26 = feyzVar.e;
                                        feyzVar.e = i26 + 1;
                                        cArr2[i26] = feyzVar.a();
                                        feyzVar.c++;
                                    } else {
                                        if (c7 == '+' || c7 == ',') {
                                            break;
                                        }
                                        int i27 = feyzVar.e;
                                        feyzVar.e = i27 + 1;
                                        cArr2[i27] = c7;
                                        feyzVar.c = i22 + 1;
                                    }
                                }
                            }
                            int i28 = feyzVar.d;
                            str3 = new String(cArr2, i28, feyzVar.e - i28);
                        } catch (SSLException unused) {
                            return z2;
                        }
                    }
                    if ("cn".equalsIgnoreCase(c4)) {
                        str2 = str3;
                        break;
                    }
                    int i29 = feyzVar.c;
                    if (i29 >= feyzVar.b) {
                        break;
                    }
                    char c8 = feyzVar.g[i29];
                    if (c8 != ',' && c8 != ';' && c8 != '+') {
                        throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(feyzVar.a)));
                    }
                    feyzVar.c = i29 + 1;
                    c4 = feyzVar.c();
                    if (c4 == null) {
                        throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(feyzVar.a)));
                    }
                    z3 = z2 ? 1 : 0;
                    z = z4;
                }
                throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(feyzVar.a)));
            }
            z2 = z3;
            return str2 != null ? b(c3, str2) : z2;
        } catch (SSLException unused2) {
            return false;
        }
    }
}

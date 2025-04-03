package defpackage;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhlv implements HostnameVerifier {
    public static final fhlv a = new fhlv();

    private fhlv() {
    }

    public static final List a(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return ffel.a;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && ffkj.e(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return ffel.a;
        }
    }

    public static final boolean b(String str, X509Certificate x509Certificate) {
        boolean I;
        int length;
        if (fhhl.s(str)) {
            String a2 = fhhi.a(str);
            List a3 = a(x509Certificate, 7);
            if (a3.isEmpty()) {
                return false;
            }
            Iterator it = a3.iterator();
            while (it.hasNext()) {
                if (ffkj.e(a2, fhhi.a((String) it.next()))) {
                    return true;
                }
            }
            return false;
        }
        String d = d(str);
        List<String> a4 = a(x509Certificate, 2);
        if (a4.isEmpty()) {
            return false;
        }
        for (String str2 : a4) {
            if (d.length() != 0 && !ffpc.t(d, ".") && !ffpc.n(d, "..") && str2 != null && str2.length() != 0 && !ffpc.t(str2, ".") && !ffpc.n(str2, "..")) {
                String concat = !ffpc.n(d, ".") ? d.concat(".") : d;
                if (!ffpc.n(str2, ".")) {
                    str2 = str2.concat(".");
                }
                String d2 = d(str2);
                I = ffpc.I(d2, "*", false);
                if (!I) {
                    if (ffkj.e(concat, d2)) {
                        return true;
                    }
                } else if (ffpc.t(d2, "*.") && ffpc.P(d2, '*', 1, 4) == -1 && concat.length() >= d2.length() && !ffkj.e("*.", d2)) {
                    String substring = d2.substring(1);
                    substring.getClass();
                    if (ffpc.n(concat, substring) && ((length = concat.length() - substring.length()) <= 0 || ffpc.R(concat, '.', length - 1, 4) == -1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static final boolean c(String str) {
        long j;
        int length = str.length();
        if (length < 0) {
            throw new IllegalArgumentException(a.f(length, "endIndex < beginIndex: ", " < 0"));
        }
        if (length > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + length + " > " + str.length());
        }
        long j2 = 0;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt >= 128) {
                if (charAt < 2048) {
                    j = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    j = 3;
                } else {
                    char charAt2 = i2 < length ? str.charAt(i2) : (char) 0;
                    if (charAt <= 56319 && charAt2 >= 56320 && charAt2 <= 57343) {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
                i = i2;
            }
            j2++;
            i = i2;
        }
        return str.length() == ((int) j2);
    }

    private static final String d(String str) {
        if (!c(str)) {
            return str;
        }
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        return lowerCase;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        str.getClass();
        sSLSession.getClass();
        if (!c(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            certificate.getClass();
            return b(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}

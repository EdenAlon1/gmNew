package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhgg {
    public static final void a(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt >= 127) {
                throw new IllegalArgumentException(fhhl.k("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
            }
        }
    }

    public static final void b(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (charAt < ' ' || charAt >= 127)) {
                throw new IllegalArgumentException(fhhl.k("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2).concat(fhhl.w(str2) ? "" : ": ".concat(String.valueOf(str))));
            }
        }
    }

    public static final fhgh c(String... strArr) {
        if ((strArr.length & 1) != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr2[i2];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i2] = ffpc.x(str).toString();
        }
        int a = ffib.a(0, strArr2.length - 1, 2);
        if (a >= 0) {
            while (true) {
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                a(str2);
                b(str3, str2);
                if (i == a) {
                    break;
                }
                i += 2;
            }
        }
        return new fhgh(strArr2);
    }
}

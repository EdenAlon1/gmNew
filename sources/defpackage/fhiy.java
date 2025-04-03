package defpackage;

import java.net.ProtocolException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhiy {
    public static final fhiz a(String str) {
        fhgt fhgtVar;
        int i;
        String str2;
        if (ffpc.t(str, "HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                fhgtVar = fhgt.a;
            } else {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                fhgtVar = fhgt.b;
            }
        } else {
            if (!ffpc.t(str, "ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            fhgtVar = fhgt.a;
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String substring = str.substring(i, i2);
            substring.getClass();
            int parseInt = Integer.parseInt(substring);
            if (str.length() <= i2) {
                str2 = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i + 4);
                str2.getClass();
            }
            return new fhiz(fhgtVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }
}

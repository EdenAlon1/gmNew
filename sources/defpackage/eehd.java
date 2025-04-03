package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eehd {
    public static int a(String str) {
        try {
            if (Objects.isNull(str)) {
                throw new eehb("Invalid SDP format, integer expected but got null.");
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new eehb("Invalid SDP format, integer expected: ".concat(String.valueOf(str)), e);
        }
    }

    public static eehg b(String str) {
        eehg eehgVar = new eehg();
        BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
        try {
            eegw eegwVar = null;
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                if (readLine.startsWith("v=")) {
                    String c = c(readLine, "v=");
                    try {
                        eehgVar.d = new eehf(Integer.parseInt(c));
                    } catch (NumberFormatException e) {
                        throw new eehb("Invalid SDP version format: ".concat(String.valueOf(c)), e);
                    }
                } else {
                    if (readLine.startsWith("o=")) {
                        eehgVar.e = eegz.e(readLine);
                    } else if (readLine.startsWith("s=")) {
                        eehgVar.f = new eehi(c(readLine, "s="));
                    } else if (readLine.startsWith("i=")) {
                        eehh c2 = eehh.c(readLine);
                        if (eegwVar == null) {
                            eehgVar.g = c2;
                            eegwVar = null;
                        } else {
                            eegwVar.b = c2;
                        }
                    } else if (readLine.startsWith("c=")) {
                        eegt a = eegt.a(readLine);
                        if (eegwVar == null) {
                            eehgVar.h = a;
                            eegwVar = null;
                        } else {
                            eegwVar.c = a;
                        }
                    } else if (readLine.startsWith("b=")) {
                        eegs a2 = eegs.a(readLine);
                        if (eegwVar == null) {
                            eehgVar.i = a2;
                            eegwVar = null;
                        } else {
                            eegwVar.d = a2;
                        }
                    } else if (readLine.startsWith("t=")) {
                        String c3 = c(readLine, "t=");
                        String[] split = c3.split(" ");
                        if (split.length < 2) {
                            throw new eehb("Illegal format for time description: ".concat(String.valueOf(c3)));
                        }
                        try {
                            eehgVar.c(new eehj(Long.valueOf(split[0]).longValue(), Long.valueOf(split[1]).longValue()));
                        } catch (NumberFormatException e2) {
                            throw new eehb(e2);
                        }
                    } else if (readLine.startsWith("a=")) {
                        eegu a3 = eegu.a(readLine);
                        if (eegwVar == null) {
                            eehgVar.b.add(a3);
                            eegwVar = null;
                        } else {
                            eegwVar.e(a3);
                        }
                    } else if (readLine.startsWith("m=")) {
                        eegwVar = eegw.c(readLine);
                        eehgVar.a(eegwVar);
                    }
                }
            }
            return eehgVar;
        } catch (IOException e3) {
            throw new eehb(e3);
        }
    }

    public static String c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new eehb("Invalid SDP, line is empty");
        }
        if (!Objects.isNull(str2) && !TextUtils.isEmpty(str2) && str.startsWith(str2)) {
            str = str.substring(str2.length());
        }
        if (str.endsWith("\n")) {
            str = str.substring(0, str.length() - 1);
        }
        if (str.endsWith("\r")) {
            str = str.substring(0, str.length() - 1);
        }
        if (TextUtils.isEmpty(str)) {
            throw new eehb("Invalid SDP! Line only contains line feed or type but is empty otherwise!");
        }
        return str;
    }
}

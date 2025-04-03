package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fipb {
    private static final Map a;

    static {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fipb.class.getResourceAsStream("/org/commonmark/internal/util/entities.properties"), StandardCharsets.UTF_8));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        hashMap.put("NewLine", "\n");
                        a = hashMap;
                        return;
                    } else if (readLine.length() != 0) {
                        int indexOf = readLine.indexOf("=");
                        hashMap.put(readLine.substring(0, indexOf), readLine.substring(indexOf + 1));
                    }
                } finally {
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e);
        }
    }

    public static String a(String str) {
        int i;
        if (str.startsWith("&") && str.endsWith(";")) {
            String substring = str.substring(1, str.length() - 1);
            if (substring.startsWith("#")) {
                String substring2 = substring.substring(1);
                if (substring2.startsWith("x") || substring2.startsWith("X")) {
                    substring2 = substring2.substring(1);
                    i = 16;
                } else {
                    i = 10;
                }
                try {
                    int parseInt = Integer.parseInt(substring2, i);
                    return parseInt == 0 ? "�" : new String(Character.toChars(parseInt));
                } catch (IllegalArgumentException unused) {
                    return "�";
                }
            }
            String str2 = (String) a.get(substring);
            if (str2 != null) {
                return str2;
            }
        }
        return str;
    }
}

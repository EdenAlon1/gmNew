package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceno {
    public final asit a;

    public ceno(asit asitVar) {
        this.a = asitVar;
    }

    public static final cenm a(String str) {
        List V = ffpc.V(str, new String[]{"-"}, 0, 6);
        String obj = ffpc.x((String) V.get(0)).toString();
        String str2 = (String) V.get(1);
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char charAt = str2.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        return new cenm(obj, Integer.parseInt(sb.toString()));
    }
}

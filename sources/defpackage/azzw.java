package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import java.text.BreakIterator;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azzw {
    private static Pattern d;
    private final Context h;
    private static final cskc b = cskc.g("BugleDataModel", "SearchUtils");
    public static final ThreadLocal a = new ThreadLocal();
    private static String[] c = new String[0];
    private static final HashSet e = new HashSet();
    private static final BreakIterator f = BreakIterator.getWordInstance();
    private static float[] g = new float[100];

    public azzw(Context context) {
        this.h = context;
    }

    public final Matcher a(String[] strArr, CharSequence charSequence, StringBuilder sb, HashSet hashSet) {
        for (String str : strArr) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("(\\b\\Q");
            sb.append(str);
            sb.append("\\E");
            hashSet.add(str);
            sb.append(")");
        }
        Matcher matcher = Pattern.compile(sb.toString()).matcher(charSequence.toString().toLowerCase(ctid.c(this.h)));
        for (int i = 0; matcher.find(i) && !hashSet.isEmpty(); i = matcher.end()) {
            hashSet.remove(matcher.group());
        }
        return matcher;
    }

    public final String[] b(String str) {
        String[] split = str.toLowerCase(ctid.c(this.h)).split("\\W+");
        int i = 0;
        for (String str2 : split) {
            if (TextUtils.isEmpty(str2)) {
                i++;
            }
        }
        if (i == 0) {
            return split;
        }
        String[] strArr = new String[split.length - i];
        int i2 = 0;
        for (String str3 : split) {
            if (!TextUtils.isEmpty(str3)) {
                strArr[i2] = str3;
                i2++;
            }
        }
        return strArr;
    }

    public final CharSequence c(CharSequence charSequence, CharSequence charSequence2, String str, TextView textView) {
        return d(charSequence, charSequence2, str, textView, -14273992, -1579458);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027b A[LOOP:3: B:68:0x0159->B:94:0x027b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c5 A[EDGE_INSN: B:95:0x01c5->B:96:0x01c5 BREAK  A[LOOP:3: B:68:0x0159->B:94:0x027b], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x01bd -> B:74:0x01bf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence d(java.lang.CharSequence r23, java.lang.CharSequence r24, java.lang.String r25, android.widget.TextView r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azzw.d(java.lang.CharSequence, java.lang.CharSequence, java.lang.String, android.widget.TextView, int, int):java.lang.CharSequence");
    }
}

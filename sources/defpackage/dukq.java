package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import java.util.PriorityQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dukq {
    private static final Pattern a = Pattern.compile("(?<=(['\"]|\\s|^))(_(\\w|[.!?,'\"#$*])+_)(?=([.!?,'\"]|\\s|$))");
    private static final Pattern b = Pattern.compile("(?<=(['\"]|\\s|^))(\\*(\\w|[.!?,'\"#$*])+\\*)(?=([.!?,'\"]|\\s|$))");

    public static Spannable a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new SpannableString("");
        }
        if (!str.contains(Character.toString('*')) && !str.contains(Character.toString('_'))) {
            return new SpannableString(str);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Matcher matcher = a.matcher(str);
        Matcher matcher2 = b.matcher(str);
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.addAll(dukp.a(matcher));
        priorityQueue.addAll(dukp.a(matcher2));
        int i = 0;
        while (i < str.length()) {
            if (priorityQueue.isEmpty() || i != ((dukp) priorityQueue.peek()).a) {
                spannableStringBuilder.append(str.charAt(i));
            } else {
                dukp dukpVar = (dukp) priorityQueue.remove();
                char charAt = dukpVar.c.charAt(0);
                if (charAt == '*' || charAt == '_') {
                    spannableStringBuilder.append((CharSequence) dukpVar.c.substring(1, r8.length() - 1));
                    spannableStringBuilder.setSpan(new StyleSpan(charAt == '*' ? 1 : 2), spannableStringBuilder.length() - ((dukpVar.b - dukpVar.a) - 2), spannableStringBuilder.length(), 33);
                } else {
                    spannableStringBuilder.append((CharSequence) dukpVar.c);
                }
                i = dukpVar.b - 1;
            }
            i++;
        }
        return spannableStringBuilder;
    }
}

package defpackage;

import android.text.Spannable;
import android.text.util.Linkify;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksn {
    public static final Comparator a = new Comparator() { // from class: ksl
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            ksm ksmVar = (ksm) obj;
            ksm ksmVar2 = (ksm) obj2;
            int i = ksmVar.c;
            int i2 = ksmVar2.c;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            return Integer.compare(ksmVar2.d, ksmVar.d);
        }
    };

    public static void a(ArrayList arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter) {
        boolean z;
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                if (group != null) {
                    ksm ksmVar = new ksm();
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            break;
                        }
                        String str = strArr[i];
                        if (group.regionMatches(true, 0, str, 0, str.length())) {
                            z = true;
                            if (!group.regionMatches(false, 0, str, 0, str.length())) {
                                group = String.valueOf(str).concat(String.valueOf(group.substring(str.length())));
                            }
                        } else {
                            i++;
                        }
                    }
                    if (!z) {
                        group = String.valueOf(strArr[0]).concat(group);
                    }
                    ksmVar.b = group;
                    ksmVar.c = start;
                    ksmVar.d = end;
                    arrayList.add(ksmVar);
                }
            }
        }
    }
}

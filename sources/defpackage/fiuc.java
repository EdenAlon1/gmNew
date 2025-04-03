package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiuc implements fiuq, fiuo {
    public static final fiuc a;
    static final int b;
    static final int c;
    private static final List d;
    private static final Map e;
    private static final List f;
    private static final /* synthetic */ fiuc[] g;

    static {
        fiuc fiucVar = new fiuc();
        a = fiucVar;
        g = new fiuc[]{fiucVar};
        f = new ArrayList();
        ArrayList<String> arrayList = new ArrayList(firk.b);
        d = arrayList;
        Collections.sort(arrayList);
        e = new HashMap();
        int i = 0;
        int i2 = 0;
        for (String str : arrayList) {
            int indexOf = str.indexOf(47);
            if (indexOf >= 0) {
                indexOf = indexOf < str.length() ? indexOf + 1 : indexOf;
                i2 = Math.max(i2, indexOf);
                String substring = str.substring(0, indexOf + 1);
                String substring2 = str.substring(indexOf);
                Map map = e;
                if (!map.containsKey(substring)) {
                    map.put(substring, new ArrayList());
                }
                ((List) map.get(substring)).add(substring2);
            } else {
                f.add(str);
            }
            i = Math.max(i, str.length());
        }
        b = i;
        c = i2;
    }

    private fiuc() {
    }

    public static fiuc[] values() {
        return (fiuc[]) g.clone();
    }

    @Override // defpackage.fiuo
    public final int a() {
        return b;
    }

    @Override // defpackage.fiuq
    public final int b() {
        return b;
    }

    @Override // defpackage.fiuo
    public final int c(fiuk fiukVar, CharSequence charSequence, int i) {
        String str;
        int i2;
        List list = f;
        int length = charSequence.length();
        int min = Math.min(length, c + i);
        int i3 = i;
        while (true) {
            if (i3 >= min) {
                str = "";
                i2 = i;
                break;
            }
            int i4 = i3 + 1;
            if (charSequence.charAt(i3) == '/') {
                String charSequence2 = charSequence.subSequence(i, i4).toString();
                i2 = charSequence2.length() + i;
                List list2 = (List) e.get(i3 < length - 1 ? charSequence2 + charSequence.charAt(i4) : charSequence2);
                if (list2 != null) {
                    str = charSequence2;
                    list = list2;
                }
            } else {
                i3 = i4;
            }
        }
        String str2 = null;
        for (int i5 = 0; i5 < list.size(); i5++) {
            String str3 = (String) list.get(i5);
            if (fiuh.c(charSequence, i2, str3) && (str2 == null || str3.length() > str2.length())) {
                str2 = str3;
            }
        }
        if (str2 != null) {
            fiukVar.f(firk.i(String.valueOf(str).concat(str2)));
            return i2 + str2.length();
        }
        return ~i;
    }

    @Override // defpackage.fiuq
    public final void d(Appendable appendable, long j, firb firbVar, int i, firk firkVar, Locale locale) {
        appendable.append(firkVar != null ? firkVar.c : "");
    }
}

package j$.time.format;

import java.text.ParsePosition;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes9.dex */
class o {
    protected String a;
    protected String b;
    protected char c;
    protected o d;
    protected o e;

    /* synthetic */ o(String str, String str2, o oVar, int i) {
        this(str, str2, oVar);
    }

    private boolean b(String str, String str2) {
        int i = 0;
        while (i < str.length() && i < this.a.length() && c(str.charAt(i), this.a.charAt(i))) {
            i++;
        }
        if (i != this.a.length()) {
            o e = e(this.a.substring(i), this.b, this.d);
            this.a = str.substring(0, i);
            this.d = e;
            if (i >= str.length()) {
                this.b = str2;
                return true;
            }
            this.d.e = e(str.substring(i), str2, null);
            this.b = null;
            return true;
        }
        if (i >= str.length()) {
            this.b = str2;
            return true;
        }
        String substring = str.substring(i);
        for (o oVar = this.d; oVar != null; oVar = oVar.e) {
            if (c(oVar.c, substring.charAt(0))) {
                return oVar.b(substring, str2);
            }
        }
        o e2 = e(substring, str2, null);
        e2.e = this.d;
        this.d = e2;
        return true;
    }

    public static o f(w wVar) {
        return wVar.k() ? new o("", null, null) : new n("", null, null);
    }

    public static o g(Set set, w wVar) {
        o f = f(wVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            f.b(str, str);
        }
        return f;
    }

    public final void a(String str, String str2) {
        b(str, str2);
    }

    protected boolean c(char c, char c2) {
        return c == c2;
    }

    public final String d(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!h(charSequence, index, length)) {
            return null;
        }
        int length2 = this.a.length() + index;
        o oVar = this.d;
        if (oVar != null && length2 != length) {
            while (true) {
                if (c(oVar.c, charSequence.charAt(length2))) {
                    parsePosition.setIndex(length2);
                    String d = oVar.d(charSequence, parsePosition);
                    if (d != null) {
                        return d;
                    }
                } else {
                    oVar = oVar.e;
                    if (oVar == null) {
                        break;
                    }
                }
            }
        }
        parsePosition.setIndex(length2);
        return this.b;
    }

    protected o e(String str, String str2, o oVar) {
        return new o(str, str2, oVar);
    }

    protected boolean h(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.a, i);
        }
        int length = this.a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i5 = i3 + 1;
            int i6 = i + 1;
            if (!c(this.a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }

    private o(String str, String str2, o oVar) {
        this.a = str;
        this.b = str2;
        this.d = oVar;
        if (str.isEmpty()) {
            this.c = (char) 65535;
        } else {
            this.c = this.a.charAt(0);
        }
    }
}

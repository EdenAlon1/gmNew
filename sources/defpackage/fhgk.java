package defpackage;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhgk {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String b;
    public final String c;
    public final int d;
    public final List e;
    public final List f;
    public final String g;
    public final boolean h;
    private final String i;
    private final String j;
    private final String k;

    public fhgk(String str, String str2, String str3, String str4, int i, List list, List list2, String str5, String str6) {
        this.b = str;
        this.i = str2;
        this.j = str3;
        this.c = str4;
        this.d = i;
        this.e = list;
        this.f = list2;
        this.k = str5;
        this.g = str6;
        this.h = ffkj.e(str, "https");
    }

    public final String a() {
        if (this.j.length() == 0) {
            return "";
        }
        int P = ffpc.P(this.g, ':', this.b.length() + 3, 4) + 1;
        String str = this.g;
        String substring = str.substring(P, ffpc.P(str, '@', 0, 6));
        substring.getClass();
        return substring;
    }

    public final String b() {
        int length = this.b.length();
        String str = this.g;
        int P = ffpc.P(str, '/', length + 3, 4);
        String substring = this.g.substring(P, fhhl.b(str, "?#", P, str.length()));
        substring.getClass();
        return substring;
    }

    public final String c() {
        if (this.f == null) {
            return null;
        }
        int P = ffpc.P(this.g, '?', 0, 6) + 1;
        String str = this.g;
        String substring = str.substring(P, fhhl.a(str, '#', P, str.length()));
        substring.getClass();
        return substring;
    }

    public final String d() {
        if (this.i.length() == 0) {
            return "";
        }
        String str = this.b;
        String str2 = this.g;
        int length = str.length() + 3;
        String substring = str2.substring(length, fhhl.b(str2, ":@", length, str2.length()));
        substring.getClass();
        return substring;
    }

    public final String e() {
        fhgi i = i("/...");
        i.getClass();
        i.b = fhgj.e("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        i.c = fhgj.e("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return i.a().g;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fhgk) && ffkj.e(((fhgk) obj).g, this.g);
    }

    public final URI f() {
        String substring;
        fhgi fhgiVar = new fhgi();
        fhgiVar.a = this.b;
        fhgiVar.b = d();
        fhgiVar.c = a();
        fhgiVar.d = this.c;
        int i = this.d;
        if (i == fhgj.a(this.b)) {
            i = -1;
        }
        fhgiVar.e = i;
        fhgiVar.f.clear();
        fhgiVar.f.addAll(h());
        fhgiVar.b(c());
        if (this.k == null) {
            substring = null;
        } else {
            substring = this.g.substring(ffpc.P(this.g, '#', 0, 6) + 1);
            substring.getClass();
        }
        fhgiVar.h = substring;
        String str = fhgiVar.d;
        fhgiVar.d = str != null ? new ffpa("[\"<>^`{|}]").a(str, "") : null;
        int size = fhgiVar.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = fhgiVar.f;
            list.set(i2, fhgj.e((String) list.get(i2), 0, 0, "[]", true, true, false, false, 227));
        }
        List list2 = fhgiVar.g;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str2 = (String) list2.get(i3);
                list2.set(i3, str2 != null ? fhgj.e(str2, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str3 = fhgiVar.h;
        fhgiVar.h = str3 != null ? fhgj.e(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String fhgiVar2 = fhgiVar.toString();
        try {
            return new URI(fhgiVar2);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new ffpa("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").a(fhgiVar2, ""));
                create.getClass();
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final URL g() {
        try {
            return new URL(this.g);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final List h() {
        int length = this.b.length();
        String str = this.g;
        int P = ffpc.P(str, '/', length + 3, 4);
        int b = fhhl.b(str, "?#", P, str.length());
        ArrayList arrayList = new ArrayList();
        while (P < b) {
            int i = P + 1;
            int a2 = fhhl.a(this.g, '/', i, b);
            String substring = this.g.substring(i, a2);
            substring.getClass();
            arrayList.add(substring);
            P = a2;
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final fhgi i(String str) {
        try {
            fhgi fhgiVar = new fhgi();
            fhgiVar.c(this, str);
            return fhgiVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final fhgk j(String str) {
        str.getClass();
        fhgi i = i(str);
        if (i != null) {
            return i.a();
        }
        return null;
    }

    public final String toString() {
        return this.g;
    }
}

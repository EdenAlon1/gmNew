package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhgf {
    public final List a = new ArrayList(20);

    public final String a(String str) {
        int size = this.a.size() - 2;
        int a = ffib.a(size, 0, -2);
        if (a > size) {
            return null;
        }
        while (!ffpc.j(str, (String) this.a.get(size), true)) {
            if (size == a) {
                return null;
            }
            size -= 2;
        }
        return (String) this.a.get(size + 1);
    }

    public final fhgh b() {
        return new fhgh((String[]) this.a.toArray(new String[0]));
    }

    public final void c(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a.add(str);
        this.a.add(ffpc.x(str2).toString());
    }

    public final void d(String str, String str2) {
        str2.getClass();
        fhgg.a(str);
        fhgg.b(str2, str);
        f(str);
        c(str, str2);
    }

    public final void e(String str, String str2) {
        str.getClass();
        str2.getClass();
        fhgg.a(str);
        fhgg.b(str2, str);
        c(str, str2);
    }

    public final void f(String str) {
        int i = 0;
        while (i < this.a.size()) {
            if (ffpc.j(str, (String) this.a.get(i), true)) {
                this.a.remove(i);
                this.a.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }
}

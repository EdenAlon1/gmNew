package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emwz {
    private final String a;
    private final emwy b;
    private emwy c;
    private boolean d;

    public emwz(String str) {
        emwy emwyVar = new emwy();
        this.b = emwyVar;
        this.c = emwyVar;
        this.d = false;
        str.getClass();
        this.a = str;
    }

    private final emwy i() {
        emwy emwyVar = new emwy();
        this.c.c = emwyVar;
        this.c = emwyVar;
        return emwyVar;
    }

    private final void j(String str, Object obj) {
        emwx emwxVar = new emwx();
        this.c.c = emwxVar;
        this.c = emwxVar;
        emwxVar.b = obj;
        emwxVar.a = str;
    }

    public final void a(Object obj) {
        i().b = obj;
    }

    public final void b(String str, Object obj) {
        emwy i = i();
        i.b = obj;
        str.getClass();
        i.a = str;
    }

    public final void c() {
        this.d = true;
    }

    public final void d(String str, double d) {
        j(str, String.valueOf(d));
    }

    public final void e(String str, float f) {
        j(str, String.valueOf(f));
    }

    public final void f(String str, int i) {
        j(str, String.valueOf(i));
    }

    public final void g(String str, long j) {
        j(str, String.valueOf(j));
    }

    public final void h(String str, boolean z) {
        j(str, String.valueOf(z));
    }

    public final String toString() {
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        String str = "";
        for (emwy emwyVar = this.b.c; emwyVar != null; emwyVar = emwyVar.c) {
            boolean z2 = emwyVar instanceof emwx;
            Object obj = emwyVar.b;
            if (z2 || obj != null || !z) {
                sb.append(str);
                String str2 = emwyVar.a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r4.length() - 1);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

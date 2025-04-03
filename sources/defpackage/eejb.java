package defpackage;

import java.util.Hashtable;
import java.util.Locale;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eejb extends eejh {
    protected static final Hashtable a = new Hashtable();
    protected static final Object b = new Object();
    protected static final Hashtable c = new Hashtable();
    protected Hashtable d;
    public eejj e;

    public eejb(String str) {
        j(str);
    }

    public static String b(char c2) {
        return Character.valueOf(c2).toString();
    }

    public static final boolean k(char c2) {
        return t(c2) || c2 == '!' || c2 == '%' || c2 == '\'' || c2 == '~' || c2 == '*' || c2 == '+' || c2 == '-' || c2 == '.' || c2 == '_' || c2 == '`';
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0073 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eejj a(int r14) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eejb.a(int):eejj");
    }

    public final String c() {
        if (this.g >= this.f.length()) {
            return null;
        }
        return this.f.substring(this.g);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        try {
            if (!Character.isDigit(o(0))) {
                throw new eeje(this.f + ": Unexpected token at " + o(0));
            }
            sb.append(o(0));
            q(1);
            while (true) {
                char o = o(0);
                if (!Character.isDigit(o)) {
                    return sb.toString();
                }
                sb.append(o);
                q(1);
            }
        } catch (eeje unused) {
            return sb.toString();
        }
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        if (o(0) != '\"') {
            return null;
        }
        q(1);
        while (true) {
            char n = n();
            if (n == '\"') {
                return sb.toString();
            }
            if (n == '\\') {
                sb.append('\\');
                sb.append(n());
            } else {
                sb.append(n);
            }
        }
    }

    public final String f() {
        StringBuilder sb = new StringBuilder();
        while (r()) {
            try {
                char o = o(0);
                if (!k(o)) {
                    break;
                }
                q(1);
                sb.append(o);
            } catch (eeje unused) {
                return sb.toString();
            }
        }
        return sb.toString();
    }

    public final Vector g(int i) {
        int i2 = this.g;
        Vector vector = new Vector();
        for (int i3 = 0; i3 < i; i3++) {
            eejj eejjVar = new eejj();
            if (l()) {
                String f = f();
                eejjVar.a = f;
                Integer num = (Integer) this.d.get(f.toUpperCase(Locale.US));
                if (num == null || !this.d.containsKey(f.toUpperCase(Locale.US))) {
                    eejjVar.b = 4095;
                } else {
                    eejjVar.b = num.intValue();
                }
            } else {
                char n = n();
                StringBuilder sb = new StringBuilder();
                sb.append(n);
                eejjVar.a = sb.toString();
                if (s(n)) {
                    eejjVar.b = 4099;
                } else {
                    if (Character.isDigit(n)) {
                        n = 4098;
                    }
                    eejjVar.b = n;
                }
            }
            vector.addElement(eejjVar);
        }
        this.h = this.g;
        this.g = i2;
        return vector;
    }

    public final void h() {
        while (true) {
            try {
                if (o(0) != ' ' && o(0) != '\t') {
                    return;
                } else {
                    q(1);
                }
            } catch (eeje unused) {
                return;
            }
        }
    }

    protected final void i(String str, int i) {
        Integer valueOf = Integer.valueOf(i);
        this.d.put(str, valueOf);
        Hashtable hashtable = a;
        if (hashtable.containsKey(valueOf)) {
            return;
        }
        hashtable.put(valueOf, str);
    }

    public abstract void j(String str);

    public final boolean l() {
        try {
            return k(o(0));
        } catch (eeje unused) {
            return false;
        }
    }

    public final String m() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            try {
                sb.append(o(i));
            } catch (eeje unused) {
                return sb.toString();
            }
        }
        return sb.toString();
    }
}

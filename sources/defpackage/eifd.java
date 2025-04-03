package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eifd {
    final String a;
    public int b = 0;

    public eifd(String str) {
        this.a = str;
    }

    public final char a() {
        emxf.l(d());
        String str = this.a;
        str.getClass();
        return str.charAt(this.b);
    }

    public final String b(emvz emvzVar) {
        emxf.l(d());
        int i = this.b;
        String c = c(emvzVar);
        emxf.l(this.b != i);
        return c;
    }

    public final String c(emvz emvzVar) {
        String str = this.a;
        str.getClass();
        int i = this.b;
        this.b = emvzVar.f().e(str, i);
        return d() ? this.a.substring(i, this.b) : this.a.substring(i);
    }

    public final boolean d() {
        String str = this.a;
        str.getClass();
        int i = this.b;
        return i >= 0 && i < str.length();
    }

    public final void e(char c) {
        emxf.l(d());
        emxf.l(a() == c);
        this.b++;
    }
}

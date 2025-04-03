package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctzf {
    final String a;
    public final int b;

    public ctzf(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean a() {
        int i = this.b;
        return i == 1 || i == 4;
    }

    public final boolean b() {
        int i = this.b;
        return i == 1 || i == 3 || i == 4;
    }

    public final boolean c() {
        return this.b == 0;
    }

    public final boolean d() {
        int i = this.b;
        return i == 1 || i == 2;
    }
}

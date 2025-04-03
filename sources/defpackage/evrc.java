package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evrc {
    int a = 0;
    final /* synthetic */ evrd b;

    public evrc(evrd evrdVar) {
        this.b = evrdVar;
    }

    public final int a(int i) {
        return this.b.a[this.a + i] & 255;
    }

    public final int b() {
        int i = this.a;
        this.a = i + 1;
        return this.b.a[i] & 255;
    }

    public final int c() {
        return (b() << 8) | b();
    }

    public final int d(int i) {
        this.a += i;
        return i != 0 ? 1 : 2;
    }

    public final int e(int i) {
        return d(a(i));
    }
}

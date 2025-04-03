package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aevw {
    public final ehuz a;
    public final ehun b;
    public final int c;

    private aevw(ehuz ehuzVar, ehun ehunVar, int i) {
        this.a = ehuzVar;
        this.b = ehunVar;
        this.c = i;
    }

    static aevw a(int i, ehun ehunVar) {
        ehuy b = ehuz.b(i);
        b.b();
        return new aevw(b.a(), ehunVar, 0);
    }

    static aevw b(ehun ehunVar, int i) {
        ehuy b = ehuz.b(1);
        b.b();
        return new aevw(b.a(), ehunVar, i);
    }
}

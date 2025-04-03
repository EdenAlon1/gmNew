package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rjb {
    private final int a;
    private boolean b;

    public rjb(int i) {
        this.a = i;
    }

    public final rjc a() {
        return new rjc(this.a, this.b);
    }

    public final void b() {
        this.b = true;
    }

    public rjb() {
        this(300);
    }
}

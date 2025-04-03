package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyp implements jvj {
    private final jvj a;
    private final int c;
    private final int d;

    public eyp(jvj jvjVar, int i, int i2) {
        this.a = jvjVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.jvj
    public final int a(int i) {
        int a = this.a.a(i);
        if (i >= 0 && i <= this.c) {
            eyq.b(a, this.d, i);
        }
        return a;
    }

    @Override // defpackage.jvj
    public final int b(int i) {
        int b = this.a.b(i);
        if (i >= 0 && i <= this.d) {
            eyq.c(b, this.c, i);
        }
        return b;
    }
}

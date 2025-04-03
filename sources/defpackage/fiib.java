package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiib {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public fiib(String str) {
        String[] split = str.split("\\.");
        this.a = Integer.parseInt(split[0]);
        this.b = Integer.parseInt(split[1]);
        this.c = Integer.parseInt(split[2]);
        this.d = Integer.parseInt(split[3]);
    }

    public final String toString() {
        return this.a + "." + this.b + "." + this.c + "." + this.d;
    }
}

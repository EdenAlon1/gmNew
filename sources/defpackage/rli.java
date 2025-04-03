package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rli extends rmq {
    public static final rli a = new rli(0);
    public final int b;

    public rli(int i) {
        this.b = i;
    }

    public final String toString() {
        return String.format("#%06x", Integer.valueOf(this.b));
    }
}

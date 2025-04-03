package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eacs {
    public wr a;
    public wr b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public eacs(wr wrVar, wr wrVar2, int i, int i2, int i3, int i4) {
        this.a = wrVar;
        this.b = wrVar2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final String toString() {
        return "ChangeInfo{oldHolder=" + String.valueOf(this.a) + ", newHolder=" + String.valueOf(this.b) + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + "}";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjk {
    public final ffix a;
    public final ffix b;
    public final boolean c;

    public jjk(ffix ffixVar, ffix ffixVar2, boolean z) {
        this.a = ffixVar;
        this.b = ffixVar2;
        this.c = z;
    }

    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.a.invoke()).floatValue() + ", maxValue=" + ((Number) this.b.invoke()).floatValue() + ", reverseScrolling=" + this.c + ')';
    }
}

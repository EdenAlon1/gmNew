package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgm {
    public final kgn a;
    public final kgn b;
    public final kgn c;

    private kgm(jzq jzqVar, String str) {
        this.a = new kgn(jzqVar, str, "base");
        this.b = new kgn(null, null, "min");
        this.c = new kgn(null, null, "max");
    }

    public kgm(float f) {
        this(new jzq(f), null);
    }

    public kgm(String str) {
        this(null, str);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class rdi {
    public static final rdi b;
    public static final rdi c;
    public static final rdi d;
    public static final rdi e;
    public static final rdi f;
    public static final rdi g;
    public static final qtt h;
    static final boolean i;

    static {
        int i2 = rdc.a;
        b = new rdd();
        c = new rdg();
        d = new rde();
        rdf rdfVar = new rdf();
        e = rdfVar;
        f = new rdh();
        g = rdfVar;
        h = new qtt("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", rdfVar, qtt.a);
        i = true;
    }

    public abstract float a(int i2, int i3, int i4, int i5);

    public abstract int b(int i2, int i3, int i4, int i5);
}

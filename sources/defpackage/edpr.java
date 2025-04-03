package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class edpr {
    public abstract edps a();

    public abstract void b(String str);

    public abstract void c(int i);

    public abstract void d(int i);

    public final edps e() {
        edps a = a();
        edls edlsVar = (edls) a;
        int i = edlsVar.c;
        emxf.d(i >= 0, "Width must not be < 0, but was: %s.", i);
        int i2 = edlsVar.b;
        emxf.d(i2 >= 0, "Height must not be < 0, but was: %s.", i2);
        emxf.b(!edlsVar.d.isEmpty(), "PhotoReference must not be empty.");
        return a;
    }
}

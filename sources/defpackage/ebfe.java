package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ebfe {
    public abstract ebff a();

    public abstract void b(int i);

    public abstract void c(boolean z);

    public final ebff d() {
        ebff a = a();
        ebcw ebcwVar = (ebcw) a;
        emxf.m((ebcwVar.b != -1) ^ (ebcwVar.a != null), "Either icon id or icon drawable must be specified");
        return a;
    }
}

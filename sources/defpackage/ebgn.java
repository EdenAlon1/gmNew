package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ebgn {
    public abstract ebgo a();

    public abstract void b(String str);

    public abstract void c(int i);

    public final ebgo d() {
        ebgo a = a();
        ebgf ebgfVar = (ebgf) a;
        emxf.m((ebgfVar.b != -1) ^ (ebgfVar.a != null), "Either icon id or icon drawable must be specified");
        return a;
    }
}

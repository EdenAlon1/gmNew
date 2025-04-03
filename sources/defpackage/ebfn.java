package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ebfn {
    public abstract ebfp a();

    public final ebfp b() {
        ebfp a = a();
        ebfs ebfsVar = (ebfs) a;
        emxf.m((ebfsVar.c != -1) ^ (ebfsVar.b != null), "Either icon id or icon drawable must be specified");
        return a;
    }

    public abstract void c(ebfm ebfmVar);

    public abstract void d(emxc emxcVar);

    public abstract void e(int i);

    public abstract void f(int i);

    public abstract void g(String str);

    public abstract void h(int i);

    public abstract void i(boolean z);
}

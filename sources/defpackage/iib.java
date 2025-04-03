package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class iib {
    private ffji a;

    public ffji a() {
        return this.a;
    }

    public abstract void b(ifr ifrVar);

    public void e(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    public final void f() {
        ffji a = a();
        if (a != null) {
            a.invoke(this);
        }
    }
}

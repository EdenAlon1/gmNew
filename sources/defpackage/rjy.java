package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rjy implements rjz {
    final /* synthetic */ rjz a;
    private volatile Object b;

    public rjy(rjz rjzVar) {
        this.a = rjzVar;
    }

    @Override // defpackage.rjz
    public final Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    Object a = this.a.a();
                    rkf.f(a);
                    this.b = a;
                }
            }
        }
        return this.b;
    }
}

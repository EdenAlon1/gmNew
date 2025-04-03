package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejc {
    public final hqu a;
    public final ffix b;
    private final cop c;

    public ejc(hqu hquVar, ffix ffixVar) {
        this.a = hquVar;
        this.b = ffixVar;
        long[] jArr = cpg.a;
        this.c = new cop((byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [ejg, java.lang.Object] */
    public final Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        ejb ejbVar = (ejb) this.c.f(obj);
        if (ejbVar != null) {
            return ejbVar.b;
        }
        ?? invoke = this.b.invoke();
        int a = invoke.a(obj);
        if (a == -1) {
            return null;
        }
        return invoke.c(a);
    }

    public final ffjm b(int i, Object obj, Object obj2) {
        ejb ejbVar = (ejb) this.c.f(obj);
        if (ejbVar != null && ejbVar.c == i && ffkj.e(ejbVar.b, obj2)) {
            return ejbVar.a();
        }
        ejb ejbVar2 = new ejb(this, i, obj, obj2);
        this.c.e(obj, ejbVar2);
        return ejbVar2.a();
    }
}

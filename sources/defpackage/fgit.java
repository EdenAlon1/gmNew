package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgit {
    public final Object a;
    public final ffjn b;
    public final Object c;
    public Object d;
    public int e = -1;
    private final ffjn f;
    private final Object g;

    public fgit(Object obj, ffjn ffjnVar, ffjn ffjnVar2, Object obj2, Object obj3) {
        this.a = obj;
        this.b = ffjnVar;
        this.f = ffjnVar2;
        this.c = obj2;
        this.g = obj3;
    }

    public final Object a(Object obj, ffgu ffguVar) {
        Object obj2 = this.c;
        Object obj3 = this.g;
        return obj2 == fgiz.f ? ((ffji) obj3).invoke(ffguVar) : ((ffjm) obj3).a(obj, ffguVar);
    }

    public final Object b(Object obj) {
        return this.f.a(this.a, this.c, obj);
    }

    public final void c() {
        Object obj = this.d;
        if (obj instanceof fghl) {
            ((fghl) obj).l(this.e);
            return;
        }
        ffte ffteVar = obj instanceof ffte ? (ffte) obj : null;
        if (ffteVar != null) {
            ffteVar.hO();
        }
    }
}

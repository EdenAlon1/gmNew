package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivr {
    public final hne a;
    public final ffix b;

    public ivr(hne hneVar, ffix ffixVar) {
        this.a = hneVar;
        this.b = ffixVar;
    }

    public final Object a(int i) {
        ffix ffixVar = this.b;
        Object c = this.a.c(i);
        ffixVar.invoke();
        return c;
    }

    public final void b(int i, Object obj) {
        this.a.f(i, obj);
        this.b.invoke();
    }
}

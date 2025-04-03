package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czq<S> extends dbt<S> {
    private final hho b;
    private final hho c;

    public czq(Object obj) {
        this.b = new hic(obj, hla.a);
        this.c = new hic(obj, hla.a);
    }

    @Override // defpackage.dbt
    public final Object a() {
        return this.b.a();
    }

    @Override // defpackage.dbt
    public final Object b() {
        return this.c.a();
    }

    @Override // defpackage.dbt
    public final void c(Object obj) {
        this.b.b(obj);
    }

    public final void d(Object obj) {
        this.c.b(obj);
    }
}

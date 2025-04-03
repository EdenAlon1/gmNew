package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emlv implements emlt {
    private final Object a;
    private final emlw b;

    public emlv(Object obj, emlw emlwVar) {
        this.a = obj;
        this.b = emlwVar;
    }

    @Override // defpackage.emlt
    public final Object a() {
        return this.a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.d();
    }
}

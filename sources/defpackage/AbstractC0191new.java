package defpackage;

/* compiled from: PG */
/* renamed from: new, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0191new {
    protected final ndu d;

    protected AbstractC0191new(ndu nduVar) {
        this.d = nduVar;
    }

    protected abstract boolean a(luv luvVar);

    protected abstract boolean b(luv luvVar, long j);

    public final boolean c(luv luvVar, long j) {
        return a(luvVar) && b(luvVar, j);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffrc implements ffrd {
    private final ffji a;

    public ffrc(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.ffrd
    public final void b(Throwable th) {
        this.a.invoke(th);
    }

    public final String toString() {
        return "CancelHandler.UserSupplied[" + ffsp.a(this.a) + "@" + ffsp.b(this) + "]";
    }
}

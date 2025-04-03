package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fftz extends ffuj {
    private final ffji a;
    private final ffqk b = new ffqk(false, ffqo.a);

    public fftz(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.ffuj
    public final void a(Throwable th) {
        if (this.b.b()) {
            this.a.invoke(th);
        }
    }

    @Override // defpackage.ffuj
    public final boolean b() {
        return true;
    }
}

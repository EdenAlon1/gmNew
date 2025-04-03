package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ptm extends ffkk implements ffji {
    public static final ptm a = new ptm();

    public ptm() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        pyj pyjVar = (pyj) obj;
        pyjVar.getClass();
        return true != pyjVar.f() ? "OneTime" : "Periodic";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class krm implements ksp {
    final /* synthetic */ kre a;

    public krm(kre kreVar) {
        this.a = kreVar;
    }

    @Override // defpackage.ksp
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        krp krpVar = (krp) obj;
        if (krpVar == null) {
            krpVar = new krp(-3);
        }
        this.a.a(krpVar);
    }
}

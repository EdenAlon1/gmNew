package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ijz extends ffkk implements ffji {
    final /* synthetic */ fflb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijz(fflb fflbVar) {
        super(1);
        this.a = fflbVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        fflb fflbVar = this.a;
        ikc ikcVar = (ikc) obj;
        if (fflbVar.a == null && ikcVar.b) {
            fflbVar.a = ikcVar;
        }
        return true;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xya implements ffji {
    final /* synthetic */ axpl a;
    final /* synthetic */ xyd b;
    final /* synthetic */ boolean c;

    public xya(axpl axplVar, xyd xydVar, boolean z) {
        this.a = axplVar;
        this.b = xydVar;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [abke, java.lang.Object] */
    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ajiy ajiyVar = (ajiy) obj;
        ajiyVar.getClass();
        this.a.a(new xxx(ajiyVar));
        ?? r0 = this.b.e.get();
        axpl axplVar = this.a;
        return r0.c(new abkd(new xxy(axplVar, ajiyVar), new xxz(axplVar, ajiyVar), this.c));
    }
}

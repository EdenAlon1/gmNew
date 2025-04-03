package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfi extends ffkk implements ffix {
    final /* synthetic */ dfp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfi(dfp dfpVar) {
        super(0);
        this.a = dfpVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        ffix ffixVar = this.a.i;
        if (ffixVar != null) {
            ffixVar.invoke();
        }
        return true;
    }
}

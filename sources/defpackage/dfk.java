package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfk extends ffkk implements ffji {
    final /* synthetic */ dfp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfk(dfp dfpVar) {
        super(1);
        this.a = dfpVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        long j = ((iak) obj).a;
        ffix ffixVar = this.a.i;
        if (ffixVar != null) {
            ffixVar.invoke();
        }
        dfp dfpVar = this.a;
        if (dfpVar.k) {
            ((iir) isv.a(dfpVar, jdr.h)).a(0);
        }
        return ffcu.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffbi extends ffbe {
    final /* synthetic */ ffbj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffbi(ffbj ffbjVar) {
        super(ffbjVar);
        this.b = ffbjVar;
    }

    @Override // defpackage.ffbe, defpackage.ffbd, defpackage.feai
    public final void f(fdyc fdycVar, feao feaoVar) {
        super.f(fdycVar, feaoVar);
        ffbj ffbjVar = this.b;
        if (ffbjVar.f.i || fdycVar != fdyc.IDLE) {
            return;
        }
        ffbjVar.b.d();
    }
}

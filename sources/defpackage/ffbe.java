package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffbe extends ffbd {
    final /* synthetic */ ffbf a;

    protected ffbe(ffbf ffbfVar) {
        this.a = ffbfVar;
    }

    @Override // defpackage.ffbd, defpackage.feai
    public void f(fdyc fdycVar, feao feaoVar) {
        ffbf ffbfVar = this.a;
        if (ffbfVar.c == fdyc.SHUTDOWN) {
            return;
        }
        ffbfVar.c = fdycVar;
        ffbfVar.d = feaoVar;
        ffbh ffbhVar = ffbfVar.e;
        if (ffbhVar.i) {
            return;
        }
        ffbhVar.g();
    }

    @Override // defpackage.ffbd
    protected final feai g() {
        return this.a.e.h;
    }
}

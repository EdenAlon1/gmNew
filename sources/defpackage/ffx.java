package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffx extends ffkk implements ffji {
    final /* synthetic */ dkl a;
    final /* synthetic */ fft b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffx(dkl dklVar, fft fftVar) {
        super(1);
        this.a = dklVar;
        this.b = fftVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        fft fftVar = this.b;
        dkg dkgVar = (dkg) obj;
        ffcu[] ffcuVarArr = new ffcu[2];
        evv evvVar = evv.b;
        if (fftVar.C()) {
            fft fftVar2 = this.b;
            dkgVar.a.add(new hpw(262103052, true, new dkf(new esp(evvVar), hvi.e, new ffv(this.a, fftVar2))));
        }
        ffcuVarArr[0] = ffcu.a;
        dkl dklVar = this.a;
        fft fftVar3 = this.b;
        evv evvVar2 = evv.d;
        boolean A = fftVar3.A();
        fft fftVar4 = this.b;
        if (!A) {
            dkgVar.a.add(new hpw(262103052, true, new dkf(new esp(evvVar2), hvi.e, new ffw(dklVar, fftVar4))));
        }
        ffcuVarArr[1] = ffcu.a;
        ffdx.g(ffcuVarArr);
        return ffcu.a;
    }
}

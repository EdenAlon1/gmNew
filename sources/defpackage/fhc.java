package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fhc extends ffkk implements ffix {
    final /* synthetic */ fhi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhc(fhi fhiVar) {
        super(0);
        this.a = fhiVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        fhi fhiVar = this.a;
        ffsk ffskVar = fhiVar.h;
        if (ffskVar != null) {
            ffqy.d(ffskVar, null, ffsm.d, new fhb(fhiVar, null), 1);
        }
        this.a.k();
        return ffcu.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iik extends ffkk implements ffix {
    final /* synthetic */ iil a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iik(iil iilVar) {
        super(0);
        this.a = iilVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        iil iilVar = this.a;
        if (iilVar.d == iilVar.g()) {
            iil iilVar2 = this.a;
            iilVar2.e.i(iilVar2.g() + 1);
        }
        return ffcu.a;
    }
}

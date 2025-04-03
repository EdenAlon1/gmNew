package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwu extends ffkk implements ffji {
    final /* synthetic */ long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwu(long j) {
        super(1);
        this.a = j;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        idd iddVar = (idd) obj;
        iddVar.x(Float.intBitsToFloat((int) (this.a >> 32)));
        iddVar.y(Float.intBitsToFloat((int) (this.a & 4294967295L)));
        iddVar.C(ids.a(0.0f, 0.0f));
        return ffcu.a;
    }
}

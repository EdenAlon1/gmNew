package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class erq extends ffkk implements ffji {
    final /* synthetic */ eyh a;
    final /* synthetic */ ffji b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erq(eyh eyhVar, ffji ffjiVar) {
        super(1);
        this.a = eyhVar;
        this.b = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        eyh eyhVar = this.a;
        jpg jpgVar = (jpg) obj;
        if (eyhVar != null) {
            eyhVar.a.b(jpgVar);
        }
        ffji ffjiVar = this.b;
        if (ffjiVar != null) {
            ffjiVar.invoke(jpgVar);
        }
        return ffcu.a;
    }
}

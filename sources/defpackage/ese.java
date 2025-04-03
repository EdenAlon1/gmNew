package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ese extends ffkk implements ffji {
    final /* synthetic */ hho a;
    final /* synthetic */ ffji b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ese(hho hhoVar, ffji ffjiVar) {
        super(1);
        this.a = hhoVar;
        this.b = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        long j = ((iak) obj).a;
        jpg jpgVar = (jpg) this.a.a();
        if (jpgVar != null) {
            this.b.invoke(Integer.valueOf(jpgVar.k(j)));
        }
        return ffcu.a;
    }
}

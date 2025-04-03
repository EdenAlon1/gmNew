package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class esc extends ffkk implements ffji {
    final /* synthetic */ hho a;
    final /* synthetic */ ffji b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esc(hho hhoVar, ffji ffjiVar) {
        super(1);
        this.a = hhoVar;
        this.b = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jpg jpgVar = (jpg) obj;
        this.a.b(jpgVar);
        this.b.invoke(jpgVar);
        return ffcu.a;
    }
}

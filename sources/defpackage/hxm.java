package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hxm extends ffkk implements ffji {
    final /* synthetic */ ffji a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxm(ffji ffjiVar) {
        super(1);
        this.a = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ifo ifoVar = (ifo) obj;
        this.a.invoke(ifoVar);
        ifoVar.p();
        return ffcu.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class erc extends ffkk implements ffji {
    final /* synthetic */ jvu a;
    final /* synthetic */ ffji b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erc(jvu jvuVar, ffji ffjiVar) {
        super(1);
        this.a = jvuVar;
        this.b = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jvu jvuVar = (jvu) obj;
        if (!ffkj.e(this.a, jvuVar)) {
            this.b.invoke(jvuVar);
        }
        return ffcu.a;
    }
}

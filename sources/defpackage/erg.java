package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class erg extends ffkk implements ffji {
    final /* synthetic */ ffji a;
    final /* synthetic */ hho b;
    final /* synthetic */ hho c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erg(ffji ffjiVar, hho hhoVar, hho hhoVar2) {
        super(1);
        this.a = ffjiVar;
        this.b = hhoVar;
        this.c = hhoVar2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jvu jvuVar = (jvu) obj;
        eri.b(this.b, jvuVar);
        boolean e = ffkj.e((String) this.c.a(), jvuVar.a());
        this.c.b(jvuVar.a());
        if (!e) {
            this.a.invoke(jvuVar.a());
        }
        return ffcu.a;
    }
}

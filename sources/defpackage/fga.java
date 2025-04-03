package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fga extends ffkk implements ffji {
    final /* synthetic */ jzn a;
    final /* synthetic */ hho b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fga(jzn jznVar, hho hhoVar) {
        super(1);
        this.a = jznVar;
        this.b = hhoVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        float b = jzv.b(((jzv) obj).a);
        jzn jznVar = this.a;
        this.b.b(new kaf((jznVar.eo(b) << 32) | (jznVar.eo(jzv.a(r0)) & 4294967295L)));
        return ffcu.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jbr extends ffkk implements ffji {
    final /* synthetic */ jfg a;
    final /* synthetic */ jbu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbr(jfg jfgVar, jbu jbuVar) {
        super(1);
        this.a = jfgVar;
        this.b = jbuVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new jer(this.a, new jbq(this.b));
    }
}

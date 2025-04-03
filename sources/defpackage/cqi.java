package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cqi extends ffkk implements ffji {
    final /* synthetic */ hss a;
    final /* synthetic */ Object b;
    final /* synthetic */ cqw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqi(hss hssVar, Object obj, cqw cqwVar) {
        super(1);
        this.a = hssVar;
        this.b = obj;
        this.c = cqwVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cqh(this.a, this.b, this.c);
    }
}

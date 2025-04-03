package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvcf extends ffhv implements ffji {
    int a;
    final /* synthetic */ dvci b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvcf(dvci dvciVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dvciVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        dvci dvciVar = this.b;
        this.a = 1;
        Object d = dvciVar.d(this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dvcf(this.b, (ffgu) obj).b(ffcu.a);
    }
}

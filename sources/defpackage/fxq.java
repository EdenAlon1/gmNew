package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fxq extends ffhv implements ffjn {
    /* synthetic */ long a;
    final /* synthetic */ fxv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxq(fxv fxvVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.b = fxvVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j = ((iak) obj2).a;
        fxq fxqVar = new fxq(this.b, (ffgu) obj3);
        fxqVar.a = j;
        return fxqVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        long j = this.a;
        this.b.e = iak.b(j);
        this.b.f = iak.c(j);
        return ffcu.a;
    }
}

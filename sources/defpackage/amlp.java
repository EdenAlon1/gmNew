package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amlp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amlt b;
    final /* synthetic */ aqux c;
    final /* synthetic */ engw d;
    final /* synthetic */ boolean e;
    final /* synthetic */ String f;
    final /* synthetic */ axad g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amlp(amlt amltVar, aqux aquxVar, engw engwVar, boolean z, String str, axad axadVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amltVar;
        this.c = aquxVar;
        this.d = engwVar;
        this.e = z;
        this.f = str;
        this.g = axadVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amlp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        amlt amltVar = this.b;
        aqux aquxVar = this.c;
        engw engwVar = this.d;
        boolean z = this.e;
        String str = this.f;
        axad axadVar = this.g;
        this.a = 1;
        Object c = amltVar.c(aquxVar, engwVar, z, str, axadVar, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amlp(this.b, this.c, this.d, this.e, this.f, this.g, ffguVar);
    }
}

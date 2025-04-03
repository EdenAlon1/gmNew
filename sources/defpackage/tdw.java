package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tdw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ted b;
    final /* synthetic */ String c;
    final /* synthetic */ long d;
    final /* synthetic */ eskt e;
    final /* synthetic */ eslh f;
    final /* synthetic */ ezlj g;
    final /* synthetic */ eyee h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdw(ted tedVar, String str, long j, eskt esktVar, eslh eslhVar, ezlj ezljVar, eyee eyeeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = tedVar;
        this.c = str;
        this.d = j;
        this.e = esktVar;
        this.f = eslhVar;
        this.g = ezljVar;
        this.h = eyeeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tdw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ted tedVar = this.b;
        String str = this.c;
        long j = this.d;
        eskt esktVar = this.e;
        eslh eslhVar = this.f;
        ezlj ezljVar = this.g;
        eyee eyeeVar = this.h;
        this.a = 1;
        Object e = tedVar.e(str, j, esktVar, eslhVar, ezljVar, eyeeVar, this);
        return e == ffhhVar ? ffhhVar : e;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new tdw(this.b, this.c, this.d, this.e, this.f, this.g, this.h, ffguVar);
    }
}

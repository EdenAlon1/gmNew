package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zle extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ablf b;
    final /* synthetic */ zmw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zle(ablf ablfVar, zmw zmwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ablfVar;
        this.c = zmwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zle) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ablf ablfVar = this.b;
            zmw zmwVar = this.c;
            ffxx a = ablfVar.a();
            zld zldVar = new zld(zmwVar, null);
            this.a = 1;
            if (ffyk.b(a, zldVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zle(this.b, this.c, ffguVar);
    }
}

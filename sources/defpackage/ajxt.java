package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajxt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ajyr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajxt(ajyr ajyrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ajyrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajxt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ajyr ajyrVar = this.b;
        this.a = 1;
        Object l = ajyrVar.l(this);
        return l == ffhhVar ? ffhhVar : l;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajxt(this.b, ffguVar);
    }
}

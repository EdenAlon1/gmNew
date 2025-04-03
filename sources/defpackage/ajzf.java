package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajzf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ajzh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajzf(ajzh ajzhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ajzhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajzf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ajzh ajzhVar = this.b;
        this.a = 1;
        Object a = ajzhVar.a(this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajzf(this.b, ffguVar);
    }
}

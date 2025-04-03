package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlcp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ lld b;
    final /* synthetic */ ffjm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlcp(lld lldVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = lldVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlcp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        dlco dlcoVar = new dlco(lkb.a(this.b), this.c);
        this.a = 1;
        Object a = fgbj.a(dlcoVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dlcp(this.b, this.c, ffguVar);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class denu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ deny b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public denu(deny denyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = denyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((denu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            deny denyVar = this.b;
            ffcu ffcuVar = ffcu.a;
            this.a = 1;
            if (denyVar.s.fQ(ffcuVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new denu(this.b, ffguVar);
    }
}

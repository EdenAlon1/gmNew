package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajbm extends ffhv implements ffjm {
    final /* synthetic */ ajbx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajbm(ajbx ajbxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ajbxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajbm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.g.h(aime.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajbm(this.a, ffguVar);
    }
}

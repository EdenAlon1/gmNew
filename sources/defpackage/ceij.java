package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceij extends ffhv implements ffjm {
    final /* synthetic */ ceiw a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceij(ffgu ffguVar, ceiw ceiwVar) {
        super(2, ffguVar);
        this.a = ceiwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ceij) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ffbz ffbzVar = ceiw.a;
        this.a.f.h();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ceij ceijVar = new ceij(ffguVar, this.a);
        ceijVar.b = obj;
        return ceijVar;
    }
}

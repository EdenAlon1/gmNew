package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceio extends ffhv implements ffjm {
    final /* synthetic */ ceiw a;
    final /* synthetic */ epfx b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceio(ffgu ffguVar, ceiw ceiwVar, epfx epfxVar) {
        super(2, ffguVar);
        this.a = ceiwVar;
        this.b = epfxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ceio) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.e.t(this.b);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ceio ceioVar = new ceio(ffguVar, this.a, this.b);
        ceioVar.c = obj;
        return ceioVar;
    }
}

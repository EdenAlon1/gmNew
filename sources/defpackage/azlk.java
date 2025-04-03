package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azlk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ azlv b;
    final /* synthetic */ azsu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azlk(azlv azlvVar, azsu azsuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = azlvVar;
        this.c = azsuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azlk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        azlv azlvVar = this.b;
        azsu azsuVar = this.c;
        this.a = 1;
        Object f = azlvVar.f(azsuVar, this);
        return f == ffhhVar ? ffhhVar : f;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new azlk(this.b, this.c, ffguVar);
    }
}

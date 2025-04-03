package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvfw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dvfx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvfw(dvfx dvfxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dvfxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvfw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dvfx dvfxVar = this.b;
            this.a = 1;
            if (dvfxVar.a.b(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dvfw(this.b, ffguVar);
    }
}

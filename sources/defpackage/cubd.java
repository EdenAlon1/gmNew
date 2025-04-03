package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cubd extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ cube e;
    final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cubd(cube cubeVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.e = cubeVar;
        this.f = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cubd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        fgjb fgjbVar;
        ffhh ffhhVar = ffhh.a;
        if (this.d != 0) {
            obj3 = this.c;
            obj2 = this.b;
            Object obj4 = this.a;
            ffci.b(obj);
            fgjbVar = obj4;
        } else {
            ffci.b(obj);
            obj2 = this.e;
            String str = this.f;
            fgjb fgjbVar2 = cube.a;
            this.a = fgjbVar2;
            this.b = obj2;
            this.c = str;
            this.d = 1;
            if (fgjbVar2.a(null, this) == ffhhVar) {
                return ffhhVar;
            }
            obj3 = str;
            fgjbVar = fgjbVar2;
        }
        try {
            fgjb fgjbVar3 = cube.a;
            kox.e(((cube) obj2).c, engw.r(obj3));
            kox.d(((cube) obj2).c, engw.r(obj3));
            fgjbVar.b(null);
            return ffcu.a;
        } catch (Throwable th) {
            fgjbVar.b(null);
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cubd(this.e, this.f, ffguVar);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewx extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ hho c;
    final /* synthetic */ boolean d;
    final /* synthetic */ dwn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewx(hho hhoVar, boolean z, dwn dwnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = hhoVar;
        this.d = z;
        this.e = dwnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ewx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        hho hhoVar;
        ffhh ffhhVar = ffhh.a;
        if (this.b == 0) {
            ffci.b(obj);
            dwp dwpVar = (dwp) this.c.a();
            if (dwpVar != null) {
                boolean z = this.d;
                dwn dwnVar = this.e;
                hho hhoVar2 = this.c;
                dwm dwqVar = z ? new dwq(dwpVar) : new dwo(dwpVar);
                if (dwnVar != null) {
                    this.a = hhoVar2;
                    this.b = 1;
                    if (dwnVar.a(dwqVar, this) == ffhhVar) {
                        return ffhhVar;
                    }
                }
                hhoVar = hhoVar2;
            }
            return ffcu.a;
        }
        Object obj2 = this.a;
        ffci.b(obj);
        hhoVar = obj2;
        hhoVar.b(null);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ewx(this.c, this.d, this.e, ffguVar);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmie extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmii b;
    final /* synthetic */ cmip c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmie(ffgu ffguVar, cmii cmiiVar, cmip cmipVar) {
        super(2, ffguVar);
        this.b = cmiiVar;
        this.c = cmipVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmie) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            cmii cmiiVar = this.b;
            cmif cmifVar = new cmif(this.c);
            this.a = 1;
            if (cmiiVar.h.d(cmifVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.b.B(this.c);
        this.b.k();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cmie cmieVar = new cmie(ffguVar, this.b, this.c);
        cmieVar.d = obj;
        return cmieVar;
    }
}

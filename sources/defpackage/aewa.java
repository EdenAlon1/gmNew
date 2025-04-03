package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aewa extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aewb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aewa(aewb aewbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aewbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aewa) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aewb aewbVar = this.b;
            ffxx b = ffyy.b(aewbVar.b, new ffji() { // from class: aevx
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    return ((alxj) obj2).d();
                }
            });
            aevz aevzVar = new aevz(this.b);
            this.a = 1;
            if (b.a(aevzVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aewa(this.b, ffguVar);
    }
}

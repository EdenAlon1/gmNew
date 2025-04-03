package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aesy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aetb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aesy(ffgu ffguVar, aetb aetbVar) {
        super(2, ffguVar);
        this.b = aetbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aesy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aetb aetbVar = this.b;
            this.a = 1;
            if (aetbVar.a.c(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aesy aesyVar = new aesy(ffguVar, this.b);
        aesyVar.c = obj;
        return aesyVar;
    }
}

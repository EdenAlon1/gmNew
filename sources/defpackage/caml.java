package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caml extends ffhv implements ffjm {
    int a;
    final /* synthetic */ camm b;
    final /* synthetic */ chyf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public caml(camm cammVar, chyf chyfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cammVar;
        this.c = chyfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((caml) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        camm cammVar = this.b;
        chyf chyfVar = this.c;
        this.a = 1;
        Object a = cammVar.a(chyfVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new caml(this.b, this.c, ffguVar);
    }
}

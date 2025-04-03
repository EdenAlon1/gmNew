package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lnh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ hij c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnh(ffxx ffxxVar, hij hijVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
        this.c = hijVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lnh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxx ffxxVar = this.b;
            lng lngVar = new lng(this.c);
            this.a = 1;
            if (ffxxVar.a(lngVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new lnh(this.b, this.c, ffguVar);
    }
}

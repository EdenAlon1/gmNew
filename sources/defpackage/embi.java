package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class embi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ ffjm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public embi(ffxx ffxxVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((embi) c((ffxe) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxe ffxeVar = (ffxe) this.d;
            ffxx ffxxVar = this.b;
            embh embhVar = new embh(ffxeVar, this.c);
            this.a = 1;
            if (ffxxVar.a(embhVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        embi embiVar = new embi(this.b, this.c, ffguVar);
        embiVar.d = obj;
        return embiVar;
    }
}

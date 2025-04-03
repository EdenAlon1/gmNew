package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chiy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ chiz b;
    final /* synthetic */ fclq c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chiy(ffgu ffguVar, chiz chizVar, fclq fclqVar) {
        super(2, ffguVar);
        this.b = chizVar;
        this.c = fclqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chiy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        fcmo fcmoVar = (fcmo) this.b.a.a(null, null);
        fclq fclqVar = this.c;
        this.a = 1;
        Object c = fcmoVar.c(fclqVar, new febo(), this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        chiy chiyVar = new chiy(ffguVar, this.b, this.c);
        chiyVar.d = obj;
        return chiyVar;
    }
}

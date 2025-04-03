package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtss extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dtsu b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtss(dtsu dtsuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dtsuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtss) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffxy ffxyVar;
        dtro cQ;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffxyVar = (ffxy) this.c;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ffxyVar = (ffxy) this.c;
        }
        do {
            dtsu dtsuVar = this.b;
            if (dtsuVar.getPosition() == dtsuVar.getCount() || (cQ = this.b.cQ()) == null) {
                return ffcu.a;
            }
            this.c = ffxyVar;
            this.a = 1;
        } while (ffxyVar.fQ(cQ, this) != ffhhVar);
        return ffhhVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dtss dtssVar = new dtss(this.b, ffguVar);
        dtssVar.c = obj;
        return dtssVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cggz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cghg b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cggz(ffgu ffguVar, cghg cghgVar) {
        super(2, ffguVar);
        this.b = cghgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cggz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            cghg cghgVar = this.b;
            this.a = 1;
            obj = cghgVar.b.c(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        cghi cghiVar = (cghi) obj;
        if ((cghiVar.b & 1) == 0) {
            return cggw.a;
        }
        cggw cggwVar = cghiVar.c;
        return cggwVar == null ? cggw.a : cggwVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cggz cggzVar = new cggz(ffguVar, this.b);
        cggzVar.c = obj;
        return cggzVar;
    }
}

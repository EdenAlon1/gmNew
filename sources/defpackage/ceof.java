package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceof extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ceoj b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceof(ffgu ffguVar, ceoj ceojVar) {
        super(2, ffguVar);
        this.b = ceojVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ceof) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            elfl I = this.b.a.I();
            this.a = 1;
            obj = fgfz.c(I, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return new Integer(((csdq) obj).c);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ceof ceofVar = new ceof(ffguVar, this.b);
        ceofVar.c = obj;
        return ceofVar;
    }
}

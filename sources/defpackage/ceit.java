package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceit extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ceiw b;
    final /* synthetic */ eyja c;
    final /* synthetic */ ceic d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceit(ffgu ffguVar, ceiw ceiwVar, eyja eyjaVar, ceic ceicVar) {
        super(2, ffguVar);
        this.b = ceiwVar;
        this.c = eyjaVar;
        this.d = ceicVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ceit) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                ffci.b(obj);
                return obj;
            }
            ffci.b(obj);
            return obj;
        }
        ffci.b(obj);
        ceiw ceiwVar = this.b;
        ffbz ffbzVar = ceiw.a;
        if (!ceiwVar.h() || this.c.equals(eykm.c)) {
            elfl p = this.d.eS().p();
            this.a = 2;
            Object c = fgfz.c(p, this);
            if (c != ffhhVar) {
                return c;
            }
        } else {
            ceic ceicVar = this.d;
            elfl af = ceicVar.eS().af(this.c);
            this.a = 1;
            Object c2 = fgfz.c(af, this);
            if (c2 != ffhhVar) {
                return c2;
            }
        }
        return ffhhVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ceit ceitVar = new ceit(ffguVar, this.b, this.c, this.d);
        ceitVar.e = obj;
        return ceitVar;
    }
}

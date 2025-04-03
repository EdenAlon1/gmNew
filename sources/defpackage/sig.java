package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sig extends ffhv implements ffjm {
    int a;
    final /* synthetic */ sij b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sig(ffgu ffguVar, sij sijVar) {
        super(2, ffguVar);
        this.b = sijVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sig) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            sij sijVar = this.b;
            this.a = 1;
            obj = sijVar.c.c(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        sic sicVar = (sic) obj;
        return Boolean.valueOf((sicVar.b & 1) != 0 ? sicVar.c : true);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        sig sigVar = new sig(ffguVar, this.b);
        sigVar.c = obj;
        return sigVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvdl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvdp b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvdl(ffgu ffguVar, cvdp cvdpVar) {
        super(2, ffguVar);
        this.b = cvdpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvdl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            cvdp cvdpVar = this.b;
            this.a = 1;
            obj = cvew.a(cvdpVar.b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return Boolean.valueOf(((Number) obj).intValue() != 3);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cvdl cvdlVar = new cvdl(ffguVar, this.b);
        cvdlVar.c = obj;
        return cvdlVar;
    }
}

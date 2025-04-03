package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cciv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ccix b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cciv(ccix ccixVar, long j, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ccixVar;
        this.c = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cciv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ccix ccixVar = this.b;
            long j = this.c;
            this.a = 1;
            Object a = ffra.a(ekxi.a(ccixVar.f), new cciw(null, ccixVar, j), this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cciv(this.b, this.c, ffguVar);
    }
}

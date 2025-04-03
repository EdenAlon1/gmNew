package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csrp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ csrv b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csrp(ffgu ffguVar, csrv csrvVar, boolean z) {
        super(2, ffguVar);
        this.b = csrvVar;
        this.c = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csrp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cssu cssuVar = (cssu) this.b.f.b();
            boolean z = this.c;
            this.a = 1;
            if (cssuVar.h(z, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new csrp(ffguVar, this.b, this.c);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsvj extends ffhv implements ffjm {
    final /* synthetic */ boolean a;
    final /* synthetic */ dswd b;
    final /* synthetic */ hkx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsvj(boolean z, dswd dswdVar, hkx hkxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = z;
        this.b = dswdVar;
        this.c = hkxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsvj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (!this.a && dsvs.i(this.c)) {
            this.b.b();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsvj(this.a, this.b, this.c, ffguVar);
    }
}

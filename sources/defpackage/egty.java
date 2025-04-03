package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egty extends ffhv implements ffjm {
    int a;
    final /* synthetic */ egub b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egty(egub egubVar, String str, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = egubVar;
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((egty) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            egub egubVar = this.b;
            egubVar.f.f(new eguc(this.c, this.d));
            egub egubVar2 = this.b;
            this.a = 1;
            if (egubVar2.a.a() == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new egty(this.b, this.c, this.d, ffguVar);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yuc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yud b;
    final /* synthetic */ String c = "Location";
    final /* synthetic */ kli d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yuc(yud yudVar, kli kliVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = yudVar;
        this.d = kliVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yuc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            yud yudVar = this.b;
            String str = this.c;
            kli kliVar = this.d;
            this.a = 1;
            obj = yudVar.b(str, kliVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yuc(this.b, this.d, ffguVar);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cutl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cutp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cutl(cutp cutpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cutpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cutl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            this.a = 1;
            if (((dlkb) this.b.c.b()).b(new int[1], this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cutl(this.b, ffguVar);
    }
}

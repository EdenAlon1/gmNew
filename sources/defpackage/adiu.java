package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adiu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ adiw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adiu(adiw adiwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = adiwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adiu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl a = this.b.a.a();
            this.a = 1;
            obj = fgfz.c(a, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return true;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new adiu(this.b, ffguVar);
    }
}

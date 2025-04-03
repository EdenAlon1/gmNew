package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adon extends ffhv implements ffjm {
    int a;
    final /* synthetic */ adoo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adon(adoo adooVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = adooVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adon) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            adoo adooVar = this.b;
            this.a = 1;
            obj = adooVar.a.h(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new adon(this.b, ffguVar);
    }
}

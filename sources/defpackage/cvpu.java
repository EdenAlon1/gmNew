package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvpu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvpw b;
    final /* synthetic */ cvpn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvpu(cvpw cvpwVar, cvpn cvpnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cvpwVar;
        this.c = cvpnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvpu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cvpw cvpwVar = this.b;
        cvpn cvpnVar = this.c;
        this.a = 1;
        Object l = cvpwVar.l(cvpnVar, this);
        return l == ffhhVar ? ffhhVar : l;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvpu(this.b, this.c, ffguVar);
    }
}

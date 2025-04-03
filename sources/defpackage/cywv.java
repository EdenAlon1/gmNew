package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cywv extends ffhv implements ffjq {
    /* synthetic */ Object a;
    /* synthetic */ long b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    final /* synthetic */ cyvt f;
    final /* synthetic */ cywx g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cywv(cyvt cyvtVar, cywx cywxVar, ffgu ffguVar) {
        super(6, ffguVar);
        this.f = cyvtVar;
        this.g = cywxVar;
    }

    @Override // defpackage.ffjq
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        long j = ((kaa) obj2).a;
        cywv cywvVar = new cywv(this.f, this.g, (ffgu) obj6);
        cywvVar.a = (cyxc) obj;
        cywvVar.b = j;
        cywvVar.c = (cyup) obj3;
        cywvVar.d = (cyvj) obj4;
        cywvVar.e = (cyyj) obj5;
        return cywvVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ffbr ffbrVar = ((atip) this.g.d).a;
        Object obj2 = this.a;
        long j = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.e;
        cyxa cyxaVar = new cyxa(((ersq) ffbrVar.b()).a("bugle.enable_popup_transition_animation_fix"), ((ersq) ((atii) this.g.e).a.b()).a("bugle.enable_large_display_avatar_fix"));
        final cywx cywxVar = this.g;
        ffix ffixVar = new ffix() { // from class: cywt
            @Override // defpackage.ffix
            public final Object invoke() {
                cywx cywxVar2 = cywx.this;
                axol.k(cywxVar2.a, null, new cywu(cywxVar2, null), 3);
                return ffcu.a;
            }
        };
        return new cyxb((cyvj) obj4, (cyup) obj3, (cyxc) obj2, j, this.f.a, new ffix() { // from class: cywy
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }, ffixVar, (cyyj) obj5, cyxaVar);
    }
}

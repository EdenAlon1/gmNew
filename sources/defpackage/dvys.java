package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvys implements ffix {
    final /* synthetic */ dvxe a;
    final /* synthetic */ dvxe b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ int d;

    public dvys(dvxe dvxeVar, dvxe dvxeVar2, ffjm ffjmVar, int i) {
        this.a = dvxeVar;
        this.b = dvxeVar2;
        this.c = ffjmVar;
        this.d = i;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.a == null) {
            this.b.f.i();
        } else if (ffkj.e(this.b.f.d(), this.a)) {
            dvxe dvxeVar = this.a;
            dvxeVar.f.j(this.b);
        } else {
            this.c.a(Integer.valueOf(this.d), "CVE is already removed from parent");
        }
        return ffcu.a;
    }
}

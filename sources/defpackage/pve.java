package defpackage;

import android.net.NetworkRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pve extends ffhv implements ffjm {
    int a;
    final /* synthetic */ poj b;
    final /* synthetic */ pvf c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pve(poj pojVar, pvf pvfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = pojVar;
        this.c = pvfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pve) c((ffxe) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxe ffxeVar = (ffxe) this.d;
            NetworkRequest a = this.b.a();
            if (a == null) {
                ffxeVar.e(null);
                return ffcu.a;
            }
            pvd pvdVar = new pvd(ffqy.d(ffxeVar, null, null, new pvc(this.c, ffxeVar, null), 3), ffxeVar);
            ppt.c().a(pvq.a, "NetworkRequestConstraintController register callback");
            this.c.a.registerNetworkCallback(a, pvdVar);
            pvb pvbVar = new pvb(this.c, pvdVar);
            this.a = 1;
            if (ffxd.b(ffxeVar, pvbVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        pve pveVar = new pve(this.b, this.c, ffguVar);
        pveVar.d = obj;
        return pveVar;
    }
}

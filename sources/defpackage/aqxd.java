package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqxd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aqxe b;
    final /* synthetic */ aqvh c;
    final /* synthetic */ Optional d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqxd(ffgu ffguVar, aqxe aqxeVar, aqvh aqvhVar, Optional optional) {
        super(2, ffguVar);
        this.b = aqxeVar;
        this.c = aqvhVar;
        this.d = optional;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqxd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        aqxe aqxeVar = this.b;
        aqvh aqvhVar = this.c;
        Optional optional = this.d;
        this.a = 1;
        Object a = ffra.a(ekxi.a(aqxeVar.a), new aqxc(null, aqxeVar, aqvhVar, optional), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aqxd aqxdVar = new aqxd(ffguVar, this.b, this.c, this.d);
        aqxdVar.e = obj;
        return aqxdVar;
    }
}

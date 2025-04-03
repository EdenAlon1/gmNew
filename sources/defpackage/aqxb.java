package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqxb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aqxe b;
    final /* synthetic */ aqux c;
    final /* synthetic */ Optional d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqxb(ffgu ffguVar, aqxe aqxeVar, aqux aquxVar, Optional optional) {
        super(2, ffguVar);
        this.b = aqxeVar;
        this.c = aquxVar;
        this.d = optional;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqxb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        aqux aquxVar = this.c;
        Optional optional = this.d;
        this.a = 1;
        Object h = aqxeVar.h(aquxVar, optional, this);
        return h == ffhhVar ? ffhhVar : h;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aqxb aqxbVar = new aqxb(ffguVar, this.b, this.c, this.d);
        aqxbVar.e = obj;
        return aqxbVar;
    }
}

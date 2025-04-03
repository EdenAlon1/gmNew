package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awhb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ awhc b;
    final /* synthetic */ axaq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awhb(awhc awhcVar, axaq axaqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = awhcVar;
        this.c = axaqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awhb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        awhc awhcVar = this.b;
        axaq axaqVar = this.c;
        this.a = 1;
        ffrh ffrhVar = new ffrh(ffhi.c(this), 1);
        ffrhVar.B();
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        awhcVar.e.put(uuid, ffrhVar);
        ffrhVar.d(new awha(awhcVar, uuid));
        axol.m(awhcVar.c, new awgy(axaqVar, awhcVar, uuid, null));
        Object m = ffrhVar.m();
        return m == ffhhVar ? ffhhVar : m;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new awhb(this.b, this.c, ffguVar);
    }
}

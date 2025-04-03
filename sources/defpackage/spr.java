package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class spr extends ffhv implements ffjm {
    final /* synthetic */ spw a;
    final /* synthetic */ UUID b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spr(spw spwVar, UUID uuid, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = spwVar;
        this.b = uuid;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((spr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        sqf sqfVar = (sqf) this.a.g.b();
        axol.k(sqfVar.b, null, new sqe(sqfVar, this.b, null), 3);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new spr(this.a, this.b, ffguVar);
    }
}

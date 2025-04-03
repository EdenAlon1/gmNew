package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sqe extends ffhv implements ffjm {
    final /* synthetic */ sqf a;
    final /* synthetic */ UUID b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqe(sqf sqfVar, UUID uuid, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = sqfVar;
        this.b = uuid;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sqe) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        sqv sqvVar = (sqv) this.a.a.b();
        axol.k(sqvVar.b, null, new sqt(sqvVar, this.b, null), 3);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new sqe(this.a, this.b, ffguVar);
    }
}

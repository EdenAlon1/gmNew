package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cewd extends ffhv implements ffjm {
    final /* synthetic */ cewf a;
    final /* synthetic */ UUID b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cewd(cewf cewfVar, UUID uuid, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cewfVar;
        this.b = uuid;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cewd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.b.b(this.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cewd(this.a, this.b, ffguVar);
    }
}

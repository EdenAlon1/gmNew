package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqms extends ffhv implements ffjm {
    final /* synthetic */ aqmw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqms(aqmw aqmwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aqmwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqms) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (!this.a.d.B()) {
            return Optional.empty();
        }
        engw y = aqmw.d(this.a.d.o()).y();
        y.getClass();
        bont bontVar = (bont) ffdx.M(y);
        if (bontVar == null) {
            return Optional.empty();
        }
        return Optional.of(new aqmo(bontVar));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqms(this.a, ffguVar);
    }
}

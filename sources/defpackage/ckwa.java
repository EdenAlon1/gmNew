package defpackage;

import android.os.BatteryManager;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckwa extends ffhv implements ffjm {
    final /* synthetic */ ckwi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckwa(ckwi ckwiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ckwiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckwa) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(((long) ((BatteryManager) this.a.p.a()).getIntProperty(4)) < ((Number) this.a.l.b()).longValue());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ckwa(this.a, ffguVar);
    }
}

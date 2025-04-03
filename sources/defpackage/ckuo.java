package defpackage;

import android.os.BatteryManager;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckuo extends ffhv implements ffjm {
    final /* synthetic */ ckut a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckuo(ffgu ffguVar, ckut ckutVar) {
        super(2, ffguVar);
        this.a = ckutVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckuo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(((long) ((BatteryManager) this.a.i.a()).getIntProperty(4)) < ((Number) this.a.b.b()).longValue());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ckuo ckuoVar = new ckuo(ffguVar, this.a);
        ckuoVar.b = obj;
        return ckuoVar;
    }
}

package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqbc extends ffhv implements ffjm {
    final /* synthetic */ dpzw a;
    final /* synthetic */ Activity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqbc(dpzw dpzwVar, Activity activity, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dpzwVar;
        this.b = activity;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqbc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.b.invoke(this.b);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqbc(this.a, this.b, ffguVar);
    }
}

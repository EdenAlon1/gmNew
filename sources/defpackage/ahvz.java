package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahvz extends ffhv implements ffjm {
    final /* synthetic */ dsma a;
    final /* synthetic */ View b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahvz(dsma dsmaVar, View view, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dsmaVar;
        this.b = view;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahvz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        dsma dsmaVar = this.a;
        if (dsmaVar != null) {
            dsmaVar.f(this.b, false);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ahvz(this.a, this.b, ffguVar);
    }
}

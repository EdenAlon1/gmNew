package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwao extends ffhv implements ffjm {
    final /* synthetic */ hzi a;
    final /* synthetic */ dsma b;
    final /* synthetic */ View c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwao(hzi hziVar, dsma dsmaVar, View view, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = hziVar;
        this.b = dsmaVar;
        this.c = view;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwao) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.b();
        dsma dsmaVar = this.b;
        if (dsmaVar != null) {
            dsmaVar.f(this.c, false);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwao(this.a, this.b, this.c, ffguVar);
    }
}

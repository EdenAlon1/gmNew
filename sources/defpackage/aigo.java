package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aigo extends ffhv implements ffjm {
    final /* synthetic */ hzi a;
    final /* synthetic */ dsma b;
    final /* synthetic */ View c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aigo(hzi hziVar, dsma dsmaVar, View view, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = hziVar;
        this.b = dsmaVar;
        this.c = view;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aigo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        return new aigo(this.a, this.b, this.c, ffguVar);
    }
}

package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aigp extends ffhv implements ffjm {
    final /* synthetic */ lki a;
    final /* synthetic */ hzi b;
    final /* synthetic */ dsma c;
    final /* synthetic */ View d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aigp(lki lkiVar, hzi hziVar, dsma dsmaVar, View view, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = lkiVar;
        this.b = hziVar;
        this.c = dsmaVar;
        this.d = view;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aigp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (this.a == lki.ON_RESUME) {
            this.b.b();
            dsma dsmaVar = this.c;
            if (dsmaVar != null) {
                dsmaVar.f(this.d, false);
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aigp(this.a, this.b, this.c, this.d, ffguVar);
    }
}

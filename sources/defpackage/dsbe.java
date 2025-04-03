package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsbe extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dsbf b;
    final /* synthetic */ dsar c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsbe(dsbf dsbfVar, dsar dsarVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dsbfVar;
        this.c = dsarVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsbe) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dsbf dsbfVar = this.b;
            dsar dsarVar = this.c;
            dsbw f = dsbfVar.f();
            View view = dsbfVar.d;
            if (view == null) {
                ffkj.c("rootView");
                view = null;
            }
            this.a = 1;
            if (f.G(dsarVar, view, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsbe(this.b, this.c, ffguVar);
    }
}

package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eetc implements erqj {
    final /* synthetic */ eetf a;

    public eetc(eetf eetfVar) {
        this.a = eetfVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        eete eeteVar = this.a.b;
        if (eeteVar == null || !bool.booleanValue()) {
            return;
        }
        eeta eetaVar = (eeta) eeteVar;
        if (eetaVar.f.getVisibility() != 0) {
            eetaVar.g.setVisibility(0);
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        Log.e("FavoritePacksViewContr", "Error determine whether to show stickers favorites prompt", th);
    }
}

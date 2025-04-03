package defpackage;

import android.util.Log;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eetd implements erqj {
    final /* synthetic */ eetf a;

    public eetd(eetf eetfVar) {
        this.a = eetfVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List list = (List) obj;
        eete eeteVar = this.a.b;
        if (eeteVar != null) {
            eeta eetaVar = (eeta) eeteVar;
            eesu eesuVar = eetaVar.h;
            eesuVar.g.clear();
            eesuVar.g.addAll(list);
            eesuVar.f.clear();
            eesuVar.p();
            if (list.isEmpty()) {
                eetaVar.f();
            } else {
                eetaVar.d();
            }
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        Log.e("FavoritePacksViewContr", "Error fetching favorite sticker packs", th);
    }
}

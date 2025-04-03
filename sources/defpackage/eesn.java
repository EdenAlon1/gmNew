package defpackage;

import android.util.Log;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eesn implements erqj {
    final /* synthetic */ eesu a;

    public eesn(eesu eesuVar) {
        this.a = eesuVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ewnp ewnpVar = (ewnp) obj;
        if (!this.a.f.contains(ewnpVar.b)) {
            this.a.g.add(ewnpVar);
            this.a.s(r6.g.size() - 1);
            return;
        }
        this.a.f.remove(ewnpVar.b);
        ArrayList arrayList = new ArrayList();
        for (ewnp ewnpVar2 : this.a.g) {
            if (!this.a.f.contains(ewnpVar2.b)) {
                arrayList.add(ewnpVar2.b);
            }
        }
        this.a.a.o().d(arrayList);
        eesu eesuVar = this.a;
        eesuVar.q(eesuVar.g.indexOf(ewnpVar));
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        Log.e("FavoriteStickerPacksAda", "Failed to fetch sticker pack by pack name", th);
    }
}

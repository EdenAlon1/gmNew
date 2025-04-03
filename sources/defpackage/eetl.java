package defpackage;

import android.util.Log;
import java.util.Collections;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eetl implements erqj {
    final /* synthetic */ eetn a;

    public eetl(eetn eetnVar) {
        this.a = eetnVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ewni ewniVar = (ewni) obj;
        if (ewniVar.b.size() <= 0) {
            this.a.b.m(Collections.EMPTY_LIST);
            eetn eetnVar = this.a;
            eetnVar.a.b(eetnVar.f);
            return;
        }
        eetn eetnVar2 = this.a;
        eetnVar2.b.m(ewniVar.b);
        eeuc eeucVar = (eeuc) this.a.a;
        eeucVar.f.setVisibility(0);
        eeucVar.g.setVisibility(8);
        eeucVar.h.setVisibility(8);
        eeucVar.i.setVisibility(8);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        Log.w("SearchStickerController", "Search failed", th);
        this.a.b.m(Collections.EMPTY_LIST);
        eetn eetnVar = this.a;
        eetnVar.a.b(eetnVar.f);
        this.a.d.C();
    }
}

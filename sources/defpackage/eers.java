package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eers implements erqj {
    final /* synthetic */ String a;
    final /* synthetic */ eert b;

    public eers(eert eertVar, String str) {
        this.a = str;
        this.b = eertVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Log.i("ExpressiveStickerClient", "ListStickerPacks succeeded.");
        eeuj eeujVar = this.b.f;
        eeujVar.a = this.a;
        eeujVar.i(4);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        if (th instanceof CancellationException) {
            Log.d("ExpressiveStickerClient", "ListStickerPacks cancelled.");
            return;
        }
        Log.w("ExpressiveStickerClient", "ListStickerPacks failed.", th);
        eert eertVar = this.b;
        String str = this.a;
        eeuj eeujVar = eertVar.f;
        eeujVar.a = str;
        eeujVar.i(5);
    }
}

package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eerr implements erqj {
    final /* synthetic */ String a;
    final /* synthetic */ eert b;

    public eerr(eert eertVar, String str) {
        this.a = str;
        this.b = eertVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Log.v("ExpressiveStickerClient", "Sticker search succeeded.");
        eeuj eeujVar = this.b.f;
        eeujVar.a = this.a;
        eeujVar.i(22);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        if (th instanceof CancellationException) {
            Log.d("ExpressiveStickerClient", "Sticker search cancelled.", th);
            return;
        }
        Log.w("ExpressiveStickerClient", "Sticker search failed.", th);
        eert eertVar = this.b;
        String str = this.a;
        eeuj eeujVar = eertVar.f;
        eeujVar.a = str;
        eeujVar.i(23);
    }
}

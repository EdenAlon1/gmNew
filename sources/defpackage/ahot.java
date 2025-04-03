package defpackage;

import android.graphics.Bitmap;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahot implements erqj {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ ahou c;

    public ahot(ahou ahouVar, String str, int i) {
        this.a = str;
        this.b = i;
        this.c = ahouVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        if (this.c.b) {
            return;
        }
        synchronized (ahoz.b) {
            ahov ahovVar = (ahov) this.c.a.c.get();
            if (optional.isPresent() && ahovVar != null) {
                ahovVar.a(this.a, (Bitmap) optional.get(), this.b);
            }
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        if (!(th instanceof dfqu)) {
            throw new emyx(th);
        }
        if (this.c.b) {
            return;
        }
        ahoz.a.o("Failed to get photo for place by calling GetPhotoForPlace", th);
    }
}

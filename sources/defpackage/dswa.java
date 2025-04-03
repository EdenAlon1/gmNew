package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dswa {
    public boolean a;
    public Bitmap b;
    public final ffbz c = ffca.a(new ffix() { // from class: dsvz
        @Override // defpackage.ffix
        public final Object invoke() {
            dswa dswaVar = dswa.this;
            if (dswaVar.a) {
                return new iax(dswaVar.a());
            }
            throw new IllegalArgumentException("PausedFrameBitmap#setSize must be called before imageBitmap can be used");
        }
    });

    public final Bitmap a() {
        Bitmap bitmap = this.b;
        if (bitmap != null) {
            return bitmap;
        }
        ffkj.c("bitmap");
        return null;
    }
}

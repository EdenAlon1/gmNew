package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rco implements qtw {
    private final qxf a = new qxg();

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ qwv a(Object obj, int i, int i2, qtu qtuVar) {
        return c(od$$ExternalSyntheticApiModelOutline0.m(obj), i, i2, qtuVar);
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ boolean b(Object obj, qtu qtuVar) {
        od$$ExternalSyntheticApiModelOutline0.m(obj);
        return true;
    }

    public final qwv c(ImageDecoder.Source source, int i, int i2, qtu qtuVar) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new rci(i, i2, qtuVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new rcp(decodeBitmap, this.a);
    }
}

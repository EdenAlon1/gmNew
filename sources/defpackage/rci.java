package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rci implements ImageDecoder$OnHeaderDecodedListener {
    private final rdv a = rdv.a();
    private final int b;
    private final int c;
    private final qsz d;
    private final rdi e;
    private final boolean f;
    private final qtv g;

    public rci(int i, int i2, qtu qtuVar) {
        this.b = i;
        this.c = i2;
        this.d = (qsz) qtuVar.b(rdl.a);
        this.e = (rdi) qtuVar.b(rdi.h);
        boolean z = false;
        if (qtuVar.b(rdl.d) != null && ((Boolean) qtuVar.b(rdl.d)).booleanValue()) {
            z = true;
        }
        this.f = z;
        this.g = (qtv) qtuVar.b(rdl.b);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace.Named named2;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        if (this.a.b(this.b, this.c, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == qsz.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new rch());
        size = imageInfo.getSize();
        int i = this.b;
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        int i2 = this.c;
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float a = this.e.a(size.getWidth(), size.getHeight(), i, i2);
        int round = Math.round(size.getWidth() * a);
        int round2 = Math.round(size.getHeight() * a);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + a);
        }
        imageDecoder.setTargetSize(round, round2);
        if (this.g != null) {
            if (Build.VERSION.SDK_INT < 28) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                imageDecoder.setTargetColorSpace(colorSpace);
                return;
            }
            if (this.g == qtv.DISPLAY_P3) {
                colorSpace3 = imageInfo.getColorSpace();
                if (colorSpace3 != null) {
                    colorSpace4 = imageInfo.getColorSpace();
                    isWideGamut = colorSpace4.isWideGamut();
                    if (isWideGamut) {
                        named2 = ColorSpace.Named.DISPLAY_P3;
                        colorSpace2 = ColorSpace.get(named2);
                        imageDecoder.setTargetColorSpace(colorSpace2);
                    }
                }
            }
            named2 = ColorSpace.Named.SRGB;
            colorSpace2 = ColorSpace.get(named2);
            imageDecoder.setTargetColorSpace(colorSpace2);
        }
    }
}

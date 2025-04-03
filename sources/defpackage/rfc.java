package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rfc {
    public final List a;
    public final qxd b;

    public rfc(List list, qxd qxdVar) {
        this.a = list;
        this.b = qxdVar;
    }

    static final qwv a(ImageDecoder.Source source, int i, int i2, qtu qtuVar) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new rci(i, i2, qtuVar));
        if (od$$ExternalSyntheticApiModelOutline0.m$2(decodeDrawable)) {
            return new rez(od$$ExternalSyntheticApiModelOutline0.m496m((Object) decodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: ".concat(String.valueOf(String.valueOf(decodeDrawable))));
    }

    public static final boolean b(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        return true;
    }
}

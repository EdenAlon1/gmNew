package defpackage;

import android.media.MediaCodec;
import android.util.LruCache;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class can {
    public static final LruCache a = new LruCache(10);

    public static MediaCodec a(String str) {
        try {
            return MediaCodec.createEncoderByType(str);
        } catch (IOException | IllegalArgumentException e) {
            throw new cad(e);
        }
    }
}

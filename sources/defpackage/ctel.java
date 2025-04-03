package defpackage;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctel {
    public final MediaMetadataRetriever a = new MediaMetadataRetriever();
    private final Context b;

    public ctel(Context context) {
        this.b = context;
    }

    public static Object c(Context context, Uri uri, emwl emwlVar, Object obj) {
        return new ctel(context).b(uri, emwlVar, obj);
    }

    public final int a(int i, int i2) {
        String extractMetadata = this.a.extractMetadata(i);
        return TextUtils.isEmpty(extractMetadata) ? i2 : Integer.parseInt(extractMetadata);
    }

    public final Object b(Uri uri, emwl emwlVar, Object obj) {
        try {
            try {
                try {
                    this.a.setDataSource(this.b, uri);
                    obj = emwlVar.apply(this);
                } catch (RuntimeException e) {
                    d();
                    throw new IOException(e);
                }
            } catch (IOException e2) {
                ((ensz) ((ensz) ((ensz) ctfm.a.i()).g(e2)).h("com/google/android/apps/messaging/shared/util/media/video/MediaMetadataRetrieverWrapper", "extractMetadata", 'B', "MediaMetadataRetrieverWrapper.java")).q("Error extracting metadata");
            }
            d();
            return obj;
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    public final void d() {
        try {
            this.a.release();
        } catch (Exception e) {
            ((ensz) ((ensz) ((ensz) ctfm.a.i()).g(e)).h("com/google/android/apps/messaging/shared/util/media/video/MediaMetadataRetrieverWrapper", "release", ']', "MediaMetadataRetrieverWrapper.java")).q("MediaMetadataRetriever.release failed");
        }
    }
}

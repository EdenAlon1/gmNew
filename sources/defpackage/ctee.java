package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctee {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/media/common/MediaMetadataRetrieverWrapper");
    private final MediaMetadataRetriever b = new MediaMetadataRetriever();
    private final Context c;

    public ctee(Context context) {
        this.c = context;
    }

    public final Bitmap a(long j) {
        return this.b.getFrameAtTime(j);
    }

    public final void b() {
        try {
            this.b.release();
        } catch (Exception e) {
            ensk i = a.i();
            i.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/shared/util/media/common/MediaMetadataRetrieverWrapper", "release", 'N', "MediaMetadataRetrieverWrapper.java")).q("MediaMetadataRetriever.release failed");
        }
    }

    public final void c(Uri uri) {
        try {
            this.b.setDataSource(this.c, uri);
        } catch (RuntimeException e) {
            b();
            throw new IOException(e);
        }
    }

    public final long d(long j) {
        String extractMetadata = this.b.extractMetadata(9);
        return TextUtils.isEmpty(extractMetadata) ? j : Long.parseLong(extractMetadata);
    }

    public final String e() {
        return this.b.extractMetadata(12);
    }
}

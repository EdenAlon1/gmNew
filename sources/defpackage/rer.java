package defpackage;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rer implements res {
    @Override // defpackage.res
    public final /* bridge */ /* synthetic */ void a(MediaExtractor mediaExtractor, Object obj) {
        mediaExtractor.setDataSource(new req((ByteBuffer) obj));
    }

    @Override // defpackage.res
    public final /* bridge */ /* synthetic */ void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(new req((ByteBuffer) obj));
    }
}

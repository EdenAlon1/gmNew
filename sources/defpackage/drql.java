package defpackage;

import android.media.MediaMetadataRetriever;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drql extends drqk {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drql(ffsk ffskVar) {
        super(ffskVar);
        ffskVar.getClass();
    }

    @Override // defpackage.drqk
    public final /* bridge */ /* synthetic */ drpy a(MediaMetadataRetriever mediaMetadataRetriever) {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
        if (extractMetadata == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int parseInt = Integer.parseInt(extractMetadata);
        if (parseInt <= 0) {
            throw new IllegalArgumentException("Video width resolved to non positive value.");
        }
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
        if (extractMetadata2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int parseInt2 = Integer.parseInt(extractMetadata2);
        if (parseInt2 <= 0) {
            throw new IllegalArgumentException("Video height resolved to non positive value.");
        }
        String extractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
        return new drpx(c(mediaMetadataRetriever), dqkt.a(new Size(parseInt, parseInt2), extractMetadata3 != null ? Integer.parseInt(extractMetadata3) : 0), d(mediaMetadataRetriever));
    }
}

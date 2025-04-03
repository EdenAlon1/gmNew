package defpackage;

import android.media.MediaMetadataRetriever;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class drqk {
    private static final enru a = enru.c("com/google/android/libraries/compose/media/metadata/MediaMetadataRetrieverResolver");
    private final ffsk b;

    public drqk(ffsk ffskVar) {
        this.b = ffskVar;
    }

    protected static final Instant c(MediaMetadataRetriever mediaMetadataRetriever) {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(5);
        if (extractMetadata != null) {
            try {
                return Instant.parse(extractMetadata);
            } catch (Exception e) {
                ((enrr) ((enrr) a.j()).g(e).h("com/google/android/libraries/compose/media/metadata/MediaMetadataRetrieverResolver", "extractDateModifiedFromMetadata", 35, "MediaMetadataRetrieverResolver.kt")).t("Unable to parse non-standard video date %s", extractMetadata);
            }
        }
        return null;
    }

    protected static final Duration d(MediaMetadataRetriever mediaMetadataRetriever) {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        if (extractMetadata == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Duration ofMillis = Duration.ofMillis(Long.parseLong(extractMetadata));
        ofMillis.getClass();
        return ofMillis;
    }

    protected abstract drpy a(MediaMetadataRetriever mediaMetadataRetriever);

    public final Object b(ffji ffjiVar, ffgu ffguVar) {
        return ffra.a(this.b.hT(), new drqj(ffjiVar, this, null), ffguVar);
    }
}

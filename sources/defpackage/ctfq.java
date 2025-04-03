package defpackage;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctfq implements ffji {
    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MediaExtractor mediaExtractor = (MediaExtractor) obj;
        mediaExtractor.getClass();
        MediaFormat c = ctfu.c(mediaExtractor);
        if (c == null) {
            throw new ctfk("Could not determine video duration");
        }
        long j = c.getLong("durationUs");
        if (j > 0) {
            return Duration.ofMillis(j / TimeUnit.MILLISECONDS.toMicros(1L));
        }
        mediaExtractor.seekTo(0L, 0);
        long j2 = 0;
        while (mediaExtractor.advance()) {
            long sampleTime = mediaExtractor.getSampleTime();
            if (sampleTime > 0) {
                j2 = sampleTime;
            }
        }
        mediaExtractor.seekTo(0L, 0);
        if (j2 > 0) {
            return Duration.ofMillis(j2 / TimeUnit.MILLISECONDS.toMicros(1L));
        }
        throw new ctfk(a.s(j2, "Could not determine video duration lastSampleTimeUs: "));
    }
}

package defpackage;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctfs implements ffji {
    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MediaExtractor mediaExtractor = (MediaExtractor) obj;
        mediaExtractor.getClass();
        MediaFormat c = ctfu.c(mediaExtractor);
        if (c != null) {
            return (c.containsKey("rotation-degrees") ? c.getInteger("rotation-degrees") : 0) % 180 == 0 ? new Size(c.getInteger("width"), c.getInteger("height")) : new Size(c.getInteger("height"), c.getInteger("width"));
        }
        return null;
    }
}

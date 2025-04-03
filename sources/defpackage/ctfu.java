package defpackage;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctfu {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/util/media/video/transformer/MetadataExtractor");
    public final ffhd a;
    private final Context c;

    public ctfu(Context context, ffhd ffhdVar) {
        context.getClass();
        ffhdVar.getClass();
        this.c = context;
        this.a = ffhdVar;
    }

    public static final MediaFormat c(MediaExtractor mediaExtractor) {
        ctft ctftVar = ctft.a;
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
            trackFormat.getClass();
            if (((Boolean) ctftVar.invoke(trackFormat.getString("mime"))).booleanValue()) {
                ensk h = b.h();
                h.Y(ente.a, "BugleTranscoding");
                ((enrr) h.h("com/google/android/apps/messaging/shared/util/media/video/transformer/MetadataExtractor", "selectFirstTrackByType", 100, "MetadataExtractor.kt")).w("format for track %s is %s", i, trackFormat);
                mediaExtractor.selectTrack(i);
                return trackFormat;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.net.Uri r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ctfp
            if (r0 == 0) goto L13
            r0 = r7
            ctfp r0 = (defpackage.ctfp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ctfp r0 = new ctfp
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r7)
            ffhd r7 = r5.a
            ffhd r7 = defpackage.ekxi.a(r7)
            ctfo r2 = new ctfo
            r4 = 0
            r2.<init>(r4, r5, r6)
            r0.c = r3
            java.lang.Object r7 = defpackage.ffra.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctfu.a(android.net.Uri, ffgu):java.lang.Object");
    }

    public final Object b(Uri uri, ffji ffjiVar) {
        MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(this.c, uri, (Map<String, String>) null);
        try {
            try {
                return ffjiVar.invoke(mediaExtractor);
            } catch (IOException e) {
                throw new ctfk("Error during setDataSource for MediaExtractor", e);
            }
        } finally {
            mediaExtractor.release();
        }
    }
}

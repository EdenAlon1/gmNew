package defpackage;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.PersistableBundle;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class shg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ shh b;
    final /* synthetic */ Uri c;
    final /* synthetic */ MessagePartCoreData d;
    final /* synthetic */ MessageCoreData e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public shg(shh shhVar, Uri uri, MessagePartCoreData messagePartCoreData, MessageCoreData messageCoreData, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = shhVar;
        this.c = uri;
        this.d = messagePartCoreData;
        this.e = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((shg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        shh shhVar;
        MediaExtractor mediaExtractor;
        PersistableBundle metrics;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            try {
                shhVar = this.b;
                Uri uri = this.c;
                mediaExtractor = new MediaExtractor();
                try {
                    mediaExtractor.setDataSource(shhVar.c, uri, (Map<String, String>) null);
                    metrics = mediaExtractor.getMetrics();
                } catch (Exception e) {
                    mediaExtractor.release();
                    throw e;
                }
            } catch (Exception e2) {
                ((ensz) ((ensz) shh.b.i()).g(e2)).q("Failed to multiplex magic metadata.");
                shh shhVar2 = this.b;
                Uri uri2 = this.c;
                String aa = this.d.aa();
                aa.getClass();
                MessageIdType B = this.e.B();
                B.getClass();
                shhVar2.l(uri2, aa, B);
                this.b.k("Bugle.MultiplexedMetadata.Sent.Invalid.Count", this.e.cX());
            }
            if (!ffkj.e("audio/mp4", metrics.getString("android.media.mediaextractor.mime"))) {
                throw new UnsupportedOperationException();
            }
            Uri d = cbgi.d("m4a", shhVar.c);
            ffcf ffcfVar = new ffcf(new MediaMuxer(cbgi.i(d, shhVar.c).getPath(), 0), d);
            MediaMuxer mediaMuxer = (MediaMuxer) ffcfVar.a;
            Uri uri3 = (Uri) ffcfVar.b;
            try {
                int trackCount = mediaExtractor.getTrackCount();
                for (int i2 = 0; i2 < trackCount; i2++) {
                    if (ffkj.e("application/am-mm-validation", mediaExtractor.getTrackFormat(i2).getString("mime"))) {
                        throw new UnsupportedOperationException();
                    }
                    mediaExtractor.selectTrack(i2);
                    mediaMuxer.addTrack(mediaExtractor.getTrackFormat(i2));
                }
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", "application/am-mm-validation");
                int addTrack = mediaMuxer.addTrack(mediaFormat);
                mediaMuxer.start();
                ByteBuffer wrap = ByteBuffer.wrap(shh.a);
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                bufferInfo.offset = 0;
                bufferInfo.size = 8;
                bufferInfo.presentationTimeUs = 0L;
                bufferInfo.flags = 4;
                mediaMuxer.writeSampleData(addTrack, wrap, bufferInfo);
                ByteBuffer allocate = ByteBuffer.allocate(4096);
                do {
                    int readSampleData = mediaExtractor.readSampleData(allocate, 0);
                    if (readSampleData > 0) {
                        int sampleTrackIndex = mediaExtractor.getSampleTrackIndex();
                        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                        bufferInfo2.offset = 0;
                        bufferInfo2.size = readSampleData;
                        bufferInfo2.presentationTimeUs = mediaExtractor.getSampleTime();
                        bufferInfo2.flags = 0;
                        mediaMuxer.writeSampleData(sampleTrackIndex, allocate, bufferInfo2);
                    }
                } while (mediaExtractor.advance());
                mediaMuxer.release();
                mediaExtractor.release();
                uri3.getClass();
                String aa2 = this.d.aa();
                aa2.getClass();
                MessageIdType B2 = this.e.B();
                B2.getClass();
                shhVar.l(uri3, aa2, B2);
                cbgi.j(this.b.c, this.c);
                this.b.k("Bugle.MultiplexedMetadata.Sent.Valid.Count", this.e.cX());
                ListenableFuture t = this.b.e.b(6).t();
                this.a = 1;
                if (fgfz.c(t, this) == ffhhVar) {
                    return ffhhVar;
                }
            } catch (Throwable th) {
                mediaMuxer.release();
                mediaExtractor.release();
                throw th;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new shg(this.b, this.c, this.d, this.e, ffguVar);
    }
}

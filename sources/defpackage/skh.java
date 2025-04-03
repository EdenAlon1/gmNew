package defpackage;

import android.content.res.AssetFileDescriptor;
import android.media.MediaCodec;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.view.Surface;
import j$.time.Duration;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skh extends ffhv implements ffjm {
    final /* synthetic */ skj a;
    final /* synthetic */ Uri b;
    final /* synthetic */ eepm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skh(ffgu ffguVar, skj skjVar, Uri uri, eepm eepmVar) {
        super(2, ffguVar);
        this.a = skjVar;
        this.b = uri;
        this.c = eepmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((skh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        skj skjVar = this.a;
        if (skjVar.c()) {
            throw new IllegalStateException("This instance has already been prepared");
        }
        AssetFileDescriptor a = eepn.a(skjVar.a, this.b, "r", this.c);
        try {
            this.a.c = new MediaExtractor();
            MediaExtractor mediaExtractor = this.a.c;
            MediaCodec mediaCodec = null;
            if (mediaExtractor == null) {
                ffkj.c("mediaExtractor");
                mediaExtractor = null;
            }
            mediaExtractor.setDataSource(a.getFileDescriptor());
            ffig.a(a, null);
            MediaExtractor mediaExtractor2 = this.a.c;
            if (mediaExtractor2 == null) {
                ffkj.c("mediaExtractor");
                mediaExtractor2 = null;
            }
            int trackCount = mediaExtractor2.getTrackCount();
            for (int i = 0; i < trackCount; i++) {
                MediaFormat trackFormat = mediaExtractor2.getTrackFormat(i);
                trackFormat.getClass();
                String string = trackFormat.getString("mime");
                if (string != null && ffpc.t(string, "audio")) {
                    ffcf ffcfVar = new ffcf(Integer.valueOf(i), trackFormat);
                    int intValue = ((Number) ffcfVar.a).intValue();
                    MediaFormat mediaFormat = (MediaFormat) ffcfVar.b;
                    MediaExtractor mediaExtractor3 = this.a.c;
                    if (mediaExtractor3 == null) {
                        ffkj.c("mediaExtractor");
                        mediaExtractor3 = null;
                    }
                    mediaExtractor3.selectTrack(intValue);
                    skj skjVar2 = this.a;
                    String findDecoderForFormat = new MediaCodecList(0).findDecoderForFormat(mediaFormat);
                    if (findDecoderForFormat == null) {
                        throw new IOException("Unable to find audio decoder for ".concat(String.valueOf(mediaFormat.getString("mime"))));
                    }
                    MediaCodec createByCodecName = MediaCodec.createByCodecName(findDecoderForFormat);
                    createByCodecName.getClass();
                    skjVar2.d = createByCodecName;
                    MediaCodec mediaCodec2 = this.a.d;
                    if (mediaCodec2 == null) {
                        ffkj.c("mediaCodec");
                        mediaCodec2 = null;
                    }
                    mediaCodec2.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
                    int integer = mediaFormat.getInteger("sample-rate");
                    int integer2 = mediaFormat.getInteger("channel-count");
                    Duration c = ernk.c(mediaFormat.getLong("durationUs"));
                    MediaCodec mediaCodec3 = this.a.d;
                    if (mediaCodec3 == null) {
                        ffkj.c("mediaCodec");
                    } else {
                        mediaCodec = mediaCodec3;
                    }
                    String name = mediaCodec.getCodecInfo().getName();
                    name.getClass();
                    return new skk(integer, integer2, c, name);
                }
            }
            throw new IOException("File does not contain an audio track");
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        skh skhVar = new skh(ffguVar, this.a, this.b, this.c);
        skhVar.d = obj;
        return skhVar;
    }
}

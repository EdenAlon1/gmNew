package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpbn {
    public static final MediaCodec a(MediaFormat mediaFormat) {
        String findEncoderForFormat = new MediaCodecList(0).findEncoderForFormat(mediaFormat);
        if (findEncoderForFormat == null) {
            throw new IOException("Unable to find audio encoder for ".concat(String.valueOf(mediaFormat.getString("mime"))));
        }
        MediaCodec createByCodecName = MediaCodec.createByCodecName(findEncoderForFormat);
        createByCodecName.getClass();
        return createByCodecName;
    }
}

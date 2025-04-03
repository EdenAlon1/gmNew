package defpackage;

import android.media.MediaCodecInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class caa implements bzz {
    protected final MediaCodecInfo.CodecCapabilities a;

    public caa(MediaCodecInfo mediaCodecInfo, String str) {
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            capabilitiesForType.getClass();
            this.a = capabilitiesForType;
        } catch (RuntimeException e) {
            throw new cad("Unable to get CodecCapabilities for mime: ".concat(String.valueOf(str)), e);
        }
    }
}

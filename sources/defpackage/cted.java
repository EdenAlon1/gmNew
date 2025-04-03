package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cted {
    public static final boolean a(String str, boolean z) {
        Iterator a = ffjw.a(new MediaCodecList(1).getCodecInfos());
        while (a.hasNext()) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) a.next();
            if (mediaCodecInfo.isEncoder() == z) {
                Iterator a2 = ffjw.a(mediaCodecInfo.getSupportedTypes());
                while (a2.hasNext()) {
                    if (ffkj.e((String) a2.next(), str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cam extends caa implements cak {
    public static final afd b = new afd() { // from class: cal
        @Override // defpackage.afd
        public final Object a(Object obj) {
            MediaCodecInfo mediaCodecInfo;
            MediaCodec mediaCodec;
            cah cahVar = (cah) obj;
            try {
                LruCache lruCache = can.a;
                String g = cahVar.g();
                synchronized (can.a) {
                    mediaCodecInfo = (MediaCodecInfo) can.a.get(g);
                }
                if (mediaCodecInfo == null) {
                    try {
                        mediaCodec = can.a(g);
                    } catch (Throwable th) {
                        th = th;
                        mediaCodec = null;
                    }
                    try {
                        mediaCodecInfo = mediaCodec.getCodecInfo();
                        synchronized (can.a) {
                            can.a.put(g, mediaCodecInfo);
                        }
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw th;
                    }
                }
                return cav.j(new cam(mediaCodecInfo, cahVar.g()), null);
            } catch (cad e) {
                avw.g("VideoEncoderInfoImpl", "Unable to find a VideoEncoderInfoImpl", e);
                return null;
            }
        }
    };
    private final MediaCodecInfo.VideoCapabilities c;

    public cam(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.a.getVideoCapabilities();
        videoCapabilities.getClass();
        this.c = videoCapabilities;
    }

    private static IllegalArgumentException j(Throwable th) {
        return th instanceof IllegalArgumentException ? (IllegalArgumentException) th : new IllegalArgumentException(th);
    }

    @Override // defpackage.cak
    public final int a() {
        return this.c.getHeightAlignment();
    }

    @Override // defpackage.cak
    public final int b() {
        return this.c.getWidthAlignment();
    }

    @Override // defpackage.cak
    public final Range c() {
        return this.c.getBitrateRange();
    }

    @Override // defpackage.cak
    public final Range d() {
        return this.c.getSupportedHeights();
    }

    @Override // defpackage.cak
    public final Range e(int i) {
        try {
            return this.c.getSupportedHeightsFor(i);
        } catch (Throwable th) {
            throw j(th);
        }
    }

    @Override // defpackage.cak
    public final Range f() {
        return this.c.getSupportedWidths();
    }

    @Override // defpackage.cak
    public final Range g(int i) {
        try {
            return this.c.getSupportedWidthsFor(i);
        } catch (Throwable th) {
            throw j(th);
        }
    }

    @Override // defpackage.cak
    public final boolean h(int i, int i2) {
        return this.c.isSizeSupported(i, i2);
    }

    @Override // defpackage.cak
    public final /* synthetic */ boolean i(int i, int i2) {
        return caj.a(this, i, i2);
    }
}

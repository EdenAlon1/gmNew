package defpackage;

import android.media.MediaMuxer;
import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nrk implements nrt {
    public static final engw a;
    public static final engw b;
    public final MediaMuxer c;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public boolean f;
    public boolean g;

    static {
        int i = lvf.a;
        engr engrVar = new engr();
        engrVar.i("video/avc", "video/3gpp", "video/mp4v-es");
        engrVar.h("video/hevc");
        if (lvf.a >= 33) {
            engrVar.h("video/dolby-vision");
        }
        if (lvf.a >= 34) {
            engrVar.h("video/av01");
        }
        a = engrVar.g();
        b = engw.t("audio/mp4a-latm", "audio/3gpp", "audio/amr-wb");
    }

    public nrk(MediaMuxer mediaMuxer) {
        this.c = mediaMuxer;
    }

    public final void a() {
        try {
            this.c.start();
            this.f = true;
        } catch (RuntimeException e) {
            throw new noz("Failed to start the muxer", e);
        }
    }
}

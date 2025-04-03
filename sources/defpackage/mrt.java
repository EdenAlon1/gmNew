package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mrt {
    public MediaCodecInfo[] a;
    private final int b;

    public mrt(boolean z, boolean z2, boolean z3) {
        int i = 1;
        if (!z && !z2 && !z3) {
            i = 0;
        }
        this.b = i;
    }

    public final void a() {
        if (this.a == null) {
            this.a = new MediaCodecList(this.b).getCodecInfos();
        }
    }
}

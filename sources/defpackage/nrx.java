package defpackage;

import android.media.MediaCodec;
import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nrx {
    public static final long a = lvf.u(500);
    public final String b;
    public final nrs c;
    public final nrv d;
    public final SparseArray e;
    public final MediaCodec.BufferInfo f;
    public boolean g;
    public boolean h;
    public int i;
    public long j;
    public long k;
    public long l;
    public nrt m;
    public long n;
    public volatile int o;
    public volatile int p;

    public nrx(String str, nrs nrsVar, nrv nrvVar) {
        this.b = str;
        this.c = nrsVar;
        this.d = nrvVar;
        lti.a(true);
        lti.b(true, "appendVideoFormat must be present if and only if muxerMode is MUXER_MODE_MUX_PARTIAL.");
        this.e = new SparseArray();
        this.i = -2;
        this.n = -9223372036854775807L;
        this.k = Long.MAX_VALUE;
        this.f = new MediaCodec.BufferInfo();
    }

    public static nrw a(SparseArray sparseArray) {
        if (sparseArray.size() == 0) {
            return null;
        }
        nrw nrwVar = (nrw) sparseArray.valueAt(0);
        for (int i = 1; i < sparseArray.size(); i++) {
            nrw nrwVar2 = (nrw) sparseArray.valueAt(i);
            if (nrwVar2.f < nrwVar.f) {
                nrwVar = nrwVar2;
            }
        }
        return nrwVar;
    }

    public final engw b(int i) {
        return this.c.a(i);
    }

    public final boolean c(String str) {
        return b(lre.b(str)).contains(str);
    }
}

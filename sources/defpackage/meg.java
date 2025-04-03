package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class meg {
    public final mxt a;
    public final long b;
    public final long c;
    public final long d;
    public final HashMap e;
    public long f;
    private final long g;
    private final long h;

    public meg() {
        this(new mxt(), 50000, 50000, 1000, 2000);
    }

    public static void b(int i, int i2, String str, String str2) {
        lti.b(i >= i2, a.w(str2, str, " cannot be less than "));
    }

    final int a() {
        Iterator it = this.e.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((mef) it.next()).b;
        }
        return i;
    }

    public final void c(mlu mluVar) {
        if (this.e.remove(mluVar) != null) {
            d();
        }
    }

    public final void d() {
        if (this.e.isEmpty()) {
            this.a.d();
        } else {
            this.a.e(a());
        }
    }

    public final boolean e(mha mhaVar) {
        mef mefVar = (mef) this.e.get(mhaVar.a);
        lti.f(mefVar);
        long j = this.g;
        float f = mhaVar.c;
        int a = this.a.a();
        int a2 = a();
        if (f > 1.0f) {
            j = Math.min(lvf.s(j, f), this.h);
        }
        long j2 = mhaVar.b;
        if (j2 < Math.max(j, 500000L)) {
            boolean z = a < a2;
            mefVar.a = z;
            if (!z && j2 < 500000) {
                luj.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.h || a >= a2) {
            mefVar.a = false;
        }
        return mefVar.a;
    }

    protected meg(mxt mxtVar, int i, int i2, int i3, int i4) {
        b(i3, 0, "bufferForPlaybackMs", "0");
        b(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        b(i, i3, "minBufferMs", "bufferForPlaybackMs");
        b(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        b(i2, i, "maxBufferMs", "minBufferMs");
        b(0, 0, "backBufferDurationMs", "0");
        this.a = mxtVar;
        this.g = lvf.u(i);
        this.h = lvf.u(i2);
        this.b = lvf.u(i3);
        this.c = lvf.u(i4);
        this.d = lvf.u(0L);
        this.e = new HashMap();
        this.f = -1L;
    }
}

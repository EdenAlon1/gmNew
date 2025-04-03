package defpackage;

import android.media.metrics.LogSessionId;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mlu {
    public final String a;
    private final mlt b;
    private final Object c;

    static {
        new mlu("");
    }

    public mlu(String str) {
        this.a = str;
        this.b = lvf.a >= 31 ? new mlt() : null;
        this.c = new Object();
    }

    public final synchronized LogSessionId a() {
        mlt mltVar;
        mltVar = this.b;
        lti.f(mltVar);
        return mltVar.a;
    }

    public final synchronized void b(LogSessionId logSessionId) {
        LogSessionId logSessionId2;
        boolean equals;
        mlt mltVar = this.b;
        lti.f(mltVar);
        LogSessionId logSessionId3 = mltVar.a;
        logSessionId2 = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId3.equals(logSessionId2);
        lti.c(equals);
        mltVar.a = logSessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlu)) {
            return false;
        }
        mlu mluVar = (mlu) obj;
        return Objects.equals(this.a, mluVar.a) && Objects.equals(this.b, mluVar.b) && Objects.equals(this.c, mluVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}

package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhc {
    public final bgk a;
    public final bhh b;
    public final bgr c;
    public final List d;
    public boolean e = false;
    public boolean f = false;

    public bhc(bgk bgkVar, bhh bhhVar, bgr bgrVar, List list) {
        this.a = bgkVar;
        this.b = bhhVar;
        this.c = bgrVar;
        this.d = list;
    }

    public final String toString() {
        return "UseCaseAttachInfo{mSessionConfig=" + this.a + ", mUseCaseConfig=" + this.b + ", mStreamSpec=" + this.c + ", mCaptureTypes=" + this.d + ", mAttached=" + this.e + ", mActive=" + this.f + '}';
    }
}

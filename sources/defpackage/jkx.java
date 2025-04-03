package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jkx extends ffkk implements ffix {
    final /* synthetic */ jky a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkx(jky jkyVar) {
        super(0);
        this.a = jkyVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.a.d = null;
        Trace.beginSection("OnPositionedDispatch");
        try {
            this.a.a();
            Trace.endSection();
            return ffcu.a;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}

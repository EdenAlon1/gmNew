package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqc {
    public static final bqc a = new bqc(new bpx());
    public final bpx b;

    private bqc(bpx bpxVar) {
        this.b = bpxVar;
    }

    public final void a() {
        this.b.c();
    }

    public final boolean b(atl atlVar) {
        boolean z;
        ozg.a("CX:hasCamera");
        try {
            atu atuVar = this.b.e;
            atuVar.getClass();
            atlVar.a(atuVar.c.a());
            z = true;
        } catch (IllegalArgumentException unused) {
            z = false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
        Trace.endSection();
        return z;
    }
}

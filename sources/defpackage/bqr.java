package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqr extends bsv {
    public final brg a;
    public final boolean b;
    public final long c;
    private final Executor j;
    private final ksp k;

    public bqr(brg brgVar, Executor executor, ksp kspVar, boolean z, long j) {
        this.a = brgVar;
        this.j = executor;
        this.k = kspVar;
        this.b = z;
        this.c = j;
    }

    @Override // defpackage.bsv
    public final long a() {
        return this.c;
    }

    @Override // defpackage.bsv
    public final brg b() {
        return this.a;
    }

    @Override // defpackage.bsv
    public final ksp c() {
        return this.k;
    }

    @Override // defpackage.bsv
    public final Executor d() {
        return this.j;
    }

    @Override // defpackage.bsv
    public final boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Executor executor;
        ksp kspVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bsv) {
            bsv bsvVar = (bsv) obj;
            if (this.a.equals(bsvVar.b()) && ((executor = this.j) != null ? executor.equals(bsvVar.d()) : bsvVar.d() == null) && ((kspVar = this.k) != null ? kspVar.equals(bsvVar.c()) : bsvVar.c() == null) && this.b == bsvVar.e()) {
                bsvVar.f();
                if (this.c == bsvVar.a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        Executor executor = this.j;
        int hashCode2 = ((hashCode * 1000003) ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        ksp kspVar = this.k;
        int hashCode3 = (hashCode2 ^ (kspVar != null ? kspVar.hashCode() : 0)) * 1000003;
        int i = true != this.b ? 1237 : 1231;
        long j = this.c;
        return ((((hashCode3 ^ i) * 1000003) ^ 1237) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "RecordingRecord{getOutputOptions=" + this.a + ", getCallbackExecutor=" + this.j + ", getEventListener=" + this.k + ", hasAudioEnabled=" + this.b + ", isPersistent=false, getRecordingId=" + this.c + "}";
    }

    @Override // defpackage.bsv
    public final void f() {
    }
}

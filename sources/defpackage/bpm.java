package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpm implements bcd {
    private final bcd a;
    private final bgw b;
    private final long c;

    public bpm(bcd bcdVar, bgw bgwVar, long j) {
        this.a = bcdVar;
        this.b = bgwVar;
        this.c = j;
    }

    @Override // defpackage.bcd
    public final long a() {
        bcd bcdVar = this.a;
        if (bcdVar != null) {
            return bcdVar.a();
        }
        long j = this.c;
        if (j != -1) {
            return j;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // defpackage.bcd
    public final /* synthetic */ CaptureResult b() {
        return null;
    }

    @Override // defpackage.bcd
    public final bby c() {
        bcd bcdVar = this.a;
        return bcdVar != null ? bcdVar.c() : bby.UNKNOWN;
    }

    @Override // defpackage.bcd
    public final bbz d() {
        bcd bcdVar = this.a;
        return bcdVar != null ? bcdVar.d() : bbz.UNKNOWN;
    }

    @Override // defpackage.bcd
    public final bca e() {
        bcd bcdVar = this.a;
        return bcdVar != null ? bcdVar.e() : bca.UNKNOWN;
    }

    @Override // defpackage.bcd
    public final bgw f() {
        return this.b;
    }

    @Override // defpackage.bcd
    public final /* synthetic */ void g(bif bifVar) {
        bcb.a(this, bifVar);
    }

    @Override // defpackage.bcd
    public final int h() {
        throw null;
    }

    @Override // defpackage.bcd
    public final int i() {
        bcd bcdVar = this.a;
        if (bcdVar != null) {
            return bcdVar.i();
        }
        return 1;
    }
}

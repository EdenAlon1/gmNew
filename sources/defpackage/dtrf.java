package defpackage;

import android.content.ContentValues;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtrf extends dtwc {
    public dtui a;
    public emyl b;
    public emyl c;
    public AtomicInteger d;
    public AtomicLong e;
    public AtomicLong f;
    public AtomicBoolean g;
    public String h;
    public ContentValues i;
    public dtyq j;
    private dtxc k;
    private dtve l;
    private boolean m;
    private byte n;

    @Override // defpackage.dtwc
    public final dtwd a() {
        dtui dtuiVar;
        dtxc dtxcVar;
        dtve dtveVar;
        emyl emylVar;
        AtomicInteger atomicInteger;
        AtomicLong atomicLong;
        AtomicLong atomicLong2;
        AtomicBoolean atomicBoolean;
        if (this.n == 1 && (dtuiVar = this.a) != null && (dtxcVar = this.k) != null && (dtveVar = this.l) != null && (emylVar = this.c) != null && (atomicInteger = this.d) != null && (atomicLong = this.e) != null && (atomicLong2 = this.f) != null && (atomicBoolean = this.g) != null) {
            return new dtrg(dtuiVar, dtxcVar, this.b, dtveVar, this.m, emylVar, atomicInteger, atomicLong, atomicLong2, atomicBoolean, this.h, this.i, this.j);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" loggingTag");
        }
        if (this.k == null) {
            sb.append(" operationCategory");
        }
        if (this.l == null) {
            sb.append(" database");
        }
        if (this.n == 0) {
            sb.append(" exemptFromQueryPlanChecking");
        }
        if (this.c == null) {
            sb.append(" sqlAndArgs");
        }
        if (this.d == null) {
            sb.append(" resultCount");
        }
        if (this.e == null) {
            sb.append(" threadTimeMillis");
        }
        if (this.f == null) {
            sb.append(" elapsedTimeMillis");
        }
        if (this.g == null) {
            sb.append(" isInFlight");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dtwc
    public final void b(dtve dtveVar) {
        if (dtveVar == null) {
            throw new NullPointerException("Null database");
        }
        this.l = dtveVar;
    }

    @Override // defpackage.dtwc
    public final void c(boolean z) {
        this.m = z;
        this.n = (byte) 1;
    }

    @Override // defpackage.dtwc
    public final void d(dtxc dtxcVar) {
        if (dtxcVar == null) {
            throw new NullPointerException("Null operationCategory");
        }
        this.k = dtxcVar;
    }
}

package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fhmg extends fhgz {
    fhnx c;
    long d;
    OutputStream e;
    boolean f;

    @Override // defpackage.fhgz
    public long a() {
        return this.d;
    }

    @Override // defpackage.fhgz
    public final fhgn b() {
        return null;
    }

    final void f(fhmu fhmuVar, long j) {
        this.c = fhmuVar.a();
        this.d = j;
        this.e = new fhmf(this, j, fhmuVar);
    }

    public fhgv e(fhgv fhgvVar) {
        return fhgvVar;
    }
}

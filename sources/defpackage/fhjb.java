package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fhjb implements fhnv {
    public boolean a;
    final /* synthetic */ fhjh b;
    private final fhna c;

    public fhjb(fhjh fhjhVar) {
        this.b = fhjhVar;
        this.c = new fhna(fhjhVar.c.a());
    }

    @Override // defpackage.fhnv
    public final fhnx a() {
        return this.c;
    }

    @Override // defpackage.fhnv
    public long b(fhmt fhmtVar, long j) {
        try {
            return this.b.c.b(fhmtVar, j);
        } catch (IOException e) {
            this.b.b.e();
            c();
            throw e;
        }
    }

    public final void c() {
        int i = this.b.e;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException(a.h(i, "state: "));
        }
        fhjh.l(this.c);
        this.b.e = 6;
    }

    protected final void d() {
        this.a = true;
    }
}

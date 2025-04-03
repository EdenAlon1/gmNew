package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fiui implements Comparable {
    fird a;
    int b;
    String c;
    Locale d;

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(fiui fiuiVar) {
        fird firdVar = fiuiVar.a;
        int a = fiuk.a(this.a.s(), firdVar.s());
        return a != 0 ? a : fiuk.a(this.a.q(), firdVar.q());
    }

    final long b(long j, boolean z) {
        String str = this.c;
        long j2 = str == null ? this.a.j(j, this.b) : this.a.i(j, str, this.d);
        return z ? this.a.g(j2) : j2;
    }

    final void c(fird firdVar, int i) {
        this.a = firdVar;
        this.b = i;
        this.c = null;
        this.d = null;
    }
}

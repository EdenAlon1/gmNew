package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doym implements doyn {
    private drlx a;
    private String b;
    private long c;
    private String d;
    private Instant e;
    private doxr f;
    private byte g;

    @Override // defpackage.dpal
    public final doxr a() {
        throw null;
    }

    @Override // defpackage.dpat
    public final /* bridge */ /* synthetic */ doxs b() {
        drlx drlxVar;
        String str;
        Instant instant;
        doxr doxrVar;
        if (this.g == 1 && (drlxVar = this.a) != null && (str = this.b) != null && (instant = this.e) != null && (doxrVar = this.f) != null) {
            return new doyd(drlxVar, str, this.c, this.d, instant, doxrVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" mediaType");
        }
        if (this.b == null) {
            sb.append(" url");
        }
        if (this.g == 0) {
            sb.append(" sizeBytes");
        }
        if (this.e == null) {
            sb.append(" dateModified");
        }
        if (this.f == null) {
            sb.append(" source");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.doyn
    public final /* synthetic */ void c(Instant instant) {
        this.e = instant;
    }

    @Override // defpackage.doyn
    public final /* synthetic */ void d(String str) {
        this.d = str;
    }

    @Override // defpackage.doyn
    public final /* synthetic */ void e(drlx drlxVar) {
        this.a = drlxVar;
    }

    @Override // defpackage.doyn
    public final /* bridge */ /* synthetic */ void f(long j) {
        this.c = j;
        this.g = (byte) 1;
    }

    @Override // defpackage.dpal
    public final /* bridge */ /* synthetic */ void g(doxr doxrVar) {
        this.f = doxrVar;
    }

    @Override // defpackage.doyn
    public final /* synthetic */ void h(String str) {
        this.b = str;
    }
}

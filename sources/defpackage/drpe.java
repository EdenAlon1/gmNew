package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drpe implements drpm {
    private drjx a;
    private String b;
    private Map c;
    private String d;
    private long e;
    private Instant f;
    private doxr g;
    private Duration h;
    private dteh i;
    private short j;

    @Override // defpackage.dpal
    public final doxr a() {
        throw null;
    }

    @Override // defpackage.dpat
    public final /* bridge */ /* synthetic */ doxs b() {
        int i = ~this.j;
        if ((i & 243) == 0) {
            return new drng(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, i & 268);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" format");
        }
        if ((this.j & 2) == 0) {
            sb.append(" url");
        }
        if ((this.j & 16) == 0) {
            sb.append(" sizeBytes");
        }
        if ((this.j & 32) == 0) {
            sb.append(" dateModified");
        }
        if ((this.j & 64) == 0) {
            sb.append(" source");
        }
        if ((this.j & 128) == 0) {
            sb.append(" duration");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.doyn
    public final /* bridge */ /* synthetic */ void c(Instant instant) {
        this.f = instant;
        this.j = (short) (this.j | 32);
    }

    @Override // defpackage.doyn
    public final /* bridge */ /* synthetic */ void d(String str) {
        this.d = str;
        this.j = (short) (this.j | 8);
    }

    @Override // defpackage.doyn
    public final /* bridge */ /* synthetic */ void e(drlx drlxVar) {
        w(drlxVar);
    }

    @Override // defpackage.dpal
    public final /* bridge */ /* synthetic */ void g(doxr doxrVar) {
        this.g = doxrVar;
        this.j = (short) (this.j | 64);
    }

    public final void i(Duration duration) {
        this.h = duration;
        this.j = (short) (this.j | 128);
    }

    @Override // defpackage.drqu
    public final /* bridge */ /* synthetic */ void j(drka drkaVar) {
        this.a = (drjx) drkaVar;
        this.j = (short) (this.j | 1);
    }

    @Override // defpackage.drqu
    public final /* bridge */ /* synthetic */ void k(Map map) {
        this.c = map;
        this.j = (short) (this.j | 4);
    }

    @Override // defpackage.drqu
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void r(long j) {
        this.e = j;
        this.j = (short) (this.j | 16);
    }

    @Override // defpackage.drqu
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void u(String str) {
        this.b = str;
        this.j = (short) (this.j | 2);
    }

    public final void n(dteh dtehVar) {
        this.i = dtehVar;
        this.j = (short) (this.j | 256);
    }

    @Override // defpackage.drqu
    public final /* bridge */ /* synthetic */ void o(drme drmeVar) {
        x(drmeVar);
    }

    @Override // defpackage.drpm
    public final /* synthetic */ void w(drlx drlxVar) {
        drpl.c(this, drlxVar);
    }

    @Override // defpackage.drpm
    public final /* synthetic */ void x(drme drmeVar) {
        drmeVar.getClass();
    }
}

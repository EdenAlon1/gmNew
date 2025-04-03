package defpackage;

import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drpf implements drpm, drqx {
    private drld a;
    private String b;
    private Map c;
    private String d;
    private int e;
    private int f;
    private long g;
    private Instant h;
    private doxr i;
    private short j;

    @Override // defpackage.dpal
    public final doxr a() {
        throw null;
    }

    @Override // defpackage.dpat
    public final /* bridge */ /* synthetic */ doxs b() {
        int i = ~this.j;
        if ((i & 499) == 0) {
            return new drni(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, i & 12);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" format");
        }
        if ((this.j & 2) == 0) {
            sb.append(" url");
        }
        if ((this.j & 16) == 0) {
            sb.append(" widthPx");
        }
        if ((this.j & 32) == 0) {
            sb.append(" heightPx");
        }
        if ((this.j & 64) == 0) {
            sb.append(" sizeBytes");
        }
        if ((this.j & 128) == 0) {
            sb.append(" dateModified");
        }
        if ((this.j & 256) == 0) {
            sb.append(" source");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.doyn
    public final /* bridge */ /* synthetic */ void c(Instant instant) {
        this.h = instant;
        this.j = (short) (this.j | 128);
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
        this.i = doxrVar;
        this.j = (short) (this.j | 256);
    }

    @Override // defpackage.drqu
    /* renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void r(long j) {
        this.g = j;
        this.j = (short) (this.j | 64);
    }

    @Override // defpackage.drqu
    public final /* bridge */ /* synthetic */ void j(drka drkaVar) {
        this.a = (drld) drkaVar;
        this.j = (short) (this.j | 1);
    }

    @Override // defpackage.drqu
    public final /* bridge */ /* synthetic */ void k(Map map) {
        this.c = map;
        this.j = (short) (this.j | 4);
    }

    @Override // defpackage.drqx
    public final /* bridge */ /* synthetic */ void l(int i) {
        this.f = i;
        this.j = (short) (this.j | 32);
    }

    @Override // defpackage.drqu
    /* renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void u(String str) {
        this.b = str;
        this.j = (short) (this.j | 2);
    }

    @Override // defpackage.drqu
    public final /* bridge */ /* synthetic */ void o(drme drmeVar) {
        x(drmeVar);
    }

    @Override // defpackage.drqx
    public final /* bridge */ /* synthetic */ void v(int i) {
        this.e = i;
        this.j = (short) (this.j | 16);
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

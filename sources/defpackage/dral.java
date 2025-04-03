package defpackage;

import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dral implements drpm, drqx {
    private String a;
    private String b;
    private String c;
    private boolean d;
    private drld e;
    private Map f;
    private String g;
    private int h;
    private int i;
    private long j;
    private Instant k;
    private doxr l;
    private short m;

    @Override // defpackage.dpal
    public final doxr a() {
        throw null;
    }

    @Override // defpackage.doyn
    public final /* bridge */ /* synthetic */ void c(Instant instant) {
        this.k = instant;
        this.m = (short) (this.m | 1024);
    }

    @Override // defpackage.doyn
    public final /* bridge */ /* synthetic */ void d(String str) {
        this.g = str;
        this.m = (short) (this.m | 64);
    }

    @Override // defpackage.doyn
    public final /* bridge */ /* synthetic */ void e(drlx drlxVar) {
        w(drlxVar);
    }

    @Override // defpackage.dpal
    public final /* bridge */ /* synthetic */ void g(doxr doxrVar) {
        this.l = doxrVar;
        this.m = (short) (this.m | 2048);
    }

    @Override // defpackage.dpat
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final dqzc b() {
        int i = ~this.m;
        if ((i & 3) == 0) {
            return new dqzc(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, i & 4092);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.m & 1) == 0) {
            sb.append(" id");
        }
        if ((this.m & 2) == 0) {
            sb.append(" url");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.drqu
    public final /* bridge */ /* synthetic */ void j(drka drkaVar) {
        this.e = (drld) drkaVar;
        this.m = (short) (this.m | 16);
    }

    @Override // defpackage.drqu
    public final /* bridge */ /* synthetic */ void k(Map map) {
        this.f = map;
        this.m = (short) (this.m | 32);
    }

    @Override // defpackage.drqx
    public final /* bridge */ /* synthetic */ void l(int i) {
        this.i = i;
        this.m = (short) (this.m | 256);
    }

    public final void m(String str) {
        this.a = str;
        this.m = (short) (this.m | 1);
    }

    public final void n(String str) {
        this.c = str;
        this.m = (short) (this.m | 4);
    }

    @Override // defpackage.drqu
    public final /* bridge */ /* synthetic */ void o(drme drmeVar) {
        x(drmeVar);
    }

    public final void p(boolean z) {
        this.d = z;
        this.m = (short) (this.m | 8);
    }

    @Override // defpackage.drqu
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void r(long j) {
        this.j = j;
        this.m = (short) (this.m | 512);
    }

    @Override // defpackage.drqu
    /* renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void u(String str) {
        this.b = str;
        this.m = (short) (this.m | 2);
    }

    @Override // defpackage.drqx
    public final /* bridge */ /* synthetic */ void v(int i) {
        this.h = i;
        this.m = (short) (this.m | 128);
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

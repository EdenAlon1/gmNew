package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adak {
    public final cqoh a;
    public drav b;
    public draw c;
    public drat d;
    public long e;
    public long f;

    public adak(cqoh cqohVar) {
        this.a = cqohVar;
    }

    public final void a(drav dravVar) {
        dravVar.getClass();
        c();
        this.b = dravVar;
    }

    public final void b(draw drawVar) {
        drawVar.getClass();
        if (this.c == null) {
            this.c = drawVar;
        }
    }

    public final void c() {
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public final void d(drat dratVar) {
        dratVar.getClass();
        if (this.c != null) {
            dratVar = drat.b;
        }
        this.d = dratVar;
    }
}

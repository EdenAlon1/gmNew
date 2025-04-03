package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzmb extends dzjg {
    private emxc a;
    private emxc b;
    private emxc c;
    private emxc d;
    private long e;
    private dzje f;
    private dzje g;
    private byte h;

    public dzmb() {
        emux emuxVar = emux.a;
        this.a = emuxVar;
        this.b = emuxVar;
        this.c = emuxVar;
        this.d = emuxVar;
    }

    @Override // defpackage.dzjg
    public final dzjn a() {
        dzje dzjeVar;
        dzje dzjeVar2;
        if (this.h == 1 && (dzjeVar = this.f) != null && (dzjeVar2 = this.g) != null) {
            return new dzmc(this.a, this.b, this.c, this.d, this.e, dzjeVar, dzjeVar2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.h == 0) {
            sb.append(" actionTriggeredLogId");
        }
        if (this.f == null) {
            sb.append(" actionPayload");
        }
        if (this.g == null) {
            sb.append(" eventCallbackFailureActionPayload");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzjg
    public final void b(dzje dzjeVar) {
        this.f = dzjeVar;
    }

    @Override // defpackage.dzjg
    public final void c(long j) {
        this.e = j;
        this.h = (byte) 1;
    }

    @Override // defpackage.dzjg
    public final void g(dzjh dzjhVar) {
        this.d = emxc.j(dzjhVar);
    }

    @Override // defpackage.dzjg
    public final void h(dzje dzjeVar) {
        this.g = dzjeVar;
    }

    @Override // defpackage.dzjg
    public final void j(String str) {
        this.c = emxc.j(str);
    }

    @Override // defpackage.dzjg
    public final void k(String str) {
        this.b = emxc.j(str);
    }

    @Override // defpackage.dzjg
    public final void o(String str) {
        this.a = emxc.j(str);
    }
}

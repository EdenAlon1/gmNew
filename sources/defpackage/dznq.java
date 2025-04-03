package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dznq extends dzqn {
    private emxc a;
    private emxc b;
    private emxc c;
    private emxc d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private emxc i;
    private int j;
    private byte k;

    public dznq() {
        emux emuxVar = emux.a;
        this.a = emuxVar;
        this.b = emuxVar;
        this.c = emuxVar;
        this.d = emuxVar;
        this.i = emuxVar;
    }

    @Override // defpackage.dzqn
    public final dzqo a() {
        if (this.k == 31) {
            return new dznr(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.k & 1) == 0) {
            sb.append(" timeToLiveSec");
        }
        if ((this.k & 2) == 0) {
            sb.append(" hideSnippetInConversationList");
        }
        if ((this.k & 4) == 0) {
            sb.append(" hideDismissButton");
        }
        if ((this.k & 8) == 0) {
            sb.append(" dismissibleByTappingOutside");
        }
        if ((this.k & 16) == 0) {
            sb.append(" overlayStyle");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzqn
    public final void b(dzjn dzjnVar) {
        this.a = emxc.j(dzjnVar);
    }

    @Override // defpackage.dzqn
    public final void c(boolean z) {
        this.h = z;
        this.k = (byte) (this.k | 8);
    }

    @Override // defpackage.dzqn
    public final void d(eyee eyeeVar) {
        this.b = emxc.j(eyeeVar);
    }

    @Override // defpackage.dzqn
    public final void e(String str) {
        this.d = emxc.j(str);
    }

    @Override // defpackage.dzqn
    public final void f(int i) {
        this.i = emxc.j(Integer.valueOf(i));
    }

    @Override // defpackage.dzqn
    public final void g(boolean z) {
        this.g = z;
        this.k = (byte) (this.k | 4);
    }

    @Override // defpackage.dzqn
    public final void h(boolean z) {
        this.f = z;
        this.k = (byte) (this.k | 2);
    }

    @Override // defpackage.dzqn
    public final void i(dzqb dzqbVar) {
        this.c = emxc.j(dzqbVar);
    }

    @Override // defpackage.dzqn
    public final void j(int i) {
        this.j = i;
        this.k = (byte) (this.k | 16);
    }

    @Override // defpackage.dzqn
    public final void k(int i) {
        this.e = i;
        this.k = (byte) (this.k | 1);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dznx extends dzrc {
    public dzjn a;
    private String b;
    private emxc c;
    private emxc d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private byte i;

    public dznx() {
        emux emuxVar = emux.a;
        this.c = emuxVar;
        this.d = emuxVar;
    }

    @Override // defpackage.dzrc
    public final dzrd a() {
        String str;
        dzjn dzjnVar;
        if (this.i == 15 && (str = this.b) != null && (dzjnVar = this.a) != null) {
            return new dzny(str, this.c, this.d, dzjnVar, this.e, this.f, this.g, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" text");
        }
        if (this.a == null) {
            sb.append(" action");
        }
        if ((this.i & 1) == 0) {
            sb.append(" textColor");
        }
        if ((this.i & 2) == 0) {
            sb.append(" backgroundColor");
        }
        if ((this.i & 4) == 0) {
            sb.append(" borderColor");
        }
        if ((this.i & 8) == 0) {
            sb.append(" enabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzrc
    public final void b(String str) {
        this.c = emxc.j(str);
    }

    @Override // defpackage.dzrc
    public final void c(int i) {
        this.f = i;
        this.i = (byte) (this.i | 2);
    }

    @Override // defpackage.dzrc
    public final void d(int i) {
        this.g = i;
        this.i = (byte) (this.i | 4);
    }

    @Override // defpackage.dzrc
    public final void e(boolean z) {
        this.h = z;
        this.i = (byte) (this.i | 8);
    }

    @Override // defpackage.dzrc
    public final void f(dzqb dzqbVar) {
        this.d = emxc.j(dzqbVar);
    }

    @Override // defpackage.dzrc
    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.b = str;
    }

    @Override // defpackage.dzrc
    public final void h(int i) {
        this.e = i;
        this.i = (byte) (this.i | 1);
    }
}

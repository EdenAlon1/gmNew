package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzog extends dzrz {
    private int a;
    private String b;
    private emxc c = emux.a;
    private dzjn d;
    private String e;
    private byte f;

    @Override // defpackage.dzrz
    public final dzsa a() {
        if (this.f == 1 && this.b != null && this.d != null && this.e != null) {
            return new dzoh(this.a, this.b, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == 0) {
            sb.append(" id");
        }
        if (this.b == null) {
            sb.append(" text");
        }
        if (this.d == null) {
            sb.append(" action");
        }
        if (this.e == null) {
            sb.append(" secondaryText");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzrz
    public final void b(dzjn dzjnVar) {
        if (dzjnVar == null) {
            throw new NullPointerException("Null action");
        }
        this.d = dzjnVar;
    }

    @Override // defpackage.dzrz
    public final void c(int i) {
        this.a = i;
        this.f = (byte) 1;
    }

    @Override // defpackage.dzrz
    public final void d(dzqb dzqbVar) {
        this.c = emxc.j(dzqbVar);
    }

    @Override // defpackage.dzrz
    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null secondaryText");
        }
        this.e = str;
    }

    @Override // defpackage.dzrz
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.b = str;
    }
}

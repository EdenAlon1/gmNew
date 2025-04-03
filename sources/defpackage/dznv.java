package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dznv extends dzrb {
    private engw a;
    private int b;
    private emxc c = emux.a;
    private byte d;

    @Override // defpackage.dzrb
    public final dzre a() {
        if (this.d == 1 && this.a != null) {
            return new dznw(this.a, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" buttons");
        }
        if (this.d == 0) {
            sb.append(" orientation");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzrb
    public final void b(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null buttons");
        }
        this.a = engwVar;
    }

    @Override // defpackage.dzrb
    public final void c(int i) {
        this.c = emxc.j(Integer.valueOf(i));
    }

    @Override // defpackage.dzrb
    public final void d(int i) {
        this.b = i;
        this.d = (byte) 1;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dziv extends dzri {
    private int a;
    private int b;
    private engw c;
    private byte d;

    @Override // defpackage.dzri
    public final dzrj a() {
        engw engwVar;
        if (this.d == 3 && (engwVar = this.c) != null) {
            return new dzod(this.a, this.b, engwVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" startIndex");
        }
        if ((this.d & 2) == 0) {
            sb.append(" endIndex");
        }
        if (this.c == null) {
            sb.append(" textStyles");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzri
    public final void b(int i) {
        this.b = i;
        this.d = (byte) (this.d | 2);
    }

    @Override // defpackage.dzri
    public final void c(int i) {
        this.a = i;
        this.d = (byte) (this.d | 1);
    }

    @Override // defpackage.dzri
    public final void d(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null textStyles");
        }
        this.c = engwVar;
    }
}

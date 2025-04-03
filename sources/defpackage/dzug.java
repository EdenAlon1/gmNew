package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzug extends dzvc {
    private int a;
    private String b;
    private engw c;
    private byte d;

    @Override // defpackage.dzvc
    public final dzvd a() {
        if (this.d == 1 && this.b != null && this.c != null) {
            return new dzuh(this.a, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" cardWidth");
        }
        if (this.b == null) {
            sb.append(" jsonSource");
        }
        if (this.c == null) {
            sb.append(" cards");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzvc
    public final void b(int i) {
        this.a = i;
        this.d = (byte) 1;
    }

    @Override // defpackage.dzvc
    public final void c(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null cards");
        }
        this.c = engwVar;
    }

    @Override // defpackage.dzvc
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null jsonSource");
        }
        this.b = str;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzsm extends dzsp {
    private String a;
    private int b;
    private byte c;

    @Override // defpackage.dzsp
    public final dzsq a() {
        String str;
        if (this.c == 1 && (str = this.a) != null) {
            return new dzsn(str, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" resourceId");
        }
        if (this.c == 0) {
            sb.append(" resourceRegion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzsp
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null resourceId");
        }
        this.a = str;
    }

    @Override // defpackage.dzsp
    public final void c(int i) {
        this.b = i;
        this.c = (byte) 1;
    }
}

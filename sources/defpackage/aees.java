package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aees extends aeey {
    public String a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public aefa e;
    public aefa f;
    private int g;
    private boolean h;
    private CharSequence i;
    private aeez j;
    private byte k;

    @Override // defpackage.aeey
    public final aefb a() {
        String str;
        CharSequence charSequence;
        aefa aefaVar;
        aeez aeezVar;
        if (this.k == 3 && (str = this.a) != null && (charSequence = this.i) != null && (aefaVar = this.e) != null && (aeezVar = this.j) != null) {
            return new aeet(str, this.g, this.b, this.c, this.h, charSequence, this.d, aefaVar, this.f, aeezVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" bannerName");
        }
        if ((this.k & 1) == 0) {
            sb.append(" iconRes");
        }
        if ((this.k & 2) == 0) {
            sb.append(" canIgnore");
        }
        if (this.i == null) {
            sb.append(" negativeButtonText");
        }
        if (this.e == null) {
            sb.append(" negativeButtonOnClickListener");
        }
        if (this.j == null) {
            sb.append(" logger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.aeey
    public final void b(boolean z) {
        this.h = z;
        this.k = (byte) (this.k | 2);
    }

    @Override // defpackage.aeey
    public final void c(int i) {
        this.g = i;
        this.k = (byte) (this.k | 1);
    }

    @Override // defpackage.aeey
    public final void d(aeez aeezVar) {
        if (aeezVar == null) {
            throw new NullPointerException("Null logger");
        }
        this.j = aeezVar;
    }

    @Override // defpackage.aeey
    public final void e(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("Null negativeButtonText");
        }
        this.i = charSequence;
    }
}

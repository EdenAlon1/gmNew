package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class emyc extends emuy {
    final CharSequence c;
    final emvz d;
    final boolean e;
    int f = 0;
    int g;

    protected emyc(emye emyeVar, CharSequence charSequence) {
        this.d = emyeVar.a;
        this.e = emyeVar.b;
        this.g = emyeVar.d;
        this.c = charSequence;
    }

    @Override // defpackage.emuy
    protected final /* bridge */ /* synthetic */ Object a() {
        int c;
        int b;
        int i = this.f;
        while (true) {
            int i2 = this.f;
            if (i2 == -1) {
                this.a = 3;
                return null;
            }
            c = c(i2);
            if (c == -1) {
                c = this.c.length();
                this.f = -1;
                b = -1;
            } else {
                b = b(c);
                this.f = b;
            }
            if (b == i) {
                int i3 = b + 1;
                this.f = i3;
                if (i3 > this.c.length()) {
                    this.f = -1;
                }
            } else {
                while (i < c && this.d.c(this.c.charAt(i))) {
                    i++;
                }
                while (c > i) {
                    int i4 = c - 1;
                    if (!this.d.c(this.c.charAt(i4))) {
                        break;
                    }
                    c = i4;
                }
                if (!this.e || i != c) {
                    break;
                }
                i = this.f;
            }
        }
        int i5 = this.g;
        if (i5 == 1) {
            c = this.c.length();
            this.f = -1;
            while (c > i) {
                int i6 = c - 1;
                if (!this.d.c(this.c.charAt(i6))) {
                    break;
                }
                c = i6;
            }
        } else {
            this.g = i5 - 1;
        }
        return this.c.subSequence(i, c).toString();
    }

    public abstract int b(int i);

    public abstract int c(int i);
}

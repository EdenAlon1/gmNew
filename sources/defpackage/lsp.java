package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsp {
    public static final lsp a = new lsp(-1, -1, -1);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public lsp(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = lvf.X(i3) ? lvf.n(i3, i2) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsp)) {
            return false;
        }
        lsp lspVar = (lsp) obj;
        return this.b == lspVar.b && this.c == lspVar.c && this.d == lspVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.b + ", channelCount=" + this.c + ", encoding=" + this.d + "]";
    }

    public lsp(lqc lqcVar) {
        this(lqcVar.F, lqcVar.E, lqcVar.G);
    }
}

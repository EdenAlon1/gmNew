package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dziw extends dzrj {
    public final engw a;
    private final int b;
    private final int c;

    public dziw(int i, int i2, engw engwVar) {
        this.b = i;
        this.c = i2;
        this.a = engwVar;
    }

    @Override // defpackage.dzrj
    public final int a() {
        return this.c;
    }

    @Override // defpackage.dzrj
    public final int b() {
        return this.b;
    }

    @Override // defpackage.dzrj
    public final engw c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzrj) {
            dzrj dzrjVar = (dzrj) obj;
            if (this.b == dzrjVar.b() && this.c == dzrjVar.a() && enkr.h(this.a, dzrjVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "FormattedTextSpan{startIndex=" + this.b + ", endIndex=" + this.c + ", textStyles=" + this.a.toString() + "}";
    }
}

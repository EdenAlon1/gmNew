package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebns extends eboq {
    public final boolean a;
    public final enhk b;
    private final enhk c;

    public ebns(boolean z, enhk enhkVar, enhk enhkVar2) {
        this.a = z;
        this.b = enhkVar;
        this.c = enhkVar2;
    }

    @Override // defpackage.eboq
    public final enhk a() {
        return this.b;
    }

    @Override // defpackage.eboq
    public final enhk b() {
        return this.c;
    }

    @Override // defpackage.eboq
    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eboq) {
            eboq eboqVar = (eboq) obj;
            if (this.a == eboqVar.c() && this.b.equals(eboqVar.a()) && ennc.m(this.c, eboqVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "OneGoogleColorResolver{isLightTheme=" + this.a + ", colorsMap=" + this.b.toString() + ", googleThemedColorsMap=" + ennc.g(this.c) + "}";
    }
}

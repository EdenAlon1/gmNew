package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dziu extends dzrh {
    public final emxc a;
    public final emxc b;
    public final emxc c;
    private final String d;
    private final emxc e;

    public dziu(String str, emxc emxcVar, emxc emxcVar2, emxc emxcVar3, emxc emxcVar4) {
        this.d = str;
        if (emxcVar == null) {
            throw new NullPointerException("Null predefinedStyle");
        }
        this.a = emxcVar;
        if (emxcVar2 == null) {
            throw new NullPointerException("Null lineStyles");
        }
        this.b = emxcVar2;
        if (emxcVar3 == null) {
            throw new NullPointerException("Null formattedTextSpans");
        }
        this.c = emxcVar3;
        if (emxcVar4 == null) {
            throw new NullPointerException("Null skipLeadingNewline");
        }
        this.e = emxcVar4;
    }

    @Override // defpackage.dzrh
    public final emxc a() {
        return this.c;
    }

    @Override // defpackage.dzrh
    public final emxc b() {
        return this.b;
    }

    @Override // defpackage.dzrh
    public final emxc c() {
        return this.a;
    }

    @Override // defpackage.dzrh
    public final emxc d() {
        return this.e;
    }

    @Override // defpackage.dzrh
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzrh) {
            dzrh dzrhVar = (dzrh) obj;
            if (this.d.equals(dzrhVar.e()) && this.a.equals(dzrhVar.c()) && this.b.equals(dzrhVar.b()) && this.c.equals(dzrhVar.a()) && this.e.equals(dzrhVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.e;
        emxc emxcVar2 = this.c;
        emxc emxcVar3 = this.b;
        return "FormattedLine{rawText=" + this.d + ", predefinedStyle=" + this.a.toString() + ", lineStyles=" + emxcVar3.toString() + ", formattedTextSpans=" + emxcVar2.toString() + ", skipLeadingNewline=" + emxcVar.toString() + "}";
    }
}

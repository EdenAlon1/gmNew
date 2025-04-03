package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebcs extends ebem {
    private final emxc a;
    private final emxc b;
    private final boolean c;

    public ebcs(emxc emxcVar, emxc emxcVar2, boolean z) {
        this.a = emxcVar;
        this.b = emxcVar2;
        this.c = z;
    }

    @Override // defpackage.ebem
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.ebem
    public final emxc b() {
        return this.a;
    }

    @Override // defpackage.ebem
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebem) {
            ebem ebemVar = (ebem) obj;
            if (this.a.equals(ebemVar.b()) && this.b.equals(ebemVar.a()) && this.c == ebemVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        emxc emxcVar = this.b;
        return "TextualCardTrailingTitle{textViewData=" + String.valueOf(this.a) + ", icon=" + String.valueOf(emxcVar) + ", hasCaptionStyle=" + this.c + "}";
    }
}

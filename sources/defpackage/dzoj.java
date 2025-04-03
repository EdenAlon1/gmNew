package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzoj extends dzsc {
    public final String a;
    private final String b;
    private final engw c;
    private final int d;
    private final String e;

    public dzoj(String str, String str2, engw engwVar, int i, String str3) {
        this.b = str;
        this.a = str2;
        this.c = engwVar;
        this.d = i;
        this.e = str3;
    }

    @Override // defpackage.dzsc
    public final int a() {
        return this.d;
    }

    @Override // defpackage.dzsc
    public final engw b() {
        return this.c;
    }

    @Override // defpackage.dzsc
    public final String c() {
        return this.e;
    }

    @Override // defpackage.dzsc
    public final String d() {
        return this.b;
    }

    @Override // defpackage.dzsc
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzsc) {
            dzsc dzscVar = (dzsc) obj;
            if (this.b.equals(dzscVar.d()) && this.a.equals(dzscVar.e()) && enkr.h(this.c, dzscVar.b()) && this.d == dzscVar.a() && this.e.equals(dzscVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "SuggestionList{id=" + this.b + ", messageId=" + this.a + ", suggestions=" + String.valueOf(this.c) + ", renderStyle=" + this.d + ", hintText=" + this.e + "}";
    }
}

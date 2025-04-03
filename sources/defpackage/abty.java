package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abty extends abup {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final enhk e;
    public final enhk f;
    public final engw g;

    public abty(int i, int i2, int i3, int i4, enhk enhkVar, enhk enhkVar2, engw engwVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (enhkVar == null) {
            throw new NullPointerException("Null oneOnOneMatchedConversationResultSet");
        }
        this.e = enhkVar;
        if (enhkVar2 == null) {
            throw new NullPointerException("Null shortCodeMatchedConversationResultSet");
        }
        this.f = enhkVar2;
        if (engwVar == null) {
            throw new NullPointerException("Null xmsGroupConversationResultSet");
        }
        this.g = engwVar;
    }

    @Override // defpackage.abup
    public final int a() {
        return this.b;
    }

    @Override // defpackage.abup
    public final int b() {
        return this.c;
    }

    @Override // defpackage.abup
    public final int c() {
        return this.a;
    }

    @Override // defpackage.abup
    public final int d() {
        return this.d;
    }

    @Override // defpackage.abup
    public final engw e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abup) {
            abup abupVar = (abup) obj;
            if (this.a == abupVar.c() && this.b == abupVar.a() && this.c == abupVar.b() && this.d == abupVar.d() && this.e.equals(abupVar.f()) && this.f.equals(abupVar.g()) && enkr.h(this.g, abupVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.abup
    public final enhk f() {
        return this.e;
    }

    @Override // defpackage.abup
    public final enhk g() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        engw engwVar = this.g;
        enhk enhkVar = this.f;
        return "MixedUpConversationInfo{totalCount=" + this.a + ", oneOnOneMixedUpConversationsCount=" + this.b + ", shortCodeMixedUpConversationsCount=" + this.c + ", xmsGroupMixedUpConversationsCount=" + this.d + ", oneOnOneMatchedConversationResultSet=" + this.e.toString() + ", shortCodeMatchedConversationResultSet=" + enhkVar.toString() + ", xmsGroupConversationResultSet=" + engwVar.toString() + "}";
    }
}

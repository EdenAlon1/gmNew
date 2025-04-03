package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewvq extends ewxd {
    public final engw a;
    private final String b;
    private final boolean c;

    public ewvq(engw engwVar, String str, boolean z) {
        this.a = engwVar;
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.ewxd
    public final engw a() {
        return this.a;
    }

    @Override // defpackage.ewxd
    public final String b() {
        return this.b;
    }

    @Override // defpackage.ewxd
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ewxd) {
            ewxd ewxdVar = (ewxd) obj;
            if (enkr.h(this.a, ewxdVar.a()) && ((str = this.b) != null ? str.equals(ewxdVar.b()) : ewxdVar.b() == null) && this.c == ewxdVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "ConversationActions{conversationActions=" + this.a.toString() + ", id=" + this.b + ", sensitive=" + this.c + "}";
    }
}

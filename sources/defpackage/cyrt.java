package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyrt {
    public final String a;
    public final String b;
    public final engw c;
    public final dlsr d;

    public cyrt(String str, String str2, engw engwVar, dlsr dlsrVar) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = engwVar;
        this.d = dlsrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyrt)) {
            return false;
        }
        cyrt cyrtVar = (cyrt) obj;
        return ffkj.e(this.a, cyrtVar.a) && ffkj.e(this.b, cyrtVar.b) && ffkj.e(this.c, cyrtVar.c) && ffkj.e(this.d, cyrtVar.d);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        dlsr dlsrVar = this.d;
        return (hashCode * 31) + (dlsrVar == null ? 0 : dlsrVar.hashCode());
    }

    public final String toString() {
        return "GroupMembersUiData(membersCounterText=" + this.a + ", headerActionButtonText=" + this.b + ", members=" + this.c + ", groupAddAction=" + this.d + ")";
    }
}

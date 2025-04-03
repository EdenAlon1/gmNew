package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmmp {
    public final dsjn a;
    public final CharSequence b;
    public final String c;
    public final Integer d;
    public final boolean e;
    public final dmqe f;
    public final dmmo g;

    public dmmp(dsjn dsjnVar, CharSequence charSequence, String str, Integer num, boolean z, dmqe dmqeVar, dmmo dmmoVar) {
        dsjnVar.getClass();
        charSequence.getClass();
        str.getClass();
        this.a = dsjnVar;
        this.b = charSequence;
        this.c = str;
        this.d = num;
        this.e = z;
        this.f = dmqeVar;
        this.g = dmmoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmmp)) {
            return false;
        }
        dmmp dmmpVar = (dmmp) obj;
        return ffkj.e(this.a, dmmpVar.a) && ffkj.e(this.b, dmmpVar.b) && ffkj.e(this.c, dmmpVar.c) && ffkj.e(this.d, dmmpVar.d) && this.e == dmmpVar.e && ffkj.e(this.f, dmmpVar.f) && ffkj.e(this.g, dmmpVar.g);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        Integer num = this.d;
        int hashCode2 = ((((hashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + (true != this.e ? 1237 : 1231)) * 31;
        dmqe dmqeVar = this.f;
        return ((hashCode2 + (dmqeVar != null ? dmqeVar.hashCode() : 0)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "ComposeRowDraftTextUiData(hugoUiData=" + this.a + ", text=" + ((Object) this.b) + ", hint=" + this.c + ", maxLength=" + this.d + ", forcePlainText=" + this.e + ", counter=" + this.f + ", flags=" + this.g + ")";
    }

    public /* synthetic */ dmmp(dsjn dsjnVar, CharSequence charSequence, String str, Integer num, boolean z, dmmo dmmoVar, int i) {
        this(dsjnVar, charSequence, str, (i & 8) != 0 ? null : num, ((i & 16) == 0) & z, (dmqe) null, dmmoVar);
    }
}

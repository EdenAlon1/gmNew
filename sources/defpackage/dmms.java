package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmms {
    public final dmmp a;
    public final dmmk b;
    public final dmmq c;
    public final dmof d;
    public final dmml e;
    public final dmmr f;

    public dmms(dmmp dmmpVar, dmmk dmmkVar, dmmq dmmqVar, dmof dmofVar, dmml dmmlVar, dmmr dmmrVar) {
        dmmpVar.getClass();
        dmofVar.getClass();
        this.a = dmmpVar;
        this.b = dmmkVar;
        this.c = dmmqVar;
        this.d = dmofVar;
        this.e = dmmlVar;
        this.f = dmmrVar;
    }

    public final boolean a() {
        return this.a.b.length() > 0 || !this.b.a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmms)) {
            return false;
        }
        dmms dmmsVar = (dmms) obj;
        return ffkj.e(this.a, dmmsVar.a) && ffkj.e(this.b, dmmsVar.b) && ffkj.e(this.c, dmmsVar.c) && ffkj.e(this.d, dmmsVar.d) && ffkj.e(this.e, dmmsVar.e) && ffkj.e(this.f, dmmsVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        dmmq dmmqVar = this.c;
        int hashCode2 = ((((hashCode * 31) + (dmmqVar == null ? 0 : dmmqVar.hashCode())) * 31) + this.d.hashCode()) * 31;
        dmml dmmlVar = this.e;
        return ((hashCode2 + (dmmlVar != null ? dmmlVar.hashCode() : 0)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "ComposeRowDraftUiData(text=" + this.a + ", attachments=" + this.b + ", topUiData=" + this.c + ", sendButton=" + this.d + ", info=" + this.e + ", flags=" + this.f + ")";
    }

    public /* synthetic */ dmms(dmmp dmmpVar, dmmk dmmkVar, dmof dmofVar, dmmr dmmrVar) {
        this(dmmpVar, dmmkVar, null, dmofVar, null, dmmrVar);
    }
}

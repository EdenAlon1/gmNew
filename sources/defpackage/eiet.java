package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiet extends eiha {
    public final String a;
    public final engw b;

    public eiet(String str, engw engwVar) {
        this.a = str;
        this.b = engwVar;
    }

    @Override // defpackage.eiha
    public final engw a() {
        return this.b;
    }

    @Override // defpackage.eiha
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eiha) {
            eiha eihaVar = (eiha) obj;
            if (this.a.equals(eihaVar.b()) && enkr.h(this.b, eihaVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "RbmSpamReport{rcsBotId=" + this.a + ", rcsMessageIds=" + this.b.toString() + "}";
    }
}

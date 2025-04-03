package defpackage;

import android.content.ContentValues;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efll extends efly {
    public final ContentValues a;
    public final engw b;
    public final engw c;
    public final String d;
    public final eflw e;

    public efll(ContentValues contentValues, engw engwVar, engw engwVar2, String str, eflw eflwVar) {
        this.a = contentValues;
        this.b = engwVar;
        this.c = engwVar2;
        this.d = str;
        this.e = eflwVar;
    }

    @Override // defpackage.efly
    public final ContentValues a() {
        return this.a;
    }

    @Override // defpackage.efly
    public final eflw b() {
        return this.e;
    }

    @Override // defpackage.efly
    public final engw c() {
        return this.b;
    }

    @Override // defpackage.efly
    public final engw d() {
        return this.c;
    }

    @Override // defpackage.efly
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        String str;
        eflw eflwVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof efly) {
            efly eflyVar = (efly) obj;
            if (this.a.equals(eflyVar.a()) && enkr.h(this.b, eflyVar.c()) && enkr.h(this.c, eflyVar.d()) && ((str = this.d) != null ? str.equals(eflyVar.e()) : eflyVar.e() == null) && ((eflwVar = this.e) != null ? eflwVar.equals(eflyVar.b()) : eflyVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        String str = this.d;
        int hashCode2 = ((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        eflw eflwVar = this.e;
        return hashCode2 ^ (eflwVar != null ? eflwVar.hashCode() : 0);
    }

    public final String toString() {
        eflw eflwVar = this.e;
        engw engwVar = this.c;
        engw engwVar2 = this.b;
        return "Mms{values=" + this.a.toString() + ", addresses=" + engwVar2.toString() + ", attachments=" + engwVar.toString() + ", smil=" + this.d + ", body=" + String.valueOf(eflwVar) + "}";
    }
}

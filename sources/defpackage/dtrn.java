package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtrn extends duam {
    public final Cursor a;
    public final engw b;
    public final dtzj c;

    public dtrn(Cursor cursor, engw engwVar, dtzj dtzjVar) {
        this.a = cursor;
        this.b = engwVar;
        this.c = dtzjVar;
    }

    @Override // defpackage.duam
    public final Cursor a() {
        return this.a;
    }

    @Override // defpackage.duam
    public final dtzj b() {
        return this.c;
    }

    @Override // defpackage.duam
    public final engw c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        engw engwVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof duam) {
            duam duamVar = (duam) obj;
            duamVar.d();
            if (this.a.equals(duamVar.a()) && ((engwVar = this.b) != null ? enkr.h(engwVar, duamVar.c()) : duamVar.c() == null) && this.c.equals(duamVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ (-721379959);
        engw engwVar = this.b;
        return (((hashCode * 1000003) ^ (engwVar == null ? 0 : engwVar.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        dtzj dtzjVar = this.c;
        engw engwVar = this.b;
        return "ValuesExpression{sqlExpression=null, cursor=" + this.a.toString() + ", columnsToUpdate=" + String.valueOf(engwVar) + ", whereClause=" + dtzjVar.toString() + "}";
    }

    @Override // defpackage.duam
    public final void d() {
    }
}

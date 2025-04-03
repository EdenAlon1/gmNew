package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecup extends ecwi {
    public final Context a;
    public final emyl b;

    public ecup(Context context, emyl emylVar) {
        this.a = context;
        this.b = emylVar;
    }

    @Override // defpackage.ecwi
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.ecwi
    public final emyl b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        emyl emylVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecwi) {
            ecwi ecwiVar = (ecwi) obj;
            if (this.a.equals(ecwiVar.a()) && ((emylVar = this.b) != null ? emylVar.equals(ecwiVar.b()) : ecwiVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        emyl emylVar = this.b;
        return (hashCode * 1000003) ^ (emylVar == null ? 0 : emylVar.hashCode());
    }

    public final String toString() {
        emyl emylVar = this.b;
        return "FlagsContext{context=" + this.a.toString() + ", hermeticFileOverrides=" + String.valueOf(emylVar) + "}";
    }
}

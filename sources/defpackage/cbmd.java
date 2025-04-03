package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbmd extends cbnb {
    public final Cursor a;
    public final enip b;

    public cbmd(Cursor cursor, enip enipVar) {
        this.a = cursor;
        if (enipVar == null) {
            throw new NullPointerException("Null conversationsWithNoMatchingParts");
        }
        this.b = enipVar;
    }

    @Override // defpackage.cbnb
    public final Cursor a() {
        return this.a;
    }

    @Override // defpackage.cbnb
    public final enip b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cbnb) {
            cbnb cbnbVar = (cbnb) obj;
            if (this.a.equals(cbnbVar.a()) && this.b.equals(cbnbVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        enip enipVar = this.b;
        return "ConversationSearchResults{cursor=" + this.a.toString() + ", conversationsWithNoMatchingParts=" + enipVar.toString() + "}";
    }
}

package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csqm extends csqz {
    public final Cursor a;
    private final csqy b;

    public csqm(csqy csqyVar, Cursor cursor) {
        if (csqyVar == null) {
            throw new NullPointerException("Null directory");
        }
        this.b = csqyVar;
        this.a = cursor;
    }

    @Override // defpackage.csqz
    public final Cursor a() {
        return this.a;
    }

    @Override // defpackage.csqz
    public final csqy b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Cursor cursor;
        if (obj == this) {
            return true;
        }
        if (obj instanceof csqz) {
            csqz csqzVar = (csqz) obj;
            if (this.b.equals(csqzVar.b()) && ((cursor = this.a) != null ? cursor.equals(csqzVar.a()) : csqzVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() ^ 1000003;
        Cursor cursor = this.a;
        return (hashCode * 1000003) ^ (cursor == null ? 0 : cursor.hashCode());
    }

    public final String toString() {
        Cursor cursor = this.a;
        return "ContactsDirectoryFilterResult{directory=" + this.b.toString() + ", filterCursor=" + String.valueOf(cursor) + "}";
    }
}

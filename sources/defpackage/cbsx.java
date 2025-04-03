package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbsx {
    public final int a;
    public final String b;
    public final bfkp c;
    public final boolean d;
    public final cbsy e;
    public final int f;
    private final bgmm g;

    public cbsx(int i, String str, bgmm bgmmVar, bfkp bfkpVar, boolean z, int i2, cbsy cbsyVar) {
        if (i2 == 0) {
            throw null;
        }
        cbsyVar.getClass();
        this.a = i;
        this.b = str;
        this.g = bgmmVar;
        this.c = bfkpVar;
        this.d = z;
        this.f = i2;
        this.e = cbsyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbsx)) {
            return false;
        }
        cbsx cbsxVar = (cbsx) obj;
        return this.a == cbsxVar.a && ffkj.e(this.b, cbsxVar.b) && ffkj.e(this.g, cbsxVar.g) && ffkj.e(this.c, cbsxVar.c) && this.d == cbsxVar.d && this.f == cbsxVar.f && this.e == cbsxVar.e;
    }

    public final int hashCode() {
        return (((((((((((this.a * 31) + this.b.hashCode()) * 31) + this.g.hashCode()) * 31) + this.c.hashCode()) * 31) + (true != this.d ? 1237 : 1231)) * 31) + this.f) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "ConversationListFilterData(iconResId=" + this.a + ", name=" + this.b + ", whereClause=" + this.g + ", whereClauseFromConversationToParticipantsQuery=" + this.c + ", shouldBeDisplayed=" + this.d + ", logType=" + ((Object) Integer.toString(this.f - 1)) + ", position=" + this.e + ")";
    }
}

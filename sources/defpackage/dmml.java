package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmml {
    public final String a;

    public dmml(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmml) && ffkj.e(this.a, ((dmml) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComposeRowDraftInfoUiData(text=" + this.a + ")";
    }
}

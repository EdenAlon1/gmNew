package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apne extends apoh {
    private final String a;
    private final boolean b;
    private final String c;
    private final engw d;

    public apne(String str, boolean z, String str2, engw engwVar) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = engwVar;
    }

    @Override // defpackage.apoh, defpackage.appw
    public final engw a() {
        return this.d;
    }

    @Override // defpackage.appw
    public final String c() {
        return this.a;
    }

    @Override // defpackage.apoh, defpackage.appz
    public final String d() {
        return this.c;
    }

    @Override // defpackage.appz
    public final boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof apoh) {
            apoh apohVar = (apoh) obj;
            if (this.a.equals(apohVar.c()) && this.b == apohVar.e() && ((str = this.c) != null ? str.equals(apohVar.d()) : apohVar.d() == null) && enkr.h(this.d, apohVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.c;
        return (((((hashCode * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "BugleTextWithSubjectContent{text=" + this.a + ", isUrgent=" + this.b + ", subject=" + this.c + ", annotations=" + this.d.toString() + "}";
    }
}

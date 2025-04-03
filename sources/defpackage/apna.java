package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apna extends apnz {
    private final engw a;
    private final String b;

    public apna(engw engwVar, String str) {
        this.a = engwVar;
        this.b = str;
    }

    @Override // defpackage.appo
    public final engw a() {
        return this.a;
    }

    @Override // defpackage.apnz, defpackage.appo
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof apnz) {
            apnz apnzVar = (apnz) obj;
            if (enkr.h(this.a, apnzVar.a()) && ((str = this.b) != null ? str.equals(apnzVar.c()) : apnzVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (hashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "BugleMultiPartContent{attachments=" + this.a.toString() + ", text=" + this.b + "}";
    }
}

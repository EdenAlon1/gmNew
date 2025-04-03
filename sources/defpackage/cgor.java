package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgor extends cgqy {
    private final engw a;
    private final engw b;

    public cgor(engw engwVar, engw engwVar2) {
        this.a = engwVar;
        this.b = engwVar2;
    }

    @Override // defpackage.cgqy
    public final engw a() {
        return this.b;
    }

    @Override // defpackage.cgqy
    public final engw b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgqy) {
            cgqy cgqyVar = (cgqy) obj;
            if (enkr.h(this.a, cgqyVar.b()) && enkr.h(this.b, cgqyVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        engw engwVar = this.b;
        return "MessagesToDeleteContainer{nonCloudSyncMessagesToDelete=" + this.a.toString() + ", cloudSyncMessagesToDelete=" + engwVar.toString() + "}";
    }
}

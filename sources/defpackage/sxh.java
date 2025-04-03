package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxh {
    public final fgdj a;

    public sxh(fgdj fgdjVar) {
        fgdjVar.getClass();
        this.a = fgdjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sxh) && ffkj.e(this.a, ((sxh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BlockedParticipantsScreenUiData(blockedParticipantListFlow=" + this.a + ")";
    }
}

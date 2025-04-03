package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyvt {
    public final int a;
    private final kaa b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyvt)) {
            return false;
        }
        cyvt cyvtVar = (cyvt) obj;
        if (this.a != cyvtVar.a) {
            return false;
        }
        kaa kaaVar = cyvtVar.b;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        return this.a * 31;
    }

    public final String toString() {
        return "MiniConversationDetailsArgs(callerSource=" + ((Object) cyvn.a(this.a)) + ", avatarPosition=null)";
    }
}

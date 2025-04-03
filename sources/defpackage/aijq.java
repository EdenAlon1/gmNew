package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aijq implements aihs {
    public final alxj a;
    public final alxs b;
    public final int c;
    public final int d;

    public aijq(alxj alxjVar, alxs alxsVar, int i, int i2) {
        alxjVar.getClass();
        this.a = alxjVar;
        this.b = alxsVar;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aijq)) {
            return false;
        }
        aijq aijqVar = (aijq) obj;
        return ffkj.e(this.a, aijqVar.a) && ffkj.e(this.b, aijqVar.b) && this.c == aijqVar.c && this.d == aijqVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConversationDetails(conversationProperties=");
        sb.append(this.a);
        sb.append(", composeController=");
        sb.append(this.b);
        sb.append(", conversationSettingsLaunchSource=");
        sb.append(this.c);
        sb.append(", cdpOpeningSource=");
        sb.append((Object) (this.d != 1 ? "CONVERSATION_OVERFLOW_MENU_DETAILS" : "CONVERSATION_TOP_APPBAR_AVATAR_CLICK"));
        sb.append(")");
        return sb.toString();
    }
}

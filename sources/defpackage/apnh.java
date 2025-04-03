package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apnh extends apoj {
    public final String a;
    private final int b;

    public apnh(int i, String str) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.appx
    public final String a() {
        return this.a;
    }

    @Override // defpackage.appx
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apoj) {
            apoj apojVar = (apoj) obj;
            if (this.b == apojVar.b() && this.a.equals(apojVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String str;
        switch (this.b) {
            case 1:
                str = "UNDEFINED";
                break;
            case 2:
                str = "LINK_PREVIEW";
                break;
            case 3:
                str = "ENCRYPTED";
                break;
            case 4:
                str = "UNENCRYPTED";
                break;
            case 5:
                str = "LOST_ENCRYPTION";
                break;
            case 6:
                str = "PENPAL_CONVERSATION_NOTICE";
                break;
            case 7:
                str = "THEME_CHANGE";
                break;
            case 8:
                str = "INITIAL";
                break;
            case 9:
                str = "PENPAL_PROACTIVE_MESSAGE";
                break;
            case 10:
                str = "CHATBOT_UNSUBSCRIBE_CONFIRMED";
                break;
            case 11:
                str = "CHATBOT_SUBSCRIBE_CONFIRMED";
                break;
            default:
                str = "ACTIVE_SELF_IDENTITY_CHANGED";
                break;
        }
        return "BugleTombstoneTextLineContent{type=" + str + ", text=" + this.a + "}";
    }
}

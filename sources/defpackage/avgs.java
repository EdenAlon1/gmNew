package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avgs {
    public final String a;
    public final String b;
    public final int c;
    private final String d;

    public avgs(String str, int i, String str2, String str3) {
        this.a = str;
        this.c = i;
        this.b = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avgs)) {
            return false;
        }
        avgs avgsVar = (avgs) obj;
        return ffkj.e(this.a, avgsVar.a) && this.c == avgsVar.c && ffkj.e(this.b, avgsVar.b) && ffkj.e(this.d, avgsVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (((hashCode + this.c) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RbmBusinessInfoDownloadParameters(botId=");
        sb.append(this.a);
        sb.append(", requestSource=");
        int i = this.c;
        sb.append((Object) (i != 2 ? i != 3 ? i != 5 ? "CHATBOT_DIRECTORY" : "INCOMING_MESSAGE_DOWNLOAD_POSTPONED" : "CONVERSATION_UPDATE" : "INCOMING_MESSAGE"));
        sb.append(", messageId=");
        sb.append(this.b);
        sb.append(", shortCode=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public avgs(String str, int i) {
        this(str, i, null, null);
        str.getClass();
    }
}

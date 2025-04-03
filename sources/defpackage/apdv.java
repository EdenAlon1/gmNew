package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apdv {
    public final String a;
    public final int b;
    private final Locale c;

    public apdv(String str, int i, Locale locale) {
        this.a = str;
        this.b = i;
        this.c = locale;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apdv)) {
            return false;
        }
        apdv apdvVar = (apdv) obj;
        return ffkj.e(this.a, apdvVar.a) && this.b == apdvVar.b && ffkj.e(this.c, apdvVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        int i = this.b;
        Locale locale = this.c;
        return (((hashCode * 31) + i) * 31) + (locale != null ? locale.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2 = this.a;
        CharSequence c = str2 != null ? cskw.c(str2) : null;
        int i = this.b;
        Locale locale = this.c;
        StringBuilder sb = new StringBuilder("VoiceTranscription(transcription=");
        sb.append((Object) c);
        sb.append(", status=");
        switch (i) {
            case 1:
                str = "VMT_STATUS_UNKNOWN";
                break;
            case 2:
                str = "VMT_STATUS_QUEUED";
                break;
            case 3:
                str = "VMT_STATUS_IN_PROGRESS";
                break;
            case 4:
                str = "VMT_STATUS_COMPLETE";
                break;
            case 5:
                str = "VMT_STATUS_ERROR_UNKNOWN";
                break;
            case 6:
                str = "VMT_STATUS_ERROR_TEMPORARY";
                break;
            default:
                str = "VMT_STATUS_ERROR_PERMANENT";
                break;
        }
        sb.append((Object) str);
        sb.append(", locale=");
        sb.append(locale);
        sb.append(")");
        return sb.toString();
    }
}

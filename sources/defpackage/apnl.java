package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apnl extends apoo {
    private final String a;
    private final Uri b;
    private final apra c;

    public apnl(String str, Uri uri, apra apraVar) {
        this.a = str;
        this.b = uri;
        this.c = apraVar;
    }

    @Override // defpackage.appj
    public final String b() {
        return this.a;
    }

    @Override // defpackage.apoo, defpackage.apmq
    public final Uri c() {
        return null;
    }

    @Override // defpackage.apmq
    public final Uri e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apoo) {
            apoo apooVar = (apoo) obj;
            if (this.a.equals(apooVar.b()) && this.b.equals(apooVar.e())) {
                apooVar.c();
                apra apraVar = this.c;
                if (apraVar != null ? apraVar.equals(apooVar.fk()) : apooVar.fk() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.apoo, defpackage.apmq
    public final apra fk() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        apra apraVar = this.c;
        return (hashCode * (-721379959)) ^ (apraVar == null ? 0 : apraVar.hashCode());
    }

    public final String toString() {
        apra apraVar = this.c;
        return "BugleUnsupportedAttachmentContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", originalUri=null, progress=" + String.valueOf(apraVar) + "}";
    }
}

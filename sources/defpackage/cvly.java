package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvly extends cvlz {
    private final String a;

    public cvly(String str) {
        this.a = str;
    }

    @Override // defpackage.cvlz
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvlz) {
            cvlz cvlzVar = (cvlz) obj;
            if (this.a.equals(cvlzVar.a())) {
                cvlzVar.b();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ R.string.samsung_signature_banner_text;
    }

    public final String toString() {
        return "SignatureData{signature=" + this.a + ", bannerText=2132087206}";
    }

    @Override // defpackage.cvlz
    public final void b() {
    }
}

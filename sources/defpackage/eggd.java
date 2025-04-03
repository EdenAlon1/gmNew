package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eggd extends egge {
    private final Uri a;

    public eggd(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.eghh
    public final int b() {
        return 2;
    }

    @Override // defpackage.egge, defpackage.eghh
    public final Uri c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eghh) {
            eghh eghhVar = (eghh) obj;
            if (eghhVar.b() == 2 && this.a.equals(eghhVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ImageIdOrUri{uri=" + this.a.toString() + "}";
    }
}

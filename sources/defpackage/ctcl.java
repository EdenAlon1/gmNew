package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctcl extends ctco {
    private final Uri a;

    public ctcl(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.ctco, defpackage.ctch
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.ctch
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctch) {
            ctch ctchVar = (ctch) obj;
            if (ctchVar.e() == 1 && this.a.equals(ctchVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DataSource{contentUri=" + this.a.toString() + "}";
    }
}

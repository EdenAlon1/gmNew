package defpackage;

import android.net.Uri;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkoi implements Serializable {
    private static final long serialVersionUID = 9000536717254735624L;
    private final String a;

    public dkoi(Uri uri) {
        this.a = uri.toString();
    }

    public final Uri a() {
        return Uri.parse(this.a);
    }
}

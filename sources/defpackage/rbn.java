package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rbn implements rap, rbp {
    private final ContentResolver a;

    public rbn(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    @Override // defpackage.rbp
    public final qud a(Uri uri) {
        return new qtz(this.a, uri);
    }

    @Override // defpackage.rap
    public final rao b(rax raxVar) {
        return new rbr(this);
    }
}

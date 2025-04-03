package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rbq implements rap, rbp {
    private final ContentResolver a;

    public rbq(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    @Override // defpackage.rbp
    public final qud a(Uri uri) {
        return new qus(this.a, uri);
    }

    @Override // defpackage.rap
    public final rao b(rax raxVar) {
        return new rbr(this);
    }
}

package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class raz implements rap {
    private final Resources a;

    public raz(Resources resources) {
        this.a = resources;
    }

    @Override // defpackage.rap
    public final rao b(rax raxVar) {
        return new rbb(this.a, raxVar.a(Uri.class, InputStream.class));
    }
}

package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
class rca implements rap {
    private final Context a;
    private final Class b;

    public rca(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.rap
    public final rao b(rax raxVar) {
        Class cls = this.b;
        return new rce(this.a, raxVar.a(File.class, cls), raxVar.a(Uri.class, cls), cls);
    }
}

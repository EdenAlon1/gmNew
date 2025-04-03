package defpackage;

import android.content.Context;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rbd implements rap {
    private final Context a;

    public rbd(Context context) {
        this.a = context;
    }

    @Override // defpackage.rap
    public final rao b(rax raxVar) {
        return new rbe(this.a, raxVar.a(Integer.class, InputStream.class));
    }
}

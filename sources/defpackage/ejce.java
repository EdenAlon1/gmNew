package defpackage;

import android.content.Context;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejce extends rhm {
    private final ejcc a;

    public ejce(ejcc ejccVar) {
        this.a = ejccVar;
    }

    @Override // defpackage.rhm
    public final void d(Context context, qpt qptVar, qqk qqkVar) {
        this.a.d(context, qptVar, qqkVar);
        qqkVar.g(ejfs.class, InputStream.class, new ejcd());
    }
}

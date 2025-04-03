package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eckp implements emyl {
    private final Context a;

    public eckp(Context context) {
        this.a = context;
    }

    @Override // defpackage.emyl
    public final /* bridge */ /* synthetic */ Object get() {
        return dubc.d(this.a) ? emux.a : emxc.j(new File(this.a.getFilesDir(), "primes/crash"));
    }
}

package defpackage;

import android.content.Intent;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class ciwm {
    public static ciwm e(Intent intent, boolean z, Optional optional, Optional optional2) {
        return f(intent, z, 0, optional, optional2);
    }

    public static ciwm f(Intent intent, boolean z, int i, Optional optional, Optional optional2) {
        return new cisx(ciwn.c(optional, optional2), intent, z, i);
    }

    public abstract int a();

    public abstract Intent b();

    public abstract ciwn c();

    public abstract boolean d();
}

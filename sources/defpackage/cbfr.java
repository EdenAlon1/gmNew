package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbfr extends ContentObserver {
    public final Context a;
    public final AtomicBoolean b;
    public final AtomicBoolean c;
    public volatile ecri d;
    private final ffbr e;

    public cbfr(Context context, ffbr ffbrVar) {
        super(null);
        this.b = new AtomicBoolean(false);
        this.c = new AtomicBoolean(false);
        this.a = context;
        this.e = ffbrVar;
        cbfs.d.p("ContactContentObserver created");
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        cbfs.d.p("Contacts changed");
        if (this.b.compareAndSet(false, true)) {
            this.d = ((alrv) this.e.b()).a();
        }
    }
}

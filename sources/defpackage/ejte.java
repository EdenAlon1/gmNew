package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ejte extends ContentObserver {
    private final elbx a;
    private final String b;
    private final Executor c;

    protected ejte(elbx elbxVar, String str, Executor executor) {
        super(null);
        this.a = elbxVar;
        this.b = str;
        this.c = executor;
    }

    private final void b(final boolean z, final Uri uri) {
        this.c.execute(eldl.l(new Runnable() { // from class: ejtd
            @Override // java.lang.Runnable
            public final void run() {
                ejte.this.a(z, uri);
            }
        }));
    }

    public abstract void a(boolean z, Uri uri);

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (ekyf.v()) {
            b(z, null);
            return;
        }
        ekzm d = this.a.d(this.b);
        try {
            b(z, null);
            d.close();
        } catch (Throwable th) {
            try {
                d.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        if (ekyf.v()) {
            b(z, uri);
            return;
        }
        ekzm d = this.a.d(this.b);
        try {
            b(z, uri);
            d.close();
        } catch (Throwable th) {
            try {
                d.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

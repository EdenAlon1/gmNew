package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efjz extends efkb implements CancellationSignal.OnCancelListener {
    private final CancellationSignal b;

    public efjz(efka efkaVar) {
        super(efkaVar);
        this.b = new CancellationSignal();
    }

    @Override // defpackage.ernr, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.b.cancel();
        return super.cancel(z);
    }

    @Override // defpackage.efkb
    protected final void d(efka efkaVar) {
        try {
            this.b.setOnCancelListener(this);
            Cursor a = efkaVar.a(this.b);
            try {
                if (!isCancelled() && a != null) {
                    a.getCount();
                }
                if (set(a)) {
                    return;
                }
                efay.a(a);
            } catch (Throwable th) {
                try {
                    setException(th);
                    if (set(a)) {
                        return;
                    }
                    efay.a(a);
                } catch (Throwable th2) {
                    if (!set(a)) {
                        efay.a(a);
                    }
                    throw th2;
                }
            }
        } catch (OperationCanceledException unused) {
            super.cancel(true);
        }
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        super.cancel(true);
    }
}

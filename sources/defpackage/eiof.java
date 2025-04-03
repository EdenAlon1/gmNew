package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.setupcompat.ISetupCompatService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiof {
    private static eiof b;
    private final Context d;
    private final ExecutorService e = einx.a.b;
    private final long f = c;
    private static final eipn a = new eipn("SetupCompatServiceInvoker");
    private static final long c = TimeUnit.SECONDS.toMillis(10);

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.Executor, java.util.concurrent.ExecutorService] */
    private eiof(Context context) {
        this.d = context;
    }

    public static synchronized eiof a(Context context) {
        eiof eiofVar;
        synchronized (eiof.class) {
            if (b == null) {
                b = new eiof(context.getApplicationContext());
            }
            eiofVar = b;
        }
        return eiofVar;
    }

    public final void b(int i, Bundle bundle) {
        try {
            ISetupCompatService a2 = eioj.a(this.d, this.f, TimeUnit.MILLISECONDS);
            if (a2 != null) {
                a2.logMetric(i, bundle, Bundle.EMPTY);
            } else {
                a.f("logMetric failed since service reference is null. Are the permissions valid?");
            }
        } catch (RemoteException | IllegalStateException | InterruptedException | TimeoutException e) {
            a.e(String.format("Exception occurred while trying to log metric = [%s]", bundle), e);
        }
    }

    public final void c(String str, Bundle bundle) {
        try {
            ISetupCompatService a2 = eioj.a(this.d, this.f, TimeUnit.MILLISECONDS);
            if (a2 != null) {
                a2.onFocusStatusChanged(bundle);
            } else {
                a.f("Report focusChange failed since service reference is null. Are the permission valid?");
            }
        } catch (RemoteException | InterruptedException | UnsupportedOperationException | TimeoutException e) {
            a.e(String.format("Exception occurred while %s trying report windowFocusChange to SetupWizard.", str), e);
        }
    }

    public final void d(final int i, final Bundle bundle) {
        try {
            this.e.execute(new Runnable() { // from class: eioe
                @Override // java.lang.Runnable
                public final void run() {
                    eiof.this.b(i, bundle);
                }
            });
        } catch (RejectedExecutionException e) {
            a.e(String.format("Metric of type %d dropped since queue is full.", Integer.valueOf(i)), e);
        }
    }

    public final void e(final String str, final Bundle bundle) {
        try {
            this.e.execute(new Runnable() { // from class: eiod
                @Override // java.lang.Runnable
                public final void run() {
                    eiof.this.c(str, bundle);
                }
            });
        } catch (RejectedExecutionException e) {
            a.e(String.format("Screen %s report focus changed failed.", str), e);
        }
    }
}

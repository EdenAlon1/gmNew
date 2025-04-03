package defpackage;

import org.chromium.base.ApplicationStatus;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fidt implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (ApplicationStatus.b != null) {
            return;
        }
        ApplicationStatus.b = new fids();
        ApplicationStatus.a(ApplicationStatus.b);
    }
}

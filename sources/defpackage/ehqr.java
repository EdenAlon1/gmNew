package defpackage;

import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehqr implements Runnable {
    final /* synthetic */ BaseTransientBottomBar a;

    public ehqr(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.p();
    }
}

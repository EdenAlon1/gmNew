package defpackage;

import com.google.android.setupdesign.view.BottomScrollView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eirc implements Runnable {
    final /* synthetic */ BottomScrollView a;

    public eirc(BottomScrollView bottomScrollView) {
        this.a = bottomScrollView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a();
    }
}

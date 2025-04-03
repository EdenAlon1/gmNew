package defpackage;

import android.widget.ListView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gs implements Runnable {
    final /* synthetic */ gu a;

    public gs(gu guVar) {
        this.a = guVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListView listView = this.a.b;
        listView.focusableViewAvailable(listView);
    }
}

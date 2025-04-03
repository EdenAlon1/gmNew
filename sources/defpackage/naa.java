package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* compiled from: PG */
/* loaded from: classes.dex */
final class naa implements DisplayManager.DisplayListener {
    public final DisplayManager a;
    final /* synthetic */ nac b;

    public naa(nac nacVar, DisplayManager displayManager) {
        this.b = nacVar;
        this.a = displayManager;
    }

    public final Display a() {
        return this.a.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.b.c(a());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}

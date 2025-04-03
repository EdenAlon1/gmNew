package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.camera.view.PreviewView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cce implements DisplayManager.DisplayListener {
    final /* synthetic */ PreviewView a;

    public cce(PreviewView previewView) {
        this.a = previewView;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        Display display = this.a.getDisplay();
        if (display == null || display.getDisplayId() != i) {
            return;
        }
        this.a.c();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}

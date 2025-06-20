package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oe implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, op {
    public final od a;
    public iv b;
    nz c;

    public oe(od odVar) {
        this.a = odVar;
    }

    @Override // defpackage.op
    public final void a(od odVar, boolean z) {
        iv ivVar;
        if ((z || odVar == this.a) && (ivVar = this.b) != null) {
            ivVar.dismiss();
        }
    }

    @Override // defpackage.op
    public final boolean b(od odVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.z(((ny) this.c.k()).getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.d(this.a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i != 82) {
            if (i == 4) {
                i = 4;
            }
            return this.a.performShortcut(i, keyEvent, 0);
        }
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            Window window2 = this.b.getWindow();
            if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                keyDispatcherState2.startTracking(keyEvent, this);
                return true;
            }
        } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
            this.a.i(true);
            dialogInterface.dismiss();
            return true;
        }
        return this.a.performShortcut(i, keyEvent, 0);
    }
}

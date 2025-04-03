package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertController;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ListView;
import androidx.core.widget.NestedScrollView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iv extends kb implements DialogInterface {
    public final AlertController a;

    protected iv(Context context, int i) {
        super(context, a(context, i));
        this.a = new AlertController(getContext(), this, getWindow());
    }

    static int a(Context context, int i) {
        if ((i >>> 24) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final Button b(int i) {
        AlertController alertController = this.a;
        if (i == -3) {
            return alertController.p;
        }
        if (i == -2) {
            return alertController.m;
        }
        if (i != -1) {
            return null;
        }
        return alertController.j;
    }

    public final ListView d() {
        return this.a.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x025d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02fe  */
    @Override // defpackage.kb, defpackage.abg, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.a.s;
        if (nestedScrollView == null || !nestedScrollView.n(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.a.s;
        if (nestedScrollView == null || !nestedScrollView.n(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.kb, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.a.a(charSequence);
    }
}

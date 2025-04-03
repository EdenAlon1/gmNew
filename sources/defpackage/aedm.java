package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aedm implements ellh {
    final /* synthetic */ aedh a;

    public aedm(aedh aedhVar) {
        this.a = aedhVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        String str;
        View.OnClickListener onClickListener;
        final cvmt cvmtVar = (cvmt) ellfVar;
        cvmtVar.a();
        if (TextUtils.isEmpty(cvmtVar.b())) {
            str = null;
            onClickListener = null;
        } else {
            str = cvmtVar.b();
            onClickListener = new View.OnClickListener() { // from class: aebe
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cvmt.this.a().run();
                }
            };
        }
        aedh aedhVar = this.a;
        Snackbar r = Snackbar.r(aedh.f(aedhVar.b), cvmtVar.c(), 0);
        r.t(str, onClickListener);
        r.n(aedhVar.ac.g());
        r.i();
        return elli.a;
    }
}

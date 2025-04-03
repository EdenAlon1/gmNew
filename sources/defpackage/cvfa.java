package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvfa {
    public static final cskc a = cskc.g("Bugle", "ViLTEPicker");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    private final ea g;

    public cvfa(ea eaVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.g = eaVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.e = ffbrVar3;
        this.d = ffbrVar4;
        this.f = ffbrVar5;
    }

    public final void a(final Runnable runnable, eovs eovsVar) {
        eovsVar.copyOnWrite();
        eovu eovuVar = (eovu) eovsVar.instance;
        eovu eovuVar2 = eovu.a;
        eovuVar.b |= 64;
        eovuVar.h = true;
        ea eaVar = this.g;
        View view = eaVar.Q;
        view.getClass();
        Snackbar r = Snackbar.r(view.getRootView(), eaVar.B().getString(R.string.snack_bar_video_call_error), 0);
        r.o();
        r.t(this.g.B().getString(R.string.action_advanced_feedback), new View.OnClickListener() { // from class: cvez
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                runnable.run();
            }
        });
        r.i();
    }
}

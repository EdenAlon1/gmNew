package defpackage;

import android.app.Dialog;
import android.content.res.Resources;
import androidx.cardview.widget.CardView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duja {
    public final CardView a;
    public final Dialog b;
    public final dukm c;
    public final boolean d;

    public duja(CardView cardView, Dialog dialog, dukm dukmVar, boolean z) {
        this.a = cardView;
        this.b = dialog;
        this.c = dukmVar;
        this.d = z;
    }

    public final Resources a() {
        return this.a.getContext().getResources();
    }
}

package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dvbk extends RecyclerView {
    public dvbk(Context context) {
        super(context);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void Z(int i) {
        if (i == 1) {
            dvbl.a(this, true);
        } else if (i != 2) {
            dvbl.a(this, false);
        }
    }

    public dvbk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public dvbk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

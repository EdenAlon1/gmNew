package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uqe extends wr {
    public final View s;

    public uqe(View view, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        super(view);
        this.s = view;
        if (onClickListener != null) {
            view.setOnClickListener(onClickListener);
        }
        if (onLongClickListener != null) {
            view.setOnLongClickListener(onLongClickListener);
        }
    }
}

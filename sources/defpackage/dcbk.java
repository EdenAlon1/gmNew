package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcbk extends wr implements View.OnTouchListener {
    final ImageView s;
    final ImageView t;
    final TextView u;
    final Switch v;
    final /* synthetic */ dcbl w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcbk(dcbl dcblVar, View view) {
        super(view);
        this.w = dcblVar;
        this.s = (ImageView) view.findViewById(R.id.customization_category_reorder_icon);
        this.t = (ImageView) view.findViewById(R.id.customization_category_icon);
        this.u = (TextView) view.findViewById(R.id.customization_category_name);
        this.v = (Switch) view.findViewById(R.id.customization_category_switch);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.w.d.n(this);
        return view.performClick();
    }
}

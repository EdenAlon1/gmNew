package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwuj implements DialogInterface.OnShowListener {
    final /* synthetic */ cwuk a;

    public cwuj(cwuk cwukVar) {
        this.a = cwukVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int dividerHeight;
        iv ivVar = this.a.n;
        if (ivVar == null) {
            return;
        }
        ListView d = ivVar.d();
        ViewGroup.LayoutParams layoutParams = d.getLayoutParams();
        if (layoutParams.height == -1 || layoutParams.height == -2) {
            return;
        }
        ListAdapter adapter = d.getAdapter();
        if (adapter == null) {
            dividerHeight = -2;
        } else {
            int i = 0;
            for (int i2 = 0; i2 < adapter.getCount(); i2++) {
                View view = adapter.getView(i2, null, d);
                if (view != null) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    i += view.getMeasuredHeight();
                }
            }
            dividerHeight = i + (d.getDividerHeight() * (adapter.getCount() - 1));
        }
        if (dividerHeight < layoutParams.height) {
            layoutParams.height = -2;
            d.setLayoutParams(layoutParams);
            d.setPadding(0, 0, 0, this.a.i.getResources().getDimensionPixelSize(R.dimen.bugle_settings_vertical_padding));
            d.requestLayout();
        }
    }
}

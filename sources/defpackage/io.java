package defpackage;

import android.R;
import android.content.Context;
import android.support.v7.app.AlertController;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class io extends ArrayAdapter {
    final /* synthetic */ AlertController.RecycleListView a;
    final /* synthetic */ ir b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io(ir irVar, Context context, int i, CharSequence[] charSequenceArr, AlertController.RecycleListView recycleListView) {
        super(context, i, R.id.text1, charSequenceArr);
        this.b = irVar;
        this.a = recycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ir irVar = this.b;
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = irVar.u;
        if (zArr != null && zArr[i]) {
            this.a.setItemChecked(i, true);
        }
        return view2;
    }
}

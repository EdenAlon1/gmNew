package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehti implements AdapterView.OnItemClickListener {
    final /* synthetic */ ehtk a;

    public ehti(ehtk ehtkVar) {
        this.a = ehtkVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        CharSequence convertSelectionToString;
        if (i < 0) {
            uo uoVar = this.a.a;
            item = !uoVar.x() ? null : uoVar.e.getSelectedItem();
        } else {
            item = this.a.getAdapter().getItem(i);
        }
        ehtk ehtkVar = this.a;
        convertSelectionToString = ehtkVar.convertSelectionToString(item);
        ehtkVar.setText(convertSelectionToString, false);
        AdapterView.OnItemClickListener onItemClickListener = this.a.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                uo uoVar2 = this.a.a;
                view = uoVar2.x() ? uoVar2.e.getSelectedView() : null;
                uo uoVar3 = this.a.a;
                i = uoVar3.o();
                j = !uoVar3.x() ? Long.MIN_VALUE : uoVar3.e.getSelectedItemId();
            }
            onItemClickListener.onItemClick(this.a.a.e, view, i, j);
        }
        this.a.a.m();
    }
}

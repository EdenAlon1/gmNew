package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exbf extends ArrayAdapter {
    final /* synthetic */ exbu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exbf(exbu exbuVar, Context context) {
        super(context, 0);
        this.a = exbuVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        exby exbyVar = (exby) getItem(i);
        int width = this.a.H.getWidth();
        exbyVar.getClass();
        exbt exbtVar = this.a.n;
        if (view != null) {
            exbv.h(view, exbyVar, exbtVar.b, exbt.b(exbyVar));
        } else {
            view = exbtVar.a(exbyVar);
        }
        view.setMinimumWidth(width);
        return view;
    }
}

package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehff implements AdapterView.OnItemClickListener {
    final /* synthetic */ MaterialCalendarGridView a;
    final /* synthetic */ ehfh b;

    public ehff(ehfh ehfhVar, MaterialCalendarGridView materialCalendarGridView) {
        this.a = materialCalendarGridView;
        this.b = ehfhVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ehfe adapter = this.a.getAdapter();
        if (i < adapter.b() || i > adapter.c()) {
            return;
        }
        ehfh ehfhVar = this.b;
        this.a.getAdapter().getItem(i).longValue();
        ehel ehelVar = ehfhVar.a;
        ehes ehesVar = ehelVar.a;
        if (ehesVar.b.c.a()) {
            ehesVar.a.h();
            Iterator it = ehelVar.a.aj.iterator();
            while (it.hasNext()) {
                ehfi ehfiVar = (ehfi) it.next();
                ehelVar.a.a.i();
                ehfiVar.a();
            }
            ehelVar.a.ag.n.p();
            RecyclerView recyclerView = ehelVar.a.e;
            if (recyclerView != null) {
                recyclerView.n.p();
            }
        }
    }
}

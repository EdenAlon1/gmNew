package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import com.google.android.apps.messaging.R;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehfh extends vk {
    public final ehel a;
    private final eheb d;
    private final ehee e;
    private final ehef f;
    private final int g;

    public ehfh(Context context, ehee eheeVar, eheb ehebVar, ehef ehefVar, ehel ehelVar) {
        ehfd ehfdVar = ehebVar.a;
        ehfd ehfdVar2 = ehebVar.b;
        ehfd ehfdVar3 = ehebVar.d;
        if (ehfdVar.compareTo(ehfdVar3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (ehfdVar3.compareTo(ehfdVar2) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.g = (ehfe.a * ehes.a(context)) + (ehez.aY(context) ? ehes.a(context) : 0);
        this.d = ehebVar;
        this.e = eheeVar;
        this.f = ehefVar;
        this.a = ehelVar;
        B(true);
    }

    final ehfd F(int i) {
        return this.d.a.e(i);
    }

    @Override // defpackage.vk
    public final int a() {
        return this.d.g;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!ehez.aY(viewGroup.getContext())) {
            return new ehfg(linearLayout, false);
        }
        linearLayout.setLayoutParams(new vy(-1, this.g));
        return new ehfg(linearLayout, true);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        ehfg ehfgVar = (ehfg) wrVar;
        ehfd e = this.d.a.e(i);
        ehfgVar.s.setText(e.f());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) ehfgVar.t.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !e.equals(materialCalendarGridView.getAdapter().b)) {
            ehfe ehfeVar = new ehfe(e, this.e, this.d, this.f);
            materialCalendarGridView.setNumColumns(e.d);
            materialCalendarGridView.setAdapter((ListAdapter) ehfeVar);
        } else {
            materialCalendarGridView.invalidate();
            ehfe adapter = materialCalendarGridView.getAdapter();
            Iterator it = adapter.d.iterator();
            while (it.hasNext()) {
                adapter.e(materialCalendarGridView, ((Long) it.next()).longValue());
            }
            ehee eheeVar = adapter.c;
            if (eheeVar != null) {
                Iterator it2 = eheeVar.a().iterator();
                while (it2.hasNext()) {
                    adapter.e(materialCalendarGridView, ((Long) it2.next()).longValue());
                }
                adapter.d = adapter.c.a();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new ehff(this, materialCalendarGridView));
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        return this.d.a.e(i).a.getTimeInMillis();
    }

    final int m(ehfd ehfdVar) {
        return this.d.a.b(ehfdVar);
    }
}

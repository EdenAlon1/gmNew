package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.apps.tiktok.tracing.debug.TraceItemView;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eljn extends ejzn {
    final /* synthetic */ LayoutInflater a;

    public eljn(LayoutInflater layoutInflater) {
        this.a = layoutInflater;
    }

    @Override // defpackage.ejzn
    public final /* bridge */ /* synthetic */ View a(ViewGroup viewGroup) {
        return (TraceItemView) this.a.inflate(R.layout.trace_item_view, viewGroup, false);
    }

    @Override // defpackage.ejzn
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        TraceItemView traceItemView = (TraceItemView) view;
        final eljy eljyVar = (eljy) obj;
        eljo H = traceItemView.H();
        H.b.setText(eljo.a.format(new Date(eljyVar.e)));
        H.c.setText(eljyVar.d);
        H.d.setText((eljyVar.f - eljyVar.e) + "ms");
        traceItemView.setOnClickListener(new elay(traceItemView.H().e, "Clicked root trace", new View.OnClickListener() { // from class: eljm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ellj.g(new elhp(eljy.this), view2);
            }
        }));
    }
}

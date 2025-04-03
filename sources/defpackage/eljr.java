package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.apps.tiktok.tracing.debug.TraceRecordItemView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eljr extends ejzn {
    final /* synthetic */ LayoutInflater a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;

    public eljr(LayoutInflater layoutInflater, long j, long j2) {
        this.a = layoutInflater;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.ejzn
    public final /* bridge */ /* synthetic */ View a(ViewGroup viewGroup) {
        return (TraceRecordItemView) this.a.inflate(R.layout.trace_record_item_view, viewGroup, false);
    }

    @Override // defpackage.ejzn
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        ekzx ekzxVar = (ekzx) obj;
        eljs H = ((TraceRecordItemView) view).H();
        long j = ekzxVar.h;
        H.a.setText(ekzxVar.c + " (" + j + " ms)");
        elkb elkbVar = H.b;
        elkbVar.a = this.b;
        elkbVar.b = this.c;
        elkbVar.c = ekzxVar;
        elkbVar.invalidateSelf();
    }
}

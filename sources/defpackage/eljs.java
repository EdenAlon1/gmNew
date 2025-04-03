package defpackage;

import com.google.apps.tiktok.tracing.debug.TraceRecordItemView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eljs {
    public final TraceRecordItemView a;
    public final elkb b;

    public eljs(TraceRecordItemView traceRecordItemView) {
        this.a = traceRecordItemView;
        elkb elkbVar = new elkb(traceRecordItemView.getContext());
        this.b = elkbVar;
        traceRecordItemView.setBackground(elkbVar);
    }
}

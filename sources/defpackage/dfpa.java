package defpackage;

import android.content.Context;
import com.google.android.gms.cobalt.LogOccurrenceRequest;
import com.google.android.gms.cobalt.internal.ICobaltLoggerService;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfpa extends dfra implements dfoq {
    private static final dfqs m;
    private static final dfqj n;
    private static final dfqt o;
    public final int a;
    public final int b;

    static {
        dfqs dfqsVar = new dfqs();
        m = dfqsVar;
        dfoy dfoyVar = new dfoy();
        n = dfoyVar;
        o = new dfqt("CobaltLogger.API", dfoyVar, dfqsVar);
    }

    public dfpa(Context context, dfos dfosVar) {
        super(context, o, dfosVar, dfqz.a);
        this.a = dfosVar.a;
        this.b = dfosVar.b;
    }

    @Override // defpackage.dfoq
    public final dhre a(final int i, final int[] iArr) {
        dfun dfunVar = new dfun();
        dfunVar.b = new Feature[]{dfot.a};
        dfunVar.b();
        dfunVar.a = new dfuf() { // from class: dfox
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                dfoz dfozVar = new dfoz((dhri) obj2);
                LogOccurrenceRequest logOccurrenceRequest = new LogOccurrenceRequest();
                dfpa dfpaVar = dfpa.this;
                logOccurrenceRequest.a = dfpaVar.a;
                logOccurrenceRequest.b = dfpaVar.b;
                logOccurrenceRequest.c = i;
                logOccurrenceRequest.d = 1L;
                logOccurrenceRequest.e = iArr;
                ((ICobaltLoggerService) ((dfow) obj).w()).logOccurrence(logOccurrenceRequest, dfozVar);
            }
        };
        return h(dfunVar.a());
    }
}

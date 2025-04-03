package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.service.IClientTelemetryService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfxo extends dfra implements dfxf {
    public static final /* synthetic */ int a = 0;
    private static final dfqs b;
    private static final dfqj m;
    private static final dfqt n;

    static {
        dfqs dfqsVar = new dfqs();
        b = dfqsVar;
        dfxn dfxnVar = new dfxn();
        m = dfxnVar;
        n = new dfqt("ClientTelemetry.API", dfxnVar, dfqsVar);
    }

    public dfxo(Context context, dfxg dfxgVar) {
        super(context, n, dfxgVar, dfqz.a);
    }

    @Override // defpackage.dfxf
    public final dhre a(final TelemetryData telemetryData) {
        dfun dfunVar = new dfun();
        dfunVar.b = new Feature[]{dfnl.a};
        dfunVar.b();
        dfunVar.a = new dfuf() { // from class: dfxm
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                int i = dfxo.a;
                ((IClientTelemetryService) ((dfxp) obj).w()).recordData(TelemetryData.this);
                ((dhri) obj2).b(null);
            }
        };
        return h(dfunVar.a());
    }
}

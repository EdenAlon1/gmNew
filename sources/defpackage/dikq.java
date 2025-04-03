package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dikq {
    private static final diyy a = dizd.a(164466999);
    private final Context b;
    private final dkpp c;
    private final dijt d;

    public dikq(Context context, dkpp dkppVar, dijt dijtVar) {
        this.b = context;
        this.c = dkppVar;
        this.d = dijtVar;
    }

    public final void a(int i) {
        if (this.d.e(this.c.k())) {
            return;
        }
        eyrv eyrvVar = (eyrv) eyrx.a.createBuilder();
        eyrvVar.copyOnWrite();
        eyrx eyrxVar = (eyrx) eyrvVar.instance;
        eyrxVar.c = Integer.valueOf(i - 1);
        eyrxVar.b = 1;
        if (((Boolean) a.a()).booleanValue()) {
            epls a2 = this.d.a(this.b, eplu.CARRIER_SERVICES_EVENT_SOURCE_RCS);
            a2.copyOnWrite();
            eplx eplxVar = (eplx) a2.instance;
            eyrx eyrxVar2 = (eyrx) eyrvVar.build();
            eplx eplxVar2 = eplx.a;
            eyrxVar2.getClass();
            eplxVar.f = eyrxVar2;
            eplxVar.e = 38;
            this.d.c(this.b, (eplx) a2.build(), ezee.JIBE_SERVICE_EVENT);
        }
    }
}

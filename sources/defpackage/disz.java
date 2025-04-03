package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class disz {
    static final diyy a = diyv.b("enable_gba_authentication_logging");
    private final Context b;
    private final dikt c;

    public disz(Context context, dikt diktVar) {
        this.b = context;
        this.c = diktVar;
    }

    public final void a(int i, eyuj eyujVar) {
        if (((Boolean) a.a()).booleanValue()) {
            eyvu eyvuVar = (eyvu) eyvv.a.createBuilder();
            eyvuVar.copyOnWrite();
            eyvv eyvvVar = (eyvv) eyvuVar.instance;
            eyvvVar.f = 8;
            eyvvVar.b |= 2;
            eyvuVar.copyOnWrite();
            eyvv eyvvVar2 = (eyvv) eyvuVar.instance;
            eyvvVar2.g = i - 1;
            eyvvVar2.b |= 4;
            eyvuVar.copyOnWrite();
            eyvv eyvvVar3 = (eyvv) eyvuVar.instance;
            eyujVar.getClass();
            eyvvVar3.d = eyujVar;
            eyvvVar3.c = 11;
            this.c.h(this.b, (eyvv) eyvuVar.build());
        }
    }
}

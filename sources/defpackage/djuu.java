package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djuu extends dijp implements djut {
    private static final dktn b = new dktn("DroidGuardLogger");
    private final Context c;
    private final dktz d;

    public djuu(Context context, djix djixVar, dkpp dkppVar, errl errlVar, dijt dijtVar) {
        super(djixVar, dkppVar, eplu.CARRIER_SERVICES_EVENT_SOURCE_RCS, errlVar, dijtVar);
        this.c = context;
        this.d = new dktz(dfld.k(context, "CARRIER_SERVICES"));
    }

    @Override // defpackage.djut
    public final void a(eyqm eyqmVar, Optional optional) {
        epls K = K(this.c);
        if (K == null) {
            dkty.h(b, "Could not create DroidGuard token creation event", new Object[0]);
            return;
        }
        eysz eyszVar = (eysz) eyta.a.createBuilder();
        String str = (String) optional.orElse("unknown");
        eyszVar.copyOnWrite();
        eyta eytaVar = (eyta) eyszVar.instance;
        str.getClass();
        eytaVar.b |= 1;
        eytaVar.c = str;
        eyszVar.copyOnWrite();
        eyta eytaVar2 = (eyta) eyszVar.instance;
        eyqmVar.getClass();
        eytaVar2.h = eyqmVar;
        eytaVar2.b |= 16384;
        eyta eytaVar3 = (eyta) eyszVar.build();
        K.copyOnWrite();
        eplx eplxVar = (eplx) K.instance;
        eplx eplxVar2 = eplx.a;
        eytaVar3.getClass();
        eplxVar.f = eytaVar3;
        eplxVar.e = 13;
        ((dflc) this.d.a((eplx) K.build()).get()).c();
    }
}

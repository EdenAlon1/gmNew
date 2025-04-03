package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dikv implements dkpi {
    private final Context a;
    private final dkpp b;
    private final dijt c;

    public dikv(Context context, dkpp dkppVar, dijt dijtVar) {
        this.a = context;
        this.b = dkppVar;
        this.c = dijtVar;
    }

    @Override // defpackage.dkpi
    public final void a(eyxs eyxsVar) {
        if (this.c.e(this.b.k())) {
            return;
        }
        dijt dijtVar = this.c;
        Context context = this.a;
        epls a = dijtVar.a(context, eplu.CARRIER_SERVICES_EVENT_SOURCE_COMMON);
        eyye eyyeVar = (eyye) eyyf.a.createBuilder();
        eyyeVar.copyOnWrite();
        eyyf eyyfVar = (eyyf) eyyeVar.instance;
        eyxsVar.getClass();
        eyyfVar.c = eyxsVar;
        eyyfVar.b = 2;
        eyyf eyyfVar2 = (eyyf) eyyeVar.build();
        a.copyOnWrite();
        eplx eplxVar = (eplx) a.instance;
        eplx eplxVar2 = eplx.a;
        eyyfVar2.getClass();
        eplxVar.f = eyyfVar2;
        eplxVar.e = 22;
        dijtVar.c(context, (eplx) a.build(), ezee.TELEPHONY_EVENT);
    }

    @Override // defpackage.dkpi
    public final void b(eyxz eyxzVar) {
        if (this.c.e(this.b.k())) {
            return;
        }
        dijt dijtVar = this.c;
        Context context = this.a;
        epls a = dijtVar.a(context, eplu.CARRIER_SERVICES_EVENT_SOURCE_COMMON);
        eyye eyyeVar = (eyye) eyyf.a.createBuilder();
        eyyeVar.copyOnWrite();
        eyyf eyyfVar = (eyyf) eyyeVar.instance;
        eyxzVar.getClass();
        eyyfVar.c = eyxzVar;
        eyyfVar.b = 1;
        eyyf eyyfVar2 = (eyyf) eyyeVar.build();
        a.copyOnWrite();
        eplx eplxVar = (eplx) a.instance;
        eplx eplxVar2 = eplx.a;
        eyyfVar2.getClass();
        eplxVar.f = eyyfVar2;
        eplxVar.e = 22;
        dijtVar.c(context, (eplx) a.build(), ezee.TELEPHONY_EVENT);
    }

    @Override // defpackage.dkpi
    public final void c(eyyd eyydVar) {
        if (this.c.e(this.b.k())) {
            return;
        }
        dijt dijtVar = this.c;
        Context context = this.a;
        epls a = dijtVar.a(context, eplu.CARRIER_SERVICES_EVENT_SOURCE_RCS);
        eyye eyyeVar = (eyye) eyyf.a.createBuilder();
        eyyeVar.copyOnWrite();
        eyyf eyyfVar = (eyyf) eyyeVar.instance;
        eyydVar.getClass();
        eyyfVar.c = eyydVar;
        eyyfVar.b = 4;
        eyyf eyyfVar2 = (eyyf) eyyeVar.build();
        a.copyOnWrite();
        eplx eplxVar = (eplx) a.instance;
        eplx eplxVar2 = eplx.a;
        eyyfVar2.getClass();
        eplxVar.f = eyyfVar2;
        eplxVar.e = 22;
        dijtVar.c(context, (eplx) a.build(), ezee.TELEPHONY_EVENT);
    }
}

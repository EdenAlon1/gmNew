package defpackage;

import android.content.Context;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dikx extends dijp {
    public static final diyy b = diyv.b("enable_xsl_rcs_messaging_send_message");
    private final Context c;

    public dikx(Context context, djix djixVar, dkpp dkppVar, errl errlVar, dijt dijtVar) {
        super(djixVar, dkppVar, eplu.CARRIER_SERVICES_EVENT_SOURCE_RCS, errlVar, dijtVar);
        this.c = context;
    }

    public final void d(fjay fjayVar, String str) {
        f(fjayVar, str, 8);
    }

    public final void e(fjay fjayVar, String str) {
        f(fjayVar, str, 7);
    }

    public final void f(fjay fjayVar, String str, int i) {
        fgkd fgkdVar = (fgkd) fgki.a.createBuilder();
        fgkb fgkbVar = (fgkb) fgkc.a.createBuilder();
        fgkbVar.a(str);
        fgkdVar.copyOnWrite();
        fgki fgkiVar = (fgki) fgkdVar.instance;
        fgkc fgkcVar = (fgkc) fgkbVar.build();
        fgkcVar.getClass();
        fgkiVar.d = fgkcVar;
        fgkiVar.b |= 2;
        fgkdVar.copyOnWrite();
        ((fgki) fgkdVar.instance).f = fjaz.a(24);
        fgkdVar.copyOnWrite();
        ((fgki) fgkdVar.instance).e = fgkh.a(i);
        fgkdVar.copyOnWrite();
        ((fgki) fgkdVar.instance).g = fgkg.a(21);
        eyja d = eykm.d(dkvj.a().longValue());
        fgkdVar.copyOnWrite();
        fgki fgkiVar2 = (fgki) fgkdVar.instance;
        d.getClass();
        fgkiVar2.h = d;
        fgkiVar2.b |= 4;
        if (!fjayVar.equals(fjay.a)) {
            fgkdVar.copyOnWrite();
            fgki fgkiVar3 = (fgki) fgkdVar.instance;
            fjayVar.getClass();
            fgkiVar3.c = fjayVar;
            fgkiVar3.b |= 1;
        }
        fgki fgkiVar4 = (fgki) fgkdVar.build();
        epls K = K(this.c);
        if (K == null) {
            dkty.q("Unable to send RCS extension log", new Object[0]);
            return;
        }
        if ((fgkiVar4.b & 1) != 0) {
            fjay fjayVar2 = fgkiVar4.c;
            if (fjayVar2 == null) {
                fjayVar2 = fjay.a;
            }
            double doubleValue = dizg.p().doubleValue();
            if (doubleValue < 1.0d && (doubleValue <= eobe.a || fjayVar2 == null || Math.abs(UUID.fromString(fjayVar2.b).hashCode()) > ((int) (doubleValue * 2.147483647E9d)))) {
                return;
            }
        }
        K.copyOnWrite();
        eplx eplxVar = (eplx) K.instance;
        eplx eplxVar2 = eplx.a;
        fgkiVar4.getClass();
        eplxVar.f = fgkiVar4;
        eplxVar.e = 39;
        M(this.c, (eplx) K.build(), ezee.XSL_REQUEST_EVENT);
    }
}

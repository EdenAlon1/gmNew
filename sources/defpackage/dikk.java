package defpackage;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dikk extends dijp {
    public static final String c = UUID.randomUUID().toString();
    public static final AtomicInteger d = new AtomicInteger();

    protected dikk(djix djixVar, dkpp dkppVar, eplu epluVar, errl errlVar, dijt dijtVar) {
        super(djixVar, dkppVar, epluVar, errlVar, dijtVar);
    }

    static final ezbm J() {
        ezbm ezbmVar = (ezbm) ezbn.a.createBuilder();
        String str = c;
        ezbmVar.copyOnWrite();
        ezbn ezbnVar = (ezbn) ezbmVar.instance;
        str.getClass();
        ezbnVar.b |= 1;
        ezbnVar.e = str;
        int incrementAndGet = d.incrementAndGet();
        ezbmVar.copyOnWrite();
        ezbn ezbnVar2 = (ezbn) ezbmVar.instance;
        ezbnVar2.b |= 2;
        ezbnVar2.f = incrementAndGet;
        return ezbmVar;
    }

    public final void G(Context context, eysy eysyVar) {
        ezbm J = J();
        J.copyOnWrite();
        ezbn ezbnVar = (ezbn) J.instance;
        ezbn ezbnVar2 = ezbn.a;
        eysyVar.getClass();
        ezbnVar.d = eysyVar;
        ezbnVar.c = 6;
        H(context, (ezbn) J.build());
    }

    public final void H(Context context, ezbn ezbnVar) {
        epls K = K(context);
        if (K == null) {
            dkty.q("Unable to send diagnostic log", new Object[0]);
            return;
        }
        K.copyOnWrite();
        eplx eplxVar = (eplx) K.instance;
        eplx eplxVar2 = eplx.a;
        ezbnVar.getClass();
        eplxVar.f = ezbnVar;
        eplxVar.e = 25;
        M(context, (eplx) K.build(), ezee.DIAGNOSTIC_EVENT);
    }

    protected final void I(Context context, ezcd ezcdVar) {
        ezbm J = J();
        J.copyOnWrite();
        ezbn ezbnVar = (ezbn) J.instance;
        ezbn ezbnVar2 = ezbn.a;
        ezcdVar.getClass();
        ezbnVar.d = ezcdVar;
        ezbnVar.c = 3;
        H(context, (ezbn) J.build());
    }
}

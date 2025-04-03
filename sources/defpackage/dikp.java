package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dikp extends dikk {
    public dikp(djix djixVar, dkpp dkppVar, eplu epluVar, errl errlVar, dijt dijtVar) {
        super(djixVar, dkppVar, epluVar, errlVar, dijtVar);
    }

    protected final void A(Context context, eyzl eyzlVar) {
        ezcc ezccVar = (ezcc) ezcd.a.createBuilder();
        ezccVar.copyOnWrite();
        ezcd ezcdVar = (ezcd) ezccVar.instance;
        eyzlVar.getClass();
        ezcdVar.c = eyzlVar;
        ezcdVar.b = 3;
        I(context, (ezcd) ezccVar.build());
    }

    protected final void B(Context context, ezad ezadVar) {
        ezcc ezccVar = (ezcc) ezcd.a.createBuilder();
        ezccVar.copyOnWrite();
        ezcd ezcdVar = (ezcd) ezccVar.instance;
        ezadVar.getClass();
        ezcdVar.c = ezadVar;
        ezcdVar.b = 1;
        I(context, (ezcd) ezccVar.build());
    }

    protected final void C(Context context, ezcb ezcbVar, String str) {
        ezcc ezccVar = (ezcc) ezcd.a.createBuilder();
        ezccVar.copyOnWrite();
        ezcd ezcdVar = (ezcd) ezccVar.instance;
        ezcbVar.getClass();
        ezcdVar.c = ezcbVar;
        ezcdVar.b = 2;
        ezcd ezcdVar2 = (ezcd) ezccVar.build();
        ezbm J = dikk.J();
        J.copyOnWrite();
        ezbn ezbnVar = (ezbn) J.instance;
        ezbn ezbnVar2 = ezbn.a;
        ezcdVar2.getClass();
        ezbnVar.d = ezcdVar2;
        ezbnVar.c = 3;
        if (str != null) {
            J.copyOnWrite();
            ezbn ezbnVar3 = (ezbn) J.instance;
            ezbnVar3.b |= 4;
            ezbnVar3.g = str;
        }
        super.H(context, (ezbn) J.build());
    }
}

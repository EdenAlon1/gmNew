package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dikt extends dijp {
    public dikt(djix djixVar, dkpp dkppVar, errl errlVar, dijt dijtVar) {
        super(djixVar, dkppVar, eplu.CARRIER_SERVICES_EVENT_SOURCE_RCS, errlVar, dijtVar);
    }

    public final void d(Context context, eyrf eyrfVar) {
        epls K = K(context);
        if (K == null) {
            dkty.q("Unable to send RCS extension log", new Object[0]);
            return;
        }
        K.copyOnWrite();
        eplx eplxVar = (eplx) K.instance;
        eplx eplxVar2 = eplx.a;
        eyrfVar.getClass();
        eplxVar.f = eyrfVar;
        eplxVar.e = 33;
        M(context, (eplx) K.build(), ezee.IMS_SERVICE_SESSION_EVENT);
    }

    public final void e(Context context, eyrp eyrpVar) {
        ezfn ezfnVar = (ezfn) ezfo.a.createBuilder();
        ezfnVar.copyOnWrite();
        ezfo ezfoVar = (ezfo) ezfnVar.instance;
        eyrpVar.getClass();
        ezfoVar.d = eyrpVar;
        ezfoVar.c = 11;
        i(context, ezfnVar, ezee.INCOMING_RPC_EVENT);
    }

    public final void f(Context context, eysj eysjVar) {
        ezfn ezfnVar = (ezfn) ezfo.a.createBuilder();
        ezfnVar.copyOnWrite();
        ezfo ezfoVar = (ezfo) ezfnVar.instance;
        eysjVar.getClass();
        ezfoVar.d = eysjVar;
        ezfoVar.c = 10;
        i(context, ezfnVar, ezee.MSRP_EVENT);
    }

    public final void g(Context context, eyte eyteVar, eyti eytiVar) {
        ezfn ezfnVar = (ezfn) ezfo.a.createBuilder();
        ezfnVar.copyOnWrite();
        ezfo ezfoVar = (ezfo) ezfnVar.instance;
        eyteVar.getClass();
        ezfoVar.e = eyteVar;
        ezfoVar.b |= 4;
        if (eytiVar != null) {
            ezfnVar.copyOnWrite();
            ezfo ezfoVar2 = (ezfo) ezfnVar.instance;
            ezfoVar2.d = eytiVar;
            ezfoVar2.c = 6;
        }
        i(context, ezfnVar, ezee.SELF_SERVICE_MESSAGE_EVENT);
    }

    public final void h(Context context, eyvv eyvvVar) {
        ezfn ezfnVar = (ezfn) ezfo.a.createBuilder();
        ezfnVar.copyOnWrite();
        ezfo ezfoVar = (ezfo) ezfnVar.instance;
        eyvvVar.getClass();
        ezfoVar.d = eyvvVar;
        ezfoVar.c = 13;
        i(context, ezfnVar, ezee.SINGLE_REGISTRATION_API_CALL_EVENT);
    }

    public final void i(Context context, ezfn ezfnVar, ezee ezeeVar) {
        epls K = K(context);
        if (K == null) {
            dkty.q("Unable to send RCS extension log", new Object[0]);
            return;
        }
        K.copyOnWrite();
        eplx eplxVar = (eplx) K.instance;
        ezfo ezfoVar = (ezfo) ezfnVar.build();
        eplx eplxVar2 = eplx.a;
        ezfoVar.getClass();
        eplxVar.f = ezfoVar;
        eplxVar.e = 18;
        M(context, (eplx) K.build(), ezeeVar);
    }
}

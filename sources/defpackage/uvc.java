package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uvc implements ellh {
    final /* synthetic */ uuy a;

    public uvc(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        bcse a = ((czlo) ellfVar).a();
        String b = a.u().b();
        int f = a.f();
        uqo uqoVar = this.a.I;
        if (uqoVar.g == null) {
            csjy.n("Bugle", "Failed to show options UI: fragment manager is null.");
        } else {
            ezxc ezxcVar = (ezxc) ezxf.a.createBuilder();
            ezxcVar.copyOnWrite();
            ezxf ezxfVar = (ezxf) ezxcVar.instance;
            b.getClass();
            ezxfVar.b |= 1;
            ezxfVar.c = b;
            engw engwVar = bdjs.a;
            if (f == 6 || f == 7) {
                ezxe ezxeVar = ezxe.XMS_STUCK_IN_SENDING_OPTIONS;
                ezxcVar.copyOnWrite();
                ezxf ezxfVar2 = (ezxf) ezxcVar.instance;
                ezxfVar2.e = ezxeVar.k;
                ezxfVar2.b |= 4;
            } else if (bdjs.q(f)) {
                ezxe ezxeVar2 = ezxe.XMS_FAILED_TO_SEND_OPTIONS;
                ezxcVar.copyOnWrite();
                ezxf ezxfVar3 = (ezxf) ezxcVar.instance;
                ezxfVar3.e = ezxeVar2.k;
                ezxfVar3.b |= 4;
            }
            crka.aY((ezxf) ezxcVar.build()).t(uqoVar.g, "messageFailureOptionsBottomModalFragment");
        }
        return elli.a;
    }
}

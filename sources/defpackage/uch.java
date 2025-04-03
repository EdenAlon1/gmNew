package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uch implements ellh {
    final /* synthetic */ ucd a;

    public uch(ucd ucdVar) {
        this.a = ucdVar;
    }

    @Override // defpackage.ellh
    public final /* synthetic */ elli a(ellf ellfVar) {
        ucd ucdVar = this.a;
        long epochMilli = ((cqoh) ucdVar.e.b()).f().toEpochMilli();
        long a = ((cqoh) ucdVar.e.b()).a();
        ekzz f = eleg.f("DraftEditorFragmentPeer#onSendButtonClick");
        try {
            ((cpev) ucdVar.j.b()).h(cpeu.SEND_BUTTON_ACCURATE);
            if (ucdVar.z.H().l()) {
                ucdVar.z.H().c.ak(false);
            } else {
                akzo akzoVar = new akzo(epochMilli, a);
                int i = 1;
                if (true == ucdVar.z.H().V()) {
                    i = 2;
                }
                ucdVar.z(akzoVar, true, true, false, i);
            }
            elli elliVar = elli.a;
            f.close();
            return elliVar;
        } finally {
        }
    }
}

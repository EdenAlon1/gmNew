package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzek {
    private final ctyx a;

    public bzek(ctyx ctyxVar) {
        ctyxVar.getClass();
        this.a = ctyxVar;
    }

    public final void a() {
        this.a.n("ditto_active_desktop_id");
        this.a.n("ditto_active_desktop_request_id");
    }

    public final boolean b(fcek fcekVar) {
        byte[] r = this.a.r("ditto_active_desktop_id");
        fcek fcekVar2 = null;
        if (r != null) {
            try {
                fcekVar2 = (fcek) eyfy.parseFrom(fcek.a, r, eyfc.a());
            } catch (eygu unused) {
            }
        }
        return fcekVar2 != null && fcekVar.c.equals(fcekVar2.c);
    }
}

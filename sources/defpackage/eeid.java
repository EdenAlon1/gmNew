package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eeid extends eehy {
    private final String f = "127.0.0.1";
    private final int g = 5600;
    private final String h = "127.0.0.1";
    private final int i = 5600;

    @Override // defpackage.eehy
    public final int i() {
        return this.g;
    }

    @Override // defpackage.eehy
    public final int j() {
        return this.i;
    }

    @Override // defpackage.eehy
    public final eeif k(eenj eenjVar, eein eeinVar) {
        throw new eejg("Can't send message - Stub SIP Stack");
    }

    @Override // defpackage.eehy
    public final eeif l(eenj eenjVar) {
        throw new eejg("Can't send message - Stub SIP Stack");
    }

    @Override // defpackage.eehy
    public final String n() {
        return this.f;
    }

    @Override // defpackage.eehy
    public final String o() {
        return this.h;
    }

    @Override // defpackage.eehy
    public final String p() {
        return "UDP";
    }

    @Override // defpackage.eehy
    public final void s(eenj eenjVar) {
        throw new eejg("Can't send message - Stub SIP Stack");
    }

    @Override // defpackage.eehy
    public final boolean v() {
        return true;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ovi implements oxf {
    public final oxi f;
    public final String g;
    public boolean h;

    public ovi(oxi oxiVar, String str) {
        this.f = oxiVar;
        this.g = str;
    }

    protected final void k() {
        if (this.h) {
            oxe.b(21, "statement is closed");
            throw new ffbx();
        }
    }

    @Override // defpackage.oxf
    public final /* synthetic */ boolean l() {
        return b(0) != 0;
    }

    protected final void m() {
        this.h = true;
    }
}

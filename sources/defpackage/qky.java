package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qky implements qlf {
    public static final qky a = new qky();

    private qky() {
    }

    @Override // defpackage.qlf
    public final /* bridge */ /* synthetic */ Object a(qlk qlkVar, float f) {
        boolean z = qlkVar.q() == 1;
        if (z) {
            qlkVar.h();
        }
        float a2 = (float) qlkVar.a();
        float a3 = (float) qlkVar.a();
        while (qlkVar.o()) {
            qlkVar.n();
        }
        if (z) {
            qlkVar.j();
        }
        return new qma((a2 / 100.0f) * f, (a3 / 100.0f) * f);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kig extends kia {
    public int ao;
    private int ap;
    private kiq aq;

    public kig(kie kieVar) {
        super(kieVar, 5);
    }

    @Override // defpackage.kia, defpackage.khs, defpackage.kib
    public final void e() {
        x();
        int i = this.ao;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            i3 = 2;
                        } else if (i2 == 5) {
                            i3 = 3;
                        }
                    }
                }
            }
            i3 = 1;
        }
        kiq kiqVar = this.aq;
        kiqVar.a = i3;
        kiqVar.c = this.ap;
    }

    @Override // defpackage.khs
    public final void o(int i) {
        this.ap = i;
    }

    @Override // defpackage.khs
    public final void w(Object obj) {
        this.ap = this.al.a(obj);
    }

    @Override // defpackage.kia
    public final kiz x() {
        if (this.aq == null) {
            this.aq = new kiq();
        }
        return this.aq;
    }
}

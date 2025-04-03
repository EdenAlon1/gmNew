package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiof extends fiqt {
    private final fipx a = new fipx();
    private final int b;
    private boolean c;

    public fiof(int i) {
        this.b = i;
    }

    @Override // defpackage.fiqw
    public final fipf b() {
        return this.a;
    }

    @Override // defpackage.fiqw
    public final fiqv c(fiqz fiqzVar) {
        finn finnVar = (finn) fiqzVar;
        if (!finnVar.h) {
            int i = finnVar.g;
            int i2 = this.b;
            if (i >= i2) {
                return new fine(-1, finnVar.e + i2, false);
            }
            return null;
        }
        if (this.a.f == null) {
            return null;
        }
        fipf b = fiqzVar.a().b();
        boolean z = true;
        if (!(b instanceof fiqd) && !(b instanceof fipx)) {
            z = false;
        }
        this.c = z;
        return new fine(finnVar.f, -1, false);
    }

    @Override // defpackage.fiqt, defpackage.fiqw
    public final boolean g() {
        return true;
    }

    @Override // defpackage.fiqt, defpackage.fiqw
    public final boolean j(fipf fipfVar) {
        if (!this.c) {
            return true;
        }
        fipf b = this.a.b();
        if (!(b instanceof fipw)) {
            return true;
        }
        return true;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbon {
    public final cbov a;

    public cbon(cbov cbovVar) {
        this.a = cbovVar;
    }

    public final boolean a(int i) {
        if (i == 4 || i == 5) {
            return !this.a.d;
        }
        cbov cbovVar = this.a;
        return (cbovVar.d || cbovVar.d()) ? false : true;
    }

    public final boolean b() {
        if (this.a.d()) {
            return false;
        }
        cbov cbovVar = this.a;
        return !cbovVar.d || cbovVar.e == 1;
    }

    public final boolean c() {
        return !this.a.e();
    }

    public final boolean d() {
        return !this.a.f;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeif {
    public eenj a;
    public final String c;
    public final eein d;
    private eeie h;
    public eenj b = null;
    public long e = System.currentTimeMillis();
    private boolean g = false;
    public long f = 60000;

    public eeif(String str, eenj eenjVar, eein eeinVar) {
        this.a = null;
        this.c = str;
        this.a = eenjVar;
        this.d = eeinVar;
    }

    public static String j(eelv eelvVar) {
        eekg eekgVar = eelvVar.g;
        if (eekgVar == null) {
            return null;
        }
        return eelvVar.v(eekgVar.e(), 2);
    }

    public final int a() {
        eenl eenlVar;
        if (!g() || (eenlVar = (eenl) this.b) == null) {
            return -1;
        }
        return eenlVar.y();
    }

    public final eenl b() {
        if (g()) {
            return (eenl) this.b;
        }
        return null;
    }

    public final String c() {
        eenl b = b();
        if (b != null) {
            return b.A();
        }
        eeie eeieVar = this.h;
        if (eeieVar == null) {
            return null;
        }
        return eeieVar.c;
    }

    public final void d(eeie eeieVar) {
        synchronized (this) {
            this.g = true;
            this.h = eeieVar;
            notifyAll();
        }
        eein eeinVar = this.d;
        if (eeinVar != null) {
            eeinVar.a(this);
        }
    }

    public final void e(eenj eenjVar) {
        synchronized (this) {
            if (this.g) {
                return;
            }
            this.b = eenjVar;
            notify();
            eein eeinVar = this.d;
            if (eeinVar != null) {
                eeinVar.b(this);
            }
        }
    }

    public final boolean f() {
        eenj eenjVar = this.b;
        return eenjVar != null && ((eenk) eenjVar).z().equals("ACK");
    }

    public final boolean g() {
        eenj eenjVar = this.b;
        if (eenjVar != null) {
            return eenjVar.x();
        }
        return false;
    }

    public final int h(int i) {
        return i(0, i);
    }

    public final int i(int i, int i2) {
        if (i <= 0) {
            i = i2;
        }
        this.f = i * 1000;
        try {
            if (this.b != null) {
                return 1;
            }
            synchronized (this) {
                if (this.g) {
                    this.b = null;
                    return 3;
                }
                wait(this.f);
                if (this.g) {
                    this.b = null;
                    return 3;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.e > this.f) {
                    return 1;
                }
                this.e = currentTimeMillis;
                return i(0, i2);
            }
        } catch (InterruptedException unused) {
            this.b = null;
            return 2;
        }
    }
}

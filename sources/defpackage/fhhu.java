package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhhu {
    public static final fhhu a = new fhhu(new fhhs(new fhhk(String.valueOf(fhhl.f).concat(" TaskRunner"), true)));
    public static final Logger b;
    public boolean c;
    public long d;
    public final fhhs h;
    private int i = 10000;
    public final List e = new ArrayList();
    public final List f = new ArrayList();
    public final Runnable g = new fhht(this);

    static {
        Logger logger = Logger.getLogger(fhhu.class.getName());
        logger.getClass();
        b = logger;
    }

    public fhhu(fhhs fhhsVar) {
        this.h = fhhsVar;
    }

    public final fhhr a() {
        int i;
        synchronized (this) {
            i = this.i;
            this.i = i + 1;
        }
        return new fhhr(this, a.h(i, "Q"));
    }

    public final void b(fhho fhhoVar, long j) {
        byte[] bArr = fhhl.a;
        fhhr fhhrVar = fhhoVar.b;
        fhhrVar.getClass();
        if (fhhrVar.d != fhhoVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z = fhhrVar.f;
        fhhrVar.f = false;
        fhhrVar.d = null;
        this.e.remove(fhhrVar);
        if (j != -1 && !z && !fhhrVar.c) {
            fhhrVar.d(fhhoVar, j, true);
        }
        if (fhhrVar.e.isEmpty()) {
            return;
        }
        this.f.add(fhhrVar);
    }

    public final void c(fhhr fhhrVar) {
        byte[] bArr = fhhl.a;
        if (fhhrVar.d == null) {
            if (fhhrVar.e.isEmpty()) {
                this.f.remove(fhhrVar);
            } else {
                List list = this.f;
                if (!list.contains(fhhrVar)) {
                    list.add(fhhrVar);
                }
            }
        }
        if (this.c) {
            notify();
        } else {
            this.h.a(this.g);
        }
    }
}

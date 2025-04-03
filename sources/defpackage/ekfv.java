package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekfv implements ekcv {
    private final AtomicReference a;

    public ekfv(Map map, ekeg ekegVar) {
        this.a = new AtomicReference(new ekfu(map, ekegVar, false));
    }

    @Override // defpackage.ekcv
    public final ekah a(String str, ffji ffjiVar) {
        ekfu ekfuVar;
        ekfu ekfuVar2 = null;
        while (true) {
            ekfuVar = (ekfu) this.a.get();
            if (ekfuVar.b) {
                break;
            }
            if (ekfuVar2 == null) {
                ekfuVar2 = new ekfu(ekfuVar.c, ekfuVar.a, true);
            } else {
                enhk enhkVar = ekfuVar.c;
                enhkVar.getClass();
                ekfuVar2.c = enhkVar;
                ekeg ekegVar = ekfuVar.a;
                ekegVar.getClass();
                ekfuVar2.a = ekegVar;
            }
            if (ekft.a(this.a, ekfuVar, ekfuVar2)) {
                if (!ekfuVar.b) {
                    ffjiVar.invoke(ekfuVar.a);
                }
                ekfuVar = ekfuVar2;
            }
        }
        return (ekah) ffew.e(ekfuVar.c, str);
    }

    @Override // defpackage.ekcv
    public final ekeg b() {
        return ((ekfu) this.a.get()).a;
    }

    @Override // defpackage.ekcv
    public final void c() {
        throw new UnsupportedOperationException("Can't change observed values");
    }

    @Override // defpackage.ekcv
    public final boolean d() {
        return false;
    }

    @Override // defpackage.ekcv
    public final boolean e(Map map, ekeg ekegVar) {
        ekfu ekfuVar;
        ekfu ekfuVar2 = null;
        do {
            ekfuVar = (ekfu) this.a.get();
            if (ekfuVar.b) {
                return false;
            }
            if (ekfuVar2 == null) {
                ekfuVar2 = new ekfu(map, ekegVar, false);
            }
        } while (!ekft.a(this.a, ekfuVar, ekfuVar2));
        return true;
    }
}

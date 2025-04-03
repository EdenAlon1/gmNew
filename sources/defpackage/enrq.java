package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class enrq extends ensb implements ensk {
    protected enrq(Level level) {
        super(level);
    }

    @Override // defpackage.ensb
    protected final enwx b() {
        return enwv.a;
    }

    @Override // defpackage.ensb
    protected final boolean c(ensf ensfVar) {
        ents i = i();
        int b = i.b();
        int i2 = 0;
        while (true) {
            if (i2 >= b) {
                break;
            }
            if (i.c(i2).a != "eye3tag") {
                i2++;
            } else if (i.d(enrz.a) == null && i.d(enrz.i) == null) {
                n(enrz.i, ensy.SMALL);
            }
        }
        return super.c(ensfVar);
    }
}

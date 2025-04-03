package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ilh extends ilb {
    public final /* synthetic */ ili b;
    public int c = 1;

    public ilh(ili iliVar) {
        this.b = iliVar;
    }

    public final void a(iki ikiVar) {
        List list = ikiVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((iku) list.get(i)).c()) {
                if (this.c == 2) {
                    ioc iocVar = this.a;
                    if (iocVar == null) {
                        throw new IllegalStateException("layoutCoordinates not set");
                    }
                    ilo.a(ikiVar, iocVar.i(0L), new ile(this.b), true);
                }
                this.c = 3;
                return;
            }
        }
        ioc iocVar2 = this.a;
        if (iocVar2 == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        ilo.a(ikiVar, iocVar2.i(0L), new ilf(this, this.b), false);
        if (this.c == 2) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((iku) list.get(i2)).b();
            }
            ikd ikdVar = ikiVar.b;
            if (ikdVar == null) {
                return;
            }
            ikdVar.c = !this.b.b;
        }
    }

    public final void b() {
        this.c = 1;
        this.b.b = false;
    }
}

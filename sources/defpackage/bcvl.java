package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bcvl extends ArrayList implements bcvm {
    @Override // defpackage.bcvm
    public final void b(bcvr bcvrVar, int i) {
        emxf.l(efbd.g());
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            bcvm bcvmVar = (bcvm) get(i2);
            ekzz f = eleg.f("DraftMessageDataEventDispatcher#onDraftChanged");
            try {
                bcvmVar.b(bcvrVar, i);
                f.close();
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.bcvm
    public final void fs() {
        emxf.l(efbd.g());
        int size = size();
        for (int i = 0; i < size; i++) {
            ((bcvm) get(i)).fs();
        }
    }

    @Override // defpackage.bcvm
    public final void ft(bcvr bcvrVar) {
        emxf.l(efbd.g());
        int size = size();
        for (int i = 0; i < size; i++) {
            ((bcvm) get(i)).ft(bcvrVar);
        }
    }

    @Override // defpackage.bcvm
    public final void fv(bcvr bcvrVar) {
        emxf.l(efbd.g());
        int size = size();
        for (int i = 0; i < size; i++) {
            ((bcvm) get(i)).fv(bcvrVar);
        }
    }
}

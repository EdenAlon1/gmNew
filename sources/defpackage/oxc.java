package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oxc {
    public final owz a;
    public boolean d;
    public Bundle e;
    public boolean f;
    private final ffix h;
    public final oxd b = new oxd();
    public final Map c = new LinkedHashMap();
    public boolean g = true;

    public oxc(owz owzVar, ffix ffixVar) {
        this.a = owzVar;
        this.h = ffixVar;
    }

    public final void a() {
        if (this.a.P().a() != lkj.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.d) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.h.invoke();
        this.a.P().c(new lkp() { // from class: oxb
            @Override // defpackage.lkp
            public final void hg(lkr lkrVar, lki lkiVar) {
                boolean z;
                oxc oxcVar = oxc.this;
                if (lkiVar == lki.ON_START) {
                    z = true;
                } else if (lkiVar != lki.ON_STOP) {
                    return;
                } else {
                    z = false;
                }
                oxcVar.g = z;
            }
        });
        this.d = true;
    }
}

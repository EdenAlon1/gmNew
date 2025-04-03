package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alhj {
    private final cskc a = cskc.g("Bugle", "LogEmitter");
    private final ffbr b;
    private final boolean c;

    public alhj(ffbr ffbrVar, csxu csxuVar) {
        this.b = ffbrVar;
        this.c = csxuVar.i("bugle_enable_analytics", true);
    }

    public final boolean a(Supplier supplier) {
        Object obj;
        boolean z = false;
        if (!this.c) {
            this.a.m("Clearcut loggings are disabled.");
            return false;
        }
        try {
            obj = supplier.get();
            eolu eoluVar = (eolu) obj;
            if (1 == (((eolv) eoluVar.instance).b & 1)) {
                z = true;
            }
            emxf.a(z);
            ((akxl) this.b.b()).j(eoluVar);
        } catch (Throwable th) {
            this.a.o("Failed to emit event", th);
        }
        return true;
    }
}

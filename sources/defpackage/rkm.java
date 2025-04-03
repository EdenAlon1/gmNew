package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rkm implements kst {
    private final rkl a;
    private final rko b;
    private final kst c;

    public rkm(kst kstVar, rkl rklVar, rko rkoVar) {
        this.c = kstVar;
        this.a = rklVar;
        this.b = rkoVar;
    }

    @Override // defpackage.kst
    public final Object a() {
        Object a = this.c.a();
        if (a == null) {
            a = this.a.a();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new ".concat(String.valueOf(String.valueOf(a.getClass()))));
            }
        }
        if (a instanceof rkn) {
            ((rkq) ((rkn) a).eW()).a = false;
        }
        return a;
    }

    @Override // defpackage.kst
    public final boolean b(Object obj) {
        if (obj instanceof rkn) {
            ((rkq) ((rkn) obj).eW()).a = true;
        }
        this.b.a(obj);
        return this.c.b(obj);
    }
}

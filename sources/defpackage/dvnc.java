package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvnc implements erqj {
    final /* synthetic */ dvnd a;

    public dvnc(dvnd dvndVar) {
        this.a = dvndVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Map map = (Map) obj;
        synchronized (this.a) {
            dvnd dvndVar = this.a;
            if (!dvndVar.b) {
                dvndVar.a = new HashMap(map);
            }
            this.a.d = null;
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        synchronized (this.a) {
            this.a.d = null;
        }
    }
}

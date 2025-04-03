package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fekj {
    private ArrayList b = new ArrayList();
    public volatile fdyc a = fdyc.IDLE;

    final void a(fdyc fdycVar) {
        fdycVar.getClass();
        if (this.a == fdycVar || this.a == fdyc.SHUTDOWN) {
            return;
        }
        this.a = fdycVar;
        if (this.b.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.b;
        this.b = new ArrayList();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }
}

package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rhf implements rgj {
    final /* synthetic */ rhj a;

    public rhf(rhj rhjVar) {
        this.a = rhjVar;
    }

    @Override // defpackage.rgj
    public final void a(boolean z) {
        ArrayList arrayList;
        rkh.j();
        synchronized (this.a) {
            arrayList = new ArrayList(this.a.a);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((rgj) arrayList.get(i)).a(z);
        }
    }
}

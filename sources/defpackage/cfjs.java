package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfjs implements ceuw {
    final /* synthetic */ cfjt a;

    public cfjs(cfjt cfjtVar) {
        this.a = cfjtVar;
    }

    @Override // defpackage.ceuw
    public final ceva a() {
        return ceva.j("WorkQueueTikTokWorker", engq.a(this.a.c));
    }

    @Override // defpackage.ceuw
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // defpackage.ceuw
    public final boolean c() {
        ffmj ffmjVar = new ffmj(0, this.a.c.size());
        ArrayList arrayList = new ArrayList(ffdx.n(ffmjVar, 10));
        ffev it = ffmjVar.iterator();
        while (((ffmi) it).a) {
            arrayList.add(Boolean.valueOf(d(it.a())));
        }
        return ffdx.at(arrayList);
    }

    @Override // defpackage.ceuw
    public final boolean d(int i) {
        ceze cezeVar = (ceze) ffdx.N(this.a.c, i);
        if (cezeVar != null) {
            if (cezeVar.k() <= ((cetj) this.a.a.a()).d) {
                return true;
            }
        }
        return false;
    }
}

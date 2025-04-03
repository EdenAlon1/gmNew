package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kro implements ksp {
    final /* synthetic */ String a;

    public kro(String str) {
        this.a = str;
    }

    @Override // defpackage.ksp
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        krp krpVar = (krp) obj;
        synchronized (krq.c) {
            ArrayList arrayList = (ArrayList) krq.d.get(this.a);
            if (arrayList == null) {
                return;
            }
            krq.d.remove(this.a);
            for (int i = 0; i < arrayList.size(); i++) {
                ((ksp) arrayList.get(i)).accept(krpVar);
            }
        }
    }
}

package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejzj implements ejze {
    final /* synthetic */ ejzm a;

    public ejzj(ejzm ejzmVar) {
        this.a = ejzmVar;
    }

    @Override // defpackage.ejze
    public final void a(List list, List list2, emwj emwjVar, vk vkVar) {
        int min = Math.min(list.size(), list2.size());
        int i = 0;
        if (emwjVar == null) {
            while (i < min) {
                if (!efaz.a(list.get(i), list2.get(i))) {
                    this.a.q(i);
                }
                i++;
            }
            return;
        }
        while (i < min) {
            Object obj = list.get(i);
            Object obj2 = list2.get(i);
            if (!emwjVar.d(obj, obj2)) {
                this.a.y(i);
                this.a.s(i);
            } else if (!efaz.a(obj, obj2)) {
                this.a.q(i);
            }
            i++;
        }
    }
}

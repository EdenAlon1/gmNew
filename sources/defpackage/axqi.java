package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axqi implements ffxy {
    final /* synthetic */ List a;
    final /* synthetic */ ffxy b;

    public axqi(List list, ffxy ffxyVar) {
        this.a = list;
        this.b = ffxyVar;
    }

    @Override // defpackage.ffxy
    public final Object fQ(Object obj, ffgu ffguVar) {
        this.a.add(obj);
        if (this.a.size() == 100) {
            List list = this.a;
            List ak = ffdx.ak(list);
            list.clear();
            Object fQ = this.b.fQ(ak, ffguVar);
            if (fQ == ffhh.a) {
                return fQ;
            }
        }
        return ffcu.a;
    }
}

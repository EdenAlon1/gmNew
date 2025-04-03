package defpackage;

import java.util.ArrayList;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajxu extends ffhv implements ffjm {
    final /* synthetic */ UUID a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajxu(ffgu ffguVar, UUID uuid) {
        super(2, ffguVar);
        this.a = uuid;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajxu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String[] strArr = bxmu.a;
        bxmp bxmpVar = new bxmp(bxmu.a);
        bxmpVar.z("getAttachmentMetadata");
        bxmpVar.c(ajxv.a);
        bxkz a = bxle.a();
        a.c(new ajxw(this.a));
        engw y = ((bxmp) bxmpVar.j(dtvz.i(a.b(), bxle.c.a, bxmu.b.b))).b().y();
        y.getClass();
        ArrayList arrayList = new ArrayList();
        enqv it = y.iterator();
        while (it.hasNext()) {
            akcg l = ((bxlk) it.next()).l();
            if (l != null) {
                arrayList.add(l);
            }
        }
        return ffdx.ak(arrayList);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajxu ajxuVar = new ajxu(ffguVar, this.a);
        ajxuVar.b = obj;
        return ajxuVar;
    }
}

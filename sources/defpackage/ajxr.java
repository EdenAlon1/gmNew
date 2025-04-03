package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajxr extends ffhv implements ffjm {
    final /* synthetic */ ajyr a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajxr(ffgu ffguVar, ajyr ajyrVar) {
        super(2, ffguVar);
        this.a = ajyrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajxr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bxkz a = bxle.a();
        a.z("RestoreWorkflowSettingsService#getAllRestoreExecutionsWaitingForAppUpdate");
        a.r();
        a.c(ajxs.a);
        engw y = a.b().y();
        y.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(y, 10));
        enqv it = y.iterator();
        while (it.hasNext()) {
            bxjb bxjbVar = (bxjb) it.next();
            bxjbVar.getClass();
            arrayList.add(ajyr.y(bxjbVar));
        }
        return ffdx.ak(arrayList);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajxr ajxrVar = new ajxr(ffguVar, this.a);
        ajxrVar.b = obj;
        return ajxrVar;
    }
}

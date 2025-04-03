package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axnl extends ffhv implements ffjm {
    final /* synthetic */ axnm a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axnl(axnm axnmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = axnmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axnl) c((ffxe) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ffxe ffxeVar = (ffxe) this.b;
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            axol.k(ffxeVar, null, new axnk(ffxeVar, (ffji) it.next(), null), 3);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axnl axnlVar = new axnl(this.a, ffguVar);
        axnlVar.b = obj;
        return axnlVar;
    }
}

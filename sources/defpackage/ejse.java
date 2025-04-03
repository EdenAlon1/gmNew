package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejse extends ffhv implements ffjm {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ ffxx c;
    final /* synthetic */ ffjn d;
    final /* synthetic */ ffji e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejse(Object obj, ffxx ffxxVar, ffjn ffjnVar, ffji ffjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = obj;
        this.c = ffxxVar;
        this.d = ffjnVar;
        this.e = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ejse) c((ffxe) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxe ffxeVar = (ffxe) this.f;
            fgjf fgjfVar = new fgjf();
            ArrayList arrayList = new ArrayList();
            fflb fflbVar = new fflb();
            fflbVar.a = new ejtb(this.b);
            ejsd ejsdVar = new ejsd(this.c, fgjfVar, fflbVar, this.d, this.e, arrayList, ffxeVar, null);
            this.a = 1;
            if (ffvg.a(ejsdVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ejse ejseVar = new ejse(this.b, this.c, this.d, this.e, ffguVar);
        ejseVar.f = obj;
        return ejseVar;
    }
}

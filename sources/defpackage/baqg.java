package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baqg extends ffhv implements ffjm {
    final /* synthetic */ bara a;
    final /* synthetic */ fflb b;
    final /* synthetic */ coux c;
    final /* synthetic */ ffkx d;
    final /* synthetic */ int e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baqg(ffgu ffguVar, bara baraVar, fflb fflbVar, coux couxVar, ffkx ffkxVar, int i) {
        super(2, ffguVar);
        this.a = baraVar;
        this.b = fflbVar;
        this.c = couxVar;
        this.d = ffkxVar;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((baqg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((cukj) this.a.o.b()).a((MessageCoreData) this.b.a, null, null);
        eoop eoopVar = (eoop) eopq.a.createBuilder();
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopqVar.aw = 5;
        eopqVar.d |= 2048;
        eoopVar.copyOnWrite();
        eopq eopqVar2 = (eopq) eoopVar.instance;
        boolean z = true;
        eopqVar2.g = 1;
        eopqVar2.b |= 1;
        coux couxVar = this.c;
        if (couxVar != null) {
            if (!couxVar.m && !this.d.a) {
                z = false;
            }
            eoopVar.copyOnWrite();
            eopq eopqVar3 = (eopq) eoopVar.instance;
            eopqVar3.c |= 1073741824;
            eopqVar3.aj = z;
        }
        altk altkVar = (altk) this.a.m.b();
        MessageCoreData messageCoreData = (MessageCoreData) this.b.a;
        int i = this.e;
        eoopVar.copyOnWrite();
        eopq eopqVar4 = (eopq) eoopVar.instance;
        eopqVar4.h = 2;
        eopqVar4.b = 2 | eopqVar4.b;
        altkVar.O(messageCoreData, i, eoopVar);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        baqg baqgVar = new baqg(ffguVar, this.a, this.b, this.c, this.d, this.e);
        baqgVar.f = obj;
        return baqgVar;
    }
}

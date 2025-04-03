package defpackage;

import com.google.android.apps.messaging.dittosatellite.intent.DittoAttachment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acsp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ acsu c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acsp(ffgu ffguVar, List list, acsu acsuVar) {
        super(2, ffguVar);
        this.b = list;
        this.c = acsuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((acsp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ffsk ffskVar = (ffsk) this.d;
            List<DittoAttachment> list = this.b;
            ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
            for (DittoAttachment dittoAttachment : list) {
                ffhe ffheVar = ffhe.a;
                arrayList.add(ffra.b(ffskVar, ekxi.a(ffheVar), ffsm.a, new acsq(null, dittoAttachment, this.c)));
            }
            this.a = 1;
            obj = ffqv.a(arrayList, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffdx.aa((Iterable) obj);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        acsp acspVar = new acsp(ffguVar, this.b, this.c);
        acspVar.d = obj;
        return acspVar;
    }
}

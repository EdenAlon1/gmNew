package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjl extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ HashMap c;
    final /* synthetic */ zjt d;
    final /* synthetic */ ffsk e;
    final /* synthetic */ ffix f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjl(ffgu ffguVar, HashMap hashMap, zjt zjtVar, ffsk ffskVar, ffix ffixVar) {
        super(3, ffguVar);
        this.c = hashMap;
        this.d = zjtVar;
        this.e = ffskVar;
        this.f = ffixVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        zjl zjlVar = new zjl((ffgu) obj3, this.c, this.d, this.e, this.f);
        zjlVar.g = (ffxy) obj;
        zjlVar.b = obj2;
        return zjlVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r12 = this.g;
            engw<MessageId> engwVar = (engw) this.b;
            this.c.keySet().retainAll(engwVar);
            ArrayList arrayList = new ArrayList(ffdx.n(engwVar, 10));
            for (MessageId messageId : engwVar) {
                HashMap hashMap = this.c;
                Object obj2 = hashMap.get(messageId);
                if (obj2 == null) {
                    ffxx a = aqfu.a(this.d.b.h(messageId));
                    zjr zjrVar = new zjr(null, this.d, this.f);
                    int i2 = fgau.a;
                    fgen fgenVar = new fgen(zjrVar, a);
                    ffsk ffskVar = this.e;
                    int i3 = fgcz.a;
                    obj2 = fgbn.a(fgenVar, ffskVar, fgcy.a, 1);
                    hashMap.put(messageId, obj2);
                }
                arrayList.add((fgcq) obj2);
            }
            ffzd ffzdVar = new ffzd(new zjq((ffxx[]) ffdx.ak(arrayList).toArray(new ffxx[0])), new zjs(null));
            this.a = 1;
            if (ffyk.c(r12, ffzdVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}

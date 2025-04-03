package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zez extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ HashMap c;
    final /* synthetic */ ffji d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zez(ffgu ffguVar, HashMap hashMap, ffji ffjiVar) {
        super(3, ffguVar);
        this.c = hashMap;
        this.d = ffjiVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        zez zezVar = new zez((ffgu) obj3, this.c, this.d);
        zezVar.e = (ffxy) obj;
        zezVar.b = obj2;
        return zezVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffxx ffxxVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r6 = this.e;
            alxr alxrVar = (alxr) this.b;
            if (alxrVar == null) {
                this.c.clear();
                ffxxVar = new ffyg(null);
            } else {
                this.c.keySet().retainAll(fffi.b(alxrVar.b()));
                HashMap hashMap = this.c;
                MessageId b = alxrVar.b();
                Object obj2 = hashMap.get(b);
                if (obj2 == null) {
                    obj2 = (fgcq) this.d.invoke(alxrVar);
                    hashMap.put(b, obj2);
                }
                ffxxVar = (ffxx) obj2;
            }
            this.a = 1;
            if (ffyk.c(r6, ffxxVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}

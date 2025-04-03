package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajmm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ajmw b;
    final /* synthetic */ ResolvedRecipient c;
    Object d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajmm(ffgu ffguVar, ajmw ajmwVar, ResolvedRecipient resolvedRecipient) {
        super(2, ffguVar);
        this.b = ajmwVar;
        this.c = resolvedRecipient;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajmm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Map map;
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            obj2 = this.d;
            map = (Map) this.e;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ajmw ajmwVar = this.b;
            ResolvedRecipient resolvedRecipient = this.c;
            ConcurrentHashMap concurrentHashMap = ajmwVar.l;
            aqkv F = resolvedRecipient.F();
            elfl b = resolvedRecipient.E(2).b();
            b.getClass();
            this.e = concurrentHashMap;
            this.d = F;
            this.a = 1;
            Object c = fgfz.c(b, this);
            if (c == ffhhVar) {
                return ffhhVar;
            }
            map = concurrentHashMap;
            obj = c;
            obj2 = F;
        }
        map.put(obj2, obj);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajmm ajmmVar = new ajmm(ffguVar, this.b, this.c);
        ajmmVar.e = obj;
        return ajmmVar;
    }
}

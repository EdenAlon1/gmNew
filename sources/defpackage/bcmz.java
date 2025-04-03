package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bcmz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bcna b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcmz(bcna bcnaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bcnaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bcmz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            bcna bcnaVar = this.b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : bcnaVar.b.entrySet()) {
                if (!((Boolean) entry.getValue()).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Set keySet = linkedHashMap.keySet();
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                this.b.b.put((ConversationIdType) it.next(), true);
            }
            bcll bcllVar = (bcll) this.b.a.b();
            engw a = engq.a(keySet);
            this.a = 1;
            if (bcllVar.b(a, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bcmz(this.b, ffguVar);
    }
}

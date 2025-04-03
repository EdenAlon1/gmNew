package defpackage;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aelz {
    public final Set a;
    private final Map b;

    public aelz(Map map, Set set) {
        this.b = map;
        this.a = set;
    }

    public final Collection a(aeki aekiVar) {
        if (aekiVar.t() != amny.c) {
            return ((enhk) this.b).values();
        }
        aema aemaVar = (aema) this.b.get(aemb.SNIPPET);
        aemaVar.getClass();
        aema aemaVar2 = (aema) this.b.get(aemb.AVATAR);
        aemaVar2.getClass();
        aema aemaVar3 = (aema) this.b.get(aemb.NAME);
        aemaVar3.getClass();
        aema aemaVar4 = (aema) this.b.get(aemb.STATUS);
        aemaVar4.getClass();
        aema aemaVar5 = (aema) this.b.get(aemb.TIMESTAMP);
        aemaVar5.getClass();
        aema aemaVar6 = (aema) this.b.get(aemb.CONTENT_DESCRIPTION);
        aemaVar6.getClass();
        return engw.w(aemaVar, aemaVar2, aemaVar3, aemaVar4, aemaVar5, aemaVar6);
    }

    public final aely b(aeki aekiVar, Map map, String str) {
        aelx aj = aely.aj();
        aj.b(aekiVar);
        aj.e(aeja.a(aekiVar));
        aj.l(aeja.c(aekiVar));
        aelu aeluVar = (aelu) aj;
        aeluVar.w = (bduq) map.get(((aekd) aekiVar).d);
        aj.c(TextUtils.equals(aekiVar.ak("conversation_contains_vsms_participant"), "1"));
        aj.d(aekiVar.al());
        aeluVar.D = str;
        aeluVar.J = null;
        Iterator it = a(aekiVar).iterator();
        while (it.hasNext()) {
            ((aema) it.next()).e(aj, aekiVar);
        }
        return aj.a();
    }
}

package defpackage;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azjp extends ffhv implements ffjm {
    final /* synthetic */ List a;
    final /* synthetic */ azjr b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azjp(ffgu ffguVar, List list, azjr azjrVar) {
        super(2, ffguVar);
        this.a = list;
        this.b = azjrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azjp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object apply;
        ffci.b(obj);
        List list = this.a;
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(azcm.a((azhq) it.next()));
        }
        String[] strArr = azjm.a;
        azjj azjjVar = new azjj(azjm.a);
        azjjVar.z("getGroups");
        apply = new azjq(arrayList).apply(new azjl());
        azjjVar.k(new azjk((azjl) apply));
        int i = 2;
        azjjVar.s(azhc.b.a, 2);
        azjjVar.v(azjm.b.a);
        engw y = azjjVar.b().y();
        y.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(y, 10)), 16));
        enqv it2 = y.iterator();
        while (it2.hasNext()) {
            azhv azhvVar = (azhv) it2.next();
            azhvVar.az(0, "token");
            Object obj2 = azhvVar.a.b;
            obj2.getClass();
            azhq azhqVar = new azhq((UUID) obj2);
            azhvVar.getClass();
            azhvVar.az(1, "group_type");
            azhr azhrVar = azhvVar.b;
            if (azhrVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int ordinal = azhrVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    throw new ffcd();
                }
                throw new ffce("An operation is not implemented: GroupDetails for MMS is not yet implemented.");
            }
            azhvVar.az(i, "rcs_conference_uri");
            String str = azhvVar.c;
            azff azffVar = str != null ? new azff(str) : null;
            azhvVar.az(5, "rcs_group_state");
            azfm azfmVar = azhvVar.f;
            azfmVar.getClass();
            azhvVar.az(3, "name");
            String str2 = azhvVar.d;
            azhvVar.az(4, "rcs_icon_url");
            String str3 = azhvVar.e;
            azhvVar.az(6, "tachygram_group_routing_token");
            byte[] bArr = azhvVar.g;
            eyee a = bArr != null ? eyjw.a(bArr) : null;
            azhvVar.az(7, "rcs_group_capabilities");
            cknh cknhVar = azhvVar.h;
            cknhVar.getClass();
            azhvVar.az(8, "rcs_group_last_sync_timestamp");
            Instant instant = azhvVar.i;
            instant.getClass();
            azfl azflVar = new azfl(azffVar, azfmVar, str2, str3, a, cknhVar, instant);
            dtro[] aG = azhvVar.aG("group_members", new azge[0]);
            aG.getClass();
            azge[] azgeVarArr = (azge[]) aG;
            ArrayList arrayList2 = new ArrayList(azgeVarArr.length);
            for (azge azgeVar : azgeVarArr) {
                azgeVar.az(1, "destination_token");
                azcr azcrVar = azgeVar.b;
                azcrVar.getClass();
                arrayList2.add(new azfx(azcrVar, null));
            }
            ffcf ffcfVar = new ffcf(azhqVar, new azfj(azflVar, ffdx.ar(arrayList2)));
            linkedHashMap.put(ffcfVar.a, ffcfVar.b);
            i = 2;
        }
        return linkedHashMap;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        azjp azjpVar = new azjp(ffguVar, this.a, this.b);
        azjpVar.c = obj;
        return azjpVar;
    }
}

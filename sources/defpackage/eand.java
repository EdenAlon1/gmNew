package defpackage;

import android.os.Bundle;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eand extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ eanj c;
    final /* synthetic */ Bundle d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eand(eanj eanjVar, Bundle bundle, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = eanjVar;
        this.d = bundle;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eand) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ArrayList arrayList;
        eand eandVar;
        LinkedHashMap linkedHashMap;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            ffci.b(obj);
            eandVar = this;
            linkedHashMap = obj2;
        } else {
            ffci.b(obj);
            eanj.a.o().q("Executing GnpRegistrationJob");
            Bundle bundle = this.d;
            eaur eaurVar = eaur.a;
            eyfc a = eyfc.a();
            Object parcelable = bundle.getParcelable("GNP_ACCOUNTS_TO_REGISTER");
            if (parcelable instanceof Bundle) {
                Bundle bundle2 = (Bundle) parcelable;
                bundle2.setClassLoader(ProtoParsers.InternalDontUse.class.getClassLoader());
                arrayList = bundle2.getParcelableArrayList("protoparsers");
            } else {
                arrayList = (ArrayList) parcelable;
            }
            ArrayList<eaur> arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(ProtoParsers.b((ProtoParsers.InternalDontUse) it.next(), eaurVar, a));
            }
            ArrayList arrayList3 = new ArrayList(ffdx.n(arrayList2, 10));
            for (eaur eaurVar2 : arrayList2) {
                eaurVar2.getClass();
                arrayList3.add(eaus.a(eaurVar2));
            }
            List<eagt> f = this.c.b.f();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(f, 10)), 16));
            for (eagt eagtVar : f) {
                linkedHashMap2.put(eagtVar.s(), eagtVar);
            }
            exyd exydVar = exyd.values()[this.d.getInt("GNP_REGISTRATION_REASON")];
            eagp eagpVar = eagp.values()[this.d.getInt("GNP_FCM_TARGET_TYPE")];
            eamb eambVar = eamb.values()[this.d.getInt("GNP_ACCOUNT_TYPE_GROUP")];
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                if (arrayList3.contains((easy) entry.getKey())) {
                    linkedHashMap3.put(entry.getKey(), entry.getValue());
                }
            }
            eanj eanjVar = this.c;
            this.a = linkedHashMap3;
            this.b = 1;
            eandVar = this;
            Object k = eanjVar.k(arrayList3, linkedHashMap2, exydVar, eagpVar, eambVar, eandVar);
            if (k == ffhhVar) {
                return ffhhVar;
            }
            linkedHashMap = linkedHashMap3;
            obj = k;
        }
        eafl eaflVar = (eafl) obj;
        eandVar.c.c.a(linkedHashMap, eaflVar);
        return eald.a.a(eaflVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eand(this.c, this.d, ffguVar);
    }
}

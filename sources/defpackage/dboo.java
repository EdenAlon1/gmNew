package defpackage;

import j$.time.Instant;
import j$.util.DateRetargetClass;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dboo extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ dbpe d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dboo(dbpe dbpeVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.d = dbpeVar;
    }

    @Override // defpackage.ffjo
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5 = ((ffch) obj2).a;
        dboo dbooVar = new dboo(this.d, (ffgu) obj4);
        dbooVar.a = (List) obj;
        dbooVar.b = new ffch(obj5);
        dbooVar.c = (Map) obj3;
        return dbooVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Instant instant;
        int i;
        Object obj2;
        ffci.b(obj);
        ?? r1 = this.a;
        Object obj3 = ((ffch) this.b).a;
        if (true == (obj3 instanceof ffcg)) {
            obj3 = null;
        }
        ?? r3 = this.c;
        engw engwVar = (engw) obj3;
        if (engwVar == null) {
            return ffel.a;
        }
        List ak = ffdx.ak(engwVar);
        ArrayList<cfdx> arrayList = new ArrayList();
        for (Object obj4 : ak) {
            cfdx cfdxVar = (cfdx) obj4;
            Iterator it = r1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (ffkj.e(((dbqc) obj2).a, cfdxVar.l())) {
                    break;
                }
            }
            if (obj2 == null) {
                arrayList.add(obj4);
            }
        }
        ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
        for (cfdx cfdxVar2 : arrayList) {
            String l = cfdxVar2.l();
            l.getClass();
            cfdxVar2.az(2, "scheduled_at_time");
            Instant instant2 = DateRetargetClass.toInstant(cfdxVar2.c);
            instant2.getClass();
            cfdxVar2.getClass();
            poh pohVar = new poh();
            cfdxVar2.az(5, "requires_charging");
            pohVar.a = cfdxVar2.f;
            cfdxVar2.az(6, "requires_device_idle");
            pohVar.b = cfdxVar2.g;
            cfdxVar2.az(8, "requires_storage_not_low");
            pohVar.d = cfdxVar2.i;
            cfdxVar2.az(7, "requires_battery_not_low");
            pohVar.c = cfdxVar2.h;
            cfdxVar2.az(4, "requires_network_type");
            int i2 = cfdxVar2.e;
            int[] iArr = {1, 2, 3, 4, 5, 6};
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i4 >= 6) {
                    instant = null;
                    i = 0;
                    break;
                }
                i = iArr[i4];
                instant = null;
                int i5 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i5 == i2) {
                    break;
                }
                i4++;
            }
            pohVar.c(i == 0 ? 1 : i);
            poj a = pohVar.a();
            cfdxVar2.az(3, "minimum_start_time");
            Date date = cfdxVar2.d;
            Instant instant3 = date != null ? DateRetargetClass.toInstant(date) : instant;
            Optional k = cfdxVar2.k();
            k.getClass();
            UUID uuid = (UUID) fflm.b(k);
            Integer num = (Integer) r3.get(uuid != null ? uuid.toString() : instant);
            if (num != null) {
                i3 = num.intValue();
            }
            arrayList2.add(new dbqd(l, instant2, a, instant3, i3));
        }
        return arrayList2;
    }
}

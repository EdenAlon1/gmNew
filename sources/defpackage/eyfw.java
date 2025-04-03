package defpackage;

import defpackage.eyhs;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyfw<ContainingType extends eyhs, Type> extends eyfa<ContainingType, Type> {
    final eyhs a;
    public final Object b;
    final eyhs c;
    public final eyfv d;

    public eyfw(eyhs eyhsVar, Object obj, eyhs eyhsVar2, eyfv eyfvVar) {
        if (eyhsVar == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (eyfvVar.c == eyjr.MESSAGE && eyhsVar2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.a = eyhsVar;
        this.b = obj;
        this.c = eyhsVar2;
        this.d = eyfvVar;
    }

    @Override // defpackage.eyfa
    public final int a() {
        return this.d.b;
    }

    public final eyjr b() {
        return this.d.c;
    }

    public final Object c(Object obj) {
        eyfv eyfvVar = this.d;
        if (!eyfvVar.d) {
            return d(obj);
        }
        if (eyfvVar.a() != eyjs.ENUM) {
            return obj;
        }
        eyic eyicVar = new eyic(eyic.a, 0, true);
        List list = (List) obj;
        eyicVar.d(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eyicVar.add(d(it.next()));
        }
        eyicVar.b();
        return eyicVar;
    }

    final Object d(Object obj) {
        if (this.d.a() != eyjs.ENUM) {
            return obj;
        }
        eyfv eyfvVar = this.d;
        return eyfvVar.a.a(((Integer) obj).intValue());
    }

    final Object e(Object obj) {
        return this.d.a() == eyjs.ENUM ? Integer.valueOf(((eyge) obj).a()) : obj;
    }

    public final boolean f() {
        return this.d.d;
    }
}

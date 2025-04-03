package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dqqb extends dqqj {
    public static final Map a;
    private static final List b;
    private static final Map c;
    private final ffbz d = ffca.a(new ffix() { // from class: dqpy
        @Override // defpackage.ffix
        public final Object invoke() {
            dqqb dqqbVar = dqqb.this;
            boolean z = true;
            if ((dqqbVar.b() != dqnw.d || dqqbVar.c() != dqnw.c) && (dqqbVar.b() != dqnw.c || dqqbVar.c() != dqnw.d)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    });

    static {
        ffbz ffbzVar = dqnz.a;
        EnumSet a2 = dqny.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : a2) {
            if (((dqnz) obj) != dqnz.b) {
                arrayList.add(obj);
            }
        }
        b = arrayList;
        c = ffew.g(new ffcf(dqnw.b, "🧑"), new ffcf(dqnw.c, "👩"), new ffcf(dqnw.d, "👨"));
        dqnw dqnwVar = dqnw.c;
        dqnw dqnwVar2 = dqnw.d;
        dqnw dqnwVar3 = dqnw.b;
        a = ffew.g(new ffcf(new ffcf(dqnwVar, dqnwVar), "👭"), new ffcf(new ffcf(dqnwVar2, dqnwVar2), "👬"), new ffcf(new ffcf(dqnwVar, dqnwVar2), "👫"), new ffcf(new ffcf(dqnwVar3, dqnwVar3), "🧑\u200d🤝\u200d🧑"));
    }

    public static final void h(dqnz dqnzVar, dqnz dqnzVar2, dqnw dqnwVar, dqnw dqnwVar2, StringBuilder sb) {
        dqnwVar.getClass();
        dqnwVar2.getClass();
        Map map = c;
        sb.append((String) map.get(dqnwVar));
        dqql dqqlVar = dqnzVar.h;
        if (dqqlVar != null) {
            sb.append(dqqlVar.a());
        }
        sb.append(dqof.c.a());
        sb.append("🤝");
        sb.append(dqof.c.a());
        sb.append((String) map.get(dqnwVar2));
        dqql dqqlVar2 = dqnzVar2.h;
        if (dqqlVar2 != null) {
            sb.append(dqqlVar2.a());
        }
    }

    public abstract dqnw b();

    public abstract dqnw c();

    public abstract dqoa d(dqnz dqnzVar, dqnz dqnzVar2);

    public abstract Set e();

    @Override // defpackage.dqqj
    public final Set f() {
        List<dqnz> list = b;
        LinkedHashSet linkedHashSet = new LinkedHashSet(list.size() * list.size());
        for (dqnz dqnzVar : list) {
            for (dqnz dqnzVar2 : b) {
                dqnzVar.getClass();
                dqnzVar2.getClass();
                linkedHashSet.add(d(dqnzVar, dqnzVar2));
            }
        }
        return linkedHashSet;
    }

    public final boolean g() {
        return ((Boolean) this.d.a()).booleanValue();
    }
}

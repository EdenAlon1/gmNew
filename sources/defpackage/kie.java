package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kie {
    public static final Integer c = 0;
    private int a;
    public boolean d = true;
    public final HashMap e;
    public final HashMap f;
    public final HashMap g;
    public final khs h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public kgs l;

    public kie() {
        HashMap hashMap = new HashMap();
        this.e = hashMap;
        this.f = new HashMap();
        this.g = new HashMap();
        khs khsVar = new khs(this);
        this.h = khsVar;
        this.a = 0;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        Integer num = c;
        khsVar.a = num;
        hashMap.put(num, khsVar);
    }

    public final int a(Object obj) {
        return Math.round(((Float) obj).floatValue());
    }

    public final khs b(Object obj) {
        kib kibVar = (kib) this.e.get(obj);
        kib kibVar2 = kibVar;
        if (kibVar == null) {
            khs khsVar = new khs(this);
            this.e.put(obj, khsVar);
            khsVar.a = obj;
            kibVar2 = khsVar;
        }
        if (kibVar2 instanceof khs) {
            return (khs) kibVar2;
        }
        return null;
    }

    public final kim c() {
        return (kim) h(1);
    }

    public final kin d() {
        return (kin) h(2);
    }

    public final void e(Object obj) {
        this.i.add(obj);
        this.k = true;
    }

    public final boolean f() {
        return !this.d;
    }

    public final void g(Object obj, int i) {
        khs b = b(obj);
        kii kiiVar = b.c;
        if (kiiVar == null || !(kiiVar instanceof kil)) {
            kil kilVar = new kil(this);
            kilVar.b = i;
            kilVar.f = obj;
            b.g(kilVar);
        }
    }

    public final kia h(int i) {
        StringBuilder sb = new StringBuilder("__HELPER_KEY_");
        int i2 = this.a;
        this.a = i2 + 1;
        sb.append(i2);
        sb.append("__");
        String sb2 = sb.toString();
        kia kiaVar = (kia) this.f.get(sb2);
        if (kiaVar != null) {
            return kiaVar;
        }
        kia kinVar = i + (-1) != 0 ? new kin(this) : new kim(this);
        kinVar.a = sb2;
        this.f.put(sb2, kinVar);
        return kinVar;
    }
}

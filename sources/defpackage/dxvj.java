package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxvj {
    public final boolean a;
    private final Object b;
    private final Object c;

    public dxvj(boolean z, Object obj, Object obj2) {
        this.a = z;
        this.b = obj;
        this.c = obj2;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean e(dxvj dxvjVar, dxvj dxvjVar2, Comparator comparator) {
        Object obj;
        if (dxvjVar == null || !dxvjVar.a || (obj = dxvjVar.b) == null || dxvjVar2 == null || !dxvjVar2.a || dxvjVar2.b == null) {
            return c(dxvjVar, dxvjVar2);
        }
        ArrayList arrayList = new ArrayList((Collection) obj);
        ArrayList arrayList2 = new ArrayList((Collection) dxvjVar2.b);
        Collections.sort(arrayList, comparator);
        Collections.sort(arrayList2, comparator);
        return arrayList.equals(arrayList2);
    }

    public final Object a() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("Either was not left");
    }

    public final Object b() {
        if (d()) {
            return this.c;
        }
        throw new IllegalStateException("Either was not right");
    }

    public final boolean d() {
        return !this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dxvj)) {
            return false;
        }
        dxvj dxvjVar = (dxvj) obj;
        return this.a ? dxvjVar.a && c(a(), dxvjVar.a()) : dxvjVar.d() && c(b(), dxvjVar.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c});
    }
}

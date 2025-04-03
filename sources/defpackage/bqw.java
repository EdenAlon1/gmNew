package defpackage;

import android.util.Size;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqw {
    private final Map a = new LinkedHashMap();
    private final TreeMap b = new TreeMap(new bhu());
    private final bvc c;
    private final bvc d;

    public bqw(bee beeVar) {
        brk brkVar = brk.b;
        Iterator it = new ArrayList(brk.i).iterator();
        while (true) {
            buv buvVar = null;
            if (!it.hasNext()) {
                break;
            }
            brk brkVar2 = (brk) it.next();
            ksw.d(brkVar2 instanceof brj, "Currently only support ConstantQuality");
            bei a = beeVar.a(((brj) brkVar2).a());
            if (a != null) {
                Objects.toString(a);
                avw.a("CapabilitiesByQuality", "profiles = ".concat(a.toString()));
                if (!a.d().isEmpty()) {
                    int a2 = a.a();
                    int b = a.b();
                    List c = a.c();
                    List d = a.d();
                    ksw.b(!d.isEmpty(), "Should contain at least one VideoProfile.");
                    buvVar = new buv(a2, b, DesugarCollections.unmodifiableList(new ArrayList(c)), DesugarCollections.unmodifiableList(new ArrayList(d)), c.isEmpty() ? null : (bef) c.get(0), (beh) d.get(0));
                }
                if (buvVar == null) {
                    avw.f("CapabilitiesByQuality", a.i(brkVar2, "EncoderProfiles of quality ", " has no video validated profiles."));
                } else {
                    beh behVar = buvVar.a;
                    this.b.put(new Size(behVar.i(), behVar.g()), brkVar2);
                    this.a.put(brkVar2, buvVar);
                }
            }
        }
        if (this.a.isEmpty()) {
            avw.c("CapabilitiesByQuality", "No supported EncoderProfiles");
            this.d = null;
            this.c = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.a.values());
            this.c = (bvc) arrayDeque.peekFirst();
            this.d = (bvc) arrayDeque.peekLast();
        }
    }

    public final brk a(Size size) {
        Object value;
        Size size2 = blz.a;
        TreeMap treeMap = this.b;
        Map.Entry ceilingEntry = treeMap.ceilingEntry(size);
        if (ceilingEntry != null) {
            value = ceilingEntry.getValue();
        } else {
            Map.Entry floorEntry = treeMap.floorEntry(size);
            value = floorEntry != null ? floorEntry.getValue() : null;
        }
        brk brkVar = (brk) value;
        return brkVar != null ? brkVar : brk.h;
    }

    public final bvc b(brk brkVar) {
        boolean d = brk.d(brkVar);
        Objects.toString(brkVar);
        ksw.b(d, "Unknown quality: ".concat(String.valueOf(brkVar)));
        return brkVar == brk.g ? this.c : brkVar == brk.f ? this.d : (bvc) this.a.get(brkVar);
    }

    public final List c() {
        return new ArrayList(this.a.keySet());
    }
}

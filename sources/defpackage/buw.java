package defpackage;

import android.util.Rational;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class buw implements bee {
    private final bee a;
    private final afd c;
    private final Map d = new HashMap();

    public buw(bee beeVar, afd afdVar) {
        this.a = beeVar;
        this.c = afdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [bei, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v5, types: [cak, java.lang.Object] */
    private final bei c(int i) {
        beh behVar;
        bbi bbiVar;
        int i2;
        bbi bbiVar2;
        cah c;
        ?? a;
        ?? e;
        Map map = this.d;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (bei) this.d.get(valueOf);
        }
        if (!this.a.b(i)) {
            return null;
        }
        bei c2 = ((cat) this.a).c(i);
        if (c2 == null) {
            e = 0;
        } else {
            ArrayList arrayList = new ArrayList(c2.d());
            Iterator it = c2.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    behVar = null;
                    break;
                }
                behVar = (beh) it.next();
                if (behVar.f() == 0) {
                    break;
                }
            }
            if (behVar == null) {
                bbiVar2 = null;
                bbiVar = null;
            } else {
                int d = behVar.d();
                String j = behVar.j();
                int h = behVar.h();
                int f = behVar.f();
                int i3 = f != 1 ? 2 : h;
                if (f != 1) {
                    j = "video/hevc";
                }
                String str = j;
                if (f != 1) {
                    d = 5;
                }
                int i4 = d;
                int b = behVar.b();
                int a2 = behVar.a();
                if (a2 == 10) {
                    i2 = b;
                    bbiVar = null;
                } else {
                    int doubleValue = (int) (b * new Rational(10, a2).doubleValue());
                    if (avw.h("BackupHdrProfileEncoderProfilesProvider")) {
                        bbiVar = null;
                        avw.a("BackupHdrProfileEncoderProfilesProvider", String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(b), 10, Integer.valueOf(a2), Integer.valueOf(doubleValue)));
                    } else {
                        bbiVar = null;
                    }
                    i2 = doubleValue;
                }
                bbiVar2 = new bbi(i4, str, i2, behVar.e(), behVar.i(), behVar.g(), i3, 10, behVar.c(), 1);
            }
            afd afdVar = this.c;
            if (bbiVar2 == null || (a = afdVar.a((c = bxe.c(bbiVar2)))) == 0 || !a.i(bbiVar2.d, bbiVar2.e)) {
                bbiVar2 = bbiVar;
            } else {
                int i5 = ((bxo) c).h;
                int intValue = ((Integer) a.c().clamp(Integer.valueOf(i5))).intValue();
                if (intValue != i5) {
                    bbiVar2 = new bbi(bbiVar2.a, bbiVar2.b, intValue, bbiVar2.c, bbiVar2.d, bbiVar2.e, bbiVar2.f, bbiVar2.g, bbiVar2.h, bbiVar2.i);
                }
            }
            if (bbiVar2 != null) {
                arrayList.add(bbiVar2);
            }
            e = arrayList.isEmpty() ? bbiVar : beg.e(c2.a(), c2.b(), c2.c(), arrayList);
        }
        this.d.put(Integer.valueOf(i), e);
        return e;
    }

    @Override // defpackage.bee
    public final bei a(int i) {
        return c(i);
    }

    @Override // defpackage.bee
    public final boolean b(int i) {
        return this.a.b(i) && c(i) != null;
    }
}

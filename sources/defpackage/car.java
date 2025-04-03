package defpackage;

import android.util.Size;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class car implements bee {
    public final bcq a;
    private final List c;
    private final afd d;
    private final ffbz e;
    private final Map f;

    public car(bcq bcqVar, List list, afd afdVar) {
        bcqVar.getClass();
        list.getClass();
        this.a = bcqVar;
        this.c = list;
        this.d = afdVar;
        this.e = ffca.a(new caq(this));
        this.f = new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r4v16, types: [cak, java.lang.Object] */
    private final bei c(int i) {
        int i2;
        Object obj;
        int i3;
        bbi bbiVar;
        Map map = this.f;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (bei) this.f.get(valueOf);
        }
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                i2 = i;
                obj = null;
                break;
            }
            obj = it.next();
            brk brkVar = (brk) obj;
            brkVar.getClass();
            i2 = i;
            if (((brj) brkVar).a() == i2) {
                break;
            }
        }
        brj brjVar = obj instanceof brj ? (brj) obj : null;
        if (brjVar != null) {
            for (Size size : brjVar.c()) {
                if (((List) this.e.a()).contains(size)) {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    if (ffkj.e(brjVar, brk.e)) {
                        i3 = 40000000;
                    } else if (ffkj.e(brjVar, brk.d)) {
                        i3 = 10000000;
                    } else if (ffkj.e(brjVar, brk.c)) {
                        i3 = 4000000;
                    } else {
                        if (!ffkj.e(brjVar, brk.b)) {
                            Objects.toString(brjVar);
                            throw new IllegalArgumentException("Undefined bitrate for quality: ".concat(brjVar.toString()));
                        }
                        i3 = 2000000;
                    }
                    int i4 = i3;
                    bbiVar = new bbi(2, "video/avc", i4, 30, width, height, -1, 8, 0, 0);
                    ?? a = this.d.a(bxe.c(bbiVar));
                    if (a != 0 && a.i(width, height)) {
                        Integer num = (Integer) a.c().clamp(Integer.valueOf(i4));
                        if (num == null || num.intValue() != i4) {
                            num.getClass();
                            bbiVar = new bbi(2, "video/avc", num.intValue(), 30, width, height, -1, 8, 0, 0);
                        }
                    } else {
                        bbiVar = null;
                    }
                    if (bbiVar != null) {
                        break;
                    }
                }
            }
        }
        bbiVar = null;
        beg e = bbiVar != null ? beg.e(60, 2, ffdx.b(new bbg(3, "audio/mp4a-latm", 96000, 44100, 1, 2)), ffdx.b(bbiVar)) : null;
        this.f.put(Integer.valueOf(i2), e);
        return e;
    }

    @Override // defpackage.bee
    public final bei a(int i) {
        return c(i);
    }

    @Override // defpackage.bee
    public final boolean b(int i) {
        return c(i) != null;
    }
}

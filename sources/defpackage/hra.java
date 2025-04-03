package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hra implements hqu {
    public static final hrh a = new hrk(hqv.a, hqw.a);
    public final Map b;
    public final cop c;
    public hrc d;
    private final ffji e;

    public hra() {
        this((byte[]) null);
    }

    public final void a(hrc hrcVar, Map map, Object obj) {
        Map b = hrcVar.b();
        if (b.isEmpty()) {
            map.remove(obj);
        } else {
            map.put(obj, b);
        }
    }

    @Override // defpackage.hqu
    public final void e(Object obj, ffjm ffjmVar, hfd hfdVar) {
        hfdVar.v(-1198538093);
        hfdVar.K(obj);
        hfm hfmVar = (hfm) hfdVar;
        Object R = hfmVar.R();
        if (R == hfc.a) {
            if (!((Boolean) this.e.invoke(obj)).booleanValue()) {
                throw new IllegalArgumentException(a.i(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle."));
            }
            Map map = (Map) this.b.get(obj);
            ffji ffjiVar = this.e;
            hik hikVar = hrg.a;
            hre hreVar = new hre(map, ffjiVar);
            hfmVar.ad(hreVar);
            R = hreVar;
        }
        hrc hrcVar = (hrc) R;
        hfz.a(hrg.a.c(hrcVar), ffjmVar, hfdVar, 56);
        ffcu ffcuVar = ffcu.a;
        boolean F = hfdVar.F(this) | hfdVar.F(obj) | hfdVar.F(hrcVar);
        Object R2 = hfmVar.R();
        if (F || R2 == hfc.a) {
            R2 = new hqy(this, obj, hrcVar);
            hfmVar.ad(R2);
        }
        hgs.c(ffcuVar, (ffji) R2, hfdVar);
        hfdVar.q();
        hfmVar.Z();
    }

    public hra(Map map) {
        this.b = map;
        long[] jArr = cpg.a;
        this.c = new cop((byte[]) null);
        this.e = new hqz(this);
    }

    public /* synthetic */ hra(byte[] bArr) {
        this(new LinkedHashMap());
    }
}

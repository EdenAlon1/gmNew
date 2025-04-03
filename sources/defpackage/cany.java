package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cany {
    public static final ffbz a;
    public static final cany b;
    public static final cany c;
    public static final cany d;
    public static final cany e;
    public static final cany f;
    public static final cany g;
    private static final /* synthetic */ cany[] k;
    public final cand h;
    public final cand i;
    public final int j;

    static {
        cany canyVar = new cany("ONE_ON_ONE_TEXT_TO_RCS", 0, cand.a, cand.b, 215);
        b = canyVar;
        cany canyVar2 = new cany("ONE_ON_ONE_TEXT_TO_E2EE", 1, cand.a, cand.c, 235);
        c = canyVar2;
        cany canyVar3 = new cany("ONE_ON_ONE_RCS_TO_E2EE", 2, cand.b, cand.c, 237);
        d = canyVar3;
        cany canyVar4 = new cany("ONE_ON_ONE_E2EE_TO_RCS", 3, cand.c, cand.b, 238);
        e = canyVar4;
        cany canyVar5 = new cany("ONE_ON_ONE_E2EE_TO_TEXT", 4, cand.c, cand.a, 236);
        f = canyVar5;
        cany canyVar6 = new cany("ONE_ON_ONE_RCS_TO_TEXT", 5, cand.b, cand.a, 214);
        g = canyVar6;
        cany[] canyVarArr = {canyVar, canyVar2, canyVar3, canyVar4, canyVar5, canyVar6};
        k = canyVarArr;
        ffhw.a(canyVarArr);
        a = ffca.a(new ffix() { // from class: canx
            @Override // defpackage.ffix
            public final Object invoke() {
                cany[] values = cany.values();
                LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(values.length), 16));
                for (cany canyVar7 : values) {
                    linkedHashMap.put(new ffcf(canyVar7.h, canyVar7.i), canyVar7);
                }
                return linkedHashMap;
            }
        });
    }

    private cany(String str, int i, cand candVar, cand candVar2, int i2) {
        this.h = candVar;
        this.i = candVar2;
        this.j = i2;
    }

    public static final cany a(cand candVar, cand candVar2) {
        candVar.getClass();
        candVar2.getClass();
        cany canyVar = (cany) ((Map) a.a()).get(new ffcf(candVar, candVar2));
        if (canyVar != null) {
            return canyVar;
        }
        throw new IllegalArgumentException(a.k(candVar2, candVar, "Invalid input protocols (from = ", ", to = ", "."));
    }

    public static cany[] values() {
        return (cany[]) k.clone();
    }
}

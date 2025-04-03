package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hre implements hrc {
    private final ffji a;
    private final cop b;
    private cop c;

    public hre(Map map, ffji ffjiVar) {
        this.a = ffjiVar;
        cop copVar = null;
        if (map != null && !map.isEmpty()) {
            hik hikVar = hrg.a;
            copVar = new cop(map.size());
            for (Map.Entry entry : map.entrySet()) {
                copVar.e(entry.getKey(), entry.getValue());
            }
        }
        this.b = copVar;
    }

    @Override // defpackage.hrc
    public final Object a(String str) {
        cop copVar;
        cop copVar2 = this.b;
        List list = copVar2 != null ? (List) copVar2.b(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && (copVar = this.b) != null) {
            List subList = list.subList(1, list.size());
            int a = copVar.a(str);
            if (a < 0) {
                a = ~a;
            }
            Object[] objArr = copVar.c;
            Object obj = objArr[a];
            copVar.b[a] = str;
            objArr[a] = subList;
        }
        return list.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    @Override // defpackage.hrc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map b() {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hre.b():java.util.Map");
    }

    @Override // defpackage.hrc
    public final boolean c(Object obj) {
        return ((Boolean) this.a.invoke(obj)).booleanValue();
    }

    @Override // defpackage.hrc
    public final hrd d(String str, ffix ffixVar) {
        hik hikVar = hrg.a;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!ffol.a(str.charAt(i))) {
                cop copVar = this.c;
                if (copVar == null) {
                    long[] jArr = cpg.a;
                    copVar = new cop((byte[]) null);
                    this.c = copVar;
                }
                Object f = copVar.f(str);
                if (f == null) {
                    f = new ArrayList();
                    copVar.e(str, f);
                }
                ((List) f).add(ffixVar);
                return new hrd(copVar, str, ffixVar);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}

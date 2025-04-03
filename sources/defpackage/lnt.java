package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnt {
    public final Map a;
    public final Map b;
    public final Map c;
    public final owu d;
    private final Map e;

    public lnt() {
        this((byte[]) null);
    }

    public final Object a(String str) {
        Map map = this.e;
        Object remove = this.a.remove(str);
        map.remove(str);
        return remove;
    }

    public final void b(String str, Object obj) {
        str.getClass();
        this.a.put(str, obj);
        fgcm fgcmVar = (fgcm) this.e.get(str);
        if (fgcmVar != null) {
            fgcmVar.f(obj);
        }
        fgcm fgcmVar2 = (fgcm) this.c.get(str);
        if (fgcmVar2 == null) {
            return;
        }
        fgcmVar2.f(obj);
    }

    public lnt(Map map) {
        this.a = ffew.m(map);
        this.b = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new owu() { // from class: lns
            @Override // defpackage.owu
            public final Bundle a() {
                ffcf[] ffcfVarArr;
                lnt lntVar = lnt.this;
                for (Map.Entry entry : ffew.l(lntVar.c).entrySet()) {
                    lntVar.b((String) entry.getKey(), ((fgcm) entry.getValue()).c());
                }
                for (Map.Entry entry2 : ffew.l(lntVar.b).entrySet()) {
                    lntVar.b((String) entry2.getKey(), ((owu) entry2.getValue()).a());
                }
                Map map2 = lntVar.a;
                if (map2.isEmpty()) {
                    ffcfVarArr = new ffcf[0];
                } else {
                    ArrayList arrayList = new ArrayList(map2.size());
                    for (Map.Entry entry3 : map2.entrySet()) {
                        arrayList.add(new ffcf((String) entry3.getKey(), entry3.getValue()));
                    }
                    ffcfVarArr = (ffcf[]) arrayList.toArray(new ffcf[0]);
                }
                return kqr.a((ffcf[]) Arrays.copyOf(ffcfVarArr, ffcfVarArr.length));
            }
        };
    }

    public /* synthetic */ lnt(byte[] bArr) {
        this(ffem.a);
    }
}

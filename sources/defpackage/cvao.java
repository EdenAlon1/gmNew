package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvao extends eyfq implements eyht {
    public cvao() {
        super(cvas.a);
    }

    public final cvan a(String str, cvan cvanVar) {
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(((cvas) this.instance).e);
        return unmodifiableMap.containsKey(str) ? (cvan) unmodifiableMap.get(str) : cvanVar;
    }

    public final boolean b(String str) {
        str.getClass();
        return DesugarCollections.unmodifiableMap(((cvas) this.instance).d).containsKey(str);
    }

    public final void c(String str, String str2) {
        str.getClass();
        str2.getClass();
        copyOnWrite();
        cvas cvasVar = (cvas) this.instance;
        cvas cvasVar2 = cvas.a;
        eyhm eyhmVar = cvasVar.d;
        if (!eyhmVar.b) {
            cvasVar.d = eyhmVar.a();
        }
        cvasVar.d.put(str, str2);
    }

    public final void d(String str, cvan cvanVar) {
        cvanVar.getClass();
        copyOnWrite();
        cvas cvasVar = (cvas) this.instance;
        cvas cvasVar2 = cvas.a;
        eyhm eyhmVar = cvasVar.e;
        if (!eyhmVar.b) {
            cvasVar.e = eyhmVar.a();
        }
        cvasVar.e.put(str, cvanVar);
    }
}

package defpackage;

import j$.util.DesugarCollections;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enwt extends enwr {
    public static final Map c;
    private final enth d;

    static {
        EnumMap enumMap = new EnumMap(enth.class);
        for (enth enthVar : enth.values()) {
            enwt[] enwtVarArr = new enwt[10];
            for (int i = 0; i < 10; i++) {
                enwtVarArr[i] = new enwt(i, enthVar, enti.a);
            }
            enumMap.put((EnumMap) enthVar, (enth) enwtVarArr);
        }
        c = DesugarCollections.unmodifiableMap(enumMap);
    }

    public enwt(int i, enth enthVar, enti entiVar) {
        super(entiVar, i);
        enthVar.getClass();
        this.d = enthVar;
        if (entiVar.c()) {
            return;
        }
        int i2 = enthVar.l;
        i2 = entiVar.d() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        entiVar.f(sb);
        sb.append((char) i2);
    }

    @Override // defpackage.enwr
    public final void a(enws enwsVar, Object obj) {
        enwsVar.b(obj, this.d, this.b);
    }
}

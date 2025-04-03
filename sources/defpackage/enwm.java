package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enwm extends AbstractMap {
    public static final Comparator a = new enwj();
    private static final int[] e = {1, 2};
    public final Object[] b;
    public final int[] c;
    public final Set d;
    private Integer f;
    private String g;

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0121, code lost:
    
        if (r8 < 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [enwm, java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r0v1, types: [enwm] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public enwm(defpackage.enwm r21, defpackage.enwm r22) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enwm.<init>(enwm, enwm):void");
    }

    private final int a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        enwl enwlVar = (enwl) entry.getValue();
        int a2 = enwlVar.a() - enwlVar.b();
        System.arraycopy(enwlVar.b.b, enwlVar.b(), objArr, i2, a2);
        objArr[i] = d((String) entry.getKey(), i);
        int i3 = i2 + a2;
        iArr[i + 1] = i3;
        return i3;
    }

    private final int b() {
        return this.c[size()];
    }

    private final Map.Entry c(int i) {
        if (i < this.c[0]) {
            return (Map.Entry) this.b[i];
        }
        return null;
    }

    private final Map.Entry d(String str, int i) {
        return new AbstractMap.SimpleImmutableEntry(str, new enwl(this, i));
    }

    private static boolean e(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.f == null) {
            this.f = Integer.valueOf(super.hashCode());
        }
        return this.f.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.g == null) {
            this.g = super.toString();
        }
        return this.g;
    }

    public enwm(String str, Object obj) {
        this.d = new enwl(this, -1);
        this.f = null;
        this.g = null;
        this.c = e;
        this.b = new Object[]{d(str, 0), obj};
    }

    public enwm(List list) {
        this.d = new enwl(this, -1);
        this.f = null;
        this.g = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.b = e(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.c = iArr;
                return;
            }
            String str = ((enwi) it2.next()).a;
            throw null;
        }
        String str2 = ((enwi) it.next()).a;
        throw null;
    }
}

package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiwm extends LinkedHashMap {
    public int a;

    public fiwm() {
        super(16, 0.75f, true);
        this.a = 50000;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        return this.a >= 0 && size() > this.a;
    }
}

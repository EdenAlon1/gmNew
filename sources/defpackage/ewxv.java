package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewxv {
    public final cmh a;
    private final ArrayList b;

    public ewxv(Map map) {
        cmh cmhVar = new cmh();
        this.a = cmhVar;
        this.b = new ArrayList();
        cmhVar.h(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (((Float) entry.getValue()).floatValue() > 0.0f) {
                this.a.put((String) entry.getKey(), Float.valueOf(Math.min(1.0f, ((Float) entry.getValue()).floatValue())));
            }
        }
        this.b.clear();
        this.b.ensureCapacity(this.a.d);
        this.b.addAll(this.a.keySet());
        Collections.sort(this.b, new ewxu(this));
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    public final String toString() {
        return this.a.toString();
    }
}

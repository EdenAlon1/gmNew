package defpackage;

import j$.util.DesugarCollections;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eusc {
    private final String a;
    private Map b = null;

    public eusc(String str) {
        this.a = str;
    }

    public final eusd a() {
        Map map = this.b;
        return new eusd(this.a, map == null ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(new HashMap(map)));
    }

    public final void b(Annotation annotation) {
        if (this.b == null) {
            this.b = new HashMap();
        }
        this.b.put(eusl.class, annotation);
    }
}

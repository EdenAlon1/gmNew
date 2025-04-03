package defpackage;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bie implements Enumeration {
    final Enumeration a;
    final /* synthetic */ bif b;

    public bie(bif bifVar) {
        this.b = bifVar;
        this.a = Collections.enumeration(bifVar.b);
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final /* bridge */ /* synthetic */ Object nextElement() {
        return new HashMap((Map) this.a.nextElement());
    }
}

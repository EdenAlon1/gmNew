package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eexa implements eewm {
    private final String a;
    private final List b;

    public eexa(String str, eewl... eewlVarArr) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableList(Arrays.asList(eewlVarArr));
    }

    @Override // defpackage.eewm
    public final String c() {
        return this.a;
    }

    @Override // defpackage.eewm
    public final List d() {
        return this.b;
    }

    @Override // defpackage.eewm
    public final List e() {
        return Collections.EMPTY_LIST;
    }
}

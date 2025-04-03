package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atx implements bdh {
    final List a;

    public atx(List list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
        }
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override // defpackage.bdh
    public final List a() {
        return this.a;
    }
}

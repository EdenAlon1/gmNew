package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nkz implements njw {
    private final List a;

    public nkz(List list) {
        this.a = list;
    }

    @Override // defpackage.njw
    public final int a() {
        return 1;
    }

    @Override // defpackage.njw
    public final int b(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.njw
    public final long c(int i) {
        lti.a(i == 0);
        return 0L;
    }

    @Override // defpackage.njw
    public final List e(long j) {
        return j >= 0 ? this.a : Collections.EMPTY_LIST;
    }
}

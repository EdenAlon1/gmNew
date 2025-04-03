package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elxu extends elyq {
    private final Optional b = Optional.empty();
    private final Optional c = Optional.empty();
    private final Optional d = Optional.empty();
    private final Optional e = Optional.empty();
    private final Optional f = Optional.empty();
    private final Optional g = Optional.empty();
    private final Optional h = Optional.empty();
    private final Optional i = Optional.empty();
    private List j;

    @Override // defpackage.elyq
    public final elyr b() {
        List list = this.j;
        if (list != null) {
            return new elxv(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, list);
        }
        throw new IllegalStateException("Missing required properties: byDayList");
    }

    @Override // defpackage.elyq
    public final void c(List list) {
        this.j = list;
    }
}

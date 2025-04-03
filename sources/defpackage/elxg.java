package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elxg extends elyb {
    private final Optional b = Optional.empty();
    private final Optional c = Optional.empty();
    private List d;

    @Override // defpackage.elyb
    public final elyc b() {
        List list = this.d;
        if (list != null) {
            return new elxh(this.b, this.c, list);
        }
        throw new IllegalStateException("Missing required properties: listItems");
    }

    @Override // defpackage.elyb
    public final void c(List list) {
        if (list == null) {
            throw new NullPointerException("Null listItems");
        }
        this.d = list;
    }
}

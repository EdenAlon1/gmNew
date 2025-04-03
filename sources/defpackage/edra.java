package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edra extends edsa {
    private List a;
    private dhqd b;

    @Override // defpackage.edsa
    public final edsb a() {
        List list = this.a;
        if (list != null) {
            return new edrb(list, this.b);
        }
        throw new IllegalStateException("Missing required properties: placeFields");
    }

    @Override // defpackage.edsa
    public final void b(dhqd dhqdVar) {
        this.b = dhqdVar;
    }

    @Override // defpackage.edsa
    public final void c(List list) {
        if (list == null) {
            throw new NullPointerException("Null placeFields");
        }
        this.a = list;
    }
}

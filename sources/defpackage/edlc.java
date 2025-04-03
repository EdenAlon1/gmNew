package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edlc extends edov {
    public List a;

    @Override // defpackage.edov
    public final void a(List list) {
        if (list == null) {
            throw new NullPointerException("Null fuelPrices");
        }
        this.a = list;
    }
}

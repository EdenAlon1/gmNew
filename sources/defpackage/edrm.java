package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edrm extends edso {
    public List a;
    public List b;

    @Override // defpackage.edso
    public final void a(List list) {
        if (list == null) {
            throw new NullPointerException("Null places");
        }
        this.a = list;
    }
}

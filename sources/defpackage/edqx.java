package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edqx extends edrx {
    public List a;
    public List b;
    public dhqd c;

    @Override // defpackage.edrx
    public final void a(List list) {
        if (list == null) {
            throw new NullPointerException("Null countries");
        }
        this.a = list;
    }

    @Override // defpackage.edrx
    public final void b(List list) {
        if (list == null) {
            throw new NullPointerException("Null typesFilter");
        }
        this.b = list;
    }
}

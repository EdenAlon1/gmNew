package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class edrs implements edkr {
    public static edrr f(String str, List list) {
        edqr edqrVar = new edqr();
        if (str == null) {
            throw new NullPointerException("Null placeId");
        }
        edqrVar.a = str;
        edqrVar.b(list);
        return edqrVar;
    }

    @Override // defpackage.edkr
    public abstract dhqd a();

    public abstract String b();

    public abstract List c();

    public abstract void d();

    public abstract void e();
}

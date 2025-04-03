package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xnp implements dqnl {
    final /* synthetic */ xnq a;

    public xnp(xnq xnqVar) {
        this.a = xnqVar;
    }

    @Override // defpackage.dqnl
    public final void a(final String str) {
        str.getClass();
        if (str.length() == 0) {
            str = null;
        }
        this.a.b.c(new ffji() { // from class: xno
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                xhu xhuVar = (xhu) obj;
                xhuVar.getClass();
                String str2 = xhuVar.a;
                String str3 = str;
                return !ffkj.e(str2, str3) ? xhu.c(xhuVar, str3, null, null, false, null, null, false, 1, 766) : xhuVar;
            }
        });
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xof implements ffjm {
    final /* synthetic */ hkx a;

    public xof(hkx hkxVar) {
        this.a = hkxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            String str = xok.a(this.a).a;
            if (str != null) {
                dosx.a(str, hfdVar, 48);
            }
        }
        return ffcu.a;
    }
}

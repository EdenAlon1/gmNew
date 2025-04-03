package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnim implements ffjm {
    final /* synthetic */ String a;

    public dnim(String str) {
        this.a = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dniq.g(this.a, hfdVar, 0);
        }
        return ffcu.a;
    }
}

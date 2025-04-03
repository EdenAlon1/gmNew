package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jza extends ffkk implements ffjm {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jza(String str, String str2) {
        super(2);
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            jyx.a(this.a, this.b, hfdVar, new Object[0]);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gje extends ffkk implements ffjn {
    final /* synthetic */ ffjm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gje(ffjm ffjmVar) {
        super(3);
        this.a = ffjmVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            this.a.a(hfdVar, 0);
        }
        return ffcu.a;
    }
}

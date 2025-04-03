package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class edo extends ffkk implements ffjo {
    final /* synthetic */ ffjn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edo(ffjn ffjnVar) {
        super(4);
        this.a = ffjnVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        edi ediVar = (edi) obj;
        ((Number) obj2).intValue();
        hfd hfdVar = (hfd) obj3;
        int intValue = ((Number) obj4).intValue();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(ediVar) ? 2 : 4;
        }
        if (hfdVar.J((intValue & 131) != 130, intValue & 1)) {
            this.a.a(ediVar, hfdVar, Integer.valueOf(intValue & 14));
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}

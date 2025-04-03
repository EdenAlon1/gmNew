package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class abcz extends ffkh implements ffjo {
    public abcz(Object obj) {
        super(4, obj, abdj.class, "onLayoutRectUpdated", "onLayoutRectUpdated(IIII)V", 0);
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        zep zepVar = ((abdj) this.g).w;
        zeq zeqVar = zeq.a;
        zeqVar.getClass();
        zeo zeoVar = new zeo(intValue, intValue2, intValue3, intValue4);
        if (zepVar.a.containsKey(zeqVar)) {
            fgcm fgcmVar = (fgcm) zepVar.a.get(zeqVar);
            if (fgcmVar != null) {
                fgcmVar.f(zeoVar);
            }
        } else {
            zepVar.a.put(zeqVar, fgdm.a(zeoVar));
        }
        return ffcu.a;
    }
}

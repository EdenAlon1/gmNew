package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aahg extends ffhv implements ffjs {
    int a;
    /* synthetic */ boolean b;
    /* synthetic */ boolean c;
    /* synthetic */ boolean d;
    /* synthetic */ Object e;
    /* synthetic */ int f;
    /* synthetic */ boolean g;
    /* synthetic */ boolean h;
    final /* synthetic */ aahw i;
    final /* synthetic */ aagp j;
    final /* synthetic */ Long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aahg(aahw aahwVar, aagp aagpVar, Long l, ffgu ffguVar) {
        super(8, ffguVar);
        this.i = aahwVar;
        this.j = aagpVar;
        this.k = l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [doau, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        int i;
        boolean z;
        boolean z2;
        ffhh ffhhVar = ffhh.a;
        if (this.a == 0) {
            ffci.b(obj);
            boolean z3 = this.b;
            boolean z4 = this.c;
            boolean z5 = this.d;
            ?? r8 = this.e;
            i = this.f;
            z = this.g;
            z2 = this.h;
            if (!z4) {
                aahw aahwVar = this.i;
                if (aahwVar.h(this.j, z3, z5, r8, aahwVar.x, true)) {
                    aahw aahwVar2 = this.i;
                    aagp aagpVar = this.j;
                    this.f = i;
                    this.b = z;
                    this.c = z2;
                    this.a = 1;
                    obj = aahwVar2.c(aagpVar, this);
                    if (obj == ffhhVar) {
                        return ffhhVar;
                    }
                }
            }
            return null;
        }
        boolean z6 = this.c;
        z = this.b;
        i = this.f;
        ffci.b(obj);
        z2 = z6;
        boolean z7 = z;
        int i2 = i;
        apza apzaVar = (apza) obj;
        ensk g = aahw.a.g();
        g.Y(ente.a, "BugleReactions");
        enrr enrrVar = (enrr) g;
        enrrVar.Y(csux.c, this.j.a.b());
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/ReactionsBarPopupUiAdapterImpl$getAutoRevealReactionBarPopupUiData$1", "invokeSuspend", 411, "ReactionsBarPopupUiAdapterImpl.kt")).q("Creating auto reveal reaction bar ui data");
        aahw aahwVar3 = this.i;
        aagp aagpVar2 = this.j;
        return aahwVar3.a(aagpVar2, aahwVar3.x, this.k, apzaVar, aahwVar3.b(apzaVar != null ? apzaVar.a : null, aagpVar2.a), i2, z7, z2, true);
    }

    @Override // defpackage.ffjs
    public final /* bridge */ /* synthetic */ Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        int intValue = ((Number) obj5).intValue();
        boolean booleanValue4 = ((Boolean) obj6).booleanValue();
        boolean booleanValue5 = ((Boolean) obj7).booleanValue();
        aahg aahgVar = new aahg(this.i, this.j, this.k, (ffgu) obj8);
        aahgVar.b = booleanValue;
        aahgVar.c = booleanValue2;
        aahgVar.d = booleanValue3;
        aahgVar.e = (doau) obj4;
        aahgVar.f = intValue;
        aahgVar.g = booleanValue4;
        aahgVar.h = booleanValue5;
        return aahgVar.b(ffcu.a);
    }
}

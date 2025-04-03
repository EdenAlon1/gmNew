package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class aero extends ffju implements ffjm {
    public static final aero a = new aero();

    public aero() {
        super(2, eolu.class, "setGooglePhotosOnboardingEvent", "setGooglePhotosOnboardingEvent(Lcom/google/common/logging/bugle/BuglePhotosOnboarding$GooglePhotosOnboardingEvent$Builder;)Lcom/google/common/logging/BugleProtos$BugleEvent$Builder;", 8);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        eolu eoluVar = (eolu) obj;
        eqca eqcaVar = (eqca) obj2;
        eoluVar.getClass();
        eqcaVar.getClass();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eqcb eqcbVar = (eqcb) eqcaVar.build();
        eolv eolvVar2 = eolv.a;
        eqcbVar.getClass();
        eolvVar.bl = eqcbVar;
        eolvVar.f |= 256;
        return ffcu.a;
    }
}

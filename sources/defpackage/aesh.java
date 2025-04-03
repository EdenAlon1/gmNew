package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class aesh extends ffju implements ffjm {
    public static final aesh a = new aesh();

    public aesh() {
        super(2, eolu.class, "setGooglePhotosOptionTrayEvent", "setGooglePhotosOptionTrayEvent(Lcom/google/common/logging/bugle/BuglePhotosOptionTray$GooglePhotosOptionTrayEvent$Builder;)Lcom/google/common/logging/BugleProtos$BugleEvent$Builder;", 8);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        eolu eoluVar = (eolu) obj;
        eqcl eqclVar = (eqcl) obj2;
        eoluVar.getClass();
        eqclVar.getClass();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eqcm eqcmVar = (eqcm) eqclVar.build();
        eolv eolvVar2 = eolv.a;
        eqcmVar.getClass();
        eolvVar.bm = eqcmVar;
        eolvVar.f |= 512;
        return ffcu.a;
    }
}

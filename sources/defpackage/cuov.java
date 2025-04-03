package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class cuov extends ffju implements ffjm {
    public static final cuov a = new cuov();

    public cuov() {
        super(2, eolu.class, "setHadesSdkEvent", "setHadesSdkEvent(Lcom/google/common/logging/bugle/spam/BugleHadesSdk$HadesSdkEvent$Builder;)Lcom/google/common/logging/BugleProtos$BugleEvent$Builder;", 8);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        eolu eoluVar = (eolu) obj;
        erdd erddVar = (erdd) obj2;
        eoluVar.getClass();
        erddVar.getClass();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        erde erdeVar = (erde) erddVar.build();
        eolv eolvVar2 = eolv.a;
        erdeVar.getClass();
        eolvVar.av = erdeVar;
        eolvVar.d |= 65536;
        return ffcu.a;
    }
}

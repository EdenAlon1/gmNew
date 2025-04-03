package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class cufw extends ffju implements ffjm {
    public static final cufw a = new cufw();

    public cufw() {
        super(2, eolu.class, "setSpamFolderEvent", "setSpamFolderEvent(Lcom/google/common/logging/bugle/spam/BugleSpamFolder$SpamFolderEvent$Builder;)Lcom/google/common/logging/BugleProtos$BugleEvent$Builder;", 8);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        eolu eoluVar = (eolu) obj;
        erdp erdpVar = (erdp) obj2;
        eoluVar.getClass();
        erdpVar.getClass();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        erdq erdqVar = (erdq) erdpVar.build();
        eolv eolvVar2 = eolv.a;
        erdqVar.getClass();
        eolvVar.ak = erdqVar;
        eolvVar.d |= 8;
        return ffcu.a;
    }
}

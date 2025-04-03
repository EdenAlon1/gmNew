package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class aifo extends ffju implements ffjm {
    public static final aifo a = new aifo();

    public aifo() {
        super(2, eolu.class, "setMultiShareEvent", "setMultiShareEvent(Lcom/google/common/logging/bugle/MultiShare$MultiShareEvent$Builder;)Lcom/google/common/logging/BugleProtos$BugleEvent$Builder;", 8);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        eolu eoluVar = (eolu) obj;
        equk equkVar = (equk) obj2;
        eoluVar.getClass();
        equkVar.getClass();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        equt equtVar = (equt) equkVar.build();
        eolv eolvVar2 = eolv.a;
        equtVar.getClass();
        eolvVar.bT = equtVar;
        eolvVar.g |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        return ffcu.a;
    }
}

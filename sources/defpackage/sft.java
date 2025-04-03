package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sft {
    private final ffbr a;

    public sft(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public final void a(int i) {
        if (((Boolean) sfl.b.e()).booleanValue()) {
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            eolt eoltVar = eolt.BUGLE_APP_CONTROL_EVENT;
            eoluVar.copyOnWrite();
            eolv eolvVar = (eolv) eoluVar.instance;
            eolvVar.j = eoltVar.dk;
            eolvVar.b |= 1;
            epob epobVar = (epob) epod.a.createBuilder();
            epobVar.copyOnWrite();
            epod epodVar = (epod) epobVar.instance;
            epodVar.c = i - 1;
            epodVar.b |= 1;
            eoluVar.copyOnWrite();
            eolv eolvVar2 = (eolv) eoluVar.instance;
            epod epodVar2 = (epod) epobVar.build();
            epodVar2.getClass();
            eolvVar2.bu = epodVar2;
            eolvVar2.f |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
            ((akxl) this.a.b()).n(eoluVar);
        }
    }
}

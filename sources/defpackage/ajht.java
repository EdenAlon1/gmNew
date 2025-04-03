package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajht {
    public final ffbr a;
    public final errl b;
    private final ffbr c;

    public ajht(ffbr ffbrVar, ffbr ffbrVar2, errl errlVar) {
        this.a = ffbrVar;
        this.c = ffbrVar2;
        this.b = errlVar;
    }

    public final void a(int i, int i2, int i3) {
        ((akzt) this.c.b()).e("Bugle.PinToTop.PinnedConversations.Counts", i2);
        eqvr eqvrVar = (eqvr) eqvs.a.createBuilder();
        eqvrVar.copyOnWrite();
        eqvs eqvsVar = (eqvs) eqvrVar.instance;
        eqvsVar.c = i - 1;
        eqvsVar.b |= 1;
        eqvrVar.copyOnWrite();
        eqvs eqvsVar2 = (eqvs) eqvrVar.instance;
        eqvsVar2.d = i3 - 1;
        eqvsVar2.b |= 2;
        eqvs eqvsVar3 = (eqvs) eqvrVar.build();
        akxl akxlVar = (akxl) this.a.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.PIN_TO_TOP_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eqvw eqvwVar = (eqvw) eqvy.a.createBuilder();
        eqvwVar.copyOnWrite();
        eqvy eqvyVar = (eqvy) eqvwVar.instance;
        eqvsVar3.getClass();
        eqvyVar.c = eqvsVar3;
        eqvyVar.b = 4;
        eqvy eqvyVar2 = (eqvy) eqvwVar.build();
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqvyVar2.getClass();
        eolvVar2.aZ = eqvyVar2;
        eolvVar2.e |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        akxlVar.j(eoluVar);
    }
}

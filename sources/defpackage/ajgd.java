package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajgd {
    private final akyb a;

    public ajgd(akyb akybVar) {
        akybVar.getClass();
        this.a = akybVar;
    }

    public final void a(eqbz eqbzVar) {
        akxn a = this.a.a();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.OPEN_PENPAL_CHAT_EVENT, eoluVar);
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.cu = eqbzVar;
        eolvVar.h |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        a.j((eolu) eogy.a(eoluVar).toBuilder(), alal.LOG_SPEC_OPEN_PENPAL_CHAT_EVENT);
    }
}

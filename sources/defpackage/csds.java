package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csds {
    private final ffbr a;

    public csds(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    private final void c(eojf eojfVar) {
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_CMS_DATA_PROVIDER_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoiw eoiwVar = (eoiw) eoix.a.createBuilder();
        eovw eovwVar = csjc.a;
        eoiwVar.copyOnWrite();
        eoix eoixVar = (eoix) eoiwVar.instance;
        eoixVar.d = eovwVar.x;
        eoixVar.b |= 64;
        eoix eoixVar2 = (eoix) eoiwVar.build();
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eoixVar2.getClass();
        eolvVar2.k = eoixVar2;
        eolvVar2.b |= 2;
        eoluVar.copyOnWrite();
        eolv eolvVar3 = (eolv) eoluVar.instance;
        eolvVar3.bU = eojfVar;
        eolvVar3.g |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        ((akxl) this.a.b()).q(eoluVar, 1.0d);
    }

    public final void a(int i, eshn eshnVar) {
        eshnVar.getClass();
        eoje eojeVar = (eoje) eojf.a.createBuilder();
        eojeVar.getClass();
        eqnc eqncVar = (eqnc) eqnd.a.createBuilder();
        eqncVar.getClass();
        eqncVar.copyOnWrite();
        ((eqnd) eqncVar.instance).b = i - 2;
        eqncVar.copyOnWrite();
        ((eqnd) eqncVar.instance).c = eshnVar.a();
        eyfy build = eqncVar.build();
        build.getClass();
        eojeVar.copyOnWrite();
        eojf eojfVar = (eojf) eojeVar.instance;
        eojfVar.c = (eqnd) build;
        eojfVar.b = 1;
        c(eogv.a(eojeVar));
    }

    public final void b(int i, eshn eshnVar) {
        eshnVar.getClass();
        eoje eojeVar = (eoje) eojf.a.createBuilder();
        eojeVar.getClass();
        eqne eqneVar = (eqne) eqnf.a.createBuilder();
        eqneVar.getClass();
        eqneVar.copyOnWrite();
        ((eqnf) eqneVar.instance).b = i - 2;
        eqneVar.copyOnWrite();
        ((eqnf) eqneVar.instance).c = eshnVar.a();
        eyfy build = eqneVar.build();
        build.getClass();
        eojeVar.copyOnWrite();
        eojf eojfVar = (eojf) eojeVar.instance;
        eojfVar.c = (eqnf) build;
        eojfVar.b = 2;
        c(eogv.a(eojeVar));
    }
}

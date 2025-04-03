package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alnb implements alkx {
    public final ffhd a;
    private final ffbr b;
    private final azpx c;
    private final azpo d;
    private final ffbr e;
    private final aolr f;
    private final asrc g;
    private final ffsk h;

    public alnb(ffbr ffbrVar, azpx azpxVar, azpo azpoVar, ffbr ffbrVar2, aolr aolrVar, asrc asrcVar, ffsk ffskVar, ffhd ffhdVar) {
        ffbrVar.getClass();
        azpxVar.getClass();
        azpoVar.getClass();
        ffbrVar2.getClass();
        aolrVar.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        this.b = ffbrVar;
        this.c = azpxVar;
        this.d = azpoVar;
        this.e = ffbrVar2;
        this.f = aolrVar;
        this.g = asrcVar;
        this.h = ffskVar;
        this.a = ffhdVar;
    }

    private final void c(eqvo eqvoVar) {
        akxn a = ((akyb) this.b.b()).a();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.PARTICIPANTS_TABLE_VALIDATION_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqvq eqvqVar = (eqvq) eqvoVar.build();
        eqvqVar.getClass();
        eolvVar2.ck = eqvqVar;
        eolvVar2.h |= 4096;
        a.h(eoluVar, alal.LOG_SPEC_MY_IDENTITY_EVENTS);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r1v6, types: [aoku, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r8, defpackage.ffgu r9) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alnb.a(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData, ffgu):java.lang.Object");
    }

    @Override // defpackage.alkx
    public final void b() {
        if (((ersq) ((arxx) this.g).a.b()).a("bugle.enable_participants_table_shadow_launch")) {
            axol.k(this.h, null, new almz(this, null), 3);
        }
    }
}

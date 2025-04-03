package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abxg {
    static final cfup a = cfvl.i(cfvl.b, "disable_logging_data_donation_event_logger", false);
    public final ffbr b;
    public final ffbr c;
    private final errl d;

    public abxg(ffbr ffbrVar, ffbr ffbrVar2, errl errlVar) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = errlVar;
    }

    public final void a(final eoxp eoxpVar) {
        if (((Boolean) a.e()).booleanValue()) {
            return;
        }
        axnw.h(elfo.f(new Runnable() { // from class: abxf
            @Override // java.lang.Runnable
            public final void run() {
                abxg abxgVar = abxg.this;
                if (((csxu) abxgVar.c.b()).i("bugle_enable_analytics", true)) {
                    eoxp eoxpVar2 = eoxpVar;
                    eolu eoluVar = (eolu) eolv.a.createBuilder();
                    eolt eoltVar = eolt.DATA_DONATION_EVENT;
                    eoluVar.copyOnWrite();
                    eolv eolvVar = (eolv) eoluVar.instance;
                    eolvVar.j = eoltVar.dk;
                    eolvVar.b = 1 | eolvVar.b;
                    eoluVar.copyOnWrite();
                    eolv eolvVar2 = (eolv) eoluVar.instance;
                    eoyf eoyfVar = (eoyf) eoxpVar2.build();
                    eoyfVar.getClass();
                    eolvVar2.aA = eoyfVar;
                    eolvVar2.d |= 2097152;
                    ((akxl) abxgVar.b.b()).j(eoluVar);
                }
            }
        }, this.d));
    }

    public final void b(int i) {
        eoxp eoxpVar = (eoxp) eoyf.a.createBuilder();
        eoxt eoxtVar = (eoxt) eoxu.a.createBuilder();
        eoxtVar.copyOnWrite();
        eoxu eoxuVar = (eoxu) eoxtVar.instance;
        eoxuVar.c = i - 1;
        eoxuVar.b |= 1;
        eoxpVar.copyOnWrite();
        eoyf eoyfVar = (eoyf) eoxpVar.instance;
        eoxu eoxuVar2 = (eoxu) eoxtVar.build();
        eoxuVar2.getClass();
        eoyfVar.c = eoxuVar2;
        eoyfVar.b = 3;
        a(eoxpVar);
    }

    public final void c(int i) {
        eoxp eoxpVar = (eoxp) eoyf.a.createBuilder();
        eoxv eoxvVar = (eoxv) eoxw.a.createBuilder();
        eoxvVar.copyOnWrite();
        eoxw eoxwVar = (eoxw) eoxvVar.instance;
        eoxwVar.c = i - 1;
        eoxwVar.b |= 1;
        eoxpVar.copyOnWrite();
        eoyf eoyfVar = (eoyf) eoxpVar.instance;
        eoxw eoxwVar2 = (eoxw) eoxvVar.build();
        eoxwVar2.getClass();
        eoyfVar.c = eoxwVar2;
        eoyfVar.b = 2;
        a(eoxpVar);
    }
}

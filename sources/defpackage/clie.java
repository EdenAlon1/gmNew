package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clie {
    public static final emyl a = cfvl.w("enable_xsl_smapi_send_message_method");
    public static final emyl b = cfvl.w("enable_xsl_smapi_send_service_chat");
    public static final emyl c = cfvl.w("enable_xsl_smapi_update_sent_intent");
    public static final emyl d = cfvl.w("enable_xsl_smapi_process_intent_chat");
    public static final emyl e = cfvl.w("enable_xsl_smapi_get_incoming_messages");
    public static final emyl f = cfvl.w("enable_xsl_smapi_update_incoming_intent");
    private final ffbr g;
    private final cqoh h;
    private final avuh i;

    public clie(ffbr ffbrVar, cqoh cqohVar, avuh avuhVar) {
        this.g = ffbrVar;
        this.h = cqohVar;
        this.i = avuhVar;
    }

    private final void d(fgkd fgkdVar) {
        akxl akxlVar = (akxl) this.g.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.XSL_REQUEST_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        fgki fgkiVar = (fgki) fgkdVar.build();
        fgkiVar.getClass();
        eolvVar2.aY = fgkiVar;
        eolvVar2.e |= 16777216;
        akxlVar.j(eoluVar);
    }

    @Deprecated
    public final void a(axad axadVar, bdhg bdhgVar) {
        c(axadVar, bdhgVar, 9, 16);
    }

    public final void b(bdhg bdhgVar, int i, int i2) {
        fgkd fgkdVar = (fgkd) fgki.a.createBuilder();
        if (bdhg.l(bdhgVar)) {
            fgkb fgkbVar = (fgkb) fgkc.a.createBuilder();
            fgkbVar.a(bdhgVar.f());
            fgkdVar.copyOnWrite();
            fgki fgkiVar = (fgki) fgkdVar.instance;
            fgkc fgkcVar = (fgkc) fgkbVar.build();
            fgkcVar.getClass();
            fgkiVar.d = fgkcVar;
            fgkiVar.b |= 2;
        }
        fgkdVar.copyOnWrite();
        ((fgki) fgkdVar.instance).f = fjaz.a(23);
        fgkdVar.copyOnWrite();
        ((fgki) fgkdVar.instance).e = fgkh.a(i);
        fgkdVar.copyOnWrite();
        ((fgki) fgkdVar.instance).g = fgkg.a(i2);
        eyja d2 = eykm.d(this.h.f().toEpochMilli());
        fgkdVar.copyOnWrite();
        fgki fgkiVar2 = (fgki) fgkdVar.instance;
        d2.getClass();
        fgkiVar2.h = d2;
        fgkiVar2.b |= 4;
        d(fgkdVar);
    }

    public final void c(axad axadVar, bdhg bdhgVar, int i, int i2) {
        fgkd fgkdVar = (fgkd) fgki.a.createBuilder();
        if (!axadVar.equals(axad.a)) {
            fjay fjayVar = (fjay) this.i.m().fP(axadVar);
            if (!cslz.a(fjayVar)) {
                return;
            }
            fgkdVar.copyOnWrite();
            fgki fgkiVar = (fgki) fgkdVar.instance;
            fjayVar.getClass();
            fgkiVar.c = fjayVar;
            fgkiVar.b |= 1;
        }
        if (bdhg.l(bdhgVar)) {
            fgkb fgkbVar = (fgkb) fgkc.a.createBuilder();
            fgkbVar.a(bdhgVar.f());
            fgkdVar.copyOnWrite();
            fgki fgkiVar2 = (fgki) fgkdVar.instance;
            fgkc fgkcVar = (fgkc) fgkbVar.build();
            fgkcVar.getClass();
            fgkiVar2.d = fgkcVar;
            fgkiVar2.b |= 2;
        }
        fgkdVar.copyOnWrite();
        ((fgki) fgkdVar.instance).f = fjaz.a(23);
        fgkdVar.copyOnWrite();
        ((fgki) fgkdVar.instance).e = fgkh.a(i);
        fgkdVar.copyOnWrite();
        ((fgki) fgkdVar.instance).g = fgkg.a(i2);
        eyja d2 = eykm.d(this.h.f().toEpochMilli());
        fgkdVar.copyOnWrite();
        fgki fgkiVar3 = (fgki) fgkdVar.instance;
        d2.getClass();
        fgkiVar3.h = d2;
        fgkiVar3.b |= 4;
        d(fgkdVar);
    }
}

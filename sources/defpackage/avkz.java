package defpackage;

import com.android.vcard.VCardConfig;
import j$.util.Collection;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avkz {
    public final avkk a;
    public final djsi b;
    public final ffbr c;
    private final ffbr d;

    public avkz(ffbr ffbrVar, avkk avkkVar, djsi djsiVar, ffbr ffbrVar2) {
        this.d = ffbrVar;
        this.a = avkkVar;
        this.b = djsiVar;
        this.c = ffbrVar2;
    }

    public final void a(bdhg bdhgVar, bdhg bdhgVar2) {
        eoop eoopVar = (eoop) eopq.a.createBuilder();
        String f = bdhgVar.f();
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopqVar.b |= Integer.MIN_VALUE;
        eopqVar.H = f;
        eqyl a = this.a.a();
        eoopVar.copyOnWrite();
        eopq eopqVar2 = (eopq) eoopVar.instance;
        eopqVar2.aa = a.h;
        eopqVar2.c |= 2097152;
        eoopVar.copyOnWrite();
        eopq eopqVar3 = (eopq) eoopVar.instance;
        eopqVar3.g = 5;
        eopqVar3.b |= 1;
        eoopVar.copyOnWrite();
        eopq eopqVar4 = (eopq) eoopVar.instance;
        eopqVar4.h = 12;
        eopqVar4.b |= 2;
        String f2 = bdhgVar2.f();
        eoopVar.copyOnWrite();
        eopq eopqVar5 = (eopq) eoopVar.instance;
        eopqVar5.c |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        eopqVar5.ag = f2;
        d((eopq) eoopVar.build());
    }

    public final void b(awxk awxkVar, eqxi eqxiVar) {
        eoop eoopVar = (eoop) eopq.a.createBuilder();
        String str = awxkVar.l;
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        str.getClass();
        eopqVar.b |= Integer.MIN_VALUE;
        eopqVar.H = str;
        eopq eopqVar2 = awxkVar.q;
        if (eopqVar2 == null) {
            eopqVar2 = eopq.a;
        }
        eqyl b = eqyl.b(eopqVar2.aa);
        if (b == null) {
            b = eqyl.UNKNOWN_RCS_TYPE;
        }
        eoopVar.copyOnWrite();
        eopq eopqVar3 = (eopq) eoopVar.instance;
        eopqVar3.aa = b.h;
        eopqVar3.c |= 2097152;
        eoopVar.copyOnWrite();
        eopq eopqVar4 = (eopq) eoopVar.instance;
        eopqVar4.g = 8;
        eopqVar4.b |= 1;
        eoopVar.copyOnWrite();
        eopq eopqVar5 = (eopq) eoopVar.instance;
        eopqVar5.h = 15;
        eopqVar5.b |= 2;
        eoopVar.copyOnWrite();
        eopq eopqVar6 = (eopq) eoopVar.instance;
        eqxiVar.getClass();
        eopqVar6.O = eqxiVar;
        eopqVar6.c |= 1024;
        d((eopq) eoopVar.build());
    }

    public final void c(bdhg bdhgVar, awui awuiVar) {
        eoop eoopVar = (eoop) eopq.a.createBuilder();
        String f = bdhgVar.f();
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopqVar.b |= Integer.MIN_VALUE;
        eopqVar.H = f;
        eqyl a = this.a.a();
        eoopVar.copyOnWrite();
        eopq eopqVar2 = (eopq) eoopVar.instance;
        eopqVar2.aa = a.h;
        eopqVar2.c |= 2097152;
        eoopVar.copyOnWrite();
        eopq eopqVar3 = (eopq) eoopVar.instance;
        eopqVar3.g = 3;
        eopqVar3.b |= 1;
        eoopVar.copyOnWrite();
        eopq eopqVar4 = (eopq) eoopVar.instance;
        eopqVar4.h = 15;
        eopqVar4.b |= 2;
        eqxh eqxhVar = (eqxh) eqxi.a.createBuilder();
        eqxj eqxjVar = (eqxj) eqxk.a.createBuilder();
        eqwy eqwyVar = eqwy.CHAT_API_FAILED_TRANSIENTLY;
        eqxjVar.copyOnWrite();
        eqxk eqxkVar = (eqxk) eqxjVar.instance;
        eqxkVar.g = eqwyVar.f;
        eqxkVar.b |= 16;
        eqww eqwwVar = eqww.CHAT_API_NO_RCS_SUBSCRIPTION;
        eqxjVar.copyOnWrite();
        eqxk eqxkVar2 = (eqxk) eqxjVar.instance;
        eqxkVar2.f = eqwwVar.C;
        eqxkVar2.b |= 8;
        eqxhVar.copyOnWrite();
        eqxi eqxiVar = (eqxi) eqxhVar.instance;
        eqxk eqxkVar3 = (eqxk) eqxjVar.build();
        eqxkVar3.getClass();
        eqxiVar.c = eqxkVar3;
        eqxiVar.b |= 1;
        eoopVar.copyOnWrite();
        eopq eopqVar5 = (eopq) eoopVar.instance;
        eqxi eqxiVar2 = (eqxi) eqxhVar.build();
        eqxiVar2.getClass();
        eopqVar5.O = eqxiVar2;
        eopqVar5.c |= 1024;
        eoxk eoxkVar = (eoxk) eoxo.a.createBuilder();
        ephf createBuilder = ephg.a.createBuilder();
        Stream map = Collection.EL.stream(this.b.m()).map(new avkx());
        String str = awuiVar.d;
        str.getClass();
        boolean anyMatch = map.anyMatch(new avky(str));
        createBuilder.copyOnWrite();
        ephg ephgVar = (ephg) createBuilder.instance;
        ephgVar.b |= 1;
        ephgVar.c = anyMatch;
        eoxkVar.copyOnWrite();
        eoxo eoxoVar = (eoxo) eoxkVar.instance;
        ephg build = createBuilder.build();
        build.getClass();
        eoxoVar.l = build;
        eoxoVar.b |= 1024;
        eoopVar.copyOnWrite();
        eopq eopqVar6 = (eopq) eoopVar.instance;
        eoxo eoxoVar2 = (eoxo) eoxkVar.build();
        eoxoVar2.getClass();
        eopqVar6.P = eoxoVar2;
        eopqVar6.c |= 2048;
        epag epagVar = (epag) epai.a.createBuilder();
        int i = true == ((ctvb) this.c.b()).I(awuiVar.d) ? 2 : 1;
        epagVar.copyOnWrite();
        epai epaiVar = (epai) epagVar.instance;
        epaiVar.d = i - 1;
        epaiVar.b |= 2;
        eoopVar.b(epagVar);
        d((eopq) eoopVar.build());
    }

    public final void d(eopq eopqVar) {
        akxl akxlVar = (akxl) this.d.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_MESSAGE;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eopqVar.getClass();
        eolvVar2.l = eopqVar;
        eolvVar2.b |= 4;
        akxlVar.j(eoluVar);
    }

    public final void e(awxk awxkVar, eqwy eqwyVar, int i) {
        eqxh eqxhVar = (eqxh) eqxi.a.createBuilder();
        eqxj eqxjVar = (eqxj) eqxk.a.createBuilder();
        eqxjVar.copyOnWrite();
        eqxk eqxkVar = (eqxk) eqxjVar.instance;
        eqxkVar.g = eqwyVar.f;
        eqxkVar.b |= 16;
        eqxjVar.copyOnWrite();
        eqxk eqxkVar2 = (eqxk) eqxjVar.instance;
        eqxkVar2.h = i - 1;
        eqxkVar2.b |= 32;
        eqxhVar.copyOnWrite();
        eqxi eqxiVar = (eqxi) eqxhVar.instance;
        eqxk eqxkVar3 = (eqxk) eqxjVar.build();
        eqxkVar3.getClass();
        eqxiVar.c = eqxkVar3;
        eqxiVar.b |= 1;
        b(awxkVar, (eqxi) eqxhVar.build());
    }
}

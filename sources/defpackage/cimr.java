package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cimr {
    public final ffbr a;
    public final ffbr b;
    private final cqoh c;
    private final errl d;

    public cimr(ffbr ffbrVar, cqoh cqohVar, ffbr ffbrVar2, errl errlVar) {
        this.a = ffbrVar;
        this.c = cqohVar;
        this.b = ffbrVar2;
        this.d = errlVar;
    }

    public final void a(final fgkd fgkdVar) {
        final long epochMilli = this.c.f().toEpochMilli();
        final long a = this.c.a();
        axnw.h(elfo.f(new Runnable() { // from class: cimq
            @Override // java.lang.Runnable
            public final void run() {
                fgkd fgkdVar2 = fgkdVar;
                fgkdVar2.copyOnWrite();
                fgki fgkiVar = (fgki) fgkdVar2.instance;
                fgki fgkiVar2 = fgki.a;
                fgkiVar.f = fjaz.a(30);
                long j = epochMilli;
                eyja d = eykm.d(j);
                fgkdVar2.copyOnWrite();
                fgki fgkiVar3 = (fgki) fgkdVar2.instance;
                d.getClass();
                fgkiVar3.h = d;
                fgkiVar3.b |= 4;
                akxl akxlVar = (akxl) cimr.this.a.b();
                eolu eoluVar = (eolu) eolv.a.createBuilder();
                eolt eoltVar = eolt.XSL_REQUEST_EVENT;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                eolvVar.j = eoltVar.dk;
                eolvVar.b |= 1;
                eoluVar.copyOnWrite();
                eolv eolvVar2 = (eolv) eoluVar.instance;
                fgki fgkiVar4 = (fgki) fgkdVar2.build();
                fgkiVar4.getClass();
                eolvVar2.aY = fgkiVar4;
                eolvVar2.e |= 16777216;
                akxlVar.m(eoluVar, epyw.XSL_REQUEST_EVENT, new akzo(j, a));
            }
        }, this.d));
    }

    public final void b(bdhg bdhgVar, fgkd fgkdVar) {
        double doubleValue = dizg.p().doubleValue();
        if (doubleValue < 1.0d) {
            String f = bdhgVar.f();
            if (doubleValue <= eobe.a || f.isEmpty() || Math.abs(f.hashCode()) > ((int) (doubleValue * 2.147483647E9d))) {
                return;
            }
        }
        a(fgkdVar);
    }
}

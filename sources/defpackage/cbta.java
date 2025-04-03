package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbta {
    public static final cskc a = cskc.g("BugleUsageStatistics", "IcingIndexRebuildLogger");
    public final ffbr b;
    public final ffbr c;
    private final errl d;

    public cbta(ffbr ffbrVar, ffbr ffbrVar2, errl errlVar) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = errlVar;
    }

    public final void a(final int i, final String str) {
        elfo.f(new Runnable() { // from class: cbsz
            @Override // java.lang.Runnable
            public final void run() {
                cbta cbtaVar = cbta.this;
                if (!((altk) cbtaVar.b.b()).am()) {
                    cbta.a.m("Clearcut loggings are disabled.");
                    return;
                }
                String str2 = str;
                eolu eoluVar = (eolu) eolv.a.createBuilder();
                eolt eoltVar = eolt.ICING_INDEX_REBUILD;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                eolvVar.j = eoltVar.dk;
                eolvVar.b |= 1;
                epcq epcqVar = (epcq) epct.a.createBuilder();
                epcqVar.copyOnWrite();
                epct epctVar = (epct) epcqVar.instance;
                str2.getClass();
                epctVar.b |= 4;
                epctVar.e = str2;
                epcqVar.copyOnWrite();
                epct epctVar2 = (epct) epcqVar.instance;
                int i2 = i;
                epctVar2.c = 2;
                epctVar2.b |= 1;
                epcqVar.copyOnWrite();
                epct epctVar3 = (epct) epcqVar.instance;
                epctVar3.d = i2 - 1;
                epctVar3.b |= 2;
                epct epctVar4 = (epct) epcqVar.build();
                eoluVar.copyOnWrite();
                eolv eolvVar2 = (eolv) eoluVar.instance;
                epctVar4.getClass();
                eolvVar2.as = epctVar4;
                eolvVar2.d |= 4096;
                ((akxl) cbtaVar.c.b()).j(eoluVar);
            }
        }, this.d).k(axnw.b(), erpp.a);
    }
}

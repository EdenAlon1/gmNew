package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdsy {
    static final cfup a = cfvl.i(cfvl.b, "enable_participants_table_operation_logging", false);
    public final ffbr b;
    public final errl c;

    public bdsy(ffbr ffbrVar, errl errlVar) {
        this.b = ffbrVar;
        this.c = errlVar;
    }

    public final void a(final int i, final int i2) {
        a.b().i(new eroh() { // from class: bdsw
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return elfo.e(null);
                }
                final int i3 = i2;
                final int i4 = i;
                final bdsy bdsyVar = bdsy.this;
                return elfo.f(new Runnable() { // from class: bdsx
                    @Override // java.lang.Runnable
                    public final void run() {
                        akxl akxlVar = (akxl) bdsy.this.b.b();
                        eolu eoluVar = (eolu) eolv.a.createBuilder();
                        eore eoreVar = (eore) eorf.a.createBuilder();
                        eoreVar.copyOnWrite();
                        eorf eorfVar = (eorf) eoreVar.instance;
                        eorfVar.c = i4 - 1;
                        eorfVar.b |= 1;
                        eoreVar.copyOnWrite();
                        eorf eorfVar2 = (eorf) eoreVar.instance;
                        eorfVar2.d = i3 - 1;
                        eorfVar2.b |= 2;
                        eoluVar.copyOnWrite();
                        eolv eolvVar = (eolv) eoluVar.instance;
                        eorf eorfVar3 = (eorf) eoreVar.build();
                        eorfVar3.getClass();
                        eolvVar.I = eorfVar3;
                        eolvVar.b |= Integer.MIN_VALUE;
                        eolt eoltVar = eolt.BUGLE_PARTICIPANTS_TABLE;
                        eoluVar.copyOnWrite();
                        eolv eolvVar2 = (eolv) eoluVar.instance;
                        eolvVar2.j = eoltVar.dk;
                        eolvVar2.b |= 1;
                        akxlVar.k(eoluVar, epyw.BUGLE_PARTICIPANTS_TABLE);
                    }
                }, bdsyVar.c);
            }
        }, erpp.a).k(axnw.b(), erpp.a);
    }
}

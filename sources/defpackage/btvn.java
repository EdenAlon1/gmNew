package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btvn extends dtvg {
    public btvn(dtvj dtvjVar, duap duapVar) {
        super(dtvjVar, duapVar == null ? new btvt(new btvx()) : duapVar);
    }

    public final engw a() {
        final btvt btvtVar = (btvt) this.b;
        return (engw) btvy.b().r("message_classifications_table-deleteAndReturnDeletedRows-txn", new emyl() { // from class: btuo
            @Override // defpackage.emyl
            public final Object get() {
                btvs a = btvy.a();
                btvt btvtVar2 = btvt.this;
                a.k(btvtVar2);
                a.z("message_classifications_table-deleteAndReturnDeletedRows-query");
                engw y = a.b().y();
                btvo btvoVar = new btvo();
                btvoVar.b = btvtVar2;
                btvoVar.f("message_classifications_table-deleteAndReturnDeletedRows-delete");
                btvoVar.b().b();
                return y;
            }
        });
    }
}

package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buxg extends dtvg {
    public buxg(dtvj dtvjVar, duap duapVar) {
        super(dtvjVar, duapVar == null ? new buxs(new buxz()) : duapVar);
    }

    public final engw a() {
        final buxs buxsVar = (buxs) this.b;
        return (engw) MessagesTable.f().r("messages-deleteAndReturnDeletedRows-txn", new emyl() { // from class: buog
            @Override // defpackage.emyl
            public final Object get() {
                buxo d = MessagesTable.d();
                buxs buxsVar2 = buxs.this;
                d.k(buxsVar2);
                d.z("messages-deleteAndReturnDeletedRows-query");
                engw y = d.b().y();
                buxh buxhVar = new buxh();
                buxhVar.b = buxsVar2;
                buxhVar.f("messages-deleteAndReturnDeletedRows-delete");
                buxhVar.b().b();
                return y;
            }
        });
    }
}

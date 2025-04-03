package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buxq extends duaj {
    public buxq(String str, ContentValues contentValues, Map map, engw engwVar, duan duanVar) {
        super(str, contentValues, map, engwVar, duanVar);
    }

    public final int a() {
        return this.a.getAsInteger("message_status").intValue();
    }

    public final engw b() {
        final int i = 0;
        return (engw) MessagesTable.f().r("messages.updateAndReturnUpdatedRows-txn", new emyl() { // from class: buxp
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emyl
            public final Object get() {
                buxo d = MessagesTable.d();
                d.z("messages.updateAndReturnUpdatedRows-query");
                buxq buxqVar = buxq.this;
                engw engwVar = buxqVar.e;
                int i2 = ((enou) engwVar).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    d.k((buxs) ((duap) engwVar.get(i3)));
                }
                if (((dtrm) buxqVar.d).b) {
                    buxz buxzVar = new buxz();
                    buxzVar.as(buxqVar.h());
                    d.g(buxzVar);
                }
                if (((dtrm) buxqVar.d).c) {
                    d.r();
                }
                Integer num = i;
                engw y = d.b().y();
                num.intValue();
                buxqVar.t(0);
                return y;
            }
        });
    }
}

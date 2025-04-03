package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvvq extends duaj {
    public bvvq(String str, ContentValues contentValues, Map map, engw engwVar, duan duanVar) {
        super(str, contentValues, map, engwVar, duanVar);
    }

    public final engw a() {
        final int i = 0;
        return (engw) ParticipantsTable.g().r("participants.updateAndReturnUpdatedRows-txn", new emyl() { // from class: bvvo
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emyl
            public final Object get() {
                bvvn e = ParticipantsTable.e();
                e.z("participants.updateAndReturnUpdatedRows-query");
                bvvq bvvqVar = bvvq.this;
                engw engwVar = bvvqVar.e;
                int i2 = ((enou) engwVar).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    e.k((bvvs) ((duap) engwVar.get(i3)));
                }
                if (((dtrm) bvvqVar.d).b) {
                    bvvw bvvwVar = new bvvw();
                    bvvwVar.as(bvvqVar.h());
                    e.g(bvvwVar);
                }
                if (((dtrm) bvvqVar.d).c) {
                    e.r();
                }
                Integer num = i;
                engw y = e.b().y();
                num.intValue();
                bvvqVar.t(0);
                return y;
            }
        });
    }

    public final engw b() {
        return (engw) ParticipantsTable.g().r("updateAndReturnUpdatedRowsAfterUpdate-txn-participants", new emyl() { // from class: bvvp
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emyl
            public final Object get() {
                bvvn e = ParticipantsTable.e();
                e.z("updateAndReturnUpdatedRowsAfterUpdate-pre-participants");
                e.u();
                e.n(new dtzq("ROWID", new Object[0]), "_rowid");
                bvvq bvvqVar = bvvq.this;
                engw engwVar = bvvqVar.e;
                int i = ((enou) engwVar).c;
                for (int i2 = 0; i2 < i; i2++) {
                    e.k((bvvs) ((duap) engwVar.get(i2)));
                }
                if (((dtrm) bvvqVar.d).b) {
                    bvvw bvvwVar = new bvvw();
                    bvvwVar.as(bvvqVar.h());
                    e.g(bvvwVar);
                }
                engr engrVar = new engr();
                bvti bvtiVar = (bvti) e.b().o();
                while (bvtiVar.moveToNext()) {
                    try {
                        engrVar.h(bvtiVar.dd("_rowid"));
                    } catch (Throwable th) {
                        try {
                            bvtiVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bvtiVar.close();
                String str = (String) Collection.EL.stream(engrVar.g()).collect(Collectors.joining(","));
                bvvqVar.e();
                bvvn e2 = ParticipantsTable.e();
                e2.z("updateAndReturnUpdatedRowsAfterUpdate-post-participants");
                bvvw bvvwVar2 = new bvvw();
                bvvwVar2.as(new dtzq("ROWID IN ($R)", new Object[]{str}));
                e2.g(bvvwVar2);
                return ((bvti) e2.b().o()).cW();
            }
        });
    }

    public final String c() {
        return this.a.getAsString("normalized_destination");
    }

    public final String d() {
        return this.a.getAsString("send_destination");
    }
}

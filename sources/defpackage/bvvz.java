package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvvz implements fbba {
    public static dtux a() {
        return new dtuf(ParticipantsTable.e, true, "participants", new dtue() { // from class: bvvh
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = ParticipantsTable.a;
                valueOf.getClass();
                if (i != 57070) {
                    return;
                }
                ParticipantsTable.o(dtveVar, 57070);
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}

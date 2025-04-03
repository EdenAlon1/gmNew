package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bcpk implements bckb {
    public static final bcpk a = new bcpk();

    private bcpk() {
    }

    @Override // defpackage.bckb
    public final long a() {
        bvvn e = ParticipantsTable.e();
        e.z("queryTableMaxId");
        return e.b().k(ParticipantsTable.c.a);
    }

    @Override // defpackage.bckb
    public final bckn b() {
        return bckf.c;
    }

    @Override // defpackage.bckb
    public final dtvx c() {
        String[] strArr = ParticipantsTable.a;
        return new dtvx("participants", "$primary");
    }

    @Override // defpackage.bckb
    public final /* synthetic */ String d() {
        return bcka.a(this);
    }
}

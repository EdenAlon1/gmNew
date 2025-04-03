package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bcmr implements bckb {
    public static final bcmr a = new bcmr();

    private bcmr() {
    }

    @Override // defpackage.bckb
    public final long a() {
        bwdf c = PartsTable.c();
        c.z("queryTableMaxId");
        return c.b().k(PartsTable.d.a);
    }

    @Override // defpackage.bckb
    public final bckn b() {
        return bckf.d;
    }

    @Override // defpackage.bckb
    public final dtvx c() {
        String[] strArr = PartsTable.a;
        return new dtvx("parts", "$primary");
    }

    @Override // defpackage.bckb
    public final /* synthetic */ String d() {
        return bcka.a(this);
    }
}

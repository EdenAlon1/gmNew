package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcmq implements bckb {
    @Override // defpackage.bckb
    public final long a() {
        buxo d = MessagesTable.d();
        d.z("queryTableMaxId");
        return d.b().k(MessagesTable.c.a);
    }

    @Override // defpackage.bckb
    public final bckn b() {
        return bckf.b;
    }

    @Override // defpackage.bckb
    public final dtvx c() {
        String[] strArr = MessagesTable.a;
        return new dtvx("messages", "$primary");
    }

    @Override // defpackage.bckb
    public final /* synthetic */ String d() {
        return bcka.a(this);
    }
}

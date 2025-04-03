package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjpr extends ffhv implements ffjm {
    final /* synthetic */ cjps a;
    final /* synthetic */ cjpb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjpr(cjps cjpsVar, cjpb cjpbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cjpsVar;
        this.b = cjpbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjpr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        batc batcVar = this.a.a;
        cjpb cjpbVar = this.b;
        ContentValues contentValues = cjpbVar.f;
        cjov cjovVar = cjpbVar.e;
        Uri i = batcVar.i(contentValues, cjovVar.c, cjovVar.a);
        if (i == null) {
            cjpb cjpbVar2 = this.b;
            return new cjpc(cjpbVar2.a, cjpbVar2.b);
        }
        cjpb cjpbVar3 = this.b;
        cjpb a = cjpb.a(cjpbVar3, cjov.a(cjpbVar3.e, i, null, 95));
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.S(i);
        buxrVar.e(this.b.e.g);
        return a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjpr(this.a, this.b, ffguVar);
    }
}

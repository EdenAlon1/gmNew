package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crrp extends ffhv implements ffjm {
    final /* synthetic */ crrq a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crrp(crrq crrqVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = crrqVar;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crrp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        String U;
        crqk a;
        ffci.b(obj);
        ParticipantsTable.BindData b = ((bdrr) this.a.b.b()).b(this.b);
        if (b != null && (U = b.U()) != null && U.length() != 0 && ((crrm) this.a.a.b()).f(U)) {
            crrm crrmVar = (crrm) this.a.a.b();
            a = crqj.a(true, U, (r15 & 4) != 0, ((r15 & 8) == 0) & true, null, 3, 8, 2);
            crrmVar.b(a);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new crrp(this.a, this.b, ffguVar);
    }
}

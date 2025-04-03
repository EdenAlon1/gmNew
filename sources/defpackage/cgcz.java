package defpackage;

import com.google.android.gms.auth.UserRecoverableAuthException;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgcz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cgdb b;
    final /* synthetic */ UserRecoverableAuthException c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgcz(cgdb cgdbVar, UserRecoverableAuthException userRecoverableAuthException, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cgdbVar;
        this.c = userRecoverableAuthException;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgcz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl b = ((cfyt) this.b.a.b()).b(this.c);
            this.a = 1;
            if (fgfz.c(b, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cgcz(this.b, this.c, ffguVar);
    }
}

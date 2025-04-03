package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aquj extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ SelfIdentityId d;
    final /* synthetic */ aqum e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aquj(SelfIdentityId selfIdentityId, aqum aqumVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = selfIdentityId;
        this.e = aqumVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aquj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c7  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aquj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aquj(this.d, this.e, ffguVar);
    }
}

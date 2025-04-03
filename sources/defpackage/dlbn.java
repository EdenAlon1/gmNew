package defpackage;

import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlbn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dlbp b;
    final /* synthetic */ ewer c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlbn(dlbp dlbpVar, ewer ewerVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dlbpVar;
        this.c = ewerVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlbn) c((ewfn) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                ewfn ewfnVar = (ewfn) this.d;
                ((enrr) this.b.a.h().h("com/google/android/libraries/abuse/hades/moirai/download/PersephoneGrpcBlobFetcher$fetch$downloadBlobResponse$1", "invokeSuspend", 120, "PersephoneGrpcBlobFetcher.kt")).t("PersephoneGrpcBlobFetcher starts downloading: %s", this.c);
                ewer ewerVar = this.c;
                this.a = 1;
                obj = ewfnVar.b(ewerVar, new febo(), this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            return (ewev) obj;
        } catch (StatusException e) {
            throw new dlbz("DownloadBlob request failed: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dlbn dlbnVar = new dlbn(this.b, this.c, ffguVar);
        dlbnVar.d = obj;
        return dlbnVar;
    }
}

package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ybj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ybt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybj(ybt ybtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ybtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ybj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            Object b = this.b.d.b();
            b.getClass();
            comc comcVar = (comc) fflm.b((Optional) b);
            if (comcVar != null) {
                this.a = 1;
                obj = comcVar.c(this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            return null;
        }
        ycq ycqVar = (ycq) obj;
        if (ycqVar != null) {
            if ((ycqVar.b & 1) != 0) {
                eyja eyjaVar = ycqVar.c;
                if (eyjaVar == null) {
                    eyjaVar = eyja.a;
                }
                eyjaVar.getClass();
                return eykn.d(eyjaVar);
            }
            ensk j = ybt.a.j();
            j.Y(ente.a, "BugleComposeRow2");
            ((enrr) j.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ComposeRowStateParser$getLastAcceptedDraftTimestamp$2", "invokeSuspend", 141, "ComposeRowStateParser.kt")).q("ComposeRowStateParser#getLastAcceptedDraftTimestamp: last accepted draft timestamp was not present");
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ybj(this.b, ffguVar);
    }
}

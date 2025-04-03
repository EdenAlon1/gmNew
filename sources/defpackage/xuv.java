package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xuv extends ffhv implements ffjm {
    final /* synthetic */ xhm a;
    final /* synthetic */ xho b;
    final /* synthetic */ xuw c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xuv(xhm xhmVar, xho xhoVar, xuw xuwVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = xhmVar;
        this.b = xhoVar;
        this.c = xuwVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xuv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensk h = xuw.a.h();
        h.Y(ente.a, "BugleComposeRow2");
        ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentState$launchReplaceAttachment$1", "invokeSuspend", 281, "DraftAttachmentState.kt")).D("Replacing in draft state: %s with %s", this.a, this.b);
        final ffkz ffkzVar = new ffkz();
        ffkzVar.a = -1;
        final xhm xhmVar = this.a;
        final xho xhoVar = this.b;
        this.c.d.c(new ffji() { // from class: xuu
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                xhu xhuVar = (xhu) obj2;
                List list = xhuVar.b;
                xhm xhmVar2 = xhmVar;
                int indexOf = list.indexOf(xhmVar2);
                ffkz ffkzVar2 = ffkz.this;
                ffkzVar2.a = indexOf;
                xho xhoVar2 = xhoVar;
                if (indexOf >= 0) {
                    List am = ffdx.am(xhuVar.b);
                    am.set(ffkzVar2.a, xhoVar2);
                    return xhu.c(xhuVar, null, am, null, false, null, null, false, 0, 1021);
                }
                ensk j = xuw.a.j();
                j.Y(ente.a, "BugleComposeRow2");
                ((enrr) j.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentState$launchReplaceAttachment$1", "invokeSuspend$lambda$0", 288, "DraftAttachmentState.kt")).D("Failed to replace attachment %s with %s", xhmVar2, xhoVar2);
                return xhuVar;
            }
        });
        if (this.c.h.a() && ffkzVar.a < 0) {
            ((xfv) this.c.i.b()).a(this.a, this.d);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xuv(this.a, this.b, this.c, this.d, ffguVar);
    }
}

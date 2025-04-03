package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsdk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dsed b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsdk(dsed dsedVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dsedVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsdk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object bT;
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                dsed dsedVar = this.b;
                this.a = 1;
                bT = dsedVar.bT(true, this);
                if (bT == ffhhVar) {
                    return ffhhVar;
                }
            }
        } catch (Exception e) {
            if (!(e instanceof RuntimeException) && (!(e instanceof IOException) || !dsed.bm(this.b).b)) {
                throw e;
            }
            ((enrr) ((enrr) dsed.a.i()).g(e).h("com/google/android/libraries/compose/sticker/ui/screen/StickerScreen$onViewCreated$10$onStickerPackFavoriteOrdered$1", "invokeSuspend", 209, "StickerScreen.kt")).q("Unable to update favorites ordering.");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsdk(this.b, ffguVar);
    }
}

package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emgd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ emge b;
    final /* synthetic */ Bitmap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emgd(emge emgeVar, Bitmap bitmap, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = emgeVar;
        this.c = bitmap;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((emgd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                emgc emgcVar = new emgc(this.b, this.c, null);
                this.a = 1;
                obj = ffvm.a(10000L, emgcVar, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
        } catch (emgw e) {
            adak adakVar = this.b.x;
            if (adakVar != null) {
                adakVar.b(draw.g);
            }
            ((enrr) ((enrr) this.b.e.i()).g(e).h("com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel$segmentImage$1", "invokeSuspend", 267, "EmotifyViewModel.kt")).q("Error setting up segmenter or segmenting image");
            this.b.a(e.a);
        } catch (ffvj e2) {
            adak adakVar2 = this.b.x;
            if (adakVar2 != null) {
                adakVar2.b(draw.d);
            }
            ((enrr) ((enrr) this.b.e.i()).g(e2).h("com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel$segmentImage$1", "invokeSuspend", 271, "EmotifyViewModel.kt")).q("Timed out segmenting image");
            this.b.a(emgv.b);
        } catch (OutOfMemoryError e3) {
            adak adakVar3 = this.b.x;
            if (adakVar3 != null) {
                adakVar3.b(draw.e);
            }
            ((enrr) ((enrr) this.b.e.i()).g(e3).h("com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel$segmentImage$1", "invokeSuspend", 276, "EmotifyViewModel.kt")).q("Running out of memory while segmenting");
            this.b.a(emgv.c);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new emgd(this.b, this.c, ffguVar);
    }
}

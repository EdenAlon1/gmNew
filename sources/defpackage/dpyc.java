package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpyc extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ dpyd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpyc(dpyd dpydVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dpydVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpyc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffji ffjiVar;
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.b != 0) {
                Object obj2 = this.a;
                ffci.b(obj);
                ffjiVar = obj2;
            } else {
                ffci.b(obj);
                dpyd dpydVar = this.c;
                ffji ffjiVar2 = dpydVar.z;
                dpui G = dpydVar.G();
                atl atlVar = this.c.B;
                this.a = ffjiVar2;
                this.b = 1;
                obj = G.b(atlVar, R.id.mini_camera_preview_view, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
                ffjiVar = ffjiVar2;
            }
            ffjiVar.invoke(obj);
        } catch (avl e) {
            ((enrr) ((enrr) dpyd.v.i()).g(e).h("com/google/android/libraries/compose/cameragallery/ui/camera/mini/MiniCameraViewHolder$takePhoto$1", "invokeSuspend", 247, "MiniCameraViewHolder.kt")).q("Unable to capture image");
            this.c.I(R.string.mini_camera_take_photo_failed_error_message);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpyc(this.c, ffguVar);
    }
}

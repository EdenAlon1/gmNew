package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egtt extends ffhv implements ffji {
    int a;
    final /* synthetic */ egub b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egtt(egub egubVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = egubVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        egub egubVar = this.b;
        this.a = 1;
        efug efugVar = egubVar.h;
        String valueOf = String.valueOf(efugVar.a.getPackageName());
        Context context = efugVar.a;
        if (!context.getCacheDir().exists()) {
            context.getCacheDir().mkdirs();
        }
        File file = new File(context.getCacheDir(), "photopicker_images");
        if (!file.exists()) {
            file.mkdirs();
        }
        Uri a = FileProvider.a(efugVar.a, valueOf.concat(".photopicker_images"), new File(file, "camera_image.jpg"));
        a.getClass();
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new egtt(this.b, (ffgu) obj).b(ffcu.a);
    }
}

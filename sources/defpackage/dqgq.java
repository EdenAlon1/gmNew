package defpackage;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqgq extends ffhv implements ffjm {
    final /* synthetic */ dqgr a;
    final /* synthetic */ drlx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqgq(dqgr dqgrVar, drlx drlxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dqgrVar;
        this.b = drlxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqgq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        File file = new File(this.a.a.getFilesDir(), "hugo");
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file, this.a.c);
        if (!file2.exists()) {
            file2.mkdir();
        }
        long epochMilli = this.a.b.a().toEpochMilli();
        drlx drlxVar = this.b;
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(drlxVar.a());
        if (extensionFromMimeType == null) {
            ((enrr) drlx.a.j().h("com/google/android/libraries/compose/media/MediaType", "toFileExtension", 31, "MediaType.kt")).t("'%s' extension not found, returning null", drlxVar);
        }
        extensionFromMimeType.getClass();
        File file3 = new File(file2, epochMilli + "." + extensionFromMimeType);
        if (!file3.exists()) {
            file3.createNewFile();
        }
        Uri a = FileProvider.a(this.a.a, "com.google.android.libraries.compose.core.data.content", file3);
        Context context = this.a.a;
        context.grantUriPermission(context.getApplicationContext().getPackageName(), a, 2);
        return a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqgq(this.a, this.b, ffguVar);
    }
}

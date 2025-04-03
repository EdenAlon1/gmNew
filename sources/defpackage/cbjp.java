package defpackage;

import android.graphics.Rect;
import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbjp extends ffhv implements ffjm {
    final /* synthetic */ cbjv a;
    final /* synthetic */ Uri b;
    final /* synthetic */ ContentType c;
    final /* synthetic */ long d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbjp(ffgu ffguVar, cbjv cbjvVar, Uri uri, ContentType contentType, long j) {
        super(2, ffguVar);
        this.a = cbjvVar;
        this.b = uri;
        this.c = contentType;
        this.d = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbjp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ctap ctapVar = this.a.c;
        Uri uri = this.b;
        ContentType contentType = this.c;
        String contentType2 = contentType.toString();
        Rect h = ctapVar.h(uri, contentType.toString());
        int width = h.width();
        int height = h.height();
        try {
            boolean A = le.A(contentType2);
            long j = this.d;
            cbjv cbjvVar = this.a;
            Uri uri2 = this.b;
            int i = (int) j;
            crbd crbdVar = cbjvVar.b;
            return A ? crbdVar.c(uri2, i, width, height) : crbdVar.b(uri2, contentType2, i, width, height);
        } catch (IOException e) {
            ((ensz) ((ensz) ((ensz) crbd.a.i()).g(e)).h("com/google/android/apps/messaging/shared/transfer/preview/FilePreviewCreator", "getImagePreview", '^', "FilePreviewCreator.java")).q("Cannot get a file transfer preview.");
            return null;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cbjp cbjpVar = new cbjp(ffguVar, this.a, this.b, this.c, this.d);
        cbjpVar.e = obj;
        return cbjpVar;
    }
}

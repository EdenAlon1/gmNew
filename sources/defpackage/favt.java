package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class favt {
    public final int a;
    public final favs b;
    public final InputStream c;

    public favt(int i, favs favsVar, InputStream inputStream) {
        this.a = i;
        this.b = favsVar;
        this.c = inputStream;
    }

    public final String a() {
        favs favsVar = this.b;
        String a = favsVar.a("X-GUploader-UploadID");
        String valueOf = String.valueOf(favsVar);
        String concat = a == null ? "\n No upload id." : "\n Upload id: ".concat(a);
        return "HttpResponse:\n   " + this.a + "  " + valueOf + concat;
    }
}

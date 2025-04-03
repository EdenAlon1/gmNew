package defpackage;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcun implements ellh {
    final /* synthetic */ dcty a;

    public dcun(dcty dctyVar) {
        this.a = dctyVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        dcty dctyVar = this.a;
        if (dctyVar.x()) {
            dctyVar.g(dctyVar.ak);
        } else if (dctyVar.N != null) {
            if (dctyVar.t != null) {
                dctyVar.B(4);
                dctyVar.A(4);
            }
            if (((Boolean) ((cfup) ctjd.aD.get()).e()).booleanValue() && csuu.C(dctyVar.N.b())) {
                ejlr ejlrVar = dctyVar.ak;
                ejlq ejlqVar = dctyVar.e;
                final dcvj dcvjVar = dctyVar.am;
                Uri b = dctyVar.N.b();
                final String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(b.toString());
                ejlqVar.i(new ejlp(elfl.g(qsl.a(dcvjVar.c.c().i(b))).h(new emwl() { // from class: dcvi
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        String str = fileExtensionFromUrl;
                        File file = (File) obj;
                        if (true == emxe.c(str)) {
                            str = "png";
                        }
                        dcvj dcvjVar2 = dcvj.this;
                        Uri d = cbgi.d(str, dcvjVar2.b);
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            try {
                                Uri e = csuu.e(dcvjVar2.b, fileInputStream, d);
                                fileInputStream.close();
                                return e != null ? e : Uri.EMPTY;
                            } finally {
                            }
                        } catch (IOException unused) {
                            return Uri.EMPTY;
                        }
                    }
                }, dcvjVar.a)), new ejlm(dctyVar.N.b()), ejlrVar);
            } else {
                dctyVar.v(dctyVar.N.b(), dctyVar.N.h());
            }
        }
        return elli.a;
    }
}

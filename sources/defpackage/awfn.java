package defpackage;

import android.net.Uri;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awfn extends duak {
    public awfn() {
        super("file_processing");
    }

    @Override // defpackage.duak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final awfm b() {
        ah();
        return new awfm(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(awup awupVar) {
        if (awupVar == null) {
            this.a.putNull("content_type");
        } else {
            this.a.put("content_type", awupVar.toByteArray());
        }
    }

    public final void d(fayi fayiVar) {
        if (fayiVar == null) {
            this.a.putNull("encryption_metadata");
        } else {
            this.a.put("encryption_metadata", fayiVar.toByteArray());
        }
    }

    public final void e(Uri uri) {
        if (uri == null) {
            this.a.putNull("file_uri");
        } else {
            this.a.put("file_uri", uri.toString());
        }
    }

    public final void f(String str) {
        dtub.u(this.a, "transfer_handle", str);
    }

    public final void g(awvb awvbVar) {
        if (awvbVar == null) {
            this.a.putNull("upload_result");
        } else {
            this.a.put("upload_result", awvbVar.toByteArray());
        }
    }

    public final void h(Function function) {
        Object apply;
        String[] strArr = awfq.a;
        apply = function.apply(new awfp());
        af(new awfo((awfp) apply));
    }
}

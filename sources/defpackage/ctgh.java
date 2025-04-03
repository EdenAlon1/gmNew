package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctgh {
    public final Context a;
    public final ejlk b;
    private final aufi c;
    private final ffbr d;

    public ctgh(Context context, ejlk ejlkVar, aufi aufiVar, ffbr ffbrVar) {
        context.getClass();
        ejlkVar.getClass();
        ffbrVar.getClass();
        this.a = context;
        this.b = ejlkVar;
        this.c = aufiVar;
        this.d = ffbrVar;
    }

    public final String a(String str) {
        if (this.c.a() && lre.l(str)) {
            int i = 1;
            if (cted.a(str, true)) {
                if (ffkj.e(str, "video/avc")) {
                    i = 2;
                } else if (ffkj.e(str, "video/hevc")) {
                    i = 3;
                }
                ((akzt) this.d.b()).e("Bugle.Media.Attachment.Resize.Video.TargetMimeType.Count", i - 1);
                return str;
            }
        }
        if (!lre.l((String) cbib.h.e())) {
            return "video/avc";
        }
        Object e = cbib.h.e();
        e.getClass();
        return (String) e;
    }
}

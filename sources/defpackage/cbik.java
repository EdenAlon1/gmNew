package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbik extends cbiq {
    private static final enru i = enru.c("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ImageResizingJob");
    private final int j;
    private final int k;
    private final Context l;
    private final ctap m;
    private final epll n;
    private final ffbr o;

    public cbik(Context context, ffbr ffbrVar, errl errlVar, ffbr ffbrVar2, cbiy cbiyVar, ContentType contentType) {
        super(context, cbiyVar, contentType, errlVar);
        int i2;
        this.n = (epll) eplp.a.createBuilder();
        this.l = context;
        ctap ctapVar = (ctap) ffbrVar.b();
        this.m = ctapVar;
        Uri uri = this.c;
        if (uri != null) {
            Rect h = ctapVar.h(uri, contentType != null ? contentType.toString() : null);
            this.j = h.width();
            i2 = h.height();
        } else {
            i2 = 0;
            this.j = 0;
        }
        this.k = i2;
        this.o = ffbrVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x015f, code lost:
    
        r3 = defpackage.cbik.i.j();
        r3.Y(defpackage.ente.a, "BugleResizing");
        ((defpackage.enrr) ((defpackage.enrr) r3).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ImageResizingJob", "runInBackgroundInTrace", 116, "ImageResizingJob.java")).q("Cannot resize image with unknown width");
     */
    @Override // defpackage.cbiq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final defpackage.elfl a() {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbik.a():elfl");
    }

    @Override // defpackage.cbiq
    public final eplp b() {
        return (eplp) this.n.build();
    }

    public cbik(Context context, ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, cbiy cbiyVar, ContentType contentType, Rect rect) {
        super(context, cbiyVar, contentType, errlVar);
        this.n = (epll) eplp.a.createBuilder();
        this.l = context;
        this.m = (ctap) ffbrVar.b();
        this.j = rect.width();
        this.k = rect.height();
        this.o = ffbrVar2;
    }
}

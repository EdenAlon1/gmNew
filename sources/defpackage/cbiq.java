package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cbiq {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingJob");
    public Uri b;
    protected final Uri c;
    protected final long d;
    public ContentType e;
    protected final String f;
    public final Context g;
    public byzc h;
    private final errl i;

    public cbiq(Context context, cbiy cbiyVar, ContentType contentType, errl errlVar) {
        this.g = context;
        this.c = Uri.parse(cbiyVar.c);
        this.d = cbiyVar.d;
        this.f = (cbiyVar.b & 8) != 0 ? cbiyVar.f : null;
        this.e = contentType;
        this.i = errlVar;
    }

    protected abstract elfl a();

    public abstract eplp b();

    public final elfl c() {
        efbd.b();
        this.b = cbgi.d(null, this.g);
        this.h = byzc.FAILED;
        try {
            ensk h = a.h();
            h.Y(ente.a, "BugleResizing");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingJob", "run", 65, "ResizingJob.java")).K("Starting %s, contentUri: %s, outputUri: %s, maxFileSize: %d", getClass().getName(), this.c, this.b, Long.valueOf(this.d));
            return a().h(new emwl() { // from class: cbip
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    Boolean bool = (Boolean) obj;
                    ekzz f = eleg.f("ResizingJob::onFinished");
                    try {
                        boolean booleanValue = bool.booleanValue();
                        cbiq cbiqVar = cbiq.this;
                        if (booleanValue) {
                            cbiqVar.h = byzc.SUCCEEDED;
                        } else {
                            cbgi.j(cbiqVar.g, cbiqVar.b);
                        }
                        ensk h2 = cbiq.a.h();
                        h2.Y(ente.a, "BugleResizing");
                        ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingJob", "run", 78, "ResizingJob.java")).K("Finished %s, status: %s, contentUri: %s, outputUri: %s", cbiqVar.getClass().getName(), cbiqVar.h, cbiqVar.c, cbiqVar.b);
                        f.close();
                        return bool;
                    } finally {
                    }
                }
            }, this.i);
        } catch (Exception e) {
            ensk j = a.j();
            j.Y(ente.a, "BugleResizing");
            ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingJob", "run", 86, "ResizingJob.java")).t("Exception while transcoding contentUri: %s", this.c);
            if (e instanceof csjf) {
                this.h = byzc.TOO_LARGE;
            }
            cbgi.j(this.g, this.b);
            return elfo.e(false);
        }
    }

    public final int d() {
        int ordinal = this.h.ordinal();
        if (ordinal == 0) {
            return 3;
        }
        if (ordinal == 1) {
            return 4;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? 2 : 6;
        }
        return 5;
    }
}

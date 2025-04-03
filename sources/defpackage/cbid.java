package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cbid {
    public static final cskc a = cskc.g("BugleResizing", "ResizingJob");
    protected final Uri b;
    protected final Uri c;
    protected final long d;
    protected String e;
    public boolean f;
    private final cbic g;
    private byzc h;
    private final bazm i;

    public cbid(MessagePartCoreData messagePartCoreData, cbic cbicVar, bazm bazmVar) {
        this.b = messagePartCoreData.w();
        this.c = messagePartCoreData.t();
        this.d = messagePartCoreData.p();
        this.e = messagePartCoreData.V();
        this.g = cbicVar;
        this.i = bazmVar;
    }

    protected abstract void a();

    protected abstract boolean b();

    public final void c() {
        csix.h();
        this.h = byzc.FAILED;
        try {
            try {
                try {
                    try {
                        csjb a2 = a.a();
                        a2.I("Starting");
                        a2.I(getClass().getName());
                        a2.A("contentUri", this.c);
                        a2.A("outputUri", this.b);
                        a2.z("maxFileSize", this.d);
                        a2.r();
                        if (b()) {
                            this.h = byzc.SUCCEEDED;
                        }
                    } catch (Throwable th) {
                        try {
                            "ResizingJob::onFinished".close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    csjb e2 = a.e();
                    e2.I("Exception while transcoding.");
                    e2.A("contentUri", this.c);
                    e2.s(e);
                    if (e instanceof csjf) {
                        this.h = byzc.TOO_LARGE;
                    }
                }
            } finally {
                csjb a3 = a.a();
                a3.I(getClass().getName());
                a3.A("status", this.h);
                a3.A("contentUri", this.c);
                a3.A("outputUri", this.b);
                a3.r();
                this.f = true;
                ekzz f = eleg.f("ResizingJob::onFinished");
                this.g.a(this.b);
                f.close();
                if (this.c != null) {
                    ekzz f2 = eleg.f("ResizingJob::startUAARA");
                    this.i.a(this.c.toString(), this.b.toString(), this.e, this.h).A();
                    f2.close();
                }
            }
        } catch (Throwable th3) {
            try {
                "ResizingJob::startUAARA".close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}

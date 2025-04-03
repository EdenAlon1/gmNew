package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbii extends cbid {
    private final Context g;
    private final albq h;
    private final ctfi i;

    public cbii(Context context, albq albqVar, ctfi ctfiVar, bazm bazmVar, MessagePartCoreData messagePartCoreData, cbic cbicVar) {
        super(messagePartCoreData, cbicVar, bazmVar);
        this.g = context;
        this.h = albqVar;
        this.i = ctfiVar;
    }

    @Override // defpackage.cbid
    protected final void a() {
        this.i.j = true;
    }

    @Override // defpackage.cbid
    protected final boolean b() {
        ekzz f = eleg.f("VideoResizingJob#runInBackground");
        try {
            boolean z = false;
            if (this.c == null) {
                csjy.n("Bugle", "Cannot resize video with null contentUri");
            } else {
                akzw b = this.h.b("Bugle.Media.Attachment.Resize.Video.Duration");
                try {
                    File i = cbgi.i(this.b, this.g);
                    ctfi ctfiVar = this.i;
                    cteq i2 = cter.i();
                    i2.g(this.c);
                    i2.e(i);
                    i2.f(this.d);
                    ((cteh) i2).a = this.e;
                    ((cteh) i2).b = "video/avc";
                    i2.c(((Boolean) cbib.a.e()).booleanValue());
                    i2.d(((Double) cbib.b.e()).doubleValue());
                    if (ctfiVar.d(i2.a())) {
                        b.c();
                        z = true;
                    } else {
                        long j = this.i.k;
                        if (j > 0) {
                            i.delete();
                            ctfi ctfiVar2 = this.i;
                            cteq i3 = cter.i();
                            i3.g(this.c);
                            i3.e(i);
                            i3.f(this.d);
                            ((cteh) i3).a = this.e;
                            ((cteh) i3).b = "video/avc";
                            i3.b((this.d / j) * 0.7200000286102295d);
                            i3.c(((Boolean) cbib.a.e()).booleanValue());
                            i3.d(((Double) cbib.b.e()).doubleValue());
                            z = ctfiVar2.d(i3.a());
                        }
                    }
                } finally {
                    b.c();
                }
            }
            f.close();
            return z;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

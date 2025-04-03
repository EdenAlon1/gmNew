package defpackage;

import android.content.Context;
import com.google.android.rcs.client.messaging.data.ContentType;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbjn extends cbiq {
    private static final enru j = enru.c("com/google/android/apps/messaging/shared/datamodel/resizing/v2/VideoResizingJob");
    public final ffbr i;
    private final Context k;
    private final albq l;
    private final ctfi m;
    private final ffbr n;
    private final errl o;

    public cbjn(Context context, albq albqVar, ctfi ctfiVar, ffbr ffbrVar, errl errlVar, errl errlVar2, ffbr ffbrVar2, cbiy cbiyVar, ContentType contentType) {
        super(context, cbiyVar, contentType, errlVar);
        this.k = context;
        this.l = albqVar;
        this.m = ctfiVar;
        this.n = ffbrVar;
        this.o = errlVar2;
        this.i = ffbrVar2;
    }

    @Override // defpackage.cbiq
    protected final elfl a() {
        elfl e;
        elfl elflVar;
        ekzz f = eleg.f("VideoResizingJob#runInBackground");
        try {
            if (this.c == null) {
                ensk j2 = j.j();
                j2.Y(ente.a, "BugleResizing");
                ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/VideoResizingJob", "runInBackgroundInTrace", 89, "VideoResizingJob.java")).q("Cannot resize video with null contentUri");
                elflVar = elfo.e(false);
            } else {
                akzw b = this.l.b("Bugle.Media.Attachment.Resize.Video.Duration");
                try {
                    File i = cbgi.i(this.b, this.k);
                    ContentType contentType = this.e;
                    String contentType2 = contentType != null ? contentType.toString() : null;
                    String str = "video/avc";
                    if (this.d >= ((Long) cbib.n.e()).longValue()) {
                        ctfv ctfvVar = (ctfv) this.n.b();
                        cteq i2 = cter.i();
                        i2.g(this.c);
                        i2.e(i);
                        ((cteh) i2).a = contentType2;
                        String str2 = this.f;
                        if (str2 != null) {
                            str = str2;
                        }
                        ((cteh) i2).b = str;
                        i2.f((long) (this.d * ((Double) cbib.c.e()).doubleValue()));
                        i2.c(((Boolean) cbib.a.e()).booleanValue());
                        i2.d(((Double) cbib.c.e()).doubleValue());
                        e = ctfvVar.a(i2.a()).h(new emwl() { // from class: cbjm
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                Long l = (Long) obj;
                                cbjn cbjnVar = cbjn.this;
                                if (((aufm) cbjnVar.i.b()).a()) {
                                    return Boolean.valueOf(l.longValue() <= cbjnVar.d && l.longValue() > 0);
                                }
                                return Boolean.valueOf(l.longValue() > 0);
                            }
                        }, this.o);
                    } else {
                        ctfi ctfiVar = this.m;
                        cteq i3 = cter.i();
                        i3.g(this.c);
                        i3.e(i);
                        ((cteh) i3).a = contentType2;
                        ((cteh) i3).b = "video/avc";
                        i3.f(this.d);
                        i3.c(((Boolean) cbib.a.e()).booleanValue());
                        i3.d(((Double) cbib.b.e()).doubleValue());
                        if (ctfiVar.d(i3.a())) {
                            e = elfo.e(true);
                        } else {
                            long j3 = this.m.k;
                            if (j3 > 0) {
                                i.delete();
                                ctfi ctfiVar2 = this.m;
                                cteq i4 = cter.i();
                                i4.g(this.c);
                                i4.e(i);
                                ((cteh) i4).a = contentType2;
                                ((cteh) i4).b = "video/avc";
                                i4.f(this.d);
                                i4.b((this.d / j3) * 0.7200000286102295d);
                                i4.c(((Boolean) cbib.a.e()).booleanValue());
                                i4.d(((Double) cbib.b.e()).doubleValue());
                                e = elfo.e(Boolean.valueOf(ctfiVar2.d(i4.a())));
                            } else {
                                e = elfo.e(false);
                            }
                        }
                    }
                    elflVar = e;
                } finally {
                    b.c();
                }
            }
            f.close();
            return elflVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cbiq
    public final eplp b() {
        return this.m.m.a();
    }
}

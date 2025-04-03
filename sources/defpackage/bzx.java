package defpackage;

import android.view.Surface;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzx implements bxx {
    public Surface b;
    public bxy d;
    public Executor e;
    final /* synthetic */ bzy f;
    public final Object a = new Object();
    public final Set c = new HashSet();

    public bzx(bzy bzyVar) {
        this.f = bzyVar;
    }

    public final void a(Executor executor, final bxy bxyVar, final Surface surface) {
        try {
            executor.execute(new Runnable() { // from class: bzw
                @Override // java.lang.Runnable
                public final void run() {
                    Executor executor2;
                    bud budVar = (bud) bxy.this;
                    final buj bujVar = budVar.a;
                    int i = bujVar.l;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    kfb kfbVar = budVar.b;
                    final Surface surface2 = surface;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            axt axtVar = budVar.c;
                            if (axtVar.d()) {
                                avw.a("VideoEncoderSession", "Not provide surface, " + Objects.toString(axtVar, "EMPTY") + " is already serviced.");
                                kfbVar.b(null);
                                bujVar.a();
                                return;
                            }
                            bujVar.d = surface2;
                            java.util.Objects.toString(surface2);
                            avw.a("VideoEncoderSession", "provide surface: ".concat(surface2.toString()));
                            axtVar.b(surface2, bujVar.b, new ksp() { // from class: buf
                                @Override // defpackage.ksp
                                public final void accept(Object obj) {
                                    axq axqVar = (axq) obj;
                                    avw.a("VideoEncoderSession", "Surface can be closed: " + axqVar.b().hashCode());
                                    Surface b = axqVar.b();
                                    buj bujVar2 = buj.this;
                                    if (b != bujVar2.d) {
                                        b.release();
                                        return;
                                    }
                                    bujVar2.d = null;
                                    bujVar2.k.b(bujVar2.c);
                                    bujVar2.a();
                                }
                            });
                            bujVar.l = 4;
                            kfbVar.b(bujVar.c);
                            return;
                        }
                        if (i2 != 2) {
                            if (i2 == 3) {
                                if (bujVar.g != null && (executor2 = bujVar.f) != null) {
                                    executor2.execute(new Runnable() { // from class: bug
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ((bsb) buj.this.g).a.o(surface2);
                                        }
                                    });
                                }
                                java.util.Objects.toString(surface2);
                                avw.f("VideoEncoderSession", "Surface is updated in READY state: ".concat(surface2.toString()));
                                return;
                            }
                            if (i2 != 4) {
                                throw new IllegalStateException("State " + ((Object) bui.a(bujVar.l)) + " is not handled");
                            }
                        }
                    }
                    int i3 = bujVar.l;
                    java.util.Objects.toString(bui.a(i3));
                    avw.a("VideoEncoderSession", "Not provide surface in ".concat(bui.a(i3)));
                    kfbVar.b(null);
                }
            });
        } catch (RejectedExecutionException e) {
            avw.d(this.f.a, "Unable to post to the supplied executor.", e);
        }
    }
}

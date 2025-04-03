package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abya {
    static final cfva a = cfvl.e(cfvl.b, "donation_max_tachyon_message_size_bytes", 262144);
    static final cfva b = cfvl.c(cfvl.b, "donation_tachyon_message_size_buffer_percentage", 0.1d);
    public static final /* synthetic */ int h = 0;
    public final ffbr c;
    public final Optional d;
    public final errl e;
    public final Context f;
    public final ctvb g;
    private final errl i;

    public abya(ffbr ffbrVar, Optional optional, errl errlVar, errl errlVar2, Context context, ctvb ctvbVar) {
        this.c = ffbrVar;
        this.d = optional;
        this.e = errlVar;
        this.i = errlVar2;
        this.f = context;
        this.g = ctvbVar;
    }

    public final elfl a(final abxz abxzVar) {
        ekzz f = eleg.f("Donator#donate");
        try {
            elfl i = elfo.g(new Callable() { // from class: abxv
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return abxz.this.a();
                }
            }, this.i).i(new eroh() { // from class: abxw
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final engw engwVar = (engw) obj;
                    engwVar.getClass();
                    final abya abyaVar = abya.this;
                    emxf.l(abyaVar.d.isPresent());
                    return ((cilk) abyaVar.d.get()).d().i(new eroh() { // from class: abxs
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            final abya abyaVar2 = abya.this;
                            ersb ersbVar = new ersb(abyaVar2.e);
                            engr engrVar = new engr();
                            for (final ezfu ezfuVar : engwVar) {
                                engrVar.h(elfo.h(new erog() { // from class: abxt
                                    @Override // defpackage.erog
                                    public final ListenableFuture a() {
                                        return ((chep) abya.this.c.b()).a(new abxr(ezfuVar));
                                    }
                                }, ersbVar));
                            }
                            return elfo.l(engrVar.g()).a(new Callable() { // from class: abxu
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    int i2 = abya.h;
                                    return null;
                                }
                            }, erpp.a);
                        }
                    }, abyaVar.e);
                }
            }, this.e);
            f.b(i);
            f.close();
            return i;
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

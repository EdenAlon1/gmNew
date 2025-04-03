package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clvs implements clvj {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/rcs/performance/ChannelBasedAwakeSender");
    public final ffbr b;
    public final aqux c;
    private final errl d;

    public clvs(ffbr ffbrVar, errl errlVar, aqux aquxVar) {
        this.b = ffbrVar;
        this.d = errlVar;
        this.c = aquxVar;
    }

    @Override // defpackage.clvj
    public final void a(String str, final int i) {
        ekzz f = eleg.f("ChannelBasedAwakeSender::prewarm");
        try {
            ((enrr) ((enrr) a.h()).h("com/google/android/apps/messaging/shared/rcs/performance/ChannelBasedAwakeSender", "prewarm", 56, "ChannelBasedAwakeSender.java")).t("Attempting to send prewarm by %s", this.c);
            fcej fcejVar = (fcej) fcek.a.createBuilder();
            fgtg fgtgVar = fgtg.PHONE_NUMBER;
            fcejVar.copyOnWrite();
            ((fcek) fcejVar.instance).b = fgtgVar.a();
            fcejVar.copyOnWrite();
            ((fcek) fcejVar.instance).d = "RCS";
            fcejVar.copyOnWrite();
            ((fcek) fcejVar.instance).c = str;
            final fcek fcekVar = (fcek) fcejVar.build();
            elfl e = elfo.h(new erog() { // from class: clvp
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    clvs clvsVar = clvs.this;
                    Optional flatMap = clvsVar.c.m().flatMap(new Function() { // from class: clvm
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((aoku) obj).e();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    final cpsu cpsuVar = (cpsu) clvsVar.b.b();
                    cpsuVar.getClass();
                    cpsz cpszVar = (cpsz) flatMap.map(new Function() { // from class: clvn
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return cpsu.this.a((awui) obj);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElseThrow(new Supplier() { // from class: clvo
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new clvr();
                        }
                    });
                    int i2 = i + (-1) == 1 ? 2 : 1;
                    fcek fcekVar2 = fcekVar;
                    fcekVar2.getClass();
                    return axol.i(cpszVar.b, new cpsy(cpszVar, fcekVar2, i2, null));
                }
            }, this.d).e(Throwable.class, new emwl() { // from class: clvq
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ((enrr) ((enrr) ((enrr) clvs.a.j()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/rcs/performance/ChannelBasedAwakeSender", "prewarm", 76, "ChannelBasedAwakeSender.java")).q("Failed to prewarm remote client");
                    return null;
                }
            }, erpp.a);
            f.b(e);
            axnw.h(e);
            f.close();
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

package defpackage;

import android.content.ContentValues;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cryg {
    public static final cskc a = cskc.g("BugleCms", "CmsDatabaseOperations");
    private final cqoh b;

    public cryg(cqoh cqohVar) {
        this.b = cqohVar;
    }

    public final int a(final int i, final int i2, String str) {
        ekzz f = eleg.f("CmsDatabaseOperations#setCmsKeyCmsId");
        try {
            emxf.l(!efbd.g());
            String[] strArr = bqws.a;
            bqwp bqwpVar = new bqwp();
            bqwpVar.ap("setCmsKeyCmsId");
            bqwpVar.al();
            bqwpVar.e(new Function() { // from class: cryf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bqwr bqwrVar = (bqwr) obj;
                    bqwrVar.e(i2);
                    bqwrVar.c(i);
                    return bqwrVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bqwpVar.d(str);
            int e = bqwpVar.b().e();
            f.close();
            return e;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final bqvj b(final int i, final int i2) {
        bqvj bqvjVar;
        ekzz f = eleg.f("CmsDatabaseOperations#getCmsKeyDataForIndex");
        try {
            bqwn a2 = bqws.a();
            a2.z("getCmsKeyDataForIndex");
            a2.e(new Function() { // from class: cryb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bqwr bqwrVar = (bqwr) obj;
                    bqwrVar.c(i);
                    bqwrVar.e(i2);
                    return bqwrVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bqvz bqvzVar = (bqvz) a2.b().o();
            try {
                if (bqvzVar.moveToFirst()) {
                    bqvjVar = (bqvj) bqvzVar.cO();
                    bqvzVar.close();
                } else {
                    bqvzVar.close();
                    bqvjVar = null;
                }
                f.close();
                return bqvjVar;
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final bqvj c(final int i) {
        bqvj bqvjVar;
        ekzz f = eleg.f("CmsDatabaseOperations#getMaxIndexedCmsKey");
        try {
            bqwn a2 = bqws.a();
            a2.z("getMaxIndexedCmsKey");
            a2.e(new Function() { // from class: crya
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bqwr bqwrVar = (bqwr) obj;
                    bqwrVar.e(i);
                    return bqwrVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            a2.c(new bqwk(bqws.c.a));
            a2.x(1);
            bqvz bqvzVar = (bqvz) a2.b().o();
            try {
                if (bqvzVar.moveToFirst()) {
                    bqvjVar = (bqvj) bqvzVar.cO();
                    bqvzVar.close();
                } else {
                    bqvzVar.close();
                    bqvjVar = null;
                }
                f.close();
                return bqvjVar;
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final List d(final int i) {
        ekzz f = eleg.f("CmsDatabaseOperations#listAllCmsKeysOfType");
        try {
            bqwn a2 = bqws.a();
            a2.z("listAllCmsKeysOfType");
            a2.e(new Function() { // from class: cryd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bqwr bqwrVar = (bqwr) obj;
                    bqwrVar.e(i);
                    return bqwrVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            engw y = a2.b().y();
            f.close();
            return y;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e(byte[] bArr, int i) {
        ekzz f = eleg.f("CmsDatabaseOperations#insertCmsKey");
        try {
            String[] strArr = bqws.a;
            bqvm bqvmVar = new bqvm();
            bqvmVar.e(1);
            bqvmVar.d(bArr);
            bqvmVar.f(i);
            bqvmVar.a().m().longValue();
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

    public final void f(String str, String str2, axue axueVar, String str3) {
        efbd.b();
        String[] strArr = bqvb.a;
        bqtq bqtqVar = new bqtq();
        bqtqVar.g(1L);
        bqtqVar.e(str);
        bqtqVar.c(str2);
        bqtqVar.d(axueVar);
        bqtqVar.h(this.b.f().toEpochMilli());
        bqtqVar.f(str3);
        bqtqVar.b(0L);
        final bqtn a2 = bqtqVar.a();
        final dtve a3 = bqvb.a();
        Long.valueOf(dtub.b(bqvb.a(), "cms_status", a2, new Function() { // from class: bqtl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.R("cms_status", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bqtm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    bqtn bqtnVar = bqtn.this;
                    bqtnVar.a = new bqtk(l).a.longValue();
                    bqtnVar.fY(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        })).getClass();
    }
}

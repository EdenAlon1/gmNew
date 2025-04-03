package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvww extends dvwr {
    public final Context a;
    public final errl b;
    public final ffbr c;
    public volatile ectu d;
    dfld e;
    dfld f;

    public dvww(Context context, ffbr ffbrVar, errl errlVar) {
        this.a = context;
        this.c = ffbrVar;
        this.b = errlVar;
    }

    @Override // defpackage.dvwr
    public final ListenableFuture a(final dvwq dvwqVar, ListenableFuture listenableFuture) {
        return ernq.g(erny.g(listenableFuture, new eroh() { // from class: dvwt
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ListenableFuture a;
                final dvvz dvvzVar = (dvvz) obj;
                int i = dvvzVar.b;
                final dvww dvwwVar = dvww.this;
                if (i == 1) {
                    a = erqt.i(true);
                } else {
                    ectu ectuVar = dvwwVar.d;
                    if (ectuVar == null) {
                        synchronized (dvwwVar) {
                            ectuVar = dvwwVar.d;
                            if (ectuVar == null) {
                                ectuVar = new ectu();
                                dvwwVar.d = ectuVar;
                            }
                        }
                    }
                    a = ectuVar.a(dvwwVar.a, ((Boolean) dvwwVar.c.b()).booleanValue(), true);
                }
                final dvwq dvwqVar2 = dvwqVar;
                return erny.g(a, new eroh() { // from class: dvws
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        if (!((Boolean) obj2).booleanValue()) {
                            return erre.a;
                        }
                        dvvz dvvzVar2 = dvvzVar;
                        dfld b = dvww.this.b(dvvzVar2);
                        if (b == null) {
                            return erre.a;
                        }
                        dvwo dvwoVar = (dvwo) dvwqVar2;
                        dflc j = b.j(dvwoVar.b, (dfmh) emxc.i(null).e(new dfmh() { // from class: dvwv
                            @Override // defpackage.dfmh
                            public final void a(eyee eyeeVar) {
                            }
                        }));
                        j.k = dvwoVar.a;
                        epme epmeVar = dvwoVar.c;
                        if (epmeVar != null) {
                            j.d = epmeVar;
                        }
                        Integer num = dvwoVar.d;
                        if (num != null) {
                            j.i(num.intValue());
                        }
                        faxs faxsVar = dvwoVar.e;
                        if (faxsVar != faxs.DEFAULT) {
                            j.l = faxsVar;
                        }
                        if (!((dfld) j.a).e()) {
                            j.f(dvwoVar.f);
                        }
                        int[] iArr = dvwoVar.g;
                        if (iArr != null) {
                            for (int i2 : iArr) {
                                if (j.e == null) {
                                    j.e = new ArrayList();
                                }
                                j.e.add(Integer.valueOf(i2));
                            }
                        }
                        dfli dfliVar = dvwoVar.h;
                        if (dfliVar != null) {
                            if (dfliVar.b() == faxv.EVENT_OVERRIDE || dfliVar.b() == faxv.EVENT_DEFERRING) {
                                j.o = dfliVar;
                            } else {
                                Log.e("AbstractLogEventBuilder", "The given event-level ProductIdOrigin value " + dfliVar.b().toString() + " is not one of the values expected for a value set at the event-level: " + String.valueOf(faxv.EVENT_OVERRIDE) + " or " + String.valueOf(faxv.EVENT_DEFERRING));
                            }
                        }
                        int i3 = dvvzVar2.b - 1;
                        if (i3 == 0) {
                            j.h(dvvzVar2.a);
                        } else if (i3 == 1) {
                            j.h(null);
                        } else if (i3 != 2) {
                            throw new IllegalArgumentException("Dropped logs must not be logged.");
                        }
                        if (Log.isLoggable("Logging.Clearcut", 3)) {
                            Log.d("Logging.Clearcut", j.toString());
                        }
                        return duin.a(j.c());
                    }
                }, dvwwVar.b);
            }
        }, this.b), dfqu.class, new eroh() { // from class: dvwu
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dfqu dfquVar = (dfqu) obj;
                int a = dfquVar.a();
                if (a != 17 && a != 31003) {
                    throw dfquVar;
                }
                if (Log.isLoggable("Logging.Clearcut", 3)) {
                    Log.d("Logging.Clearcut", "Could not log data.", dfquVar);
                }
                return erre.a;
            }
        }, erpp.a);
    }

    public final synchronized dfld b(dvvz dvvzVar) {
        int i = dvvzVar.b - 1;
        if (i == 0 || i == 1) {
            if (this.e == null) {
                Context context = this.a;
                List list = dfld.m;
                this.e = new dfla(context, "NOOP_LOG_SOURCE_NAME").c();
            }
            return this.e;
        }
        if (i != 2) {
            return null;
        }
        if (this.f == null) {
            this.f = dfld.k(this.a, "NOOP_LOG_SOURCE_NAME");
        }
        return this.f;
    }
}

package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cepf extends ceut {
    public final Context a;
    public final Optional b;
    public final asmj c;
    public final ffbr d;
    private final errl e;

    public cepf(errl errlVar, Context context, Optional optional, asmj asmjVar, ffbr ffbrVar) {
        this.e = errlVar;
        this.a = context;
        this.b = optional;
        this.c = asmjVar;
        this.d = ffbrVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("CleanupPartUriHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cepi.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final cepi cepiVar = (cepi) eyhsVar;
        return elfo.g(new Callable() { // from class: cepc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cepi cepiVar2 = cepiVar;
                cepf cepfVar = cepf.this;
                ContentResolver contentResolver = cepfVar.a.getContentResolver();
                for (String str : cepiVar2.b) {
                    try {
                        final Uri parse = Uri.parse(str);
                        final int delete = contentResolver.delete(parse, null, null);
                        if (cepfVar.c.a()) {
                            ((azei) cepfVar.d.b()).d(new Consumer() { // from class: cepd
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    ((cpdd) obj).a(parse, null, null, delete);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        } else {
                            cepfVar.b.ifPresent(new Consumer() { // from class: cepe
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    ((cpdd) obj).a(parse, null, null, delete);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        }
                    } catch (IllegalArgumentException e) {
                        cepf.D.o("Unable to remove message part data content with uri: ".concat(String.valueOf(str)), e);
                    } catch (SecurityException e2) {
                        cepf.D.o("Unable to remove message part data content.", e2);
                    }
                }
                return ceyt.i();
            }
        }, this.e);
    }
}

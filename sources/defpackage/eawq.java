package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import j$.util.DesugarCollections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eawq implements eawd {
    public static final Map a = DesugarCollections.synchronizedMap(new cmh());
    public static final Map b = DesugarCollections.synchronizedMap(new cmh());
    private static final AtomicBoolean c = new AtomicBoolean(false);
    private static final ComponentCallbacks2 d = new eawg();
    private final Executor e;
    private final ebtb f;
    private final eave g;

    public eawq(Context context, ExecutorService executorService, eave eaveVar, ebtd ebtdVar) {
        ebtd ebtdVar2;
        ebsx ebsxVar;
        ebtf ebtfVar = new ebtf(context);
        ebsu ebsuVar = new ebsu();
        ebsuVar.b(new ebta[0]);
        if (ebtdVar == null) {
            throw new NullPointerException("Null imageRetriever");
        }
        ebsuVar.a = ebtdVar;
        ebsuVar.d = new ebsx();
        ebsuVar.b = new eawf(ebtfVar, eaveVar);
        ebsuVar.b(ebta.a);
        ebtd ebtdVar3 = ebsuVar.a;
        if (ebtdVar3 != null && (ebtdVar2 = ebsuVar.b) != null && (ebsxVar = ebsuVar.d) != null) {
            ebsv ebsvVar = new ebsv(ebtdVar3, ebtdVar2, ebsxVar, ebsuVar.c);
            this.e = executorService;
            this.f = ebsvVar;
            this.g = eaveVar;
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (ebsuVar.a == null) {
            sb.append(" imageRetriever");
        }
        if (ebsuVar.b == null) {
            sb.append(" secondaryImageRetriever");
        }
        if (ebsuVar.d == null) {
            sb.append(" defaultImageRetriever");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static void b(ImageView imageView, eawp eawpVar) {
        efbd.c();
        eawp eawpVar2 = (eawp) imageView.getTag(R.id.tag_account_image_request);
        if (eawpVar2 != null) {
            eawpVar2.e = true;
        }
        imageView.setTag(R.id.tag_account_image_request, eawpVar);
    }

    @Override // defpackage.eawd
    public final void a(Object obj, ImageView imageView) {
        efbd.c();
        Context context = imageView.getContext();
        if (!c.getAndSet(true)) {
            context.getApplicationContext().registerComponentCallbacks(d);
        }
        final eawp eawpVar = new eawp(obj, this.f, imageView, this.e, this.g);
        b(imageView, eawpVar);
        this.e.execute(new Runnable() { // from class: eawe
            @Override // java.lang.Runnable
            public final void run() {
                String sb;
                Map map = eawq.a;
                final eawp eawpVar2 = eawp.this;
                final ImageView imageView2 = (ImageView) eawpVar2.a.get();
                if (eawpVar2.e || imageView2 == null) {
                    return;
                }
                if (eawpVar2.b == null) {
                    try {
                        eawpVar2.b(imageView2.getContext());
                        return;
                    } catch (IllegalStateException unused) {
                        ebpa.a(new Runnable() { // from class: eawm
                            @Override // java.lang.Runnable
                            public final void run() {
                                eawp.this.b(imageView2.getContext());
                            }
                        });
                        return;
                    }
                }
                Integer num = (Integer) ebsy.a(imageView2).e(0);
                final int intValue = num.intValue();
                eave eaveVar = eawpVar2.d;
                Object obj2 = eawpVar2.b;
                if (obj2 == null) {
                    sb = "null";
                } else {
                    StringBuilder sb2 = new StringBuilder(eaveVar.b(obj2));
                    String d2 = eaveVar.d(obj2);
                    if (d2 != null) {
                        sb2.append(" ");
                        sb2.append(d2);
                    }
                    sb = sb2.toString();
                }
                final String format = String.format(Locale.ROOT, "%s %s", sb, num);
                Drawable drawable = (Drawable) eawq.a.get(format);
                if (drawable != null) {
                    eawpVar2.e(drawable, true);
                    return;
                }
                ebtb ebtbVar = eawpVar2.c;
                final Drawable drawable2 = (Drawable) eawq.b.get(format);
                if (drawable2 != null) {
                    eawpVar2.e(drawable2, false);
                }
                ebsv ebsvVar = (ebsv) ebtbVar;
                final ebtd ebtdVar = ebsvVar.b;
                ebtd ebtdVar2 = ebsvVar.a;
                Object obj3 = eawpVar2.b;
                ebtc ebtcVar = new ebtc() { // from class: eawn
                    @Override // defpackage.ebtc
                    public final void a(final Bitmap bitmap) {
                        final eawp eawpVar3 = eawp.this;
                        if (eawpVar3.e) {
                            return;
                        }
                        final String str = format;
                        if (bitmap != null) {
                            eawpVar3.d(new Runnable() { // from class: eawi
                                @Override // java.lang.Runnable
                                public final void run() {
                                    eawp eawpVar4 = eawp.this;
                                    BitmapDrawable bitmapDrawable = new BitmapDrawable(eawpVar4.a(bitmap));
                                    Map map2 = eawq.a;
                                    String str2 = str;
                                    map2.put(str2, bitmapDrawable);
                                    eawq.b.remove(str2);
                                    eawpVar4.e(bitmapDrawable, true);
                                }
                            });
                            return;
                        }
                        Drawable drawable3 = drawable2;
                        if (drawable3 != null) {
                            eawpVar3.e(drawable3, true);
                        } else {
                            if (!ebtf.b(ebtg.g(eawpVar3.b, eawpVar3.d))) {
                                ebpa.a(new Runnable() { // from class: eawk
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        eawp.this.c();
                                    }
                                });
                                return;
                            }
                            final int i = intValue;
                            final ebtd ebtdVar3 = ebtdVar;
                            eawpVar3.d(new Runnable() { // from class: eawj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final eawp eawpVar4 = eawp.this;
                                    final String str2 = str;
                                    ebtc ebtcVar2 = new ebtc() { // from class: eawl
                                        @Override // defpackage.ebtc
                                        public final void a(Bitmap bitmap2) {
                                            eawp eawpVar5 = eawp.this;
                                            BitmapDrawable bitmapDrawable = new BitmapDrawable(eawpVar5.a(bitmap2));
                                            eawq.b.put(str2, bitmapDrawable);
                                            eawpVar5.e(bitmapDrawable, true);
                                        }
                                    };
                                    eawf eawfVar = (eawf) ebtdVar3;
                                    Object obj4 = eawpVar4.b;
                                    eave eaveVar2 = eawfVar.b;
                                    Map map2 = eawq.a;
                                    ebtcVar2.a(eawfVar.a.a(ebtg.g(obj4, eaveVar2), i));
                                }
                            });
                        }
                    }
                };
                eixn eixnVar = (eixn) obj3;
                String str = eixnVar.b().h;
                String str2 = eixnVar.b().d;
                adlw adlwVar = (adlw) ebtdVar2;
                eblh eblhVar = new eblh(adlwVar.a, adlwVar.b);
                String str3 = eixnVar.b().g;
                if (str3 == null) {
                    throw new NullPointerException("Null accountName");
                }
                eble ebleVar = new eble(str2, str3, str);
                erqt.r(eblhVar.b.g(ebleVar.a(), ebwf.b(eblhVar.a, intValue)), new eblg(ebtcVar), erpp.a);
            }
        });
    }
}

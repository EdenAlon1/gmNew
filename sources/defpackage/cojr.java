package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.Window;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cojr {
    public static final ejui a = new ejtz("SCREEN_DETECTION_LISTENER_DATA_SOURCE_KEY");
    public final ffbr b;
    public final ffbr c;
    public final ffsk d;
    public final AtomicReference e;
    public final AtomicReference f;
    public final AtomicReference g;
    private final ffbr h;

    public cojr(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffsk ffskVar) {
        ffbrVar3.getClass();
        ffskVar.getClass();
        this.b = ffbrVar;
        this.h = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffskVar;
        this.e = new AtomicReference(null);
        this.f = new AtomicReference();
        this.g = new AtomicReference();
    }

    public final void a() {
        ekzz f = eleg.f("handleDisplayChange");
        try {
            coje cojeVar = (coje) this.e.get();
            coje b = ((cojl) this.b.b()).b(cojeVar);
            this.e.set(b);
            if (cojeVar == null || cojeVar.a != b.a) {
                ((ejvp) this.h.b()).a(elfo.e(b), a);
            } else {
                ((ejvp) this.h.b()).a(elfo.e(b), a);
            }
            ffig.a(f, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(f, th);
                throw th2;
            }
        }
    }

    public final void b(ejxn ejxnVar, final Context context) {
        ejxnVar.getClass();
        ekzz f = eleg.f("ScreenDetectionListener.registerDataSource");
        try {
            ejxnVar.g(R.id.screen_detection_listener_subscription_id, new cojq(this), new ejxk() { // from class: cojo
                @Override // defpackage.ejxk
                public final /* synthetic */ void a(Throwable th) {
                    ejxj.a(th);
                }

                @Override // defpackage.ejxk
                public final void b(Object obj) {
                    Context context2 = context;
                    Optional optional = (Optional) obj;
                    ekzz f2 = eleg.f("ScreenDetectionListener.callback");
                    try {
                        if (!((Boolean) ((cfup) cojg.a.get()).e()).booleanValue()) {
                            ffig.a(f2, null);
                            return;
                        }
                        coje cojeVar = (coje) fflm.b(optional);
                        cojr cojrVar = this;
                        if (cojeVar == null || !cojeVar.a) {
                            iv ivVar = (iv) cojrVar.f.getAndSet(null);
                            if (ivVar != null) {
                                ivVar.dismiss();
                            }
                        } else {
                            Drawable drawable = context2.getDrawable(R.drawable.gs_report_fill1_vd_theme_24);
                            if (drawable != null) {
                                drawable.setTint(ehdr.d(context2, R.attr.colorErrorVariant, "ScreenDetectionListener"));
                            }
                            coji c = ((cojl) cojrVar.b.b()).c(cojeVar);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c.a);
                            if (c.b != null && c.c != null) {
                                StyleSpan styleSpan = new StyleSpan(1);
                                Integer num = c.b;
                                num.getClass();
                                int intValue = num.intValue();
                                Integer num2 = c.c;
                                num2.getClass();
                                spannableStringBuilder.setSpan(styleSpan, intValue, num2.intValue(), 17);
                            }
                            ehft ehftVar = new ehft(context2);
                            ehftVar.k(drawable);
                            ehftVar.x(R.string.screen_detection_dialog_title);
                            ehftVar.n(spannableStringBuilder);
                            ehftVar.j(false);
                            f2 = eleg.f("ScreenDetectionListener.callback.showDialog");
                            try {
                                iv a2 = ehftVar.a();
                                ffig.a(f2, null);
                                ecqk.a.b(a2.getOwnerActivity());
                                Window window = a2.getWindow();
                                if (window != null) {
                                    window.addFlags(2);
                                }
                                Window window2 = a2.getWindow();
                                if (window2 != null) {
                                    window2.setDimAmount(1.0f);
                                }
                                cojrVar.f.set(a2);
                            } finally {
                            }
                        }
                        ffig.a(f2, null);
                    } finally {
                    }
                }
            });
            ffig.a(f, null);
        } finally {
        }
    }

    public final void c() {
        ekzz f = eleg.f("ScreenDetectionListener.unregister");
        try {
            if (!((Boolean) ((cfup) cojg.a.get()).e()).booleanValue()) {
                ffig.a(f, null);
                return;
            }
            DisplayManager.DisplayListener displayListener = (DisplayManager.DisplayListener) this.g.getAndSet(null);
            if (displayListener != null) {
                ((cojl) this.b.b()).d(displayListener);
            }
            ffig.a(f, null);
        } finally {
        }
    }
}

package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.format.DateUtils;
import android.util.Size;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabx implements zsq {
    public final aaee a;
    public final aapg b;
    public final aawu c;
    private final Context d;
    private final asnh e;
    private final athc f;

    public aabx(Context context, aaee aaeeVar, aapg aapgVar, aawu aawuVar, asnh asnhVar, athc athcVar) {
        context.getClass();
        aaeeVar.getClass();
        aapgVar.getClass();
        aawuVar.getClass();
        this.d = context;
        this.a = aaeeVar;
        this.b = aapgVar;
        this.c = aawuVar;
        this.e = asnhVar;
        this.f = athcVar;
    }

    @Override // defpackage.zsq
    public final /* bridge */ /* synthetic */ dnoq a(zsu zsuVar) {
        Object dmzxVar;
        aabu aabuVar = (aabu) zsuVar;
        ekzz f = eleg.f("GalleryBubbleUiAdapter#createUiData");
        try {
            List list = aabuVar.a.a;
            ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dmzr dmzrVar = new dmzr(ffdx.af(arrayList), new dmzq(this.e.a(), this.f.a()), aabuVar.b, new ffix() { // from class: dmzn
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            return ffcu.a;
                        }
                    });
                    ffig.a(f, null);
                    return dmzrVar;
                }
                final alxr alxrVar = (alxr) it.next();
                final List list2 = aabuVar.a.a;
                String str = aabuVar.c;
                appj g = alxrVar.g();
                if (!(g instanceof appq)) {
                    throw new IllegalStateException("Content is not photo or video, content-type: ".concat(String.valueOf(g.b())));
                }
                String b = g.b();
                final appq appqVar = (appq) g;
                Size f2 = appqVar.f();
                List g2 = ffdx.g(f2.getWidth() == 0 ? null : Integer.valueOf(f2.getWidth()), f2.getHeight() == 0 ? null : Integer.valueOf(f2.getHeight()));
                Integer num = (Integer) g2.get(0);
                Integer num2 = (Integer) g2.get(1);
                if (le.n(b)) {
                    dmzxVar = new dmzs(appqVar.e(), String.valueOf(this.d.getString(R.string.photo_item_content_description)).concat(str), num, num2, new ffix() { // from class: aabv
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            List list3 = list2;
                            aabx aabxVar = aabx.this;
                            if (aabxVar.c.e()) {
                                aabxVar.c.c(list3);
                            } else {
                                appq appqVar2 = appqVar;
                                alxr alxrVar2 = alxrVar;
                                aaee aaeeVar = aabxVar.a;
                                aaeeVar.u.a(alxrVar2, ffdx.af(list3), appqVar2.e(), appqVar2.b());
                            }
                            return ffcu.a;
                        }
                    });
                } else {
                    if (!le.A(b)) {
                        throw new IllegalStateException("Unknown PhotoVideoContent, content-type: ".concat(String.valueOf(b)));
                    }
                    dmzxVar = new dmzx(appqVar.e(), String.valueOf(this.d.getString(R.string.video_item_content_description)).concat(str), num, num2, new ffix() { // from class: aabw
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            List list3 = list2;
                            aabx aabxVar = aabx.this;
                            if (aabxVar.c.e()) {
                                aabxVar.c.c(list3);
                            } else {
                                appq appqVar2 = appqVar;
                                alxr alxrVar2 = alxrVar;
                                aapg aapgVar = aabxVar.b;
                                List af = ffdx.af(list3);
                                Uri e = appqVar2.e();
                                String b2 = appqVar2.b();
                                long j = ffpw.a;
                                aapgVar.p.a(alxrVar2, af, e, b2, new ffpw(0L), true);
                            }
                            return ffcu.a;
                        }
                    }, appqVar.j().isPresent() ? DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(((Number) appqVar.j().get()).longValue())) : null, new dmzw(this.e.a()));
                }
                arrayList.add(dmzxVar);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(f, th);
                throw th2;
            }
        }
    }
}

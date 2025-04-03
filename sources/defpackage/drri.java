package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.compose.ui.views.RoundedImageView;
import defpackage.drlj;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class drri<T extends drlj<?, ?>> extends wr {
    public static final enru s = enru.c("com/google/android/libraries/compose/media/ui/holder/MediaViewHolder");
    private final dqkk A;
    private final String B;
    private final String C;
    private ffud D;
    public final Activity t;
    public final drro u;
    public final RoundedImageView v;
    public final String w;
    public drrj x;
    public final Context y;
    private final ffsk z;

    public drri(Activity activity, ffsk ffskVar, drro drroVar, dqkk dqkkVar, View view, RoundedImageView roundedImageView, String str, String str2, String str3, drrj drrjVar) {
        super(view);
        this.t = activity;
        this.z = ffskVar;
        this.u = drroVar;
        this.A = dqkkVar;
        this.v = roundedImageView;
        this.w = str;
        this.B = str2;
        this.C = str3;
        this.x = drrjVar;
        this.y = activity.getBaseContext();
    }

    public static /* synthetic */ void G(final drri drriVar, final drlj drljVar, final ffji ffjiVar, final drre drreVar, Integer num, String str, int i) {
        if ((i & 2) != 0) {
            ffjiVar = new ffji() { // from class: drrc
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((drlj) obj).getClass();
                    return ffcu.a;
                }
            };
        }
        if ((i & 4) != 0) {
            drreVar = new drre() { // from class: drrd
                @Override // defpackage.drre
                public final boolean a(Object obj, PointF pointF) {
                    return false;
                }
            };
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        drljVar.getClass();
        ffjiVar.getClass();
        drreVar.getClass();
        ((enrr) s.f().h("com/google/android/libraries/compose/media/ui/holder/MediaViewHolder", "bind", 98, "MediaViewHolder.kt")).J("Rendering %s with configuration %s", drriVar.w, drljVar, drriVar.x);
        drje drjeVar = drriVar.x.a;
        if (drjeVar != null) {
            drriVar.v.c(drjeVar);
        }
        ImageView.ScaleType scaleType = drriVar.x.b;
        if (scaleType != null) {
            drriVar.v.setScaleType(scaleType);
        }
        qqs c = qpt.c(drriVar.y);
        c.getClass();
        final drlh D = drriVar.D(drljVar);
        qqo a = c.c().k(D.o() != null ? new qzz(D.f(), new rab() { // from class: drqy
            @Override // defpackage.rab
            public final Map a() {
                return drlh.this.o();
            }
        }) : D.f()).a(new drrf(drriVar, drljVar, drljVar));
        a.getClass();
        drriVar.C(drljVar, a).v(drriVar.v);
        drriVar.a.setOnClickListener(drriVar.A.b(drriVar.B, new View.OnClickListener() { // from class: drqz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                enrr enrrVar = (enrr) drri.s.h().h("com/google/android/libraries/compose/media/ui/holder/MediaViewHolder", "bind$lambda$12", 145, "MediaViewHolder.kt");
                String str2 = drri.this.w;
                drlj drljVar2 = drljVar;
                enrrVar.D("%s clicked with media=%s", str2, drljVar2);
                ffjiVar.invoke(drljVar2);
            }
        }));
        if (drriVar.x.c) {
            final GestureDetector gestureDetector = new GestureDetector(drriVar.y, new drrh(drriVar, drljVar, drreVar));
            drriVar.a.setOnTouchListener(new View.OnTouchListener() { // from class: drra
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    gestureDetector.onTouchEvent(motionEvent);
                    return false;
                }
            });
        } else {
            drriVar.a.setOnLongClickListener(drriVar.A.c(drriVar.C, new View.OnLongClickListener() { // from class: drrb
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    enrr enrrVar = (enrr) drri.s.h().h("com/google/android/libraries/compose/media/ui/holder/MediaViewHolder", "bind$lambda$14", 175, "MediaViewHolder.kt");
                    String str2 = drri.this.w;
                    drlj drljVar2 = drljVar;
                    enrrVar.D("%s long clicked with media=%s", str2, drljVar2);
                    return drreVar.a(drljVar2, null);
                }
            }));
        }
        drro drroVar = drriVar.u;
        ViewGroup viewGroup = (ViewGroup) drriVar.a;
        RoundedImageView roundedImageView = drriVar.v;
        boolean z = drroVar.a;
        drroVar.a = true;
        if (num != null || drroVar.b.b()) {
            Object a2 = ((dqkz) drroVar.b.a()).a(viewGroup, roundedImageView);
            if (!z) {
                viewGroup.animate().cancel();
                TextView textView = (TextView) a2;
                textView.animate().cancel();
                if (num == null) {
                    ((View) a2).setVisibility(8);
                    drro.c(viewGroup, textView, 1.0f, 0.0f);
                } else {
                    drro.b(textView, num.intValue());
                    drro.c(viewGroup, textView, 0.88f, 1.0f);
                    ((View) a2).setVisibility(0);
                }
            } else if (num == null) {
                final TextView textView2 = (TextView) a2;
                drro.a(viewGroup, textView2, 1.0f, 0.0f, new ffix() { // from class: drrn
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        int i2 = drro.c;
                        textView2.setVisibility(8);
                        return ffcu.a;
                    }
                });
            } else {
                TextView textView3 = (TextView) a2;
                drro.b(textView3, num.intValue());
                drro.a(viewGroup, textView3, 0.88f, 1.0f, null);
            }
        }
        if (str != null) {
            drriVar.a.setContentDescription(str);
        }
    }

    public static /* synthetic */ void H(drri drriVar, ffji ffjiVar, ffji ffjiVar2, drre drreVar) {
        ffud ffudVar = drriVar.D;
        if (ffudVar != null) {
            if (true != ffudVar.v()) {
                ffudVar = null;
            }
            if (ffudVar != null) {
                ffudVar.t(null);
            }
        }
        drriVar.D = ffqy.d(drriVar.z, null, null, new drrg(drriVar, ffjiVar, ffjiVar2, drreVar, null), 3);
    }

    protected abstract qqo C(drlj drljVar, qqo qqoVar);

    protected abstract drlh D(drlj drljVar);

    public void E() {
        this.a.setOnClickListener(null);
        this.a.setClickable(false);
        this.v.b();
    }
}

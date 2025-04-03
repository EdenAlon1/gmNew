package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.animation.illustration.IllustrationViewStub;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aehk implements aema {
    public crly a;
    public IllustrationViewStub b;
    private final ffbr c;
    private final crjx d;
    private final auba e;
    private final atzl f;
    private ImageView g;
    private crly h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final Context n;

    public aehk(Context context, ffbr ffbrVar, crjx crjxVar, ffbr ffbrVar2, ffbr ffbrVar3, auba aubaVar, atzl atzlVar, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        this.n = context;
        this.c = ffbrVar;
        this.d = crjxVar;
        this.i = ffbrVar3;
        this.j = ffbrVar4;
        this.e = aubaVar;
        this.f = atzlVar;
        this.k = ffbrVar2;
        this.l = ffbrVar5;
        this.m = ffbrVar6;
    }

    @Override // defpackage.aema
    public final void b(aely aelyVar, boolean z) {
        qqo e;
        qqo qqoVar;
        ViewGroup.LayoutParams layoutParams;
        int intValue;
        if (z) {
            this.h.g(0);
            this.g.setVisibility(8);
            this.a.g(8);
        } else {
            this.h.g(8);
            this.g.setVisibility(0);
            if (this.a.h()) {
                if (aelyVar.U()) {
                    if (this.b == null) {
                        this.a.f(R.layout.cake_badge);
                        IllustrationViewStub illustrationViewStub = (IllustrationViewStub) ((FrameLayout) this.a.b()).findViewById(R.id.birthday_cake);
                        this.b = illustrationViewStub;
                        illustrationViewStub.e();
                    }
                    IllustrationViewStub illustrationViewStub2 = this.b;
                    int intValue2 = ((Integer) ((cfup) stl.f.get()).e()).intValue();
                    View c = illustrationViewStub2.c();
                    c.requestLayout();
                    if (c instanceof cwqp) {
                        cwqp cwqpVar = (cwqp) c;
                        cwqpVar.l(intValue2);
                        cwqpVar.d();
                    }
                    this.a.g(0);
                } else if (((Boolean) this.j.b()).booleanValue() && aelyVar.k().Z()) {
                    ((Optional) ((fbbb) this.k).a).ifPresent(new Consumer() { // from class: aehj
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            aehk aehkVar = aehk.this;
                            ahrf ahrfVar = (ahrf) obj;
                            if (aehkVar.b == null) {
                                aehkVar.a.f(ahrfVar.a().b());
                                aehkVar.b = (IllustrationViewStub) ((FrameLayout) aehkVar.a.b()).findViewById(ahrfVar.a().a());
                            }
                            aehkVar.b.c().requestLayout();
                            aehkVar.a.g(0);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                } else if (aelyVar.k().d() == 3) {
                    if (this.b == null) {
                        this.a.f(R.layout.rcs_badge);
                        this.b = (IllustrationViewStub) ((FrameLayout) this.a.b()).findViewById(R.id.rcs_badge);
                    }
                    this.b.c().requestLayout();
                    this.a.g(0);
                } else {
                    this.a.g(8);
                }
            }
        }
        if (this.e.a() && (layoutParams = this.g.getLayoutParams()) != null) {
            if (aelyVar.q() == null) {
                intValue = 40;
            } else {
                Integer q = aelyVar.q();
                q.getClass();
                intValue = q.intValue();
            }
            layoutParams.width = intValue;
            layoutParams.height = intValue;
        }
        String I = aelyVar.k().I();
        if (I == null) {
            ((ekmz) this.c.b()).g(null).v(this.g);
            return;
        }
        boolean z2 = aelyVar.k().c() <= 1;
        dnwn a = ((crpw) this.i.b()).a(Uri.parse(I), z2);
        if (aelyVar.k().t() == amny.c) {
            e = ((ekmz) this.c.b()).d(this.n.getDrawable(cggq.a(aelyVar.k().c())));
        } else if (aelyVar.k().y() == byyt.CROSS_COUNTRY_FOLDER) {
            ekmz ekmzVar = (ekmz) this.c.b();
            Context context = this.n;
            Uri uri = cuqo.a;
            e = ekmzVar.d(context.getDrawable(R.drawable.cross_country_avatar));
        } else {
            e = ((ekmz) this.c.b()).e(a.a);
        }
        qqo e2 = ((ekmz) this.c.b()).e(a.d);
        String str = a.c;
        if (str != null) {
            e = (qqo) e.W(new rjn(str));
        }
        Boolean bool = a.b;
        if (bool != null && bool.booleanValue()) {
            if (this.f.a()) {
                if (z2) {
                    qqoVar = (qqo) e2.A();
                }
                e = (qqo) e.A();
            } else {
                qqoVar = (qqo) e2.A();
            }
            e2 = qqoVar;
            e = (qqo) e.A();
        }
        e.d(e2).v(this.g);
    }

    @Override // defpackage.aema
    public final void c(View view) {
        this.g = (ImageView) view.findViewById(R.id.conversation_icon);
        this.h = new crly(view, R.id.conversation_checkmark, R.id.conversation_checkmark, R.layout.conversation_checkmark_icon);
        this.a = new crly(view, R.id.avatar_badge_icon, R.id.avatar_badge_icon);
    }

    @Override // defpackage.aema
    public final boolean d(aely aelyVar, aely aelyVar2) {
        String I = aelyVar2.k().I();
        if (I == null || TextUtils.equals(I, aelyVar.k().I())) {
            return stl.a() && aelyVar.U() != aelyVar2.U();
        }
        return true;
    }

    @Override // defpackage.aema
    public final void e(aelx aelxVar, aeki aekiVar) {
        if (this.e.a()) {
            float f = this.n.getResources().getDisplayMetrics().density;
            long j = 40;
            if (aeja.c(aekiVar)) {
                Long l = (Long) this.l.b();
                if (l != null) {
                    j = l.longValue();
                }
            } else {
                Long l2 = (Long) this.m.b();
                if (l2 != null) {
                    j = l2.longValue();
                }
            }
            ((aelu) aelxVar).L = Integer.valueOf((int) (f * j));
        }
        aelu aeluVar = (aelu) aelxVar;
        aeluVar.t = this.d.g();
        aeluVar.M |= 2048;
    }

    @Override // defpackage.aema
    public final /* synthetic */ aely a(aely aelyVar) {
        return aelyVar;
    }
}

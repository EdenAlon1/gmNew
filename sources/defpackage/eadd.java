package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.messaging.lighter.ui.messagecell.MessageCellStatusView;
import com.google.android.libraries.messaging.lighter.ui.messagecell.TimestampHeaderView;
import java.security.InvalidParameterException;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eadd extends dzyn {
    public static final /* synthetic */ int j = 0;
    private static final Handler k = new Handler(Looper.getMainLooper());
    public final Map f;
    public final engw g;
    int h;
    public final Handler i;
    private eace l;
    private final eack m;
    private final dzja n;
    private final dzpt o;
    private final dyil p;
    private final dyiu q;
    private engw r;
    private final eacv s;

    public eadd(eace eaceVar, engw engwVar, eacv eacvVar, eack eackVar, dzja dzjaVar, dzpt dzptVar, dyil dyilVar, dyiu dyiuVar) {
        super(new eacm());
        int i;
        this.f = new EnumMap(eaci.class);
        this.h = -1;
        this.i = new Handler();
        this.l = eaceVar;
        this.s = eacvVar;
        this.m = eackVar;
        this.n = dzjaVar;
        this.o = dzptVar;
        this.p = dyilVar;
        this.q = dyiuVar;
        this.g = engwVar;
        int i2 = ((enou) engwVar).c;
        int i3 = 0;
        while (i3 < i2) {
            eacf eacfVar = (eacf) engwVar.get(i3);
            Iterator it = eacfVar.a().iterator();
            while (true) {
                i = i3 + 1;
                if (it.hasNext()) {
                    this.f.put((eaci) it.next(), eacfVar);
                }
            }
            i3 = i;
        }
    }

    @Override // defpackage.dzyn
    public final wr F(ViewGroup viewGroup, int i) {
        if (fdql.h()) {
            int a = dzyg.a(i);
            int i2 = a - 1;
            if (a == 0) {
                throw null;
            }
            switch (i2) {
                case 0:
                    return ((eacf) this.f.get(eaci.SUGGESTION_LIST)).d();
                case 1:
                    return ((eacf) this.f.get(eaci.RICH_CARD_BUBBLE)).d();
                case 2:
                    return ((eacf) this.f.get(eaci.TOMBSTONE_BUBBLE)).d();
                case 3:
                    eaec eaecVar = new eaec(viewGroup.getContext());
                    return new eadc(eaecVar, new eadz(eaecVar, this.n, this.o, this.p, this.q));
                case 4:
                case 5:
                case 6:
                    eabr eabrVar = new eabr(viewGroup.getContext());
                    eacd b = this.l.b(eabrVar, i);
                    eabrVar.b(b.a);
                    eabrVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    eabp eabpVar = new eabp(eabrVar);
                    eabpVar.d = this.s;
                    return new eadb(eabrVar, b, eabpVar);
                default:
                    throw new IllegalArgumentException(a.h(i, "Unsupported viewType: "));
            }
        }
        if (i < 1024) {
            eabr eabrVar2 = new eabr(viewGroup.getContext());
            eacd b2 = this.l.b(eabrVar2, i);
            eabrVar2.b(b2.a);
            eabrVar2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            eabp eabpVar2 = new eabp(eabrVar2);
            eabpVar2.d = this.s;
            return new eadb(eabrVar2, b2, eabpVar2);
        }
        int i3 = i - 1024;
        eaci eaciVar = eaci.TYPING_INDICATOR;
        if (i3 == eaciVar.f) {
            eaec eaecVar2 = new eaec(viewGroup.getContext());
            return new eadc(eaecVar2, new eadz(eaecVar2, this.n, this.o, this.p, this.q));
        }
        if (i3 == 0) {
            eaciVar = eaci.MESSAGE_BUBBLE;
        } else if (i3 == 1) {
            eaciVar = eaci.SUGGESTION_LIST;
        } else if (i3 == 2) {
            eaciVar = eaci.RICH_CARD_BUBBLE;
        } else if (i3 == 3) {
            eaciVar = eaci.TOMBSTONE_BUBBLE;
        } else if (i3 != 4) {
            throw new InvalidParameterException("Invalid MessageListCellViewModel type.");
        }
        return ((eacf) this.f.get(eaciVar)).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dzyn
    public final void G(wr wrVar, int i) {
        String str;
        eacj eacjVar = (eacj) b(i);
        eaci e = eacjVar.e();
        View view = wrVar.a;
        view.getContext();
        int ordinal = eacjVar.e().ordinal();
        if (ordinal == 0) {
            if (((dzqs) eacjVar.b().c().c()).h().a() == 3 && ((dznp) ((dzqs) eacjVar.b().c().c()).h().b()).a.equals("photos")) {
                eacjVar.b();
                throw null;
            }
            eacjVar.b();
            throw null;
        }
        if (ordinal == 2) {
            eacjVar.c();
            throw null;
        }
        if (ordinal == 3) {
            eacjVar.d();
            throw null;
        }
        view.setContentDescription(null);
        int ordinal2 = eacjVar.e().ordinal();
        eabt d = ordinal2 != 0 ? ordinal2 != 2 ? ordinal2 != 3 ? null : eacjVar.d() : eacjVar.c() : eacjVar.b();
        if (e.equals(eaci.MESSAGE_BUBBLE)) {
            eadb eadbVar = (eadb) wrVar;
            ((eabx) eadbVar.s.a).b((dzqs) d.c().c());
            eabp eabpVar = eadbVar.t;
            eabpVar.b = d;
            eabpVar.c = new dzxw(((eabr) eabpVar.a).f, d.b());
            eabp eabpVar2 = eadbVar.t;
            dzxw dzxwVar = eabpVar2.c;
            if (eabpVar2.b != null) {
                dzxwVar.a();
                eabo eaboVar = eabpVar2.a;
                eabt eabtVar = eabpVar2.b;
                if (eabtVar.c().g()) {
                    eabr eabrVar = (eabr) eaboVar;
                    eabrVar.a = (dzqs) eabtVar.c().c();
                    if (eabrVar.a.s() - 1 != 0) {
                        ((View) eabrVar.f).setVisibility(8);
                        eabrVar.h.setVisibility(8);
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                        layoutParams.addRule(true != dyhk.a(eabrVar.getContext()) ? 11 : 9);
                        layoutParams.addRule(3, eabrVar.h.getId());
                        eabrVar.g.setLayoutParams(layoutParams);
                        eabrVar.c.setGravity(8388613);
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                        str = null;
                        layoutParams2.addRule(true != dyhk.a(eabrVar.getContext()) ? 7 : 5, eabrVar.g.getId());
                        layoutParams2.addRule(3, eabrVar.g.getId());
                        eabrVar.d.setLayoutParams(layoutParams2);
                    } else {
                        str = null;
                        ((View) eabrVar.f).setVisibility(0);
                        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                        layoutParams3.addRule(!dyhk.a(eabrVar.getContext()) ? 1 : 0, ((View) eabrVar.f).getId());
                        layoutParams3.addRule(3, eabrVar.h.getId());
                        eabrVar.g.setLayoutParams(layoutParams3);
                        eabrVar.c.setGravity(8388611);
                        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                        layoutParams4.addRule(true != dyhk.a(eabrVar.getContext()) ? 5 : 7, eabrVar.g.getId());
                        layoutParams4.addRule(3, eabrVar.g.getId());
                        eabrVar.d.setLayoutParams(layoutParams4);
                    }
                    dzpb b = eabtVar.b();
                    RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams5.addRule(true == dyhk.a(eabrVar.getContext()) ? 7 : 5, eabrVar.g.getId());
                    eabrVar.h.setLayoutParams(layoutParams5);
                    if (b.h().g()) {
                        int b2 = ((dzqf) b.h().c()).b();
                        if (b2 == 0) {
                            eabrVar.h.a.setTextAppearance(eabrVar.i);
                            eabrVar.h.a(8);
                        } else if (b2 == 1) {
                            eabrVar.h.a.setTextAppearance(eabrVar.j);
                            eabrVar.h.a(8);
                        } else if (b2 == 2) {
                            eabrVar.h.a.setTextAppearance(eabrVar.k);
                            if (b.i().g()) {
                                eabrVar.h.a(0);
                            }
                        }
                    } else {
                        eabrVar.h.a.setTextAppearance(eabrVar.i);
                    }
                    eabrVar.h.a.setText((String) eabtVar.b().i().e(""));
                    eabrVar.h.a.setContentDescription((CharSequence) eabtVar.b().e().e(""));
                    int a = eabtVar.a();
                    int s = eabrVar.a.s();
                    if (a == 0) {
                        if (s == 1) {
                            ((View) eabrVar.f).setVisibility(0);
                            eabrVar.h.setVisibility(0);
                        }
                        eabrVar.b.d(20.0f, 20.0f, 20.0f, 20.0f);
                    } else if (a != 1) {
                        if (a != 2) {
                            if (s == 1) {
                                ((View) eabrVar.f).setVisibility(0);
                                eabrVar.b.d(4.0f, 20.0f, 20.0f, 20.0f);
                            } else {
                                eabrVar.b.d(20.0f, 4.0f, 20.0f, 20.0f);
                            }
                            eabrVar.h.setVisibility(8);
                        } else {
                            if (s == 1) {
                                ((View) eabrVar.f).setVisibility(4);
                                eabrVar.b.d(4.0f, 20.0f, 20.0f, 4.0f);
                            } else {
                                eabrVar.b.d(20.0f, 4.0f, 4.0f, 20.0f);
                            }
                            eabrVar.h.setVisibility(8);
                        }
                    } else if (s == 1) {
                        ((View) eabrVar.f).setVisibility(4);
                        eabrVar.h.setVisibility(0);
                        eabrVar.b.d(20.0f, 20.0f, 20.0f, 4.0f);
                    } else {
                        eabrVar.b.d(20.0f, 20.0f, 4.0f, 20.0f);
                    }
                    MessageCellStatusView messageCellStatusView = eabrVar.d;
                    messageCellStatusView.a(eabtVar.d());
                    dzqs dzqsVar = (dzqs) eabtVar.c().c();
                    messageCellStatusView.e = TimeUnit.MICROSECONDS.toMillis(dzqsVar.d());
                    dzqm dzqmVar = messageCellStatusView.f;
                    dzqm i2 = dzqsVar.i();
                    messageCellStatusView.f = dzqsVar.i();
                    messageCellStatusView.b(dzqmVar != i2 ? dzqsVar.r() : str);
                    TimestampHeaderView timestampHeaderView = eabrVar.e;
                    timestampHeaderView.c = TimeUnit.MICROSECONDS.toMillis(((dzqs) eabtVar.c().c()).d());
                    if (eabtVar.c().g()) {
                        if (eabtVar.e()) {
                            timestampHeaderView.setVisibility(0);
                            timestampHeaderView.b.setText(eabv.a(timestampHeaderView.c, timestampHeaderView.getContext()));
                        } else {
                            timestampHeaderView.setVisibility(8);
                        }
                    }
                }
            } else {
                dyhr.c("BubbleCellPresenter", "Call presenter.setmessage(message) before calling start()");
            }
        } else if (e.equals(eaci.TYPING_INDICATOR)) {
            eadc eadcVar = (eadc) wrVar;
            eadz eadzVar = eadcVar.s;
            eadzVar.c.l(eadzVar);
            eadzVar.b();
            eadz eadzVar2 = eadcVar.s;
            eadzVar2.c.j(eadzVar2);
            ((eaec) eadzVar2.b).a = (int) fdqi.a.get().b();
        } else {
            ((eacf) this.f.get(e)).c();
        }
        if (d == null || !d.c().g()) {
            return;
        }
        eack eackVar = this.m;
        Object c = d.c().c();
        eack eackVar2 = ((eacw) eackVar).a.d;
        if (eackVar2 != null) {
            dzqs dzqsVar2 = (dzqs) c;
            String r = dzqsVar2.r();
            eaau eaauVar = ((eaad) eackVar2).a;
            if (eaauVar.c.add(r)) {
                dzhl b3 = eaauVar.b(105);
                b3.f(dzqsVar2.s() == 1 ? 155 : 156);
                dzhz dzhzVar = new dzhz();
                dzhzVar.d(dzqsVar2.c());
                dzhzVar.b(dzqsVar2.j().a().f);
                b3.i(dzhzVar.a());
                if (dzqsVar2.h().a() == 3) {
                    engw engwVar = eaauVar.d;
                    for (int i3 = 0; i3 < ((enou) engwVar).c; i3++) {
                        each eachVar = (each) engwVar.get(i3);
                        if (eachVar.a().b()) {
                            eachVar.c();
                        }
                    }
                }
                eaauVar.b.b(b3.a());
            }
        }
        final Context context = wrVar.a.getContext();
        if (dyhe.c(context) && ((dzqs) d.c().c()).s() == 1) {
            if (dzqm.INCOMING_RECEIVED.equals(((dzqs) d.c().c()).i())) {
                final String string = context.getString(R.string.new_message_text);
                k.post(new Runnable() { // from class: eacy
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = eadd.j;
                        dyhe.b(context, string);
                    }
                });
            }
        }
    }

    public final void H() {
        engw engwVar = this.r;
        if (engwVar != null) {
            this.r = engw.n(engwVar);
            super.c(engw.n(enfc.d(engwVar).c(new emxg() { // from class: eacz
                @Override // defpackage.emxg
                public final boolean a(Object obj) {
                    eaci e = ((eacj) obj).e();
                    return e.equals(eaci.MESSAGE_BUBBLE) || e.equals(eaci.TYPING_INDICATOR) || eadd.this.f.containsKey(e);
                }
            }).g()));
        }
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void i(wr wrVar) {
        final dzym dzymVar = (dzym) wrVar;
        if (this.h == -1 || dzymVar.fr() != 0) {
            return;
        }
        dzymVar.a.postDelayed(new Runnable() { // from class: eada
            @Override // java.lang.Runnable
            public final void run() {
                dzym dzymVar2 = dzymVar;
                eadd eaddVar = eadd.this;
                if (eaddVar.h == dzymVar2.fr()) {
                    eaddVar.i.removeCallbacksAndMessages(null);
                    eaddVar.h = -1;
                    dzymVar2.a.requestFocus();
                    dzymVar2.a.sendAccessibilityEvent(8);
                }
            }
        }, 750L);
    }

    @Override // defpackage.dzyn
    public final int m(int i) {
        eacj eacjVar = (eacj) b(i);
        if (!fdql.h()) {
            if (!eacjVar.e().equals(eaci.MESSAGE_BUBBLE)) {
                return eacjVar.e().f + 1024;
            }
            int a = this.l.a((dzqs) eacjVar.b().c().c());
            emxf.l(a < 1024);
            return a;
        }
        int ordinal = eacjVar.e().ordinal();
        if (ordinal == 0) {
            return this.l.a((dzqs) eacjVar.b().c().c());
        }
        if (ordinal == 1) {
            return 0;
        }
        if (ordinal == 2) {
            return 1;
        }
        if (ordinal != 3) {
            return ordinal != 4 ? -1 : 3;
        }
        return 2;
    }
}

package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import com.google.android.apps.messaging.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeek implements ljv {
    public static final cfva a = cfvl.n(cfvl.b, "enable_fab_v2", false);
    public final elbx b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public View f;
    public ExtendedFloatingActionButton g;
    public int h;
    public boolean i;
    public final crlv j;
    private final ffbr k;
    private final asos l;
    private final fazb m;

    public aeek(ffbr ffbrVar, elbx elbxVar, asos asosVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, fazb fazbVar, ffbr ffbrVar5) {
        ffbrVar.getClass();
        elbxVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        fazbVar.getClass();
        this.k = ffbrVar;
        this.b = elbxVar;
        this.l = asosVar;
        this.c = ffbrVar2;
        this.d = ffbrVar4;
        this.m = fazbVar;
        this.e = ffbrVar5;
        this.j = new crlv("migrate_start_chat_fab_to_compose", new aeei(asosVar));
    }

    private final void j() {
        Optional optional = (Optional) this.m.b();
        final ffji ffjiVar = new ffji() { // from class: aedx
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ajei ajeiVar = (ajei) obj;
                cfva cfvaVar = aeek.a;
                ajeiVar.getClass();
                ajeiVar.a();
                return ffcu.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: aedy
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                cfva cfvaVar = aeek.a;
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ljv
    public final void c(lkr lkrVar) {
        if (this.j.b()) {
            return;
        }
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        if (extendedFloatingActionButton != null) {
            extendedFloatingActionButton.p();
        }
        j();
    }

    @Override // defpackage.ljv
    public final void d(lkr lkrVar) {
        i();
    }

    public final View g() {
        if (this.j.b()) {
            return null;
        }
        return this.g;
    }

    public final void h(final View view, ViewGroup viewGroup, final Runnable runnable, boolean z, final Runnable runnable2) {
        ExtendedFloatingActionButton extendedFloatingActionButton;
        ExtendedFloatingActionButton extendedFloatingActionButton2;
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.fab_stub);
        ekzz f = eleg.f("StartChatFabPresenter#replaceViewStubWithView");
        try {
            ViewParent parent = viewStub.getParent();
            parent.getClass();
            ViewGroup viewGroup2 = (ViewGroup) parent;
            int indexOfChild = viewGroup2.indexOfChild(viewStub);
            viewGroup2.removeViewInLayout(viewStub);
            ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
            if (layoutParams != null) {
                viewGroup2.addView(view, indexOfChild, layoutParams);
            } else {
                viewGroup2.addView(view, indexOfChild);
            }
            ffig.a(f, null);
            this.f = view;
            this.g = (ExtendedFloatingActionButton) view.findViewById(R.id.start_chat_fab);
            Optional optional = (Optional) this.m.b();
            final ffji ffjiVar = new ffji() { // from class: aedz
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ajei ajeiVar = (ajei) obj;
                    ajeiVar.getClass();
                    ajeiVar.b(view, runnable2, new aeeh(this));
                    return ffcu.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: aeea
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    cfva cfvaVar = aeek.a;
                    ffji.this.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            f = eleg.f("StartChatFabPresenter#BugleVeLogger#bind");
            try {
                ExtendedFloatingActionButton extendedFloatingActionButton3 = this.g;
                if (extendedFloatingActionButton3 != null) {
                    ((aley) this.d.b()).a(extendedFloatingActionButton3, 184229);
                }
                ffig.a(f, null);
                if (cubs.c() && (extendedFloatingActionButton2 = this.g) != null) {
                    final elbx elbxVar = this.b;
                    final View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: aeeb
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            cfva cfvaVar = aeek.a;
                            int action = motionEvent.getAction();
                            if (action != 0 && action != 1 && action != 2 && action != 3 && action != 11 && action != 12) {
                                return false;
                            }
                            chrt chrtVar = chrt.a;
                            motionEvent.getClass();
                            chrtVar.a(motionEvent);
                            return false;
                        }
                    };
                    extendedFloatingActionButton2.setOnTouchListener(new View.OnTouchListener() { // from class: elbj
                        public final /* synthetic */ String c = "startChatFab#onTouch";

                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            int actionMasked = motionEvent.getActionMasked();
                            View.OnTouchListener onTouchListener2 = onTouchListener;
                            if (actionMasked == 3 && ekyf.v()) {
                                return onTouchListener2.onTouch(view2, motionEvent);
                            }
                            ekzm b = elbx.this.b(this.c);
                            try {
                                boolean onTouch = onTouchListener2.onTouch(view2, motionEvent);
                                b.close();
                                return onTouch;
                            } catch (Throwable th) {
                                try {
                                    b.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    });
                }
                ExtendedFloatingActionButton extendedFloatingActionButton4 = this.g;
                if (extendedFloatingActionButton4 != null) {
                    extendedFloatingActionButton4.setOnClickListener(new elay(this.b, "startChatFab#onClick", new View.OnClickListener() { // from class: aeec
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            aeek aeekVar = aeek.this;
                            aley aleyVar = (aley) aeekVar.d.b();
                            ExtendedFloatingActionButton extendedFloatingActionButton5 = aeekVar.g;
                            extendedFloatingActionButton5.getClass();
                            aleyVar.c(extendedFloatingActionButton5);
                            runnable.run();
                        }
                    }));
                }
                if ((((Boolean) a.e()).booleanValue() || !z) && (extendedFloatingActionButton = this.g) != null) {
                    extendedFloatingActionButton.q();
                }
                i();
                if (this.i) {
                    View view2 = this.f;
                    if (view2 != null) {
                        aeel.a(view2, this.h, true);
                    }
                    this.i = false;
                }
            } finally {
            }
        } finally {
        }
    }

    public final void i() {
        ekzz f = eleg.f("StartChatFabPresenter#updateFabVisibility");
        try {
            if (((ctvb) this.k.b()).G()) {
                ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
                if (extendedFloatingActionButton != null) {
                    extendedFloatingActionButton.t(0);
                }
                if (((Optional) this.m.b()).isPresent() && ((ajei) ((Optional) this.m.b()).get()).g()) {
                    Optional optional = (Optional) this.m.b();
                    final ffji ffjiVar = new ffji() { // from class: aeef
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            ajei ajeiVar = (ajei) obj;
                            cfva cfvaVar = aeek.a;
                            ajeiVar.getClass();
                            ajeiVar.e();
                            return ffcu.a;
                        }
                    };
                    optional.ifPresent(new Consumer() { // from class: aeeg
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            cfva cfvaVar = aeek.a;
                            ffji.this.invoke(obj);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    ffig.a(f, null);
                }
            } else {
                ExtendedFloatingActionButton extendedFloatingActionButton2 = this.g;
                if (extendedFloatingActionButton2 != null) {
                    extendedFloatingActionButton2.p();
                }
            }
            j();
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

    @Override // defpackage.ljv
    public final /* synthetic */ void f(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ff(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void gZ(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ha(lkr lkrVar) {
    }
}

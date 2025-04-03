package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.Iterator;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqvo extends dqwe {
    public static final /* synthetic */ int aj = 0;
    private static final enru ak = enru.c("com/google/android/libraries/compose/emoji/ui/screen/gboard/GboardEmojiScreen");
    public dqok a;
    public dqvb ag;
    public dqwj ah;
    public dqwf ai;
    private final dszr al;
    private final ffbz am;
    public emxc b;
    public dqwk c;
    public dqra d;
    public dqwb e;

    public dqvo() {
        super(new dqsv(null, null, PrivateKeyType.INVALID));
        this.al = dszr.b;
        this.am = ffca.a(new ffix() { // from class: dqvj
            @Override // defpackage.ffix
            public final Object invoke() {
                dqwf dqwfVar;
                final dqvo dqvoVar = dqvo.this;
                dqwb dqwbVar = dqvoVar.e;
                if (dqwbVar == null) {
                    ffkj.c("stateManagerFactory");
                    dqwbVar = null;
                }
                dqwf dqwfVar2 = dqvoVar.ai;
                if (dqwfVar2 == null) {
                    ffkj.c("views");
                    dqwfVar = null;
                } else {
                    dqwfVar = dqwfVar2;
                }
                ffix ffixVar = new ffix() { // from class: dqvf
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return dqvo.this.bN();
                    }
                };
                ffix ffixVar2 = new ffix() { // from class: dqvg
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return dqvo.this.bK();
                    }
                };
                dqvn dqvnVar = new dqvn(dqvoVar);
                dqsv dqsvVar = (dqsv) dqvoVar.bA();
                Context context = (Context) dqwbVar.a.b();
                context.getClass();
                ea eaVar = (ea) ((fbbb) dqwbVar.b).a;
                ffsk ffskVar = (ffsk) dqwbVar.c.b();
                ffskVar.getClass();
                errl errlVar = (errl) dqwbVar.d.b();
                errlVar.getClass();
                duqi duqiVar = (duqi) dqwbVar.e.b();
                duqiVar.getClass();
                dqwd dqwdVar = (dqwd) dqwbVar.f.b();
                dqwdVar.getClass();
                dqwfVar.getClass();
                dqsvVar.getClass();
                return new dqwa(context, eaVar, ffskVar, errlVar, duqiVar, dqwdVar, dqwfVar, ffixVar, ffixVar2, dqvnVar, dqsvVar);
            }
        });
    }

    public final dqok a() {
        dqok dqokVar = this.a;
        if (dqokVar != null) {
            return dqokVar;
        }
        ffkj.c("definitionsService");
        return null;
    }

    @Override // defpackage.dtae
    public final dtan aT() {
        dqwj dqwjVar = this.ah;
        if (dqwjVar != null) {
            return dqwjVar;
        }
        emxc emxcVar = this.b;
        if (emxcVar != null) {
            final dqvl dqvlVar = new dqvl(this);
            this.ah = (dqwj) ((emxn) emxcVar.b(new emwl() { // from class: dqvk
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    int i = dqvo.aj;
                    return ffji.this.invoke(obj);
                }
            })).a;
        }
        return this.ah;
    }

    @Override // defpackage.dtaa
    protected final void aZ(dsjz dsjzVar) {
        ((enrr) ak.e().h("com/google/android/libraries/compose/emoji/ui/screen/gboard/GboardEmojiScreen", "applyHugoColors", 111, "GboardEmojiScreen.kt")).t("Applying HugoColors: %s", dsjzVar);
        dqwf dqwfVar = this.ai;
        if (dqwfVar == null) {
            ffkj.c("views");
            dqwfVar = null;
        }
        dqwfVar.d.setImageTintList(dsjzVar.k);
        dqwfVar.d.setBackgroundColor(dsjzVar.j);
        dqwfVar.c.setBackgroundColor(dsjzVar.d);
        dqwa b = b();
        Object obj = b.m;
        dutb dutbVar = obj instanceof dutb ? (dutb) obj : null;
        if (dutbVar != null) {
            dutbVar.c(b.l);
        }
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        dtal dtalVar;
        view.getClass();
        dqwf dqwfVar = new dqwf((ViewGroup) view);
        dqwfVar.d.setVisibility(true != ((dqsv) bA()).f ? 8 : 0);
        int dimensionPixelSize = B().getDimensionPixelSize(R.dimen.emoji_tab_height);
        RecyclerView recyclerView = dqwfVar.c;
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), recyclerView.getPaddingTop(), true == ((dqsv) bA()).f ? dimensionPixelSize : 0, dqwfVar.c.getPaddingBottom());
        dqwfVar.d.setOnClickListener(by().b("GboardEmojiScreen.backspace#onClick", new View.OnClickListener() { // from class: dqvd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ((dqls) dqvo.this.bE().invoke()).a.d();
            }
        }));
        this.ai = dqwfVar;
        String bS = bS();
        if (bS == null) {
            b().c();
        } else {
            dtan aT = aT();
            if (aT != null && (dtalVar = ((dqwj) aT).j) != null) {
                dtalVar.c(bS);
            }
        }
        bJ();
        bQ();
    }

    public final dqwa b() {
        return (dqwa) this.am.a();
    }

    @Override // defpackage.dqwe, defpackage.dslv, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        by().e("GboardEmojiScreen#onAttach", new ffix() { // from class: dqve
            @Override // defpackage.ffix
            public final Object invoke() {
                dqvo dqvoVar = dqvo.this;
                final dqvb dqvbVar = dqvoVar.ag;
                dqra dqraVar = null;
                if (dqvbVar == null) {
                    ffkj.c("initializer");
                    dqvbVar = null;
                }
                if (dqvbVar.d.a.compareAndSet(false, true)) {
                    dqvbVar.f.e("GboardEmojiLibraryInitializer#init", new ffix() { // from class: dqva
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            dqvb dqvbVar2 = dqvb.this;
                            dqvbVar2.e.a();
                            int i = dqsr.a;
                            krj krjVar = dqsq.a;
                            krjVar.getClass();
                            lfe lfeVar = new lfe(dqvbVar2.a, krjVar);
                            lfeVar.b = true;
                            dvai dvaiVar = dvai.a;
                            boolean z = dvaiVar.c;
                            Context context2 = dqvbVar2.a;
                            errm errmVar = dqvbVar2.c;
                            if (!z) {
                                dvaiVar.c = true;
                                dvaiVar.b = krb.a(context2) && !dvai.b();
                                if (dvaiVar.b) {
                                    duyb.d(dvaj.a);
                                } else {
                                    IntentFilter intentFilter = new IntentFilter("android.intent.action.USER_UNLOCKED");
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        context2.registerReceiver(dvaiVar, intentFilter, null, null, 4);
                                    } else {
                                        context2.registerReceiver(dvaiVar, intentFilter, null, null);
                                    }
                                    dvaiVar.d = true;
                                    dvaiVar.b = krb.a(context2) && !dvai.b();
                                    if (dvaiVar.b) {
                                        dvaiVar.a(context2);
                                        duyb.d(dvaj.a);
                                    }
                                }
                            }
                            if (dupg.b == null) {
                                synchronized (dupg.class) {
                                    if (dupg.b == null) {
                                        dupg.b = new dupg(context2, errmVar);
                                    }
                                }
                            }
                            duut duutVar = duut.instance;
                            if (!duut.e) {
                                duutVar.l = true;
                                duur duurVar = duur.b;
                                if (!duurVar.equals(duutVar.j)) {
                                    duutVar.j = duurVar;
                                    synchronized (duutVar.h) {
                                        Iterator it = duutVar.h.iterator();
                                        while (it.hasNext()) {
                                            ((duus) it.next()).c();
                                        }
                                    }
                                }
                                if (!duut.e) {
                                    ozg.a("EmojiCompatManager.init");
                                    try {
                                        duwb.c(duutVar, duut.d, duut.c);
                                        if (!duun.a && !duutVar.l) {
                                            lew.h(new duuq(new leu() { // from class: duuo
                                                @Override // defpackage.leu
                                                public final void a(lev levVar) {
                                                    enru enruVar = duut.a;
                                                    levVar.a(null);
                                                }
                                            }));
                                            duut.e = true;
                                        }
                                        duutVar.i = SystemClock.elapsedRealtime();
                                        lfeVar.a(duutVar.g);
                                        lew.h(lfeVar);
                                        duutVar.k.c((String) duut.d.b());
                                        duutVar.f = engw.n(duut.b.i((CharSequence) duut.c.b()));
                                        duut.e = true;
                                    } finally {
                                        Trace.endSection();
                                    }
                                }
                            }
                            duvs.a(dqvbVar2.b);
                            return ffcu.a;
                        }
                    });
                }
                dqra dqraVar2 = dqvoVar.d;
                if (dqraVar2 == null) {
                    ffkj.c("frecentEmojiProvider");
                } else {
                    dqraVar = dqraVar2;
                }
                dqraVar.a().d();
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.dsyk
    public final dsyj s() {
        dqwf dqwfVar = this.ai;
        if (dqwfVar != null) {
            return dsyh.a(dqwfVar.a);
        }
        return null;
    }

    @Override // defpackage.dtaa
    public final dszr t() {
        return this.al;
    }
}

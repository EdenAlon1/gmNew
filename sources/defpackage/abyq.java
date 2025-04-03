package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.fbal;
import j$.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abyq extends abzs implements ekhu, fbas, ekhq, ekkk, elar, ellr {
    private abyy a;
    private boolean ah;
    private Context d;
    private final lkv e = new lkv(this);
    private final ells ag = new ells();

    @Deprecated
    public abyq() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return abyy.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final abyy H = H();
            View inflate = layoutInflater.inflate(R.layout.data_donation_fragment, viewGroup, false);
            inflate.setSystemUiVisibility(1280);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(android.R.id.list);
            recyclerView.getClass();
            H.o = recyclerView;
            RecyclerView recyclerView2 = H.o;
            ((abyq) H.b.b()).z();
            recyclerView2.ap(new LinearLayoutManager());
            H.o.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: abyv
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    abyy abyyVar = abyy.this;
                    eg egVar = (eg) abyyVar.c.b();
                    egVar.getClass();
                    view.setPadding(windowInsets.getSystemWindowInsetLeft(), ddzb.d(egVar) + ((abyq) abyyVar.b.b()).B().getDimensionPixelSize(R.dimen.action_bar_height), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom() + ((abyq) abyyVar.b.b()).B().getDimensionPixelOffset(R.dimen.confirm_button_container_height));
                    return windowInsets.consumeSystemWindowInsets();
                }
            });
            ta taVar = new ta();
            taVar.y();
            H.o.an(taVar);
            Button button = (Button) inflate.findViewById(R.id.confirm_button);
            button.getClass();
            H.s = button;
            H.s.setOnClickListener(new View.OnClickListener() { // from class: abyu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final abyy abyyVar = abyy.this;
                    abzm abzmVar = abyyVar.p;
                    if (abzmVar == null) {
                        return;
                    }
                    int m = abzmVar.m();
                    int sum = Collection.EL.stream(abyyVar.p.a).mapToInt(new ToIntFunction() { // from class: abzj
                        @Override // java.util.function.ToIntFunction
                        public final int applyAsInt(Object obj) {
                            return ((abzx) obj).d == 0 ? 0 : 1;
                        }
                    }).sum();
                    if (m == 0 || sum == 0) {
                        return;
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((abyq) abyyVar.b.b()).Z(R.string.donation_donate_dialog_body_text, ((abyq) abyyVar.b.b()).B().getQuantityString(R.plurals.donation_donate_dialog_body_text_messages, m, Integer.valueOf(m)), ((abyq) abyyVar.b.b()).B().getQuantityString(R.plurals.donation_donate_dialog_body_text_conversations, sum, Integer.valueOf(sum))));
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan(((abyq) abyyVar.b.b()).B().getDimensionPixelSize(R.dimen.body_text_size)), 0, spannableStringBuilder.length(), 17);
                    ehft ehftVar = new ehft((Context) abyyVar.c.b());
                    ehftVar.x(R.string.donation_donate_dialog_title);
                    ehftVar.n(spannableStringBuilder);
                    ehftVar.t(R.string.donation_donate_dialog_positive_button_label, new elbb((elbx) abyyVar.l.b(), "DataDonationFragmentPeer#getDonatePositiveButton", new DialogInterface.OnClickListener() { // from class: abyr
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            abyy abyyVar2 = abyy.this;
                            ejlq ejlqVar = (ejlq) abyyVar2.i.b();
                            acaa acaaVar = (acaa) abyyVar2.h.b();
                            abzm abzmVar2 = abyyVar2.p;
                            abzmVar2.getClass();
                            final engw engwVar = abzmVar2.a;
                            emxf.a(!engwVar.isEmpty());
                            ekzz f = eleg.f("ParticipantMessageListDonator#donate");
                            try {
                                elfl g = elfo.g(new Callable() { // from class: abzy
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        ezft ezftVar = (ezft) ezfu.a.createBuilder();
                                        engw engwVar2 = engw.this;
                                        int size = engwVar2.size();
                                        for (int i2 = 0; i2 < size; i2++) {
                                            abzx abzxVar = (abzx) engwVar2.get(i2);
                                            if (abzxVar.d != 0) {
                                                ezfr ezfrVar = (ezfr) ezfs.a.createBuilder();
                                                for (int i3 = 0; i3 < abzxVar.a(); i3++) {
                                                    if (abzxVar.e(i3)) {
                                                        ezfx a = acah.a(abzxVar.c(i3), abzxVar.a, abzxVar.b(i3), i3, ((abzw) abzxVar.c.get(i3)).d);
                                                        ezfrVar.copyOnWrite();
                                                        ezfs ezfsVar = (ezfs) ezfrVar.instance;
                                                        ezfz ezfzVar = (ezfz) a.build();
                                                        ezfzVar.getClass();
                                                        ezfsVar.a();
                                                        ezfsVar.b.add(ezfzVar);
                                                    }
                                                }
                                                ezfs ezfsVar2 = (ezfs) ezfrVar.build();
                                                ezftVar.copyOnWrite();
                                                ezfu ezfuVar = (ezfu) ezftVar.instance;
                                                ezfsVar2.getClass();
                                                ezfuVar.a();
                                                ezfuVar.c.add(ezfsVar2);
                                            }
                                        }
                                        return (ezfu) ezftVar.build();
                                    }
                                }, acaaVar.a);
                                final abya abyaVar = acaaVar.b;
                                abyaVar.getClass();
                                elfl i2 = g.i(new eroh() { // from class: abzz
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj) {
                                        final ezfu ezfuVar = (ezfu) obj;
                                        final abya abyaVar2 = abya.this;
                                        return abyaVar2.a(new abxz() { // from class: abxy
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // defpackage.abxz
                                            public final engw a() {
                                                ezfu ezfuVar2 = ezfuVar;
                                                ezfuVar2.getSerializedSize();
                                                int intValue = ((Integer) abya.a.e()).intValue() - ((int) (((Integer) abya.a.e()).intValue() * ((Double) abya.b.e()).doubleValue()));
                                                int i3 = 0;
                                                emxf.l(intValue > 0);
                                                int i4 = engw.d;
                                                engr engrVar = new engr();
                                                engr engrVar2 = new engr();
                                                engrVar.h(engrVar2);
                                                int i5 = 0;
                                                for (int i6 = 0; i6 < ezfuVar2.c.size(); i6++) {
                                                    ezfs ezfsVar = (ezfs) ezfuVar2.c.get(i6);
                                                    if (ezfsVar.getSerializedSize() + i5 >= intValue) {
                                                        engrVar2 = new engr();
                                                        engrVar.h(engrVar2);
                                                        i5 = 0;
                                                    }
                                                    i5 += ezfsVar.getSerializedSize();
                                                    engrVar2.h(ezfsVar);
                                                }
                                                engw g2 = engrVar.g();
                                                engr engrVar3 = new engr();
                                                String uuid = UUID.randomUUID().toString();
                                                while (true) {
                                                    enou enouVar = (enou) g2;
                                                    if (i3 >= enouVar.c) {
                                                        return engrVar3.g();
                                                    }
                                                    abya abyaVar3 = abya.this;
                                                    engr engrVar4 = (engr) g2.get(i3);
                                                    ezft ezftVar = (ezft) ezfu.a.createBuilder();
                                                    String r = abyaVar3.g.r();
                                                    ezftVar.copyOnWrite();
                                                    ezfu ezfuVar3 = (ezfu) ezftVar.instance;
                                                    r.getClass();
                                                    ezfuVar3.e = r;
                                                    String languageTag = ctid.c(abyaVar3.f).toLanguageTag();
                                                    ezftVar.copyOnWrite();
                                                    ezfu ezfuVar4 = (ezfu) ezftVar.instance;
                                                    languageTag.getClass();
                                                    ezfuVar4.d = languageTag;
                                                    ezga ezgaVar = (ezga) ezgb.a.createBuilder();
                                                    ezgaVar.copyOnWrite();
                                                    ezgb ezgbVar = (ezgb) ezgaVar.instance;
                                                    uuid.getClass();
                                                    ezgbVar.b = uuid;
                                                    ezgaVar.copyOnWrite();
                                                    ((ezgb) ezgaVar.instance).d = i3;
                                                    int i7 = enouVar.c;
                                                    ezgaVar.copyOnWrite();
                                                    ((ezgb) ezgaVar.instance).c = i7;
                                                    ezftVar.copyOnWrite();
                                                    ezfu ezfuVar5 = (ezfu) ezftVar.instance;
                                                    ezgb ezgbVar2 = (ezgb) ezgaVar.build();
                                                    ezgbVar2.getClass();
                                                    ezfuVar5.f = ezgbVar2;
                                                    ezfuVar5.b |= 1;
                                                    engw g3 = engrVar4.g();
                                                    ezftVar.copyOnWrite();
                                                    ezfu ezfuVar6 = (ezfu) ezftVar.instance;
                                                    ezfuVar6.a();
                                                    eydl.addAll(g3, ezfuVar6.c);
                                                    engrVar3.h((ezfu) ezftVar.build());
                                                    i3++;
                                                }
                                            }
                                        });
                                    }
                                }, erpp.a);
                                f.b(i2);
                                f.close();
                                ejlqVar.g(ejlp.b(i2), abyyVar2.n);
                            } catch (Throwable th) {
                                try {
                                    f.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }));
                    ehftVar.o(android.R.string.cancel, null);
                    ehftVar.a();
                }
            });
            ejwl ejwlVar = (ejwl) H.g.b();
            abwo abwoVar = (abwo) H.f.b();
            Bundle extras = ((eg) H.c.b()).getIntent().getExtras();
            extras.getClass();
            errl errlVar = (errl) abwoVar.a.b();
            errlVar.getClass();
            errl errlVar2 = (errl) abwoVar.b.b();
            errlVar2.getClass();
            cqoh cqohVar = (cqoh) abwoVar.c.b();
            cqohVar.getClass();
            ejwlVar.b(new abwn(errlVar, errlVar2, cqohVar, (Map) abwoVar.d.b(), extras), H.m);
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) inflate.findViewById(R.id.progress);
            circularProgressIndicator.getClass();
            H.q = circularProgressIndicator;
            FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.progress_background);
            frameLayout.getClass();
            H.r = frameLayout;
            if (inflate == null) {
                abzc.a(this, H());
            }
            ekyf.q();
            return inflate;
        } finally {
        }
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.e;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final abyy H() {
        abyy abyyVar = this.a;
        if (abyyVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ah) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return abyyVar;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.ekhq
    @Deprecated
    public final Context aZ() {
        if (this.d == null) {
            this.d = new ekkn(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.abzs, defpackage.efaf, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
        try {
            super.ag(activity);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.c.k();
        try {
            ellg.b(this).b = view;
            H();
            abzc.a(this, H());
            bm(view, bundle);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.abzs
    protected final /* synthetic */ fbae b() {
        return new ekku(this);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final elds bb() {
        return this.c.a;
    }

    @Override // defpackage.ekkk
    public final Locale bc() {
        return ekkj.a(this);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void bd(elds eldsVar, boolean z) {
        this.c.e(eldsVar, z);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void be(elds eldsVar) {
        this.c.b = eldsVar;
    }

    @Override // defpackage.ellr
    public final elli e(ellf ellfVar) {
        return this.ag.a(ellfVar);
    }

    @Override // defpackage.ellr
    public final void f(Class cls, ellh ellhVar) {
        this.ag.b(cls, ellhVar);
    }

    @Override // defpackage.abzs, defpackage.ekkd, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ah) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    Object aX = aX();
                    fbbf fbbfVar = ((akgt) aX).Q;
                    fbbf fbbfVar2 = ((akgt) aX).c.f;
                    fbbf fbbfVar3 = ((akgt) aX).R;
                    akis akisVar = ((akgt) aX).a;
                    this.a = new abyy(fbbfVar, fbbfVar2, fbbfVar3, akisVar.a.nk, ((akgt) aX).T, ((akgt) aX).k, ((akgt) aX).U, ((akgt) aX).l, akisVar.b.ii, fbbd.a, ((akgt) aX).a.aJ);
                    this.Z.c(new ekkg(this.c, this.e));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater aO = aO();
            LayoutInflater cloneInContext = aO.cloneInContext(new fbal.a(aO, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new ekkn(this, cloneInContext));
            ekyf.q();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aY(bundle);
            abyy H = H();
            ((ejlq) H.i.b()).k(H.n);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efaf, defpackage.ea
    public final void j() {
        elav a = this.c.a();
        try {
            bg();
            this.ah = true;
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.abzs, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}

package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvli implements cxyl, cyah, ejlr {
    public static final entd a = entd.c("SignatureBanner");
    public final Context b;
    public final cxyg c;
    public cvll d;
    private final cyai e;
    private final ejwl f;
    private final cvlx g;
    private final cvlw h;
    private final cvlo i;
    private final ejlq j;

    public cvli(Context context, cyai cyaiVar, ejwl ejwlVar, cvlx cvlxVar, cvlw cvlwVar, cvlo cvloVar, ejlq ejlqVar, cxyg cxygVar) {
        this.b = context;
        this.e = cyaiVar;
        this.f = ejwlVar;
        this.g = cvlxVar;
        this.h = cvlwVar;
        this.i = cvloVar;
        this.j = ejlqVar;
        this.c = cxygVar;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        this.c.a(this, false);
    }

    @Override // defpackage.cxyl
    public final cxyh d() {
        return new cxxy("SignatureBanner", true);
    }

    @Override // defpackage.cxyl
    public final cxyq e() {
        cyai cyaiVar = this.e;
        Context context = this.b;
        cyag a2 = cyaiVar.a(context);
        a2.p(context.getString(R.string.signature_banner_description));
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: cvlh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cvli cvliVar = cvli.this;
                ehft ehftVar = new ehft(cvliVar.b);
                ehftVar.n(((cvlz) cvliVar.d.a().get()).a());
                ehftVar.j(true);
                ehftVar.t(android.R.string.ok, null);
                ehftVar.a();
            }
        };
        cvlx cvlxVar = this.g;
        String replaceAll = cvlxVar.a.getString(R.string.view_signature_call_to_action).replaceAll("\\s", " ");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cvlxVar.a.getString(R.string.banner_combined_text, cvlxVar.a.getString(R.string.samsung_signature_banner_text), replaceAll));
        crmi.d(cvlxVar.a, spannableStringBuilder, replaceAll, onClickListener);
        a2.m(spannableStringBuilder);
        a2.t(R.drawable.quantum_gm_ic_info_black_24, ehdr.d(this.b, R.attr.colorOnSurfaceVariant, "SignatureBanner"));
        a2.u(this);
        ((ensz) a.n().h("com/google/android/apps/messaging/signature/banner/ShowOnlyWhenSignatureHasChangedBanner", "createBannerUiController", 98, "ShowOnlyWhenSignatureHasChangedBanner.java")).q("Created UI Controller");
        return a2;
    }

    @Override // defpackage.cyah
    public final void f(cyag cyagVar) {
        this.j.h(this.h.a.j(new emwl() { // from class: cvlu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cvlp builder = ((cvlq) obj).toBuilder();
                builder.copyOnWrite();
                cvlq cvlqVar = (cvlq) builder.instance;
                cvlqVar.b |= 2;
                cvlqVar.d = 4;
                return builder.build();
            }
        }), this);
    }

    @Override // defpackage.cxyl
    public final void h() {
        axnw.h(this.h.a.j(new emwl() { // from class: cvls
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cvlq cvlqVar = (cvlq) obj;
                int i = cvlqVar.d;
                if (i > 3) {
                    return cvlqVar;
                }
                cvlp builder = cvlqVar.toBuilder();
                builder.copyOnWrite();
                cvlq cvlqVar2 = (cvlq) builder.instance;
                cvlqVar2.b |= 2;
                cvlqVar2.d = i + 1;
                return builder.build();
            }
        }));
    }

    @Override // defpackage.cxyl
    public final void k() {
        this.j.k(this);
    }

    @Override // defpackage.cxyl
    public final void l() {
        final cvlo cvloVar = this.i;
        this.f.b(new ejuw(cvloVar.b.a(), new eroh() { // from class: cvln
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    ((ensz) cvlo.a.n().h("com/google/android/apps/messaging/signature/banner/dataservice/SignatureBannerDataService", "shouldShowBanner", 45, "SignatureBannerDataService.java")).q("Data source had no data.");
                    return elfo.e(new cvlk(Optional.empty(), false));
                }
                cvlo cvloVar2 = cvlo.this;
                final String a2 = ((cvlz) optional.get()).a();
                final cvlw cvlwVar = cvloVar2.c;
                return cvlwVar.a.h().i(new eroh() { // from class: cvlt
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        cvlq cvlqVar = (cvlq) obj2;
                        int i = cvlqVar.b & 1;
                        final String str = a2;
                        if (i != 0 && cvlqVar.c.equals(str)) {
                            return elfo.e(Boolean.valueOf(cvlqVar.d <= 3));
                        }
                        cvlw cvlwVar2 = cvlw.this;
                        return cvlwVar2.a.j(new emwl() { // from class: cvlr
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                cvlp builder = ((cvlq) obj3).toBuilder();
                                builder.clear();
                                builder.copyOnWrite();
                                cvlq cvlqVar2 = (cvlq) builder.instance;
                                cvlqVar2.b |= 1;
                                cvlqVar2.c = str;
                                return builder.build();
                            }
                        }).h(new emwl() { // from class: cvlv
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                return true;
                            }
                        }, cvlwVar2.b);
                    }
                }, cvlwVar.b).h(new emwl() { // from class: cvlm
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        entd entdVar = cvlo.a;
                        return new cvlk(Optional.this, ((Boolean) obj2).booleanValue());
                    }
                }, cvloVar2.d);
            }
        }, cvloVar.d), new ejwd<cvll>() { // from class: cvli.1
            @Override // defpackage.ejwd
            public final void a(Throwable th) {
                throw new IllegalStateException(th);
            }

            @Override // defpackage.ejwd
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                cvli cvliVar = cvli.this;
                cvliVar.d = (cvll) obj;
                cvliVar.c.a(cvliVar, cvliVar.d.b());
                ((ensz) cvli.a.n().h("com/google/android/apps/messaging/signature/banner/ShowOnlyWhenSignatureHasChangedBanner$1", "onNewData", 113, "ShowOnlyWhenSignatureHasChangedBanner.java")).t("Set eligibility to %b", Boolean.valueOf(cvli.this.d.b()));
            }

            @Override // defpackage.ejwd
            public final /* synthetic */ void hB() {
            }
        });
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        throw new IllegalStateException(th);
    }

    @Override // defpackage.cxyl
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.cxyl
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.cxyl
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}

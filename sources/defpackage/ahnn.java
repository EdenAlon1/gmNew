package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahnn implements cglo {
    public static final cskc a = cskc.g("Bugle", "TCLibLinkifyText");
    public static final engw b = engw.w("address", "date", "datetime", "email", "phone", "url");
    public static final engw c = engw.z("address", "date", "datetime", "email", "phone", "tracking_number", "flight", "unit", "url");
    public static final engw d = engw.t("flight", "other", "");
    public static final engw e = engw.s("other", "");
    public final ahni f;
    public final cpdm g;
    public final cfyt h;
    public final ffbr i;
    private final cwln j;
    private final errl k;

    public ahnn(cwln cwlnVar, errl errlVar, ahni ahniVar, cpdm cpdmVar, cfyt cfytVar, ffbr ffbrVar) {
        this.j = cwlnVar;
        this.k = errlVar;
        this.f = ahniVar;
        this.g = cpdmVar;
        this.h = cfytVar;
        this.i = ffbrVar;
    }

    @Override // defpackage.cglo
    public final ListenableFuture a(final Spannable spannable, final Context context, final czja czjaVar) {
        return this.j.a().h(new emwl() { // from class: ahnl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final ahnn ahnnVar = ahnn.this;
                final Spannable spannable2 = spannable;
                final Context context2 = context;
                final czja czjaVar2 = czjaVar;
                return (Pair) ((Optional) obj).map(new Function() { // from class: ahnj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        TextClassifierLib textClassifierLib = (TextClassifierLib) obj2;
                        csix.l(textClassifierLib);
                        Spannable spannable3 = spannable2;
                        if (spannable3.length() >= 10000) {
                            csjb e2 = ahnn.a.e();
                            e2.v("Skip linkify because text has length exceeds the threshold.");
                            e2.r();
                            return Pair.create(spannable3, enoz.a);
                        }
                        engw engwVar = ahnn.b;
                        engw engwVar2 = ahnn.d;
                        if (((Boolean) ((cfup) ahna.a.get()).e()).booleanValue()) {
                            engwVar = ahnn.c;
                            engwVar2 = ahnn.e;
                        }
                        exak exakVar = new exak(spannable3);
                        ewza ewzaVar = new ewza();
                        ewzaVar.b = engwVar;
                        ewzaVar.a = engwVar2;
                        exakVar.a = ewzaVar.a();
                        exap b2 = textClassifierLib.b(exakVar.a());
                        if (b2.d.isEmpty()) {
                            return Pair.create(spannable3, enoz.a);
                        }
                        czja czjaVar3 = czjaVar2;
                        Context context3 = context2;
                        ahnn ahnnVar2 = ahnn.this;
                        spannable3.getClass();
                        textClassifierLib.getClass();
                        if (spannable3.toString().startsWith(b2.c.toString()) && !b2.d.isEmpty()) {
                            for (exam examVar : b2.d) {
                                exao exaoVar = new exao(examVar, textClassifierLib);
                                ffbr ffbrVar = ahnnVar2.i;
                                cwlm cwlmVar = new cwlm(spannable3, exaoVar, context3, ahnnVar2.g, ahnnVar2.h, czjaVar3, ffbrVar);
                                if (((ClickableSpan[]) spannable3.getSpans(examVar.b, examVar.c, ClickableSpan.class)).length <= 0) {
                                    spannable3.setSpan(cwlmVar, examVar.b, examVar.c, 33);
                                }
                            }
                        }
                        enhk enhkVar = (enhk) DesugarArrays.stream((cwlm[]) spannable3.getSpans(0, spannable3.length(), cwlm.class)).collect(endq.a(Function$CC.identity(), new Function() { // from class: ahnm
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                cskc cskcVar = ahnn.a;
                                return ahno.a(((cwlm) obj3).a.a);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }));
                        return Pair.create(ahnnVar2.f.a(spannable3, enhkVar), enhkVar);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElseGet(new Supplier() { // from class: ahnk
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        cskc cskcVar = ahnn.a;
                        return Pair.create(spannable2, enoz.a);
                    }
                });
            }
        }, this.k);
    }
}

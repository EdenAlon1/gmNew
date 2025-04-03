package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.chat.smartmessaging.smartreply.android.LanguageDetectorJni;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctmy implements ctit {
    public final Context c;
    public final errl d;
    public final ctmg e;
    public volatile LanguageDetectorJni f;
    public volatile String g;
    private final errl j;
    private static final cskc h = cskc.g("Bugle", "LanguageDetectorImpl");
    private static boolean i = false;
    public static final Object a = new Object();
    public static final Object b = new Object();

    public ctmy(Context context, errl errlVar, errl errlVar2, ctmg ctmgVar) {
        this.c = context;
        this.j = errlVar;
        this.d = errlVar2;
        this.e = ctmgVar;
    }

    public static void c() {
        efbd.b();
        if (i) {
            return;
        }
        try {
            i = true;
            csli.b("language_detector_jni");
        } catch (UnsatisfiedLinkError e) {
            csjb b2 = h.b();
            b2.I("Problem linking language detector JNIs.");
            b2.s(e);
        } catch (Throwable th) {
            csjb b3 = h.b();
            b3.I("Problem loading language detector JNIs.");
            b3.s(th);
        }
    }

    @Override // defpackage.ctit
    public final elfl a(final fbup fbupVar) {
        if (fbupVar.b.isEmpty()) {
            throw new IllegalArgumentException("Cannot classify language without messages.");
        }
        return elfo.g(new Callable() { // from class: ctmt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ctmy.c();
                return null;
            }
        }, this.j).i(new eroh() { // from class: ctmu
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final ctmy ctmyVar = ctmy.this;
                final fbup fbupVar2 = fbupVar;
                return ctmyVar.e.a().h(new emwl() { // from class: ctmx
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        ctmy ctmyVar2 = ctmy.this;
                        emkq emkqVar = (emkq) obj2;
                        if (ctmyVar2.f == null) {
                            synchronized (ctmy.a) {
                                if (ctmyVar2.f == null) {
                                    ctmyVar2.f = new LanguageDetectorJni();
                                }
                            }
                        }
                        LanguageDetectorJni languageDetectorJni = ctmyVar2.f;
                        fbtr fbtrVar = (fbtr) fbts.b.createBuilder();
                        if (ctmyVar2.g == null) {
                            synchronized (ctmy.b) {
                                if (ctmyVar2.g == null) {
                                    ctmyVar2.g = ctid.c(ctmyVar2.c).toLanguageTag();
                                }
                            }
                        }
                        fbup fbupVar3 = fbupVar2;
                        String str = ctmyVar2.g;
                        fbtrVar.copyOnWrite();
                        fbts fbtsVar = (fbts) fbtrVar.instance;
                        str.getClass();
                        fbtsVar.j = str;
                        fbtrVar.copyOnWrite();
                        fbts fbtsVar2 = (fbts) fbtrVar.instance;
                        fbupVar3.getClass();
                        fbtsVar2.f = fbupVar3;
                        fbtsVar2.c |= 2;
                        fbts fbtsVar3 = (fbts) fbtrVar.build();
                        emiw emiwVar = emkqVar.c;
                        if (emiwVar == null) {
                            emiwVar = emiw.a;
                        }
                        return languageDetectorJni.a(fbtsVar3, emiwVar);
                    }
                }, ctmyVar.d);
            }
        }, this.d);
    }

    @Override // defpackage.ctit
    public final elfl b(List list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("Cannot detect language, bad state.");
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessageCoreData messageCoreData = (MessageCoreData) it.next();
            if (messageCoreData != null && !cbvv.h(messageCoreData.k())) {
                final String ar = messageCoreData.ar();
                if (!TextUtils.isEmpty(ar)) {
                    arrayList.add(elfo.g(new Callable() { // from class: ctmv
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            fbum fbumVar = (fbum) fbun.a.createBuilder();
                            fbumVar.copyOnWrite();
                            fbun fbunVar = (fbun) fbumVar.instance;
                            String str = ar;
                            str.getClass();
                            fbunVar.b = 30;
                            fbunVar.c = str;
                            return (fbun) fbumVar.build();
                        }
                    }, this.j));
                }
            }
        }
        return elfo.j(arrayList).b(new erog() { // from class: ctmw
            @Override // defpackage.erog
            public final ListenableFuture a() {
                fbuo fbuoVar = (fbuo) fbup.a.createBuilder();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    fbuoVar.b((fbun) erqt.q((elfl) it2.next()));
                }
                return ctmy.this.a((fbup) fbuoVar.build());
            }
        }, this.j);
    }
}

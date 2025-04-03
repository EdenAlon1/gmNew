package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekkn extends ContextWrapper implements ekke {
    private static final enru a = enru.c("com/google/apps/tiktok/inject/peer/FragmentContextWrapper");
    private final emyl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekkn(ea eaVar, Context context) {
        super(context);
        context.getClass();
        b(context, a(eaVar));
        this.b = emys.a(new emyl() { // from class: ekkm
            @Override // defpackage.emyl
            public final Object get() {
                ekkn ekknVar = ekkn.this;
                return ((LayoutInflater) ekknVar.getBaseContext().getSystemService("layout_inflater")).cloneInContext(ekknVar);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Locale a(ea eaVar) {
        Locale bc;
        if ((eaVar instanceof ekkk) && (bc = ((ekkk) eaVar).bc()) != null) {
            return bc;
        }
        ea eaVar2 = eaVar.E;
        if (eaVar2 != null) {
            return a(eaVar2);
        }
        return null;
    }

    private static void b(Context context, Locale locale) {
        if (locale != null) {
            ((enrr) ((enrr) a.e()).h("com/google/apps/tiktok/inject/peer/FragmentContextWrapper", "maybeApplyCustomLocale", 46, "FragmentContextWrapper.java")).t("applying customLocale = %s", locale);
            Configuration configuration = new Configuration();
            configuration.locale = locale;
            Resources resources = context.getResources();
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return !"layout_inflater".equals(str) ? getBaseContext().getSystemService(str) : this.b.get();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ekkn(defpackage.ea r2, final android.view.LayoutInflater r3) {
        /*
            r1 = this;
            android.content.Context r0 = r3.getContext()
            r0.getClass()
            java.util.Locale r2 = a(r2)
            b(r0, r2)
            r1.<init>(r0)
            ekkl r2 = new ekkl
            r2.<init>()
            emyl r2 = defpackage.emys.a(r2)
            r1.b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekkn.<init>(ea, android.view.LayoutInflater):void");
    }
}

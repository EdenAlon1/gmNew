package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahoq {
    public final ctyx a;
    public final Resources b;
    public final ejvb c;
    public final errl d;
    public final ctyz e;
    public final errl f;
    public final ahns g;
    private final ejvp h;

    public ahoq(ctyx ctyxVar, ctyz ctyzVar, Context context, ejvb ejvbVar, errl errlVar, errl errlVar2, ejvp ejvpVar, ahns ahnsVar) {
        this.a = ctyxVar;
        this.e = ctyzVar;
        this.b = context.getResources();
        this.c = ejvbVar;
        this.d = errlVar;
        this.f = errlVar2;
        this.h = ejvpVar;
        this.g = ahnsVar;
    }

    public final elfl a(final boolean z) {
        return elfo.f(new Runnable() { // from class: ahoj
            @Override // java.lang.Runnable
            public final void run() {
                ahoq ahoqVar = ahoq.this;
                ahoqVar.a.g(ahoqVar.b.getString(R.string.rich_cards_settings_enable_all_pref_key), z);
            }
        }, this.d).h(new emwl() { // from class: ahok
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ahoq.this.b();
                return null;
            }
        }, this.f).i(new eroh() { // from class: ahoe
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!z) {
                    return elfo.e(null);
                }
                final ahoq ahoqVar = ahoq.this;
                return elfo.f(new Runnable() { // from class: ahoh
                    @Override // java.lang.Runnable
                    public final void run() {
                        ahoq.this.e.c();
                    }
                }, ahoqVar.d).h(new emwl() { // from class: ahoi
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        ahoq.this.b();
                        return null;
                    }
                }, ahoqVar.f);
            }
        }, this.f);
    }

    public final void b() {
        this.h.a(elfo.e(null), "richcardsettings");
    }
}

package com.google.android.apps.messaging.ui.debug;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysFragment;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.csxu;
import defpackage.csya;
import defpackage.dadk;
import defpackage.dadl;
import defpackage.dadm;
import defpackage.dadt;
import defpackage.dadu;
import defpackage.dadv;
import defpackage.davo;
import defpackage.eg;
import defpackage.ejlq;
import defpackage.ejlr;
import defpackage.engw;
import defpackage.enqu;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.ersv;
import defpackage.ffbr;
import defpackage.lmw;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DebugGServiceKeysFragment extends davo {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/debug/DebugGServiceKeysFragment");
    public Button ag;
    public dadv ah;
    public ffbr ai;
    public dadu aj;
    public ffbr ak;
    public ffbr al;
    private ListView am;
    public final ejlr b = new ejlr<Void, Void>() { // from class: com.google.android.apps.messaging.ui.debug.DebugGServiceKeysFragment.1
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            ensk j = DebugGServiceKeysFragment.a.j();
            j.Y(ente.a, "BugleDiagnostics");
            ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/ui/debug/DebugGServiceKeysFragment$1", "onFailure", 'F', "DebugGServiceKeysFragment.java")).q("Failed to flush auto ramp local overrides.");
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final ejlr c = new dadk(this);
    public dadt d;
    public View e;

    public static engw a(ersv ersvVar) {
        ArrayList arrayList = new ArrayList(csya.a().keySet());
        enqu listIterator = ersvVar.a.listIterator();
        while (listIterator.hasNext()) {
            arrayList.add("@".concat(String.valueOf((String) listIterator.next())));
        }
        return engw.D(arrayList);
    }

    public static Optional b(String str) {
        return str.startsWith("@") ? Optional.of(str.substring(1)) : Optional.empty();
    }

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.gservicekeys_debug_fragment, viewGroup, false);
        this.e = inflate;
        inflate.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: dadh
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                view.setPadding(0, windowInsets.getSystemWindowInsetTop(), 0, 0);
                return windowInsets;
            }
        });
        this.am = (ListView) this.e.findViewById(android.R.id.list);
        ((SearchView) this.e.findViewById(R.id.search_bar)).setOnQueryTextListener(new dadm(this));
        dadv dadvVar = this.ah;
        Consumer consumer = new Consumer() { // from class: dadj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                DebugGServiceKeysFragment debugGServiceKeysFragment = DebugGServiceKeysFragment.this;
                ((ejlq) debugGServiceKeysFragment.ai.b()).g(ejlp.b((ListenableFuture) obj), debugGServiceKeysFragment.b);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        eg G = G();
        G.getClass();
        csxu csxuVar = (csxu) dadvVar.a.b();
        csxuVar.getClass();
        ersv ersvVar = (ersv) dadvVar.b.b();
        ersvVar.getClass();
        dadt dadtVar = new dadt(csxuVar, ersvVar, consumer, G);
        this.d = dadtVar;
        this.am.setAdapter((ListAdapter) dadtVar);
        dadu daduVar = this.aj;
        engw engwVar = this.d.a;
        engwVar.getClass();
        daduVar.a = engwVar;
        Button button = (Button) this.e.findViewById(R.id.btn_dump_keys);
        this.ag = button;
        button.setOnClickListener(new dadl(this, String.valueOf(this.e.getContext().getCacheDir()) + File.separator + "autorampflags.txt"));
        return this.e;
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        ((ejlq) this.ai.b()).k(this.b);
        ((ejlq) this.ai.b()).k(this.c);
        this.aj = (dadu) new lmw(this).a(dadu.class);
    }
}

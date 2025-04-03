package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerLayoutManager;
import com.google.android.libraries.inputmethod.emoji.view.CustomImageView;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dutb implements AutoCloseable {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController");
    public float A;
    public final dusz B;
    public final int C;
    private final errl D;
    private final int E;
    private final dutz F;
    private final duvr G;
    private final View.OnClickListener H;
    public final Context b;
    public final dusz c;
    public final dutt d;
    public final boolean e;
    public final boolean f;
    public final engw g;
    public final AtomicReference h;
    public final engw i;
    public final Optional j;
    public final duqj k;
    public final duqh l;
    public final AtomicBoolean m;
    public final boolean n;
    public final Optional o;
    public final Optional p;
    public int q;
    public int r;
    public final duua s;
    public final duur t;
    public boolean u;
    public boolean v;
    public final RecyclerView w;
    public final EmojiPickerBodyRecyclerView x;
    public dutj y;
    public dusd z;

    static {
        emye.b(',');
    }

    public dutb(RecyclerView recyclerView, EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView, dusz duszVar, dutt duttVar, dutf dutfVar) {
        AtomicReference atomicReference = new AtomicReference();
        this.h = atomicReference;
        this.m = new AtomicBoolean(false);
        this.q = -1;
        this.r = 1;
        this.A = 1.0f;
        dusu dusuVar = new dusu(this);
        this.B = dusuVar;
        this.G = new dusv(this);
        this.H = new View.OnClickListener() { // from class: dusg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                duwz.a(view.getContext()).d(view);
                if (!(view instanceof CustomImageView)) {
                    ((enrr) ((enrr) dutb.a.i()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "<init>", 311, "EmojiPickerController.java")).t("Clicked view is not CustomImageView: %s", view);
                    return;
                }
                dutb dutbVar = dutb.this;
                duvu duvuVar = ((CustomImageView) view).a;
                engw engwVar = ((dusu) dutbVar.B).a.g;
                if (((enou) engwVar).c <= 0) {
                    return;
                }
                throw null;
            }
        };
        if (duttVar.a() < 0.0f && duttVar.g() == 0) {
            throw new IllegalArgumentException("Must provide either row count or row height.");
        }
        if (((duttVar.a() <= 0.0f || duttVar.f() != 0) ? duttVar.f() : ((int) Math.ceil(duttVar.a())) * duttVar.c()) <= 0) {
            throw new IllegalArgumentException("Invalid pool size.");
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(emojiPickerBodyRecyclerView.getContext(), R.style.EmojiPicker);
        this.b = contextThemeWrapper;
        this.c = duszVar;
        this.d = duttVar;
        this.w = recyclerView;
        this.x = emojiPickerBodyRecyclerView;
        dutfVar.d();
        this.D = dutfVar.d();
        this.o = dutfVar.e();
        this.p = dutfVar.f();
        dutfVar.h();
        this.n = true;
        duttVar.o();
        this.E = (duttVar.a() <= 0.0f || duttVar.d() != 0) ? duttVar.d() : ((int) Math.floor(duttVar.a())) * duttVar.c();
        duttVar.p();
        this.e = duttVar.i();
        dutfVar.i();
        this.f = true;
        dutfVar.a();
        duqi a2 = dutfVar.a();
        this.k = a2;
        this.l = a2.a();
        duttVar.u();
        boolean k = duttVar.k();
        duttVar.v();
        dutr dutrVar = new dutr(contextThemeWrapper, k);
        this.s = dutrVar;
        dutrVar.c = new View.OnClickListener() { // from class: dusn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                duvq duvqVar = ((EmojiView) view).c;
                dusu dusuVar2 = (dusu) dutb.this.B;
                dutb dutbVar = dusuVar2.a;
                boolean z = false;
                if (dutbVar.n) {
                    engw engwVar = dutbVar.g;
                    for (int i = 0; i < ((enou) engwVar).c; i++) {
                        ((dura) engwVar.get(i)).d(duvf.a(((duvi) duvqVar).a));
                    }
                }
                dutb dutbVar2 = dusuVar2.a;
                if (dutbVar2.f && dutbVar2.k.d(((duvi) duvqVar).a)) {
                    z = true;
                }
                dusd dusdVar = dusuVar2.a.z;
                if (dusdVar != null) {
                    dusdVar.I(duvqVar, z);
                }
                dusz duszVar2 = dusuVar2.a.c;
                if (duszVar2 != null) {
                    duszVar2.b(duvqVar);
                }
                dusuVar2.a.s.b();
            }
        };
        this.t = duut.instance.j;
        engw c = dutfVar.c();
        if (c == null || c.isEmpty()) {
            dutfVar.b();
            c = engw.r(new duri(contextThemeWrapper, new dusj(emojiPickerBodyRecyclerView)));
        }
        this.g = c;
        atomicReference.set((dura) c.get(0));
        final engr engrVar = new engr();
        Optional g = dutfVar.g();
        this.j = g;
        g.ifPresent(new Consumer() { // from class: duso
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                engr.this.h((duul) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.i = engrVar.g();
        dutfVar.j();
        dutfVar.b();
        int c2 = duttVar.c();
        int c3 = duttVar.c();
        int f = duttVar.f();
        we weVar = new we();
        weVar.f(durj.a, c3);
        weVar.f(dutv.a, f);
        durk durkVar = new durk(c2, weVar, dusuVar);
        emojiPickerBodyRecyclerView.getContext();
        EmojiPickerLayoutManager emojiPickerLayoutManager = new EmojiPickerLayoutManager(durkVar.a);
        emojiPickerLayoutManager.g = new duse(emojiPickerBodyRecyclerView, durkVar);
        emojiPickerBodyRecyclerView.ap(emojiPickerLayoutManager);
        emojiPickerBodyRecyclerView.an(null);
        emojiPickerBodyRecyclerView.aq(durkVar.b);
        emojiPickerBodyRecyclerView.ao(0);
        emojiPickerBodyRecyclerView.H = null;
        emojiPickerBodyRecyclerView.ad = new dusf(durkVar.c);
        emojiPickerBodyRecyclerView.z(emojiPickerBodyRecyclerView.ad);
        emojiPickerBodyRecyclerView.al(new duta(this, emojiPickerBodyRecyclerView));
        duttVar.r();
        this.C = 1;
        duttVar.q();
        recyclerView.ap(new LinearLayoutManager(0));
        recyclerView.al(new duta(this, recyclerView));
        for (int i = 0; i < recyclerView.gr(); i++) {
            recyclerView.af(i);
        }
        dutz dutzVar = new dutz(duttVar);
        this.F = dutzVar;
        if (this.C == 1) {
            recyclerView.w(dutzVar);
        }
    }

    public static final int g(int i) {
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public final dura a() {
        if (this.g.isEmpty()) {
            ((enrr) ((enrr) a.j()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "findNextEmojiProvider", 1110, "EmojiPickerController.java")).q("No recent emoji providers available. ");
            return null;
        }
        engw engwVar = this.g;
        if (((enou) engwVar).c == 1) {
            return null;
        }
        int indexOf = engwVar.indexOf(this.h.get());
        engw engwVar2 = this.g;
        return (dura) engwVar2.get((indexOf + 1) % ((enou) engwVar2).c);
    }

    public final void b() {
        duua duuaVar = this.s;
        if (duuaVar != null) {
            duuaVar.a();
        }
        this.w.am(null);
        this.y = null;
        while (this.w.gr() > 0) {
            this.w.af(0);
        }
        this.w.ap(null);
        EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView = this.x;
        emojiPickerBodyRecyclerView.D();
        emojiPickerBodyRecyclerView.ad = null;
        emojiPickerBodyRecyclerView.am(null);
        while (emojiPickerBodyRecyclerView.gr() > 0) {
            emojiPickerBodyRecyclerView.af(0);
        }
        this.z = null;
        try {
            enqv it = this.g.iterator();
            while (it.hasNext()) {
                ((dura) it.next()).close();
            }
            this.j.isPresent();
        } catch (Exception e) {
            ((enrr) ((enrr) ((enrr) a.j()).g(e)).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "onDeactivate", (char) 590, "EmojiPickerController.java")).q("error when closing RecentItemProvider or ItemProvider");
        }
    }

    public final void c(dutk dutkVar) {
        dutj dutjVar = this.y;
        if (dutjVar != null) {
            dutjVar.a = dutkVar;
            dutjVar.p();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        b();
    }

    public final void d() {
        if (this.z == null) {
            return;
        }
        erqt.r(duui.c(this.l, (dura) this.h.get(), this.t, this.E, this.e, this.o), new dusw(this), duoc.b);
    }

    public final void e(int i, int i2) {
        EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView = this.x;
        if (emojiPickerBodyRecyclerView != null) {
            if (i < 0) {
                ((enrr) EmojiPickerBodyRecyclerView.ac.a(duwj.a).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyRecyclerView", "tryGoToCategory", 136, "EmojiPickerBodyRecyclerView.java")).r("Invalid categoryIndex: %s", i);
            } else {
                vk vkVar = emojiPickerBodyRecyclerView.n;
                boolean z = vkVar instanceof dusd;
                vx vxVar = emojiPickerBodyRecyclerView.o;
                if (z && (vxVar instanceof GridLayoutManager)) {
                    dusd dusdVar = (dusd) vkVar;
                    if (i >= dusdVar.H()) {
                        ((enrr) EmojiPickerBodyRecyclerView.ac.a(duwj.a).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyRecyclerView", "tryGoToCategory", 145, "EmojiPickerBodyRecyclerView.java")).u("Invalid categoryIndex: %s out of %s", i, dusdVar.H());
                    } else {
                        ((GridLayoutManager) vxVar).ac(dusdVar.G(i), 0);
                        emojiPickerBodyRecyclerView.ae = i;
                    }
                }
            }
        }
        this.B.c(i, i2);
    }

    public final dusd f() {
        dusd dusdVar = this.z;
        if (dusdVar != null) {
            return dusdVar;
        }
        ((enrr) ((enrr) a.h()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "getBodyAdapter", 716, "EmojiPickerController.java")).q("getBodyAdapter(), loading emojis. ");
        Context context = this.b;
        dutt duttVar = this.d;
        engw engwVar = this.i;
        duttVar.x();
        engr engrVar = new engr();
        int[] iArr = duoo.b;
        for (int i = 0; i < 10; i++) {
            engrVar.h(context.getString(iArr[i]));
        }
        int i2 = ((enou) engwVar).c;
        for (int i3 = 0; i3 < i2; i3++) {
            engrVar.h(((durg) engwVar.get(i3)).c());
        }
        engw g = engrVar.g();
        duvr duvrVar = this.G;
        duqj duqjVar = this.k;
        duqh duqhVar = this.l;
        this.j.isPresent();
        dusd dusdVar2 = new dusd(context, duttVar, g, duvrVar, duqjVar, duqhVar, new emyl() { // from class: dusq
            @Override // defpackage.emyl
            public final Object get() {
                dura duraVar = (dura) dutb.this.h.get();
                if (duraVar != null) {
                    return duraVar.c();
                }
                return null;
            }
        }, new emyl() { // from class: dusr
            @Override // defpackage.emyl
            public final Object get() {
                dura a2 = dutb.this.a();
                if (a2 != null) {
                    return a2.c();
                }
                return null;
            }
        }, new Runnable() { // from class: duss
            @Override // java.lang.Runnable
            public final void run() {
                final dutb dutbVar = dutb.this;
                dutbVar.j.ifPresent(new Consumer() { // from class: dusp
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        dutb dutbVar2 = dutb.this;
                        AtomicBoolean atomicBoolean = dutbVar2.m;
                        duul duulVar = (duul) obj;
                        int i4 = dutbVar2.r;
                        if (atomicBoolean.compareAndSet(false, true)) {
                            erqt.r(duulVar.e(), new dusy(dutbVar2, duulVar, i4), duoc.b);
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }, new Runnable() { // from class: dush
            @Override // java.lang.Runnable
            public final void run() {
                dutb dutbVar = dutb.this;
                dura a2 = dutbVar.a();
                if (a2 == null) {
                    ((enrr) ((enrr) dutb.a.j()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "onSwitchRecentCategory", 1084, "EmojiPickerController.java")).q("next emoji provider is not available. ");
                } else {
                    dutbVar.h.set(a2);
                    dutbVar.d();
                }
            }
        }, this.H);
        dusdVar2.B(true);
        this.v = true;
        duoo duooVar = duoo.c;
        if (duooVar == null) {
            synchronized (duoo.class) {
                duooVar = duoo.c;
                if (duooVar == null) {
                    duooVar = new duoo();
                    duoo.c = duooVar;
                }
            }
        }
        Context context2 = this.b;
        errl errlVar = this.D;
        duur duurVar = this.t;
        duqh duqhVar2 = this.l;
        AtomicReference atomicReference = this.h;
        ListenableFuture b = duooVar.b(context2, errlVar, duurVar);
        ListenableFuture c = duui.c(duqhVar2, (dura) atomicReference.get(), this.t, this.E, this.e, this.o);
        boolean z = this.f;
        ListenableFuture listenableFuture = erre.a;
        if (z) {
            listenableFuture = this.k.b();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(b);
        arrayList.add(c);
        arrayList.add(listenableFuture);
        erqt.r(erqt.a(arrayList).a(new Callable() { // from class: dusi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                enru enruVar = dutb.a;
                return null;
            }
        }, duoc.b), new dusx(this, b, c, dusdVar2), duoc.b);
        this.z = dusdVar2;
        return dusdVar2;
    }
}
